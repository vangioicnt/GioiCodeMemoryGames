package gioicode.memorygames

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import gioicode.memorygames.databinding.ActivityMainBinding
import gioicode.memorygames.listener.MenuListener
import gioicode.memorygames.listener.PauseListener
import gioicode.memorygames.listener.PlayListener
import gioicode.memorygames.popup.CompletedPopup
import gioicode.memorygames.popup.GameOverPopup
import gioicode.memorygames.popup.PausePopup
import gioicode.memorygames.popup.WinPopup
import gioicode.memorygames.screen.MenuScreen
import gioicode.memorygames.screen.PlayScreen

class MainActivity : AppCompatActivity() {

    lateinit var viewBinding: ActivityMainBinding

    var winPopup: WinPopup? = null
    var gameOverPopup: GameOverPopup? = null
    var pausePopup: PausePopup? = null
    var completedPopup: CompletedPopup? = null

    var playScreen: PlayScreen? = null
    var menuScreen: MenuScreen? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBinding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(viewBinding.root)

        winPopup = WinPopup(this, viewBinding.popupWin)
        gameOverPopup = GameOverPopup(this, viewBinding.popupGameOver)
        pausePopup = PausePopup(this, viewBinding.popupPause, object : PauseListener {
            override fun onButtonResumeClick() {
                pausePopup?.hide()
            }

            override fun onButtonMenuClick() {
                pausePopup?.hide()
                playScreen?.hide()
            }
        })
        completedPopup = CompletedPopup(this, viewBinding.popupCompleted)

        playScreen = PlayScreen(this, viewBinding.layoutPlay, object : PlayListener {
            override fun onButtonPauseClick() {
                pausePopup?.show()
            }

            override fun onButtonHintClick() {

            }
        })
        menuScreen = MenuScreen(this, viewBinding.layoutMenu, object : MenuListener {
            override fun onButtonPlayClick() {
                playScreen?.show()
            }
        })
    }
}