/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewTileMapDialog.java
 *
 * Created on 27-apr-2009, 13.11.08
 */
package org.easyway.ueditor2.tileEditor;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import org.easyway.tiles.TileMap;

/**
 *
 * @author Daniele
 */
public class NewTileMapDialog extends javax.swing.JDialog {

    static class NumberVerifier extends InputVerifier {

        @Override
        public boolean verify(JComponent input) {
            JSpinner spinner = (JSpinner) input;
            int value = new Integer(spinner.getValue().toString());
            return value > 0;
        }
    }
    static final NumberVerifier numberVerifier = new NumberVerifier();

    NumberVerifier getNumberVerifier() {
        return numberVerifier;
    }

    /** Creates new form NewTileMapDialog */
    public NewTileMapDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        width = new javax.swing.JSpinner();
        height = new javax.swing.JSpinner();
        tileWidth = new javax.swing.JSpinner();
        tileHeight = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Name:");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Width:");

        jLabel3.setText("Height:");

        jLabel4.setText("Tile Width:");

        jLabel5.setText("Tile Height:");

        width.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(100), Integer.valueOf(1), null, Integer.valueOf(1)));
        width.setInputVerifier(numberVerifier);

        height.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(100), Integer.valueOf(1), null, Integer.valueOf(1)));
        height.setInputVerifier(numberVerifier);

        tileWidth.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(64), Integer.valueOf(1), null, Integer.valueOf(1)));
        tileWidth.setInputVerifier(numberVerifier);

        tileHeight.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(64), Integer.valueOf(1), null, Integer.valueOf(1)));
        tileHeight.setInputVerifier(numberVerifier);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tileHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tileWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(width, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(5, 5, 5)
                        .addComponent(jButton2))
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(width, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tileWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tileHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String vname;
        int vwidth, vheight;
        int vtileWidth, vtileHeight;
        int vnumberLayers;

        vname = name.getText();
        if (vname == null || vname.length() == 0) {
            JOptionPane.showMessageDialog(this, "You must specify a valid name", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (TileMap.getTileMap(vname) != null) {
            JOptionPane.showMessageDialog(this, "The map name (" + vname + ") is already in use", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        vwidth = new Integer(width.getValue().toString());
        vheight = new Integer(height.getValue().toString());
        vtileWidth = new Integer(tileWidth.getValue().toString());
        vtileHeight = new Integer(tileHeight.getValue().toString());
        //vnumberLayers = new Integer(numberOfLayers.getValue().toString());

        if (vwidth <= 0) {
            JOptionPane.showMessageDialog(this, "The width must be greater or equal to 1", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (vheight <= 0) {
            JOptionPane.showMessageDialog(this, "The height must be greater or equal to 1", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (vtileWidth <= 0) {
            JOptionPane.showMessageDialog(this, "The tile width must be greater or equal to 1", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (vtileHeight <= 0) {
            JOptionPane.showMessageDialog(this, "The tile height must be greater or equal to 1", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        

        /*if (vnumberLayers <= 0) {
            JOptionPane.showMessageDialog(this, "The number of layers must be greater or equal to 1", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }*/

        new TileMap(vwidth, vheight, vtileWidth, vtileHeight, vname, 1);

        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner height;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField name;
    private javax.swing.JSpinner tileHeight;
    private javax.swing.JSpinner tileWidth;
    private javax.swing.JSpinner width;
    // End of variables declaration//GEN-END:variables
}