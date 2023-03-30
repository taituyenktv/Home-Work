import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập họ và tên: ");
        String name = sc.nextLine();

        name = name.trim().toLowerCase();
        name = name.replaceAll("\\s+", " ");

        String[] correct = name.split(" ");
        String newName ="";
        for (int i = 0; i < correct.length; i++) {

            newName=newName+String.valueOf(correct[i].charAt(0)).toUpperCase()+ correct[i].substring(1);
            if (i< correct.length-1){
                newName+=" ";
            }
        }

        System.out.println("Tên tiêu chuẩn là : " +newName);
    }
}

