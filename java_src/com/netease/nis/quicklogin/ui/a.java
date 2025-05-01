package com.netease.nis.quicklogin.ui;

import android.content.Context;
import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import com.netease.nis.quicklogin.listener.ClickEventListener;
/* compiled from: YDClickableSpan.java */
/* loaded from: classes5.dex */
public class a extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    private final ClickEventListener f57574a;

    /* renamed from: b  reason: collision with root package name */
    private final String f57575b;

    /* renamed from: c  reason: collision with root package name */
    private final String f57576c;

    /* renamed from: d  reason: collision with root package name */
    private final int f57577d;

    public a(ClickEventListener clickEventListener, String str, String str2, int i4) {
        this.f57574a = clickEventListener;
        this.f57575b = str;
        this.f57576c = str2;
        this.f57577d = i4;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@NonNull View view) {
        ClickEventListener clickEventListener = this.f57574a;
        if (clickEventListener != null) {
            clickEventListener.onClick(1, this.f57577d);
        }
        Context context = view.getContext();
        Intent intent = new Intent(context, ProtocolDetailActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("url", this.f57575b);
        intent.putExtra("title", this.f57576c);
        context.startActivity(intent);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NonNull TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.clearShadowLayer();
    }
}
