package com.join.mgps.dialog;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.PopupWindow;
/* compiled from: ClassifyGamePopupowindow.java */
/* loaded from: classes4.dex */
public class u extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    private a f49692a;

    /* compiled from: ClassifyGamePopupowindow.java */
    /* loaded from: classes4.dex */
    public interface a {
        void N();
    }

    public u(View view, int i4, int i5, boolean z4, a aVar) {
        super(view, i4, i5, z4);
        this.f49692a = aVar;
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        a aVar = this.f49692a;
        if (aVar != null) {
            aVar.N();
        }
        super.dismiss();
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            setHeight(view.getResources().getDisplayMetrics().heightPixels - rect.bottom);
        }
        super.showAsDropDown(view);
    }
}
