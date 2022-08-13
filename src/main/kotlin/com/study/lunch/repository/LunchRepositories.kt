package com.study.lunch

import org.springframework.data.repository.CrudRepository

interface RestaurantRepository : CrudRepository<Restaurant, Long> {
//	fun findBySlug(slug: String): Article?
//	fun findAllByOrderByAddedAtDesc(): Iterable<Article>
}

interface MenuRepository : CrudRepository<Menu, Long> {
//	fun findByLogin(login: String): User?
}

//interface LunchUserRepository :

