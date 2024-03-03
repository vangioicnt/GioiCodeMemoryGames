package gioicode.memorygames.screen

import android.view.View
import androidx.viewbinding.ViewBinding
import gioicode.memorygames.MainActivity
import gioicode.memorygames.databinding.LayoutPlayBinding
import gioicode.memorygames.listener.PlayListener

class PlayScreen(var mainActivity: MainActivity, viewBindingParam: ViewBinding, var playListener: PlayListener) {
    var viewBinding = LayoutPlayBinding.bind(viewBindingParam.root)
    init {
        this.viewBinding.root.visibility = View.GONE
        this.viewBinding.root.setOnClickListener {  }

        viewBinding.btnPause.setOnClickListener {
            playListener.onButtonPauseClick()
        }

        viewBinding.btnHint.setOnClickListener {
            playListener.onButtonHintClick()
        }
    }

    fun show(){
        viewBinding.root.visibility = View.VISIBLE
    }

    fun hide(){
        viewBinding.root.visibility = View.GONE
    }
}