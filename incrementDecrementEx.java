import java.util.*;

class Main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        
        // Accept input values from the user
        System.out.println("Enter the m : ");
        m = sc.nextInt();
        System.out.println("Enter the  n: ");
        n = sc.nextInt();
        
        /* 
         * Expression evaluation breakdown (Left-to-Right):
         * 1. m++       -> Uses current 'm' value, then increments 'm' by 1.
         * 2. (++n * n--)-> Inside parenthesis executes first:
         *                  - ++n increments 'n' first, then uses it.
         *                  - n-- uses current 'n', then decrements 'n'.
         *                  - Multiplies both results together.
         * 3. First '/' -> Divides (m++) result by the parenthesis result (Integer Division).
         * 4. --m       -> Decrements 'm' by 1 first, then uses the updated value.
         * 5. Final '/' -> Divides the previous quotient by the (--m) value.
         */
        System.out.println(m++ / (++n * n--) / --m);
    }
}
