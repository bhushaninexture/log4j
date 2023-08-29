package org.example;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class Main {
        private static final Logger logger = Logger.getLogger(Main.class);

        public void demo() {
            logger.info("Info message");
            logger.error("Error message");
        }
    }
