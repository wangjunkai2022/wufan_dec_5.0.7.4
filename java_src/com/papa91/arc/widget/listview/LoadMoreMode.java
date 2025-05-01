package com.papa91.arc.widget.listview;
/* loaded from: classes5.dex */
public enum LoadMoreMode {
    CLICK,
    SCROLL;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static LoadMoreMode mapIntToValue(int i4) {
        if (i4 != 1) {
            return CLICK;
        }
        return SCROLL;
    }
}
