/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * OutputPanel.java
 *
 * Created on 24-apr-2009, 11.33.43
 */
package org.easyway.ueditor2.southPanels;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Daniele
 */
public class OutputPanel extends javax.swing.JPanel {

    /** Creates new form OutputPanel */
    public OutputPanel() {
        initComponents();
        init();
    }

    public void init() {
        final PrintStream defOutput = System.out;
        final PrintStream defErr = System.err;
        PrintStream print1 = new PrintStream(new OutputStream() {

            StringBuffer temp = new StringBuffer(1024);

            @Override
            public void write(int b) throws IOException {
                if (enabled.isSelected()) {
                    temp.append((char) b);
                    //temp += (char) b;
                    if (b == '\n' || b == '\r') {
                        outputArea.append(temp.toString());
                        outputArea.setCaretPosition(outputArea.getText().length());
                        temp = new StringBuffer(1024);
                    }
                }
                defOutput.write(b);
            }
        });
        System.setOut(print1);

        PrintStream print2 = new PrintStream(new OutputStream() {

            StringBuffer temp = new StringBuffer(1024);

            @Override
            public void write(int b) throws IOException {
                if (enabled.isSelected()) {
                    temp.append((char) b);
                    //temp += (char) b;
                    if (b == '\n' || b == '\r') {
                        outputArea.append(temp.toString());
                        outputArea.setCaretPosition(outputArea.getText().length());
                        temp = new StringBuffer(1024);
                    }
                }
                defErr.write(b);
            }
        });
        System.setErr(print2);
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
        outputArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        enabled = new javax.swing.JCheckBox();

        outputArea.setColumns(20);
        outputArea.setRows(5);
        jScrollPane1.setViewportView(outputArea);

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("save on..");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        enabled.setSelected(true);
        enabled.setText("Enabled");
        enabled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enabledActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(enabled))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enabled)
                .addContainerGap(98, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        outputArea.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text file", "txt");
        chooser.setFileFilter(filter);
        chooser.setApproveButtonText("Save");
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            PrintStream ps = null;
            try {
                System.out.println("Saving output in: " + chooser.getSelectedFile().getAbsolutePath() + " ...");
                File file = chooser.getSelectedFile();
                if (!file.getName().endsWith(".txt")) {
                    file = new File(file.getAbsolutePath() + ".txt");
                }
                ps = new PrintStream(file);
                ps.print(outputArea.getText());
                ps.close();
                System.out.println("Output correctly saved");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(OutputPanel.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Output not saved");
            } finally {
                ps.close();
            }


        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void enabledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enabledActionPerformed
}//GEN-LAST:event_enabledActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox enabled;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea outputArea;
    // End of variables declaration//GEN-END:variables
}
