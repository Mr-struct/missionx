/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * OpenGLArea.java
 *
 * Created on 3-apr-2009, 13.03.35
 */

package org.easyway.ueditor2.system;

/**
 *
 * @author Daniele
 */
public class OpenGLArea extends javax.swing.JPanel {

    /** Creates new form OpenGLArea */
    public OpenGLArea() {
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

        canvas1 = new java.awt.Canvas();

        setLayout(new java.awt.GridLayout(1, 1));
        add(canvas1);
    }// </editor-fold>//GEN-END:initComponents


    public java.awt.Canvas getCanvas() {
        return canvas1;
    }

    public void gainFocus() {
        canvas1.requestFocusInWindow();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    // End of variables declaration//GEN-END:variables

}
