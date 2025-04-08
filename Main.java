import java.util.Scanner;

public class Main {

    public static String check(int[] seq) {
        int n = seq.length;
        if (n == 1) return "Jolly";

        int[] diffStore = new int[n];
        for (int i = 1; i < n; i++) {
            int diff = Math.abs(seq[i] - seq[i - 1]);
            if (diff <= 0 || diff >= n) return "Not jolly";
            diffStore[diff] = 1;
        }

        for (int i = 1; i < n; i++) {
            if (diffStore[i] == 0) return "Not jolly";
        }

        return "Jolly";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] seq = new int[n];
            for (int i = 0; i < n; i++) {
                seq[i] = sc.nextInt();
            }
            System.out.println(check(seq));
        }
    }
}
