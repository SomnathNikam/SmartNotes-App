package com.example.notesapp.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.notesapp.Models.Note
import com.example.notesapp.Utils.DATABASE_NAME


@Database(entities = arrayOf(Note::class), version = 1, exportSchema = false)
abstract class NoteDatabase:RoomDatabase() {

    abstract fun getNotedao():Notedao

    companion object{
        @Volatile
        private var INSTANCE : NoteDatabase?=null

        fun getDatabase(context: Context):NoteDatabase{

            return INSTANCE?: synchronized(this){

                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    NoteDatabase::class.java,
                    DATABASE_NAME
                ).build()
                INSTANCE= instance
                instance
            }
        }
    }
}