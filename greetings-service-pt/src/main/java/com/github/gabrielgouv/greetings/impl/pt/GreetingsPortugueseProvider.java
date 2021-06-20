package com.github.gabrielgouv.greetings.impl.pt;

import com.github.gabrielgouv.greetings.api.GreetingsService;
import com.github.gabrielgouv.greetings.spi.GreetingsProvider;

public class GreetingsPortugueseProvider implements GreetingsProvider {

    @Override
    public GreetingsService getImpl() {
        return new GreetingsPortugueseService();
    }

}
