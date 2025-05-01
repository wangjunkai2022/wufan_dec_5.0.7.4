package com.aggmoread.sdk.z.a.t;

import android.os.CountDownTimer;
import android.widget.TextView;
/* loaded from: classes2.dex */
public class i extends CountDownTimer {

    /* renamed from: a  reason: collision with root package name */
    TextView f2593a;

    /* renamed from: b  reason: collision with root package name */
    a f2594b;

    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void a(long j4);
    }

    public i(a aVar, long j4, long j5) {
        super(j4, j5);
        this.f2594b = aVar;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        this.f2594b.a();
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j4) {
        this.f2594b.a(j4);
        TextView textView = this.f2593a;
        if (textView != null) {
            textView.setText("跳过(" + (j4 / 1000) + ")");
        }
    }
}
