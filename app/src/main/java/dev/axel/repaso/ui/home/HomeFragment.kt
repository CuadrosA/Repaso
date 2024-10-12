package dev.axel.repaso.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.axel.repaso.R
import dev.axel.repaso.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Selección del fragmento
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        // Estableciendo la creación del layout por item
        val rvPlayer: RecyclerView = view.findViewById(R.id.rvPlayer)
        rvPlayer.layoutManager = LinearLayoutManager(requireContext())
        rvPlayer.adapter = PlayerAdapter(getPlayers())

        return view
    }

    private fun getPlayers(): List<SoccerPlayerModel> {
        val lista_players: ArrayList<SoccerPlayerModel> = ArrayList()

        lista_players.add(SoccerPlayerModel(R.drawable.cristiano, 2000, "Cristiano Ronaldo", 10))
        lista_players.add(SoccerPlayerModel(R.drawable.messi, 2001, "Messi", 10))
        lista_players.add(SoccerPlayerModel(R.drawable.neymar, 2002, "Neymar", 11))
        lista_players.add(SoccerPlayerModel(R.drawable.salah, 2003, "Salah", 12))
        lista_players.add(SoccerPlayerModel(R.drawable.vinicius, 2004, "Vinicius", 13))

        return lista_players
    }

}