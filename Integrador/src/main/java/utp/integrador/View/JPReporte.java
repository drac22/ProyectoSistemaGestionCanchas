/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package utp.integrador.View;

import java.awt.CardLayout;
import javax.swing.JPanel;
import static utp.integrador.View.JFPrincipal.cardLayout;

/**
 *
 * @author David
 */
public class JPReporte extends javax.swing.JPanel {

    static CardLayout cardLayout;
    JPanel panelVacio = new JPanel();

    private JPReporteFinanciero JPReporteFinanciero;
    private JPReporteOperativo JPReporteOperativo;

    public JPReporte() {
        initComponents();
        initComponents();
        panelDinamico.setLayout(new CardLayout());
        cardLayout = (CardLayout) panelDinamico.getLayout();
        JPReporteFinanciero = new JPReporteFinanciero();
        JPReporteOperativo = new JPReporteOperativo();
        panelDinamico.add(panelVacio, "vacio");
        panelDinamico.add(JPReporteOperativo, "JPReporteOperativo");
        panelDinamico.add(JPReporteFinanciero, "JPReporteFinanciero");
        cardLayout.show(panelDinamico, "vacio");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonFinanciero = new javax.swing.JButton();
        botonOperativo = new javax.swing.JButton();
        panelDinamico = new javax.swing.JPanel();

        botonFinanciero.setText("REPORTE FINANCIERO");
        botonFinanciero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFinancieroActionPerformed(evt);
            }
        });

        botonOperativo.setText("REPORTE OPERATIVO");
        botonOperativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOperativoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(botonFinanciero, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonOperativo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonFinanciero, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonOperativo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelDinamicoLayout = new javax.swing.GroupLayout(panelDinamico);
        panelDinamico.setLayout(panelDinamicoLayout);
        panelDinamicoLayout.setHorizontalGroup(
            panelDinamicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 739, Short.MAX_VALUE)
        );
        panelDinamicoLayout.setVerticalGroup(
            panelDinamicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelDinamico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDinamico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonFinancieroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFinancieroActionPerformed
        // TODO add your handling code here:
        cardLayout.show(panelDinamico, "JPReporteFinanciero");
    }//GEN-LAST:event_botonFinancieroActionPerformed

    private void botonOperativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOperativoActionPerformed
        // TODO add your handling code here:
        cardLayout.show(panelDinamico, "JPReporteOperativo");
    }//GEN-LAST:event_botonOperativoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonFinanciero;
    private javax.swing.JButton botonOperativo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelDinamico;
    // End of variables declaration//GEN-END:variables
}
