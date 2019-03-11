/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.avbravo.jmoordbjsfgenerator;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.avbravo.jmoordbjsfgenerator.generales.MySession;
import org.avbravo.jmoordbjsfgenerator.temas.Temas;
import org.avbravo.jmoordbjsfgenerator.temas.TemasController;

public final class JmoordbJSFGeneratorVisualPanel5 extends JPanel {

    /**
     * Creates new form JSFGeneratorVisualPanel5
     */
    public JmoordbJSFGeneratorVisualPanel5() {
        initComponents();
        TemasController temasController = new TemasController();
        jComboBoxTheme.removeAllItems();
        for (Temas t : temasController.getListTemas()) {
            jComboBoxTheme.addItem(t.getTema().trim());
        }
    }

    @Override
    public String getName() {
        return "Primefaces";
    }

    public JCheckBox getjCheckBoxGenerateGrowlnPage() {
        return jCheckBoxGenerateGrowlnPage;
    }

    public void setjCheckBoxGenerateGrowlnPage(JCheckBox jCheckBoxGenerateGrowlnPage) {
        this.jCheckBoxGenerateGrowlnPage = jCheckBoxGenerateGrowlnPage;
    }

    public JCheckBox getjCheckBoxGenerateGrowlnTemplate() {
        return jCheckBoxGenerateGrowlnTemplate;
    }

    public void setjCheckBoxGenerateGrowlnTemplate(JCheckBox jCheckBoxGenerateGrowlnTemplate) {
        this.jCheckBoxGenerateGrowlnTemplate = jCheckBoxGenerateGrowlnTemplate;
    }

    public JCheckBox getjCheckBoxGrowSticker() {
        return jCheckBoxGrowSticker;
    }

    public void setjCheckBoxGrowSticker(JCheckBox jCheckBoxGrowSticker) {
        this.jCheckBoxGrowSticker = jCheckBoxGrowSticker;
    }

    public JCheckBox getjCheckBoxGrowl() {
        return jCheckBoxGrowl;
    }

    public void setjCheckBoxGrowl(JCheckBox jCheckBoxGrowl) {
        this.jCheckBoxGrowl = jCheckBoxGrowl;
    }

    public JCheckBox getjCheckBoxGrowlLife() {
        return jCheckBoxGrowlLife;
    }

    public void setjCheckBoxGrowlLife(JCheckBox jCheckBoxGrowlLife) {
        this.jCheckBoxGrowlLife = jCheckBoxGrowlLife;
    }

    public JCheckBox getjCheckBoxGrowlMessages() {
        return jCheckBoxGrowlMessages;
    }

    public void setjCheckBoxGrowlMessages(JCheckBox jCheckBoxGrowlMessages) {
        this.jCheckBoxGrowlMessages = jCheckBoxGrowlMessages;
    }

    public JCheckBox getjCheckBoxMessages() {
        return jCheckBoxMessages;
    }

    public void setjCheckBoxMessages(JCheckBox jCheckBoxMessages) {
        this.jCheckBoxMessages = jCheckBoxMessages;
    }

    public JComboBox getjComboBoxButtonTextIcon() {
        return jComboBoxButtonTextIcon;
    }

    public void setjComboBoxButtonTextIcon(JComboBox jComboBoxButtonTextIcon) {
        this.jComboBoxButtonTextIcon = jComboBoxButtonTextIcon;
    }

    public JComboBox getjComboBoxEnviroment() {
        return jComboBoxEnviroment;
    }

    public void setjComboBoxEnviroment(JComboBox jComboBoxEnviroment) {
        this.jComboBoxEnviroment = jComboBoxEnviroment;
    }

    public JComboBox getjComboBoxMenu() {
        return jComboBoxMenu;
    }

    public void setjComboBoxMenu(JComboBox jComboBoxMenu) {
        this.jComboBoxMenu = jComboBoxMenu;
    }

    public JTextField getjTextFieldGrowlsSeconds() {
        return jTextFieldGrowlsSeconds;
    }

    public void setjTextFieldGrowlsSeconds(JTextField jTextFieldGrowlsSeconds) {
        this.jTextFieldGrowlsSeconds = jTextFieldGrowlsSeconds;
    }

    public JComboBox getjComboBoxTheme() {
        return jComboBoxTheme;
    }

