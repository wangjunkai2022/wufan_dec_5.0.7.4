package com.ss.android.download.api.model;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;
/* loaded from: classes5.dex */
public class m {

    /* renamed from: i  reason: collision with root package name */
    public String f60303i;

    /* renamed from: k  reason: collision with root package name */
    public int f60304k;

    /* renamed from: m  reason: collision with root package name */
    public String f60305m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f60306n;

    /* renamed from: o  reason: collision with root package name */
    public String f60307o;

    /* renamed from: p  reason: collision with root package name */
    public String f60308p;
    public InterfaceC0608m qv;

    /* renamed from: u  reason: collision with root package name */
    public boolean f60309u;
    public Context vv;
    public View wv;

    /* renamed from: com.ss.android.download.api.model.m$m  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC0608m {
        void m(DialogInterface dialogInterface);

        void p(DialogInterface dialogInterface);

        void vv(DialogInterface dialogInterface);
    }

    /* loaded from: classes5.dex */
    public static final class vv {

        /* renamed from: i  reason: collision with root package name */
        private String f60310i;

        /* renamed from: k  reason: collision with root package name */
        private InterfaceC0608m f60311k;

        /* renamed from: m  reason: collision with root package name */
        public int f60312m;

        /* renamed from: n  reason: collision with root package name */
        private String f60313n;

        /* renamed from: o  reason: collision with root package name */
        private String f60314o;

        /* renamed from: p  reason: collision with root package name */
        private Context f60315p;
        private boolean qv;

        /* renamed from: u  reason: collision with root package name */
        private String f60316u;
        public View vv;
        private Drawable wv;

        public vv(Context context) {
            this.f60315p = context;
        }

        public vv i(String str) {
            this.f60313n = str;
            return this;
        }

        public vv m(String str) {
            this.f60314o = str;
            return this;
        }

        public vv p(String str) {
            this.f60316u = str;
            return this;
        }

        public vv vv(String str) {
            this.f60310i = str;
            return this;
        }

        public vv vv(boolean z4) {
            this.qv = z4;
            return this;
        }

        public vv vv(Drawable drawable) {
            this.wv = drawable;
            return this;
        }

        public vv vv(InterfaceC0608m interfaceC0608m) {
            this.f60311k = interfaceC0608m;
            return this;
        }

        public vv vv(int i4) {
            this.f60312m = i4;
            return this;
        }

        public m vv() {
            return new m(this);
        }
    }

    private m(vv vvVar) {
        this.f60309u = true;
        this.vv = vvVar.f60315p;
        this.f60305m = vvVar.f60310i;
        this.f60308p = vvVar.f60314o;
        this.f60303i = vvVar.f60316u;
        this.f60307o = vvVar.f60313n;
        this.f60309u = vvVar.qv;
        this.f60306n = vvVar.wv;
        this.qv = vvVar.f60311k;
        this.wv = vvVar.vv;
        this.f60304k = vvVar.f60312m;
    }
}
