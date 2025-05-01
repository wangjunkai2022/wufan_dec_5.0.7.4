package androidx.core.view;

import androidx.annotation.Nullable;
/* loaded from: classes2.dex */
public interface NestedScrollingChild {
    boolean dispatchNestedFling(float f5, float f6, boolean z4);

    boolean dispatchNestedPreFling(float f5, float f6);

    boolean dispatchNestedPreScroll(int i4, int i5, @Nullable int[] iArr, @Nullable int[] iArr2);

    boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, @Nullable int[] iArr);

    boolean hasNestedScrollingParent();

    boolean isNestedScrollingEnabled();

    void setNestedScrollingEnabled(boolean z4);

    boolean startNestedScroll(int i4);

    void stopNestedScroll();
}
