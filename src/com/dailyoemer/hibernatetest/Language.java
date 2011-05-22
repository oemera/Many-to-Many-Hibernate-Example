package com.dailyoemer.hibernatetest;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "language")
public class Language {

	private Integer id;
	private String name;
    private String code;
 
    public Language() {}
 
    @Id
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return this.id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }
 
    @Column(name = "name")
    public String getName() {
        return this.name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name = "code")
    public String getCode() {
        return this.code;
    }
 
    public void setCode(String code) {
        this.code = code;
    }
}
