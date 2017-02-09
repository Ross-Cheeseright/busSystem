/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busprogram;

/**
 *
 * @author 2cheer65
 */
public class BusProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create new bus //
        Bus b1 = new Bus();
        
        // create new passangers //
        b1.addPassanger(new Passanger(1,20));
        b1.addPassanger(new Passanger(2,10));
        b1.addPassanger(new Passanger(3,5));
        
        b1.displayPassangers();
        
        System.out.println(b1.numberOfPassangers());
        System.out.println(b1.busFare());
        
        b1.averageAge();
        b1.ageRange();
    
    
    
    }
    
}
