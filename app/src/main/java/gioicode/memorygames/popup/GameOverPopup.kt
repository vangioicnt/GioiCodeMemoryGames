package gioicode.memorygames.popup

import android.view.View
import androidx.viewbinding.ViewBinding
import gioicode.memorygames.MainActivity
import gioicode.memorygames.databinding.PopupGameOverBinding

class GameOverPopup(var mainActivity: MainActivity, viewBindingParam: ViewBinding) {
    var viewBinding = PopupGameOverBinding.bind(viewBindingParam.root)
    init {
        this.viewBinding.root.visibility = View.GONE
        this.viewBinding.root.setOnClickListener {  }
    }

    fun show(){
        viewBinding.root.visibility = View.VISIBLE
    }

    fun hide(){
        viewBinding.root.visibility = View.GONE
    }
}