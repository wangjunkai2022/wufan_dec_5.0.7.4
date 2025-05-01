package com.join.mgps.pulltorefresh.library;

import android.annotation.TargetApi;
import android.view.View;
import com.join.mgps.pulltorefresh.library.PullToRefreshBase;
/* compiled from: OverscrollHelper.java */
@TargetApi(9)
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    static final String f53947a = "OverscrollHelper";

    /* renamed from: b  reason: collision with root package name */
    static final float f53948b = 1.0f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OverscrollHelper.java */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f53949a;

        static {
            int[] iArr = new int[PullToRefreshBase.Orientation.values().length];
            f53949a = iArr;
            try {
                iArr[PullToRefreshBase.Orientation.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53949a[PullToRefreshBase.Orientation.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(View view) {
        return view.getOverScrollMode() != 2;
    }

    public static void b(PullToRefreshBase<?> pullToRefreshBase, int i4, int i5, int i6, int i7, int i8, int i9, float f5, boolean z4) {
        int scrollX;
        int i10;
        int i11;
        if (a.f53949a[pullToRefreshBase.getPullToRefreshScrollDirection().ordinal()] != 1) {
            scrollX = pullToRefreshBase.getScrollY();
            i10 = i6;
            i11 = i7;
        } else {
            scrollX = pullToRefreshBase.getScrollX();
            i10 = i4;
            i11 = i5;
        }
        if (!pullToRefreshBase.g() || pullToRefreshBase.c()) {
            return;
        }
        PullToRefreshBase.Mode mode = pullToRefreshBase.getMode();
        if (mode.permitsPullToRefresh() && !z4 && i10 != 0) {
            int i12 = i10 + i11;
            StringBuilder sb = new StringBuilder();
            sb.append("OverScroll. DeltaX: ");
            sb.append(i4);
            sb.append(", ScrollX: ");
            sb.append(i5);
            sb.append(", DeltaY: ");
            sb.append(i6);
            sb.append(", ScrollY: ");
            sb.append(i7);
            sb.append(", NewY: ");
            sb.append(i12);
            sb.append(", ScrollRange: ");
            sb.append(i8);
            sb.append(", CurrentScroll: ");
            sb.append(scrollX);
            if (i12 < 0 - i9) {
                if (mode.showHeaderLoadingLayout()) {
                    if (scrollX == 0) {
                        pullToRefreshBase.H(PullToRefreshBase.State.OVERSCROLLING, new boolean[0]);
                    }
                    pullToRefreshBase.setHeaderScroll((int) (f5 * (scrollX + i12)));
                }
            } else if (i12 > i8 + i9) {
                if (mode.showFooterLoadingLayout()) {
                    if (scrollX == 0) {
                        pullToRefreshBase.H(PullToRefreshBase.State.OVERSCROLLING, new boolean[0]);
                    }
                    pullToRefreshBase.setHeaderScroll((int) (f5 * ((scrollX + i12) - i8)));
                }
            } else if (Math.abs(i12) <= i9 || Math.abs(i12 - i8) <= i9) {
                pullToRefreshBase.H(PullToRefreshBase.State.RESET, new boolean[0]);
            }
        } else if (z4 && PullToRefreshBase.State.OVERSCROLLING == pullToRefreshBase.getState()) {
            pullToRefreshBase.H(PullToRefreshBase.State.RESET, new boolean[0]);
        }
    }

    public static void c(PullToRefreshBase<?> pullToRefreshBase, int i4, int i5, int i6, int i7, int i8, boolean z4) {
        b(pullToRefreshBase, i4, i5, i6, i7, i8, 0, 1.0f, z4);
    }

    public static void d(PullToRefreshBase<?> pullToRefreshBase, int i4, int i5, int i6, int i7, boolean z4) {
        c(pullToRefreshBase, i4, i5, i6, i7, 0, z4);
    }
}
