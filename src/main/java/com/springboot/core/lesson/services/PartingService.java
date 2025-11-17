package com.springboot.core.lesson.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PartingService {

    private String goodbyeMessage;
    private String seeYouLaterMessage;

    @Autowired
    public void setGoodbyeMessage(@Qualifier("goodbye") String goodbyeMessage) {
        this.goodbyeMessage = goodbyeMessage;
    }

    @Autowired
    public void setSeeYouLaterMessage(@Qualifier("seeYouLater") String seeYouLaterMessage) {
        this.seeYouLaterMessage = seeYouLaterMessage;
    }

    public String goodbye() {
        return goodbyeMessage;
    }

    public String seeYouLater() {
        return seeYouLaterMessage;
    }
}