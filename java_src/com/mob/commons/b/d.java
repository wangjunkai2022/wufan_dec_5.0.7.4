package com.mob.commons.b;

import android.content.Context;
import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.commons.ab;
import com.mob.commons.s;
import com.mob.tools.utils.ResHelper;
import java.io.File;
import java.util.HashMap;
/* loaded from: classes5.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f56183a = s.a("005HdldffiYd3fi");

    public static synchronized HashMap<String, Object> a(Context context) {
        synchronized (d.class) {
            HashMap<String, Object> hashMap = new HashMap<>();
            HashMap<String, Object> a5 = a();
            boolean z4 = a5 != null && a5.size() > 0;
            if (z4) {
                HashMap hashMap2 = new HashMap();
                if (a5.containsKey(s.a("004$dgdcdidc"))) {
                    a5.put(s.a("005d*dgdcdidc"), a5.remove(s.a("004Gdgdcdidc")));
                }
                hashMap2.putAll(a5);
                hashMap.put(s.a("009AefdidcfiedKdchf"), hashMap2);
            }
            String ah = com.mob.tools.b.c.a(context).d().ah();
            if (z4 || !TextUtils.isEmpty(ah)) {
                hashMap.put(s.a("004Jdk6d@didc"), ah);
                a(ah);
                return hashMap;
            }
            return null;
        }
    }

    public static String b(Context context) {
        return e.b(context);
    }

    private static HashMap<String, Object> a() {
        HashMap<String, Object> hashMap;
        File file = new File(MobSDK.getContext().getFilesDir().getAbsolutePath() + s.a("005lUhcdkff)l"), f56183a);
        if (file.exists()) {
            hashMap = (HashMap) ResHelper.readObjectFromFile(file.getAbsolutePath());
            ab.a().b("all_ds", hashMap);
            file.delete();
        } else {
            hashMap = null;
        }
        return (hashMap == null || hashMap.isEmpty()) ? (HashMap) ab.a().c("all_ds", null) : hashMap;
    }

    private static void a(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put(s.a("004MdkJd*didc"), str);
        }
        ab.a().b("all_ds", hashMap);
    }
}
