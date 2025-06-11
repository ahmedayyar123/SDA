package mvc;


// ✅ Import the correct packages

import model.Model;
import view.View;
import controller.Controller;

public class MVC {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            Model model = new Model();
            View view = new View();
            new Controller(model, view);
        });
    }
}
