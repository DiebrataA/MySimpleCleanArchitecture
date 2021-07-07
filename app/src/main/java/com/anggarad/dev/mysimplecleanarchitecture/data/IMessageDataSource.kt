package com.anggarad.dev.mysimplecleanarchitecture.data

import com.anggarad.dev.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}