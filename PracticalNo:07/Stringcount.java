import java.util.Scanner;

 class StringCount {

    static int logic1Iteration(String s1, String s2) {

        int count = 0;

        for (int i = 0; i <= s1.length() - s2.length(); i++) {
                int j;
            for ( j = 0; j < s2.length(); j++) {

                if (s1.charAt(i + j) != s2.charAt(j)) {
                    break;
                }
            }

            if ( j == s2.length()) {
                count++;
            }
        }

        return count;
    }

    static int logic1Recursion(String s1, String s2, int index) {

        if (index > s1.length() - s2.length()) {
            return 0;
        }

        int j;

        for (j = 0; j < s2.length(); j++) {

            if (s1.charAt(index + j) != s2.charAt(j)) {
                break;
            }
        }

        if (j == s2.length()) {
            return 1 + logic1Recursion(s1, s2, index + 1);
        }

        return logic1Recursion(s1, s2, index + 1);
    }

    static int logic2Iteration(String s1, String s2) {

        int count = 0;

        for (int i = 0; i <= s1.length() - s2.length(); i++) {

            if (s1.substring(i, i + s2.length()).equals(s2)) {
                count++;
            }
        }

        return count;
    }

    static int logic2Recursion(String s1, String s2) {

        if (s1.length() < s2.length()) {
            return 0;
        }

        if (s1.substring(0, s2.length()).equals(s2)) {
            return 1 + logic2Recursion(s1.substring(1), s2);
        }

        return logic2Recursion(s1.substring(1), s2);
    }


     static int logic3Iteration(String s1, String s2) {

        int count = 0;
        int index = 0;

        while ((index = s1.indexOf(s2, index)) != -1) {

            count++;
            index = index + s2.length();
        }

        return count;
    }

    public static int logic3Recursion(String s1, String s2) {

        int index = s1.indexOf(s2);

        if (index == -1) {
            return 0;
        }

        return 1 + logic3Recursion(s1.substring(index + s2.length()), s2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String str1 = sc.nextLine();

        System.out.print("Enter Second String: ");
        String str2 = sc.nextLine();

        System.out.println(logic1Iteration(str1, str2));
        System.out.println( logic1Recursion(str1, str2, 0));
        System.out.println( logic2Iteration(str1, str2));
        System.out.println( logic2Recursion(str1, str2));

        System.out.println( logic3Iteration(str1, str2));
        System.out.println( logic3Recursion(str1, str2));

        sc.close();
    }
}