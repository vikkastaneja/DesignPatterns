package app.innov8r.patterns.Composite;

public class Program {
    public static void main(String[] args) {
        Menu fileMenu = new Menu("File");
        fileMenu.getSubMenus().add(new MenuAction("Close"));
        
        Menu openSubMenu = new Menu("Open");
        openSubMenu.getSubMenus().add(new MenuAction("Files"));
        openSubMenu.getSubMenus().add(new MenuAction("Folders"));

        fileMenu.getSubMenus().add(openSubMenu);

        printHierarchy(fileMenu, "");
    }

    private static void printHierarchy(MenuComponent root, String spl) {

        System.out.print(root.getName() + " | ");

        if (root.getSubMenus().size() == 0) {
            System.out.print("<EOM>");
            System.out.println();
            return;
        }

        for (MenuComponent component : root.getSubMenus()) {
            System.out.print(spl);
            printHierarchy(component, spl + "\t");

        }
    }
}
