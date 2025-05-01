package com.dingmouren.layoutmanagergroup.skidright;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;
/* loaded from: classes2.dex */
public class SkidRightSnapHelper extends SnapHelper {

    /* renamed from: a  reason: collision with root package name */
    private int f10192a;

    @Override // androidx.recyclerview.widget.SnapHelper
    public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        if (layoutManager instanceof SkidRightLayoutManager) {
            int[] iArr = new int[2];
            if (layoutManager.canScrollHorizontally()) {
                iArr[0] = ((SkidRightLayoutManager) layoutManager).a(layoutManager.getPosition(view));
                iArr[1] = 0;
            } else {
                iArr[0] = 0;
                iArr[1] = ((SkidRightLayoutManager) layoutManager).a(layoutManager.getPosition(view));
            }
            return iArr;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof SkidRightLayoutManager) {
            SkidRightLayoutManager skidRightLayoutManager = (SkidRightLayoutManager) layoutManager;
            int i4 = this.f10192a;
            int f5 = skidRightLayoutManager.f(i4, i4 != 0 ? 0.8f : 0.5f);
            this.f10192a = 0;
            if (f5 != -1) {
                return layoutManager.findViewByPosition(f5);
            }
            return null;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i4, int i5) {
        if (layoutManager.canScrollHorizontally()) {
            this.f10192a = i4;
            return -1;
        }
        this.f10192a = i5;
        return -1;
    }
}
