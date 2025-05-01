package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.util.JacksonFeature;
/* loaded from: classes3.dex */
public final class JacksonFeatureSet<F extends JacksonFeature> {
    protected int _enabled;

    protected JacksonFeatureSet(int i4) {
        this._enabled = i4;
    }

    public static <F extends JacksonFeature> JacksonFeatureSet<F> fromBitmask(int i4) {
        return new JacksonFeatureSet<>(i4);
    }

    public static <F extends JacksonFeature> JacksonFeatureSet<F> fromDefaults(F[] fArr) {
        if (fArr.length <= 31) {
            int i4 = 0;
            for (F f5 : fArr) {
                if (f5.enabledByDefault()) {
                    i4 |= f5.getMask();
                }
            }
            return new JacksonFeatureSet<>(i4);
        }
        throw new IllegalArgumentException(String.format("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", fArr[0].getClass().getName(), Integer.valueOf(fArr.length)));
    }

    public int asBitmask() {
        return this._enabled;
    }

    public boolean isEnabled(F f5) {
        return (f5.getMask() & this._enabled) != 0;
    }

    public JacksonFeatureSet<F> with(F f5) {
        int mask = f5.getMask() | this._enabled;
        return mask == this._enabled ? this : new JacksonFeatureSet<>(mask);
    }

    public JacksonFeatureSet<F> without(F f5) {
        int mask = (f5.getMask() ^ (-1)) & this._enabled;
        return mask == this._enabled ? this : new JacksonFeatureSet<>(mask);
    }
}
