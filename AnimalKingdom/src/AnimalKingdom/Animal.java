package AnimalKingdom;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//this class is the parent class to other classes
class Animal
{
    protected FileInputStream fis;
    protected FileOutputStream fos;
    protected InputStreamReader isr;
    protected OutputStreamWriter osw;
    protected Animal animal; 
    protected String filename;
    protected boolean changes; 
    protected String writeData;
    public void characteristics() throws InstantiationException 
    {       
        System.out.println("***** Welocme to Animal Kingdom *****");
        //store the classes of animal kingdom in String Array
        String animalClasses[]={"AnimalKingdom.Mammal","AnimalKingdom.Bird","AnimalKingdom.Amphibian","AnimalKingdom.Invertebrate","AnimalKingdom.Reptile"}; 
        //instantiating all classes accessing the characteristics method
        for(String classname:animalClasses)
        {
            try
            {
                animal=(Animal)Class.forName(classname).newInstance();
                animal.characteristics();
            }
            catch(ClassNotFoundException | IllegalAccessException | InstantiationException e)
            {
                System.out.println(e);
            }
        }
        System.out.println("********** End of Animal Kingdom **********");
    }
}