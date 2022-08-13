package com.study.lunch.controller

import com.study.lunch.*
import com.study.lunch.config.BlogProperties
import org.springframework.http.HttpStatus.*
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.server.ResponseStatusException

@Controller
class LunchHtmlController(private val repository: RestaurantRepository,
						  private val properties: BlogProperties
) {

	@GetMapping("/restaurant")
	fun blog(model: Model): String {
		model["title"] = properties.title
		model["banner"] = properties.banner
		model["restaurants"] = repository.findAll().map { it.render() }
		return "restaurant"
	}

	/*@GetMapping("/article/{slug}")
	fun article(@PathVariable slug: String, model: Model): String {
		val article = repository
				.findBySlug(slug)
				?.render()
				?: throw ResponseStatusException(NOT_FOUND, "This article does not exist")
		model["title"] = article.title
		model["article"] = article
		return "article"
	}*/

	fun Restaurant.render() = RenderedRestaurant(
			id,
			name,
			address,
			telNumber,
			addedAt.format()
	)

	data class RenderedRestaurant(
		val id: Long? = null,
		val name: String,
		val address: String,
		val telNumber: String,
		val addedAt: String)

}
