package com.mazhiwei.mybatis.pojo;

/**
 * @author 马治伟
 * @version 1.0
 */
public class Users {
   private Integer id;
   private String name;
   private String addr;

   public Users(Integer id, String name, String addr) {
      this.id = id;
      this.name = name;
      this.addr = addr;
   }

   public Users() {
   }

   @Override
   public String toString() {
      return "Users{" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", addr='" + addr + '\'' +
              '}';
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getAddr() {
      return addr;
   }

   public void setAddr(String addr) {
      this.addr = addr;
   }
}
