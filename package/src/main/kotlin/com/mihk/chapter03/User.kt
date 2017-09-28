package com.mihk.chapter03

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    if (user.name.isEmpty()) {
        throw IllegalArgumentException("Cat not save user ${user.id} : empty Name")
    }
    if (user.address.isEmpty()) {
        throw IllegalArgumentException("Can not save user ${user.id}:empty Address")
    }
}

fun main(args: Array<String>) {
    saveUser(User(1, "", ""))
}