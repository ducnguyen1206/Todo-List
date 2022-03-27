import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<String> toDos;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String guideLine = "Please choose option: \nOption 1: add\nOption 2: delete\n" +
                "Option 3: Modify\nPlease type your number";
        System.out.println(guideLine);
        String option = scanner.nextLine();

        switch (option) {
            case "1":
                System.out.println("Add your thing you want to do");
                String toDo = scanner.nextLine();
                System.out.println("You added " + add(toDo) + " to your todo list");
                break;
            case "2":

        }

    }

    public static String add(String toDo) {
        toDos.add(toDo);
        return toDo;
    }

    public static String delete(String toDo) {
        return toDo;
    }

    public static String modify(String toDo, int position) {
        return null;
    }

    public static void printTodoList() {
        int number = 1;
        for (String toDo : toDos) {
            System.out.println(number + ". " + toDo);
        }
    }
}
