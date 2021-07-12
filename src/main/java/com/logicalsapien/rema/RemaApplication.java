package com.logicalsapien.rema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring boot application to load context & start application.
 */
@SpringBootApplication
public class RemaApplication { //NOPMD - Main Class

  /**
   * Main method.
   *
   * @param args Program start arguments
   */
  public static void main(final String[] args) {
    SpringApplication.run(RemaApplication.class, args);
  }

}
