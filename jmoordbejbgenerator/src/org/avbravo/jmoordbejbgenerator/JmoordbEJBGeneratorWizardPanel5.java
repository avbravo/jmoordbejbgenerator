/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.avbravo.jmoordbejbgenerator;

import javax.swing.event.ChangeListener;
import org.openide.WizardDescriptor;
import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;

public class JmoordbEJBGeneratorWizardPanel5 implements WizardDescriptor.Panel<WizardDescriptor> {

    /**
     * The visual component that displays this panel. If you need to access the
     * component from this class, just use getComponent().
     */
    private JmoordbEJBGeneratorVisualPanel5 component;

    // Get the visual component for the panel. In this template, the component
    // is kept separate. This can be more efficient: if the wizard is created
    // but never displayed, or not all panels are displayed, it is better to
    // create only those which really need to be visible.
    @Override
    public JmoordbEJBGeneratorVisualPanel5 getComponent() {
        if (component == null) {
            component = new JmoordbEJBGeneratorVisualPanel5();
        }
        return component;
    }

    @Override
    public HelpCtx getHelp() {
        // Show no Help button for this panel:
        return HelpCtx.DEFAULT_HELP;
        // If you have context help:
        // return new HelpCtx("help.key.here");
    }

    @Override
    public boolean isValid() {
        try {
            if (DGlobal.getTemplate().equals("")) {

                return false;
            }
        } catch (Exception e) {
        }
        // If it is always OK to press Next or Finish, then:
        return true;
        // If it depends on some condition (form filled out...) and
        // this condition changes (last form field filled in...) then
        // use ChangeSupport to implement add/removeChangeListener below.
        // WizardDescriptor.ERROR/WARNING/INFORMATION_MESSAGE will also be useful.
    }

    @Override
    public void addChangeListener(ChangeListener l) {
    }

    @Override
    public void removeChangeListener(ChangeListener l) {
    }

    @Override
    public void readSettings(WizardDescriptor wiz) {
        // use wiz.getProperty to retrieve previous panel state
        String temaPrimefaces = (String) wiz.getProperty("temaPrimefaces");
        ((JmoordbEJBGeneratorVisualPanel5) getComponent()).getjComboBoxTheme().setSelectedItem(temaPrimefaces);
        String tipoMenu = (String) wiz.getProperty("tipoMenu");
        ((JmoordbEJBGeneratorVisualPanel5) getComponent()).getjComboBoxMenu().setSelectedItem(tipoMenu);

        String buttonTextIcon = (String) wiz.getProperty("buttonTextIcon");
        ((JmoordbEJBGeneratorVisualPanel5) getComponent()).getjComboBoxButtonTextIcon().setSelectedItem(buttonTextIcon);

        String growl = (String) wiz.getProperty("growl");
        ((JmoordbEJBGeneratorVisualPanel5) getComponent()).getjCheckBoxGrowl().setSelected(growl.equals("true") ? true : false);

        String messages = (String) wiz.getProperty("messages");
        ((JmoordbEJBGeneratorVisualPanel5) getComponent()).getjCheckBoxMessages().setSelected(messages.equals("true") ? true : false);

        String growlandmessages = (String) wiz.getProperty("growlandmessages");
        ((JmoordbEJBGeneratorVisualPanel5) getComponent()).getjCheckBoxGrowlMessages().setSelected(growlandmessages.equals("true") ? true : false);
    
        String environment = (String) wiz.getProperty("environment");
        ((JmoordbEJBGeneratorVisualPanel5) getComponent()).getjComboBoxEnviroment().setSelectedItem(environment);

        String growSticker = (String) wiz.getProperty("growSticker");
        ((JmoordbEJBGeneratorVisualPanel5) getComponent()).getjCheckBoxGrowSticker().setSelected(growSticker.equals("true") ? true : false);

        String growlLife = (String) wiz.getProperty("growlLife");
        ((JmoordbEJBGeneratorVisualPanel5) getComponent()).getjCheckBoxGrowlLife().setSelected(growlLife.equals("true") ? true : false);

        String growlsSeconds = (String) wiz.getProperty("growlsSeconds");
        growlsSeconds = growlsSeconds.equals("") ? "1500" : growlsSeconds;
        ((JmoordbEJBGeneratorVisualPanel5) getComponent()).getjTextFieldGrowlsSeconds().setText(growlsSeconds);

        String generateGrowlnPage = (String) wiz.getProperty("generateGrowlnPage");
        if (generateGrowlnPage != null) {
            ((JmoordbEJBGeneratorVisualPanel5) getComponent()).getjCheckBoxGenerateGrowlnPage().setSelected(generateGrowlnPage.equals("true") ? true : false);
        }
        String generateGrowlnTemplate = (String) wiz.getProperty("generateGrowlnTemplate");
        if (generateGrowlnTemplate != null) {
            ((JmoordbEJBGeneratorVisualPanel5) getComponent()).getjCheckBoxGenerateGrowlnTemplate().setSelected(generateGrowlnTemplate.equals("true") ? true : false);

        }

    }

    @Override
    public void storeSettings(WizardDescriptor wiz) {
        // use wiz.putProperty to remember current panel state
        ((WizardDescriptor) wiz).putProperty("temaPrimefaces", ((JmoordbEJBGeneratorVisualPanel5) getComponent()).getjComboBoxTheme().getSelectedItem());
        ((WizardDescriptor) wiz).putProperty("tipoMenu", ((JmoordbEJBGeneratorVisualPanel5) getComponent()).getjComboBoxMenu().getSelectedItem());
        ((WizardDescriptor) wiz).putProperty("buttonTextIcon", ((JmoordbEJBGeneratorVisualPanel5) getComponent()).getjComboBoxButtonTextIcon().getSelectedItem());
        ((WizardDescriptor) wiz).putProperty("growl", ((JmoordbEJBGeneratorVisualPanel5) getComponent()).getjCheckBoxGrowl().isSelected());
        ((WizardDescriptor) wiz).putProperty("messages", ((JmoordbEJBGeneratorVisualPanel5) getComponent()).getjCheckBoxMessages().isSelected());
        ((WizardDescriptor) wiz).putProperty("growlandmessages", ((JmoordbEJBGeneratorVisualPanel5) getComponent()).getjCheckBoxGrowlMessages().isSelected());
        ((WizardDescriptor) wiz).putProperty("environment", ((JmoordbEJBGeneratorVisualPanel5) getComponent()).getjComboBoxEnviroment().getSelectedItem().toString());
        ((WizardDescriptor) wiz).putProperty("growSticker", ((JmoordbEJBGeneratorVisualPanel5) getComponent()).getjCheckBoxGrowSticker().isSelected());
        ((WizardDescriptor) wiz).putProperty("growlLife", ((JmoordbEJBGeneratorVisualPanel5) getComponent()).getjCheckBoxGrowlLife().isSelected());
        ((WizardDescriptor) wiz).putProperty("growlsSeconds", ((JmoordbEJBGeneratorVisualPanel5) getComponent()).getjTextFieldGrowlsSeconds().getText());
        ((WizardDescriptor) wiz).putProperty("generateGrowlnPage", ((JmoordbEJBGeneratorVisualPanel5) getComponent()).getjCheckBoxGenerateGrowlnPage().isSelected());
        ((WizardDescriptor) wiz).putProperty("generateGrowlnTemplate", ((JmoordbEJBGeneratorVisualPanel5) getComponent()).getjCheckBoxGenerateGrowlnTemplate().isSelected());
       

    }
}
