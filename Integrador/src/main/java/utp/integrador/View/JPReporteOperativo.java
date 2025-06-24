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
import utp.integrador.Model.ReporteOperativoDTO;

/**
 *
 * @author David
 */
public class JPReporteOperativo extends javax.swing.JPanel {

    ReservaDAO dao = new ReservaDAO();
    private final ReservaController reservaController = new ReservaController(dao);

    public JPReporteOperativo() {
        initComponents();
        actualizarTablaReporteOperativo();
    }

    public void actualizarTablaReporteOperativo() {
        DefaultTableModel modelo = (DefaultTableModel) tblReporteOperativo.getModel();
        modelo.setRowCount(0);
        try {
            List<ReporteOperativoDTO> reporteOperativo = reservaController.mostrarReporteOperativo();

            for (ReporteOperativoDTO dto : reporteOperativo) {
                Object[] fila = {
                    dto.getIdCancha(),
                    dto.getUbicacion(),
                    dto.getVecesAlquiladas(),
                    dto.getTotalHoras(),};
                modelo.addRow(fila);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar el reporte operativo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblReporteOperativo = new javax.swing.JTable();

        tblReporteOperativo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDCANCHA", "UBICACION", "N° ALQUILADO", "TIEMPOTOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblReporteOperativo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReporteOperativo;
    // End of variables declaration//GEN-END:variables
}
