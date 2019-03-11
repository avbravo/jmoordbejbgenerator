/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.avbravo.jmoordbejbgenerator;

import javax.swing.event.ChangeListener;
import org.openide.WizardDescriptor;
import org.openide.util.HelpCtx;

public class JmoordbEJBGeneratorWizardPanel4 implements WizardDescriptor.Panel<WizardDescriptor> {

    /**
     * The visual component that displays this panel. If you need to access the
     * component from this class, just use getComponent().
     */
    private JmoordbEJBGeneratorVisualPanel4 component;

    // Get the visual component for the panel. In this template, the component
    // is kept separate. This can be more efficient: if the wizard is created
    // but never displayed, or not all panels are displayed, it is better to
    // create only those which really need to be visible.
    @Override
    public JmoordbEJBGeneratorVisualPanel4 getComponent() {
        if (component == null) {
            component = new JmoordbEJBGeneratorVisualPanel4();
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
        String rowsDataTable = (String) wiz.getProperty("rowsDataTable");
        ((JmoordbEJBGeneratorVisualPanel4) getComponent()).getjSpinnerRowsDataTable().setValue(Integer.parseInt(rowsDataTable));
        String typeRelationsDataTable = (String) wiz.getProperty("typeRelationsDataTable");
        ((JmoordbEJBGeneratorVisualPanel4) getComponent()).getjComboBoxDataTable().setSelectedItem(typeRelationsDataTable);
        String tableScrollable = (String) wiz.getProperty("tableScrollable");
        ((JmoordbEJBGeneratorVisualPanel4) getComponent()).getjCheckBoxTableScrollable().setSelected(tableScrollable.equals("true") ? true : false);
        String dialogWidth = (String) wiz.getProperty("dialogWidth");
        ((JmoordbEJBGeneratorVisualPanel4) getComponent()).getjSpinnerDialogWidth().setValue(Integer.parseInt(dialogWidth));
        String dialogWidthRelation = (String) wiz.getProperty("dialogWidthRelation");
        ((JmoordbEJBGeneratorVisualPanel4) getComponent()).getjSpinnerDialogWidthRelation().setValue(Integer.parseInt(dialogWidthRelation));
        String dialogDinamyc = (String) wiz.getProperty("dialogDinamyc");
        ((JmoordbEJBGeneratorVisualPanel4) getComponent()).getjCheckBoxDialogDinamyc().setSelected(dialogDinamyc.equals("true") ? true : false);
        String dialogCustomized = (String) wiz.getProperty("dialogCustomized");
        ((JmoordbEJBGeneratorVisualPanel4) getComponent()).getjCheckBoxDialogCustomized().setSelected(dialogCustomized.equals("true") ? true : false);
        String dialogHeight = (String) wiz.getProperty("dialogHeight");
        ((JmoordbEJBGeneratorVisualPanel4) getComponent()).getjSpinnerDialogHeigth().setValue(Integer.parseInt(dialogHeight));
        ((JmoordbEJBGeneratorVisualPanel4) getComponent()).getjSpinnerDialogHeigth().setEnabled(dialogCustomized.equals("true") ? true : false);


    }

    @Override
    public void storeSettings(WizardDescriptor wiz) {
        // use wiz.putProperty to remember current panel state
        ((WizardDescriptor) wiz).putProperty("rowsDataTable", ((JmoordbEJBGeneratorVisualPanel4) getComponent()).getjSpinnerRowsDataTable().getValue());
        ((WizardDescriptor) wiz).putProperty("typeRelationsDataTable", ((JmoordbEJBGeneratorVisualPanel4) getComponent()).getjComboBoxDataTable().getSelectedItem().toString());
        ((WizardDescriptor) wiz).putProperty("tableScrollable", ((JmoordbEJBGeneratorVisualPanel4) getComponent()).getjCheckBoxTableScrollable().isSelected());
        ((WizardDescriptor) wiz).putProperty("dialogWidth", ((JmoordbEJBGeneratorVisualPanel4) getComponent()).getjSpinnerDialogWidth().getValue());
         ((WizardDescriptor) wiz).putProperty("dialogWidthRelation", ((JmoordbEJBGeneratorVisualPanel4) getComponent()).getjSpinnerDialogWidthRelation().getValue());
         ((WizardDescriptor) wiz).putProperty("dialogDinamyc", ((JmoordbEJBGeneratorVisualPanel4) getComponent()).getjCheckBoxDialogDinamyc().isSelected());
         ((WizardDescriptor) wiz).putProperty("dialogCustomized", ((JmoordbEJBGeneratorVisualPanel4) getComponent()).getjCheckBoxDialogCustomized().isSelected());
        ((WizardDescriptor) wiz).putProperty("dialogHeight", ((JmoordbEJBGeneratorVisualPanel4) getComponent()).getjSpinnerDialogHeigth().getValue());
      
    }
}
