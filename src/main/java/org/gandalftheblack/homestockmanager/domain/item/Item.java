package org.gandalftheblack.homestockmanager.domain.item;

import lombok.Data;

import java.util.UUID;

@Data
public class Item {

    private UUID id;
    private String name;
    private String description;
    private int stocks;

    public Item(String name, String description, int stocks){
        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.stocks = stocks;
    }

    public Item(String name, String description) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.stocks = 0;
    }

    public boolean hasStocks(){
        return stocks > 0;
    }

    public void replenish(int quantity){
        this.stocks += quantity;
    }
}
