package com.github.gabrielgouv.greetings.impl.en;

import com.github.gabrielgouv.greetings.api.GreetingsService;

public class GreetingsEnglishService implements GreetingsService {

    @Override
    public String greetMessage(String name) {
        return "Hello " + name + ". Welcome!";
    }

}
