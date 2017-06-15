package com.loneboat.dmanager.tools.spellsearcher;

import com.loneboat.dmanager.misc.ResourceAccessor;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*
 * com.loneboat.dmanager.tools.SpellSearcher in DManager
 * Created by Tyler Crowe on 6/14/2017.
 * Website: https://loneboat.com
 * GitHub: https://github.com/Dubpubber
 * Machine Time: 1:58 AM
 */
public class SpellSearcher extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(ResourceAccessor.ScreenID.DMT_SpellSearcher.getURL());
        primaryStage.setTitle("SpellSearcher");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }
}
