import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1;
        System.out.println("Bạn muốn nhập mảng 1 chiều hay 2 chiều ( 1 hoặc 2 )");
        int number = Integer.parseInt(sc.nextLine());
        switch (number) {
            case 1:
                System.out.println("Mời bạn nhập số lượng phần tử có trong mảng");
                number1 = Integer.parseInt(sc.nextLine());

                int[] arr1 = new int[number1];
                for (int i = 0; i < number1; i++) {
                    System.out.print("Thứ " + (i + 1) + " bạn muốn nhập trong mảng là : ");
                    arr1[i] = Integer.parseInt(sc.nextLine());
                }
                System.out.print("Mảng của bạn là : ");
                for (int i = 0; i < number1; i++) {
                    if (i==number1-1){
                        System.out.println(arr1[i]);
                    }else System.out.print(arr1[i]+" ");

                }
                int max = arr1[0];
                int min = arr1[0];
                for (int max1 : arr1) {
                    if (max < max1) {
                        max = max1;
                    }
                }
                System.out.println(" Giá trị lớn nhất trong chuỗi là : " + max);

                for (int min1 : arr1) {
                    if (min > min1) {
                        min = min1;
                    }
                }
                System.out.println(" Giá trị nhỏ nhất trong chuỗi là : " + min);
                break;

            case 2:

                System.out.println("Số hàng cần có trong bảng là : ");
                int row = Integer.parseInt(sc.nextLine());

                System.out.println("Số cột cần có trong bảng là : ");
                int column = Integer.parseInt(sc.nextLine());

                int[][] arr2 = new int[row][column];

                for (int i = 0; i < arr2.length; i++) {
                    for (int j = 0; j < arr2[i].length; j++) {
                        System.out.println("Mời nhập giá trị dòng  " + (i + 1) + " cột " + (j + 1));
                        arr2[i][j] = sc.nextInt();
                    }
                }
                for (int i = 0; i < arr2.length; i++) {

                    for (int j = 0; j < arr2[i].length; j++) {

                        System.out.print(arr2[i][j] + " \t ");
                    }
                    System.out.println("\n");

                }
                int maxarr2 = arr2[0][0];
                int minarr2 = arr2[0][0];

                for (int i = 0; i < arr2.length; i++) {
                    for (int j = 0; j < arr2[i].length; j++) {

                        if (maxarr2 <= arr2[i][j]) maxarr2=arr2[i][j];


                    }

                }
                System.out.println(" Giá tri lớn nhất của mảng là : "+maxarr2);
                for (int i = 0; i < arr2.length; i++) {
                    for (int j = 0; j < arr2[i].length; j++) {

                        if (minarr2 >= arr2[i][j]) minarr2=arr2[i][j];


                    }

                }
                System.out.println(" Giá tri nhỏ nhất của mảng là : "+minarr2);
                break;
        }
    }
}
