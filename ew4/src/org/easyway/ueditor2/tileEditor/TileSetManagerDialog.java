/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TileSetManagerDialog.java
 *
 * Created on 27-apr-2009, 15.39.46
 */
package org.easyway.ueditor2.tileEditor;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.easyway.ueditor2.EditorCore;
import org.easyway.tiles.TileSet;

/**
 *
 * @author Daniele
 */
public class TileSetManagerDialog extends javax.swing.JDialog {

    DefaultListModel listModel = new DefaultListModel();
    TileSet selectedTileSet = null;

    /** Creates new form TileSetManagerDialog */
    public TileSetManagerDialog(java.awt.Frame parent, boolean modal, boolean selectTileSet) {
        super(parent, modal);
        initComponents();

        selectButton.setVisible(selectTileSet);

        tileSetList.setModel(listModel);
        init();

    }

    public TileSet getSelectedTileSet() {
        return selectedTileSet;
    }

    protected void init() {
        ArrayList<TileSet> list = TileSet.getAllTileSet();
        listModel.clear();
        for (TileSet ts : list) {
            if (!listModel.contains(ts)) {
                listModel.addElement(ts);
            }
        }
        tileSetList.repaint();
    }

    protected void edit(TileSet tileSet) {
        if (selectedTileSet == null) {
            return;
        }
        final TileManagerDialog dialog = new TileManagerDialog(EditorCore.getMainFrame(), true, selectedTileSet);
        dialog.setVisible(true);
        //dialog
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tileSetList = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        selectButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("TileSet Manager Dialog");

        tileSetList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tileSetList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tileSetListMouseClicked(evt);
            }
        });
        tileSetList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                tileSetListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(tileSetList);

        jLabel1.setText("TileSet List:");

        jButton1.setText("New");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Load");

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Manage Tiles");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Close");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        selectButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        selectButton.setText("Ok");
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                    .addComponent(selectButton, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)))))
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 271, Short.MAX_VALUE)
                        .addComponent(selectButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tileSetListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_tileSetListValueChanged
        selectedTileSet = (TileSet) tileSetList.getSelectedValue();
    }//GEN-LAST:event_tileSetListValueChanged

    private void tileSetListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tileSetListMouseClicked
        if (evt.getClickCount() < 2) {
            return;
        }
        selectedTileSet = (TileSet) tileSetList.getSelectedValue();
        edit(selectedTileSet);
    }//GEN-LAST:event_tileSetListMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        selectedTileSet = (TileSet) tileSetList.getSelectedValue();
        if (selectedTileSet == null) {
            return;
        }
        edit(selectedTileSet);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        selectedTileSet = (TileSet) tileSetList.getSelectedValue();
        if (selectedTileSet == null) {
            return;
        }
        selectedTileSet.destroy();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String out = JOptionPane.showInputDialog(EditorCore.getMainFrame(), "TileSet Name", "Select a TileSet Name", JOptionPane.QUESTION_MESSAGE);
        if (out.length() == 0) {
            JOptionPane.showMessageDialog(EditorCore.getMainFrame(), "you must use a valid name", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        for (TileSet ts : TileSet.getAllTileSet()) {
            if (ts.getName().equals(out)) {
                JOptionPane.showMessageDialog(EditorCore.getMainFrame(), "you've selected an already used TileSet name", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        new TileSet(out);
        init();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        selectedTileSet = null;
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
        if (selectedTileSet != null) {
            dispose();
        }
    }//GEN-LAST:event_selectButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton selectButton;
    private javax.swing.JList tileSetList;
    // End of variables declaration//GEN-END:variables
}