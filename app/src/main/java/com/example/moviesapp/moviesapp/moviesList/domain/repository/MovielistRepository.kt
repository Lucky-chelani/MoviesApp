package com.example.moviesapp.moviesapp.moviesList.domain.repository

import com.example.moviesapp.moviesapp.moviesList.util.Resource
import com.example.moviesapp.moviesapp.moviesList.domain.model.Movie
import kotlinx.coroutines.flow.Flow


interface MovielistRepository {
    suspend fun getMovieList(
        forcefetchFromRemote: Boolean,
        category : String,
        page : Int
    ) : Flow<Resource<List<Movie>>>
    suspend fun getMovie(id: Int):  Flow<Resource<Movie>>
}