package ggv.ayush.instau.domain.use_cases.readonboarding

import ggv.ayush.instau.data.repository.Repository

class ReadOnBoardingUseCase (
     private val repository: Repository
) {
    operator fun invoke() = repository.readOnBoardingState()
}