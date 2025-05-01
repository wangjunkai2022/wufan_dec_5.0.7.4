package com.flipboard.bottomsheet.custom;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Outline;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
/* compiled from: Util.java */
/* loaded from: classes3.dex */
class a {

    /* compiled from: Util.java */
    @TargetApi(21)
    /* renamed from: com.flipboard.bottomsheet.custom.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static class C0288a extends ViewOutlineProvider {

        /* renamed from: a  reason: collision with root package name */
        int f12907a;

        /* renamed from: b  reason: collision with root package name */
        int f12908b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0288a(int i4, int i5) {
            this.f12907a = i4;
            this.f12908b = i5;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, this.f12907a, this.f12908b);
        }
    }

    private a() {
        throw new AssertionError("No Instances");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(Context context, float f5) {
        return Math.round(TypedValue.applyDimension(1, f5, context.getResources().getDisplayMetrics()));
    }
}
