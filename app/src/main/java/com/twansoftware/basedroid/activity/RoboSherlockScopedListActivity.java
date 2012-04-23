package com.twansoftware.basedroid.activity;

import com.github.rtyley.android.sherlock.roboguice.activity.RoboSherlockListActivity;
import com.google.inject.Key;
import roboguice.util.RoboContext;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: achuinard
 * 4/23/12
 */
public class RoboSherlockScopedListActivity extends RoboSherlockListActivity implements RoboContext {
    protected Map<Key<?>, Object> scopedObjects = new HashMap<Key<?>, Object>();

    @Override
    public Map<Key<?>, Object> getScopedObjectMap() {
        return scopedObjects;
    }
}