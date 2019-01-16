package com.liskovsoft.smartyoutubetv.bootstrap.dialogtweaks;

import com.liskovsoft.smartyoutubetv.common.prefs.SmartPreferences;
import com.liskovsoft.smartyoutubetv.dialogs.GenericSelectorDialog.DialogSourceBase.DialogItem;

public class OkButtonDialogItem extends DialogItem {
    private final SmartPreferences mPrefs;

    public OkButtonDialogItem(String title, SmartPreferences prefs) {
        super(title, false);

        mPrefs = prefs;
    }

    @Override
    public boolean getChecked() {
        return mPrefs.getEnableOKPause();
    }

    @Override
    public void setChecked(boolean checked) {
        mPrefs.setEnableOKPause(checked);
    }
}