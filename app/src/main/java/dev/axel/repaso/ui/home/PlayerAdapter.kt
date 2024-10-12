package dev.axel.repaso.ui.home

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.axel.repaso.R

class PlayerAdapter (private var list_players: List<SoccerPlayerModel>): RecyclerView.Adapter<PlayerAdapter.ViewHolder>() {

    // Declaración de items del layout
    class  ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val player_item_image: ImageView = itemView.findViewById(R.id.player_item_image_view)
        val player_item_name: TextView =  itemView.findViewById(R.id.player_item_name)
        val player_item_number: TextView = itemView.findViewById(R.id.player_item_number)
        val player_item_year: TextView = itemView.findViewById(R.id.player_item_year)
    }

    // Asignación del layout modelo a crearse
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.player_item, parent, false))
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val player_item = list_players[position]
        holder.player_item_image.setImageResource(player_item.player_image)
        holder.player_item_year.text = player_item.player_year.toString()
        holder.player_item_number.text = player_item.player_number.toString()
        holder.player_item_name.text = player_item.player_name
    }

    // retorno de los elementos en la lista
    override fun getItemCount(): Int {
        return list_players.size
    }

}