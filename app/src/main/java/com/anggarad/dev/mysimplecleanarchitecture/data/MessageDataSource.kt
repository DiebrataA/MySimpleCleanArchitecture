package com.anggarad.dev.mysimplecleanarchitecture.data

import com.anggarad.dev.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource: IMessageDataSource {
    override fun getMessageFromSource(name: String): MessageEntity {
        return  MessageEntity("Hello $name! Welcome to Clean Architecture")
    }
}