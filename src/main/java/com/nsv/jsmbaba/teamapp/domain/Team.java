package com.nsv.jsmbaba.teamapp.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teams")
@Getter
@Setter
@ToString
public class Team {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private int rating;
}
