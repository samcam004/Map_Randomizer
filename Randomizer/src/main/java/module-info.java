module com.random.randomizer {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.random.randomizer to javafx.fxml;
    exports com.random.randomizer;
}