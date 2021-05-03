/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import entidades.Alumno;
import entidades.Registro;
import entidades.Materia;
import java.util.HashSet;

/**
 *
 * @author Jannete
 */
public class Menu extends javax.swing.JFrame {
    Registro colegio=new Registro();
    
//    HashSet<Alumno>listAlumnos=new HashSet<>();
//    HashSet<Materia>listMateria=new HashSet<>();
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAgregar = new javax.swing.JMenu();
        jmAgregarAl = new javax.swing.JMenuItem();
        jmMateria = new javax.swing.JMenu();
        jmAgregarMa = new javax.swing.JMenuItem();
        jmRegistro = new javax.swing.JMenu();
        jmInscribir = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        jmAgregar.setText("Alumnos");
        jmAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAgregarActionPerformed(evt);
            }
        });

        jmAgregarAl.setText("Agregar alumnos");
        jmAgregarAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAgregarAlActionPerformed(evt);
            }
        });
        jmAgregar.add(jmAgregarAl);

        jMenuBar1.add(jmAgregar);

        jmMateria.setText("Materia");
        jmMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmMateriaActionPerformed(evt);
            }
        });

        jmAgregarMa.setText("Agregar Materia");
        jmAgregarMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAgregarMaActionPerformed(evt);
            }
        });
        jmMateria.add(jmAgregarMa);

        jMenuBar1.add(jmMateria);

        jmRegistro.setText("Registro");
        jmRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRegistroActionPerformed(evt);
            }
        });

        jmInscribir.setText("Inscribir");
        jmInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmInscribirActionPerformed(evt);
            }
        });
        jmRegistro.add(jmInscribir);

        jMenuBar1.add(jmRegistro);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAgregarActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jmAgregarActionPerformed

    private void jmRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRegistroActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jmRegistroActionPerformed

    private void jmAgregarAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAgregarAlActionPerformed
        // TODO add your handling code here:
       escritorio.removeAll();
       escritorio.repaint();
       ForAlumno foa=new ForAlumno(colegio);
       foa.setVisible(true);
       escritorio.add(foa);
       escritorio.moveToFront(foa);
    }//GEN-LAST:event_jmAgregarAlActionPerformed

    private void jmAgregarMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAgregarMaActionPerformed
        // TODO add your handling code here:
       escritorio.removeAll();
       escritorio.repaint();
       ForMaterias fom=new ForMaterias(colegio);
       fom.setVisible(true);
       escritorio.add(fom);
       escritorio.moveToFront(fom);
        
    }//GEN-LAST:event_jmAgregarMaActionPerformed

    private void jmInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmInscribirActionPerformed
        // TODO add your handling code here:
       escritorio.removeAll();
       escritorio.repaint();
       inscripcion insc=new inscripcion(colegio);
       insc.setVisible(true);
       escritorio.add(insc);
       escritorio.moveToFront(insc);
    }//GEN-LAST:event_jmInscribirActionPerformed

    private void jmMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmMateriaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmAgregar;
    private javax.swing.JMenuItem jmAgregarAl;
    private javax.swing.JMenuItem jmAgregarMa;
    private javax.swing.JMenuItem jmInscribir;
    private javax.swing.JMenu jmMateria;
    private javax.swing.JMenu jmRegistro;
    // End of variables declaration//GEN-END:variables
}
