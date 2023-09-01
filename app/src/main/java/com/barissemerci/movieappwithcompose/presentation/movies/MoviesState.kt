package com.barissemerci.movieappwithcompose.presentation.movies

import com.barissemerci.movieappwithcompose.domain.model.Movie

data class MoviesState(val isLoading:Boolean=false, val movies:List<Movie> = emptyList(),val error:String="",val search:String="batman")