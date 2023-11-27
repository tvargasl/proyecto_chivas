/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

/**
 *
 * @author Tomas
 */
public class Tours_disponibles extends javax.swing.JFrame {

    /**
     * Creates new form Tours_disponibles
     */
    public Tours_disponibles() {
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

        jFrame_error = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnVolver1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaTours = new javax.swing.JTable();
        btnTour1 = new javax.swing.JButton();
        btnTour2 = new javax.swing.JButton();
        btnTour3 = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel2.setText("ERROR");

        jLabel3.setText("No hay cupos disponibles para el Tour seleccionado ");

        btnVolver1.setText("Volver");
        btnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame_errorLayout = new javax.swing.GroupLayout(jFrame_error.getContentPane());
        jFrame_error.getContentPane().setLayout(jFrame_errorLayout);
        jFrame_errorLayout.setHorizontalGroup(
            jFrame_errorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame_errorLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(49, 49, 49))
            .addGroup(jFrame_errorLayout.createSequentialGroup()
                .addGroup(jFrame_errorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame_errorLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel2))
                    .addGroup(jFrame_errorLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(btnVolver1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jFrame_errorLayout.setVerticalGroup(
            jFrame_errorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame_errorLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnVolver1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel1.setText("Tours disponibles: ");

        TablaTours.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "10/10", "descripcion1", "30.000"},
                {null, null, null, null},
                {null, "2/15", "descripcion 2", "25.000"},
                {null, null, null, null},
                {null, "20/20", "descripcion 3", "15.000"}
            },
            new String [] {
                "IMAGEN", "AFORO DISPONIBLE", "DESCRIPCION", "PRECIO"
            }
        ));
        jScrollPane1.setViewportView(TablaTours);

        btnTour1.setText("SELECCIONAR");
        btnTour1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTour1ActionPerformed(evt);
            }
        });

        btnTour2.setText("SELECCIONAR");
        btnTour2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTour2ActionPerformed(evt);
            }
        });

        btnTour3.setText("SELECCIONAR");
        btnTour3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTour3ActionPerformed(evt);
            }
        });

        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(212, 212, 212))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTour1)
                            .addComponent(btnTour2)
                            .addComponent(btnTour3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnTour1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTour2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTour3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
    Añadir_tour tour = new Añadir_tour();
    tour.setVisible(true);
    dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnTour1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTour1ActionPerformed
    Object valor = TablaTours.getValueAt(0, 1);
        String texto = valor.toString();
        String[] numeros = texto.split("/");
        
        int personas = Integer.parseInt(numeros[0]);
        int maximas = Integer.parseInt(numeros[1]);
        
        if (personas < maximas){
            menor_edad menor = new menor_edad();
            menor.setVisible(true);
            dispose();
        }else{
            Error_nocupos_tour error = new Error_nocupos_tour();
            error.setVisible(true);
            error.setLocationRelativeTo(null);
            error.setSize(400,320);
        }
    }//GEN-LAST:event_btnTour1ActionPerformed

    private void btnTour2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTour2ActionPerformed
    Object valor = TablaTours.getValueAt(2, 1);
        String texto = valor.toString();
        String[] numeros = texto.split("/");
        
        int personas = Integer.parseInt(numeros[0]);
        int maximas = Integer.parseInt(numeros[1]);
        
        if (personas < maximas){
            menor_edad menor = new menor_edad();
            menor.setVisible(true);
            dispose();
        }else{
            Error_nocupos_tour error = new Error_nocupos_tour();
            error.setVisible(true);
            error.setLocationRelativeTo(null);
            error.setSize(400,320);
        }
    }//GEN-LAST:event_btnTour2ActionPerformed

    private void btnTour3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTour3ActionPerformed
    Object valor = TablaTours.getValueAt(4, 1);
        String texto = valor.toString();
        String[] numeros = texto.split("/");
        
        int personas = Integer.parseInt(numeros[0]);
        int maximas = Integer.parseInt(numeros[1]);
        
        if (personas < maximas){
            menor_edad menor = new menor_edad();
            menor.setVisible(true);
            dispose();
        }else{
            jFrame_error.setVisible(true);
            jFrame_error.setLocationRelativeTo(null);
            jFrame_error.setSize(400,320);
        }
    }//GEN-LAST:event_btnTour3ActionPerformed

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed
     jFrame_error.setVisible(false);
    }//GEN-LAST:event_btnVolver1ActionPerformed

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
            java.util.logging.Logger.getLogger(Tours_disponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tours_disponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tours_disponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tours_disponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tours_disponibles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaTours;
    private javax.swing.JButton btnTour1;
    private javax.swing.JButton btnTour2;
    private javax.swing.JButton btnTour3;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JFrame jFrame_error;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
