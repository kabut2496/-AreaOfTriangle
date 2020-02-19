/*
 *Karl Butler
 *2/18/2020
 * AreaOfTriangle
 * used to find the area of a triange when you only have the side lengths of the triangle
 */
package areaoftriangle;
import javax.swing.*;
/**
 *
 * @author Karl Butler
 */
public class AreaOfTriangle {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        //variables
        
        String gSideA,gSideB,gSideC;
        /**
         * the variables above are used to retrieve the user inputs because a JOptionPain can 
         * only retrieve string variable  types.
        */
        double sideA, sideB, sideC,area,s;
        /**
         * the above variables are used to do all the calculation while keeping a exact number.
         */
       
        //user input
       gSideA = JOptionPane.showInputDialog("Please enter the length of the first side");
       sideA = Double.parseDouble(gSideA );
       
       gSideB = JOptionPane.showInputDialog("Please enter the length of the second side");
       sideB = Double.parseDouble(gSideB );
       
       gSideC = JOptionPane.showInputDialog("Please enter the length of the third side");
       sideC = Double.parseDouble(gSideC );
       
       //Math
       
       s = (sideA + sideB + sideC )/2;
       System.out.println("the semi perimiter of the triangel is "+s);
       
       area = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
        System.out.println("the area of the triange is " +area);
        
    }
    
}
