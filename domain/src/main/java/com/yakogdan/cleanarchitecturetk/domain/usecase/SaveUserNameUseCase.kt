package com.yakogdan.cleanarchitecturetk.domain.usecase

import com.yakogdan.cleanarchitecturetk.domain.models.SaveUserNameParam
import com.yakogdan.cleanarchitecturetk.domain.repository.UserRepository

class SaveUserNameUseCase(private val userRepository: UserRepository) {

    fun execute(param: SaveUserNameParam): Boolean {
        val oldUserName = userRepository.getName()

        if (oldUserName.firstName == param.name) {
            return true
        }
        return userRepository.saveName(saveParam = param)
    }
}