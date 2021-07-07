package com.anggarad.dev.mysimplecleanarchitecture.domain

interface IMessageRepository {
    fun getWelcomeMessage(name: String): MessageEntity
}