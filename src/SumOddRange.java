public class SumOddRange {
        public static boolean isOdd(int number){
            if(number<0 || number%2==0){
                return false;
            }else{
                return true;
            }
        }
        public static int sumOdd(int start, int end) {
            int sum = 0;
            if (start < 1 || start > end) {
                return -1;
            }
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        }
    public static void main(String[] args) {
        int sumOfOdd = sumOdd(10, 20);
        System.out.println("The total sum of odd numbers between 10 and 20 is " + sumOfOdd);
    }
}