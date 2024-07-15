import java.util.Objects;

public class Operation {
    public static void main(String[] args) {
        String str = String.valueOf(Roma.V.getTranslation());
        String str1 = String.valueOf(Roma.X.getTranslation());
        int res = Integer.parseInt(str) + Integer.parseInt(str1);
        // String result;
        Roma result = null;
        switch (res) {
            case 1:
                result = Roma.valueOf("I");
                break;
            case 2:
                result = Roma.valueOf("II");
                break;
            case 3:
                result = Roma.valueOf("III");
                break;
            case 4:
                result = Roma.valueOf("IV");
                break;
            case 5:
                result = Roma.valueOf("V");
                break;
            case 6:
                result = Roma.valueOf("VI");
                break;
            case 7:
                result = Roma.valueOf("VII");
                break;
            case 8:
                result = Roma.valueOf("VIII");
                break;
            case 9:
                result = Roma.valueOf("XIV");
                break;
            case 10:
                result = Roma.valueOf("X");
                break;
            case 11:
                result = Roma.valueOf("XI");
                break;
            case 12:
                result = Roma.valueOf("XII");
                break;
            case 13:
                result = Roma.valueOf("XIII");
                break;
            case 14:
                result = Roma.valueOf("XIV");
                break;
            case 15:
                result = Roma.valueOf("XV");
                break;
            case 16:
                result = Roma.valueOf("XVI");
                break;
            case 17:
                result = Roma.valueOf("XVII");
                break;
            case 18:
                result = Roma.valueOf("XVIII");
                break;
            case 19:
                result = Roma.valueOf("XIX");
                break;
            case 20:
                result = Roma.valueOf("XX");
                break;
        }
        System.out.println(result);
    }
}
