import java.util.*; 
public class ABC081B {
    public static void main(String[] args) {
        Scanner sca = new java.util.Scanner(System.in);
        int Nko = sca.nextInt();   //回数入力
        int count ;
        int[] wari =new int[Nko];
        for (int i=0 ;i<Nko;i++){     //入力された数字の数だけ偶数ならば２で割る処理
            count=0;       
            int input_A = sca.nextInt();
            for (int p = 0; input_A>1;p++){                           
                if (input_A%2 == 0){   //偶数判断
                    input_A=input_A/2;
                    count++;           //割れる数を数える         
                }else {
                    break;　　　　　　　//奇数なら抜ける
                }
         wari[i]=count;　　　　　　　　// 2で割れた回数をカウント
            }
        }
        int kai = wari[0];
        for (int  q= 0 ; q<Nko ;q++){  //配列の最小値を探す
            if (kai > wari[q] ){
                kai=wari[q];
            }
        }
    System.out.println(kai);　　　　　　//回答
    }
}
