package com.xinzhu.overmind.client;

import com.xinzhu.overmind.Overmind;
import java.util.Locale;
/* compiled from: StubManifest.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final int f67481a = 100;

    public static String a() {
        return Overmind.get().getMainAuthorityPrefix() + ".overmind.BindProvider";
    }

    public static String b() {
        return String.format(Locale.CHINA, "%s.overmind.plugin_monitor", Overmind.get().getPluginAuthorityPrefix());
    }

    public static String c(int i4) {
        return String.format(Locale.CHINA, "%s.stub_content_provider_%d", Overmind.get().getPluginAuthorityPrefix(), Integer.valueOf(i4));
    }

    public static String d(int i4, boolean z4) {
        StringBuilder sb = new StringBuilder();
        sb.append(z4 ? Overmind.getPluginPkg() : Overmind.getMainPkg());
        sb.append(":p");
        sb.append(i4);
        return sb.toString();
    }

    public static String e(int i4) {
        return String.format(Locale.CHINA, "com.xinzhu.overmind.client.stub.StubActivity$P%d", Integer.valueOf(i4));
    }

    public static String f(int i4) {
        return String.format(Locale.CHINA, "com.xinzhu.overmind.client.stub.StubActivityLandscape$P%d", Integer.valueOf(i4));
    }

    public static String g(int i4) {
        return String.format(Locale.CHINA, "%s.stub_content_provider_%d", Overmind.get().getMainAuthorityPrefix(), Integer.valueOf(i4));
    }

    public static String h() {
        return Overmind.get().getMainAuthorityPrefix() + ".overmind.FileProvider";
    }

    public static String i(int i4) {
        return String.format(Locale.CHINA, "com.xinzhu.overmind.client.stub.StubFloatingActivity$P%d", Integer.valueOf(i4));
    }

    public static String j(int i4) {
        return String.format(Locale.CHINA, "com.xinzhu.overmind.client.stub.StubFloatingActivityLandscape$P%d", Integer.valueOf(i4));
    }

    public static String k(int i4) {
        return String.format(Locale.CHINA, "com.xinzhu.overmind.client.stub.StubJobService$P%d", Integer.valueOf(i4));
    }

    public static String l() {
        return Overmind.get().getMainAuthorityPrefix() + ".stub_receiver";
    }

    public static String m(int i4) {
        return String.format(Locale.CHINA, "com.xinzhu.overmind.client.stub.StubService$P%d", Integer.valueOf(i4));
    }

    public static boolean n(String str) {
        return a().equals(str) || str.contains("stub_content_provider_");
    }
}
