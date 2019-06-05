/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ups.vista;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author José Quinde
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    private String ruta;
    public VentanaPrincipal()  {
        initComponents();
        
    }
    public void IngresoListas() throws RutaNoExistenteException{
        ruta=txtRuta.getText();
        File directorio=new File(ruta);
        if(directorio.isDirectory()==true){
           File[]archivos=directorio.listFiles();
           DefaultListModel modelo = new DefaultListModel();
           DefaultListModel modelo1 = new DefaultListModel();
           DefaultListModel modelo2 = new DefaultListModel();
           for(File archivo:archivos){               
            if(archivo.isDirectory()){
            modelo.addElement(archivo.getName());
            }
        } 
             for(File archivo:archivos){               
            if(archivo.isFile()){
            modelo1.addElement(archivo.getName());
            }
        }
               for(File archivo:archivos){               
            if(archivo.isHidden()){
            modelo2.addElement(archivo.getName());
            }
        }
          lstDirectorios.setModel(modelo);
          lstArchivos.setModel(modelo1);
          lstOcultos.setModel(modelo2);
        }
        else{
           throw new RutaNoExistenteException(); 
        }
    }
    public static long tamañoDirectorio(File directory) {
    long length = 0;
    for (File file : directory.listFiles()) {
        if (file.isFile())
            length += file.length();
        else
            length += tamañoDirectorio(file);
    }
    return length;
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtRuta = new javax.swing.JTextField();
        btnListar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstOcultos = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstDirectorios = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstArchivos = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblModificacion = new javax.swing.JLabel();
        lblRuta = new javax.swing.JLabel();
        lblTamaño = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuNuevo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Listar Directorios");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RUTA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        btnListar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnListar.setText("LISTAR");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnListar, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(txtRuta))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ARCHIVOS", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        lstOcultos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstOcultosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstOcultos);

        lstDirectorios.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstDirectoriosValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstDirectorios);

        lstArchivos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstArchivosValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(lstArchivos);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Directorios");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Archivos");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Ocultos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INFORMACION", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Ruta Absoluta :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Ultima Modificación :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Tamaño en KB :");

        lblModificacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblRuta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblTamaño.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblModificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(lblRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(lblModificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jMenu1.setText("Archivo");

        menuNuevo.setText("Nuevo");
        menuNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNuevoActionPerformed(evt);
            }
        });
        jMenu1.add(menuNuevo);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        
            // TODO add your handling code here:
        try{
            IngresoListas();                  
        }catch(RutaNoExistenteException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Error Exception",JOptionPane.OK_OPTION);
        }
        
        
    }//GEN-LAST:event_btnListarActionPerformed

    private void lstDirectoriosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstDirectoriosValueChanged
        // TODO add your handling code here:
      
        String seleccion = lstDirectorios.getSelectedValue().toString();
        String rutaCompleta=ruta+"\\"+seleccion;
        lblRuta.setText(rutaCompleta);
        File fichero = new File(rutaCompleta);
        long modificacion=fichero.lastModified();
        String pattern = "yyyy-MM-dd hh:mm aa";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		
		Date fechaModificacion = new Date( modificacion );
        
        lblModificacion.setText(simpleDateFormat.format( fechaModificacion ));
        long length = tamañoDirectorio(fichero);
	lblTamaño.setText(Math.round(Math.ceil(length/1024.0) )+ " Kb");		 
        lstArchivos.clearSelection();
        lstOcultos.clearSelection();
    
    }//GEN-LAST:event_lstDirectoriosValueChanged

    private void lstArchivosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstArchivosValueChanged
        // TODO add your handling code here:
        lstDirectorios.clearSelection();
        lstOcultos.clearSelection();
        String seleccion = lstArchivos.getSelectedValue().toString();
        String rutaCompleta=ruta+"\\"+seleccion;
        lblRuta.setText(rutaCompleta);
        File fichero = new File(rutaCompleta);
        long modificacion=fichero.lastModified();
        String pattern = "yyyy-MM-dd hh:mm aa";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		
		Date fechaModificacion = new Date( modificacion );
        
        lblModificacion.setText(simpleDateFormat.format( fechaModificacion ));

	lblTamaño.setText(Math.round(Math.ceil(fichero.length()/1024.0) )+ " Kb");		 
        lstDirectorios.clearSelection();
        lstOcultos.clearSelection();
    
    }//GEN-LAST:event_lstArchivosValueChanged

    private void lstOcultosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstOcultosValueChanged
        // TODO add your handling code here:
        
        String seleccion = lstOcultos.getSelectedValue().toString();
        String rutaCompleta=ruta+"\\"+seleccion;
        lblRuta.setText(rutaCompleta);
        File fichero = new File(rutaCompleta);
        long modificacion=fichero.lastModified();
        String pattern = "yyyy-MM-dd hh:mm aa";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		
		Date fechaModificacion = new Date( modificacion );
        
        lblModificacion.setText(simpleDateFormat.format( fechaModificacion ));

	lblTamaño.setText(Math.round(Math.ceil(fichero.length()/1024.0) )+ " Kb");		 
        lstArchivos.clearSelection();
        lstDirectorios.clearSelection();
    
    }//GEN-LAST:event_lstOcultosValueChanged

    private void menuNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevoActionPerformed
        // TODO add your handling code here:
        if (lstDirectorios.getSelectedIndex()!=-1){
             String seleccion = lstDirectorios.getSelectedValue().toString();
            String rutaCompleta=ruta+"\\"+seleccion;
            String nombreArchivo=JOptionPane.showInputDialog("Ingrese el nombre del archivo");
             String rutaCrear=rutaCompleta+"\\"+nombreArchivo;
        
        File archivoNuevo=new File(rutaCrear);
        if(!archivoNuevo.exists()){
            try{
            archivoNuevo.createNewFile();
            JOptionPane.showConfirmDialog(rootPane,"El archivo "+nombreArchivo+" fue creado en la ruta "+rutaCrear);
            }catch(IOException ex){
                System.out.println("Error al crear el archivo");
                }    
        }
        }else{
        String nombreArchivo=JOptionPane.showInputDialog("Ingrese el nombre del archivo");
        String rutaCrear=ruta+"\\"+nombreArchivo;
        
        File archivoNuevo=new File(rutaCrear);
        if(!archivoNuevo.exists()){
            try{
            archivoNuevo.createNewFile();
            JOptionPane.showConfirmDialog(rootPane,"El archivo "+nombreArchivo+" fue creado en la ruta "+rutaCrear);
            }catch(IOException ex){
                System.out.println("Error al crear el archivo");
                }    
        }
        } 
    }//GEN-LAST:event_menuNuevoActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblModificacion;
    private javax.swing.JLabel lblRuta;
    private javax.swing.JLabel lblTamaño;
    private javax.swing.JList lstArchivos;
    private javax.swing.JList lstDirectorios;
    private javax.swing.JList lstOcultos;
    private javax.swing.JMenuItem menuNuevo;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}
