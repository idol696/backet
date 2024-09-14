package ru.prostostudia.basket;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Basket {

    private final List<Integer> basket = new ArrayList<>();

    public void addItems(List<Integer> items) {
        basket.addAll(items);
    }

    public List<Integer> getBasket() {
        return basket.stream().toList();
    }
}
