package com.mazhiwei.mybatis.pojo;

/**
 * @author 马治伟
 * @version 1.0
 */
public class User {
   private int id;
   private String jname;
   private String description;

   public User() {
   }

   public User(int id, String jname, String description) {
      this.id = id;
      this.jname = jname;
      this.description = description;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getJname() {
      return jname;
   }

   public void setJname(String jname) {
      this.jname = jname;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   @Override
   public String toString() {
      return "User{" +
              "id=" + id +
              ", jname='" + jname + '\'' +
              ", description='" + description + '\'' +
              '}';
   }
}
