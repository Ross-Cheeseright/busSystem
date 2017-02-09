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
public class Bus {
    // Attributes //
    private Passanger[] passangerList = new Passanger[15];
    
    // Construct //
    public Bus()
    {
        for (int i = 0; i < passangerList.length; i++)
        {
            passangerList[i] = null;
        }
    }
    
    // Methods //
    public boolean addPassanger(Passanger passangerIn) {
        for (int i = 0; i < passangerList.length; i++) 
        {
            if (passangerList[i]== null) 
            {
                passangerList[i] = passangerIn;
                return true;
            }

        }
        return false;
    }
    
    public boolean removePassanger(int numberIn) {
        for (int i = 0; i < passangerList.length; i++)
        {
            if (passangerList[i] != null)
            {
                int passangerNumber = passangerList[i].getPassanger();
                
                if (passangerNumber == numberIn)
                {
                    passangerList[i] = null;
                    return true;
                }
            }
        }
        return false;
    }
    
    public void displayPassangers()
    {
        System.out.println("----- Displaying all passangers on the bus -----");
        
        for(int i = 0; i <passangerList.length; i++)
        {
            System.out.println("----- Seat " + i + "-----");
            
            if (passangerList[i] != null)
            {
                System.out.println("Passanger number: \t" + passangerList[i].getPassanger() + "\nPassanger age: \t"+passangerList[i].getPassangerAge());
            }
            else
            {
                System.out.println("Seat is empty");
            }
        }
    }
    
    
    public int numberOfPassangers()
    {
        int totalPassangers = 0;
        for(int i = 0; i <passangerList.length; i++)
        {
            if (passangerList[i] != null)
            {
                totalPassangers ++;
            }
        }
        return totalPassangers;
    }
    
    public int busFare()
    {        
        int totalFare;
        totalFare = numberOfPassangers() * 10;
        return totalFare;
    }
    
    public void averageAge()
    {
        
        System.out.println("----- Fetching average age -----");
        
        int totalAge = 0;
        int totalPeople = 0;
        int averageAge;
        for (int i = 0; i <passangerList.length; i++)
        {
            if(passangerList[i] != null)
            {
                totalPeople ++;
                totalAge = totalAge + passangerList[i].getPassangerAge();
            }
        }
        averageAge = totalAge / totalPeople;
        System.out.println("The average age is: \t" + averageAge);
        
    }
    
    public void ageRange()
    {
        int maxAge = 0;
        int minAge = 1000;
        
        for (int i = 0; i < passangerList.length; i++)
        {
            if(passangerList[i] != null)
            {
                if(passangerList[i].getPassangerAge() > maxAge)
                {
                    maxAge = passangerList[i].getPassangerAge();
                }
                if (passangerList[i].getPassangerAge() < minAge)
                {
                    minAge = passangerList[i].getPassangerAge();
                }
            }
        }
        System.out.println("The minimum age is: \t" + minAge + "\nThe maximum age is: \t" +maxAge);
    }
    // Setters //
    
    // Getters //
}
