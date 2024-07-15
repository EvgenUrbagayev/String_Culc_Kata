import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи свой возраст: ");
        //int age = scanner.nextInt();
        String age = scanner.nextLine();
        switch (age){
            //case 0:
            case "ноль":
                System.out.println("Ты родился!");
                break;
            //case 7:
            case "семь":
                System.out.println("Ты пошел в школу!");
                break;
            //case 18:
            case "восемнадцать":
                System.out.println("Ты закончил школу!");
                break;
            default:
                System.out.println("Ни одно из условий не подошло");






        }



    }
}
