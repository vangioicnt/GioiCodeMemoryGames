package gioicode.memorygames.screen

import android.view.View
import androidx.viewbinding.ViewBinding
import gioicode.memorygames.MainActivity
import gioicode.memorygames.databinding.LayoutMenuBinding
import gioicode.memorygames.listener.MenuListener

class MenuScreen(var mainActivity: MainActivity, viewBindingParam: ViewBinding, var menuListener: MenuListener) {
    var viewBinding = LayoutMenuBinding.bind(viewBindingParam.root)
    init {
        this.viewBinding.root.visibility = View.VISIBLE
        this.viewBinding.root.setOnClickListener {  }
        viewBinding.btnPlay.setOnClickListener {
            menuListener.onButtonPlayClick()
        }
    }
}