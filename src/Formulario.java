
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josef
 */
public class Formulario extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    Lista L1;
    public Formulario() {
        initComponents();
        L1=new Lista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        t1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta = new javax.swing.JTextArea();
        t2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        btPrecioTotal = new javax.swing.JButton();
        btInsertaralFinal = new javax.swing.JButton();
        btInsertarPosSL = new javax.swing.JButton();
        btEliminarPosicionSL = new javax.swing.JButton();
        btEliminaPiso = new javax.swing.JButton();
        btEliminarPrimeroSL = new javax.swing.JButton();
        btnInvertirLista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("cargar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("mostrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jta.setColumns(20);
        jta.setRows(5);
        jScrollPane1.setViewportView(jta);

        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });

        jButton3.setText("precio por piso");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Cantidad Pisos");

        jButton5.setText("eliminar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel4.setText("piso");

        jLabel5.setText("codigo");

        btPrecioTotal.setText("Precio Total");
        btPrecioTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrecioTotalActionPerformed(evt);
            }
        });

        btInsertaralFinal.setText("Insertar al final");
        btInsertaralFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInsertaralFinalActionPerformed(evt);
            }
        });

        btInsertarPosSL.setText("Insertar Posicion SubLista");
        btInsertarPosSL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInsertarPosSLActionPerformed(evt);
            }
        });

        btEliminarPosicionSL.setText("Eliminar habitacion de un piso");
        btEliminarPosicionSL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarPosicionSLActionPerformed(evt);
            }
        });

        btEliminaPiso.setText("Eliminar Piso");
        btEliminaPiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminaPisoActionPerformed(evt);
            }
        });

        btEliminarPrimeroSL.setText("Eliminar primero SL");
        btEliminarPrimeroSL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarPrimeroSLActionPerformed(evt);
            }
        });

        btnInvertirLista.setText("Invertir Lista");
        btnInvertirLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvertirListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btInsertarPosSL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btEliminarPosicionSL)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btEliminaPiso)
                        .addGap(79, 79, 79)
                        .addComponent(btEliminarPrimeroSL)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btPrecioTotal)
                                .addGap(18, 18, 18)
                                .addComponent(btInsertaralFinal)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(t6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnInvertirLista)
                        .addGap(106, 106, 106))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(5, 5, 5)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jButton2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnInvertirLista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEliminaPiso)
                    .addComponent(btEliminarPrimeroSL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btPrecioTotal)
                            .addComponent(btInsertaralFinal))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInsertarPosSL)
                    .addComponent(btEliminarPosicionSL))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void cargarSubLista(SubLista LL1)
    {
        
        int n=Integer.parseInt(JOptionPane.showInputDialog("Numero de habitaciones: "));
        for(int i=0;i<n;i++)
        {
            int x=Integer.parseInt(JOptionPane.showInputDialog("Codigo"));
            int y=Integer.parseInt(JOptionPane.showInputDialog("Precio"));
            LL1.insertarUltimo(x, y);
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // TODO add your handling code here:
        int n=Integer.parseInt(t1.getText());
        SubLista LL1;
        for(int i=0;i<n;i++)
        {
            LL1=new SubLista();
            cargarSubLista(LL1);
            L1.insertarUltimo(LL1);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    void mostrarSubLista(SubLista LL1)
    {
        SubNodo q=LL1.Primero();
        int j=1;
        while(q!=null)
        {
            jta.append("Hab " + j +":  Codigo:" + q.getCodigo() + " Precio " + q.getPrecio()+"\n");
            q=q.getSubProx();
            j++;
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        // TODO add your handling code here:
        SubLista LL1;
        Nodo p=L1.Primero();
        int i=1;
        while(p!=null)
        {
            LL1=new SubLista();
            
            jta.append("PISO "+String.valueOf(i)+"\n");
            LL1=L1.getSubLista(i);
            mostrarSubLista(LL1);
            jta.append("\n");
            p=p.getProx();
            i++;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        // TODO add your handling code here:
        int n=Integer.parseInt(t2.getText());
        int x=L1.precioPorPiso(n);
        jta.append("\n"+"PRECIO POR PISO "+String.valueOf(n)+"ES: "+String.valueOf(x)+"\n");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed


    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int piso=Integer.parseInt(t5.getText());
        int codigo=Integer.parseInt(t6.getText());
        SubLista LL1=new SubLista();
        LL1=L1.getSubLista(piso);
        int x=LL1.retornarPos(codigo);
        LL1.eliminarPosicion(x);
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btPrecioTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrecioTotalActionPerformed
     
        // TODO add your handling code here:
        int s=L1.precioTotal();
        jta.append("\n" +"Precio Total es:"+ String.valueOf(s));  //jtat.append() muestra en el recuadro
    }//GEN-LAST:event_btPrecioTotalActionPerformed

    private void btInsertaralFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInsertaralFinalActionPerformed
        // TODO add your handling code here:
            int x=Integer.parseInt(JOptionPane.showInputDialog("Posicion"));
            int y=Integer.parseInt(JOptionPane.showInputDialog("Codigo"));
            int z=Integer.parseInt(JOptionPane.showInputDialog("Precio"));
            L1.insertarAlFinalSL(x,y,z);
    }//GEN-LAST:event_btInsertaralFinalActionPerformed

    private void btInsertarPosSLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInsertarPosSLActionPerformed
        // TODO add your handling code here:
             int x=Integer.parseInt(JOptionPane.showInputDialog("Piso"));
             int x2=Integer.parseInt(JOptionPane.showInputDialog("Posicion Habitacion"));
             int y=Integer.parseInt(JOptionPane.showInputDialog("Codigo"));
             int z=Integer.parseInt(JOptionPane.showInputDialog("Precio"));
             L1.insertarPosicionSublista(x,y,z,x2);
    }//GEN-LAST:event_btInsertarPosSLActionPerformed

    private void btEliminarPosicionSLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarPosicionSLActionPerformed
        // TODO add your handling code here:
           int x=Integer.parseInt(JOptionPane.showInputDialog("Piso"));
           int x2=Integer.parseInt(JOptionPane.showInputDialog("Posicion Habitacion"));
           L1.eliminarPosicionSublista(x,x2);
    }//GEN-LAST:event_btEliminarPosicionSLActionPerformed

    private void btEliminaPisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminaPisoActionPerformed
        // TODO add your handling code here:
        int x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el piso a eliminar"));
        L1.eliminarPiso(x);
    }//GEN-LAST:event_btEliminaPisoActionPerformed

    private void btEliminarPrimeroSLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarPrimeroSLActionPerformed
        // TODO add your handling code here:
        int x=Integer.parseInt(JOptionPane.showInputDialog("Piso"));
       
        L1.eliminarPrimeroSL(x);
        
    }//GEN-LAST:event_btEliminarPrimeroSLActionPerformed

    private void btnInvertirListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvertirListaActionPerformed
        // TODO add your handling code here:
        L1.invertirLista();
    }//GEN-LAST:event_btnInvertirListaActionPerformed
  
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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEliminaPiso;
    private javax.swing.JButton btEliminarPosicionSL;
    private javax.swing.JButton btEliminarPrimeroSL;
    private javax.swing.JButton btInsertarPosSL;
    private javax.swing.JButton btInsertaralFinal;
    private javax.swing.JButton btPrecioTotal;
    private javax.swing.JButton btnInvertirLista;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jta;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    // End of variables declaration//GEN-END:variables
}