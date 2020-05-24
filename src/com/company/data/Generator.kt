package com.company.data

import com.company.model.Phone
import com.company.model.Shop

fun generate(): List<Shop> {
    val shops = ArrayList<Shop>()

    val phonesOne = ArrayList<Phone>()
    phonesOne.add(Phone("Apple", "Iphone 11", 23300.0, 0.03))
    phonesOne.add(Phone("Samsung", "Galaxy Fold", 48020.0, 0.05))
    phonesOne.add(Phone("Meizu", "16 Xs", 6740.0, 0.1))
    phonesOne.add(Phone("Xiaomi", "K30 Pro", 12840.0, 0.09))
    phonesOne.add(Phone("Huawei", "P40", 20199.0, 0.07))
    phonesOne.add(Phone("Honor", "20", 9999.0, 0.09))
    shops.add(Shop("PhonEEs", "www.phonees.com", "ул. Пушкина, д.35", phonesOne))

    val phonesTwo = ArrayList<Phone>()
    phonesTwo.add(Phone("Apple", "Iphone 11", 230300.0, 0.04))
    phonesTwo.add(Phone("Xiaomi", "K30 Pro", 12500.0, null))
    phonesTwo.add(Phone("Huawei", "P40", 20300.0, 0.06))
    phonesTwo.add(Phone("Honor", "20", 10000.0, 0.11))
    shops.add(Shop("Telefon4ik", "www.tlfn4k.com", "ул. Гагарина, д.28", phonesTwo))

    val phonesThree = ArrayList<Phone>()
    phonesThree.add(Phone("Samsung", "Galaxy Fold", 47000.0, null))
    phonesThree.add(Phone("Meizu", "16 Xs", 6300.0, null))
    phonesThree.add(Phone("Xiaomi", "K30 Pro", 12000.0, null))
    shops.add(Shop("Mobila Online", "www.mobila.online.com", null, phonesThree))

    return shops
}