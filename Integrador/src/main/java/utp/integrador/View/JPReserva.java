package utp.integrador.View;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import javax.management.timer.Timer;
import javax.swing.JOptionPane;
import utp.integrador.Controller.ClienteController;
import utp.integrador.Controller.ReservaController;
import utp.integrador.DAO.ReservaDAO;
import utp.integrador.Model.Reserva;
import utp.integrador.Model.Usuario;

public class JPReserva extends javax.swing.JPanel {

    private Usuario usuario;
    private ReservaController reservaController;
    private ClienteController clienteController;

    public JPReserva(Usuario usuario, ClienteController clienteController) {
        this.usuario = usuario;
        this.clienteController = clienteController;
        ReservaDAO daoR = new ReservaDAO();
        this.reservaController = new ReservaController(daoR);
        initComponents();
        itemsHorariosInicio();
        txtIdCliente.setEnabled(false);
        txtMonto.setEnabled(false);
        dateFecha.setDateFormatString("dd-MM-yyyy");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        boxCancha = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        boxMetodoPago = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dateFecha = new com.toedter.calendar.JDateChooser();
        boxHoraInicio = new javax.swing.JComboBox<>();
        boxHoraFinal = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        txtIdCliente = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        botonCalcular = new javax.swing.JButton();

        jLabel1.setText("RESERVA");

        boxCancha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        boxCancha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCanchaActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccionar Cancha:");

        jButton2.setText("Buscar Cliente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Hora Inicio:");

        jLabel4.setText("Hora Fin:");

        jLabel5.setText("Metodo de Pago:");

        boxMetodoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YAPE", "PLIN", "EFECTIVO" }));
        boxMetodoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMetodoPagoActionPerformed(evt);
            }
        });

        jLabel6.setText("Total:");

        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });

        jLabel7.setText("Fecha:");

        dateFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateFechaMouseClicked(evt);
            }
        });

        boxHoraInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        boxHoraInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxHoraInicioActionPerformed(evt);
            }
        });

        boxHoraFinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        boxHoraFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxHoraFinalActionPerformed(evt);
            }
        });

        jButton1.setText("RESERVAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdClienteActionPerformed(evt);
            }
        });

        jButton3.setText("LIMPIAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        botonCalcular.setText("CALCULAR");
        botonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(boxCancha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(boxHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxHoraFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(boxMetodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(dateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(botonCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(jLabel4))
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(298, 298, 298))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(boxCancha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(boxMetodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel6)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel7))
                    .addComponent(dateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(boxHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(22, 22, 22)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(boxHoraFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(botonCalcular)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFSeleccionCliente frame = new JFSeleccionCliente(clienteController, this);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void boxMetodoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMetodoPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxMetodoPagoActionPerformed

    private void boxCanchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCanchaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxCanchaActionPerformed

    private void boxHoraInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxHoraInicioActionPerformed

    }//GEN-LAST:event_boxHoraInicioActionPerformed

    private void txtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClienteActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtIdClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int idCancha = Integer.parseInt(boxCancha.getSelectedItem().toString());
            int idCliente = Integer.parseInt(txtIdCliente.getText());
            LocalTime horaInicio = LocalTime.parse(boxHoraInicio.getSelectedItem().toString());
            LocalTime horaFinal = LocalTime.parse(boxHoraFinal.getSelectedItem().toString());
            
            if (dateFecha.getDate() == null) {
                JOptionPane.showMessageDialog(this, "Por favor selecciona una fecha.", "Fecha requerida", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (horaInicio.compareTo(horaFinal) >= 0) {
                JOptionPane.showMessageDialog(this, "La hora de inicio debe ser anterior a la hora de fin.", "Hora inválida", JOptionPane.ERROR_MESSAGE);
                return;
            }

            LocalDate fecha = new java.sql.Date(dateFecha.getDate().getTime()).toLocalDate();
            String metodoPago = boxMetodoPago.getSelectedItem().toString();
            String montoStr = txtMonto.getText().replace("S/", "").replace(",", ".").trim();
            double monto = Double.parseDouble(montoStr);
            
            if (reservaController.esHorarioDisponible(idCancha, fecha, horaInicio, horaFinal)) {
                Reserva reserva = new Reserva(monto, fecha, horaInicio, horaFinal, idCliente, idCancha, usuario.getId());
                reservaController.agregarReserva(reserva);
                JOptionPane.showMessageDialog(this, "Reserva agregada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

                txtIdCliente.setText("");
                txtMonto.setText("");
                boxHoraInicio.setSelectedIndex(0);
                boxHoraFinal.setSelectedIndex(0);
                dateFecha.setDate(null);
                boxMetodoPago.setSelectedIndex(0);

            } else {
                JOptionPane.showMessageDialog(this, "La cancha ya está reservada en ese horario.", "Reserva no disponible", JOptionPane.WARNING_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor asegúrate de ingresar números válidos en los campos requeridos.", "Datos inválidos", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "⚠️ Error al agregar la reserva: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        limpiarFormulario();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed

    }//GEN-LAST:event_txtMontoActionPerformed

    private void boxHoraFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxHoraFinalActionPerformed

    }//GEN-LAST:event_boxHoraFinalActionPerformed

    private void botonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularActionPerformed
        String horaInicioTexto = boxHoraInicio.getSelectedItem().toString();
        String horaFinalTexto = boxHoraFinal.getSelectedItem().toString();

        LocalTime inicio = LocalTime.parse(horaInicioTexto);
        LocalTime fin = LocalTime.parse(horaFinalTexto);

        double monto = reservaController.calcularMonto(inicio, fin);
        txtMonto.setText(String.format("S/%.2f", monto));
    }//GEN-LAST:event_botonCalcularActionPerformed

    private void dateFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateFechaMouseClicked

    }//GEN-LAST:event_dateFechaMouseClicked

    private void itemsHorariosInicio() {
        boxHoraInicio.removeAllItems();
        boxHoraFinal.removeAllItems();

        for (int hora = 9; hora <= 23; hora++) {
            for (int minuto : new int[]{0, 30}) {
                String tiempo = String.format("%02d:%02d", hora, minuto);
                boxHoraInicio.addItem(tiempo);
                boxHoraFinal.addItem(tiempo);
            }
        }
    }

    public void recibirIdSeleccionado(String id) {
        txtIdCliente.setText(id);
    }

    private void limpiarFormulario() {
        txtIdCliente.setText("");
        txtMonto.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCalcular;
    private javax.swing.JComboBox<String> boxCancha;
    private javax.swing.JComboBox<String> boxHoraFinal;
    private javax.swing.JComboBox<String> boxHoraInicio;
    private javax.swing.JComboBox<String> boxMetodoPago;
    private com.toedter.calendar.JDateChooser dateFecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
