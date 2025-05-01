package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;
/* loaded from: classes2.dex */
public interface ItemTouchUIUtil {
    void clearView(View view);

    void onDraw(Canvas canvas, RecyclerView recyclerView, View view, float f5, float f6, int i4, boolean z4);

    void onDrawOver(Canvas canvas, RecyclerView recyclerView, View view, float f5, float f6, int i4, boolean z4);

    void onSelected(View view);
}
