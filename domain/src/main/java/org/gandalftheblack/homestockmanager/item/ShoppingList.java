package org.gandalftheblack.homestockmanager.item;

import lombok.Data;
import org.gandalftheblack.homestockmanager.user.Role;
import org.gandalftheblack.homestockmanager.user.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class ShoppingList {

    private UUID id;
    protected List<LineItem> items;
    private User owner;
    private boolean active;
    private boolean _private;

    public ShoppingList(User owner) {
        this.id = UUID.randomUUID();
        items = new ArrayList<>();
        this.owner = owner;
        active = false;
        _private = true;
    }

    public boolean addItem(LineItem item){
        if (item.isValid())
            return items.add(item);
        return false;
    }

    public boolean deleteItem(LineItem item){
        return items.remove(item);
    }

    public void create(){
        this.active = true;
        this.owner.setRole(Role.OWNER);
        //TODO: send listCreated event
    }
}
