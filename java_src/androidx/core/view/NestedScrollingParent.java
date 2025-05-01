package androidx.core.view;

import android.view.View;
import androidx.annotation.NonNull;
/* loaded from: classes2.dex */
public interface NestedScrollingParent {
    int getNestedScrollAxes();

    boolean onNestedFling(@NonNull View view, float f5, float f6, boolean z4);

    boolean onNestedPreFling(@NonNull View view, float f5, float f6);

    void onNestedPreScroll(@NonNull View view, int i4, int i5, @NonNull int[] iArr);

    void onNestedScroll(@NonNull View view, int i4, int i5, int i6, int i7);

    void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i4);

    boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i4);

    void onStopNestedScroll(@NonNull View view);
}
