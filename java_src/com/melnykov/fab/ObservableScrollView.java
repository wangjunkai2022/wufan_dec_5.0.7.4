package com.melnykov.fab;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
/* loaded from: classes5.dex */
public class ObservableScrollView extends ScrollView {

    /* renamed from: b  reason: collision with root package name */
    private a f55955b;

    /* loaded from: classes5.dex */
    public interface a {
        void a(ScrollView scrollView, int i4, int i5, int i6, int i7);
    }

    public ObservableScrollView(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i4, int i5, int i6, int i7) {
        super.onScrollChanged(i4, i5, i6, i7);
        a aVar = this.f55955b;
        if (aVar != null) {
            aVar.a(this, i4, i5, i6, i7);
        }
    }

    public void setOnScrollChangedListener(a aVar) {
        this.f55955b = aVar;
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
