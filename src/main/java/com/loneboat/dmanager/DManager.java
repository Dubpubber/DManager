package com.loneboat.dmanager;

import com.loneboat.dmanager.misc.ResourceAccessor;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*
 * com.loneboat.dmanager.main in DManager
 * Created by Tyler Crowe on 6/14/2017.
 * Website: https://loneboat.com
 * GitHub: https://github.com/Dubpubber
 * Machine Time: 9:58 PM
 */
public class DManager extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(ResourceAccessor.ScreenID.DM_MainInterface.getURL());
        primaryStage.setTitle("DManager - Written by Loneboat Software");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
