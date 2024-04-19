package ggv.ayush.instau.data.repository

import kotlinx.coroutines.flow.Flow


interface DataStoreOperations {
    suspend fun saveOnBoardingState(completed : Boolean)
    fun getOnBoardingState() : Flow<Boolean>
}