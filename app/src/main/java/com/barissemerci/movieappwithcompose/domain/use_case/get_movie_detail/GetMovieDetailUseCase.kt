package com.barissemerci.movieappwithcompose.domain.use_case.get_movie_detail

import com.barissemerci.movieappwithcompose.data.remote.dto.toMovieDetail
import com.barissemerci.movieappwithcompose.domain.model.MovieDetail
import com.barissemerci.movieappwithcompose.domain.repository.MovieRepository
import com.barissemerci.movieappwithcompose.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOError
import javax.inject.Inject

class GetMovieDetailUseCase @Inject constructor(private val repository: MovieRepository) {

    fun executeGetMovieDetails(imdbId: String): Flow<Resource<MovieDetail>> = flow {
        try {
            emit(Resource.Loading())
            val movieDetail = repository.getMovieDetail(imdbId)
            emit(Resource.Success(movieDetail.toMovieDetail()))
        } catch (e: IOError) {
            emit(Resource.Error(message = "No internet connection"))
        } catch (e: HttpException) {
            emit(Resource.Error(message = e.localizedMessage ?: "error"))
        }
    }
}