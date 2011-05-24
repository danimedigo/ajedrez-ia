/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * principal.java
 *
 * Created on 23/05/2011, 09:32:39 PM
 */
package gui;

import java.awt.Color;

/**
 *
 * @author Rodrigo
 */
public class principal extends javax.swing.JFrame {

    private pieza[][] tGui = new pieza[8][8];
    private int tLogico[][];

    /** Creates new form principal */
    public principal() {
        initComponents();
        makeTablero();
    }

    private void makeTablero() {

        for (int j = 0; j < 8; j++) {
            for (int i = 0; i < 8; i++) {
                pieza temp = new pieza();
                temp.setXpos(i * 25);
                temp.setYpos(j * 25);
                if ((i + j) % 2 == 0) {
                    temp.setColor(Color.BLACK);
                } else {
                    temp.setColor(Color.WHITE);
                }
                temp.setValues();
                tGui[j][i] = temp;
                this.add(tGui[j][i]);
            }
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_tablero = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ajedrez");

        pnl_tablero.setBorder(javax.swing.BorderFactory.createTitledBorder("Tablero"));
        pnl_tablero.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout pnl_tableroLayout = new javax.swing.GroupLayout(pnl_tablero);
        pnl_tablero.setLayout(pnl_tableroLayout);
        pnl_tableroLayout.setHorizontalGroup(
            pnl_tableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );
        pnl_tableroLayout.setVerticalGroup(
            pnl_tableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_tablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(281, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(pnl_tablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnl_tablero;
    // End of variables declaration//GEN-END:variables
}