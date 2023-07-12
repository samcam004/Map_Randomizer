package com.random.randomizer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;

public class RandomController implements Initializable {

    @FXML
    private CheckBox cbBarren, cbCoast, cbContinents, cbDivide, cbIslands, cbLand, cbLavaDivide, cbLavaLakes, cbScarred,
                     cbDesert, cbEndless, cbForming, cbFrozen, cbHigh, cbOvergrown, cbScorched;

    @FXML
    private TextField tfGeoTrait;

    @FXML
    private void setGeoTrait(ActionEvent e) {
        if (e.getSource().equals(cbBarren)) {
            if (cbBarren.isSelected()){
                mainTraits.get(0).add("Barren Ocean");
                System.out.println("Add Barren Ocean");
            } else {
                mainTraits.get(0).remove("Barren Ocean");
                System.out.println("Remove Barren Ocean");
            }
        }
        else if (e.getSource().equals(cbCoast)){
            if (cbCoast.isSelected()) {
                mainTraits.get(0).add("Coast");
                System.out.println("Add Coast");
            } else {
                mainTraits.get(0).remove("Coast");
                System.out.println("Remove Coast");
            }
        }
        else if (e.getSource().equals(cbContinents)) {
            if (cbContinents.isSelected()) {
                mainTraits.get(0).add("Continents");
                System.out.println("Add Continents");
            } else {
                mainTraits.get(0).remove("Continents");
                System.out.println("Remove Continents");
            }
        }
        else if (e.getSource().equals(cbDivide)) {
            if (cbDivide.isSelected()) {
                mainTraits.get(0).add("Divide");
                System.out.println("Add Divide");
            } else {
                mainTraits.get(0).remove("Divide");
                System.out.println("Remove Divide");
            }
        }
        else if (e.getSource().equals(cbIslands)) {
            if (cbIslands.isSelected()) {
                mainTraits.get(0).add("Islands");
                System.out.println("Add Islands");
            } else {
                mainTraits.get(0).remove("Islands");
                System.out.println("Remove Islands");
            }
        }
        else if (e.getSource().equals(cbLand)) {
            if (cbLand.isSelected()) {
                mainTraits.get(0).add("Land");
                System.out.println("Add Land");
            } else {
                mainTraits.get(0).remove("Land");
                System.out.println("Remove Land");
            }

        }
        else if (e.getSource().equals(cbLavaDivide)) {
            if (cbLavaDivide.isSelected()) {
                mainTraits.get(0).add("Lava Divide");
                System.out.println("Add Lava Divide");
            } else {
                mainTraits.get(0).remove("Lava Divide");
                System.out.println("Remove Lava Divide");
            }
        }
        else if (e.getSource().equals(cbLavaLakes)) {
            if (cbLavaLakes.isSelected()) {
                mainTraits.get(0).add("Lava Lakes");
                System.out.println("Add Lava Lakes");
            } else {
                mainTraits.get(0).remove("Lava Lakes");
                System.out.println("Remove Lava Lakes");
            }

        }
        else {
            if (cbScarred.isSelected()) {
                mainTraits.get(0).add("Scarred Divide");
                System.out.println("Add Scarred Divide");
            } else {
                mainTraits.get(0).remove("Scarred Divide");
                System.out.println("Remove Scarred Divide");
            }
        }
    }

    @FXML
    private void rollGeoTrait (ActionEvent roll) {
        Random r = new Random();
        tfGeoTrait.setText(mainTraits.get(0).get(r.nextInt(mainTraits.get(0).size())));

    }

    @FXML
    private ChoiceBox<String> miscOne;

    @FXML
    private ChoiceBox<String> miscTwo;

    @FXML
    private ChoiceBox<String> miscThree;

    @FXML
    private ChoiceBox<String> miscFour;

    private String[] misc = {"None", "Environmental Effects", "Free City Modifiers", "Rule Modifiers", "Unit Modifiers"};

    private ArrayList<ArrayList<String>> mainTraits = new ArrayList<>();

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

