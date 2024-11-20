public interface Component {
    String getName();

    void rename(String newName);

    int getSize();

    void printStructure(String prefix);
}