    public void setjComboBoxTheme(JComboBox jComboBoxTheme) {
        this.jComboBoxTheme = jComboBoxTheme;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupMessages = new javax.swing.ButtonGroup();
        buttonGroupGrowlTime = new javax.swing.ButtonGroup();
        buttonGroupTemplate = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxMenu = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxButtonTextIcon = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jCheckBoxGrowl = new javax.swing.JCheckBox();
        jCheckBoxMessages = new javax.swing.JCheckBox();
        jCheckBoxGrowlMessages = new javax.swing.JCheckBox();
        jLabel26 = new javax.swing.JLabel();
        jCheckBoxGrowSticker = new javax.swing.JCheckBox();
        jCheckBoxGrowlLife = new javax.swing.JCheckBox();
        jTextFieldGrowlsSeconds = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jCheckBoxGenerateGrowlnTemplate = new javax.swing.JCheckBox();
        jCheckBoxGenerateGrowlnPage = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxTheme = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxEnviroment = new javax.swing.JComboBox();

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(JmoordbJSFGeneratorVisualPanel5.class, "JmoordbJSFGeneratorVisualPanel5.jLabel5.text")); // NOI18N

        jComboBoxMenu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MenuBar", "MegaMenu" }));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(JmoordbJSFGeneratorVisualPanel5.class, "JmoordbJSFGeneratorVisualPanel5.jLabel3.text")); // NOI18N

        jComboBoxButtonTextIcon.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Text & Icon", "Text Only", "Icon Only" }));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(JmoordbJSFGeneratorVisualPanel5.class, "JmoordbJSFGeneratorVisualPanel5.jLabel2.text")); // NOI18N

