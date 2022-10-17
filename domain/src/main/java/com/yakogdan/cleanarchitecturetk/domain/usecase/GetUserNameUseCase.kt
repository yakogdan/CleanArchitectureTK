package com.yakogdan.cleanarchitecturetk.domain.usecase

import com.yakogdan.cleanarchitecturetk.domain.models.UserName
import com.yakogdan.cleanarchitecturetk.domain.repository.UserRepository

class GetUserNameUseCase(private val userRepository: UserRepository) {

    fun execute(): UserName {

        return userRepository.getName()
    }
}