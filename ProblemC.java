package MockVita;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Harsh
 */
public class ProblemC {

    static float distance(int x, int y) {
        return (float) Math.sqrt(x * x + y * y);
    }

    static float time(float distance, int speed) {
        return (distance / speed);
    }

//    static int combinate(int c) {
//        return ((c) * (c - 1) / 2);
//    }
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        try {
            int N = sc.nextInt();
            int a[][] = new int[N][3];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < 3; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            float time_r[] = new float[N];
            float d;
            for (int i = 0; i < N; i++) {
                d = distance(a[i][0], a[i][1]);
                time_r[i] = d / a[i][2];
            }

            int count = 0;
            float current_car_time;
            for (int i = 0; i < N; i++) {
                current_car_time = time_r[i];
                for (int j = i + 1; j < N; j++) {
                    if (current_car_time == time_r[j]) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
