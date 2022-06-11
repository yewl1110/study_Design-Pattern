package iterator;

import menuitem.MenuItem;

public class DinerMenuIterator implements Iterator<MenuItem>{
    MenuItem[] menuItems;
    int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        if(menuItems.length <= position) {
            return null;
        }
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }
}
