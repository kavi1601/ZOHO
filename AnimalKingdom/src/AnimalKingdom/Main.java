package AnimalKingdom;

import AnimalKingdom.*;
import java.util.Scanner;

class Main{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the Animal Kingdom Name to get characteristics and example :");
        try
        {
            String classname="AnimalKingdom.";
            String input=sc.nextLine(); //getting the class name as the input
            classname+=input;  
            Animal animal=(Animal)Class.forName(classname).newInstance();   //Instantiating the classes with the input provided
            animal.characteristics();   //characteristics called
        }
        catch(ClassNotFoundException | IllegalAccessException | InstantiationException e)
        {
            System.out.println(e);
        }
    }
}


