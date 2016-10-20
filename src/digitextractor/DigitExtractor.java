/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package digitextractor;

/**
 *
 * @author chhit5249
 */
public class DigitExtractor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Num test = new Num(1234567);
        System.out.println(test.Hundreds());
        System.out.println(test.Tens());
        System.out.println(test.Ones());
        System.out.println(test.viewWhole());
    }
    
}
