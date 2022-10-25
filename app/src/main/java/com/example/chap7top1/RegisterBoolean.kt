package com.example.chap7top1

object RegisterBoolean {
    private val existingEmail = listOf("Behroz@gmail.com", "Behroz1@gmail.com", "Behroz2@gmail.com", "Behroz3@gmail.com")


    fun validateRegistrationInput(
        email: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if (email.isEmpty() || password.isEmpty() || confirmedPassword.isEmpty()){
            return false
        }
        if (email in existingEmail){
            return false
        }
        if (password != confirmedPassword){
            return false
        }
        if (password.count { it.isDigit() } < 2){
            return false
        }
        if (confirmedPassword.count { it.isDigit() } < 2){
            return false
        }

        return true
    }
}