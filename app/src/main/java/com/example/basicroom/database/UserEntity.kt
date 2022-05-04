package com.example.basicroom.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = TABLE_USERS)
data class UserEntity(
    @ColumnInfo(name = "user_id") @PrimaryKey val uuid: String,
    @ColumnInfo(name = "user_name") val name: String,
    @ColumnInfo(name = "user_height") val height: Double,
    @ColumnInfo(name = "user_email") val email: String,
    @ColumnInfo(name = "user_password") val password: String
)

fun UserEntity.toUser() = User(
    uuid,
    name,
    height,
    email,
    password
)