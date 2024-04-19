import javax.swing.JOptionPane;

import com.salesianos.actividad.Menu;
import com.salesianos.actividad.Restaurante;

public class App {
    public static void main(String[] args) {

        String menu = """
                1.- Añadir restaurante
                2.- Editar restaurante
                3.- Mostrar restaurantes
                4.- Eliminar restaurante
                Q.- Salir del programa
                """;
        boolean keepAsking = true;
        String option;
        while (keepAsking) {
            option = JOptionPane.showInputDialog(menu);
            switch (option) {
                case "1":
                    Restaurante newRestaurant = Menu.setInfoToNewRestaurant();
                    Menu.addRestaurant(newRestaurant);
                    break;
                case "2":
                    String restaurantNameToEdit = JOptionPane
                            .showInputDialog("Introduzca el nombre del restaurante a modificar: ");
                    Menu.modifyRestaurant(restaurantNameToEdit);
                    break;
                case "3":
                    Menu.showRestaurantsSortedByScore();
                    break;
                case "4":
                    String restaurantNameToDelete = JOptionPane
                            .showInputDialog("Introduzca el nombre del restaurante que quiera borrar: ");
                    Menu.dropRestaurant(restaurantNameToDelete);
                    break;
                case "Q":
                    keepAsking = false;
                    break;

                default:
                    break;
            }
        }
    }

}