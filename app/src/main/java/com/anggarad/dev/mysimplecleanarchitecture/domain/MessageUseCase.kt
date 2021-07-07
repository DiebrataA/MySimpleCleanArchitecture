package com.anggarad.dev.mysimplecleanarchitecture.domain

interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}