package com.example.flea.data.repository

import com.example.flea.data.models.generateFilms
import kotlinx.coroutines.flow.flowOf

class FleaRepository {
    private val fleaFilms = generateFilms()

    fun getAllFLeaCart() = flowOf(fleaFilms)

    fun getFilmById(filmId: Long) = fleaFilms.first {
        it.id == filmId
    }

    companion object {
        @Volatile
        private var instance: FleaRepository? = null

        fun getInstance() =
            instance ?: synchronized(this) {
                FleaRepository().apply {
                    instance = this
                }
            }
    }
}