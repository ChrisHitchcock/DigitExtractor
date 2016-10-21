/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package digitextractor;

/**
 *
 * @author Chris Hitchcock
 */
public class Num {
    private int num;
    private String hun, ten, one;
    private char hunChar, tenChar, oneChar;
    
    public Num(int n)
    {
        num = n;
    }
    
    public String Hundreds()
    {
        hun = Integer.toString(num);
        hun = new StringBuilder(hun).reverse().toString();
        hunChar = hun.charAt(2);
        String output = "The hundreds place number is: "+hunChar;
        return output; 
    }
    
    public String Tens()
    {
        ten = Integer.toString(num);
        ten = new StringBuilder(ten).reverse().toString();
        tenChar = ten.charAt(1);
        String output = "The tens place number is: "+tenChar;
        return output; 
    }
    
    public String Ones()
    {
        one = Integer.toString(num);
        one = new StringBuilder(one).reverse().toString();
        oneChar = one.charAt(0);
        String output = "The ones place number is: "+oneChar;
        return output; 
    }
    
    public String viewWhole()
    {
         String output = "The whole number is: "+num;
         return output;
    }
    
}
