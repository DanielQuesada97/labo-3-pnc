package com.rockettstudio.labopnc.controller;
import com.rockettstudio.labopnc.dto.ClubResponse;
import com.rockettstudio.labopnc.dto.CreateClubRequest;
import com.rockettstudio.labopnc.service.ClubService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/clubs")
@RequiredArgsConstructor
public class ClubController {
    private final ClubService clubService;

    @PostMapping
    public ResponseEntity<ClubResponse> createClub(@RequestBody CreateClubRequest request) {
        return ResponseEntity.ok(clubService.createClub(request));
    }

    @GetMapping("/search")
    public ResponseEntity<List<ClubResponse>> searchClubsByName(@RequestParam String name) {
        return ResponseEntity.ok(clubService.searchClubsByName(name));
    }

    @GetMapping("/country/{country}")
    public ResponseEntity<List<ClubResponse>> getClubsByCountry(@PathVariable String country) {
        return ResponseEntity.ok(clubService.getClubsByCountry(country));
    }
}
