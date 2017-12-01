/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleepin;

/**
 *
 * @author mitya
 */
public class SleepIn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(sleepin(true, true));
     
    }
    
    public static boolean sleepin(boolean weekday, boolean vacation) {
            return vacation || !weekday;
        }
}
