/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.avbravo.jmoordbejbgenerator;

import javax.swing.event.ChangeListener;
import org.openide.WizardDescriptor;
import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;

public class JmoordbEJBGeneratorWizardPanel3 implements WizardDescriptor.Panel<WizardDescriptor> {

    /**
     * The visual component that displays this panel. If you need to access the
     * component from this class, just use getComponent().
     */
    private JmoordbEJBGeneratorVisualPanel3 component;
    String template;
    // Get the visual component for the panel. In this template, the component
    // is kept separate. This can be more efficient: if the wizard is created
    // but never displayed, or not all panels are displayed, it is better to
    // create only those which really need to be visible.

    @Override
    public JmoordbEJBGeneratorVisualPanel3 getComponent() {
        if (component == null) {
            component = new JmoordbEJBGeneratorVisualPanel3();
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

            //  if (DGlobal.getTemplate().equals("")) {
            if (template.equals("")) {
                DGlobal.advertencia(NbBundle.getMessage(JmoordbEJBGeneratorWizardPanel3.class, "Mensajes_NoTemplateDesing"));
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
        template = (String) wiz.getProperty("template");
    }

    @Override
    public void storeSettings(WizardDescriptor wiz) {
        // use wiz.putProperty to remember current panel state        
        DGlobal.setModelo(((JmoordbEJBGeneratorVisualPanel3) getComponent()).getModelo());
    }
}