        initializeTraits();
    }

    //Initializes a 2D Arraylist for all Map and Miscellaneous Traits
    private void initializeTraits () {
        ArrayList<String> geo = new ArrayList<>();
        ArrayList<String> climate = new ArrayList<>();
        ArrayList<String> inhab = new ArrayList<>();
        ArrayList<String> presence = new ArrayList<>();
        ArrayList<String> enviroment = new ArrayList<>();
        ArrayList<String> free = new ArrayList<>();
        ArrayList<String> rule = new ArrayList<>();
        ArrayList<String> unit = new ArrayList<>();

        mainTraits.add(geo);
        mainTraits.add(climate);
        mainTraits.add(inhab);
        mainTraits.add(presence);
        mainTraits.add(enviroment);
        mainTraits.add(free);
        mainTraits.add(rule);
        mainTraits.add(unit);

        //Geography Traits
        mainTraits.get(0).add("Barren Ocean");
        mainTraits.get(0).add("Coast");
        mainTraits.get(0).add("Continents");
        mainTraits.get(0).add("Divide");
        mainTraits.get(0).add("Islands");
        mainTraits.get(0).add("Land");
        mainTraits.get(0).add("Lava Divide");
        mainTraits.get(0).add("Lava Lakes");
        mainTraits.get(0).add("Scarred Divide");

        //Climate Traits
        mainTraits.get(1).add("Desert Realms");
        mainTraits.get(1).add("Endless Fields");
        mainTraits.get(1).add("Forming Realms");
        mainTraits.get(1).add("Frozen Realms");
        mainTraits.get(1).add("Highlands");
        mainTraits.get(1).add("Overgrown Realm");
        mainTraits.get(1).add("Scorched Climate");

        //Inhabitants Traits
        mainTraits.get(2).add("Astral Invaders");
        mainTraits.get(2).add("Demonic Realm");
        mainTraits.get(2).add("Dragon Territories");
        mainTraits.get(2).add("Immortal Spirits");
        mainTraits.get(2).add("Lingering Creators");
        mainTraits.get(2).add("Low Population");
        mainTraits.get(2).add("Magic Origins");
        mainTraits.get(2).add("Megafauna");
        mainTraits.get(2).add("Peaceful Lands");
        mainTraits.get(2).add("Rampant Flora");
        mainTraits.get(2).add("Rampant Undeath");
        mainTraits.get(2).add("Wildlands");

        //Presence Traits
        mainTraits.get(3).add("Pretender Kings");
        mainTraits.get(3).add("Domain of the Frost Queen");
        mainTraits.get(3).add("Artisan Kings");
        mainTraits.get(3).add("Druidic Alliance");
        mainTraits.get(3).add("The Librarian");
        mainTraits.get(3).add("Iron Emperor");
        mainTraits.get(3).add("Archon Prophet");
        mainTraits.get(3).add("Demon Prince");
        mainTraits.get(3).add("The Ashen War");

        //Environmental Traits
        mainTraits.get(4).add("Arctic Blizzards");
        mainTraits.get(4).add("Crystalline Abundance");
        mainTraits.get(4).add("Domain of Mayhem");
        mainTraits.get(4).add("Massive Underground");
        mainTraits.get(4).add("Small Underground");
        mainTraits.get(4).add("Volcanic Eruptions");
        mainTraits.get(4).add("Warping Wilds");
        mainTraits.get(4).add("Wondrous Past");

        //Free City Modifiers
        mainTraits.get(5).add("Bannerlords");
        mainTraits.get(5).add("City States");
        mainTraits.get(5).add("Distrusting Locals");
        mainTraits.get(5).add("Hostile Houses");
        mainTraits.get(5).add("Might Makes Right");
        mainTraits.get(5).add("No Free Cities");
        mainTraits.get(5).add("Ruined Realm");

        //Rule Modifiers
        mainTraits.get(6).add("Deathcasting");
        mainTraits.get(6).add("Disdain for Evil");
        mainTraits.get(6).add("Megacities");
        mainTraits.get(6).add("No Respite");
        mainTraits.get(6).add("Regenerating Infestations");
        mainTraits.get(6).add("Underground Start");
        mainTraits.get(6).add("Unlimited Power");

        //Unit Modifiers
        mainTraits.get(7).add("Curse of Undeath");
        mainTraits.get(7).add("Frostling Influence");
        mainTraits.get(7).add("Gigantism");
        mainTraits.get(7).add("High Maintenance");
        mainTraits.get(7).add("Immortals");
        mainTraits.get(7).add("Lightless");
    }
}