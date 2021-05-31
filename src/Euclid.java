public class Euclid {

    /**
     * Implmentation of Euclid Algorithm
     * 
     * @param num1 - number 1
     * @param num2 - number 2
     * @return - GCD of number 1 and number 2
     */
    public int euclid(int num1, int num2) {
        while (num2 != 0) {
            int r = num1 % num2;
            num1 = num2;
            num2 = r;
        }
        return num1;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 15;

        var findGcd = new Euclid();
        int gcd = findGcd.euclid(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " = " + gcd);

        /*
         * Output: 
         * GCD of 10 and 15 = 5
         */
    }
}
