package org.gandalftheblack.homestockmanager.item;

import lombok.Data;

import java.util.UUID;

@Data
public class LineItem {

    private UUID id;
    protected Item item;
    private int quantity;

    public LineItem(Item item, int quantity) {
        this.id = UUID.randomUUID();
        this.item = item;
        this.quantity = quantity;
    }

    public boolean isValid(){
        return quantity > 0 && item.hasStocks();
    }
}
