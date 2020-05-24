package com.company.model

import java.util.*

fun Shop.hasName(inputName: String) = name.toLowerCase().contains(inputName.toLowerCase())

fun Shop.findCheapPhone() {
    var helperPrice: Double = Double.MAX_VALUE
    var idPhone: Int = 0
    for (i in 0 until product.size) {
        if (product[i].discount != null) {
            if (product[i].price - (product[i].price * product[i].discount!!) < helperPrice) {
                helperPrice = product[i].price
                idPhone = i
            }
        } else if (product[i].price < helperPrice) {
            helperPrice = product[i].price
            idPhone = i
        }
    }
    showShop()
    showPhone(idPhone)
}

fun Shop.hasBrand(inputBrand: String) {
    var check: Boolean = false
    showShop()
    for (phone in product) {
        if (phone.brand.toLowerCase().contains(inputBrand.toLowerCase())) {
            check = true
            phone.showPhoneInfo()
        }
    }
    if (!check) println("Смартфона нет в наличии")
}

fun Shop.minMaxPhones(min: Int, max: Int) {
    for (phone in product) {
        if (phone.price > min && phone.price < max) {
            showShop()
            phone.showPhoneInfo()
        }
    }
}

fun Shop.showPhone(id: Int) {
    if (product[id].discount != null) println("${product[id].brand} ${product[id].model} цена: ${product[id].price} скидка: ${product[id].discount}")
    else println("${product[id].brand} ${product[id].model} цена: ${product[id].price}")
}

fun Shop.showShop() {
    if (address != null) println("Магазин: $name адрес: $address сайт: $site")
    else println("Магазин: $name сайт: $site")
}