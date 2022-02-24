package sk.wynny.jpago.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String lname;
    private String role;
    private int vek;

    // private LocalDate nastupu;
    public Long getId() {
        return id;
    }

    public Employee() {
    }

    public Employee(String name, String lname, String role, int vek) {

        this.name = name;
        this.lname = lname;
        this.role = role;
        this.vek = vek;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lname='" + lname + '\'' +
                ", role='" + role + '\'' +
                ", vek=" + vek +
                '}';
    }
}

