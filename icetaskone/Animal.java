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
public class Animal {
    private int IdTag;

    public int getIdTag() {
        return IdTag;
    }

    public void setIdTag(int IdTag) {
        this.IdTag = IdTag;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    private String species;
    public String Output(){
        return ("Animal: \n"
                + "ID TAG: " + IdTag + "\n"
                + "Species: " + species);
    }
    public void Input()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ID Tag: ");
        input.nextInt();
        System.out.println("Enter the Species: ");
        input.next();
    }
}
    

