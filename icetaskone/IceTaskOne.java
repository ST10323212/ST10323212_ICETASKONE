/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icetaskone;

import java.util.Scanner;

/**
 *
 * @author Connor-pc
 */
public class IceTaskOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
        String selection;
        int birdColour;
        
        do          
        {
            System.out.println("Please choose one: \n"
                    + "Bird,\n"
                    + "Reptile,\n"
                    + "exit");
            selection = kb.next();
            switch (selection.toLowerCase())
            {
                case "bird":
                    do
                    {
                        System.out.println("Enter the colour of the bird with its reference number please\n"
                                + "1 for Grey\n"
                                + "2 for White\n"
                                + "3 for Black");
                        birdColour = kb.nextInt();
                    }while (birdColour < 1 || birdColour > 3);
                    Bird brd = new Bird(birdColour);
                    brd.Input();
                    System.out.println(brd.Output());
                    break;
                case "reptile":
                    System.out.println("Enter the reptiles blood temperature please did you know that reptiles are cold blooded and as such are very susceptiblwe to change in temperature: ");
                    Reptile rept = new Reptile(kb.nextDouble());
                    rept.Input();
                    System.out.println(rept.Output());
                    break;
                    
                case "exit":
                    break;
             
                    
            }
        }while(!"exit".equals(selection.toLowerCase()));
    }
    
}