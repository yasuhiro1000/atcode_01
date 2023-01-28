import java.util.*;

public class ABC087B {
    public static void  main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int input_A=sca.nextInt();
        int input_B=sca.nextInt();
        int input_C=sca.nextInt();
        int input_X=sca.nextInt();       
        int kai=0;        
        for (int a=0;a<input_A+1;a++){
            for (int b=0;b<input_B+1;b++){
                for (int c=0;c<input_C+1;c++){
                    if (input_X==(500*a+100*b+50*c)){                
                        kai= kai+1;
                    }            
                }       
            }
        }
    sca.close();
    System.out.println(kai);
    }
}