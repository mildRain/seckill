# 慕课网Java高并发秒杀的源码


## 项目介绍
此秒杀项目前端使用了Bootsrap、jQuery, 后端主要使用了Spring、SpringMVC、Mybatis，
数据库使用了MySQL, 缓存使用了Redis。同时使用了RESTful的风格，整个项目自底向上开发，
由DAO层到Service层，再到Web层，最后再回头分析秒杀的瓶颈所在，并完成了优化。对新手
来说这是一个不可多得的学习案例。

## 开发环境
| 软件 | 版本 |
| :------: | :------: |
| IntelliJ IDEA | 2016.2.2 |
| MySQL | 8.0 |
| Redis | 3.2.100 |

## 系统环境
Win 10

## 项目依赖
| groupId | artifactId | version |
| :------: | :------: | :------: |
| junit | junit | 4.12 |
| org.slf4j | slf4j-api | 1.7.21 |
| ch.qos.logback | logback-core | 1.1.7 |
| ch.qos.logback | logback-classic | 1.1.7 |
| mysql | mysql-connector-java | 6.0.3 |
| c3p0 | c3p0 | 0.9.1.2 |
| org.mybatis | mybatis | 3.4.1 |
| org.mybatis | mybatis-spring | 1.3.0 |
| taglibs | standard | 1.1.2 |
| jstl | jstl | 1.2 |
| com.fasterxml.jackson.core | jackson-databind | 2.8.2 |
| javax.servlet | javax.servlet-api | 3.1.0 |
| org.springframework | spring-core | 4.3.2.RELEASE |
| org.springframework | spring-beans | 4.3.2.RELEASE |
| org.springframework | spring-context | 4.3.2.RELEASE |
| org.springframework | spring-jdbc | 4.3.2.RELEASE |
| org.springframework | spring-tx | 4.3.2.RELEASE |
| org.springframework | spring-web | 4.3.2.RELEASE |
| org.springframework | spring-webmvc | 4.3.2.RELEASE |
| org.springframework | spring-test | 4.3.2.RELEASE |
| redis.clients | jedis | 2.9.0 |
| com.dyuproject.protostuff | protostuff-core | 1.0.10 |
| com.dyuproject.protostuff | protostuff-runtime | 1.0.10 |
| commons-collections | commons-collections | 3.2.1 |