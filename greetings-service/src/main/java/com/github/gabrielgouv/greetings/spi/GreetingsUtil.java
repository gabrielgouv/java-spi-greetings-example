package com.github.gabrielgouv.greetings.spi;

import java.util.Iterator;
import java.util.Optional;
import java.util.ServiceLoader;

public final class GreetingsUtil {

    private static final ServiceLoader<GreetingsProvider> loader
            = ServiceLoader.load(GreetingsProvider.class);

    private GreetingsUtil() {
        throw new RuntimeException(
                "Cannot call the constructor for this utility class.");
    }

    public static Iterator<GreetingsProvider> providers() {
        return loader.iterator();
    }

    public static Optional<GreetingsProvider> getFirstProvider() {
        return loader.findFirst();
    }

}
