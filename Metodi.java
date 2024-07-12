public class Metodi {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.setNameAndAge("Роман",20);
        //person1.age = 50;
        person1.speak();
        //System.out.println("Меня зовут "+ person1.name +"," +" мне "+person1.age + " лет");
        Person1 person2 = new Person1();
        //person2.name = "Вова";
        //person2.age = 39;
        String s2 = "Вова";
        person2.setNameAndAge(s2,30);
        person2.speak();
        //person2.sayHello();

        int years1 = person1.calculateYearsToRetirement();
        int years2 = person2.calculateYearsToRetirement();
        //System.out.println("Меня зовут "+ person2.name +"," +" мне "+person2.age + " лет");
        System.out.println("Первому человеку " + years1 + " лет до пенсии");
        System.out.println("Второму человеку " + years2 + " лет до пенсии");
    }
}

class Person1{
    String name;
    int age;

    void setNameAndAge(String userName, int userAge){
        name = userName;
        age = userAge;
    }

    int calculateYearsToRetirement(){
        int years = 65 - age;
        return years;
    }

    void speak(){
        for (int i=0; i<3; i++){
            System.out.println("Меня зовут " + name + ", мне " + age + " лет");
        }
    }

    void sayHello(){
        System.out.println("Hello, World!");
    }
}
