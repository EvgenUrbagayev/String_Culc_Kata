public class Strings {
    public static void main(String[] args){
        String s = new String("JAva ");
        String s1 = "Hot Java, Hello";
        String s2 = "Hot Java";
        String s3 = "Very Hot Java";
        System.out.println(s.charAt(0));
        System.out.println(s.codePointAt(1));
        System.out.println(s.compareTo(s1));
        System.out.println(s.compareToIgnoreCase(s1));
        System.out.println(s.concat(s1));
        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s1));
        System.out.println(s.hashCode());
        System.out.println(s.indexOf(64));
        System.out.println(s.isEmpty());
        System.out.println(s.length());
        String [] strings = s2.split(" ");
        for (String element: strings) {
            System.out.println(element);
            System.out.println();

            System.out.println(s1.substring(2,8));

            char [] charArray = s1.toCharArray();
            for (char element1: charArray) {
                System.out.println(element1);
                System.out.println();
                System.out.println(s3.toLowerCase());
                System.out.println(s3.toUpperCase());
                String s4 = " Best Java ";
                System.out.println(s4);
                System.out.println(s4.trim());
            }
        }
    }
}
