package org.citra.emu.settings.view;

import org.citra.emu.settings.model.Setting;

public final class SubmenuSetting extends SettingsItem {
    private String mMenuKey;

    public SubmenuSetting(String key, Setting setting, int titleId, int descriptionId, String menuKey) {
        super(key, null, setting, titleId, descriptionId);
        mMenuKey = menuKey;
    }

    public String getMenuKey() {
        return mMenuKey;
    }

    @Override
    public int getType() {
        return TYPE_SUBMENU;
    }
}
