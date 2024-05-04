import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // simple program
//        System.out.println("enter your marks out of 100");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("sub1: ");
//        float s1 = sc.nextInt();
//        System.out.print("sub2: ");
//        float s2 = sc.nextInt();
//        System.out.print("sub3: ");
//        float s3 = sc.nextInt();
//        System.out.print("sub4: ");
//        float s4 = sc.nextInt();
//
//        System.out.println("Percentage: " + (s1+s2+s3+s4)/400 * 100);

        // program for adding 2 matrix

//        int [][] m1 = {{1,2,3},{4,5,6},{1,2,3}};
//        int [][] m2 = {{4,5,6},{1,2,3},{1,2,3}};
//        int [][] r =new int[3][3];
//
//        for(int i=0; i < m1.length; i++){
//            for (int j=0; j<m1[i].length; j++){
//                r[i][j] = m1[i][j] + m2[i][j];
//                System.out.print(r[i][j] + " ");
//            }
//            System.out.println(" ");
//        }

//        int[] arr = new int[] {1,2,3,4,5};
//        System.out.println(arr.length);
//        for (int i=arr.length-1; i>=0; i--){
//            System.out.println(arr[i]);
//        }

//        int [] arr = new int [] {1, 2, 3, 4, 5};
//        System.out.println("Original array: ");
//        for(int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        System.out.println("Array in reverse order: ");
//        //Loop through the array in reverse order
//        for (int i = arr.length-1; i >= 0; i--) {
//            System.out.print(arr[i] + " ");
//        }

//        // reverse an array using swapping method
//        int[] arr = new int [] {1,2,3,4,5,6};
//        int l = arr.length;
//        int n = Math.floorDiv(l,2);
//        int temp;
//
//        // swap
//        for (int i=0; i<n; i++){
//            temp = arr[i];
//            arr[i]=arr[l-1-i];
//            arr[l-1-i] = temp;
//        }
//
//        // print arr
//        for(int elem:arr){
//            System.out.print(elem + " ");
//        }


//        // maximum element in array
//
//        int[] arr = new int [] {1,2,3,114,5,6};
//        int max=0;
//        for(int e:arr){
//            if(e>max){
//                max=e;
//            }
//        }
//        System.out.println(max);/
//
//      maximum element in array

        int[] arr = new int [] {1,2,3,114,5,6};
        int min=99999;
        for(int e:arr){
            if(e<min){
                min=e;
            }
        }
        System.out.println(min);
}
}