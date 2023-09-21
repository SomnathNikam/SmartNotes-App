package com.example.notesapp.Adapter

import android.content.Context
import android.provider.ContactsContract.CommonDataKinds.Note
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.notesapp.Adapter.NotesAdapter.NoteViewHolder
import com.example.notesapp.R

class NotesAdapter(private val context: Context, private val NotesList: ArrayList<Note>,
                    private val fulList: ArrayList<Note>
 ):
     RecyclerView.Adapter<NotesAdapter.NoteViewHolder>() {


     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
         return NoteViewHolder(
             LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)
         )

     }

    override fun getItemCount(): Int {
        return NotesList.size
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
       val currentNote = NotesList[position]
//        holder.title.text = currentNote.title
//        holder.Note_ty.text = currentNote.note
//        holder.date.text = currentNote.date
    }
    inner class NoteViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val notes_layout = itemView.findViewById<CardView>(R.id.card_layout)
        val title = itemView.findViewById<TextView>(R.id.tv_title)
        val Note_ty = itemView.findViewById<TextView>(R.id.tv_note)
        val date = itemView.findViewById<TextView>(R.id.tv_date)
       // val title = itemView.findViewById<TextView>(R.id.tv_title)


    }
}