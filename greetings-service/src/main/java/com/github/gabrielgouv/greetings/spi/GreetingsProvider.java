package com.github.gabrielgouv.greetings.spi;

import com.github.gabrielgouv.greetings.api.GreetingsService;

public interface GreetingsProvider {

    GreetingsService getImpl();

}
