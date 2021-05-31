class Max {
    /**
     * Implementation of Max Algorithm
     * @param num - Array of elements.
     * @return Max element
     */
    int max(int[] num) {
        int result = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > result) {
                result = num[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 94, 16, 44, 35};
        var findMax = new Max();
        int maxNum = findMax.max(numbers);
        System.out.println("Maximum element is : " + maxNum);
    }
}