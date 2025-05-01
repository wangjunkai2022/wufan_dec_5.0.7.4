package com.mob.commons.a;

import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.commons.C0811r;
import com.mob.commons.ab;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class n extends c {
    public n() {
        super(C0811r.b("002Gefch"), 0L, C0811r.b("005Hefchdi7ci"), 3600L, c.a(C0811r.b("002Gefch"), (Long) 0L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        DH.requester(MobSDK.getContext()).getMwfo().getMwlfo().request(new DH.DHResponder() { // from class: com.mob.commons.a.n.2
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                HashMap<String, Object> hashMap = new HashMap<>();
                HashMap<String, Object> mwfo = dHResponse.getMwfo();
                if (mwfo == null) {
                    return;
                }
                String str = (String) mwfo.get("bsmt");
                String str2 = (String) mwfo.get("ssmt");
                if (!TextUtils.isEmpty(str)) {
                    ArrayList<HashMap<String, Object>> mwlfo = dHResponse.getMwlfo();
                    if (mwlfo != null && !mwlfo.isEmpty()) {
                        Iterator<HashMap<String, Object>> it2 = mwlfo.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            HashMap<String, Object> next = it2.next();
                            Object obj = next.get(C0811r.b("005Zeidkdkddek"));
                            if (obj != null && String.valueOf(obj).equals(str)) {
                                hashMap.putAll(next);
                                break;
                            }
                        }
                        hashMap.remove(C0811r.b("005:eidkdkddek"));
                        hashMap.remove(C0811r.b("004[dkdkddek"));
                    }
                } else if (TextUtils.isEmpty(str2) || C0811r.b("0142hdcfXd9dgLd^cjef<d)heehehchcbhf").equalsIgnoreCase(str2)) {
                    return;
                }
                hashMap.putAll(mwfo);
                hashMap.put("ssmt", str2);
                hashMap.put("bsmt", str);
                n.this.a("WIMT", hashMap, true);
                TreeMap treeMap = new TreeMap();
                treeMap.put("ssmt", str2);
                treeMap.put("bsmt", str);
                ab.a().a(ab.f56130i, Data.MD5(new JSONObject(treeMap).toString()));
            }
        });
    }

    @Override // com.mob.commons.a.c
    protected void c() {
        com.mob.tools.utils.k.a().a(getClass().getName(), new k.a() { // from class: com.mob.commons.a.n.1
            @Override // com.mob.tools.utils.k.a
            public void a() {
                if (n.this.e()) {
                    n.this.m();
                }
            }
        });
    }

    @Override // com.mob.commons.a.c
    protected void a() {
        m();
    }
}
