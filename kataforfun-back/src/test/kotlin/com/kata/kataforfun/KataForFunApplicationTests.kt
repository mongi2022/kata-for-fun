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
    fun shouldReturnKataKataIf3() {
        assertEquals("KataKata",kataForFunService.convertNumber(3))
    }
    @Test
    fun shouldReturnForForIf5() {
        assertEquals("ForFor",kataForFunService.convertNumber(5))
    }
    @Test
    fun shouldReturnFunIf7() {
        assertEquals("Fun",kataForFunService.convertNumber(7))
    }
    @Test
    fun shouldReturnKataIf9() {
        assertEquals("Kata",kataForFunService.convertNumber(9))

    }
    @Test
    fun shouldReturnKataForIf51() {
        assertEquals("KataFor",kataForFunService.convertNumber(51))
    }
    @Test
    fun shouldReturnForKataIf53() {
        assertEquals("ForKata",kataForFunService.convertNumber(53))
    }
    @Test
    fun shouldReturnKataKataIf33() {
        assertEquals("KataKataKata",kataForFunService.convertNumber(33))
    }
    @Test
    fun shouldReturnKataFunIf27() {
        assertEquals("KataFun",kataForFunService.convertNumber(27))
    }
    @Test
    fun shouldReturnKataForForIf15() {
        assertEquals("KataForFor",kataForFunService.convertNumber(15))
    }


}
