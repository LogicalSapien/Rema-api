package com.logicalsapien.rema.controller;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HealthControllerTest {

  private HealthController healthController;

  @BeforeEach
  public void setUp() {
    this.healthController = new HealthController();
  }

  /**
   * Return okay response on calling health api.
   */
  @Test
  void returnOkayResponseOnCallingHealthApi() {
    assertThat(healthController.getHealth().getBody())
            .isEqualTo(new HashMap<>(Map.of("healthy", true)));
  }

}
