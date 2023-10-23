/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.resources;

import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import javax.swing.border.AbstractBorder;

/**
 *
 * @author Lucas
 */
public class BordaArredondada extends AbstractBorder{
    private int arco;

    public BordaArredondada(int arco) {
        this.arco = arco;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(c.getForeground());

        Shape forma = new RoundRectangle2D.Double(x, y, width - 1, height - 1, arco, arco);
        g2d.draw(forma);
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(arco, arco, arco, arco);
    }

    @Override
    public boolean isBorderOpaque() {
        return true;
    }
}
