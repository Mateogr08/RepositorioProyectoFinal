module co.edu.uniquindio.proyectofinal {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens co.edu.uniquindio.proyectofinal to javafx.fxml;
    exports co.edu.uniquindio.proyectofinal;
}