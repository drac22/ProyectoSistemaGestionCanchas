/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package utp.integrador.View;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utp.integrador.Controller.ReservaController;
import utp.integrador.DAO.ReservaDAO;
import utp.integrador.Model.ReporteFinancieroDTO;
import utp.integrador.Model.Reserva;

/**
 *
 * @author David
 */
public class JPReporteFinanciero extends javax.swing.JPanel {

    ReservaDAO dao = new ReservaDAO();
    private final ReservaController reservaController = new ReservaController(dao);

    public JPReporteFinanciero() {
        initComponents();
        actualizarTablaReporteFinanciero();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblReporteFinanciero = new javax.swing.JTable();

        tblReporteFinanciero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDRESERVA", "USUARIO", "CLIENTE", "FECHA", "MONTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblReporteFinanciero);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void actualizarTablaReporteFinanciero() {
        DefaultTableModel modelo = (DefaultTableModel) tblReporteFinanciero.getModel();
        modelo.setRowCount(0);
        try {
            List<ReporteFinancieroDTO> reportefinanciero = reservaController.mostrarReporteFinanciero();

            for (ReporteFinancieroDTO dto : reportefinanciero) {
                Object[] fila = {
                    dto.getId(),
                    dto.getNombreUsuario(),
                    dto.getNombreCliente(),
                    dto.getFechaReserva(),
                    dto.getMonto(),
                };
                modelo.addRow(fila);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar el reporte financiero: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReporteFinanciero;
    // End of variables declaration//GEN-END:variables
}
