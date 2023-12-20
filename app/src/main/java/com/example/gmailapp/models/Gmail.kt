package com.example.gmailapp.models
import org.threeten.bp.LocalDate

data class Gmail(
    val photo: Int,
    val name: String,
    val subject: String,
    val shortMessage: String,
    val date: LocalDate,
    val longMessage: String
)