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
                     cbDesert, cbEndless, cbForming, cbFrozen, cbHigh, cbOvergrown, cbScorched,
                     cbAstral, cbDemonic, cbDragon, cbImmortal, cbLingering, cbLowPop, cbMagic, cbMega, cbPeaceful, cbRampantFlora, cbRampantUndeath, cbWildlands,
                     cbPretender, cbDomain, cbArtisan, cbDruidic, cbLibrarian, cbIron, cbArchon, cbDemonPrince, cbAshen,
                     cbArctic, cbCrystalline, cbMayhem, cbMassive, cbSmall, cbVolcanic, cbWarping, cbWondrous,
                     cbBanner, cbCity, cbDistrusting, cbHostile, cbMight, cbNo, cbRuined,
                     cbDeath, cbDisdain, cbMegacities, cbNoRespite, cbRegen, cbUnderground, cbUnlimited,
                     cbCurse, cbFrostling, cbGigantism, cbHighMain, cbImmortals, cbLight;

    @FXML
    private TextField tfGeo, tfClimate, tfInhab, tfPresence, tfMiscOne, tfMiscTwo, tfMiscThree, tfMiscFour;
    
    @FXML
    private Button btnGeo, btnClimate, btnInhab, btnPresence, btnMiscOne, btnMiscTwo, btnMiscThree, btnMiscFour;

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
    private void setClimateTrait(ActionEvent e) {
        if (e.getSource().equals(cbDesert)) {
            if (cbDesert.isSelected()){
                mainTraits.get(1).add("Desert Realms");
            } else {
                mainTraits.get(1).remove("Desert Realms");
            }
        }
        else if (e.getSource().equals(cbEndless)) {
            if (cbEndless.isSelected()){
                mainTraits.get(1).add("Endless Fields");
            } else {
                mainTraits.get(1).remove("Endless Fields");
            }
        }
        else if (e.getSource().equals(cbForming)) {
            if (cbForming.isSelected()){
                mainTraits.get(1).add("Forming Realms");
            } else {
                mainTraits.get(1).remove("Forming Realms");
            }
        }
        else if (e.getSource().equals(cbFrozen)) {
            if (cbFrozen.isSelected()){
                mainTraits.get(1).add("Frozen Realms");
            } else {
                mainTraits.get(1).remove("Frozen Realms");
            }
        }
        else if (e.getSource().equals(cbHigh)) {
            if (cbHigh.isSelected()){
                mainTraits.get(1).add("Highlands");
            } else {
                mainTraits.get(1).remove("Highlands");
            }
        }
        else if (e.getSource().equals(cbOvergrown)) {
            if (cbOvergrown.isSelected()){
                mainTraits.get(1).add("Overgrown Realm");
            } else {
                mainTraits.get(1).remove("Overgrown Realm");
            }
        }
        else {
            if (cbScorched.isSelected()){
                mainTraits.get(1).add("Scorched Climate");
            } else {
                mainTraits.get(1).remove("Scorched Climate");
            }
        }
    }

    @FXML
    private void setInhabTrait(ActionEvent e) {
        if (e.getSource().equals(cbAstral)) {
            if (cbAstral.isSelected()){
                mainTraits.get(2).add("Astral Invaders");
            } else {
                mainTraits.get(2).remove("Astral Invaders");
            }
        }
        else if (e.getSource().equals(cbDemonic)) {
            if (cbDemonic.isSelected()){
                mainTraits.get(2).add("Demonic Realm");
            } else {
                mainTraits.get(2).remove("Demonic Realm");
            }
        }
        else if (e.getSource().equals(cbDragon)) {
            if (cbDragon.isSelected()){
                mainTraits.get(2).add("Dragon Territories");
            } else {
                mainTraits.get(2).remove("Dragon Territories");
            }
        }
        else if (e.getSource().equals(cbImmortal)) {
            if (cbImmortal.isSelected()){
                mainTraits.get(2).add("Immortal Spirits");
            } else {
                mainTraits.get(2).remove("Immortal Spirits");
            }
        }
        else if (e.getSource().equals(cbLingering)) {
            if (cbLingering.isSelected()){
                mainTraits.get(2).add("Lingering Creators");
            } else {
                mainTraits.get(2).remove("Lingering Creators");
            }
        }
        else if (e.getSource().equals(cbLowPop)) {
            if (cbLowPop.isSelected()){
                mainTraits.get(2).add("Low Population");
            } else {
                mainTraits.get(2).remove("Low Population");
            }
        }
        else if (e.getSource().equals(cbMagic)) {
            if (cbMagic.isSelected()){
                mainTraits.get(2).add("Magic Origins");
            } else {
                mainTraits.get(2).remove("Magic Origins");
            }
        }
        else if (e.getSource().equals(cbMega)) {
            if (cbMega.isSelected()){
                mainTraits.get(2).add("Megafauna");
            } else {
                mainTraits.get(2).remove("Megafauna");
            }
        }
        else if (e.getSource().equals(cbPeaceful)) {
            if (cbPeaceful.isSelected()){
                mainTraits.get(2).add("Peaceful Lands");
            } else {
                mainTraits.get(2).remove("Peaceful Lands");
            }
        }
        else if (e.getSource().equals(cbRampantFlora)) {
            if (cbRampantFlora.isSelected()){
                mainTraits.get(2).add("Rampant Flora");
            } else {
                mainTraits.get(2).remove("Rampant Flora");
            }
        }
        else if (e.getSource().equals(cbRampantUndeath)) {
            if (cbRampantUndeath.isSelected()){
                mainTraits.get(2).add("Rampant Undeath");
            } else {
                mainTraits.get(2).remove("Rampant Undeath");
            }
        }
        else {
            if (cbWildlands.isSelected()){
                mainTraits.get(2).add("Wildlands");
            } else {
                mainTraits.get(2).remove("Wildlands");
            }
        }
    }

    @FXML
    private void setPresenceTrait(ActionEvent e) {
        if (e.getSource().equals(cbPretender)) {
            if (cbPretender.isSelected()){
                mainTraits.get(3).add("Pretender Kings");
            } else {
                mainTraits.get(3).remove("Pretender Kings");
            }
        }
        else if (e.getSource().equals(cbDomain)) {
            if (cbDomain.isSelected()){
                mainTraits.get(3).add("Domain of the Frost Queen");
            } else {
                mainTraits.get(3).remove("Domain of the Frost Queen");
            }
        }
        else if (e.getSource().equals(cbArtisan)) {
            if (cbArtisan.isSelected()){
                mainTraits.get(3).add("Artisan Kings");
            } else {
                mainTraits.get(3).remove("Artisan Kings");
            }
        }
        else if (e.getSource().equals(cbDruidic)) {
            if (cbDruidic.isSelected()){
                mainTraits.get(3).add("Druidic Alliance");
            } else {
                mainTraits.get(3).remove("Druidic Alliance");
            }
        }
        else if (e.getSource().equals(cbLibrarian)) {
            if (cbLibrarian.isSelected()){
                mainTraits.get(3).add("The Librarian");
            } else {
                mainTraits.get(3).remove("The Librarian");
            }
        }
        else if (e.getSource().equals(cbIron)) {
            if (cbIron.isSelected()){
                mainTraits.get(3).add("Iron Emperor");
            } else {
                mainTraits.get(3).remove("Iron Emperor");
            }
        }
        else if (e.getSource().equals(cbArchon)) {
            if (cbArchon.isSelected()){
                mainTraits.get(3).add("Archon Prophet");
            } else {
                mainTraits.get(3).remove("Archon Prophet");
            }
        }
        else if (e.getSource().equals(cbDemonPrince)) {
            if (cbDemonPrince.isSelected()){
                mainTraits.get(3).add("Demon Prince");
            } else {
                mainTraits.get(3).remove("Demon Prince");
            }
        }
        else {
            if (cbAshen.isSelected()){
                mainTraits.get(3).add("The Ashen War");
            } else {
                mainTraits.get(3).remove("The Ashen War");
            }
        }
    }

    @FXML
    private void setEnviroTraits(ActionEvent e) {
        if (e.getSource().equals(cbArctic)) {
            if (cbAstral.isSelected()){
                mainTraits.get(4).add("Arctic Blizzards");
            } else {
                mainTraits.get(4).remove("Arctic Blizzards");
            }
        }
        else if (e.getSource().equals(cbCrystalline)) {
            if (cbCrystalline.isSelected()){
                mainTraits.get(4).add("Crystalline Abundance");
            } else {
                mainTraits.get(4).remove("Crystalline Abundance");
            }
        }
        else if (e.getSource().equals(cbMayhem)) {
            if (cbMayhem.isSelected()){
                mainTraits.get(4).add("Domain of Mayhem");
            } else {
                mainTraits.get(4).remove("Domain of Mayhem");
            }
        }
        else if (e.getSource().equals(cbMassive)) {
            if (cbMassive.isSelected()){
                mainTraits.get(4).add("Massive Underground");
            } else {
                mainTraits.get(4).remove("Massive Underground");
            }
        }
        else if (e.getSource().equals(cbSmall)) {
            if (cbSmall.isSelected()){
                mainTraits.get(4).add("Small Underground");
            } else {
                mainTraits.get(4).remove("Small Underground");
            }
        }
        else if (e.getSource().equals(cbVolcanic)) {
            if (cbVolcanic.isSelected()){
                mainTraits.get(4).add("Volcanic Eruptions");
            } else {
                mainTraits.get(4).remove("Volcanic Eruptions");
            }
        }
        else if (e.getSource().equals(cbWarping)) {
            if (cbWarping.isSelected()){
                mainTraits.get(4).add("Warping Wilds");
            } else {
                mainTraits.get(4).remove("Warping Wilds");
            }
        }
        else {
            if (cbWondrous.isSelected()){
                mainTraits.get(4).add("Wondrous Past");
            } else {
                mainTraits.get(4).remove("Wondrous Past");
            }
        }
    }

    @FXML
    private void setCityTraits(ActionEvent e) {
        if (e.getSource().equals(cbBanner)) {
            if (cbBanner.isSelected()){
                mainTraits.get(5).add("Bannerlords");
            } else {
                mainTraits.get(5).remove("Bannerlords");
            }
        }
        else if (e.getSource().equals(cbCity)) {
            if (cbCity.isSelected()){
                mainTraits.get(5).add("City States");
            } else {
                mainTraits.get(5).remove("City States");
            }
        }
        else if (e.getSource().equals(cbDistrusting)) {
            if (cbDistrusting.isSelected()){
                mainTraits.get(5).add("Distrusting Locals");
            } else {
                mainTraits.get(5).remove("Distrusting Locals");
            }
        }
        else if (e.getSource().equals(cbHostile)) {
            if (cbHostile.isSelected()){
                mainTraits.get(5).add("Hostile Houses");
            } else {
                mainTraits.get(5).remove("Hostile Houses");
            }
        }
        else if (e.getSource().equals(cbMight)) {
            if (cbMight.isSelected()){
                mainTraits.get(5).add("Might Makes Right");
            } else {
                mainTraits.get(5).remove("Might Makes Right");
            }
        }
        else if (e.getSource().equals(cbNo)) {
            if (cbNo.isSelected()){
                mainTraits.get(5).add("No Free Cities");
            } else {
                mainTraits.get(5).remove("No Free Cities");
            }
        }
        else {
            if (cbRuined.isSelected()){
                mainTraits.get(5).add("Ruined Realm");
            } else {
                mainTraits.get(5).remove("Ruined Realm");
            }
        }
    }

    @FXML
    private void setRuleTraits(ActionEvent e) {
        if (e.getSource().equals(cbDeath)) {
            if (cbDeath.isSelected()){
                mainTraits.get(6).add("Deathcasting");
            } else {
                mainTraits.get(6).remove("Deathcasting");
            }
        }
        else if (e.getSource().equals(cbDisdain)) {
            if (cbDisdain.isSelected()){
                mainTraits.get(6).add("Disdain for Evil");
            } else {
                mainTraits.get(6).remove("Disdain for Evil");
            }
        }
        else if (e.getSource().equals(cbMegacities)) {
            if (cbMegacities.isSelected()){
                mainTraits.get(6).add("Megacities");
            } else {
                mainTraits.get(6).remove("Megacities");
            }
        }
        else if (e.getSource().equals(cbNoRespite)) {
            if (cbNoRespite.isSelected()){
                mainTraits.get(6).add("No Respite");
            } else {
                mainTraits.get(6).remove("No Respite");
            }
        }
        else if (e.getSource().equals(cbRegen)) {
            if (cbRegen.isSelected()){
                mainTraits.get(6).add("Regenerating Infestations");
            } else {
                mainTraits.get(6).remove("Regenerating Infestations");
            }
        }
        else if (e.getSource().equals(cbUnderground)) {
            if (cbUnderground.isSelected()){
                mainTraits.get(6).add("No Free Cities");
            } else {
                mainTraits.get(6).remove("No Free Cities");
            }
        }
        else {
            if (cbUnlimited.isSelected()){
                mainTraits.get(6).add("Unlimited Power");
            } else {
                mainTraits.get(6).remove("Unlimited Power");
            }
        }
    }

    @FXML
    private void setUnitTraits(ActionEvent e) {
        if (e.getSource().equals(cbCurse)) {
            if (cbCurse.isSelected()){
                mainTraits.get(7).add("Curse of Undeath");
            } else {
                mainTraits.get(7).remove("Curse of Undeath");
            }
        }
        else if (e.getSource().equals(cbFrostling)) {
            if (cbFrostling.isSelected()){
                mainTraits.get(7).add("Frostling Influence");
            } else {
                mainTraits.get(7).remove("Frostling Influence");
            }
        }
        else if (e.getSource().equals(cbGigantism)) {
            if (cbGigantism.isSelected()){
                mainTraits.get(7).add("Gigantism");
            } else {
                mainTraits.get(7).remove("Gigantism");
            }
        }
        else if (e.getSource().equals(cbHighMain)) {
            if (cbHighMain.isSelected()){
                mainTraits.get(7).add("High Maintenance");
            } else {
                mainTraits.get(7).remove("High Maintenance");
            }
        }
        else if (e.getSource().equals(cbImmortals)) {
            if (cbImmortals.isSelected()){
                mainTraits.get(7).add("Immortals");
            } else {
                mainTraits.get(7).remove("Immortals");
            }
        }
        else {
            if (cbLight.isSelected()){
                mainTraits.get(7).add("Lightless");
            } else {
                mainTraits.get(7).remove("Lightless");
            }
        }
    }
    @FXML
    private void rollTrait (ActionEvent roll) {
        Random rand = new Random();

        if (roll.getSource().equals(btnGeo)) {
            tfGeo.setText(mainTraits.get(0).get(rand.nextInt(mainTraits.get(0).size())));
        } else if (roll.getSource().equals(btnClimate)) {
            tfClimate.setText(mainTraits.get(1).get(rand.nextInt(mainTraits.get(1).size())));
        } else if (roll.getSource().equals(btnInhab)) {
            tfInhab.setText(mainTraits.get(2).get(rand.nextInt(mainTraits.get(2).size())));
        } else if (roll.getSource().equals(btnPresence)) {
            tfPresence.setText(mainTraits.get(3).get(rand.nextInt(mainTraits.get(3).size())));
        }
    }

    @FXML
    private void rollMisc (ActionEvent roll) {
        Random rand = new Random();

        if (roll.getSource().equals(btnMiscOne)) {
            if (miscOne.getValue().equals("Environmental Effects")) {
                tfMiscOne.setText(mainTraits.get(4).get(rand.nextInt(mainTraits.get(4).size())));
            } else if (miscOne.getValue().equals("Free City Modifiers")) {
                tfMiscOne.setText(mainTraits.get(5).get(rand.nextInt(mainTraits.get(5).size())));
            } else if (miscOne.getValue().equals("Rule Modifiers")) {
                tfMiscOne.setText(mainTraits.get(6).get(rand.nextInt(mainTraits.get(6).size())));
            } else if (miscOne.getValue().equals("Unit Modifiers")) {
                tfMiscOne.setText(mainTraits.get(7).get(rand.nextInt(mainTraits.get(7).size())));
            } else {
                tfMiscOne.setText("None");
            }
        }
        else if (roll.getSource().equals(btnMiscTwo)) {
            if (miscTwo.getValue().equals("Environmental Effects")) {
                tfMiscTwo.setText(mainTraits.get(4).get(rand.nextInt(mainTraits.get(4).size())));
            } else if (miscTwo.getValue().equals("Free City Modifiers")) {
                tfMiscTwo.setText(mainTraits.get(5).get(rand.nextInt(mainTraits.get(5).size())));
            } else if (miscTwo.getValue().equals("Rule Modifiers")) {
                tfMiscTwo.setText(mainTraits.get(6).get(rand.nextInt(mainTraits.get(6).size())));
            } else if (miscTwo.getValue().equals("Unit Modifiers")) {
                tfMiscTwo.setText(mainTraits.get(7).get(rand.nextInt(mainTraits.get(7).size())));
            } else {
                tfMiscTwo.setText("None");
            }
        }
        else if (roll.getSource().equals(btnMiscThree)) {
            if (miscThree.getValue().equals("Environmental Effects")) {
                tfMiscThree.setText(mainTraits.get(4).get(rand.nextInt(mainTraits.get(4).size())));
            } else if (miscThree.getValue().equals("Free City Modifiers")) {
                tfMiscThree.setText(mainTraits.get(5).get(rand.nextInt(mainTraits.get(5).size())));
            } else if (miscThree.getValue().equals("Rule Modifiers")) {
                tfMiscThree.setText(mainTraits.get(6).get(rand.nextInt(mainTraits.get(6).size())));
            } else if (miscThree.getValue().equals("Unit Modifiers")) {
                tfMiscThree.setText(mainTraits.get(7).get(rand.nextInt(mainTraits.get(7).size())));
            } else {
                tfMiscThree.setText("None");
            }
        }
        else if (roll.getSource().equals(btnMiscFour)) {
            if (miscFour.getValue().equals("Environmental Effects")) {
                tfMiscFour.setText(mainTraits.get(4).get(rand.nextInt(mainTraits.get(4).size())));
            } else if (miscFour.getValue().equals("Free City Modifiers")) {
                tfMiscFour.setText(mainTraits.get(5).get(rand.nextInt(mainTraits.get(5).size())));
            } else if (miscFour.getValue().equals("Rule Modifiers")) {
                tfMiscFour.setText(mainTraits.get(6).get(rand.nextInt(mainTraits.get(6).size())));
            } else if (miscFour.getValue().equals("Unit Modifiers")) {
                tfMiscFour.setText(mainTraits.get(7).get(rand.nextInt(mainTraits.get(7).size())));
            } else {
                tfMiscFour.setText("None");
            }
        }
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