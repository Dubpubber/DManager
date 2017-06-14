package com.loneboat.dmanager.tools;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.stage.Stage;

/*
 * com.loneboat.dmanager.tools.SpellSearcher in DManager
 * Created by Tyler Crowe on 6/14/2017.
 * Website: https://loneboat.com
 * GitHub: https://github.com/Dubpubber
 * Machine Time: 1:58 AM
 */
public class SpellSearcher extends Application {

    @FXML private Slider SpellSearcher_LvlSlider;
    @FXML private Label SpellSearcher_LvlLabel;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("DManagerTool_SpellSearcher.fxml"));
        primaryStage.setTitle("SpellSearcher");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
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
