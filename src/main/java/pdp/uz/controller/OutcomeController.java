package pdp.uz.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.service.OutcomeService;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/outcome")
public class OutcomeController {

    private  final OutcomeService service;

    @GetMapping("/{id}")
    ResponseEntity<?> get(@PathVariable Long id, HttpServletRequest request){
        return service.get(id,request);
    }
}
