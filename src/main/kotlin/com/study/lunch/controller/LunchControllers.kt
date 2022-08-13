package com.study.lunch.controller

import com.study.lunch.MenuRepository
import com.study.lunch.RestaurantRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/restaurant")
class RestaurantController(private val repository: RestaurantRepository) {

	@GetMapping("/")
	fun findAll() = repository.findAll()

	/*@GetMapping("/{slug}")
	fun findOne(@PathVariable slug: String) =
			repository.findBySlug(slug) ?: throw ResponseStatusException(NOT_FOUND, "This article does not exist")*/

}

/*@RestController
@RequestMapping("/api/menu")
class UserController(private val repository: MenuRepository) {

	@GetMapping("/")
	fun findAll() = repository.findAll()

//	@GetMapping("/{login}")
//	fun findOne(@PathVariable login: String) = repository.findByLogin(login) ?: throw ResponseStatusException(NOT_FOUND, "This user does not exist")
}*/
