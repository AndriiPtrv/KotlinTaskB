package com.company.model

data class Shop (
    var name: String,
    var site: String,
    var address: String? = null,
    var product: ArrayList<Phone>
)