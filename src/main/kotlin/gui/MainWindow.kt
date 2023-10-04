package gui

import java.awt.Dimension
import java.awt.Font
import javax.swing.GroupLayout
import javax.swing.GroupLayout.DEFAULT_SIZE
import javax.swing.GroupLayout.PREFERRED_SIZE
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JTextField
import javax.swing.SwingConstants.HORIZONTAL

class MainWindow : JFrame(){
    private val lblLogin: JLabel
    private val lblPassword: JLabel
    private val tfLogin: JTextField
    private val tfPassword: JTextField
    private val btnLogin: JButton

    init{
        minimumSize = Dimension(500, 400)
        defaultCloseOperation = EXIT_ON_CLOSE
        val fnt = Font.decode("Myriad Pro Cond 26")

        lblLogin = JLabel("Логин:").apply {
            font = fnt
        }
        lblPassword = JLabel("Пароль:").apply {
            font = fnt
        }
        tfLogin = JTextField().apply {
            font = fnt
        }
        tfPassword = JTextField().apply {
            font = fnt
        }
        btnLogin = JButton("Войти").apply {
            font = fnt
        }

        layout = GroupLayout(contentPane).apply {
            setVerticalGroup(
                createSequentialGroup()
                    .addGap(8, 8, Int.MAX_VALUE)
                    .addGroup(
                        createBaselineGroup(true, true)
                            .addComponent(lblLogin, PREFERRED_SIZE, PREFERRED_SIZE, PREFERRED_SIZE)
                            .addComponent(tfLogin, PREFERRED_SIZE, PREFERRED_SIZE, PREFERRED_SIZE)
                    )
                    .addGap(8)
                    .addGroup(
                        createParallelGroup(GroupLayout.Alignment.CENTER)
                            .addComponent(lblPassword, PREFERRED_SIZE, PREFERRED_SIZE, PREFERRED_SIZE)
                            .addComponent(tfPassword, PREFERRED_SIZE, PREFERRED_SIZE, PREFERRED_SIZE)
                    )
                    .addGap(16)
                    .addComponent(btnLogin, PREFERRED_SIZE, PREFERRED_SIZE, PREFERRED_SIZE)
                    .addGap(8, 8, Int.MAX_VALUE)
            )

            setHorizontalGroup(
                createSequentialGroup()
                    .addGap(16)
                    .addGroup(
                        createParallelGroup()
                            .addGroup(
                                createSequentialGroup()
                                    .addComponent(lblLogin, PREFERRED_SIZE, PREFERRED_SIZE, PREFERRED_SIZE)
                                    .addGap(8)
                                    .addComponent(tfLogin, DEFAULT_SIZE, DEFAULT_SIZE, DEFAULT_SIZE)
                            )
                            .addGroup(
                                createSequentialGroup()
                                    .addComponent(lblPassword, PREFERRED_SIZE, PREFERRED_SIZE, PREFERRED_SIZE)
                                    .addGap(8)
                                    .addComponent(tfPassword, DEFAULT_SIZE, DEFAULT_SIZE, DEFAULT_SIZE)
                            )
                            .addComponent(btnLogin, PREFERRED_SIZE, PREFERRED_SIZE, PREFERRED_SIZE)
                    )
                    .addGap(16)
            )

            linkSize(HORIZONTAL, lblLogin, lblPassword)
        }
    }
}