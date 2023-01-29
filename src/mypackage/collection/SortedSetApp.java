package mypackage.collection;

import mypackage.collection.data.Person;
import mypackage.collection.data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {
        SortedSet<Person> peoples = new TreeSet<>(new PersonComparator().reversed());
        peoples.add(new Person("Nursalim"));
        peoples.add(new Person("Adi"));
        peoples.add(new Person("Fera"));

        for (var people: peoples){
            System.out.println(people.getName());
        }

        SortedSet<Person> immutableSortedSet = Collections.unmodifiableSortedSet(peoples);
        immutableSortedSet.add(new Person("Jenglot"));



    }
}
