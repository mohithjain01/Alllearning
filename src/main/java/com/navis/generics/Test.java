package com.navis.generics;


import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        Living l = new Living();
        Animal a = new Animal();
        Plant p = new Plant();
        Dog d = new Dog();

        Living l1 = new Animal();
        l1 = new Plant();
        Living l2 = new Plant();
        Living l3 = new Dog();

//Animal a1 = new Living();
        Living lra[] = new Animal[10];


      //  ArrayList<Living> al = new ArrayList<Animal>();
        // In generics this type cannot be polymorphic type. It has to be fixed at the time of compilation only. Generics is the opposite of polymorphism.
        //Why it does that - t will do it because in run time you dont want any class cast exception.
        //Retention policy - annotation -
        ArrayList<Animal> al = new ArrayList<Animal>();
        ArrayList<Plant> al1 = new ArrayList<Plant>();
        method(al1);
        al.add(new Dog());
        method(al);
        method2(al);
        //This is possible

    }
    static void method1(List <?> list)
    {
        //Any list can be accessed here
    }
    static void method(List<? extends Living> list)
    {
        //Any list that is the child of Living can use this.
        System.out.println(list.get(0));
        list.add(new Living());
    }
    static void method2(List <? super Dog> list)
    {
        //Any methods that is the parent or super parent of the dog class
        list.add(new Animal());
    }

}
