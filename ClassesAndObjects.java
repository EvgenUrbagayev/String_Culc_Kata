public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Роман";
        person1.age = 50;
        person1.sayHello();
        //System.out.println("Меня зовут "+ person1.name +"," +" мне "+person1.age + " лет");
        Person person2 = new Person();
        person2.name = "Вова";
        person2.age = 39;
        person2.speak();
        person2.sayHello();
        int year1 = person1.calculateYearsToRetirement();
        int year2 = person2.calculateYearsToRetirement();
        System.out.println("Первому человеку до пенсии - " + year1 + " лет");
        System.out.println("Второму человеку до пенсии - " + year2 + " лет");
       //System.out.println("Меня зовут "+ person2.name +"," +" мне "+person2.age + " лет");
    }
}

class Person{
    String name;
    int age;

    //void calculateYearsToRetirement(){
      //  int years = 65 - age;
        //System.out.println("Количество лет до пенсии: " + years + " лет");
    //}

    int calculateYearsToRetirement(){
        int years = 65 - age;
        return years;
    }


    void speak(){
        for (int i = 0; i<3;i++){
        System.out.println("Меня зовут "+ name +"," +" мне "+age + " лет");}
    }
    void sayHello(){
        System.out.println("Привет!");
    }
}