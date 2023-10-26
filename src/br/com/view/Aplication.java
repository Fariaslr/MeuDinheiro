/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.view;



/**
 *
 * @author Lucas
 */
public class Aplication {

    public static void main(String args[]) {
        /*VIEWInit init = new VIEWInit();
        int i;
        init.setVisible(true);
        try {
            for (i = 0; i <= 100; i += 3) {

                Thread.sleep(70);
                init.progresseCarregamento.setValue(i);

            }
            init.dispose();*/
            VIEWmain main = new VIEWmain();
            main.setVisible(true);

        /*} catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }*/

    }
}
