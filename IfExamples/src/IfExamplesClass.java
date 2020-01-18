public class IfExamplesClass {
    public static void main(String[] args) {

        boolean numberIsPositive = checkIfNumberispositive(-23);
        System.out.println("number is positive: " + numberIsPositive); /*jkhsdfvkjhskfjhvb*/


        int absoluteValue = calculateAbsoluteValue(-78);
        System.out.println(absoluteValue);
    }

    public static boolean checkIfNumberispositive(int number) {
        if(number >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int calculateAbsoluteValue(int value) {
        if(value < 0) {
            return value * (-1);
        }  else {
            return value;
        }
    }
}
