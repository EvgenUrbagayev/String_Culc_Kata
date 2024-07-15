public class Test {      // Этот способ использовался до появления Enum:
    private static final int DOG = 0;
    public static final int CAT = 1;
    public static final int FROG = 2;
    public static void main(String[] args) {
        int animal = DOG;

        switch (animal){
            case DOG:
                System.out.println("It's a dog");
                break;
            case FROG:
                System.out.println("It's a frog");
                break;
            case CAT:
                System.out.println("It's a cat");
            default:
                System.out.println("It's a not animal");
        }



    }
}
