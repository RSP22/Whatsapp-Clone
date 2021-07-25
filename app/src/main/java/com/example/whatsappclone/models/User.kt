package com.example.whatsappclone.models

data class User(                  // used to save user info and info will be saved in firestore, so info can be shown to others
    val name: String,
    val imageUrl: String,
    val thumbImage: String,
    val deviceToken: String, // use to send notifications
    val status: String,
    val online: Boolean, //online status
    val uid: String // uid from auth
) {
    /** mandatory Empty [Constructor] for Firebase */
    constructor() : this("", "", "", "", "Hey There, I am using whatsapp", false, "")

    //constructor used by us, only 4 parameters because other will be not defined in  start
    constructor(name: String, imageUrl: String, thumbImage: String, uid: String) :
            this(name, imageUrl, thumbImage, "", uid = uid, status = "Hey There, I am using whatsapp", online = false)

}