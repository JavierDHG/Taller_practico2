package tteo2punt1;
import java.io.*;
/**
 *
 * @author Javier David Hernandez Garcia
 */
public class TTEO2PUNT1 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));
        
        bw.write("Ingrese el numero a ordenar "+ "\n");
        bw.flush();
        int[]num=new int[Integer.parseInt(br.readLine())];  
        for(int i=0; i<num.length; i++){
            bw.write("Digite el numero " +(i+1)+ "=");
            bw.flush();
            num[i]=Integer.parseInt(br.readLine());
           }
        insertion_sort(num);                             
    }

     public static void insertion_sort(int a[]) {    
        for(int i=1; i<a.length; i++) {        
            int x=a[i];   
            int j=i-1;              
            while((j>-1) && (a[j]>x)) {  
                a [j+1]=a [j];  
                j--;   
               }
            a[j+1]=x;               
           }
        for(int s=0; s< a.length; s++)
	    System.out.println(a[s]);  	  
    }
}