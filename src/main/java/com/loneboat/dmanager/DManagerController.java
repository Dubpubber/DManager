package com.loneboat.dmanager;

import com.loneboat.dmanager.tools.spellsearcher.SpellSearcher;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/*
 * com.loneboat.dmanager.main in DManager
 * Created by Tyler Crowe on 6/14/2017.
 * Website: https://loneboat.com
 * GitHub: https://github.com/Dubpubber
 * Machine Time: 9:58 PM
 */
public class DManagerController {

    /**
     * MainMenu -> Tools -> SpellSearcher
     *
     * On Action: New window opens displaying a query forum.
     *
     * Basic appearance of window:
     *      * Enter spell by name:              [Textarea 1]
     *      Required player level:              [Slider 1]
     *      Required player class:              [ComboBox 1]
     *      Dungeon Master Lookup: [Checkbox]   [Button (Submit)]
     *
     *      [Table of found spells.]
     */
    public void handleSpellSearcherMenuButton() throws Exception {
        SpellSearcher spellSearcher = new SpellSearcher();
        spellSearcher.start(new Stage(StageStyle.DECORATED));
    }

}
