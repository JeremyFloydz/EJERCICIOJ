package org.example.ejej;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * La clase {@code HelloController} es el controlador de la interfaz de usuario de la aplicación.
 * Se encarga de manejar la interacción del usuario con los elementos de la interfaz,
 * como los cambios de imagen del coche y el estado de las luces.
 */
public class HelloController {

    // Referencias a los componentes en el FXML
    @FXML
    private ImageView carImage;  // Imagen del coche sin luces

    @FXML
    private ImageView carImageWithLights;  // Imagen del coche con luces encendidas

    @FXML
    private ImageView lightsSwitch;  // Botón para encender/apagar las luces

    // Variable para rastrear el estado de las luces
    private boolean lightsOn = false;

    /**
     * Método que alterna el estado de las luces del coche.
     * Cambia la visibilidad de la imagen del coche con luces y
     * actualiza el icono del botón de encender/apagar las luces.
     */
    @FXML
    protected void toggleLights() {
        // Alternar el estado de las luces
        lightsOn = !lightsOn;

        // Cambiar la visibilidad de la imagen del coche con luces
        carImageWithLights.setVisible(lightsOn);

        // Cambiar la imagen del botón de encender/apagar las luces
        if (lightsOn) {
            lightsSwitch.setImage(new Image(getClass().getResource("/img/lucesOn.png").toExternalForm()));
        } else {
            lightsSwitch.setImage(new Image(getClass().getResource("/img/lucesOff.png").toExternalForm()));
        }
    }

    /**
     * Método para cambiar el color del coche a "Blazing Red".
     */
    @FXML
    protected void changeToBlazingRed() {
        carImage.setImage(new Image(getClass().getResource("/coches/miniBlazingRed.png").toExternalForm()));
    }

    /**
     * Método para cambiar el color del coche a "Electric Blue".
     */
    @FXML
    protected void changeToElectricBlue() {
        carImage.setImage(new Image(getClass().getResource("/coches/miniElectricBlue.png").toExternalForm()));
    }

    /**
     * Método para cambiar el color del coche a "Lapisluxury Blue".
     */
    @FXML
    protected void changeToLapisluxuryBlue() {
        carImage.setImage(new Image(getClass().getResource("/coches/miniLapisluxuryBlue.png").toExternalForm()));
    }

    /**
     * Método para cambiar el color del coche a "Midnight Black".
     */
    @FXML
    protected void changeToMidnightBlack() {
        carImage.setImage(new Image(getClass().getResource("/coches/miniMidnightBlack.png").toExternalForm()));
    }

    /**
     * Método para cambiar el color del coche a "Pepper White".
     */
    @FXML
    protected void changeToPepperWhite() {
        carImage.setImage(new Image(getClass().getResource("/coches/miniPepperWhite.png").toExternalForm()));
    }

    /**
     * Método para cambiar el color del coche a "Moonwalk Grey".
     */
    @FXML
    protected void changeToMoonwalkGrey() {
        carImage.setImage(new Image(getClass().getResource("/coches/miniMoonwalkGrey.png").toExternalForm()));
    }

    /**
     * Método para cambiar el color del coche a "Thunder Gray".
     */
    @FXML
    protected void changeToThunderGray() {
        carImage.setImage(new Image(getClass().getResource("/coches/miniThunderGray.png").toExternalForm()));
    }

    /**
     * Método para cambiar el color del coche a "Volcanin Orange".
     */
    @FXML
    protected void changeToVolcaninOrange() {
        carImage.setImage(new Image(getClass().getResource("/coches/miniVolcaninOrange.png").toExternalForm()));
    }
}
