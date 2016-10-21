package digitextractor;
import java.util.*;

/**
 * This program tests the Num.java class.
 * @author Chris Hitchcock
 */
public class DigitExtractor {

    /**
     * Everything happens here
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initial Variable/Object declaration
        Scanner kb = new Scanner(System.in);
        int num; 
        String choice;
        boolean menu = true;
        
        //Prompt for the number and collect it with a scanner. Create new Num
        System.out.println("Please enter an integer.");
        num = kb.nextInt();
        Num myNum = new Num(num);
        
        //While loop for the menu
        while(menu==true)
        {
            //Menu text and getting the choice
            System.out.println("Show (W)hole number.\nShow (H)undreds place number."
                    + "\nShow (T)ens place number.\nShow (O)nes place number."
                    + "\n(Q)uit.\nEnter your choice: ");
            choice = kb.next();
            
            //<editor-fold defaultstate="collapsed" desc="Switch for Choices">
            switch(choice)
            {
                default:System.out.println("Please enter a valid selection.");break;
                case "W":System.out.println(myNum.viewWhole());break;
                case "H":System.out.println(myNum.Hundreds());break;
                case "T":System.out.println(myNum.Tens());break;
                case "O":System.out.println(myNum.Ones());break;
                case "Q":menu=false;break;
            }
            //</editor-fold>
        }
    }
    
}
