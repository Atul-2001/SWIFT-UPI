/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swift.upi;

import javax.swing.JOptionPane;
/**
 *
 * @author J.A.R.V.I.S
 */
public class SWIFTUPI {

    /**
     * @param args the command line arguments
     */
     public static void main(String args[]){
       WelcomeSplash Splash=new WelcomeSplash();
       Welcome Start=new Welcome();
       Splash.setVisible(true);
       try{
           for(int i=0;i<=100;i++){
               Thread.sleep(40);
               Splash.per.setText(Integer.toString(i)+"%");
               Splash.p1.setValue(i);
               if(i==100){
                   Splash.setVisible(false);
                   Start.setVisible(true);
               }
           }
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,"Error in opening application.");
       }
    }
    
}
