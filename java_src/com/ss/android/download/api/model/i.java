package com.ss.android.download.api.model;
/* loaded from: classes5.dex */
public class i {

    /* renamed from: m  reason: collision with root package name */
    private String f60301m;
    private String vv;

    /* loaded from: classes5.dex */
    public static class vv {

        /* renamed from: m  reason: collision with root package name */
        private String f60302m;
        private String vv;

        public vv m(String str) {
            this.f60302m = str;
            return this;
        }

        public vv vv(String str) {
            this.vv = str;
            return this;
        }

        public i vv() {
            return new i(this);
        }
    }

    public i(vv vvVar) {
        this.vv = vvVar.vv;
        this.f60301m = vvVar.f60302m;
    }

    public String vv() {
        return this.vv;
    }
}
