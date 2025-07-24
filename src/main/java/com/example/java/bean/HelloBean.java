package com.example.java.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class HelloBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // متدی که با دکمه فراخوانی میشه
    public void sayHello() {
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", "Hello " + name + "!"));
    }
    public String goToWelcome() {
        return "welcome?faces-redirect=true"; // یا بدون redirect: return "welcome";
    }

}
