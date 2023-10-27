/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.view;

import Atxy2k.CustomTextField.RestrictedTextField;
import br.com.model.Dinheiro;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javafx.scene.chart.NumberAxis;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.Range;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Lucas
 */
public final class VIEWmain extends javax.swing.JFrame {

    Dinheiro dinheiro = new Dinheiro();
    Font fontJText = new Font("Tahoma", Font.BOLD, 18);
    Icon figura = new ImageIcon(getToolkit().createImage(getClass().getResource("/br/com/image/info.png")));

    /**
     * Creates new form VIEWMani
     */
    public VIEWmain() {
        initComponents();
        initJTexts();
        validaSalario();
        initFonts();
        //invisibleContainer();
        //invisibleCifrao();
        //invisibleIcon();
        //invisibleLabel();
        //invisibleText();
    }

    public void initJTexts() {
        txtSalario.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.GRAY));
        txtDespesas.setBorder(null);
        txtLazer.setBorder(null);
        txtInvestimento.setBorder(null);
    }

    private void validaSalario() {
        RestrictedTextField validaTxtSalario = new RestrictedTextField(txtSalario);
        validaTxtSalario.setLimit(6);
        validaTxtSalario.setOnlyNums(true);
    }

    private void initFonts() {
        txtSalario.setFont(fontJText);
        txtDespesas.setFont(fontJText);
        txtLazer.setFont(fontJText);
        txtInvestimento.setFont(fontJText);
    }

    public void invisibleContainer() {
        lblContainerDespesas.setVisible(false);
        lblContainerLazer.setVisible(false);
        lblContainerInvestimento.setVisible(false);
    }

    public void invisibleIcon() {
        lblIconDespesas.setVisible(false);
        lblIconLazer.setVisible(false);
        lblIconInvestimento.setVisible(false);
    }

    public void invisibleCifrao() {
        lblCifraoDespesas.setVisible(false);
        lblCifraoLazer.setVisible(false);
        lblCifraoInvestimento.setVisible(false);
    }

    public void invisibleLabel() {
        lblDespesas.setVisible(false);
        lblLazer.setVisible(false);
        lblInvestimento.setVisible(false);
    }

    public void invisibleText() {
        txtDespesas.setVisible(false);
        txtLazer.setVisible(false);
        txtInvestimento.setVisible(false);
    }

    public void limpaJTextField() {
        txtDespesas.setText(null);
        txtLazer.setText(null);
        txtInvestimento.setText(null);
    }

    private void mostraValores() {
        String formatoMonetario = "%.2f";
        txtDespesas.setText(String.format(formatoMonetario, dinheiro.getGastoFixo()));
        txtLazer.setText(String.format(formatoMonetario, dinheiro.getGastoVariavel()));
        txtInvestimento.setText(String.format(formatoMonetario, dinheiro.getFundoMonetario()));
    }

    private void criarGrafico() {
        DefaultCategoryDataset barra = new DefaultCategoryDataset();
        barra.setValue(dinheiro.getGastoFixo(), lblDespesas.getText(), "");
        barra.setValue(dinheiro.getGastoVariavel(), lblLazer.getText(), "");
        barra.setValue(dinheiro.getFundoMonetario(), lblInvestimento.getText(), "");

        JFreeChart grafico = ChartFactory.createBarChart3D("Gastos", "", "R$", barra, PlotOrientation.VERTICAL, true, true, false);
        ChartPanel painel = new ChartPanel(grafico);
        
        CategoryPlot barraItem = grafico.getCategoryPlot();
        barraItem.getRenderer().setSeriesPaint(0, Color.green);
        barraItem.getRenderer().setSeriesPaint(1, Color.BLUE);
        barraItem.getRenderer().setSeriesPaint(2, Color.red);
        
        NumberAxis axis = new NumberAxis();
        
        painel.setMouseWheelEnabled(true);
        painel.setPreferredSize(new Dimension(240, 170));
        panelGrafico.setLayout(new BorderLayout());
        panelGrafico.add(painel, BorderLayout.NORTH);
        pack();
        repaint();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackground = new javax.swing.JPanel();
        lblIconDespesas = new javax.swing.JLabel();
        txtDespesas = new javax.swing.JTextField();
        lblDespesas = new javax.swing.JLabel();
        lblIconLazer = new javax.swing.JLabel();
        lblIconSalario = new javax.swing.JLabel();
        lblIconInvestimento = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        txtLazer = new javax.swing.JTextField();
        txtInvestimento = new javax.swing.JTextField();
        panelFooter = new javax.swing.JPanel();
        lblPiggyBank = new javax.swing.JLabel();
        lblSalarioAtual = new javax.swing.JLabel();
        lblIconInfoInvestimento = new javax.swing.JLabel();
        lblIconInfoLazer = new javax.swing.JLabel();
        lblLazer = new javax.swing.JLabel();
        lblIconInfoDespesas = new javax.swing.JLabel();
        lblInvestimento = new javax.swing.JLabel();
        lblCifraoDespesas = new javax.swing.JLabel();
        lblCifraoSalario = new javax.swing.JLabel();
        lblCifraoLazer = new javax.swing.JLabel();
        lblCifraoInvestimento = new javax.swing.JLabel();
        lblContainerSalario = new javax.swing.JLabel();
        lblContainerDespesas = new javax.swing.JLabel();
        lblContainerLazer = new javax.swing.JLabel();
        lblContainerInvestimento = new javax.swing.JLabel();
        panelSalario = new javax.swing.JPanel();
        panelGrafico = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Meu dinheiro");
        setResizable(false);

        panelBackground.setBackground(new java.awt.Color(3, 139, 115));
        panelBackground.setLayout(null);

        lblIconDespesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/image/MoneyTransation.png"))); // NOI18N
        panelBackground.add(lblIconDespesas);
        lblIconDespesas.setBounds(210, 175, 32, 32);

        txtDespesas.setEditable(false);
        txtDespesas.setBackground(new java.awt.Color(255, 255, 255));
        panelBackground.add(txtDespesas);
        txtDespesas.setBounds(60, 185, 90, 25);

        lblDespesas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDespesas.setText("Despesas");
        panelBackground.add(lblDespesas);
        lblDespesas.setBounds(30, 170, 60, 15);

        lblIconLazer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/image/Summer.png"))); // NOI18N
        panelBackground.add(lblIconLazer);
        lblIconLazer.setBounds(210, 245, 32, 32);

        lblIconSalario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/image/Money.png"))); // NOI18N
        panelBackground.add(lblIconSalario);
        lblIconSalario.setBounds(210, 90, 40, 40);

        lblIconInvestimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/image/Business.png"))); // NOI18N
        panelBackground.add(lblIconInvestimento);
        lblIconInvestimento.setBounds(210, 315, 32, 32);

        txtSalario.setBackground(new java.awt.Color(253, 250, 250));
        txtSalario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSalarioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSalarioKeyReleased(evt);
            }
        });
        panelBackground.add(txtSalario);
        txtSalario.setBounds(60, 105, 90, 25);

        txtLazer.setEditable(false);
        txtLazer.setBackground(new java.awt.Color(255, 255, 255));
        panelBackground.add(txtLazer);
        txtLazer.setBounds(60, 255, 90, 25);

        txtInvestimento.setEditable(false);
        txtInvestimento.setBackground(new java.awt.Color(255, 255, 255));
        panelBackground.add(txtInvestimento);
        txtInvestimento.setBounds(60, 325, 90, 25);

        panelFooter.setBackground(new java.awt.Color(4, 130, 108));

        lblPiggyBank.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/image/PiggyBank48px.png"))); // NOI18N

        javax.swing.GroupLayout panelFooterLayout = new javax.swing.GroupLayout(panelFooter);
        panelFooter.setLayout(panelFooterLayout);
        panelFooterLayout.setHorizontalGroup(
            panelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFooterLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(lblPiggyBank)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        panelFooterLayout.setVerticalGroup(
            panelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFooterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPiggyBank)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBackground.add(panelFooter);
        panelFooter.setBounds(0, 0, 270, 68);

        lblSalarioAtual.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSalarioAtual.setText("Seu salário atual?");
        panelBackground.add(lblSalarioAtual);
        lblSalarioAtual.setBounds(30, 90, 93, 15);

        lblIconInfoInvestimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/image/info.png"))); // NOI18N
        lblIconInfoInvestimento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblIconInfoInvestimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconInfoInvestimentoMouseClicked(evt);
            }
        });
        panelBackground.add(lblIconInfoInvestimento);
        lblIconInfoInvestimento.setBounds(185, 325, 16, 16);

        lblIconInfoLazer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/image/info.png"))); // NOI18N
        lblIconInfoLazer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblIconInfoLazer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconInfoLazerMouseClicked(evt);
            }
        });
        panelBackground.add(lblIconInfoLazer);
        lblIconInfoLazer.setBounds(185, 250, 16, 16);

        lblLazer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblLazer.setText("Lazer");
        panelBackground.add(lblLazer);
        lblLazer.setBounds(30, 240, 30, 15);

        lblIconInfoDespesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/image/info.png"))); // NOI18N
        lblIconInfoDespesas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblIconInfoDespesas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconInfoDespesasMouseClicked(evt);
            }
        });
        panelBackground.add(lblIconInfoDespesas);
        lblIconInfoDespesas.setBounds(185, 185, 16, 16);

        lblInvestimento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblInvestimento.setText("Investimento");
        panelBackground.add(lblInvestimento);
        lblInvestimento.setBounds(30, 310, 80, 15);

        lblCifraoDespesas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCifraoDespesas.setText("R$");
        panelBackground.add(lblCifraoDespesas);
        lblCifraoDespesas.setBounds(30, 185, 24, 20);

        lblCifraoSalario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCifraoSalario.setText("R$");
        panelBackground.add(lblCifraoSalario);
        lblCifraoSalario.setBounds(30, 105, 25, 22);

        lblCifraoLazer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCifraoLazer.setText("R$");
        panelBackground.add(lblCifraoLazer);
        lblCifraoLazer.setBounds(30, 255, 24, 22);

        lblCifraoInvestimento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCifraoInvestimento.setText("R$");
        panelBackground.add(lblCifraoInvestimento);
        lblCifraoInvestimento.setBounds(30, 325, 30, 22);

        lblContainerSalario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/image/Design.png"))); // NOI18N
        panelBackground.add(lblContainerSalario);
        lblContainerSalario.setBounds(15, 80, 240, 58);

        lblContainerDespesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/image/Design.png"))); // NOI18N
        panelBackground.add(lblContainerDespesas);
        lblContainerDespesas.setBounds(15, 160, 240, 60);

        lblContainerLazer.setBackground(new java.awt.Color(255, 255, 255));
        lblContainerLazer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/image/Design.png"))); // NOI18N
        lblContainerLazer.setText("jLabel1");
        panelBackground.add(lblContainerLazer);
        lblContainerLazer.setBounds(15, 230, 240, 58);

        lblContainerInvestimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/image/Design.png"))); // NOI18N
        panelBackground.add(lblContainerInvestimento);
        lblContainerInvestimento.setBounds(15, 300, 240, 58);

        javax.swing.GroupLayout panelSalarioLayout = new javax.swing.GroupLayout(panelSalario);
        panelSalario.setLayout(panelSalarioLayout);
        panelSalarioLayout.setHorizontalGroup(
            panelSalarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        panelSalarioLayout.setVerticalGroup(
            panelSalarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelBackground.add(panelSalario);
        panelSalario.setBounds(20, 90, 230, 40);

        javax.swing.GroupLayout panelGraficoLayout = new javax.swing.GroupLayout(panelGrafico);
        panelGrafico.setLayout(panelGraficoLayout);
        panelGraficoLayout.setHorizontalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        panelGraficoLayout.setVerticalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        panelBackground.add(panelGrafico);
        panelGrafico.setBounds(15, 380, 240, 170);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblIconInfoDespesasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconInfoDespesasMouseClicked
        String mensagem = "Despesas (50%):\n"
                + "Para cobrir suas despesas \n"
                + "mensais, como aluguel contas de\n"
                + "serviços públicos e alimentação.\n";
        JOptionPane.showMessageDialog(this, mensagem, "Info",
                JOptionPane.PLAIN_MESSAGE, figura);
    }//GEN-LAST:event_lblIconInfoDespesasMouseClicked

    private void txtSalarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalarioKeyReleased
        if (txtSalario.getText().equals("")) {
            limpaJTextField();
        }
    }//GEN-LAST:event_txtSalarioKeyReleased

    private void txtSalarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtSalario.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Insira um salário");
            } else {
                dinheiro.setSalario(Float.parseFloat(txtSalario.getText()));
                dinheiro.administraSalario();
                criarGrafico();
                mostraValores();
            }
        }
    }//GEN-LAST:event_txtSalarioKeyPressed

    private void lblIconInfoLazerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconInfoLazerMouseClicked
        String mensagem = "Lazer (30%):\n"
                + "Reservado para atividades de \n"
                + "entretenimento e lazer, como\n"
                + "restaurantese compras não essenciais.\n";
        JOptionPane.showMessageDialog(this, mensagem, "Lazer",
                JOptionPane.PLAIN_MESSAGE, figura);
    }//GEN-LAST:event_lblIconInfoLazerMouseClicked

    private void lblIconInfoInvestimentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconInfoInvestimentoMouseClicked
        String mensagem = "Investimento/Reserva (20%):\n"
                + "Alocado para investir ou guardar,\n"
                + " incluindo contas de poupança e \n"
                + "investimentos em ações.\n";
        JOptionPane.showMessageDialog(this, mensagem, "Investimento",
                JOptionPane.PLAIN_MESSAGE, figura);
    }//GEN-LAST:event_lblIconInfoInvestimentoMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new VIEWmain().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCifraoDespesas;
    private javax.swing.JLabel lblCifraoInvestimento;
    private javax.swing.JLabel lblCifraoLazer;
    protected javax.swing.JLabel lblCifraoSalario;
    private javax.swing.JLabel lblContainerDespesas;
    private javax.swing.JLabel lblContainerInvestimento;
    private javax.swing.JLabel lblContainerLazer;
    protected javax.swing.JLabel lblContainerSalario;
    private javax.swing.JLabel lblDespesas;
    private javax.swing.JLabel lblIconDespesas;
    private javax.swing.JLabel lblIconInfoDespesas;
    private javax.swing.JLabel lblIconInfoInvestimento;
    private javax.swing.JLabel lblIconInfoLazer;
    private javax.swing.JLabel lblIconInvestimento;
    private javax.swing.JLabel lblIconLazer;
    private javax.swing.JLabel lblIconSalario;
    private javax.swing.JLabel lblInvestimento;
    private javax.swing.JLabel lblLazer;
    protected javax.swing.JLabel lblPiggyBank;
    protected javax.swing.JLabel lblSalarioAtual;
    private javax.swing.JPanel panelBackground;
    protected javax.swing.JPanel panelFooter;
    private javax.swing.JPanel panelGrafico;
    private javax.swing.JPanel panelSalario;
    private javax.swing.JTextField txtDespesas;
    private javax.swing.JTextField txtInvestimento;
    private javax.swing.JTextField txtLazer;
    protected javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables

}
