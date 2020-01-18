public class IfVariableRangeExampleClass {

    static String myGlobalVariableString = "TEXT"; //zmienna globalne dostepna wszedzie

    public static void main(String[] args) {

        int c = 90;
        showVariableRangeExample();
        myGlobalVariableString = "hgdbhjgd";
    }

    public static void showVariableRangeExample(); {

        // int = c 190 - nie moge - dostepne tylko z poprzedniej metody main
        int a = 25;
        if(a == 25) {
            int b = 20;
            System.out.println("a: " + a + ", b: " + b);
            a = 40;
            System.out.println("a: " + a + ", b: " + b);
        }
        /*dostepne tylko w obrebie if*/ // b = 50;
    }
}
