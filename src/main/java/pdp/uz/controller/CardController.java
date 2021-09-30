package pdp.uz.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pdp.uz.dto.CardDto;
import pdp.uz.service.CardService;


import javax.servlet.http.HttpServletRequest;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/card")
public class CardController {

    private final CardService cardService;

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody CardDto dto, HttpServletRequest request) {
        return cardService.add(dto, request);
    }

    @GetMapping("/get")
    public ResponseEntity<?> get(HttpServletRequest request) {
        return cardService.get(request);
    }

}
