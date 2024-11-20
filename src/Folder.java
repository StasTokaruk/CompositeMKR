import java.util.ArrayList;
import java.util.List;

public class Folder implements Component {
    private String name;
    private List<Component> children;

    public Folder(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void rename(String newName) {
        this.name = newName;
    }

    public void add(Component obj) {
        children.add(obj);
    }

    public void remove(Component obj) {
        children.remove(obj);
    }

    @Override
    public int getSize() {
        int tSize = 0;
        for (Component obj : children) {
            tSize += obj.getSize();
        }
        return tSize;
    }

    @Override
    public void printStructure(String pref) {
        System.out.println(pref + "Folder: " + name);
        for (Component obj : children) {
            obj.printStructure(pref + "  ");
        }
    }
}
