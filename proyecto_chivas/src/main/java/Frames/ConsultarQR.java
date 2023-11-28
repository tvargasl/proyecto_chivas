/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author JEFERSON
 */
public class ConsultarQR extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarQR
     */
    public ConsultarQR() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frameError = new javax.swing.JFrame();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnVolverError = new javax.swing.JButton();
        frameSeleccionarServicios = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listServicios = new javax.swing.JList<>();
        btnSeleccionarServicio = new javax.swing.JButton();
        btnVolverMenu = new javax.swing.JButton();
        frameQR = new javax.swing.JFrame();
        jLabel7 = new javax.swing.JLabel();
        btnVolverMenuPrincipal = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel6.setText("Error");

        jLabel8.setText("No existen servicios con paquetes activos asociados a este documento de identidad ");

        btnVolverError.setText("Volver");
        btnVolverError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverErrorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frameErrorLayout = new javax.swing.GroupLayout(frameError.getContentPane());
        frameError.getContentPane().setLayout(frameErrorLayout);
        frameErrorLayout.setHorizontalGroup(
            frameErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameErrorLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel8)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameErrorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(frameErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameErrorLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(217, 217, 217))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameErrorLayout.createSequentialGroup()
                        .addComponent(btnVolverError)
                        .addGap(209, 209, 209))))
        );
        frameErrorLayout.setVerticalGroup(
            frameErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameErrorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(btnVolverError)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel4.setText("Se ha encontrado uno o más servicios asociados a este documento de identidad.");

        jLabel5.setText("Seleccione el que desea conocer el QR...");

        listServicios.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 7", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listServicios);

        btnSeleccionarServicio.setText("Seleccionar");
        btnSeleccionarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarServicioActionPerformed(evt);
            }
        });

        btnVolverMenu.setText("Volver al menú principal");
        btnVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frameSeleccionarServiciosLayout = new javax.swing.GroupLayout(frameSeleccionarServicios.getContentPane());
        frameSeleccionarServicios.getContentPane().setLayout(frameSeleccionarServiciosLayout);
        frameSeleccionarServiciosLayout.setHorizontalGroup(
            frameSeleccionarServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameSeleccionarServiciosLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(frameSeleccionarServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(frameSeleccionarServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addGroup(frameSeleccionarServiciosLayout.createSequentialGroup()
                            .addGroup(frameSeleccionarServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnVolverMenu)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(btnSeleccionarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        frameSeleccionarServiciosLayout.setVerticalGroup(
            frameSeleccionarServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameSeleccionarServiciosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGroup(frameSeleccionarServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameSeleccionarServiciosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frameSeleccionarServiciosLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnSeleccionarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(btnVolverMenu)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel7.setText("El QR asociado a este viaje se muestra a continuacion.");

        btnVolverMenuPrincipal.setText("Volver al menú principal");
        btnVolverMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverMenuPrincipalActionPerformed(evt);
            }
        });

        ImageIcon icon = new ImageIcon("C:\\Users\\JEFERSON\\Desktop\\Proyecto Final\\proyecto_chivas\\proyecto_chivas\\src\\main\\java\\Frames\\codigoQR.jpg");
        jLabel9.setIcon(icon);

        javax.swing.GroupLayout frameQRLayout = new javax.swing.GroupLayout(frameQR.getContentPane());
        frameQR.getContentPane().setLayout(frameQRLayout);
        frameQRLayout.setHorizontalGroup(
            frameQRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameQRLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel7)
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameQRLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(frameQRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameQRLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnVolverMenuPrincipal))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122))
        );
        frameQRLayout.setVerticalGroup(
            frameQRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameQRLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(btnVolverMenuPrincipal)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel1.setText("Consulta tu QR");

        jLabel2.setText("Por favor, ingrese el documento de identidad asociado al servicio: ");

        jLabel3.setText("Documento de identidad:");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(199, 199, 199))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addGap(79, 79, 79)
                        .addComponent(btnContinuar)
                        .addGap(162, 162, 162))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(111, 111, 111))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnContinuar))
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        PaginaPrincipal principal = new PaginaPrincipal();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        if (txtID.getText().equals("1035971929")) {
            frameSeleccionarServicios.setLocationRelativeTo(null);
            frameSeleccionarServicios.setSize(600, 310);
            frameSeleccionarServicios.setVisible(true);
        } else {
            frameError.setLocationRelativeTo(null);
            frameError.setSize(550, 190);
            frameError.setVisible(true);
        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnVolverErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverErrorActionPerformed
        frameError.setVisible(false);
    }//GEN-LAST:event_btnVolverErrorActionPerformed

    private void btnSeleccionarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarServicioActionPerformed
        if (listServicios.getSelectedIndex() != -1) {
            frameSeleccionarServicios.setVisible(false);
            frameQR.setVisible(true);
            frameQR.setLocationRelativeTo(null);
            frameQR.setSize(560, 360);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione correctamente el servicio que desea consultar el QR");
        }
    }//GEN-LAST:event_btnSeleccionarServicioActionPerformed

    private void btnVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverMenuActionPerformed
        PaginaPrincipal principal = new PaginaPrincipal();
        principal.setVisible(true);
        frameSeleccionarServicios.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnVolverMenuActionPerformed

    private void btnVolverMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverMenuPrincipalActionPerformed
        dispose();
        frameQR.setVisible(false);
        PaginaPrincipal pagina = new PaginaPrincipal();
        pagina.setVisible(true);
    }//GEN-LAST:event_btnVolverMenuPrincipalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultarQR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarQR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarQR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarQR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarQR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnSeleccionarServicio;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnVolverError;
    private javax.swing.JButton btnVolverMenu;
    private javax.swing.JButton btnVolverMenuPrincipal;
    private javax.swing.JFrame frameError;
    private javax.swing.JFrame frameQR;
    private javax.swing.JFrame frameSeleccionarServicios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listServicios;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
