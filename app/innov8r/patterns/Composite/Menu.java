package app.innov8r.patterns.Composite;

import java.util.*;

public class Menu extends MenuComponent {
    private List<MenuComponent> subMenus = new ArrayList<>();
    Menu(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }
    

    @Override
    List<MenuComponent> getSubMenus() {
        return this.subMenus;
    }
}
