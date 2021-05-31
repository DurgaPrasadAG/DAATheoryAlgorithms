class StraightMaxMin {
    int max;
    int min;

    /**
     * Implementation of Straight Forward algorithm
     * 
     * @param num - Array of numbers
     */
    public void straightMaxMin(int[] num) {
        int max;
        int min;
        max = min = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }

        maxMin(max, min);
    }

    void maxMin(int max, int min) {
        System.out.println("Max element : " + max);
        System.out.println("Min element : " + min);
    }

    public static void main(String[] args) {
        int[] num = { 22, 13, -5, -8, 15, 60, 17, 31, 47 };

        var findMaxAndMin = new StraightMaxMin();
        findMaxAndMin.straightMaxMin(num);

        /*
         * Output:
         * Max element : 60
         * Min element : -8
         */
    }
}
