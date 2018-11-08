package tteo2punt1;
import java.io.*;
import static tteo2punt1.bubblesort.bubble_sort;
/**
 *
 * @author Javier David Hernandez Garcia
 */
public class BinarySearch {
    public static void main(String arg[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));
    }
    
    public static int binary_search(int[]a,int[]x) {  //A function of type int is created with its name and its arrays
        int lowerbound=0;  //The values of the functions are defined
        int upperbound=a.length-1;
        int index=-1;
        
        while(lowerbound < upperbound){  //If the first function is less than the length of a, the following will appear
            int middlepoint=(lowerbound+upperbound)/2;
            if(x.equals(a[middlepoint])){  //If what has x is equal to the arrangement of a, it is placed that the variable is equal to the above
                index=middlepoint;
                break; 
            }else{  //If the above is not met, the following conditions are followed
                if(x < a[middlepoint]){
                    upperbound=middlepoint-1;
                }else{
                    lowerbound=middlepoint+1;
                }
            }
        }
        if(lowerbound==upperbound && a[lowerbound]==x){ //Here is another condition that makes the organization of numbers possible
            index=lowerbound;
        }
        return index;
}  
}