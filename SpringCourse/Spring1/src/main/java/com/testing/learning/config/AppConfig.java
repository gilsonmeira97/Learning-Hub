package com.testing.learning.config;

import com.testing.learning.Alien;
import com.testing.learning.Computer;
import com.testing.learning.Desktop;
import com.testing.learning.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.testing.learning")
public class AppConfig {
//
//    @Bean
//    public Alien alien(Computer com){ //@Qualifier("laptop")
//        Alien obj = new Alien();
//        obj.setAge(22);
//        obj.setCom(com);
//        return obj;
//    }
//
////    @Bean(name = {"comp", "comp3", "desktop"})
//    @Bean
////    @Scope("prototype")
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop() {
//        return new Laptop();
//    }

}
