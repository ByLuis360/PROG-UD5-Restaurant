import javax.swing.JOptionPane;

public class App {
public static void main(String[] args) {
    
    String menu = """
            1.- Añadir restaurante
            2.- Editar restaurante
            3.- Mostrar restaurantes
            4.- Eliminar restaurante
            Q.- Salir del programa
            """;
    boolean keepGoing = true;
    String option;
    while (keepGoing) {
        option = JOptionPane.showInputDialog(menu);
        switch (option) {
            case "1":
                
                break;
            case "2":
                
                break;
            case "3":
                
                break;
            case "4":
                
                break;
            case "Q":
                
                break;
        
            default:
                break;
        }
    }    
}
    
}