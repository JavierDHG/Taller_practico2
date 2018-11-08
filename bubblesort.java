package tteo2punt1;
import java.io.*;
/**
 *
 * @author Javier David Hernandez Garcia
 */
public class bubblesort{   
    public static void main(String arg[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));
        
        bw.write("Enter the number to order "+ "\n");  //The settlement amount is entered
        bw.flush();
        int[]x1=new int[Integer.parseInt(br.readLine())]; //The writing is saved in the arrangement                     
        for (int i=0 ; i<x1.length; i++){ //Here we create the index that will tell us the array position
             bw.write("Enter the number " +(i+1)+ ":");  //The numbers are entered
             bw.flush();
             x1[i]=Integer.parseInt(br.readLine());   //The numbers written here are saved                        
            }
        bubble_sort(x1);  //Here the function that organizes numbers from lowest to highest is invoked                                                        
    }
    
    public static void bubble_sort(int[]a) {  ////A function of type int is created with its name and its array
    int x;                           //I have created a new variable                                    
    for(int i=0; i<a.length-1; i++){ //Two indexes are created, which are those that compare the numbers position by position
        for(int b=0; b<a.length-1; b++){
            if (a[b]>a[b+1]){ //If the number is greater than the other, advance one position forward and the other is returned to that position
                x=a[b+1];
                a[b+1]=a[b];                                    
                a[b]=x;
                }
            }
        }
        for(int i = 0; i<a.length; i++)
            System.out.print(a[i]+"\n");   
}  
}