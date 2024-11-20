//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Створення кореневої папки
        Folder root = new Folder("Root");
        root.add(new File("File1.txt", 100));
        root.add(new File("File2.txt", 200));

        //Додавання підпапки
        Folder Folder1 = new Folder("Folder1");
        Folder1.add(new File("File1.txt", 50));
        Folder1.add(new File("File2.txt", 150));
        root.add(Folder1);

        //Додавання вкладеної підпапки
        Folder Folder2 = new Folder("Folder2");
        Folder2.add(new File("F2File1.txt", 300));
        Folder1.add(Folder2);

        //Виведення структури
        System.out.println("Structure:");
        root.printStructure("");

        //Виведення загального розміру
        System.out.println("\nTotal size: " + root.getSize() + " KB");

        //Перейменування директорії
        Folder2.rename("RenamedFolder2");
        System.out.println("\nAfter renaming Folder2:");
        root.printStructure("");
    }
}