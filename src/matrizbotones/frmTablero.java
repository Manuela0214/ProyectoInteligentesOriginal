package matrizbotones;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Manuela Arcila
 * @author Angie Camelo
 * 
 * Proyecto 1. Sistemas Inteligentes
 */

public class frmTablero extends javax.swing.JFrame {

    int DimensionX = 0;
    int DimensionY = 0;
    int TamX = 0;
    int TamY = 0;
    int posXInicial;
    int posYInicial;
    int posXFinal;
    int posYFinal;
    static final int TableroX = 500;
    static final int TableroY = 500;
    JButton[][] MatrizBotones;
    char[][] MatrizCaracteres;

    /**
     * Creates new form frmTablero
     */
    public frmTablero() {
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

        pnlMenu = new javax.swing.JPanel();
        lblDimX = new javax.swing.JLabel();
        tbxDimX = new javax.swing.JTextField();
        lblDimY = new javax.swing.JLabel();
        tbxDimY = new javax.swing.JTextField();
        btnReiniciar = new javax.swing.JButton();
        btnGenerar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        pnlTablero = new javax.swing.JPanel();
        btnFinal = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Matríz Dinamica");
        setName("frmTablero"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(500, 500));

        lblDimX.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblDimX.setText("# Filas");

        tbxDimX.setPreferredSize(new java.awt.Dimension(50, 24));

        lblDimY.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblDimY.setText("# Columnas");

        tbxDimY.setPreferredSize(new java.awt.Dimension(50, 24));
        tbxDimY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbxDimYActionPerformed(evt);
            }
        });

        btnReiniciar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnReiniciar.setText("Reiniciar");
        btnReiniciar.setToolTipText("");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        btnGenerar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addComponent(lblDimX)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tbxDimX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDimY)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tbxDimY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnGenerar)
                .addGap(18, 18, 18)
                .addComponent(btnReiniciar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDimX)
                        .addComponent(tbxDimX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDimY)
                        .addComponent(tbxDimY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGenerar)
                        .addComponent(btnReiniciar))))
        );

        pnlTablero.setBackground(new java.awt.Color(204, 204, 204));
        pnlTablero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlTablero.setToolTipText("");

        javax.swing.GroupLayout pnlTableroLayout = new javax.swing.GroupLayout(pnlTablero);
        pnlTablero.setLayout(pnlTableroLayout);
        pnlTableroLayout.setHorizontalGroup(
            pnlTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        pnlTableroLayout.setVerticalGroup(
            pnlTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        btnFinal.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnFinal.setText("Marcar final");

        jButton4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton4.setText("Búsqueda anchura");

        jButton5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton5.setText("Búsqueda profundidad");

        jButton6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton6.setText("Generar heurística");

        btnInicio.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnInicio.setText("Marcar Inicio");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlTablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFinal)
                            .addComponent(jButton4)
                            .addComponent(jButton5)
                            .addComponent(jButton6)
                            .addComponent(btnInicio))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInicio)
                        .addGap(18, 18, 18)
                        .addComponent(btnFinal)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbxDimYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbxDimYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbxDimYActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        //Se verifica que las entradas sean validas
        if (ValidarDimensiones()) {
            MatrizBotones = new JButton[DimensionX][DimensionY];
            MatrizCaracteres = new char[DimensionX][DimensionY];
            pnlTablero.setLayout(new GridLayout(DimensionX, DimensionY));
            ObtenerTamanioObjetos(DimensionX, DimensionY);
            //int contador=0;
            for (int i = 0; i < DimensionX; i++) {
                for (int j = 0; j < DimensionY; j++) {

                    JButton cuadrito = new JButton();
                    cuadrito.setSize(TamX, TamY);
                    cuadrito.setBackground(Color.white);
                    //cuadrito.setName(Integer.toString(contador));
                    //contador++;
                    //cuadrito.setToolTipText(Integer.toString(i) + "," + Integer.toString(j));
                    //cuadro = new Cuadro(i, j, cuadrito, '0');
                    MatrizBotones[i][j] = cuadrito;
                    MatrizCaracteres[i][j] = '0';
                    MatrizBotones[i][j].addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
//                            if(e.getActionCommand()==btnGenerar.){
//                                
//                            }
                            //CrearPared(cuadrito);
                        }
                    });

                    pnlTablero.add(MatrizBotones[i][j]);

                    //listaCuadritos.add(cuadro);
                    RedibujarTablero();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Las Dimensiones a ingresar deben ser númericas y en un rango de entre 1 y 50");
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    /**
     * Metodo que redibuja el elemto pnlTablero
     */
    private void RedibujarTablero() {
        pnlTablero.validate();
        pnlTablero.repaint();
    }

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        if (HayElementos()) {
            for (int x = 0; x < DimensionX; x++) {
                for (int y = 0; y < DimensionY; y++) {
                    MatrizBotones[x][y] = null;
                }
            }
            pnlTablero.removeAll();
            RedibujarTablero();
        }

    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
