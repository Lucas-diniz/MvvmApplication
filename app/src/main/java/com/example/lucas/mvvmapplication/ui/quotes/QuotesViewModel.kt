package com.example.lucas.mvvmapplication.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.lucas.mvvmapplication.data.Quote
import com.example.lucas.mvvmapplication.data.QuoteRepository

class QuotesViewModel(private val quotesRepository: QuoteRepository):ViewModel(){

    fun getQuote() =  quotesRepository.getQuotes()

    fun addQuote(quote: Quote) = quotesRepository.addQuote(quote)

}