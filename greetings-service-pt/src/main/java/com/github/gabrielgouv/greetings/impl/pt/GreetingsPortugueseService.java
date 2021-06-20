package com.github.gabrielgouv.greetings.impl.pt;

import com.github.gabrielgouv.greetings.api.GreetingsService;

public class GreetingsPortugueseService implements GreetingsService {

    @Override
    public String greetMessage(String name) {
        return "Olá " + name + ". Seja bem-vindo!";
    }

}
