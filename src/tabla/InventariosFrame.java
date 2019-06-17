
package tabla;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class InventariosFrame extends javax.swing.JInternalFrame {

    
    public InventariosFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        cajaBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();
        botonInsertar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonCargar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cajaCodigo = new javax.swing.JTextField();
        cajaNombre = new javax.swing.JTextField();
        cajaApellido = new javax.swing.JTextField();
        cajaCancelado = new javax.swing.JTextField();
        cajaPrecio = new javax.swing.JTextField();
        cajaFechaInicio = new javax.swing.JTextField();
        cajaaCuenta = new javax.swing.JTextField();
        cajafechaRecojo = new javax.swing.JTextField();
        comboEstado = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        cajaDescripcion = new javax.swing.JTextArea();

        setTitle("inventarios");

        jLabel2.setText("Buscador:");

        cajaBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaBuscarActionPerformed(evt);
            }
        });
        cajaBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cajaBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cajaBuscarKeyReleased(evt);
            }
        });

        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Descripcion", "Precio", "a Cuenta", "Cancelado", "fechaInicio", "fechaRecojo", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCliente);

        botonInsertar.setText("Ingresar");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonCargar.setText("Cargar tabla");
        botonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo");

        jLabel3.setText("Nombre");

        jLabel4.setText("Descripcion");

        jLabel5.setText("Precio");

        jLabel6.setText("Cancelado");

        jLabel7.setText("Fecha Inicio");

        jLabel8.setText("Fecha Recojo");

        jLabel9.setText("Estado");

        jLabel10.setText("Apellido");

        jLabel11.setText("a Cuenta");

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Inventario", "Entregado" }));

        cajaDescripcion.setColumns(20);
        cajaDescripcion.setRows(5);
        jScrollPane2.setViewportView(cajaDescripcion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 911, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(cajaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(154, 154, 154)
                        .addComponent(botonCargar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(jLabel4)
                                .addComponent(jScrollPane2)
                                .addComponent(cajaCodigo))
                            .addComponent(cajaCancelado, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(cajaFechaInicio)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cajaNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                        .addComponent(cajaPrecio))
                                    .addComponent(jLabel7))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(133, 133, 133)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11)
                        .addComponent(cajaApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                        .addComponent(cajaaCuenta))
                    .addComponent(cajafechaRecojo, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cajaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(botonCargar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaaCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajaFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajafechaRecojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cajaCancelado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    private void botonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarActionPerformed
       
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tablaCliente.setModel(modeloTabla);
        
        String campo = cajaBuscar.getText();
        String where = "";
        
        if (!"".equals(campo)) {
            where = "where nombre like '%"+campo+"%' or codigo like '%"+campo+"%' or apellido like '%"+campo+"%'";
        }
        
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            ps = conexion.prepareStatement("select codigo,nombre,apellido,descripcion,precio,aCuenta,cancelado,fechaInicio,fechaRecojo,estado from cliente "+where);
            rs = ps.executeQuery();
            
            modeloTabla.addColumn("Codigo");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Apellido");
            modeloTabla.addColumn("Descripcion");
            modeloTabla.addColumn("Precio");
            modeloTabla.addColumn("A cuenta");
            modeloTabla.addColumn("Cancelado");
            modeloTabla.addColumn("FechaInicio");
            modeloTabla.addColumn("FechaRecojo");
            modeloTabla.addColumn("Estado");
            
            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();
            
            int anchos[] = {40,90,90,170,50,60,70,100,100,100};
            
            for (int i = 0; i < cantidadColumnas; i++) {
                tablaCliente.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            
            
            
            while (rs.next()){
                Object fila[] = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = rs.getObject(i+1);
                }
                
                modeloTabla.addRow(fila);
            }
            
            
            
        }catch(Exception ex){
            System.out.println("Error, " +ex);
        }
        
        
        
    }//GEN-LAST:event_botonCargarActionPerformed

    private void tablaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClienteMouseClicked
       PreparedStatement ps = null;
       ResultSet rs = null;
       
        
        try{
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            int fila = tablaCliente.getSelectedRow();
            String codigo = tablaCliente.getValueAt(fila, 0).toString();
            
            ps = conexion.prepareStatement("select codigo, nombre, apellido, descripcion, precio, aCuenta, cancelado, fechaInicio, fechaRecojo, estado from cliente where codigo=?");
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            
            while(rs.next()){
                cajaCodigo.setText(rs.getString("codigo"));
                cajaNombre.setText(rs.getString("nombre"));
                cajaApellido.setText(rs.getString("apellido"));
                cajaDescripcion.setText(rs.getString("descripcion"));
                cajaPrecio.setText(String.valueOf(rs.getString("precio")));
                cajaaCuenta.setText(String.valueOf(rs.getString("aCuenta")));
                cajaCancelado.setText(String.valueOf(rs.getString("cancelado")));
                cajaFechaInicio.setText(rs.getString("fechaInicio"));
                cajafechaRecojo.setText(rs.getString("fechaRecojo"));
                comboEstado.setSelectedItem(rs.getString("estado"));
                
            }
            
            
        }catch(Exception ex){
            System.out.println("Error," +ex);
        }
        
        
        
        
    }//GEN-LAST:event_tablaClienteMouseClicked

    private void cajaBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaBuscarActionPerformed

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
       PreparedStatement ps = null;
       ResultSet rs = null;
        
        
        try{
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            ps = conexion.prepareStatement("insert into cliente (codigo,nombre,apellido,descripcion,precio,aCuenta,cancelado,fechaInicio,fechaRecojo,estado) values (?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, cajaCodigo.getText());
            ps.setString(2, cajaNombre.getText());
            ps.setString(3, cajaApellido.getText());
            ps.setString(4, cajaDescripcion.getText());
            ps.setInt(5, Integer.parseInt(cajaPrecio.getText()));
            ps.setInt(6, Integer.parseInt(cajaaCuenta.getText()));
            ps.setInt(7, Integer.parseInt(cajaCancelado.getText()));
            ps.setString(8, cajaFechaInicio.getText());
            ps.setString(9, cajafechaRecojo.getText());
            ps.setString(10, comboEstado.getSelectedItem().toString());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro ingresado correctamente");
            

        }catch(Exception ex){
            System.out.println("Error, " +ex);
        }
        
        
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
       PreparedStatement ps = null;
       ResultSet rs = null;
        
        
        try{
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            ps = conexion.prepareStatement("update cliente set codigo=?,nombre=?,apellido=?,descripcion=?,precio=?,aCuenta=?,cancelado=?,fechaInicio=?,fechaRecojo=?,estado=? where codigo=?");
            ps.setString(1, cajaCodigo.getText());
            ps.setString(2, cajaNombre.getText());
            ps.setString(3, cajaApellido.getText());
            ps.setString(4, cajaDescripcion.getText());
            ps.setInt(5, Integer.parseInt(cajaPrecio.getText()));
            ps.setInt(6, Integer.parseInt(cajaaCuenta.getText()));
            ps.setInt(7, Integer.parseInt(cajaCancelado.getText()));
            ps.setString(8, cajaFechaInicio.getText());
            ps.setString(9, cajafechaRecojo.getText());
            ps.setString(10, comboEstado.getSelectedItem().toString());
            ps.setString(11, cajaCodigo.getText());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
            

        }catch(Exception ex){
            System.out.println("Error, " +ex);
        }
        
        
        
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
       PreparedStatement ps = null;
       ResultSet rs = null;
        
        
        try{
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            ps = conexion.prepareStatement("delete from cliente where codigo=?");
            ps.setString(1, cajaCodigo.getText());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro elimiado correctamente");
            

        }catch(Exception ex){
            System.out.println("Error, " +ex);
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void cajaBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaBuscarKeyReleased
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tablaCliente.setModel(modeloTabla);
        
        String campo = cajaBuscar.getText();
        String where = "";
        
        if (!"".equals(campo)) {
            where = "where nombre like '%"+campo+"%' or codigo like '%"+campo+"%' or apellido like '%"+campo+"%'";
        }
        
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            ps = conexion.prepareStatement("select codigo,nombre,apellido,descripcion,precio,aCuenta,cancelado,fechaInicio,fechaRecojo,estado from cliente "+where);
            rs = ps.executeQuery();
            
            modeloTabla.addColumn("Codigo");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Apellido");
            modeloTabla.addColumn("Descripcion");
            modeloTabla.addColumn("Precio");
            modeloTabla.addColumn("A cuenta");
            modeloTabla.addColumn("Cancelado");
            modeloTabla.addColumn("FechaInicio");
            modeloTabla.addColumn("FechaRecojo");
            modeloTabla.addColumn("Estado");
            
            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();
            
            int anchos[] = {40,90,90,170,50,60,70,100,100,100};
            
            for (int i = 0; i < cantidadColumnas; i++) {
                tablaCliente.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            
            
            
            while (rs.next()){
                Object fila[] = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = rs.getObject(i+1);
                }
                
                modeloTabla.addRow(fila);
            }
            
            
            
        }catch(Exception ex){
            System.out.println("Error, " +ex);
        }
    }//GEN-LAST:event_cajaBuscarKeyReleased

    private void cajaBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaBuscarKeyPressed
        
        
        
        
        
    }//GEN-LAST:event_cajaBuscarKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCargar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JTextField cajaApellido;
    private javax.swing.JTextField cajaBuscar;
    private javax.swing.JTextField cajaCancelado;
    private javax.swing.JTextField cajaCodigo;
    private javax.swing.JTextArea cajaDescripcion;
    private javax.swing.JTextField cajaFechaInicio;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaPrecio;
    private javax.swing.JTextField cajaaCuenta;
    private javax.swing.JTextField cajafechaRecojo;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaCliente;
    // End of variables declaration//GEN-END:variables
}
