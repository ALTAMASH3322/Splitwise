package com.example.splitwise.models;


import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass  //
public class expense extends BaseModel {
    private String description;
    private Double amount;
    private Date createdOn;
   // private Group group;
    private List<User> users = new ArrayList<>();
    private List<UserExpenses> paidby = new ArrayList<>();
    private List<UserExpenses> owedby = new ArrayList<>();
}
