package com.example.splitwise.models;

import lombok.Getter;
import java.util.Date;

public class BaseModel {

    private long id;
    private Date created_at;
    private Date updated_at;

}
//Base model contains all of our entities that are present on our project for duplication.
