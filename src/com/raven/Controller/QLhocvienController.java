package com.raven.Controller;

import com.raven.util.XDialog;
import com.raven.form.*;
import java.awt.Panel;
import javax.swing.JPanel;

public interface QLhocvienController {
    void init(); 
     
    default void exit(){ 
        if(XDialog.confirm("Bạn muốn kết thúc?")){
            System.exit(0);
        }
    } 
    default void showJDialog(JPanel panel){ 
        panel.setVisible(true); 
    } 
    
    default void showForm_Home(Panel panel){ 
        this.showJDialog(new Form_Home()); 
    } 
    default void showLoginJDialog(){ 
        this.showJDialog(new Form_1()); 
    } 
    default void showChangePasswordJDialog(){ 
        this.showJDialog(new Form_2()); 
    } 
    default void showSalesJDialog(){ 
        this.showJDialog(new Form_3()); 
    } 
    default void showHistoryJDialog(){ 
        this.showJDialog(new Form_4()); 
    } 
}
