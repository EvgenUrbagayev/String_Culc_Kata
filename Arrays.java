public class Arrays {
    public static void main(String[] args) {
                char character = 'a'; // примитивный тип данных
        String s = "Hello"; // ссылочный тип данных
        String s1 = new String("Hello"); // тоже самое, что и строкой выше


        int number = 10; // примитивный тип данных   в коробке [10]
        int[] numbers = new int[5];   // numbers ->  [массив]    ссылочный тип данных
        System.out.println(numbers[1]);
        for (int i=0; i<numbers.length; i++){
            numbers[i] = i*10;
        }
        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println();
        int[] numbers1 = {1,2,3};
        for ( int i=0; i<numbers1.length; i++){
            System.out.println(numbers1[i]);
        }

    }

    public static void sort(String[] strings) {
    }
}
