import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
    //     System.out.println("<---- for loop ----->");
    //     for(int i = 0 ; i < 11; i++){
    //         System.out.println(i);
    //         // System.out.print(i+" "); //0 1 2 3 4 5 6 7 8 9 10 
    //     }

    //     System.out.println("<---- while loop ----->");
    //     int x = 0;
    //     while(x < 11){
    //         System.out.println(x);
    //         // System.out.print(x+" ");
    //         x++;
    //     }
    //     System.out.print("<---- do - while loop ----->");
    //     int y = 0;
    //     do{
    //         System.out.println(y);
    //         // System.out.print(y+" ");
    //         y++;
    //     }
    //     while(y < 11);
    // }

    // System.out.println("<---- Sum");
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();

//     int sum = 0;
//     for(int i = 1 ; i <= n; i++){
//         sum = sum + i; // sum += i;
//     }
//     System.out.println(sum);

    System.out.println("<----Multiplication Tabel");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 1 ; i < 11; i++){
        System.out.println(i * n);
    }
}  
} 