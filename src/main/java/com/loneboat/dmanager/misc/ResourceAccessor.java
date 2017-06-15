package com.loneboat.dmanager.misc;

/*
 * com.loneboat.dmanager.misc.ResourceAccessor in DManager
 * Created by Tyler Crowe on 6/14/2017.
 * Website: https://loneboat.com
 * GitHub: https://github.com/Dubpubber
 * Machine Time: 2:52 PM
 */

import java.net.URL;

/**
 * Helper class for fetching resources from the resources folder created by Maven.
 */
public class ResourceAccessor {

    public enum ScreenID {
        DM_MainInterface(getResource("DManager_MainInterface.fxml")),
        DMT_SpellSearcher(getResource("DManagerTool_SpellSearcher.fxml"));

        private URL path;

        ScreenID(URL path) {
            this.path = path;
        }

        public URL getURL() {
            return path;
        }
    }

    public static URL getResource(String fileName) {
        URL path = ResourceAccessor.class.getClassLoader().getResource(fileName);
        if(path != null && !path.getFile().isEmpty()) return path;
        else return null;
    }

}
