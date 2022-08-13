package com.study.lunch

import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Restaurant(
		var name: String,
		var address: String,
		var telNumber: String,
//		@ManyToOne var author: User,
		var addedAt: LocalDateTime = LocalDateTime.now(),
		@Id @GeneratedValue var id: Long? = null
)

@Entity
class Menu(
		var main: String,
		@ElementCollection
		var side: List<String>,
		var addedAt: LocalDateTime = LocalDateTime.now(),
		var menuDate: LocalDateTime,
		@ManyToOne var restaurant: Restaurant,
		var type: String,
		@Id @GeneratedValue var id: Long? = null
)

/*@Entity
class LunchUser(
		var login: String,
		var loginId: String,
		var name: String,
		var type: String? = null,
		var addedAt: LocalDateTime = LocalDateTime.now(),
		@Id @GeneratedValue var id: Long? = null
)*/
