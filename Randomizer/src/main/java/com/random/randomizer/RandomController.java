package com.random.randomizer;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class RandomController implements Initializable {

    @FXML
    private ChoiceBox<String> miscOne;

    @FXML
    private ChoiceBox<String> miscTwo;

    @FXML
    private ChoiceBox<String> miscThree;

    @FXML
    private ChoiceBox<String> miscFour;

    private String[] misc = {"None", "Environmental Effects", "Free City Modifiers", "Rule Modifiers", "Unit Modifiers"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        miscOne.getItems().addAll(misc);
        miscTwo.getItems().addAll(misc);
        miscThree.getItems().addAll(misc);
        miscFour.getItems().addAll(misc);

        miscOne.setValue("None");
        miscTwo.setValue("None");
        miscThree.setValue("None");
        miscFour.setValue("None");
    }
}