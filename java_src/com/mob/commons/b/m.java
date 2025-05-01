package com.mob.commons.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.Signature;
import android.os.IBinder;
import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.commons.C0811r;
import com.mob.commons.b.h;
import com.mob.tools.utils.DH;
import java.security.MessageDigest;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* loaded from: classes5.dex */
public class m extends h {

    /* renamed from: c  reason: collision with root package name */
    protected String f56229c;

    /* renamed from: d  reason: collision with root package name */
    private String f56230d;

    public m(Context context) {
        super(context);
        this.f56229c = C0811r.b("025b;cjceckMge3dbEhci(ckcjBied.chcbckddfg'iedIddek");
    }

    @Override // com.mob.commons.b.h
    protected Intent a() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(C0811r.b("017bGcjceckKge:dbPhci+ckcjLied chcb"), C0811r.b("033b:cjceck1ge)db1hciIckcjIied<chcbckddcb1edh^chdedbdkAe>ciccchUbe")));
        intent.setAction(C0811r.b("040cbh-chcjZdXckAb_cjceck%geWdbNhci3ckcj9ied@chcbckfgfkfhdfcgddekcgdkfhfifjdddcfh"));
        return intent;
    }

    @Override // com.mob.commons.b.h
    public h.b a(IBinder iBinder) {
        h.b bVar = new h.b();
        bVar.f56222a = a(iBinder, C0811r.b("004Qfgdjddek"));
        return bVar;
    }

    private final String a(IBinder iBinder, String str) {
        if (TextUtils.isEmpty(this.f56230d)) {
            try {
                final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
                DH.requester(MobSDK.getContext()).getMpfo(this.f56215b, 64).request(new DH.DHResponder() { // from class: com.mob.commons.b.m.1
                    @Override // com.mob.tools.utils.DH.DHResponder
                    public void onResponse(DH.DHResponse dHResponse) {
                        if (dHResponse.getMpfo(new int[0]) != null) {
                            linkedBlockingQueue.offer(dHResponse.getMpfo(new int[0]));
                        } else {
                            linkedBlockingQueue.offer(Boolean.FALSE);
                        }
                    }
                });
                Object poll = linkedBlockingQueue.poll(300L, TimeUnit.MILLISECONDS);
                Signature[] b5 = poll instanceof Boolean ? null : com.mob.tools.c.b(poll, this.f56215b);
                if (b5 != null && b5.length > 0) {
                    byte[] byteArray = b5[0].toByteArray();
                    MessageDigest messageDigest = MessageDigest.getInstance(C0811r.b("004Bdkejecge"));
                    if (messageDigest != null) {
                        byte[] digest = messageDigest.digest(byteArray);
                        StringBuilder sb = new StringBuilder();
                        for (byte b6 : digest) {
                            sb.append(Integer.toHexString((b6 & 255) | 256).substring(1, 3));
                        }
                        this.f56230d = sb.toString();
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return a(str, iBinder, this.f56229c, 1, this.f56215b, this.f56230d, str);
    }
}
