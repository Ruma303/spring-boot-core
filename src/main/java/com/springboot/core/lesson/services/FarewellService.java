package com.springboot.core.lesson.services;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FarewellService {

    private final String goodbyeMessage;
    private final String seeYouLaterMessage;

    public FarewellService(
            @Qualifier("goodbye") String goodbyeMessage,
            @Qualifier("seeYouLater") String seeYouLaterMessage
    ) {
        this.goodbyeMessage = goodbyeMessage;
        this.seeYouLaterMessage = seeYouLaterMessage;
    }

    public String getGoodbye() {
        return goodbyeMessage;
    }

    public String getSeeYouLater() {
        return seeYouLaterMessage;
    }
}