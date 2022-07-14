package az.spring.hibernate.model;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "emp")
@Table
@Data // for lombok
public class Employee {

    @Id  // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // auto increment
    private int id;

    @Column(name = "firstname",length = 20)
    private String name;

    private String surname;
    private int age;
    private int salary;

}
