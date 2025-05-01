package com.danikula.videocache;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.List;
/* compiled from: IgnoreHostProxySelector.java */
/* loaded from: classes2.dex */
class l extends ProxySelector {

    /* renamed from: d  reason: collision with root package name */
    private static final List<Proxy> f10117d = Arrays.asList(Proxy.NO_PROXY);

    /* renamed from: a  reason: collision with root package name */
    private final ProxySelector f10118a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10119b;

    /* renamed from: c  reason: collision with root package name */
    private final int f10120c;

    l(ProxySelector proxySelector, String str, int i4) {
        this.f10118a = (ProxySelector) n.d(proxySelector);
        this.f10119b = (String) n.d(str);
        this.f10120c = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, int i4) {
        ProxySelector.setDefault(new l(ProxySelector.getDefault(), str, i4));
    }

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.f10118a.connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public List<Proxy> select(URI uri) {
        return this.f10119b.equals(uri.getHost()) && this.f10120c == uri.getPort() ? f10117d : this.f10118a.select(uri);
    }
}
