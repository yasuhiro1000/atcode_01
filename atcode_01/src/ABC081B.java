import java.util.*; 
public class ABC081B {
public static void main(String[] args) throws Exception {
    Scanner sca =new Scanner(System.in);
    int input_N = sca.nextInt();
    int[] arrayA = new int[input_N];
    int count = 0;
    int p = 0;
//入力よ読み込み、配列収納
    for (int i = 0;i<input_N;i++){
        int input_A = sca.nextInt();
        arrayA[i] = input_A;  
        System.out.println(arrayA[i]);
    }
//全部の偶数判定 
    while ( p <arrayA.length+1){
        if (arrayA[p]%2==1){
            System.out.println(count);
            System .exit(0);
        }
        arrayA[p]=arrayA[p]/2;
        if (p>arrayA.length){
                p=0;
        }
                p++;
                count++;
    }
                System.out.println(count);
        }}


    