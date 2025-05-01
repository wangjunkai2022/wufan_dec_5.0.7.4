package ru.noties.scrollable;
/* compiled from: DefaultCloseUpAlgorithm.java */
/* loaded from: classes7.dex */
public class f implements c {
    @Override // ru.noties.scrollable.c
    public int a(ScrollableLayout scrollableLayout, boolean z4, int i4, int i5, int i6) {
        if (z4) {
            return 0;
        }
        return i6;
    }

    @Override // ru.noties.scrollable.c
    public int b(ScrollableLayout scrollableLayout, int i4, int i5) {
        if (i4 < i5 / 2) {
            return 0;
        }
        return i5;
    }
}
