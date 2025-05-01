package com.aggmoread.sdk.z.a.r;

import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
/* loaded from: classes2.dex */
public class h extends CountDownTimer {

    /* renamed from: a  reason: collision with root package name */
    View f2454a;

    /* renamed from: b  reason: collision with root package name */
    a f2455b;

    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void a(long j4);
    }

    public h(View view, a aVar, long j4, long j5) {
        super(j4, j5);
        this.f2454a = view;
        this.f2455b = aVar;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        this.f2455b.a();
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j4) {
        View view = this.f2454a;
        if (view instanceof TextView) {
            ((TextView) view).setText("跳过" + (j4 / 1000) + "s");
        }
        a aVar = this.f2455b;
        if (aVar != null) {
            aVar.a(j4);
        }
    }
}
