package com.example.chap7top1

object Register {
    private val existingUsers = listOf("Behroz", "Bahram", "Parmida", "Raika")
    private val existingEmail = listOf("Behroz", "Bahram", "Parmida", "Raika")
    fun validate(username : String, email : String, password: String, confirmPassword : String):String?{
        if (username.isEmpty()) return "MASUKKAN USERNAME ANDA"
        if (username.length<6) return "USERNAME TERLALU PENDEK"
        if (username.length>20) return "USERNAME TERLALU PANJANG"
        if (username in existingUsers) return "USERNAME SUDAH ADA"

        if (email.isEmpty()) return  "MASUKKAN EMAIL ANDA"
//        if (!email.contains("@")) return  "MASUKKAN EMAIL YANG BENAR"
//        if (email.filter { it.isDigit() }.isEmpty()) return "EMAIL HARUS BERISI MINIMAL 1 DIGIT"
        if (email in existingEmail) return "EMAIL SUDAH ADA"

        if (password.isEmpty()) return "MASUKKAN PASSWORD ANDA"
        if (password.length<6) return "MASUKKAN PASSWORD YANG BENAR"

        if (confirmPassword.length<6) return "MASUKKAN CONFIRM PASSWORD YANG BENAR"


        return null
    }
}