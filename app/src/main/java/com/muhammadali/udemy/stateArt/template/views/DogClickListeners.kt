package com.muhammadali.udemy.stateArt.template.views

import android.view.View
import com.muhammadali.udemy.stateArt.template.model.DogBreed

/**
 * Created by Muhammad Ali on 20-May-20.
 * Email muhammad.ali9385@gmail.com
 */
interface DogClickListeners {
    fun onClick(view :View,dogBreed: DogBreed)
}