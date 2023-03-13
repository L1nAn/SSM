# SSM
## Mybatis

### 2023/3/12

#### Mybatis简介

#### 搭建Mybatis

#### 核心配置文件详解

#### Mybatis 的增删改查

#### Mybatis的获取参数值的两种方式

#### Mybatis的各种查询功能

#### 特殊SQL的执行

#### 自定义映射resultMap

#### 动态SQL

如果数据为null 或者为空字符串的情况下的处理方式  

不确定查询数据有几条的话，返回集合

##### 标签

JavaWeb已经学习（在mybatis中)

if、where、***trim（这个用法？？***）、(**choose、when、otherwise**）、foreach

choose、when、 otherwise相当于if...else if..else，所以最多判断一个条件，所以语句中不需要加and。when至少设置一个，ottherwise最多一个。

**List<Emp> list = Arrays.asList(emp1,emp2,emp3)** 添加 多个emp对象在list集合中

公共SQL片段

### 2023/3/13

#### Mybatis的缓存

##### 一级缓存

一级缓存默认开启

一级缓存清空**sqlSession.clearCache()**  这个方法

失效情况

##### 二级缓存

实体类一定不要忘了**实现序列化接口**

失效情况

相关配置  都有默认值，不需要我们配置

先二后一，一级缓存中的数据二级缓存中可能没有，SqlSession关闭之后，一级缓存中的数据会写入二级缓存

##### 整合第三方缓存EHCache

这是针对二级缓存的

#### Mybatis的逆向工程

##### 添加功能、修改功能

普通添加、修改：会改变默认值或者已经存在的值为null

条件添加、修改：不会改变默认值或者已经存在的值

一些实体类的构造函数要记得自己添加

问题：数据库的版本问题？？？版本不一样是否mapper接口里面的方法也不一样？版本越高，方法越多？？？



根据条件查询

#### 分页插件

拦截器：会自动在查询数据中添加limit关键字

查询功能开始之前，开始分页功能，下面是开启分页功能。

```java
PageHelper.startPage(1,4);
```

**查询数据的返回值可以设置为Page。**需要自己在mapper接口设定

pageInfo设定

```java
List<Brand> brands = mapper.selectByExample(null);
PageInfo<Brand> pageInfo = new PageInfo<Brand>(brands, 5);//属性自己写之前看一下就好。
```

## Spring

### 2023/3/13

#### Spring简介

##### Spring概述

##### Spring家族

##### Spring Frame work

#### IOC

反转控制，就是提前弄好点的东西。

##### IOC容器

获取bean的三种方式

**如果组件类实现了接口，根据接口类型可以获取 bean 吗？**

XML文件里面必须是具体的实体类类型。

```xml
<bean id="StudentOne" class="com.mazhiwei.spring.pojo.Student"></bean>
```

```java
Person bean = ac.getBean(Person.class);
```

根据接口类型获取bean是上边的，可以，但是bean必须是唯一。

**如果一个接口有多个实现类，这些实现类都配置了 bean，根据接口类型可以获取 bean 吗？**

不能，因为bean不唯一。

根据类型来获取bean时，在满足bean唯一性的前提下，其实只是看：『对象 **instanceof** 指定的类型』的返回结果，只要返回的是true就可以认定为和类型匹配，能够获取到。**即：**通过bean的类型、bean所继承的类的类型、bean所实现的接口的类型都可以获取bean。

###### 依赖注入（DI）

依赖注入：之前是主动获取，现在是被动接受

为实体类型中的属性（**不是成员变量，一定要区分开**）赋值的过程

setter注入、构造器注入

为类类型的属性赋值

##### 基于XML管理bean

##### 基于注解管理bean



#### AOP

#### 声明式事务

2023/3/20结束
