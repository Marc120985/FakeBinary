import java.util.Arrays;

public class FakeBinary {
    public static void main(String[] args) {
        String imput = "1978908";
        convertString(imput);
    }

    public static String convertString(String imput) {
        String[] myStringArray = imput.split(" ", 4);

        for(int i=0; i<myStringArray.length; i++)
            System.out.println(myStringArray[i]);

        return "";
    }
}
