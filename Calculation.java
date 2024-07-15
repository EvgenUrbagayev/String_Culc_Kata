import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner scaner = new Scanner((System.in));
        System.out.println("Введите выражение: ");
        String string = scaner.nextLine();

        if (string.contains("+")) {
            String[] strings = string.split("\\+");



            switch (strings[0]) {

                case "I":
                    strings[0] = String.valueOf(Roma.I.getTranslation());
                    break;
                case "II":
                    strings[0] = String.valueOf(Roma.II.getTranslation());
                    break;
                case "III":
                    strings[0] = String.valueOf(Roma.III.getTranslation());
                    break;
                case "IV":
                    strings[0] = String.valueOf(Roma.IV.getTranslation());
                    break;
                case "V":
                    strings[0] = String.valueOf(Roma.V.getTranslation());
                    break;
                case "VI":
                    strings[0] = String.valueOf(Roma.VI.getTranslation());
                    break;
                case "VII":
                    strings[0] = String.valueOf(Roma.VII.getTranslation());
                    break;
                case "VIII":
                    strings[0] = String.valueOf(Roma.VIII.getTranslation());
                    break;
                case "IX":
                    strings[0] = String.valueOf(Roma.IX.getTranslation());
                    break;
                case "X":
                    strings[0] = String.valueOf(Roma.X.getTranslation());
                    break;
            }
            switch (strings[1]) {
                case "I":
                    strings[1] = String.valueOf(Roma.I.getTranslation());
                    break;
                case "II":
                    strings[1] = String.valueOf(Roma.II.getTranslation());
                    break;
                case "III":
                    strings[1] = String.valueOf(Roma.III.getTranslation());
                    break;
                case "IV":
                    strings[1] = String.valueOf(Roma.IV.getTranslation());
                    break;
                case "V":
                    strings[1] = String.valueOf(Roma.V.getTranslation());
                    break;
                case "VI":
                    strings[1] = String.valueOf(Roma.VI.getTranslation());
                    break;
                case "VII":
                    strings[1] = String.valueOf(Roma.VII.getTranslation());
                    break;
                case "VIII":
                    strings[1] = String.valueOf(Roma.VIII.getTranslation());
                    break;
                case "IX":
                    strings[1] = String.valueOf(Roma.IX.getTranslation());
                    break;
                case "X":
                    strings[1] = String.valueOf(Roma.X.getTranslation());
                    break;

            }

            int res = Integer.parseInt(strings[0]) + Integer.parseInt(strings[1]);
            System.out.println(res);



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




        } else if (string.contains("-")) {
            String[] strings = string.split("-");
            int res = Integer.parseInt(strings[0]) - Integer.parseInt(strings[1]);
            System.out.println(res);
        } else if (string.contains("*")) {
            String[] strings = string.split("\\*");
            int res = Integer.parseInt(strings[0]) * Integer.parseInt(strings[1]);
            System.out.println(res);
        } else if (string.contains("/")) {
            String[] strings = string.split("/");
            int res = Integer.parseInt(strings[0]) / Integer.parseInt(strings[1]);
            System.out.println(res);
        } else try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Введен не корректный оператор!");
        }



    }

}






