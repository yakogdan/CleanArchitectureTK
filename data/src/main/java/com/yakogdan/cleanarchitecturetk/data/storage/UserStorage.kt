package com.yakogdan.cleanarchitecturetk.data.storage

import com.yakogdan.cleanarchitecturetk.data.storage.models.User

interface UserStorage {

    fun save(user: User): Boolean

    fun get(): User
}