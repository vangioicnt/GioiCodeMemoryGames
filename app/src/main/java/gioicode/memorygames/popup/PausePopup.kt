package gioicode.memorygames.popup

import android.view.View
import androidx.viewbinding.ViewBinding
import gioicode.memorygames.MainActivity
import gioicode.memorygames.databinding.PopupPauseBinding
import gioicode.memorygames.listener.PauseListener

class PausePopup(var mainActivity: MainActivity, viewBindingParam: ViewBinding, var pauseListener: PauseListener) {
    var viewBinding = PopupPauseBinding.bind(viewBindingParam.root)
    init {
        this.viewBinding.root.visibility = View.GONE
        this.viewBinding.root.setOnClickListener {  }

        viewBinding.btnResume.setOnClickListener {
            pauseListener.onButtonResumeClick()
        }
        viewBinding.btnMenu.setOnClickListener {
            pauseListener.onButtonMenuClick()
        }
    }

    fun show(){
        viewBinding.root.visibility = View.VISIBLE
    }

    fun hide(){
        viewBinding.root.visibility = View.GONE
    }
}