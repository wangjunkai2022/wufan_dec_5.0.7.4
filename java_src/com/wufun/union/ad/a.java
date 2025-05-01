package com.wufun.union.ad;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.wufun.union.ad.AdChannel;
/* compiled from: AdCallback.java */
/* loaded from: classes6.dex */
public class a implements AdChannel.a {

    /* renamed from: a  reason: collision with root package name */
    private Context f65594a;

    /* renamed from: b  reason: collision with root package name */
    private AdChannel f65595b;

    /* renamed from: c  reason: collision with root package name */
    private Messenger f65596c;

    public a(Context context, AdChannel adChannel) {
        this.f65594a = context;
        this.f65595b = adChannel;
    }

    @Override // com.wufun.union.ad.AdChannel.a
    public void a(int i4, String str) {
        AdChannel adChannel = this.f65595b;
        if (adChannel != null) {
            AdChannel.Type type = adChannel.f65578c;
            if (type == AdChannel.Type.TT) {
                if (i4 == 6) {
                    c(adChannel.c());
                    this.f65595b.k(0);
                }
            } else if (type == AdChannel.Type.GDT && i4 == 6) {
                c(adChannel.c());
                this.f65595b.k(0);
            }
        }
        if (this.f65596c == null) {
            return;
        }
        Message message = new Message();
        Bundle bundle = new Bundle();
        bundle.putString("action", "onAdChannelCallback");
        bundle.putInt("event", i4);
        bundle.putString("message", str);
        message.setData(bundle);
        message.what = 0;
        try {
            this.f65596c.send(message);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public Messenger b() {
        return this.f65596c;
    }

    void c(String str) {
        if (TextUtils.isEmpty(str) || this.f65594a == null) {
            return;
        }
        Intent intent = new Intent(this.f65594a.getPackageName() + ".action.commonService");
        intent.setPackage(this.f65594a.getPackageName());
        intent.putExtra("action", "launchVGame");
        intent.putExtra("packageName", str);
        this.f65594a.startService(intent);
    }

    public void d(Messenger messenger) {
        this.f65596c = messenger;
    }
}
