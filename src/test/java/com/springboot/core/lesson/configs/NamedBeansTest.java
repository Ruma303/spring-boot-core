package com.springboot.core.lesson.configs;

import com.springboot.core.lesson.services.FarewellService;
import com.springboot.core.lesson.services.GoodbyeClient;
import com.springboot.core.lesson.services.PartingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class NamedBeansTest {

    @Autowired
    GoodbyeClient goodbyeClient;

    @Autowired
    FarewellService farewellService;

    @Autowired
    PartingService partingService;

    @Test
    void testSayGoodbyeFromGoodbyeClient() {
        System.out.println(goodbyeClient.sayGoodbye());
    }

    @Test
    void testSaySeeYouLaterFromGoodbyeClient() {
        System.out.println(goodbyeClient.saySeeYouLater());
    }

    @Test
    void testGetGoodbyeFromFarewellService() {
        System.out.println(farewellService.getGoodbye());
    }

    @Test
    void testGetSeeYouLaterFromFarewellService() {
        System.out.println(farewellService.getSeeYouLater());
    }

    @Test
    void testGoodbyeFromPartingService() {
        System.out.println(partingService.goodbye());
    }

    @Test
    void testSeeYouLaterFromPartingService() {
        System.out.println(partingService.seeYouLater());
    }
}
