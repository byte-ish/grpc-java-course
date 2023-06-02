package com.learn.protobuf;

import com.learn.models.Person;

public class PersonDemo {
    public static void main(String[] args) {
        Person person = Person.newBuilder()
                .setName("Jack")
                .setAge(30)
                .build();

        System.out.println(person);
    }
}
