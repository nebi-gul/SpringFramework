package com.nebigul.bean;
import lombok.Getter;
import lombok.Setter;

import javax.enterprise.context.ApplicationScoped;
import  javax.inject.Named;
@Setter
@Getter
@ApplicationScoped
@Named(value = "cdiBean")
public class JsfBean {
    private String etiya;

    public  JsfBean (){
        this.etiya="Spring Boot Eğitimine Hoşgeldiniz.";
    }
}

