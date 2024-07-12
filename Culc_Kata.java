import java.util.InputMismatchException;
import java.util.Scanner;

public class Culc_Kata {



    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner((System.in));
            System.out.println("Введите выражение: ");
            String myString = scanner.nextLine();
            String string = myString.replaceAll(" ", "");

            String str = getOperation(string);

            String[] arr = string.split("[+\\-*/]");

            if (arr[0].equals("I") || arr[0].equals("II") || arr[0].equals("III") || arr[0].equals("IV")
                    || arr[0].equals("V") || arr[0].equals("VI") || arr[0].equals("VII") || arr[0].equals("VIII")
                    || arr[0].equals("IX") || (arr[0].equals("X")
                    && arr[1].equals("I")) || arr[1].equals("II") || arr[1].equals("III") || arr[1].equals("IV")
                    || arr[1].equals("V") || arr[1].equals("VI") || arr[1].equals("VII") || arr[1].equals("VIII")
                    || arr[1].equals("IX") || arr[1].equals("X")) {
                String arab1 = getRomanToArab(arr[0]);
                String arab2 = getRomanToArab(arr[1]);

                int a = Integer.parseInt(arab1);
                int b = Integer.parseInt(arab2);
                int res = culculate(a, b, str);
                String resArab = String.valueOf(res);

                String resRoman = getArabToRoman(resArab);
                System.out.println(resRoman);
            } else {
                int a = Integer.parseInt(arr[0]);
                int b = Integer.parseInt(arr[1]);
                int res = culculate(a, b, str);
                System.out.println(res);

            }
        }catch (NumberFormatException e){
            System.out.println("Вычисления производятся только либо с арабскими цифрами от 1 до 10, либо с римскими от I до X! Введите пожалуйста либо арабские, либо римские цифры!!!");
        }


        }

    public static String getRomanToArab(String arr1){
        try {
            if (arr1.equals("I")) {
                arr1 = String.valueOf(RomanToArab.I.getTranslation());
            }else if (arr1.equals("II")) {
                arr1 = String.valueOf(RomanToArab.II.getTranslation());
            }else if (arr1.equals("III")) {
                arr1 = String.valueOf(RomanToArab.III.getTranslation());
            }else if (arr1.equals("IV")) {
                arr1 = String.valueOf(RomanToArab.IV.getTranslation());
            }else if (arr1.equals("V")) {
                arr1 = String.valueOf(RomanToArab.V.getTranslation());
            }else if (arr1.equals("VI")) {
                arr1 = String.valueOf(RomanToArab.VI.getTranslation());
            }else if (arr1.equals("VII")) {
                arr1 = String.valueOf(RomanToArab.VII.getTranslation());
            }else if (arr1.equals("VIII")) {
                arr1 = String.valueOf(RomanToArab.VIII.getTranslation());
            }else if (arr1.equals("IX")) {
                arr1 = String.valueOf(RomanToArab.IX.getTranslation());
            }else if (arr1.equals("X")) {
                arr1 = String.valueOf(RomanToArab.X.getTranslation());
            }else{
                System.out.println("Введите либо два римских, либо два арабских числа");
            }
            return arr1;
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Неверный формат данных!");
        }
    }
    public static int culculate(int num1, int num2, String oper) {
        int result = 0;
        if (oper == "+") {
            result = num1 + num2;
        } else if (oper == "-") {
            result = num1 - num2;
        } else if (oper == "*") {
            result = num1 * num2;
        } else if (oper == "/") {
            result = num1 / num2;
        }

        return result;
    }

    public static String getOperation(String string) {
        String[] a = {"+", "-", "*", "/"};
        String operation = " ";
        for (int i = 0; i < a.length; i++) {
            if (string.contains(a[i])) {
                operation = a[i];
                break;
            }

        }

        return operation;
    }
    public static String getArabToRoman(String arab){
        switch (arab){
                case "1":
                    arab = String.valueOf(RomanToArab.valueOf("I"));
                    break;
                case "2":
                    arab = String.valueOf(RomanToArab.valueOf("II"));
                    break;
                case "3":
                    arab = String.valueOf(RomanToArab.valueOf("III"));
                    break;
                case "4":
                    arab = String.valueOf(RomanToArab.valueOf("IV"));
                    break;
                case "5":
                    arab = String.valueOf(RomanToArab.valueOf("V"));
                    break;
                case "6":
                    arab = String.valueOf(RomanToArab.valueOf("VI"));
                    break;
                case "7":
                    arab = String.valueOf(RomanToArab.valueOf("VII"));
                    break;
                case "8":
                    arab = String.valueOf(RomanToArab.valueOf("VIII"));
                    break;
                case "9":
                    arab = String.valueOf(RomanToArab.valueOf("XIV"));
                    break;
                case "10":
                    arab = String.valueOf(RomanToArab.valueOf("X"));
                    break;
                case "11":
                    arab = String.valueOf(RomanToArab.valueOf("XI"));
                    break;
                case "12":
                    arab = String.valueOf(RomanToArab.valueOf("XII"));
                    break;
                case "13":
                    arab = String.valueOf(RomanToArab.valueOf("XIII"));
                    break;
                case "14":
                    arab = String.valueOf(RomanToArab.valueOf("XIV"));
                    break;
                case "15":
                    arab = String.valueOf(RomanToArab.valueOf("XV"));
                    break;
                case "16":
                    arab = String.valueOf(RomanToArab.valueOf("XVI"));
                    break;
                case "17":
                    arab = String.valueOf(RomanToArab.valueOf("XVII"));
                    break;
                case "18":
                    arab = String.valueOf(RomanToArab.valueOf("XVIII"));
                    break;
                case "19":
                    arab = String.valueOf(RomanToArab.valueOf("XIX"));
                    break;
                case "20":
                    arab = String.valueOf(RomanToArab.valueOf("XX"));
                    break;
                case "21":
                    arab = String.valueOf(RomanToArab.valueOf("XXI"));
                    break;
                case "22":
                    arab = String.valueOf(RomanToArab.valueOf("XXII"));
                    break;
                case "23":
                    arab = String.valueOf(RomanToArab.valueOf("XXIII"));
                    break;
                case "24":
                    arab = String.valueOf(RomanToArab.valueOf("XXIV"));
                    break;
                case "25":
                    arab = String.valueOf(RomanToArab.valueOf("XXV"));
                    break;
                case "26":
                    arab = String.valueOf(RomanToArab.valueOf("XXVI"));
                    break;
                case "27":
                    arab = String.valueOf(RomanToArab.valueOf("XXVII"));
                    break;
                case "28":
                    arab = String.valueOf(RomanToArab.valueOf("XXVIII"));
                    break;
                case "29":
                    arab = String.valueOf(RomanToArab.valueOf("XXXIV"));
                    break;
                case "30":
                    arab = String.valueOf(RomanToArab.valueOf("XXX"));
                    break;
                case "31":
                    arab = String.valueOf(RomanToArab.valueOf("XXXI"));
                    break;
                case "32":
                    arab = String.valueOf(RomanToArab.valueOf("XXXII"));
                    break;
                case "33":
                    arab = String.valueOf(RomanToArab.valueOf("XXXIII"));
                    break;
                case "34":
                    arab = String.valueOf(RomanToArab.valueOf("XXXIV"));
                    break;
                case "35":
                    arab = String.valueOf(RomanToArab.valueOf("XXXV"));
                    break;
                case "36":
                    arab = String.valueOf(RomanToArab.valueOf("XXXVI"));
                    break;
                case "37":
                    arab = String.valueOf(RomanToArab.valueOf("XXXVII"));
                    break;
                case "38":
                    arab = String.valueOf(RomanToArab.valueOf("XXXVIII"));
                    break;
                case "39":
                    arab = String.valueOf(RomanToArab.valueOf("XXXIX"));
                    break;
                case "40":
                    arab = String.valueOf(RomanToArab.valueOf("XL"));
                    break;
                case "41":
                    arab = String.valueOf(RomanToArab.valueOf("XLI"));
                    break;
                case "42":
                    arab = String.valueOf(RomanToArab.valueOf("XLII"));
                    break;
                case "43":
                    arab = String.valueOf(RomanToArab.valueOf("XLIII"));
                    break;
                case "44":
                    arab = String.valueOf(RomanToArab.valueOf("XLIV"));
                    break;
                case "45":
                    arab = String.valueOf(RomanToArab.valueOf("XLV"));
                    break;
                case "46":
                    arab = String.valueOf(RomanToArab.valueOf("XLVI"));
                    break;
                case "47":
                    arab = String.valueOf(RomanToArab.valueOf("XLVII"));
                    break;
                case "48":
                    arab = String.valueOf(RomanToArab.valueOf("XLVIII"));
                    break;
                case "49":
                    arab = String.valueOf(RomanToArab.valueOf("XLXIV"));
                    break;
                case "50":
                    arab = String.valueOf(RomanToArab.valueOf("L"));
                    break;
                case "51":
                    arab = String.valueOf(RomanToArab.valueOf("LI"));
                    break;
                case "52":
                    arab = String.valueOf(RomanToArab.valueOf("LII"));
                    break;
                case "53":
                    arab = String.valueOf(RomanToArab.valueOf("LIII"));
                    break;
                case "54":
                    arab = String.valueOf(RomanToArab.valueOf("LIV"));
                    break;
                case "55":
                    arab = String.valueOf(RomanToArab.valueOf("LV"));
                    break;
                case "56":
                    arab = String.valueOf(RomanToArab.valueOf("LVI"));
                    break;
                case "57":
                    arab = String.valueOf(RomanToArab.valueOf("LVII"));
                    break;
                case "58":
                    arab = String.valueOf(RomanToArab.valueOf("LVIII"));
                    break;
                case "59":
                    arab = String.valueOf(RomanToArab.valueOf("LIX"));
                    break;
                case "60":
                    arab = String.valueOf(RomanToArab.valueOf("LX"));
                    break;
                case "61":
                    arab = String.valueOf(RomanToArab.valueOf("LXI"));
                    break;
                case "62":
                    arab = String.valueOf(RomanToArab.valueOf("LXII"));
                    break;
                case "63":
                    arab = String.valueOf(RomanToArab.valueOf("LXIII"));
                    break;
                case "64":
                    arab = String.valueOf(RomanToArab.valueOf("LXIV"));
                    break;
                case "65":
                    arab = String.valueOf(RomanToArab.valueOf("LXV"));
                    break;
                case "66":
                    arab = String.valueOf(RomanToArab.valueOf("LXVI"));
                    break;
                case "67":
                    arab = String.valueOf(RomanToArab.valueOf("LXVII"));
                    break;
                case "68":
                    arab = String.valueOf(RomanToArab.valueOf("LXVIII"));
                    break;
                case "69":
                    arab = String.valueOf(RomanToArab.valueOf("LXXIV"));
                    break;
                case "70":
                    arab = String.valueOf(RomanToArab.valueOf("LXX"));
                    break;
                case "71":
                    arab = String.valueOf(RomanToArab.valueOf("LXXI"));
                    break;
                case "72":
                    arab = String.valueOf(RomanToArab.valueOf("LXXII"));
                    break;
                case "73":
                    arab = String.valueOf(RomanToArab.valueOf("LXXIII"));
                    break;
                case "74":
                    arab = String.valueOf(RomanToArab.valueOf("LXXIV"));
                    break;
                case "75":
                    arab = String.valueOf(RomanToArab.valueOf("LXXV"));
                    break;
                case "76":
                    arab = String.valueOf(RomanToArab.valueOf("LXXVI"));
                    break;
                case "77":
                    arab = String.valueOf(RomanToArab.valueOf("LXXVII"));
                    break;
                case "78":
                    arab = String.valueOf(RomanToArab.valueOf("LXXVIII"));
                    break;
                case "79":
                    arab = String.valueOf(RomanToArab.valueOf("LXXIX"));
                    break;
                case "80":
                    arab = String.valueOf(RomanToArab.valueOf("LXXX"));
                    break;
                case "81":
                    arab = String.valueOf(RomanToArab.valueOf("LXXXI"));
                    break;
                case "82":
                    arab = String.valueOf(RomanToArab.valueOf("LXXXII"));
                    break;
                case "83":
                    arab = String.valueOf(RomanToArab.valueOf("LXXXIII"));
                    break;
                case "84":
                    arab = String.valueOf(RomanToArab.valueOf("LXXXIV"));
                    break;
                case "85":
                    arab = String.valueOf(RomanToArab.valueOf("LXXXV"));
                    break;
                case "86":
                    arab = String.valueOf(RomanToArab.valueOf("LXXXVI"));
                    break;
                case "87":
                    arab = String.valueOf(RomanToArab.valueOf("LXXXVII"));
                    break;
                case "88":
                    arab = String.valueOf(RomanToArab.valueOf("LXXXVIII"));
                    break;
                case "89":
                    arab = String.valueOf(RomanToArab.valueOf("LXXXXIV"));
                    break;
                case "90":
                    arab = String.valueOf(RomanToArab.valueOf("XC"));
                    break;
                case "91":
                    arab = String.valueOf(RomanToArab.valueOf("XCI"));
                    break;
                case "92":
                    arab = String.valueOf(RomanToArab.valueOf("XCII"));
                    break;
                case "93":
                    arab = String.valueOf(RomanToArab.valueOf("XCIII"));
                    break;
                case "94":
                    arab = String.valueOf(RomanToArab.valueOf("XCIV"));
                    break;
                case "95":
                    arab = String.valueOf(RomanToArab.valueOf("XCV"));
                    break;
                case "96":
                    arab = String.valueOf(RomanToArab.valueOf("XCVI"));
                    break;
                case "97":
                    arab = String.valueOf(RomanToArab.valueOf("XCVII"));
                    break;
                case "98":
                    arab = String.valueOf(RomanToArab.valueOf("XCVIII"));
                    break;
                case "99":
                    arab = String.valueOf(RomanToArab.valueOf("XCIX"));
                    break;
                case "100":
                    arab = String.valueOf(RomanToArab.valueOf("C"));
                    break;

            default:
                throw new IllegalStateException("Unexpected value: " + arab);
        }

        return arab;
    }
}

