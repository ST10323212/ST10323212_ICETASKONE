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
public class Bird extends Animal{
    private int colour;
    private String[] colourS = {"grey","white","black"};

    public int getColour() {
        return colour;
    }
    public Bird(int brdCol){
        colour = brdCol;
    }
    
    @Override
    public String Output()
    {
        return ("Animal: Bird\n"
                + "ID TAG: " + super.getIdTag() + "\n"
                + "Species: " + super.getSpecies()+ "\n"
                + "Colour of feathers: " + colourS[colour - 1]);
    }
    
    @Override
    public void Input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the ID Tag of the Bird: ");
        super.setIdTag(input.nextInt());
        System.out.println("Enter the Species of the Bird: ");
        super.setSpecies(input.next());
    }
}
