import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số lượng phần tử có trong mảng ");
        int num = Integer.parseInt(sc.nextLine());
        int [] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Mời bạn nhập thêm phần tử thứ "+(i+1)+" trong mảng : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Mảng của bạn chứa các phần tử hiện tại là : [");
        for (int i = 0; i < num; i++) {
            if (i==num-1){
                System.out.print(arr[i]);
            }else System.out.print(arr[i]+", ");
        }
        System.out.println("]");
        for (int i = 0; i < num; i++) {
            if (arr[i]% 2 == 0){
                arr[i]=+arr[i]+1;
            }

        }
        System.out.print("Mảng mới của bạn sau khi số chẵn được tăng 1 đơn vị là : [");
        for (int i = 0; i < num; i++) {
            if (i==num-1){
                System.out.print(arr[i]);
            }else System.out.print(arr[i]+", ");
        }
        System.out.print("]");

    }
}
