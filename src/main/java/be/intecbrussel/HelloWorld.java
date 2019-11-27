package be.intecbrussel;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 */
public class HelloWorld {

    private static Logger logger = LogManager.getLogger();

    public void sayHello() {
        logger.debug("sayHello method is triggered");
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
        hw.sayHello();
    }

}
