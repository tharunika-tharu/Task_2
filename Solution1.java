public class Solution1 {
    //program the display name and age of a person
    static class Person{
        private String name;
        private int age;

        //default constructor
        Person(String name){
            this.name = name;
            this.age = 18;
        }
        //display method for name and age
        public void displayDetails(){
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
        }
    }
    public static void main(String[] args) {
        Person person1 = new Person("tharunika");
        person1.displayDetails();

    }
}
