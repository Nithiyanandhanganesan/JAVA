package com.example.springkotlindemo

import org.springframework.stereotype.Component

@Component
class SampleService {
    fun sampleservicefunc(num :Int):String{
        var user:String = ""
        if (num==1)
            user = "firstusssser"
        else
            user = "secondusssser"
        return "Welcom ${user}"

    }
}