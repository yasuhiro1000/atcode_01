import java.util.*;

public class ABC286_A {
    public static void  main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int input_N=sca.nextInt();
        int input_P=sca.nextInt();
        int input_Q=sca.nextInt();
        int input_R=sca.nextInt();
        int input_S=sca.nextInt();
        int kai=0;
        int input_A[] = new int[input_N];
        for (int i=0;i<input_N;i++){
            input_A[i]= sca.nextInt();
        }
        for (int p =0 ;p<input_Q-input_P+1;p++){
            kai=input_A[input_P-1+p];
            input_A[input_P-1+p]=input_A[input_R-1+p];
            input_A[input_R-1+p]=kai;
        }
        for (int t =0 ; t<input_N;t++){
            System.out.print(input_A[t]+" ");
        }
    sca.close();
    }
}