package com.logicalsapien.rema.controller;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

class HealthControllerTest {

  private HealthController healthController;

  public HealthControllerTest() {
    this.healthController = new HealthController();
  }

  /**
   * Return okay response on calling health api.
   */
  @Test
  void returnOkayResponseOnCallingHealthApi() {
    final Map<String, Object> healthTestExpdResponse = new HashMap<>();
    healthTestExpdResponse.put("healthy", true);
    assertThat(healthController.getHealth().getBody()).isEqualTo(healthTestExpdResponse);
  }

}
