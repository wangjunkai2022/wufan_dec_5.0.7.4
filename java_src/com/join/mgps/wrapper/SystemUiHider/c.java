package com.join.mgps.wrapper.SystemUiHider;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.view.View;
/* compiled from: SystemUiHiderHoneycomb.java */
@TargetApi(11)
/* loaded from: classes5.dex */
class c extends com.join.mgps.wrapper.SystemUiHider.b {

    /* renamed from: j  reason: collision with root package name */
    private int f54994j;

    /* renamed from: k  reason: collision with root package name */
    private int f54995k;

    /* renamed from: l  reason: collision with root package name */
    private int f54996l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f54997m;

    /* renamed from: n  reason: collision with root package name */
    private View.OnSystemUiVisibilityChangeListener f54998n;

    /* renamed from: o  reason: collision with root package name */
    private View.OnSystemUiVisibilityChangeListener f54999o;

    /* compiled from: SystemUiHiderHoneycomb.java */
    /* loaded from: classes5.dex */
    class a implements View.OnSystemUiVisibilityChangeListener {
        a() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i4) {
            if (Build.VERSION.SDK_INT < 16) {
                c.this.f54989a.getWindow().setFlags(1024, 1024);
            }
            if (i4 == 0) {
                c.this.f54992d.onVisibilityChange(false);
                c.this.f54997m = false;
                return;
            }
            c.this.f54992d.onVisibilityChange(true);
            c.this.f54997m = true;
        }
    }

    /* compiled from: SystemUiHiderHoneycomb.java */
    /* loaded from: classes5.dex */
    class b implements View.OnSystemUiVisibilityChangeListener {
        b() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i4) {
            if ((i4 & c.this.f54996l) != 0) {
                if (Build.VERSION.SDK_INT < 16) {
                    c.this.f54989a.getWindow().setFlags(1024, 1024);
                }
                c.this.f54992d.onVisibilityChange(false);
                c.this.f54997m = false;
                return;
            }
            c cVar = c.this;
            cVar.f54990b.setSystemUiVisibility(cVar.f54994j);
            if (Build.VERSION.SDK_INT < 16) {
                c.this.f54989a.getWindow().setFlags(0, 1024);
            }
            c.this.f54992d.onVisibilityChange(true);
            c.this.f54997m = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(Activity activity, View view, int i4) {
        super(activity, view, i4);
        this.f54997m = true;
        this.f54998n = new a();
        this.f54999o = new b();
        this.f54994j = 0;
        this.f54995k = 1;
        this.f54996l = 1;
        int i5 = this.f54991c;
        if ((i5 & 2) != 0) {
            this.f54995k = 1 | 1028;
        }
        if ((i5 & 6) != 0) {
            this.f54996l = 2;
        }
    }

    @Override // com.join.mgps.wrapper.SystemUiHider.b, com.join.mgps.wrapper.SystemUiHider.a
    public void b() {
        this.f54990b.setSystemUiVisibility(this.f54995k);
        if (Build.VERSION.SDK_INT >= 19) {
            this.f54990b.setSystemUiVisibility(this.f54995k | 2 | 512 | 4096);
        }
    }

    @Override // com.join.mgps.wrapper.SystemUiHider.b, com.join.mgps.wrapper.SystemUiHider.a
    public boolean c() {
        return this.f54997m;
    }

    @Override // com.join.mgps.wrapper.SystemUiHider.b, com.join.mgps.wrapper.SystemUiHider.a
    public void e() {
        this.f54990b.setOnSystemUiVisibilityChangeListener(this.f54998n);
    }

    @Override // com.join.mgps.wrapper.SystemUiHider.b, com.join.mgps.wrapper.SystemUiHider.a
    public void f() {
        this.f54990b.setSystemUiVisibility(this.f54994j);
    }
}
