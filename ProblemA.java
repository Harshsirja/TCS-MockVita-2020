package MockVita;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.Math.floor;
import static java.lang.Math.log;
import java.util.Scanner;

/**
 *
 * @author Harsh
 */
public class ProblemA {

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        try {
            int sum;
            int j;
            int T = sc.nextInt();
            int solution[] = new int[T];
            for (int i = 0; i < T; i++) {
                int N = sc.nextInt();
                solution[i] = (int) (1 + floor((int) (log(N) / log(2))));
//                System.out.println(j);
            }

            for (int i = 0; i < T; i++) {
                System.out.println(solution[i]);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
