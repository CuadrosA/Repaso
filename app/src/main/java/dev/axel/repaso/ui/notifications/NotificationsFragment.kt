package dev.axel.repaso.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dev.axel.repaso.R
import dev.axel.repaso.databinding.FragmentNotificationsBinding

class NotificationsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_notifications, container, false)

        var arrEquipos = arrayOf("Manchester", "Barcelona", "Real Madrid", "Atlético de madrid")
        val lista_equipos: ListView = view.findViewById(R.id.lvEquipos)

        val adaptador = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, arrEquipos)

        lista_equipos.adapter = adaptador

        lista_equipos.setOnItemClickListener{
                parent, view, position, id -> Toast.makeText(requireContext(), "Posición: $position", Toast.LENGTH_SHORT)
        }
        return view
    }

}