package dev.axel.repaso.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import dev.axel.repaso.R
import dev.axel.repaso.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_dashboard, container, false)

        val et_km_recorridos: EditText = view.findViewById(R.id.et_km_recorridos)
        val et_m_jugados: EditText = view.findViewById(R.id.et_m_jugados)
        val btn_calcular: Button = view.findViewById(R.id.btn_calcular)
        val et_Resultado: TextView = view.findViewById(R.id.et_resultado)

        btn_calcular.setOnClickListener {
            val km_recorridos = et_km_recorridos.text.toString().toDoubleOrNull() ?: 0.0
            val m_jugados = et_m_jugados.text.toString().toDoubleOrNull()?: 0.0
            val result = km_recorridos / m_jugados

            et_Resultado.text = "$result km/min"
        }
        return view
    }

}