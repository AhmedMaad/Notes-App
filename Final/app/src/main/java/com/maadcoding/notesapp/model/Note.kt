package com.maadcoding.notesapp.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity("note")
class Note(
    @PrimaryKey(true)
    @ColumnInfo("_id")
    val id: Int = 0,
    val content: String
): Parcelable