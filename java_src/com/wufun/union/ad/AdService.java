package com.wufun.union.ad;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.umeng.analytics.pro.bm;
import com.wufun.union.ad.AdChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class AdService extends Service {

    /* renamed from: b  reason: collision with root package name */
    static HashMap<AdChannel.Type, AdChannel> f65585b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    static HashMap<String, Messenger> f65586c = new HashMap<>();

    /* loaded from: classes6.dex */
    class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        Context f65587a;

        public a(Context context) {
            this.f65587a = context;
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            try {
                int i4 = message.what;
                String string = message.getData() != null ? message.getData().getString("fromPkg") : "";
                Messenger messenger = message.replyTo;
                if (!TextUtils.isEmpty(string) && messenger != null && !AdService.f65586c.containsKey(string)) {
                    AdService.f65586c.put(string, messenger);
                }
                if (i4 == 0) {
                    Messenger messenger2 = message.replyTo;
                    if (TextUtils.isEmpty(string)) {
                        return;
                    }
                    if (messenger2 == null) {
                        AdService.f65586c.remove(string);
                        return;
                    }
                    AdService.f65586c.put(string, messenger2);
                    AdService.i(this.f65587a, string, "smallGameStartSDK", "0");
                } else if (i4 == 1) {
                    AdService.this.a(message.getData());
                } else if (i4 == 2) {
                    AdService.this.g(message.getData());
                } else if (i4 != 3) {
                    if (i4 == 4 && !TextUtils.isEmpty(string)) {
                        AdService.f65586c.remove(string);
                    }
                } else {
                    Activity activity = null;
                    Object obj = message.obj;
                    if (obj != null && (obj instanceof Activity)) {
                        activity = (Activity) obj;
                    }
                    AdService.this.j(activity, message.getData());
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    public static void b(Context context, List<c3.b> list) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (c3.b bVar : list) {
            arrayList.add(bVar.d());
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("data", arrayList);
        h(context, "initChannels", bundle);
    }

    public static void d(Context context, String str) {
        if (TextUtils.isEmpty(str) || context == null) {
            return;
        }
        Intent intent = new Intent(context.getPackageName() + ".action.commonService");
        intent.setPackage(context.getPackageName());
        intent.putExtra("action", "launchVGame");
        intent.putExtra("packageName", str);
        context.startService(intent);
    }

    public static void e(Context context, String str, AdChannel.Type type) {
        f(context, str, type, "", 0);
    }

    public static void f(Context context, String str, AdChannel.Type type, String str2, int i4) {
        Bundle bundle = new Bundle();
        bundle.putString("codeId", str);
        bundle.putInt("channelType", type.val);
        bundle.putString("adId", str2);
        bundle.putInt("adType", i4);
        h(context, MediationConstant.KEY_USE_POLICY_AD_LOAD, bundle);
    }

    static void h(Context context, String str, Bundle bundle) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent("com.wufun.union.ad.action.AdService");
        intent.setPackage(context.getPackageName());
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("action", str);
        }
        context.startService(intent);
    }

    public static void i(Context context, String str, String str2, String str3) {
        Intent intent = new Intent(context.getPackageName() + ".action.commonService");
        intent.setPackage(context.getPackageName());
        intent.putExtra("action", "adStatisticEvent");
        intent.putExtra("fromPkg", str);
        intent.putExtra("event", str2);
        intent.putExtra("adId", str3);
        context.startService(intent);
    }

    public static void k(Context context, String str, AdChannel.Type type, String str2, int i4) {
        Bundle bundle = new Bundle();
        bundle.putString("codeId", str);
        bundle.putInt("channelType", type.val);
        bundle.putString("adId", str2);
        bundle.putInt("adType", i4);
        h(context, "adShow", bundle);
    }

    void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putAll(bundle);
        bundle2.putString("action", "getMiniGameConfig");
        l(bundle2);
    }

    void c(List<String> list) {
        if (list == null) {
            return;
        }
        for (String str : list) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("type");
                String optString = jSONObject.optString("appId", "");
                if (!TextUtils.isEmpty(optString)) {
                    AdChannel.Type type = AdChannel.Type.TT;
                    if (optInt == type.val) {
                        com.wufun.union.ad.bytedance.a aVar = new com.wufun.union.ad.bytedance.a();
                        aVar.j(new com.wufun.union.ad.a(this, aVar));
                        aVar.d(this, optString);
                        f65585b.put(type, aVar);
                    } else {
                        AdChannel.Type type2 = AdChannel.Type.GDT;
                        if (optInt == type2.val) {
                            com.wufun.union.ad.gdt.a aVar2 = new com.wufun.union.ad.gdt.a();
                            aVar2.j(new com.wufun.union.ad.a(this, aVar2));
                            aVar2.d(this, optString);
                            f65585b.put(type2, aVar2);
                        }
                    }
                }
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
        }
    }

    void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        String string = bundle.getString("fromPkg");
        String string2 = bundle.getString("sdk_app_id", "");
        String string3 = bundle.getString("sdk_key", "");
        int i4 = -1;
        int i5 = bundle.getInt(bm.f63460u, -1);
        String string4 = bundle.getString(MediationConstant.EXTRA_ADID);
        bundle.getInt("ad_type", 0);
        if (i5 == 1) {
            i4 = 0;
        } else if (i5 == 2) {
            i4 = 1;
        }
        AdChannel adChannel = f65585b.get(AdChannel.Type.parse(i4));
        if (adChannel != null) {
            AdChannel.a a5 = adChannel.a();
            if (a5 != null && (a5 instanceof com.wufun.union.ad.a)) {
                ((com.wufun.union.ad.a) a5).d(f65586c.get(string));
            }
            if (!adChannel.e()) {
                adChannel.d(this, string2);
            }
            try {
                adChannel.k(Integer.parseInt(string4));
            } catch (NumberFormatException e5) {
                e5.printStackTrace();
            }
            adChannel.l(string);
            adChannel.g(string3);
            i(this, string, "smallRequestAdSDK", string4);
        }
    }

    void j(Activity activity, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (activity == null) {
            h(this, "adShow", bundle);
            return;
        }
        String string = bundle.getString("fromPkg");
        bundle.getString("sdk_app_id", "");
        bundle.getString("sdk_key", "");
        int i4 = -1;
        int i5 = bundle.getInt(bm.f63460u, -1);
        String string2 = bundle.getString(MediationConstant.EXTRA_ADID);
        bundle.getInt("ad_type", 0);
        if (i5 == 1) {
            i4 = 0;
        } else if (i5 == 2) {
            i4 = 1;
        }
        AdChannel adChannel = f65585b.get(AdChannel.Type.parse(i4));
        if (adChannel == null) {
            activity.finish();
            d(this, string);
            return;
        }
        AdChannel.a a5 = adChannel.a();
        if (a5 != null && (a5 instanceof com.wufun.union.ad.a)) {
            ((com.wufun.union.ad.a) a5).d(f65586c.get(string));
        }
        try {
            if (!TextUtils.isEmpty(string2)) {
                adChannel.k(Integer.parseInt(string2));
            }
        } catch (NumberFormatException e5) {
            e5.printStackTrace();
        }
        adChannel.l(string);
        adChannel.m(activity);
    }

    void l(Bundle bundle) {
        Intent intent = new Intent(getPackageName() + ".action.commonService");
        intent.setPackage(getPackageName());
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        startService(intent);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return new Messenger(new a(this)).getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i4, int i5) {
        Messenger messenger;
        if (intent == null) {
            return super.onStartCommand(intent, i4, i5);
        }
        String stringExtra = intent.getStringExtra("action");
        if (TextUtils.isEmpty(stringExtra)) {
            return 1;
        }
        if (stringExtra.equals("initChannels")) {
            c(intent.getStringArrayListExtra("data"));
        } else if (stringExtra.equals(MediationConstant.KEY_USE_POLICY_AD_LOAD)) {
            g(intent.getExtras());
        } else if (stringExtra.equals("adShow")) {
            Intent intent2 = new Intent(this, AdStubActivity.class);
            intent2.addFlags(268435456);
            intent2.putExtras(intent.getExtras());
            startActivity(intent2);
        } else if (stringExtra.equals("getMiniGameAdConfigResult") && !TextUtils.isEmpty(intent.getStringExtra("data"))) {
            String stringExtra2 = intent.getStringExtra("fromPkg");
            if (!TextUtils.isEmpty(stringExtra2) && (messenger = f65586c.get(stringExtra2)) != null) {
                Message message = new Message();
                message.what = 0;
                message.setData(intent.getExtras());
                try {
                    messenger.send(message);
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                }
            }
        }
        return 1;
    }
}
