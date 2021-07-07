package com.anggarad.dev.mysimplecleanarchitecture.data

import com.anggarad.dev.mysimplecleanarchitecture.domain.IMessageRepository
import com.anggarad.dev.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource): IMessageRepository {

    override fun getWelcomeMessage(name: String): MessageEntity {
        return messageDataSource.getMessageFromSource(name)
    }
}