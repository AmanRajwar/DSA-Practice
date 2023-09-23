


public class optimal {
    public static int atoi(String str) {
        // Write your code here.

        int i = 0;
        int n = str.length();
        // skiping all the white spaces
        while (i < n && str.charAt(i) == ' ') {
            i++;
        }
        int positive = 0;
        int negative = 0;

        // checking positive sign is present
        if (i < n && str.charAt(i) == '+') {
            positive++;
            i++;
        }

        // checking negative sign is present
        if (i < n && str.charAt(i) == '-') {
            negative++;
            i++;
        }
        // if both present then return 0
        if (positive > 0 && negative > 0) {
            return 0;
        }

        double ans = 0;

        while (i < n && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            ans = ans * 10 + (str.charAt(i) - '0');// convert from string to number
            i++;
        }

        if (negative > 0) {
            ans = -ans;
        }
        // checking if greater or smaller than 32 bit integer
        if (ans > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (ans < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) ans;
    }
}