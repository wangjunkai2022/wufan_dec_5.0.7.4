package com.xinzhu.overmind;

import android.content.Intent;
/* compiled from: OvermindConfig.java */
/* loaded from: classes6.dex */
public abstract class c {

    /* compiled from: OvermindConfig.java */
    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final String f67452a = "66:55:44:33:22:11";

        /* renamed from: b  reason: collision with root package name */
        private static final String f67453b = "11:22:33:44:55:66";

        /* renamed from: c  reason: collision with root package name */
        private static final String f67454c = "FAKE_SSID";

        public String a() {
            return f67452a;
        }

        public String b() {
            return f67453b;
        }

        public String c() {
            return f67454c;
        }
    }

    public boolean a(String str) {
        return false;
    }

    public boolean b() {
        return false;
    }

    public a c() {
        return null;
    }

    public boolean d() {
        return false;
    }

    public abstract String e();

    public String f() {
        return "com.xinzhu.overmind.msms";
    }

    public String g() {
        return "com.xinzhu.overmind.stub.virtual.service.ext_helper";
    }

    public abstract String h();

    public boolean i(String str) {
        return false;
    }

    public boolean j(String str) {
        return false;
    }

    public boolean k(String str) {
        return false;
    }

    public String l() {
        return "overmind";
    }

    public boolean m(String str) {
        return "android.media.action.IMAGE_CAPTURE".equals(str) || "android.media.action.VIDEO_CAPTURE".equals(str) || "android.intent.action.PICK".equals(str);
    }

    public abstract boolean n(String str);

    public boolean o(Intent intent) {
        return false;
    }

    public boolean p() {
        return true;
    }

    public boolean q() {
        return true;
    }

    public Intent r(Intent intent) {
        return null;
    }
}
