package tteo2punt1;
import java.io.*;
/**
 *
 * @author Javier David Hernandez Garcia
 */
public class LinealSearch {
    public static void main(String[] args)throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));
        
    int minRandom=0, maxRandom=100;  //Here it is placed from where the numbers begin to where they go                                         
    int[]as=new int[100];       //Here you enter how many random numbers will appear                                       
    for(int i=0; i<as.length; i++) //An index that is searched in the array of a specific number is created
        as[i]=minRandom-((int)Math.round((Math.random())*(minRandom-maxRandom)));
            
    bw.write("Enter the number to find"+ "\n");  //Enter the number to find
    bw.flush();
    int result=Integer.parseInt(br.readLine());  //The number is passed to int                        
    boolean result1=false;  //A new result is created to evaluate later                                        
    for(int x=0; x<as.length; x++){ //The index is used to take out the numbers that were randomly placed
        bw.write("In the position number " +(x+1)+ ":" +as[x]+ "\n");  //Here random numbers are written
        bw.flush();
    }   
    for(int z=0; z<as.length; z++){ //If the number was found in the arrangement of the random numbers, the following will appear
        if(result==as[z]){
            bw.write("It was found in the position number " +(z+1)+ "\n"); //This appears
            bw.flush();
            result1=true;
            break;
        }
    }
    if(result1!=true){ 
           bw.write("The number was not found"+ "\n");  //If the number is not found, write this
           bw.flush();
    }
    }
}