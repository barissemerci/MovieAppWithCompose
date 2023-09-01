package com.barissemerci.movieappwithcompose.presentation.movies

sealed class MoviesEvent {
    data class Search(val searchString:String): MoviesEvent()

}