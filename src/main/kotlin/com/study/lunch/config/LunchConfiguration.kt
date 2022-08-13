package com.study.lunch.config

import com.study.lunch.*
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.time.LocalDateTime
import java.util.*

@Configuration
class LunchConfiguration {

    @Bean
    fun lunchDatabaseInitializer(restaurantRepository: RestaurantRepository,
							menuRepository: MenuRepository
	) = ApplicationRunner {

		val restaurant = restaurantRepository.save(Restaurant("육전식당", "경기도 성남시 대왕판교로", "031-000-0000", LocalDateTime.now(), 3L))

		restaurantRepository.save(
			Restaurant(
				name = "당당치킨",
				address = "경기도 안양시...",
				telNumber = "031-000-0000",
				id = 1L
			)
		)
		restaurantRepository.save(
			Restaurant(
				name = "웰스토리",
				address = "경기도 성남시 수정구",
				telNumber = "031-100-0000",
				id = 2L
			)
		)

		menuRepository.save(
			Menu(
				main = "치킨",
				side = listOf<String>("단무지", "막국수", "계란국"),
				menuDate = LocalDateTime.now(),
				type = "점심",
				restaurant = restaurant
			)
		)

		menuRepository.save(
			Menu(
				main = "제육볶음",
				side = listOf<String>("김치", "계란말이", "시금치볶음"),
				menuDate = LocalDateTime.now(),
				type = "저녁",
				restaurant = restaurant
			)
		)

    }
}
