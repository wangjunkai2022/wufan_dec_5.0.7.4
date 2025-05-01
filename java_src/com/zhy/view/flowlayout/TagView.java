package com.zhy.view.flowlayout;

import android.content.Context;
import android.view.View;
import android.widget.Checkable;
import android.widget.FrameLayout;
/* loaded from: classes6.dex */
public class TagView extends FrameLayout implements Checkable {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f68641c = {16842912};

    /* renamed from: b  reason: collision with root package name */
    private boolean f68642b;

    public TagView(Context context) {
        super(context);
    }

    public View getTagView() {
        return getChildAt(0);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f68642b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 1);
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f68641c);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z4) {
        if (this.f68642b != z4) {
            this.f68642b = z4;
            refreshDrawableState();
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f68642b);
    }
}
