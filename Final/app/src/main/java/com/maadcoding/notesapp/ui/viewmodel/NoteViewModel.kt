package com.maadcoding.notesapp.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.maadcoding.notesapp.database.RoomDBHelper
import com.maadcoding.notesapp.model.Note
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NoteViewModel(app: Application) : AndroidViewModel(app) {
    private val db = RoomDBHelper.getInstance(app)

    val notes = db.noteDao.getNotes()

    fun upsertNote(note: Note) {
        viewModelScope.launch {
            db.noteDao.upsertNote(note)
        }
    }

    fun deleteNote(note: Note) {
        viewModelScope.launch {
            db.noteDao.deleteNote(note)
        }
    }
}