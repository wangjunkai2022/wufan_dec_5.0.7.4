package com.netease.nis.quicklogin.view;

import android.view.View;
import com.netease.nis.basesdk.Logger;
/* compiled from: DelegateOnClickImp.java */
/* loaded from: classes5.dex */
public class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final View.OnClickListener f57657a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f57658b = true;

    public a(View.OnClickListener onClickListener) {
        this.f57657a = onClickListener;
    }

    public void a(boolean z4) {
        this.f57658b = z4;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        long currentTimeMillis = System.currentTimeMillis();
        long longValue = view.getTag(view.getId()) != null ? ((Long) view.getTag(view.getId())).longValue() : 0L;
        if (longValue != 0 && currentTimeMillis - longValue <= 1500) {
            if (this.f57658b) {
                Logger.d("本次点击丢弃");
                return;
            }
            View.OnClickListener onClickListener = this.f57657a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
                return;
            }
            return;
        }
        View.OnClickListener onClickListener2 = this.f57657a;
        if (onClickListener2 != null) {
            onClickListener2.onClick(view);
        }
        view.setTag(view.getId(), Long.valueOf(currentTimeMillis));
    }
}
