package com.github.gabrielgouv.greetings.impl.en;

import com.github.gabrielgouv.greetings.api.GreetingsService;
import com.github.gabrielgouv.greetings.spi.GreetingsProvider;

public class GreetingsEnglishProvider implements GreetingsProvider {

    @Override
    public GreetingsService getImpl() {
        return new GreetingsEnglishService();
    }

}
