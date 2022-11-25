package com.example.pedidos.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Pedido(val email:String,val num_cafes:String,val tipo_comsumo : String , val bool_helado :Boolean ) : Parcelable

