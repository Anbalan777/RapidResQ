package com.vigileye.rescuehub_api.Controllers;

import com.vigileye.rescuehub_api.repository.HospitalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class HealthController {

    private final HospitalRepository hospitalRepository;

    @GetMapping("/health")
    public Map<String, Object> health() {
        return Map.of("status", "UP", "hospitals", hospitalRepository.count());
    }
}