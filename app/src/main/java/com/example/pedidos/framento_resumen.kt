package com.example.pedidos

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.pedidos.databinding.FragmentFramentoResumenBinding


class framento_resumen : Fragment() {
    private lateinit var binding : FragmentFramentoResumenBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_framento_resumen,container,false)
        binding.button2.setOnClickListener{
            val intent = Intent(Intent.ACTION_SEND).apply {
                type = "*/*"
                putExtra(Intent.EXTRA_EMAIL, arrayOf(binding.textView4.text))
                putExtra(Intent.EXTRA_SUBJECT,"Pedido")
            }
            startActivity(intent)
        }
        return binding.root
    }


}