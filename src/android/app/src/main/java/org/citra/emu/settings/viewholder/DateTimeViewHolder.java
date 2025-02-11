package org.citra.emu.settings.viewholder;

import android.view.View;
import android.widget.TextView;

import org.citra.emu.R;
import org.citra.emu.settings.view.DateTimeSetting;
import org.citra.emu.settings.view.SettingsItem;
import org.citra.emu.settings.SettingsAdapter;
import org.citra.emu.utils.Log;

public final class DateTimeViewHolder extends SettingViewHolder {
    private DateTimeSetting mItem;

    private TextView mTextSettingName;
    private TextView mTextSettingDescription;

    public DateTimeViewHolder(View itemView, SettingsAdapter adapter) {
        super(itemView, adapter);
    }

    @Override
    protected void findViews(View root) {
        mTextSettingName = root.findViewById(R.id.text_setting_name);
        Log.error("test " + mTextSettingName);
        mTextSettingDescription = root.findViewById(R.id.text_setting_description);
        Log.error("test " + mTextSettingDescription);
    }

    @Override
    public void bind(SettingsItem item) {
        mItem = (DateTimeSetting) item;
        mTextSettingName.setText(item.getNameId());

        if (item.getDescriptionId() > 0) {
            mTextSettingDescription.setText(item.getDescriptionId());
            mTextSettingDescription.setVisibility(View.VISIBLE);
        } else {
            mTextSettingDescription.setVisibility(View.GONE);
        }
    }

    @Override
    public void onClick(View clicked) {
        getAdapter().onDateTimeClick(mItem, getAdapterPosition());
    }
}
