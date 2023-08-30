package com.barissemerci.movieappwithcompose.data.repository

import com.barissemerci.movieappwithcompose.data.remote.MovieAPI
import com.barissemerci.movieappwithcompose.data.remote.dto.MovieDetailDto
import com.barissemerci.movieappwithcompose.data.remote.dto.MoviesDto
import com.barissemerci.movieappwithcompose.domain.repository.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(private val api: MovieAPI) : MovieRepository {
    override suspend fun getMovies(search: String): MoviesDto {
        return api.getMovies(search)
    }

    override suspend fun getMovieDetail(imdbId: String): MovieDetailDto {
        return api.getMovieDetail(imdbId)
    }
}