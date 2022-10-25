package com.example.chap7top1

import org.junit.Assert.*
import org.junit.Test

class RegisterBooleanTest{
    @Test
    fun validUsernameAndCorrectlyRepeatedPassword_return_true() {
        val result = RegisterBoolean.validateRegistrationInput(
            "Ariya@gmail.com",
            "12345",
            "12345"
        )
        assertEquals("oke",result,true)
    }

    @Test
    fun pwMinDua(){
        val pw = "1"
        val result = RegisterBoolean.validateRegistrationInput("asda",pw,"1")
        assertEquals("false",result,false)
    }
    @Test
    fun confirmpwMinDua(){
        val cpw = "1"
        val result = RegisterBoolean.validateRegistrationInput("asda","1",cpw)
        assertEquals("false",result,false)
    }
}