package com.barissemerci.movieappwithcompose.presentation.movie_detail

import com.barissemerci.movieappwithcompose.domain.model.Movie
import com.barissemerci.movieappwithcompose.domain.model.MovieDetail

data class MovieDetailState(
    val isLoading:Boolean = false,
    val movie: MovieDetail? = null,
    val error: String = ""
)