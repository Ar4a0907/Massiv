import java.util.Random;
import java.util.Scanner;

public class massiv {
    public static void main(String[] args) {
        int A[] = new int [20];
        int K;
        int i = 0;
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("K=");
        if (scan.hasNextInt())
            K = scan.nextInt();
        else{
            System.out.println("input-output error");
            scan.close();
            return;
        }
        scan.close();
        System.out.println("result:");
        if (K<=0){
            Random r = new Random();
            while(i<10){
                A[i] = r.nextInt(51);
                i++;
            }
            while(i<20){
                A[i]=A[i-1]+K;
                i++;
            }
        }
        else{
            A[0]=1;
            i = 1;
            while(i < 20){
                A[i]=A[i-1]+K;
                i++;
            }
        }
        System.out.println("A:");
        i = 0;
        do{
            System.out.print(A[i] + " ");
            if (i == 9)
                System.out.println("");
            i++;
        }
        while(i<20);
        
        System.out.println("");
        
        n=1;
        for(i = 2; i < 20; i=i+2){
            A[i-n]=A[i];
            n++;
        }
        for(i = 10;i<20;i++){
            A[i]=0;
        }
        System.out.println("A:");
        for(i = 0;i<20;i++){
            System.out.print(A[i]+" ");
            if(i == 9)
                System.out.println("");
        }
    }
}
