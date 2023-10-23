/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.view;

import br.com.view.VIEWInit;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class Aplication {

    public static void main(String args[]) {
        VIEWInit init = new VIEWInit();
        init.setVisible(true);
        try {
            for (int i = 0; i <= 100; i += 3) {

                Thread.sleep(140);
                init.progresseCarregamento.setValue(i);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        init.dispose();
        VIEWMain main = new VIEWMain();
        main.setVisible(true);
    }
}
