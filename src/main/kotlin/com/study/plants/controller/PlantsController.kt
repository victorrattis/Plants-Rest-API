package com.study.plants.controller

import com.study.plants.PlantsRepository
import com.study.plants.model.Plant
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PlantsController {

    @Autowired
    lateinit var plantRepository: PlantsRepository

    @GetMapping("/plants")
    fun getPlants(): List<Plant> {
        return plantRepository.getPlants()
    }

}