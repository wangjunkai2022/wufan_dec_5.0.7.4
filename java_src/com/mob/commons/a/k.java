package com.mob.commons.a;

import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.commons.ab;
import com.mob.tools.MobLog;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.ResHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
/* loaded from: classes5.dex */
public class k extends c {

    /* renamed from: c  reason: collision with root package name */
    private String f56094c;

    /* renamed from: d  reason: collision with root package name */
    private long f56095d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<HashMap<String, String>> f56096e;

    public k() {
        super(com.mob.commons.m.a("002hb"), 0L, com.mob.commons.m.a("004hbSdgbh"), 300L, c.a(com.mob.commons.m.a("002hb"), (Long) 0L));
        this.f56094c = null;
        this.f56095d = 0L;
        this.f56096e = null;
        try {
            File dataCacheFile = ResHelper.getDataCacheFile(MobSDK.getContext(), com.mob.commons.m.f56415c, true);
            if (!dataCacheFile.getParentFile().exists()) {
                dataCacheFile.getParentFile().mkdirs();
            }
            if (!dataCacheFile.exists()) {
                dataCacheFile.createNewFile();
            }
            this.f56094c = dataCacheFile.getAbsolutePath();
            this.f56095d = ab.a().b(ab.f56123b, -1L);
        } catch (Throwable unused) {
        }
    }

    private boolean m() {
        try {
            File file = new File(this.f56094c);
            file.delete();
            file.createNewFile();
            return true;
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return false;
        }
    }

    private HashMap<String, String> b(ArrayList<HashMap<String, String>> arrayList, String str) {
        Iterator<HashMap<String, String>> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            HashMap<String, String> next = it2.next();
            if (str.equals(next.get(com.mob.commons.m.a("003hKcfch")))) {
                return next;
            }
        }
        return new HashMap<>();
    }

    @Override // com.mob.commons.a.c
    protected void a() {
        DH.requester(MobSDK.getContext()).getIAForce(false, false).request(new DH.DHResponder() { // from class: com.mob.commons.a.k.1
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) throws Throwable {
                ArrayList a5 = k.this.a(dHResponse.getIAForce(new int[0]));
                if (!TextUtils.isEmpty(k.this.f56094c)) {
                    k kVar = k.this;
                    kVar.a(a5, kVar.f56094c, DH.SyncMtd.getModel());
                }
                if (System.currentTimeMillis() - k.this.f56095d < ((Long) k.this.a(com.mob.commons.m.a("005hb3ch3bh"), (String) 3600L)).longValue() * 1000 || !k.this.b((ArrayList<HashMap<String, String>>) a5)) {
                    return;
                }
                k.this.f56095d = ab.a().b(ab.f56123b, -1L);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<HashMap<String, String>> a(ArrayList<HashMap<String, String>> arrayList) throws Throwable {
        ArrayList<HashMap<String, String>> a5 = !TextUtils.isEmpty(this.f56094c) ? a(this.f56094c, DH.SyncMtd.getModel()) : null;
        if (a5 == null) {
            a5 = new ArrayList<>();
        }
        if (a5.isEmpty()) {
            ab.a().a("key_rcdat", System.currentTimeMillis());
        }
        ArrayList<HashMap<String, String>> arrayList2 = this.f56096e;
        if (arrayList2 == null || arrayList2.isEmpty() || com.mob.commons.b.f56154a) {
            com.mob.commons.b.f56154a = false;
            this.f56096e = arrayList;
        }
        ArrayList<HashMap<String, String>> arrayList3 = this.f56096e;
        if (arrayList3 != null) {
            for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                HashMap<String, String> hashMap = arrayList3.get(i4);
                String str = hashMap != null ? hashMap.get(com.mob.commons.m.a("003h%cfch")) : null;
                if (!TextUtils.isEmpty(str) && a(str)) {
                    HashMap<String, String> b5 = b(a5, str);
                    b5.put(com.mob.commons.m.a("003h>cfch"), str);
                    b5.put(com.mob.commons.m.a("004cb?bdKd"), hashMap.get(com.mob.commons.m.a("004cb?bdKd")));
                    b5.put(com.mob.commons.m.a("007Wbb]dXbhdgbgbi.c"), hashMap.get(com.mob.commons.m.a("007Wbb]dXbhdgbgbi.c")));
                    int parseInt = b5.get(com.mob.commons.m.a("008Cbhbe<cg-bgbd-dTdg")) == null ? 0 : Integer.parseInt(String.valueOf(b5.get(com.mob.commons.m.a("008Cbhbe<cg-bgbd-dTdg"))));
                    String a6 = com.mob.commons.m.a("008[bhbeZcgXbgbd)dMdg");
                    b5.put(a6, (parseInt + l()) + "");
                    if (!a(a5, str)) {
                        a5.add(b5);
                    }
                }
            }
        }
        return a5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(ArrayList<HashMap<String, String>> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            return false;
        }
        try {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put(com.mob.commons.m.a("008Qbh[daZbibhbaXbg"), Long.valueOf(ab.a().b("key_rcdat", -1L)));
            a(0L, "PRTMT", arrayList, hashMap, false);
        } catch (Throwable unused) {
        }
        ab.a().a(ab.f56123b, System.currentTimeMillis());
        return m();
    }

    private static ArrayList<HashMap<String, String>> b(String str) {
        try {
            ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
            if (TextUtils.isEmpty(str)) {
                return arrayList;
            }
            JSONArray jSONArray = new JSONArray(str);
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                arrayList.add(HashonHelper.fromJson(jSONArray.getJSONObject(i4).toString()));
            }
            return arrayList;
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            return new ArrayList<>();
        }
    }

    private boolean a(final String str) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        DH.requester(MobSDK.getContext()).getMpfof(true, str, 0).request(new DH.DHResponder() { // from class: com.mob.commons.a.k.2
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                boolean z4 = false;
                Object mpfof = dHResponse.getMpfof(new int[0]);
                if (mpfof != null) {
                    ApplicationInfo a5 = com.mob.tools.c.a(mpfof, str);
                    if (a5 != null) {
                        int i4 = a5.flags;
                        boolean z5 = (i4 & 1) == 0 && (i4 & 128) == 0;
                        boolean z6 = (i4 & 2097152) == 0;
                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                        if (z5 && z6) {
                            z4 = true;
                        }
                        atomicBoolean2.set(z4);
                        return;
                    }
                    return;
                }
                atomicBoolean.set(false);
            }
        });
        return atomicBoolean.get();
    }

    private boolean a(ArrayList<HashMap<String, String>> arrayList, String str) {
        Iterator<HashMap<String, String>> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (str.equals(it2.next().get(com.mob.commons.m.a("003hHcfch")))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ArrayList<HashMap<String, String>> arrayList, String str, String str2) {
        ResHelper.writeToFileNoCompress(new File(str), a(str2, arrayList));
    }

    private ArrayList<HashMap<String, String>> a(String str, String str2) {
        return a(str2, ResHelper.readFromFileNoCompress(new File(str)));
    }

    private static byte[] a(String str, ArrayList<HashMap<String, String>> arrayList) {
        new HashonHelper();
        String fromObject = HashonHelper.fromObject(arrayList);
        try {
            return Data.AES128Encode(str, fromObject);
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            return fromObject.getBytes();
        }
    }

    private static ArrayList<HashMap<String, String>> a(String str, byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    return b(Data.AES128PaddingDecode(str.getBytes("UTF-8"), bArr));
                }
            } catch (Throwable th) {
                MobLog.getInstance().w(th);
                return new ArrayList<>();
            }
        }
        return new ArrayList<>();
    }
}
