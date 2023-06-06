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

        if (inputNumber % 5 == 0 )
            result+="For"

        for (i in inputNumber.toString()) {

            if (i=='5' )
                result+="For"
            if (i=='3')
                result+="Kata"
        }


        return result.ifEmpty { inputNumber.toString() }


    }
    }
