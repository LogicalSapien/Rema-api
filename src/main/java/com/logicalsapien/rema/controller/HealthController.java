package com.logicalsapien.rema.controller;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Health Check Controller.
 * Health check apis return okay responses to periodic polling
 */
@RestController
public class HealthController {

  /**
   * Returns okay response for health check polls.
   *
   * @return Okay Response
   */
  @GetMapping("api/health")
  public ResponseEntity<Map<String, Object>> getHealth() {
    final Map<String, Object> healthResponse = new ConcurrentHashMap<>();
    healthResponse.put("healthy", true);
    return ResponseEntity.ok(healthResponse);
  }
}
