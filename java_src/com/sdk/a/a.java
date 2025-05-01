package com.sdk.a;

import android.net.ConnectivityManager;
import android.net.Network;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
/* loaded from: classes5.dex */
public class a extends ConnectivityManager.NetworkCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ URL f59919a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f59920b;

    public a(b bVar, URL url) {
        this.f59920b = bVar;
        this.f59919a = url;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        b.f59923c = network;
        try {
            this.f59920b.f59926f = (HttpURLConnection) network.openConnection(this.f59919a);
        } catch (IOException unused) {
        }
    }
}
