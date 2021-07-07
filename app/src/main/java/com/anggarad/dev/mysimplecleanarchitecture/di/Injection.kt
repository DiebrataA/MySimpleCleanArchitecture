package com.anggarad.dev.mysimplecleanarchitecture.di

import com.anggarad.dev.mysimplecleanarchitecture.data.IMessageDataSource
import com.anggarad.dev.mysimplecleanarchitecture.data.MessageDataSource
import com.anggarad.dev.mysimplecleanarchitecture.data.MessageRepository
import com.anggarad.dev.mysimplecleanarchitecture.domain.IMessageRepository
import com.anggarad.dev.mysimplecleanarchitecture.domain.MessageInteractor
import com.anggarad.dev.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase{
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)

    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()

    }
}