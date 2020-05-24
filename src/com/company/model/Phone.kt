package com.company.model

data class Phone(
    var brand: String,
    var model: String,
    var price: Double,
    var discount: Double? = null
)