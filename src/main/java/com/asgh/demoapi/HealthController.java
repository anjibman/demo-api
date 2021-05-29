package com.asgh.demoapi;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HealthController {
    @GetMapping("/health")
    public ResponseEntity<HealthStatus> getHealth() {
        HealthStatus healthStatus = new HealthStatus();
        healthStatus.setStatus("OK");
        healthStatus.setMessage("All health check is good!");

        return ResponseEntity.ok(healthStatus);
    }
}