        buttonGroupMessages.add(jCheckBoxGrowl);
        jCheckBoxGrowl.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxGrowl, org.openide.util.NbBundle.getMessage(JmoordbJSFGeneratorVisualPanel5.class, "JmoordbJSFGeneratorVisualPanel5.jCheckBoxGrowl.text")); // NOI18N
        jCheckBoxGrowl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxGrowlActionPerformed(evt);
            }
        });

        buttonGroupMessages.add(jCheckBoxMessages);
        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxMessages, org.openide.util.NbBundle.getMessage(JmoordbJSFGeneratorVisualPanel5.class, "JmoordbJSFGeneratorVisualPanel5.jCheckBoxMessages.text")); // NOI18N
        jCheckBoxMessages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMessagesActionPerformed(evt);
            }
        });

        buttonGroupMessages.add(jCheckBoxGrowlMessages);
        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxGrowlMessages, org.openide.util.NbBundle.getMessage(JmoordbJSFGeneratorVisualPanel5.class, "JmoordbJSFGeneratorVisualPanel5.jCheckBoxGrowlMessages.text")); // NOI18N
        jCheckBoxGrowlMessages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxGrowlMessagesActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel26, org.openide.util.NbBundle.getMessage(JmoordbJSFGeneratorVisualPanel5.class, "JmoordbJSFGeneratorVisualPanel5.jLabel26.text")); // NOI18N

        buttonGroupGrowlTime.add(jCheckBoxGrowSticker);
        jCheckBoxGrowSticker.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxGrowSticker, org.openide.util.NbBundle.getMessage(JmoordbJSFGeneratorVisualPanel5.class, "JmoordbJSFGeneratorVisualPanel5.jCheckBoxGrowSticker.text")); // NOI18N
        jCheckBoxGrowSticker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxGrowStickerActionPerformed(evt);
            }
        });

        buttonGroupGrowlTime.add(jCheckBoxGrowlLife);
        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxGrowlLife, org.openide.util.NbBundle.getMessage(JmoordbJSFGeneratorVisualPanel5.class, "JmoordbJSFGeneratorVisualPanel5.jCheckBoxGrowlLife.text")); // NOI18N
        jCheckBoxGrowlLife.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxGrowlLifeActionPerformed(evt);
            }
        });

        jTextFieldGrowlsSeconds.setText(org.openide.util.NbBundle.getMessage(JmoordbJSFGeneratorVisualPanel5.class, "JmoordbJSFGeneratorVisualPanel5.jTextFieldGrowlsSeconds.text")); // NOI18N
        jTextFieldGrowlsSeconds.setEnabled(false);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel27, org.openide.util.NbBundle.getMessage(JmoordbJSFGeneratorVisualPanel5.class, "JmoordbJSFGeneratorVisualPanel5.jLabel27.text")); // NOI18N

        jLabel29.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel29, org.openide.util.NbBundle.getMessage(JmoordbJSFGeneratorVisualPanel5.class, "JmoordbJSFGeneratorVisualPanel5.jLabel29.text")); // NOI18N

        buttonGroupTemplate.add(jCheckBoxGenerateGrowlnTemplate);
        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxGenerateGrowlnTemplate, org.openide.util.NbBundle.getMessage(JmoordbJSFGeneratorVisualPanel5.class, "JmoordbJSFGeneratorVisualPanel5.jCheckBoxGenerateGrowlnTemplate.text")); // NOI18N

        buttonGroupTemplate.add(jCheckBoxGenerateGrowlnPage);
        jCheckBoxGenerateGrowlnPage.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(jCheckBoxGenerateGrowlnPage, org.openide.util.NbBundle.getMessage(JmoordbJSFGeneratorVisualPanel5.class, "JmoordbJSFGeneratorVisualPanel5.jCheckBoxGenerateGrowlnPage.text")); // NOI18N

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(JmoordbJSFGeneratorVisualPanel5.class, "JmoordbJSFGeneratorVisualPanel5.jLabel6.text")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jCheckBoxGrowl)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxMessages)
                        .addGap(29, 29, 29)
                        .addComponent(jCheckBoxGrowlMessages))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxTheme, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jComboBoxMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxButtonTextIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addGap(4, 4, 4)
                                        .addComponent(jCheckBoxGrowSticker))
                                    .addComponent(jLabel29))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxGenerateGrowlnPage)
                                    .addComponent(jCheckBoxGrowlLife))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldGrowlsSeconds, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel27))
                                    .addComponent(jCheckBoxGenerateGrowlnTemplate))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxTheme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxButtonTextIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCheckBoxGrowl)
                    .addComponent(jCheckBoxMessages)
                    .addComponent(jCheckBoxGrowlMessages))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jCheckBoxGrowSticker)
                    .addComponent(jCheckBoxGrowlLife)
                    .addComponent(jTextFieldGrowlsSeconds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jCheckBoxGenerateGrowlnPage)
                    .addComponent(jCheckBoxGenerateGrowlnTemplate)))
        );

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel8, org.openide.util.NbBundle.getMessage(JmoordbJSFGeneratorVisualPanel5.class, "JmoordbJSFGeneratorVisualPanel5.jLabel8.text")); // NOI18N

        jComboBoxEnviroment.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Production", "Development", "SystemTest", "UnitTest" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxEnviroment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxEnviroment, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxGrowlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxGrowlActionPerformed
        MySession.setTipoMensajes("growl");
    }//GEN-LAST:event_jCheckBoxGrowlActionPerformed

    private void jCheckBoxMessagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMessagesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMessagesActionPerformed

    private void jCheckBoxGrowlMessagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxGrowlMessagesActionPerformed
        MySession.setTipoMensajes("growlandmessages");
    }//GEN-LAST:event_jCheckBoxGrowlMessagesActionPerformed

    private void jCheckBoxGrowStickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxGrowStickerActionPerformed

        jTextFieldGrowlsSeconds.setEnabled(Boolean.FALSE);
    }//GEN-LAST:event_jCheckBoxGrowStickerActionPerformed

    private void jCheckBoxGrowlLifeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxGrowlLifeActionPerformed
        jTextFieldGrowlsSeconds.setEnabled(Boolean.TRUE);
    }//GEN-LAST:event_jCheckBoxGrowlLifeActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupGrowlTime;
    private javax.swing.ButtonGroup buttonGroupMessages;
    private javax.swing.ButtonGroup buttonGroupTemplate;
    private javax.swing.JCheckBox jCheckBoxGenerateGrowlnPage;
    private javax.swing.JCheckBox jCheckBoxGenerateGrowlnTemplate;
    private javax.swing.JCheckBox jCheckBoxGrowSticker;
    private javax.swing.JCheckBox jCheckBoxGrowl;
    private javax.swing.JCheckBox jCheckBoxGrowlLife;
    private javax.swing.JCheckBox jCheckBoxGrowlMessages;
    private javax.swing.JCheckBox jCheckBoxMessages;
    private javax.swing.JComboBox jComboBoxButtonTextIcon;
    private javax.swing.JComboBox jComboBoxEnviroment;
    private javax.swing.JComboBox jComboBoxMenu;
    private javax.swing.JComboBox jComboBoxTheme;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldGrowlsSeconds;
    // End of variables declaration//GEN-END:variables
}
