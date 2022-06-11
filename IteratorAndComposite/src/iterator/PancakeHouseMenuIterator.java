package iterator;

import menuitem.MenuItem;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator<MenuItem>{
    List<MenuItem> menuItems;
    int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuItems.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        if(menuItems.size() <= position) {
            return null;
        }
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }
}
