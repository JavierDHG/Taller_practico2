package exercise.pkg2;
import java.io.*;
/**
 *
 * @author Javier David Hernandez Garcia
 */
public class Exercise2 {
    public static void main(String arg[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));
        
        bw.write("How many funds does it have"+"\n");  //Enter the amount of funds you have
        bw.flush();
        String fon=br.readLine();  //What is written is saved
        int fond=Integer.parseInt(fon);  //Then he becomes int to be operated 
        bw.write("Enter the number of weeks "+"\n");  //The number of weeks is entered
        bw.flush();
        int[] sem=new int[Integer.parseInt(br.readLine())];  //What was written in an array is saved
        int[] dia=new int[7]; //Here the number of days per week in the arrangement is placed
        int [] tam2=new int[1]; //This is so I only ask once the purchase of the stock
        for(int i=0; i<sem.length; i++){  //Two indices are created 
            for(int x=1;x<dia.length;x++){ //one is for days and the other for weeks
            bw.write("Enter the price of the day " +x+ "\n");  //Enter the price of the share per day
            bw.flush();
            dia[x]=Integer.parseInt(br.readLine());
            }
            bw.write("Enter the action of the day you want to buy "+"\n"); //Enter the day
            bw.write("Enter the price "+"\n");  //and the share price
            bw.flush();            
            String y=br.readLine();  //The previously written is saved
            String y1=br.readLine();
            int b=Integer.parseInt(y);  //The previously written is saved
            int b1=Integer.parseInt(y1);
            int[] tam=new int[b];  //An arrangement that contains the day is created
            int[] tam3=new int[b1];  //and the price of the action 
            for(int z=0;z<tam2.length;z++){
            bw.write("You bought the action of the day "+b+" cost "+b1+"\n");//to then be shown
            bw.flush();  
            int total=fond-b1; 
            bw.write("Current fund of "+total+"\n"); //Here it tells you how much funds you have left for the next investment
            int total1=b1*2;
            bw.write("The sale of the stock gave the following funds "+total1+"\n"); //Here it tells you how many funds you have after the sale of the shares
            bw.flush();
            int total2=total+total1;
            bw.write("Current fund of "+total2+"\n");  //Then he tells you how many funds he has now
            bw.flush();  
            }
        }
    } 
}
