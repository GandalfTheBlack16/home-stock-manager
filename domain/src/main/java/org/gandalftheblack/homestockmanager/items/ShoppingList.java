package org.gandalftheblack.homestockmanager.items;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class ShoppingList {

    private UUID id;
    protected List<LineItem> items;
    //TODO: replace with actual POJO
    private String owner;
    private boolean active;
    private boolean _private;

    public ShoppingList(String owner) {
        this.id = UUID.randomUUID();
        items = new ArrayList<>();
        this.owner = owner;
        active = true;
        _private = true;
    }

    public boolean addItem(LineItem item){
        if (item.isValid())
            return items.add(item);
        return false;
    }
}
