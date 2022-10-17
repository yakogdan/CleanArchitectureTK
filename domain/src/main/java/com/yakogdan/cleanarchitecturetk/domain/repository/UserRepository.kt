package com.yakogdan.cleanarchitecturetk.domain.repository

import com.yakogdan.cleanarchitecturetk.domain.models.SaveUserNameParam
import com.yakogdan.cleanarchitecturetk.domain.models.UserName

interface UserRepository {

    fun saveName(saveParam: SaveUserNameParam): Boolean

    fun getName(): UserName
}