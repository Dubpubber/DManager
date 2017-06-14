package com.loneboat.dmanager.main;

import com.loneboat.dmanager.tools.SpellSearcher;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class DManagerController {

    /**
     * MainMenu -> Tools -> SpellSearcher
     *
     * On Action: New window opens displaying a label, a checkbox, 4 textfields, submit and cancel button.
     *
     * Basic appearance of window:
     *      * Enter spell by name:      [Textarea 1]
     *      Required player level:      [Textarea 2]
     *      Required player class:      [Textarea 3]
     *                                  [Button (Submit)]
     *      Dungeon Master Lookup: [Checkbox]
     *      [Textarea 4] (Spell description appears)
     *                                  [Button (Close)]
     */
    public void handleSpellSearcherMenuButton() throws Exception {
        SpellSearcher spellSearcher = new SpellSearcher();
        spellSearcher.start(new Stage(StageStyle.DECORATED));
    }

}
