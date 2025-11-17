package com.springboot.core.lesson.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class GoodbyeClient {

    @Autowired
    @Qualifier("goodbye")
    private String goodbyeMessage;

    @Autowired
    @Qualifier("seeYouLater")
    private String seeYouLaterMessage;

    public String sayGoodbye() {
        return goodbyeMessage;
    }

    public String saySeeYouLater() {
        return seeYouLaterMessage;
    }
}