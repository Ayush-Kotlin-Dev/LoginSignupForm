package ggv.ayush.instau.domain.use_cases


import ggv.ayush.instau.domain.use_cases.readonboarding.ReadOnBoardingUseCase
import ggv.ayush.instau.domain.use_cases.save_onboarding.SaveOnBoardingCase


data class UseCases(
    val saveOnBoardingCase: SaveOnBoardingCase,
    val readOnBoardingUseCase: ReadOnBoardingUseCase,
)