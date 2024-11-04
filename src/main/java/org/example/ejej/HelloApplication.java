package org.example.ejej;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * La clase {@code HelloApplication} es la clase principal de la aplicación JavaFX.
 * Se encarga de iniciar la aplicación, cargar la interfaz de usuario desde un archivo FXML
 * y configurar la ventana principal.
 */
public class HelloApplication extends Application {

    /**
     * Este método se llama al iniciar la aplicación JavaFX.
     * Carga el archivo FXML que define la interfaz de usuario y configura la escena.
     *
     * @param stage El escenario principal proporcionado por la plataforma JavaFX.
     * @throws IOException Si hay un error al cargar el archivo FXML.
     */
    @Override
    public void start(Stage stage) throws IOException {
        // Cargar el archivo FXML que define la interfaz de usuario
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        // Crear la escena con el tamaño especificado
        Scene scene = new Scene(fxmlLoader.load(), 777, 460);

        // Establecer el título de la ventana
        stage.setTitle("Mini Cooper");

        // Asignar la escena al escenario y mostrarla
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Método principal que lanza la aplicación JavaFX.
     * Este método invoca {@link #launch(String...)} proporcionado por la clase {@code Application}
     * para inicializar la aplicación.
     *
     * @param args Los argumentos de línea de comandos, si los hay.
     */
    public static void main(String[] args) {
        // Iniciar la aplicación
        launch();
    }
}
