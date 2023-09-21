package com.example.notesapp.Database

import androidx.lifecycle.LiveData
import com.example.notesapp.Models.Note

class NotesRespository(private val notedao: Notedao) {

    val allNotes:LiveData<List<Note>> = notedao.getAllNotes()

    suspend fun insert(note: Note){
        notedao.insert(note)
    }
    suspend fun delete(note: Note){
        notedao.delete(note)
    }
    suspend fun update(note: Note){
        notedao.update(note.id,note.title,note.date)
    }
}