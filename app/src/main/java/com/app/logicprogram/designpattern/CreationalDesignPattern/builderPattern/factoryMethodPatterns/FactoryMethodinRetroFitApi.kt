package com.app.logicprogram.designpattern.CreationalDesignPattern.builderPattern.factoryMethodPatterns

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


// Perfect example for factoryMethod design pattern for creating object
fun main() {
   val stage = RetrofitFactoryMethod.createFactoryMethod("stage")?.create()
   val production = RetrofitFactoryMethod.createFactoryMethod("production")?.create()
}


interface RetrofitApi {
    fun create() : Retrofit
}

class ProductionRetrofitApi: RetrofitApi {
    override fun create(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://production-api.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}

class StageRetrofitApi: RetrofitApi {
    override fun create(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://staging-api.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}
class RetrofitFactoryMethod() {
    companion object {
        fun createFactoryMethod(type:String) : RetrofitApi? {
           return when (type) {
                "production" -> ProductionRetrofitApi()
                else -> StageRetrofitApi()
            }
        }
    }
}
