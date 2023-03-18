package com.example.fuchuang.pojo;


import jakarta.persistence.*;

@Entity
@Table(name= "user")//数据库表名

public class User {
    @Id//定义主键，该注解下面的属性即为主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private int id;

    @Column(name="name")//定义表中的每一列，即每一个属性
    private String name;

    @Column(name="age")
    private int age;

    @Column(name="email")
    private String email;


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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
