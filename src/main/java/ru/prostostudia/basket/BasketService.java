package ru.prostostudia.basket;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketService implements BasketServiceInterface {

    private final Basket basket;

    public BasketService(Basket basket) {
        this.basket = basket;
    }

    @Override
    public List<Integer> addItems(List<Integer> items) {
        basket.addItems(items);
        return items;
    }

    @Override
    public List<Integer> getItems() {
        return basket.getBasket();
    }
}
