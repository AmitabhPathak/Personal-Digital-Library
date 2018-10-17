/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectlibrary;

/**
 *
 * @author wowya
 */
public class Projectlibrary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frame1 f1=new frame1();
                f1.setSize(1300,800);
                        f1.setVisible(true);
            }
        });
        // TODO code application logic here
    }
    
}
