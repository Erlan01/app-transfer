package pdp.uz.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pdp.uz.service.IncomeService;


import javax.servlet.http.HttpServletRequest;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/income")
public class IncomeController {

    private final IncomeService incomeService;

    @GetMapping("/get/{id}")
    ResponseEntity<?> get(@PathVariable Long id, HttpServletRequest request){
        return incomeService.get(id,request);
    }
}
