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

if、where、trim、(**choose、when、otherwise**）、foreach

choose、when、 otherwise相当于if...else if..else，所以最多判断一个条件，所以语句中不需要加and。when至少设置一个，ottherwise最多一个。

**List<Emp> list = Arrays.asList(emp1,emp2,emp3)** 添加 多个emp对象在list集合中

公共SQL片段

### 2023/3/13

#### Mybatis的缓存

##### 一级缓存

一级缓存默认开启

一级缓存清空sqlSession.clearCache()  这个方法

失效情况

##### 二级缓存

实体类一定不要忘了**实现序列化接口**

失效情况

相关配置  都有默认值，不需要我们配置

先二后一，一级缓存中的数据二级缓存中可能没有

##### 整合第三方缓存EHCache

这是针对二级缓存的

#### Mybatis的逆向工程

#### 分页插件











2023/3/20结束
