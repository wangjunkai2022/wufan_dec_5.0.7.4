package com.papa.gsyvideoplayer.utils;

import android.view.View;
import java.lang.ref.WeakReference;
/* compiled from: MeasureHelper.java */
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<View> f58522a;

    /* renamed from: b  reason: collision with root package name */
    private int f58523b;

    /* renamed from: c  reason: collision with root package name */
    private int f58524c;

    /* renamed from: d  reason: collision with root package name */
    private int f58525d;

    /* renamed from: e  reason: collision with root package name */
    private int f58526e;

    /* renamed from: f  reason: collision with root package name */
    private int f58527f;

    /* renamed from: g  reason: collision with root package name */
    private int f58528g;

    /* renamed from: h  reason: collision with root package name */
    private int f58529h;

    /* renamed from: i  reason: collision with root package name */
    private int f58530i = 0;

    /* renamed from: j  reason: collision with root package name */
    private final a f58531j;

    /* compiled from: MeasureHelper.java */
    /* loaded from: classes5.dex */
    public interface a {
        int getCurrentVideoHeight();

        int getCurrentVideoWidth();

        int getVideoSarDen();

        int getVideoSarNum();
    }

    public j(View view, a aVar) {
        this.f58531j = aVar;
        this.f58522a = new WeakReference<>(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00fb, code lost:
        if (r4 != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00fe, code lost:
        if (r4 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0100, code lost:
        r15 = (int) (r2 / r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0104, code lost:
        r14 = (int) (r5 * r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.papa.gsyvideoplayer.utils.j.a(int, int):void");
    }

    public int b() {
        return this.f58529h;
    }

    public int c() {
        return this.f58528g;
    }

    public View d() {
        WeakReference<View> weakReference = this.f58522a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public void e(int i4, int i5, int i6) {
        a aVar = this.f58531j;
        if (aVar != null) {
            try {
                int currentVideoWidth = aVar.getCurrentVideoWidth();
                int currentVideoHeight = this.f58531j.getCurrentVideoHeight();
                c.h("videoWidth: " + currentVideoWidth + " videoHeight: " + currentVideoHeight);
                int videoSarNum = this.f58531j.getVideoSarNum();
                int videoSarDen = this.f58531j.getVideoSarDen();
                if (currentVideoWidth > 0 && currentVideoHeight > 0) {
                    h(videoSarNum, videoSarDen);
                    i(currentVideoWidth, currentVideoHeight);
                }
                g(i6);
                a(i4, i5);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    public void f(int i4) {
        this.f58530i = i4;
    }

    public void g(int i4) {
        this.f58527f = i4;
    }

    public void h(int i4, int i5) {
        this.f58525d = i4;
        this.f58526e = i5;
    }

    public void i(int i4, int i5) {
        this.f58523b = i4;
        this.f58524c = i5;
    }
}
