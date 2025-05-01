package com.join.mgps.customview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
/* loaded from: classes4.dex */
public class CopyTextViewNew extends WebView {

    /* renamed from: b  reason: collision with root package name */
    private float f46738b;

    /* renamed from: c  reason: collision with root package name */
    private float f46739c;

    /* renamed from: d  reason: collision with root package name */
    private float f46740d;

    /* renamed from: e  reason: collision with root package name */
    private String f46741e;
    @SuppressLint({"HandlerLeak"})

    /* renamed from: f  reason: collision with root package name */
    Handler f46742f;

    /* loaded from: classes4.dex */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                float floatValue = ((Float) message.obj).floatValue();
                CopyTextViewNew.this.getLayoutParams().height = (int) (floatValue * CopyTextViewNew.this.getResources().getDisplayMetrics().density);
            }
            super.handleMessage(message);
        }
    }

    /* loaded from: classes4.dex */
    private class b {
        private b() {
        }

        @JavascriptInterface
        public void resize(float f5) {
            StringBuilder sb = new StringBuilder();
            sb.append("tbl>>>>:");
            sb.append(f5);
            sb.append(">>>>:");
            sb.append(CopyTextViewNew.this.f46741e);
            Message message = new Message();
            message.what = 1;
            message.obj = Float.valueOf(f5);
            CopyTextViewNew.this.f46742f.sendMessage(message);
        }
    }

    public CopyTextViewNew(Context context) {
        super(context);
        this.f46741e = "";
        this.f46742f = new a();
        b();
    }

    private void b() {
        this.f46738b = 20.0f;
        this.f46739c = 20.0f;
        this.f46740d = 24.0f;
        getSettings().setBuiltInZoomControls(false);
        getSettings().setTextSize(WebSettings.TextSize.NORMAL);
        getSettings().setCacheMode(2);
    }

    public String getText() {
        return this.f46741e;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        StringBuilder sb = new StringBuilder();
        sb.append("touchevent");
        sb.append(super.onTouchEvent(motionEvent));
        return false;
    }

    public void setText(String str) {
        this.f46741e = str;
        loadDataWithBaseURL(null, "<html><head><style type=\"text/css\">body{font-size:14px}</style></head><body text='#373737' style='margin:0;padding:0;line-height:" + this.f46738b + "px'>" + str.replace("\n", "<br />") + "</body></html>", "text/html", "utf-8", null);
    }

    public void setTextForum(String str) {
        this.f46741e = str;
        loadDataWithBaseURL(null, "<html><head><style type=\"text/css\">body{font-size:16px}</style></head><body text='#373737' style='margin:0;padding:0;line-height:" + this.f46740d + "px'>" + str.replace("\n", "<br />") + "</body></html>", "text/html", "utf-8", null);
    }

    public void setTextHeader(String str) {
        this.f46741e = str;
        loadDataWithBaseURL(null, "<html><head><style type=\"text/css\">body{font-size:14px}</style></head><body text='#373737' style='margin:0;padding:0;line-height:" + this.f46739c + "px'>" + str.replace("\n", "<br />") + "</body></html>", "text/html", "utf-8", null);
    }

    public CopyTextViewNew(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46741e = "";
        this.f46742f = new a();
        b();
    }

    public CopyTextViewNew(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f46741e = "";
        this.f46742f = new a();
        b();
    }
}
