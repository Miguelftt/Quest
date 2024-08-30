import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a string para ser invertida: ");
            String input = scanner.nextLine();
            String reversed = inverterString(input);
            System.out.println("String invertida: " + reversed);
        }
    }
    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int left = 0;
        int right = caracteres.length - 1;
        while (left < right) {
            char temp = caracteres[left];
            caracteres[left] = caracteres[right];
            caracteres[right] = temp;
            left++;
            right--;
        }
        return new String(caracteres);
    }
}
