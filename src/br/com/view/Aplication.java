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

    public static void main(String args[]) throws InterruptedException {
        VIEWInit init = new VIEWInit();
        int i;
        init.setVisible(true);
        try {
            for (i = 0; i <= 100; i += 3) {

                Thread.sleep(70);
                init.progresseCarregamento.setValue(i);

            }
            init.dispose();
            VIEWMain main = new VIEWMain();
            main.setVisible(true);

            for (i = 0; i <= 5; i++) {
                Thread.sleep(500);
                if (i == 0) {

                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
}
