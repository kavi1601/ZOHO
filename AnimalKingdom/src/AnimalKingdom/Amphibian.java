
package AnimalKingdom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Amphibian extends Animal{
    Amphibian()
    {
        this.filename="D:amphibian.txt";
        System.out.println("***** Welcome to Animal Kingdom - Amphibians Class  *****");
    }
    @Override
    public void characteristics()
    {
        Scanner sc=new Scanner(System.in);
        try 
        { 
            //read the boolean value for writing any thing add in file or not
            System.out.println("If you want to write the file, please type 'true' : ");
            changes=sc.nextBoolean();
            if(changes==true)
            {
                System.out.println("Enter characteristics add to file : ");
                sc.nextLine();
                writeData=sc.nextLine();
                //writing given data from file
                fos=new FileOutputStream(filename,true); 
                osw=new OutputStreamWriter(fos);  
                osw.write(writeData);
                osw.flush();
                osw.close();
                fos.close();
                System.out.println("Successfully Added");
            }
            else
            {
                System.out.println("You don't add anything in file");
            }
            //reading the data from file:amphibians.txt
            fis=new FileInputStream(filename);
            isr=new InputStreamReader(fis);
            int readData=isr.read();
            while(readData!=-1)
            {
                System.out.print((char)readData);
                readData=isr.read();
            }
            isr.close();
            fis.close();
            //calling the static method getAnimallist
            System.err.println(getAnimallist());
        } 
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(Amphibian.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(Amphibian.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            System.out.println("********** End of Amphibians Class **********\n");
        }
    }
    //method return the list of mammal class animals 
    static ArrayList<String> getAnimallist()
    {
        return new ArrayList<String>(Arrays.asList(new String[]{"Frog","Salamandar","Toad"}));
    }
}
