package com.gridin.webserver.dbService.dataSets;

import java.time.LocalDate;

public class Customer {

    private int id;
    private String login;
    private String password;
    private String name;
    private String surname;
    private LocalDate dateBirth;

    public Customer() {
    }

    public Customer(String login, String password, String name, String surname, LocalDate dateBirth) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.dateBirth = dateBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }
}
