package com.kata.kataforfun.services

import org.springframework.stereotype.Component

@Component
class KataForFunService {
    fun convertNumber(inputNumber: Int): String {
        var result = ""
        if (inputNumber == 1)
            result+="1"

       
        return result.ifEmpty { inputNumber.toString() }


    }
    }
