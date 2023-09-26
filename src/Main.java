import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task5();
        task6();
        task7();
        task8();


        System.out.println("Task 9");
        Person person = new Person("Lyapis", "Trubetskoy");
        System.out.println(person);
        changePerson(person);
        System.out.println(person);

        System.out.println("Task 10");
        Person person1 = new Person("Lyapis", "Trubetskoy");
        System.out.println(person1);
        changePerson2(person1);
        System.out.println(person1);
    }

    public static void task5() {
        System.out.println("Task 5");
        int value = 33;
        changeValue(value);
        System.out.println(value);
    }

    public static void changeValue(int value) {
        value = 22;
        System.out.println("value = " + value);
    }

    public static void task6() {
        System.out.println("Task 6");
        Integer value6 = 33;
        changeValue6(value6);
        System.out.println(value6);
    }

    public static void changeValue6(Integer value6) {
        value6 = 22;
        System.out.println("value6 = " + value6);
    }

    public static void task7() {
        System.out.println("Task 7");
        Integer[] value7 = {3, 4};
        changeValue7(value7);
        System.out.println(Arrays.toString(value7));
    }

    public static void changeValue7(Integer[] value7) {
        value7[0] = 1;
        value7[1] = 2;
        System.out.println("value7 = " + Arrays.toString(value7));
    }


    public static void changeValue8(Integer[] value8) {
        value8[0] = 99;
        System.out.println("value8 = " + Arrays.toString(value8));
    }

    public static void task8() {
        System.out.println("Task 8");
        Integer[] value8 = {3, 4};
        changeValue8(value8);
        System.out.println(Arrays.toString(value8));
    }
    public static void changePerson(Person person) {
        person = new Person("Ilya", "Lagutenko");
        //person.setName("Ilya");
        //person.setSurname("Lagutenko");
    }
    public static void changePerson2(Person person1) {
        //person = new Person("Ilya", "Lagutenko");
        person1.setName("Ilya");
        person1.setSurname("Lagutenko");
    }

}