package com.kata.kataforfun.services

import org.springframework.stereotype.Component

@Component
class KataForFunService {
    fun convertNumber(inputNumber: Int): String {
        var result = ""
        if (inputNumber == 1)
            result+="1"
        if (inputNumber % 3 == 0 )
            result+="Kata"


        for (i in inputNumber.toString()) {

       
            if (i=='3')
                result+="Kata"
        }

        return result.ifEmpty { inputNumber.toString() }


    }
    }
