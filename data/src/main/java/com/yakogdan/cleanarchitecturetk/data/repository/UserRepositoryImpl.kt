package com.yakogdan.cleanarchitecturetk.data.repository

import com.yakogdan.cleanarchitecturetk.data.storage.UserStorage
import com.yakogdan.cleanarchitecturetk.data.storage.models.User
import com.yakogdan.cleanarchitecturetk.domain.models.SaveUserNameParam
import com.yakogdan.cleanarchitecturetk.domain.models.UserName
import com.yakogdan.cleanarchitecturetk.domain.repository.UserRepository


class UserRepositoryImpl(private val userStorage: UserStorage) : UserRepository {


    override fun saveName(saveParam: SaveUserNameParam): Boolean = userStorage.save(mapToStorage(saveParam))

    override fun getName(): UserName = mapToDomain(userStorage.get())

    private fun mapToStorage(saveParam: SaveUserNameParam): User = User(firstName = saveParam.name, lastName = "")

    private fun mapToDomain(user: User): UserName = UserName(firstName = user.firstName, lastName = user.lastName)

}