package com.example.chap7top1

import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class RegisterTest{
    lateinit var regist : Register

    @Before
    fun setUp(){
        regist = Register
    }
    @After
    fun tearDown(){

    }

    @Test
    fun username_is_empty() {
        val username = ""
        val assert = regist.validate(username, "dflja@3", "dkjafjla","adsaddsad")
        assert(assert == "MASUKKAN USERNAME ANDA")
    }
    @Test
    fun usernameExist(){
        val username = "Behroz"
        val assert = regist.validate(username,"dflja@3","1234","1234")
        assert(assert == "USERNAME SUDAH ADA")
    }




}