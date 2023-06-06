package com.kata.kataforfun

import com.kata.kataforfun.services.KataForFunService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest


@SpringBootTest
class KataForFunApplicationTests( ) {

    @Autowired
    private lateinit var kataForFunService: KataForFunService
    @Test
    fun contextLoads() {

    }

    @Test
    fun shouldReturnKataIf1() {
        assertEquals("1",kataForFunService.convertNumber(1))
    }

    @Test
    fun shouldReturnKataKataIf3() {
        assertEquals("KataKata",kataForFunService.convertNumber(3))
    }

}
