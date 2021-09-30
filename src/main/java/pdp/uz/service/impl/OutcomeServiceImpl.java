package pdp.uz.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pdp.uz.domain.Card;
import pdp.uz.helpers.Utils;
import pdp.uz.repository.CardRepo;
import pdp.uz.repository.OutcomeRepo;
import pdp.uz.service.OutcomeService;


import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OutcomeServiceImpl implements OutcomeService {

    private final OutcomeRepo outcomeRepo;

    private final CardRepo cardRepo;

    @Override
    public ResponseEntity<?> get(Long id, HttpServletRequest request) {
        String username = Utils.getUsername(request);
        Optional<Card> optionalCard = cardRepo.findByUsernameAndIdAndActiveTrue(username, id);
        if (!optionalCard.isPresent())
            return ResponseEntity.status(404).body("Card not found");
        return ResponseEntity.ok(outcomeRepo.findAllByFromCardId(id));
    }
}
