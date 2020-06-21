package MockVita;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Harsh
 */
public class ProblemB {

    static boolean isPrime(int n) {
        for (int j = 2; j <= n / 2; j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }

    static Set<Integer> combination(List l1) {
        Set<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < l1.size(); i++) {
            for (int j = 0; j < l1.size(); j++) {
                if (j == i) {
                    continue;
                }
                s.add(Integer.parseInt(l1.get(i).toString() + l1.get(j).toString()));
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        try {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            List list1 = new ArrayList();

            for (int i = n1; i < n2; i++) {
                if (isPrime(i)) {
                    list1.add(i);
                }
            }
            Set<Integer> s = combination(list1);
            Integer[] a = s.toArray(new Integer[s.size()]);
            List list2 = new ArrayList();
            int max = 0;
            int min = 100000;
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (isPrime(a[j])) {
                    if (a[j] > max) {
                        max = a[j];
                    }
                    if (a[j] < min) {
                        min = a[j];
                    }
                    count++;
                    list2.add(a[j]);
                }
            }

            long a1 = min, b1 = max;
            long c = 0;
            for (int k = 1; k < count - 1; k++) {
                c = a1 + b1;
                a1 = b1;
                b1 = c;
            }
            System.out.println(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
