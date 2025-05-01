package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
/* loaded from: classes4.dex */
public class CustomEdittext extends EditText {

    /* renamed from: b  reason: collision with root package name */
    a f46792b;

    /* loaded from: classes4.dex */
    public interface a {
        void a(int i4, int i5);
    }

    public CustomEdittext(Context context) {
        super(context);
    }

    public a getOnSelectionChanged() {
        return this.f46792b;
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int i4, int i5) {
        super.onSelectionChanged(i4, i5);
        a aVar = this.f46792b;
        if (aVar != null) {
            aVar.a(i4, i5);
        }
    }

    public void setOnSelectionChanged(a aVar) {
        this.f46792b = aVar;
    }

    public CustomEdittext(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomEdittext(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
