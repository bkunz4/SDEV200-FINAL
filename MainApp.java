import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create sample objects
        Flight flight = new Flight("F123", "City A", "City B", "10:00", "12:00");
        Reservation reservation = new Reservation("John Doe", 30, "john.doe@example.com", flight);

        // Create UI elements
        Button reserveButton = new Button("Reserve Seat");
        reserveButton.setOnAction(e -> {
            reservation.reserveSeat();
            System.out.println("Seat reserved for " + reservation.getName());
        });

        VBox vbox = new VBox(reserveButton);
        Scene scene = new Scene(vbox, 300, 200);

        primaryStage.setTitle("Airline Reservation System");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}