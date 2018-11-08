import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;

public class Exercise3 {
    /**
    *
    * @author Javier David Hernández García  
    */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        bw.write("Enter the number of objects "+"\n");  //Enter the number of objects you want
        bw.flush();
        String y=br.readLine();  //The number that was written is read
        int b=Integer.parseInt(y);  //It goes from string 
        int [] tam=new int[b];      //to int to be able to create an array
        int [] tam2=new int[1];  //An arrangement for the suitcase is created, so you only ask once
        for(int i=1;i<tam.length;i++){  //An index that works so that it says
            bw.write("Enter the value of object number "+i+"\n");  //this and do not go over the amount that was paid before
            bw.flush();
            String as=br.readLine();
            int ba=Integer.parseInt(as);
            bw.write("Size of the object "+i+"\n"); //Enter the size of each object
            bw.flush();
            String az=br.readLine();
            int bz=Integer.parseInt(az);
                for(int c=0;c<tam2.length;c++){  //Array to say only once the following
                bw.write("Enter the size of the suitcase"+"\n");  //The size of the backpack is entered.
                bw.flush();
                String ax=br.readLine();
                int bx=Integer.parseInt(ax);
                if(bz<=bx){  //If the size of the object is smaller than that of the backpack
                    bw.write("The object "+i+" with value of "+as+" is perfec"+"\n");  //the following will appear
                    bw.flush();
                    bw.write("The object selected "+i+" and its price is "+ba+"\n");  //Here it says the object that was chosen and the price of this
                    bw.flush();
                }else{
                    bw.write("The objeto "+i+" with value of "+as+" not is perfec"+"\n");  //If the object that was entered is larger than the suitcase space it appears that
                    bw.flush();
                }                
                }

        }

         
    }
}


