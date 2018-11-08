package tteo2punt1;
import java.io.*;

/**
 *
 * @author Javier David Hernandez Garcia
 */
public class binaryrecursive {
    public static void main(String arg[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));
    }
    
    public static int binary_search(int[] a,int x, int ib, int ub) { //A function of type int is created with its name and its arrays
        int middlepoint=(ib+ub)/2;  //A variable is created
        if(ib==ub){ //If what is written in both is the same, it will do the following
            if(x==a[middlepoint]){//If int x is the same as the array of a with what has middle will do the following
                return middlepoint;             
            }    else{ //If the condition is not met, it will do the following
            return -1;
        }
        }else{  //Here it is possible that the numbers are organized according to the condition or conditions
            if(x==a[middlepoint]){
                return middlepoint;
            }else{
                if(x<a[middlepoint]){
                    return binary_search(a,x,ib,middlepoint);
                }else{
                    return binary_search(a,x,ib,middlepoint+1);
                }
            }
        }

}  
}