package com.example.lucas.mvvmapplication.utilities

import com.example.lucas.mvvmapplication.data.FakeDatabase
import com.example.lucas.mvvmapplication.data.FakeQuoteDao
import com.example.lucas.mvvmapplication.data.QuoteRepository
import com.example.lucas.mvvmapplication.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory{

        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)

        return QuotesViewModelFactory(quoteRepository)

    }

}



