package com.example.capstoneproject.model;

import javax.persistence.*;

@Entity
public class Device {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String serialNumber;
    private String description;
    private Integer type;
    @ManyToOne
    private Employee employee;

    public Device(){

    }

    public Device(String serialNumber, String description, Integer type, Employee employee) {
        this.serialNumber = serialNumber;
        this.description = description;
        this.type = type;
        this.employee = employee;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }


}
