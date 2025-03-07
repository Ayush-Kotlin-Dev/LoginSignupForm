package ggv.ayush.instau.domain.use_cases.save_onboarding

import ggv.ayush.instau.data.repository.Repository


class SaveOnBoardingCase(
    private val repository: Repository
) {
    suspend operator fun invoke(completed: Boolean) {
        repository.saveOnBoardingState(completed)
    }
}