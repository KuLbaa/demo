package com.example.demo;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Department")
public class Department {
    @ManyToOne
    Address address;
    @OneToOne
    Manager manager;
    @OneToMany
    private List<Employee> employeeList = new ArrayList<>();
    private Long id;

    public Department(Address address, Manager manager) {
        setManager(manager);
        setAddress(address);
    }

    public Department() {}

    @ManyToOne
    public Address getAddress() {
        return address;
    }

    @OneToOne
    public Manager getManager() {
        return manager;
    }

    @OneToMany
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void setManager(Manager manager) {
        if(this.manager != manager) {
            this.manager = manager;

            manager.setDepartment(this);
        }
    }

    public void setAddress(Address address){
        if(this.address != address){
            this.address = address;
            address.addDepartment(this);
        }
    }

    public void addEmployee(Employee employee){
        if(!employeeList.contains(employee)){
            employeeList.add(employee);

            employee.setDepartment(this);
        }
    }

    @Override
    public String toString() {
        return "Department{" +
                "address=" + address +
                "manager=" + getManager().getName() + " " + getManager().getSurname() +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    public Long getId() {
        return id;
    }
}
