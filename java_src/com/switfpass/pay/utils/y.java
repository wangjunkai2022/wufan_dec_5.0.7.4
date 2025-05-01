package com.switfpass.pay.utils;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.switfpass.pay.MainApplication;
import m.framework.ui.widget.asyncview.AsyncImageView;
/* loaded from: classes5.dex */
public class y implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private x f61972b;

    /* renamed from: c  reason: collision with root package name */
    private Context f61973c;

    /* renamed from: d  reason: collision with root package name */
    public String f61974d = "pay.qq.jspay";

    public y(Context context, x xVar) {
        this.f61973c = context;
        this.f61972b = xVar;
    }

    public PopupWindow a(String str, int i4) {
        Resources resources;
        int i5;
        View inflate = View.inflate(this.f61973c, com.join.android.app.mgsim.wufun.R.array.materia_colors, null);
        PopupWindow popupWindow = new PopupWindow(inflate, i4, -1);
        ImageView imageView = (ImageView) inflate.findViewById(com.join.android.app.mgsim.wufun.R.dimen.abc_dialog_list_padding_bottom_no_buttons);
        if (str.equals(MainApplication.f61500k) || str.equalsIgnoreCase(this.f61974d)) {
            resources = this.f61973c.getResources();
            i5 = 2130837549;
        } else if (str.startsWith(MainApplication.f61503n)) {
            resources = this.f61973c.getResources();
            i5 = 2130837551;
        } else {
            resources = this.f61973c.getResources();
            i5 = 2130837550;
        }
        imageView.setImageDrawable(resources.getDrawable(i5));
        imageView.setOnClickListener(new j1(popupWindow));
        popupWindow.setWidth(i4);
        popupWindow.setAnimationStyle(16973826);
        popupWindow.update();
        popupWindow.setBackgroundDrawable(this.f61973c.getResources().getDrawable(AsyncImageView.DEFAULT_TRANSPARENT));
        popupWindow.setFocusable(true);
        popupWindow.setTouchable(true);
        popupWindow.setOutsideTouchable(false);
        return popupWindow;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        x xVar = this.f61972b;
        if (xVar != null) {
            xVar.a(view);
        }
    }
}
