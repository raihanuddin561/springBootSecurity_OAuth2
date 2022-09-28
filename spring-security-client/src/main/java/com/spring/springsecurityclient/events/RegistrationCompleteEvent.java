package com.spring.springsecurityclient.events;

import com.spring.springsecurityclient.entity.User;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

@Component
public class RegistrationCompleteEvent extends ApplicationEvent {
    private User user;
    private String applicationUrl;
    public RegistrationCompleteEvent(User user, String applicationUrl) {
        super(user);
        this.user=user;
        this.applicationUrl=applicationUrl;
    }
}