package com.logicalsapien.rema.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

  @GetMapping("api/health")
  public ResponseEntity<Map<String, Object>> getHealth() {
    Map<String, Object> healthResponse = new HashMap<>();
    healthResponse.put("healthy", true);
    return ResponseEntity.ok(healthResponse);
  }
}
