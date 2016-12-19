package dev.fnt.springapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropMessage {
	@Value("${${env}.message}")
    private String message;
    public void printMessage() {
        System.out.println(message);
    }
}