package rent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rent.dto.PurchaseDTO;
import rent.service.PurchaseService;

import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping(value = "/purchase")
public class PurchaseController {

    @Autowired
    PurchaseService purchaseService;

    @GetMapping(value = "/{username}")
    public ResponseEntity<String> getAllOrderedPurchases (@PathVariable String username)  {

        ArrayList<PurchaseDTO> purchases = new ArrayList<>();
        purchases = purchaseService.getAllOrderedPurchases(username);
        return new ResponseEntity(purchases, HttpStatus.OK);
    }

}
