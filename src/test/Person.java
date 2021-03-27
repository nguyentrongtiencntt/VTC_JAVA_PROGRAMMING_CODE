package test;

abstract class Person {
    abstract void eat();

}
class Main{
    public static void main(String[] args) {

       Person p = new Person() {
           @Override
           void eat() {
               System.out.println("Nothing to print!");
           }
       };
       p.eat();
    }

}
