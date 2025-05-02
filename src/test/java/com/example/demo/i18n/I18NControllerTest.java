package com.example.demo.i18n;

import com.example.demo.profiles.I18NController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("IT")
@SpringBootTest
public class I18NControllerTest {

     @Autowired
     private I18NController i18NController;

     @Test
     public void testGetMessage() {
        System.out.println(i18NController.greet());
     }
}
