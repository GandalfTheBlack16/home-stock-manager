package org.gandalftheblack.homestockmanager.domain.item;

import lombok.Data;
import org.gandalftheblack.homestockmanager.domain.user.Role;
import org.gandalftheblack.homestockmanager.domain.user.User;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
public class ShoppingList {

    private UUID id;
    protected List<LineItem> items;
    private User owner;
    private Date createdAt;
    private Date lastModified;
    private boolean active;
    private boolean _private;

    public ShoppingList(User owner) {
        id = UUID.randomUUID();
        items = new ArrayList<>();
        this.owner = owner;
        createdAt = new Date();
        lastModified = createdAt;
        active = false;
        _private = true;
    }

    public boolean addItem(LineItem item){
        if (item.isValid()){
            lastModified = new Date();
            return items.add(item);
        }
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
