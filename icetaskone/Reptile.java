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
public class Reptile extends Animal{
    private double bloodTemp;

    public double getBloodTemp() {
        return bloodTemp;
    }
    public Reptile(double blood_Temp){
        bloodTemp = blood_Temp;
    }
    @Override
    public String Output()
    {
        return ("Animal: Reptile\n"
                + "ID TAG: " + super.getIdTag() + "\n"
                + "Species: " + super.getSpecies()+ "\n"
                + "Temperature of blood: " + bloodTemp);
    }
    @Override
    public void Input()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the ID Tag for the Reptile: ");
        super.setIdTag(input.nextInt());
        System.out.println("Enter the Species for the Reptile: ");
        super.setSpecies(input.next());
    }
}
