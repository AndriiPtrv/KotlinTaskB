package com.company.model

fun Phone.showPhoneInfo() {
    if (discount != null) println("$brand $model цена: $price скидка: $discount")
    else println("$brand $model цена: $price")
}