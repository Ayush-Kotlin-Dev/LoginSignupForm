package ggv.ayush.instau.domain.repository

import kotlinx.coroutines.flow.Flow


interface DataStoreOperations {
    suspend fun saveOnBoardingState(completed : Boolean)
    fun getOnBoardingState() : Flow<Boolean>
}