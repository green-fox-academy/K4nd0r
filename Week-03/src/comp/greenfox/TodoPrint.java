package comp.greenfox;

public class TodoPrint {
    public static void main(String[] args) {
        StringBuilder todoText = new StringBuilder(" - Buy milk \n");
        int slash = todoText.indexOf(" - ");
        todoText.insert(slash+1, "My todo: \n ");
        int Dgmae = todoText.indexOf(" - Buy milk \n");
        todoText.insert(Dgmae+12, "\n - Download game \n");
        int Diablo = todoText.indexOf(" Download game \n");
        todoText.insert(Diablo+15, "\n     - Diablo ");

        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        System.out.println(todoText);
    }
}
