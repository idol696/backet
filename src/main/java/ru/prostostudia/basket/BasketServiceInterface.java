package ru.prostostudia.basket;

import java.util.List;

public interface BasketServiceInterface {
    List<Integer> addItems(List<Integer> items);
    List<Integer> getItems();
}
