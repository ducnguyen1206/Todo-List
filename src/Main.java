import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<String> toDos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stuff = "";
        while (true) {
            String guideLine = "\nWhat do you want to do: \n1. add\n2. delete\n" +
                    "3. Modify\n4. Exist\nPlease type the number: ";
            System.out.print(guideLine);
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Add your thing you want to do: ");
                    stuff = scanner.nextLine();

                    add(stuff);

                    printTodoList();

                    break;
                case "2":
                    System.out.print("Which stuff you want to delete? ");
                    stuff = scanner.nextLine();

                    delete(stuff);

                    printTodoList();
                    System.out.println();
                    break;
                case "3":
                    System.out.print("Which position you want to modify? ");
                    int position = scanner.nextInt();

                    System.out.print("Change to: ");
                    stuff = scanner.nextLine();

                    modify(stuff, position);

                    printTodoList();
                    System.out.println();
                    break;
                default:
                    System.out.println("Exist");
            }

            if (option.equals("4"))
                break;
        }
    }

    public static String add(String stuff) {
        toDos.add(stuff);
        return stuff;
    }

    public static String delete(String stuff) {
        toDos.remove(stuff);
        return stuff;
    }

    public static void modify(String stuff, int position) {
        toDos.set(position, stuff);
    }

    public static void printTodoList() {
        for (String stuff : toDos) {
            System.out.println(stuff);
        }
    }
}
