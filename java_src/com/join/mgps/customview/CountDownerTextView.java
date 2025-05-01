package com.join.mgps.customview;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.ref.WeakReference;
/* loaded from: classes4.dex */
public class CountDownerTextView extends TextView {

    /* renamed from: c  reason: collision with root package name */
    private static final int f46752c = 1000;

    /* renamed from: d  reason: collision with root package name */
    private static final int f46753d = 1;

    /* renamed from: e  reason: collision with root package name */
    private static final int f46754e = 100;

    /* renamed from: b  reason: collision with root package name */
    private a f46755b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<CountDownerTextView> f46756a;

        /* renamed from: b  reason: collision with root package name */
        private int f46757b;

        /* renamed from: c  reason: collision with root package name */
        private int f46758c;

        /* renamed from: d  reason: collision with root package name */
        private long f46759d;

        /* renamed from: e  reason: collision with root package name */
        private String f46760e;

        /* renamed from: f  reason: collision with root package name */
        private String f46761f;

        public a(CountDownerTextView countDownerTextView) {
            this.f46756a = new WeakReference<>(countDownerTextView);
        }

        public void a(int i4, int i5, long j4, String str, String str2) {
            this.f46757b = i4;
            this.f46758c = i5;
            this.f46759d = j4;
            this.f46760e = str;
            this.f46761f = str2;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            CountDownerTextView countDownerTextView;
            super.handleMessage(message);
            if (message.what != 100 || (countDownerTextView = this.f46756a.get()) == null) {
                return;
            }
            this.f46757b += this.f46758c;
            countDownerTextView.setText(this.f46760e + com.join.mgps.Util.y.f(this.f46757b) + this.f46761f);
            sendEmptyMessageDelayed(100, this.f46759d);
        }
    }

    public CountDownerTextView(Context context) {
        super(context);
        b();
    }

    private int a(long j4, int i4) {
        return (int) ((((SystemClock.elapsedRealtime() - j4) / 1000) + i4) - 1);
    }

    void b() {
        this.f46755b = new a(this);
    }

    public void c(int i4, int i5, long j4, int i6, String str, String str2) {
        int a5 = a(j4, i6);
        setText(str + com.join.mgps.Util.y.f(a5) + str2);
        if (this.f46755b == null) {
            this.f46755b = new a(this);
        }
        this.f46755b.a(a5, i5, i4, str, str2);
        this.f46755b.removeMessages(100);
        this.f46755b.sendEmptyMessage(100);
    }

    public void d(long j4, int i4, String str, String str2) {
        c(1000, 1, j4, i4, str, str2);
    }

    public void e() {
        a aVar = this.f46755b;
        if (aVar != null) {
            aVar.removeMessages(100);
            this.f46755b = null;
        }
    }

    public CountDownerTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }
}
