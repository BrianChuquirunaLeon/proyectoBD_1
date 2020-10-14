package vista;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;

public class BuscarPorIdVenta extends javax.swing.JFrame {

    public BuscarPorIdVenta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();
        btnBuscarVenta = new javax.swing.JButton();
        txtCampo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreVendedor = new javax.swing.JTextField();
        txtFechaVenta = new javax.swing.JTextField();
        btnMenu = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnBuscarBoleta = new javax.swing.JButton();
        txtCorrelativo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNroSerie = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnInsertarVenta = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        txtIdVendedor = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Precio", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtProductos);

        btnBuscarVenta.setText("Buscar Venta");
        btnBuscarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVentaActionPerformed(evt);
            }
        });

        txtCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCampoActionPerformed(evt);
            }
        });

        jLabel1.setText("IdVenta : ");

        jLabel2.setText("Nombre cliente:");

        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre Vendedor:");

        jLabel4.setText("Fecha Venta:");

        txtNombreVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreVendedorActionPerformed(evt);
            }
        });

        txtFechaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaVentaActionPerformed(evt);
            }
        });

        btnMenu.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        jLabel5.setText("Correlarivo :");

        btnBuscarBoleta.setText("Buscar Boleta");
        btnBuscarBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarBoletaActionPerformed(evt);
            }
        });

        jLabel6.setText("Numero de serie: ");

        jLabel7.setText("Total :");

        txtTotal.setEditable(false);

        btnInsertarVenta.setText("Insertar Venta");
        btnInsertarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarVentaActionPerformed(evt);
            }
        });

        jLabel8.setText("IdCliente : ");

        jLabel9.setText("IdVendedor :");

        jButton2.setText("Limpiar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel1))
                                        .addGap(43, 43, 43))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCorrelativo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnBuscarBoleta)
                        .addComponent(btnBuscarVenta)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtIdVendedor)
                                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInsertarVenta)
                        .addGap(53, 53, 53)))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(btnMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarBoleta)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtNroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(btnBuscarVenta)
                        .addGap(15, 15, 15)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInsertarVenta)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtIdVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorrelativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenu))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVentaActionPerformed

        String campo = txtCampo.getText();
        String where = "";

        //Solo debemos hacer la consulta si existe un ID ingresado, sino no tiene sentido buscar
        if (!"".equals(campo)) {
            where = " WHERE codigo = " + campo;
        }

        try {
            DefaultTableModel modelo = new DefaultTableModel();
            jtProductos.setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;

            PreparedStatement ps_sq = null;
            ResultSet rs_sq = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();

            String sq = "SELECT V.nombre ,C.nombre,B.fecha_venta \n"
                    + "FROM vendedor V,cliente C, venta B, producto P, contiene A \n"
                    + "WHERE B.id_venta = " + campo + " AND B.id_vendedor = V.id_vendedor AND C.id_cliente = B.id_cliente;";

            ps_sq = con.prepareStatement(sq);
            rs_sq = ps_sq.executeQuery();// obtengo lo que hay en la base de datos y lo almaceno temporalmente en rs

            String sql = "SELECT P.nom_prod, A.precio_venta,A.cantidad \n"
                    + "FROM vendedor V,cliente C, venta B, producto P, contiene A \n"
                    + "WHERE B.id_venta = " + campo + " AND B.id_vendedor = V.id_vendedor AND C.id_cliente = B.id_cliente \n"
                    + "AND A.id_venta = B.id_venta AND A.id_producto = P.id_producto;";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();// obtengo lo que hay en la base de datos y lo almaceno temporalmente en rs

            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            modelo.addColumn("Nombre Producto");
            modelo.addColumn("Precio");
            modelo.addColumn("Cantidad");

            int[] anchos = {200, 50, 50};

            for (int x = 0; x < cantidadColumnas; x++) {
                jtProductos.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);
            }

            if (rs_sq.next()) {
                txtNombreCliente.setText(rs_sq.getString("C.nombre"));
                System.out.println("haber donde se traba");
                txtNombreVendedor.setText(rs_sq.getString("V.nombre"));
                txtFechaVenta.setText(rs_sq.getString("B.fecha_venta"));
            }
            while (rs.next()) {// verifica si hay datos en la fila y avanza al sgt registro

                Object filas[] = new Object[cantidadColumnas];// creo un arreglo del tipo object ya que el jtable trabaja con este tipo de dato
                //y aca almacenare los datos que extraiga de la base de datos
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);// guardo una columna de un registro traido de la base de datos en filas
                    // esta sentencia se ejecutara la cantidad de veces necesaria para que filas[] obtenga todos los datos traidos de un registro
                }
                modelo.addRow(filas);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_btnBuscarVentaActionPerformed

    private void txtCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCampoActionPerformed

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void txtNombreVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreVendedorActionPerformed

    private void txtFechaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaVentaActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnBuscarBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarBoletaActionPerformed
        String nro_serie = txtNroSerie.getText();
        String correlativo = txtCorrelativo.getText();

        try {
            DefaultTableModel modelo = new DefaultTableModel();
            jtProductos.setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;

            PreparedStatement ps_sq = null;
            ResultSet rs_sq = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();

            String sq = "SELECT V.nombre ,C.nombre,B.fecha_venta ,B.id_venta\n"
                    + "FROM vendedor V,cliente C, venta B, producto P, contiene A,boleta S \n"
                    + "WHERE S.nro_serie= '" + nro_serie + "' AND S.correlativo = " + correlativo + " AND "
                    + "B.id_venta = S.id_venta AND B.id_vendedor = V.id_vendedor AND C.id_cliente = B.id_cliente;";

            ps_sq = con.prepareStatement(sq);
            rs_sq = ps_sq.executeQuery();// obtengo lo que hay en la base de datos y lo almaceno temporalmente en rs

            String sql = "SELECT P.nom_prod,A.precio_venta,A.cantidad \n"
                    + "FROM vendedor V,cliente C, venta B, producto P, contiene A, boleta S\n"
                    + "WHERE S.nro_serie= '" + nro_serie + "' AND S.correlativo = " + correlativo + " AND \n"
                    + "B.id_venta = S.id_venta AND B.id_vendedor = V.id_vendedor AND C.id_cliente = B.id_cliente \n"
                    + "AND A.id_venta = B.id_venta AND A.id_producto = P.id_producto";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();// obtengo lo que hay en la base de datos y lo almaceno temporalmente en rs

            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            modelo.addColumn("Nombre Producto");
            modelo.addColumn("Precio");
            modelo.addColumn("Cantidad");

            int[] anchos = {200, 50, 50};

            for (int x = 0; x < cantidadColumnas; x++) {
                jtProductos.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);
            }

            if (rs_sq.next()) {
                txtNombreCliente.setText(rs_sq.getString("C.nombre"));
                txtNombreVendedor.setText(rs_sq.getString("V.nombre"));
                txtFechaVenta.setText(rs_sq.getString("B.fecha_venta"));
                txtCampo.setText(rs_sq.getString("B.id_venta"));
            }
            float suma = 0;
            while (rs.next()) {// verifica si hay datos en la fila y avanza al sgt registro

                Object filas[] = new Object[cantidadColumnas];// creo un arreglo del tipo object ya que el jtable trabaja con este tipo de dato
                //y aca almacenare los datos que extraiga de la base de datos
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);// guardo una columna de un registro traido de la base de datos en filas
                    // esta sentencia se ejecutara la cantidad de veces necesaria para que filas[] obtenga todos los datos traidos de un registro

                }
                //el precio es float en la BD por eso le asigno un float aca
                float temp1 = (float) filas[1];
                //La cantidad es un entero en la BD por eso le asigno un int aca
                int temp2 = (int) filas[2];
                suma = suma + (temp1 * temp2);
                modelo.addRow(filas);
            }

            txtTotal.setText(String.valueOf(suma));

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnBuscarBoletaActionPerformed

    private void btnInsertarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarVentaActionPerformed
        PreparedStatement ps = null;
        PreparedStatement ps_max = null;
        ResultSet rs = null;
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();

        String sql = "INSERT INTO venta(id_vendedor,id_cliente) VALUES (?,?)";
        String maximobaby = "SELECT * FROM venta";

        String id_vendedor = txtIdVendedor.getText();
        String id_cliente = txtIdCliente.getText();

        try {

            //Insertamos una nueva tabla venta a la BD
            ps = con.prepareStatement(sql);
            ps.setString(1, id_vendedor);
            ps.setString(2, id_cliente);
            ps.execute();// ejecuta el codigo sql guardado en ps y no devuelve ningun valor

            /*obtenemos el id_venta para asociarlos a los productos  de esta venta*/
            ps_max = con.prepareStatement(maximobaby);
            rs = ps_max.executeQuery();// ejecuta el codigo sql guardado en ps y guarda el valor en rs
            rs.last();//Mueve el cursor hacia la ultima fila del registro
            String maxIdVenta;//Aca pondremos el id de la venta que acabamos de ingresar
            //System.out.println("Este es el rs: " + rs.getString("venta.id_vendedor"));
            maxIdVenta = new String(rs.getString("venta.id_venta"));
            //maxIdVenta = ;
            System.out.println("maximo id de venta : "+maxIdVenta);
            IngrresarDetalleVenta detalle = new IngrresarDetalleVenta(maxIdVenta);
            detalle.setVisible(true);
            this.dispose();

        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }

    }//GEN-LAST:event_btnInsertarVentaActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarBoleta;
    private javax.swing.JButton btnBuscarVenta;
    private javax.swing.JButton btnInsertarVenta;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JTable jtProductos;
    private javax.swing.JTextField txtCampo;
    private javax.swing.JTextField txtCorrelativo;
    private javax.swing.JTextField txtFechaVenta;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdVendedor;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreVendedor;
    private javax.swing.JTextField txtNroSerie;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
