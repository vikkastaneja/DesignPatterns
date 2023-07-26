package app.innov8r.patterns.Composite;

import java.util.List;

abstract class MenuComponent {
    protected String name;
    MenuComponent(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    List<MenuComponent> getSubMenus() {
        return null;
    }
}
