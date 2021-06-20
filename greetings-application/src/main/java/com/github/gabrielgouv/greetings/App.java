package com.github.gabrielgouv.greetings;

import static java.lang.System.out;
import com.github.gabrielgouv.greetings.spi.GreetingsUtil;

public class App {

    public static void main(String[] args) {
        GreetingsUtil.getFirstProvider()
                .ifPresentOrElse(
                        provider -> out.println(provider.getImpl().greetMessage("John")),
                        () -> out.println("Cannot find implementation"));

    }

}
