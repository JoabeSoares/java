import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String palavras = "parou";

        while (x != String) {
            palavras += x;
            x = sc.next();
        } 
        System.out.println(palavras);
        sc.close();
    }
    }
