public class File implements Component {
    private String name;
    private int size; // Розмір файлу

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void rename(String newName) {
        this.name = newName;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void printStructure(String pref) {
        System.out.println(pref + "File: " + name + " (" + size + " KB)");
    }
}

