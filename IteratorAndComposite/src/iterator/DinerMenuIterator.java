package iterator;

import menuitem.MenuItem;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
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

    @Override
    public void remove() {
        throw new UnsupportedOperationException("메뉴 항목을 지울 수 없습니다.");
    }
}
