package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.join.mgps.Util.v0;
import com.join.mgps.ptr.PtrFrameLayout;
/* loaded from: classes4.dex */
public class MyRecyclerView extends RecyclerView {

    /* renamed from: b  reason: collision with root package name */
    private com.join.mgps.ptr.a f47428b;

    /* renamed from: c  reason: collision with root package name */
    private g f47429c;

    /* loaded from: classes4.dex */
    class a extends com.join.mgps.ptr.a {
        a() {
        }

        @Override // com.join.mgps.ptr.a, com.join.mgps.ptr.b
        public boolean checkCanDoRefresh(PtrFrameLayout ptrFrameLayout, View view, View view2) {
            return com.join.mgps.ptr.a.checkContentCanBePulledDown(ptrFrameLayout, view, view2);
        }

        @Override // com.join.mgps.ptr.b
        public void onRefreshBegin(PtrFrameLayout ptrFrameLayout) {
            v0.g("onRefreshBegin----------");
            if (MyRecyclerView.this.f47429c != null) {
                MyRecyclerView.this.f47429c.onRefresh();
            }
        }
    }

    public MyRecyclerView(Context context) {
        super(context);
        this.f47428b = new a();
    }

    public void setPullRefreshEnable(g gVar) {
        this.f47429c = gVar;
        if (getParent() == null || !(getParent() instanceof PtrFrameLayout)) {
            return;
        }
        ((PtrFrameLayout) getParent()).setPtrHandler(this.f47428b);
    }

    public void stopRefresh() {
        if (getParent() == null || !(getParent() instanceof PtrFrameLayout)) {
            return;
        }
        ((PtrFrameLayout) getParent()).C();
    }

    public MyRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47428b = new a();
    }

    public MyRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47428b = new a();
    }
}
