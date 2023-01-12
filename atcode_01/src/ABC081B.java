import java.util.*; 
public class ABC081B {
public static void main(String[] args)  {
    Scanner sca =new Scanner(System.in);
    int input_N = sca.nextInt();
    int[] arrayA = new int[input_N];
    int count ;
    int p = 0;
    for (int i = 0;i<input_N;i++){
        int input_A = sca.nextInt();
        count=0;
        while(input_A>2){
            if (input_A%2==1){
                System.out.println("shuuryou"+ count);
            }else {
                input_A=input_A/2;
                System.out.println(input_A);
                count++;
            }
            }
            System.out.println(count);
            arrayA[i]=count;
     }} }
    
    