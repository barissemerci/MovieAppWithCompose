package com.barissemerci.movieappwithcompose.domain.repository

import com.barissemerci.movieappwithcompose.data.remote.dto.MovieDetailDto
import com.barissemerci.movieappwithcompose.data.remote.dto.MoviesDto

interface MovieRepository {
    suspend fun getMovies(search:String):MoviesDto

    suspend fun getMovieDetail(imdbId:String):MovieDetailDto

}