//        for (int i = 0; i < DimensionX; i++) {
//            for (int j = 0; j < DimensionY; j++) {
//                MatrizBotones[i][j].addActionListener(new ActionListener() {
//                    public void actionPerformed(ActionEvent e) {
//                        MatrizBotones[i][i]=0;
//                    }
//                });
//
//                pnlTablero.add(MatrizBotones[i][j]);
//                RedibujarTablero();
//            }
//        }
    }//GEN-LAST:event_btnInicioActionPerformed

    /**
     * Función que verifica si hay elementos creados en el pnlTablero
     */
    private boolean HayElementos() {
        return pnlTablero.getComponentCount() > 0;
    }

    /**
     * Metodo personalizado que sirve para manejar el evento CrearPared de cada
     * uno de los botones de la matriz
     */
    private void CrearPared(JButton btn) {
        btn.setBackground(Color.black);
    }

    public void setInicio(JButton btn) {
        btn.setBackground(Color.green);
    }

    public void setFin(JButton btn) {
        btn.setBackground(Color.red);
    }

    /**
     * Función que verifica si el valor String es de tipo númerico
     */
    boolean esNumerico(String valorString) {
        try {
            Integer.parseInt(valorString);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }

    /**
     * Función que valida que las dimensiones ingresadas por el usuario sean
     * validas y entre los rangos de 1 a 100
     */
    private boolean ValidarDimensiones() {
        boolean valido = false;
        if (esNumerico(tbxDimX.getText())) {
            if (esNumerico(tbxDimY.getText())) {
                DimensionX = Integer.parseInt(tbxDimX.getText());
                DimensionY = Integer.parseInt(tbxDimY.getText());
                if (((DimensionX < 51) && (DimensionY < 51)) && ((DimensionX > 0) && (DimensionY > 0))) {
                    return true;
                }
            }
        }
        return valido;
    }

    /**
     * Metodo que calcula el tamaño de ancho y alto de los botones acorde a la
     * cantidad de elementos en la matriz
     */
    private void ObtenerTamanioObjetos(int cantX, int cantY) {
        TamX = TableroX / cantX;
        TamY = TableroY / cantY;
    }

    public void getMatrizCaracteres() {
        for (int i = 0; i < DimensionX; i++) {
            for (int j = 0; j < DimensionY; j++) {
                if(MatrizBotones[i][j].getBackground().equals(Color.black)){
                    MatrizCaracteres[i][j]='1';
                }
            }
        }
    }
    
    private void crearNodo(){
        Nodo nodo;
        Map<Nodo, List<Nodo>> nodos = new HashMap<>();
        List<Nodo> hijos = new ArrayList<>();
        for (int i = 0; i < DimensionX; i++) {
            for (int j = 0; j < DimensionY; j++) {
                if(MatrizBotones[i][j].getBackground().equals(Color.green)){
                    //nodo = new Nodo((char)i, null);
                    //hijos.add(MatrizCaracteres[i][j]);
                }
            }
        }
    }

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
            java.util.logging.Logger.getLogger(frmTablero.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTablero.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTablero.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTablero.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinal;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDimX;
    private javax.swing.JLabel lblDimY;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlTablero;
    private javax.swing.JTextField tbxDimX;
    private javax.swing.JTextField tbxDimY;
    // End of variables declaration//GEN-END:variables
}
