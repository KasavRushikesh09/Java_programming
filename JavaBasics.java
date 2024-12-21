//Question (1) :

// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int Area = a * a;
//         System.out.println(Area);

//     }

// }

//Question (2) :

// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int Area = a * a;
//         System.out.println(Area);

//     }

// }

//Question (3) :

import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen    = sc.nextFloat();
        float eraser = sc.nextFloat();
        float Total_cost = (pencil+pen+eraser)+((pencil+pen+eraser)*18)/100;
        System.out.println("Bill with 18% tax : " + Total_cost);
    }
}
