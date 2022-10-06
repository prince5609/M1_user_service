package com.user.entity;


import javax.persistence.*;

@Entity
public class Contact {
    @Id
    private Long cId;
    private String cName;
    private String email;

    private Long userId;

    public Contact(Long cId, String cName, String email, Long userId) {
        this.cId = cId;
        this.cName = cName;
        this.email = email;
        this.userId = userId;
    }

    public Contact(){
    }

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}
