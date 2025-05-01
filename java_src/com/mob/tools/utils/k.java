package com.mob.tools.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.commons.C0811r;
import com.mob.commons.a.l;
import com.mob.commons.ab;
import com.mob.commons.v;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import com.mob.tools.utils.DH;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private static volatile k f57080a;

    /* renamed from: b  reason: collision with root package name */
    private BroadcastReceiver f57081b;

    /* renamed from: c  reason: collision with root package name */
    private final ConcurrentHashMap<String, a> f57082c = new ConcurrentHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private volatile long f57083d = 0;

    /* loaded from: classes5.dex */
    public interface a {
        void a();
    }

    private k() {
        this.f57081b = null;
        if (com.mob.commons.d.c() || com.mob.commons.d.d()) {
            this.f57081b = new BroadcastReceiver() { // from class: com.mob.tools.utils.k.1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    k.a().a(context, intent);
                }
            };
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(C0811r.b("029cd>cbcicjchcbckGdehLckefchdechckdkebecebfhcgdcejecdfhcfh"));
            v.a(this.f57081b, intentFilter);
        }
    }

    public static k a() {
        if (f57080a == null) {
            synchronized (k.class) {
                if (f57080a == null) {
                    f57080a = new k();
                }
            }
        }
        return f57080a;
    }

    public void a(String str, a aVar) {
        if (aVar == null || str == null || this.f57082c.containsKey(str)) {
            return;
        }
        this.f57082c.put(str, aVar);
    }

    public void a(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            if (!C0811r.b("029cd[cbcicjchcbckEdehMckefchdechckdkebecebfhcgdcejecdfhcfh").equals(intent.getAction()) || intent.getParcelableExtra(C0811r.b("011dehPefcjcidgddBdJdecj")) == null) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f57083d > 2000) {
                this.f57083d = currentTimeMillis;
                l.a().d(2500L, new i() { // from class: com.mob.tools.utils.k.2
                    @Override // com.mob.tools.utils.i
                    protected void a() {
                        if (com.mob.commons.d.j()) {
                            DH.requester(MobSDK.getContext()).getMwfoForce(true).request(new DH.DHResponder() { // from class: com.mob.tools.utils.k.2.1
                                @Override // com.mob.tools.utils.DH.DHResponder
                                public void onResponse(DH.DHResponse dHResponse) {
                                    HashMap<String, Object> mwfoForce = dHResponse.getMwfoForce(new int[0]);
                                    if (mwfoForce == null) {
                                        return;
                                    }
                                    String str = (String) mwfoForce.get("ssmt");
                                    String str2 = (String) mwfoForce.get("bsmt");
                                    NLog mobLog = MobLog.getInstance();
                                    mobLog.d("[MCM] cdi " + str + " bcdi " + str2 + " len " + k.a().f57082c.size(), new Object[0]);
                                    if (TextUtils.isEmpty(str2) && (TextUtils.isEmpty(str) || C0811r.b("014MhdcfJdUdg[dZcjef(d3heehehchcbhf").equalsIgnoreCase(str))) {
                                        return;
                                    }
                                    TreeMap treeMap = new TreeMap();
                                    treeMap.put("ssmt", str);
                                    treeMap.put("bsmt", str2);
                                    String MD5 = Data.MD5(new JSONObject(treeMap).toString());
                                    String b5 = ab.a().b(ab.f56130i, (String) null);
                                    if (b5 == null || !b5.equals(MD5)) {
                                        for (a aVar : k.this.f57082c.values()) {
                                            aVar.a();
                                        }
                                    }
                                }
                            });
                        }
                    }
                });
            }
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
    }
}
