package com.example.splitwise.models;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserExpenses extends BaseModel {

    private User user;
    private expense expenses;
    private Double amt;
    private ExpenseType type;

}
