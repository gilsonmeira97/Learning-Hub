package com.testing.learning;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Primary
public class Desktop implements Computer {

    public Desktop() {
        System.out.println("Creating a desktop");
    }

    @Override
    public void compile() {
        System.out.println("Compiling using desktop");
    }
}
