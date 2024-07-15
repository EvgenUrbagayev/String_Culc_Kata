public class Animals {
    public static void main(String[] args) {
        Animal animal = Animal.CAT;
        switch (animal) {
            case DOG:
                System.out.println("It's a dog");
                break;
            case FROG:
                System.out.println("It's a frog");
                break;
            case CAT:
                System.out.println("It's a cat");
                break;
            default:
                System.out.println("It's a not animal");
        }

        Season season = Season.WINTER;
        Season winter = Season.WINTER;
        System.out.println(season.getTemperature());
        System.out.println(winter.ordinal());
        switch (season){
            case SUMMER:
                System.out.println("It's warm outside");
                break;
            case WINTER:
                System.out.println("It's cold outside");
                break;
        }

    }
}
