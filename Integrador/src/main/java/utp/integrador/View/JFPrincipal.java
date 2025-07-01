package utp.integrador.View;

import java.awt.CardLayout;
import javax.swing.JPanel;
import utp.integrador.Controller.ClienteController;
import utp.integrador.Controller.UsuarioController;
import utp.integrador.DAO.ClienteDAO;
import utp.integrador.DAO.UsuarioDAO;
import utp.integrador.Model.Usuario;

public class JFPrincipal extends javax.swing.JFrame {

    static CardLayout cardLayout;
    private final Usuario usuario;
    
    ClienteDAO dao = new ClienteDAO();
    private final ClienteController clienteController = new ClienteController(dao);
    
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    UsuarioController usuarioController = new UsuarioController(usuarioDAO);
    
    JPanel panelVacio = new JPanel();
    private final JPReserva JPReserva;
    private final JPCliente JPCliente;
    private final JPEmpleado JPEmpleado;
    private final JPReporte JPReporte;

    public JFPrincipal(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        mostrarDatosUsuario();

        bottonEmpleado.setVisible(false);
        if (usuario.getRol().equals("admin")) {
            bottonEmpleado.setVisible(true);
        }

        cardLayout = (CardLayout) panelDinamico.getLayout();
        JPReserva = new JPReserva(usuario, clienteController);
        JPReporte = new JPReporte();
        JPCliente = new JPCliente();
        JPEmpleado = new JPEmpleado(usuarioController);

        panelDinamico.add(panelVacio, "vacio");
        panelDinamico.add(JPReserva, "JPReserva");
        panelDinamico.add(JPCliente, "JPCliente");
        panelDinamico.add(JPEmpleado, "JPEmpleado");
        panelDinamico.add(JPReporte, "JPReporte");
        cardLayout.show(panelDinamico, "vacio");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEstatico = new javax.swing.JPanel();
        bottonReservar = new javax.swing.JButton();
        bottonClientes = new javax.swing.JButton();
        bottonReporte = new javax.swing.JButton();
        bottonEmpleado = new javax.swing.JButton();
        lblNombresApellidos = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        bottonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        panelDinamico = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelEstatico.setBackground(new java.awt.Color(204, 255, 204));

        bottonReservar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reservar.png"))); // NOI18N
        bottonReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottonReservarActionPerformed(evt);
            }
        });

        bottonClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente.png"))); // NOI18N
        bottonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottonClientesActionPerformed(evt);
            }
        });

        bottonReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informe.png"))); // NOI18N
        bottonReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottonReporteActionPerformed(evt);
            }
        });

        bottonEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/empleado.png"))); // NOI18N
        bottonEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottonEmpleadoActionPerformed(evt);
            }
        });

        lblNombresApellidos.setText("...");

        lblRol.setText("...");

        bottonSalir.setText("SALIR");
        bottonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottonSalirActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        javax.swing.GroupLayout panelEstaticoLayout = new javax.swing.GroupLayout(panelEstatico);
        panelEstatico.setLayout(panelEstaticoLayout);
        panelEstaticoLayout.setHorizontalGroup(
            panelEstaticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstaticoLayout.createSequentialGroup()
                .addGroup(panelEstaticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEstaticoLayout.createSequentialGroup()
                        .addGroup(panelEstaticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEstaticoLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(panelEstaticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bottonEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bottonClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bottonReservar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bottonReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(panelEstaticoLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(panelEstaticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombresApellidos)
                                    .addComponent(lblRol))))
                        .addGap(0, 83, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEstaticoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bottonSalir)))
                .addContainerGap())
            .addGroup(panelEstaticoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEstaticoLayout.setVerticalGroup(
            panelEstaticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstaticoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(bottonSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombresApellidos)
                .addGap(28, 28, 28)
                .addComponent(lblRol)
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(bottonReservar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bottonClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bottonReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bottonEmpleado)
                .addGap(30, 30, 30))
        );

        panelDinamico.setBackground(new java.awt.Color(204, 255, 255));
        panelDinamico.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelEstatico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDinamico, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEstatico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelDinamico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bottonReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottonReservarActionPerformed
        // TODO add your handling code here:
        cardLayout.show(panelDinamico, "JPReserva");
    }//GEN-LAST:event_bottonReservarActionPerformed

    private void bottonEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottonEmpleadoActionPerformed
        // TODO add your handling code here:
        cardLayout.show(panelDinamico, "JPEmpleado");
    }//GEN-LAST:event_bottonEmpleadoActionPerformed

    private void bottonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottonClientesActionPerformed
        // TODO add your handling code here:
        cardLayout.show(panelDinamico, "JPCliente");
    }//GEN-LAST:event_bottonClientesActionPerformed

    private void bottonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottonSalirActionPerformed
        new JFLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_bottonSalirActionPerformed

    private void bottonReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottonReporteActionPerformed
        // TODO add your handling code here:
        cardLayout.show(panelDinamico, "JPReporte");
    }//GEN-LAST:event_bottonReporteActionPerformed

    private void mostrarDatosUsuario() {
        lblNombresApellidos.setText("Bienvenido, " + usuario.getNombres() + " " + usuario.getApellidos());
        lblRol.setText("Rol: " + usuario.getRol());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bottonClientes;
    private javax.swing.JButton bottonEmpleado;
    private javax.swing.JButton bottonReporte;
    private javax.swing.JButton bottonReservar;
    private javax.swing.JButton bottonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblNombresApellidos;
    private javax.swing.JLabel lblRol;
    private javax.swing.JPanel panelDinamico;
    private javax.swing.JPanel panelEstatico;
    // End of variables declaration//GEN-END:variables
}
