package academy.learnprogramming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloMaven {

    private final static Logger log=LoggerFactory.getLogger(HelloMaven.class);

    public static void main(String[] args) {
        System.out.println("hello Console without logback");
        log.info("Hello info");
        log.debug("hello debug");
    }
}
