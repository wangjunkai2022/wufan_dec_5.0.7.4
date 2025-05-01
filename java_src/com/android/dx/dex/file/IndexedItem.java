package com.android.dx.dex.file;
/* loaded from: classes.dex */
public abstract class IndexedItem extends Item {
    private int index = -1;

    public final int getIndex() {
        int i4 = this.index;
        if (i4 >= 0) {
            return i4;
        }
        throw new RuntimeException("index not yet set");
    }

    public final boolean hasIndex() {
        return this.index >= 0;
    }

    public final String indexString() {
        return '[' + Integer.toHexString(this.index) + ']';
    }

    public final void setIndex(int i4) {
        if (this.index == -1) {
            this.index = i4;
            return;
        }
        throw new RuntimeException("index already set");
    }
}
