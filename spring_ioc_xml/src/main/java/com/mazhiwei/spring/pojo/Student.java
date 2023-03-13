package com.mazhiwei.spring.pojo;

/**
 * @author 马治伟
 * @version 1.0
 */
public class Student implements Person{
   private String name;
   private int age;
   private String description;
   private char gender;

   public Student() {
   }

   @Override
   public String toString() {
      return "Student{" +
              "name='" + name + '\'' +
              ", age=" + age +
              ", description='" + description + '\'' +
              ", gender=" + gender +
              '}';
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public char getGender() {
      return gender;
   }

   public void setGender(char gender) {
      this.gender = gender;
   }

   public Student(String name, int age, String description, char gender) {
      this.name = name;
      this.age = age;
      this.description = description;
      this.gender = gender;
   }
}
