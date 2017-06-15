package com.loneboat.dmanager.tools.spellsearcher;

import com.loneboat.dmanager.misc.PlayerClass;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

/*
 * com.loneboat.dmanager.tools.SpellSearcherController in DManager
 * Created by Tyler Crowe on 6/14/2017.
 * Website: https://loneboat.com
 * GitHub: https://github.com/Dubpubber
 * Machine Time: 1:35 PM
 */
public class SpellSearcherController implements Initializable {

    @FXML private Slider SpellSearcher_LvlSlider;
    @FXML private Label SpellSearcher_LvlLabel;

    // Class picker choice box
    @FXML private ComboBox<String> SpellSearcher_ClassPicker;
    private ObservableList<String> classes;

    // Table that will produce the results of the search
    @FXML private TableView SpellSearcher_SpellTable;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Populate the choice box using the PlayerClass enums and some Java 8 magic
        this.classes = FXCollections.observableArrayList(
                Arrays.stream(PlayerClass.values()).map(Enum::name).toArray(String[]::new)
        );
        SpellSearcher_ClassPicker.setItems(classes);
    }

    /**
     * Called when the user releases the level slider.
     *
     * On Action: Update the label @SpellSearcher_LvlLabel based on the slider's current value.
     */
    @FXML
    public void levelSliderChanged() {
        SpellSearcher_LvlLabel.setText(String.valueOf(
                Math.round(SpellSearcher_LvlSlider.getValue())
        ));
    }
}
