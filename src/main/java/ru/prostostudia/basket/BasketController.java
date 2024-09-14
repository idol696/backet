package ru.prostostudia.basket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/store/order")
public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

   @GetMapping("/add")
   public List<Integer> getItems(@RequestParam("item") ArrayList<Integer> items) {
        return basketService.addItems(items);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return basketService.getItems();
    }

}
