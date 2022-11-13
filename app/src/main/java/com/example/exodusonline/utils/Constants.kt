package com.example.exodusonline.utils

interface Constants {
    companion object{
        const val FIREBASE_REALTIME_DATABASE_URL = "https://exodus-online-default-rtdb.asia-southeast1.firebasedatabase.app/"
        const val FIREBASE_EMAIL_KEY = "email" // this is not a secret value, it is just a constant variable that will be accessed from different places of the application.
        const val FIREBASE_USERS = "users" // this is not a secret value, it is just a constant variable that will be accessed from different places of the application.
        const val FIREBASE_POSTS = "posts" // this is not a secret value, it is just a constant variable that will be accessed from different places of the application.
        const val FIREBASE_NOTIFICATIONS = "notifications" // this is not a secret value, it is just a constant variable that will be accessed from different places of the application.
        const val FIREBASE_ID_KEY = "id" // this is not a secret value, it is just a constant variable that will be accessed from different places of the application.
    }
}

