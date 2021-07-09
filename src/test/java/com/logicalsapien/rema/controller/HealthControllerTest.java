package com.logicalsapien.rema.controller;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

class HealthControllerTest {

  private HealthController healthController;

  public HealthControllerTest() {
    this.healthController = new HealthController();
  }

  @Test
  void returnOkayResponseOnCallingHealthApi() {
    Map<String, Object> healthTestExpectedResponse = new HashMap<>();
    healthTestExpectedResponse.put("healthy", true);
    ResponseEntity healthApiResponse = healthController.getHealth();
    assertThat(healthApiResponse.getStatusCode()).isEqualTo(HttpStatus.OK);
    assertThat(healthApiResponse.getBody()).isEqualTo(healthTestExpectedResponse);
  }

}
