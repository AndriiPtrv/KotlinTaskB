package com.company

import com.company.data.generate
import com.company.model.*
import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) {
    val listShop = generate()
    val scanner = Scanner(System.`in`)

    println("Введите название магазина")
    val nameShop: String = scanner.nextLine()

    for (shop in listShop) {
        if (shop.hasName(nameShop)) shop.findCheapPhone()
    }

    println("---------------------------------------------")

    var idShopCheapDiscount: Int = 0
    var idPhoneCheapDiscount: Int = 0
    var helperDiscount: Double = Double.MIN_VALUE
    for (i in 0 until listShop.size) {
        for (j in 0 until listShop[i].product.size) {
            if (listShop[i].product[j].discount != null)
                if (helperDiscount < listShop[i].product[j].discount!!) {
                    helperDiscount = listShop[i].product[j].discount!!
                    idShopCheapDiscount = i
                    idPhoneCheapDiscount = j
                }
        }
    }
    println("Телефон с самой большой скидкой: ${listShop[idShopCheapDiscount].product[idPhoneCheapDiscount].brand} ${listShop[idShopCheapDiscount].product[idPhoneCheapDiscount].model}" +
            " со скидкой ${listShop[idShopCheapDiscount].product[idPhoneCheapDiscount].discount} в магазине ${listShop[idShopCheapDiscount].name}")

    println("---------------------------------------------")

    println("Введите название магазина")
    val nameShop2: String = scanner.nextLine()
    println("Введите название бренда")
    val nameBrand: String = scanner.nextLine()

    for (shop in listShop) {
        if (shop.hasName(nameShop2))
            shop.hasBrand(nameBrand)
    }

    println("---------------------------------------------")

    println("Введите название магазина")
    val nameShop3: String = scanner.nextLine()
    println("Введите минимальную цену")
    val min: Int = scanner.nextLine().toInt()
    println("Введите максимальную цену")
    val max: Int = scanner.nextLine().toInt()

    for (shop in listShop) {
        if (shop.hasName(nameShop3)) shop.minMaxPhones(min, max)
    }

    println("---------------------------------------------")

    val map: MutableMap<String, Phone> = mutableMapOf()
    for (shop in listShop) {
        for (phone in shop.product) {
            map.put(phone.brand, phone)
        }
    }
    for((key, product) in map){
        if (product.discount != null) println("${product.brand} ${product.model} цена: ${product.price} скидка: ${product.discount}")
        else println("${product.brand} ${product.model} цена: ${product.price}")
    }
}