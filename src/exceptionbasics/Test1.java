package exceptionbasics;

import java.io.IOException;
import javax.swing.*;

public class Test1 {

    public static void main(String[] args) throws Exception {

        String num = "5";
        
        int[] a1 = {2,5};
        Customer c = new Customer();

        try {
            int x = a1[2];
            int i = Integer.parseInt(num);
            c.setState("WI");

        } catch(IllegalArgumentException e1) {
            System.out.println("Illegal Argument");
            
//        } catch(NumberFormatException e2) {
//            System.out.println("Array out of bounds");
            
        } catch(ArrayIndexOutOfBoundsException e3) {
            System.out.println("Incorrect Array Index");
        }
        //catch(IllegalArgumentException e2) {
//            System.out.println("Illegal argument.");
//        } finally {
//            System.out.println("finally block has executed");
//        }
//
//        System.out.println("Program continues here");



        


        
//        Customer c = new Customer();
//        try {
//            c.setState("WIS");
//            System.out.println("");
//
//        } catch (IllegalArgumentException e1) {
//            System.out.println(e1.getMessage());
//
//        } catch (Exception e2) {
//            System.out.println(e2.getMessage());
//        }

    }
}
