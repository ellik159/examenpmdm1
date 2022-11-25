package com.example.pedidos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.pedidos.databinding.FragmentInicioBinding
import com.example.pedidos.models.Pedido


class inicio : Fragment() {
  private lateinit var binding :FragmentInicioBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_inicio,container,false)
        binding.button.setOnClickListener{
        if (binding.inputCorreo.text.toString() !="" && binding.numeroDeCafes.text.toString() != "" ){
            Pedido(binding.inputCorreo.text.toString() , binding.numeroDeCafes.text.toString(),binding.radioGroup.toString(),binding.switch1.isActivated)
            //No puedo pasar los datos porque no me genera la clase direction del safe args pero seria con el ojetos instacionado antes.a

            view?.findNavController()?.navigate(R.id.action_inicio_to_framento_resumen)
        }
        }
        return binding.root
    }


}