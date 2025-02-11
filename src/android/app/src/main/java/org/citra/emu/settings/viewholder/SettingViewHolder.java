package org.citra.emu.settings.viewholder;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import org.citra.emu.settings.view.SettingsItem;
import org.citra.emu.settings.SettingsAdapter;

public abstract class SettingViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private SettingsAdapter mAdapter;

    public SettingViewHolder(View itemView, SettingsAdapter adapter) {
        super(itemView);

        mAdapter = adapter;

        itemView.setOnClickListener(this);

        findViews(itemView);
    }

    protected SettingsAdapter getAdapter() {
        return mAdapter;
    }

    /**
     * Gets handles to all this ViewHolder's child views using their XML-defined identifiers.
     *
     * @param root The newly inflated top-level view.
     */
    protected abstract void findViews(View root);

    /**
     * Called by the adapter to set this ViewHolder's child views to display the list item
     * it must now represent.
     *
     * @param item The list item that should be represented by this ViewHolder.
     */
    public abstract void bind(SettingsItem item);

    /**
     * Called when this ViewHolder's view is clicked on. Implementations should usually pass
     * this event up to the adapter.
     *
     * @param clicked The view that was clicked on.
     */
    public abstract void onClick(View clicked);
}
