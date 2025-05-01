package com.kuaishou.weapon.p0;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class cw implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private Context f55484a;

    public cw(Context context) {
        this.f55484a = context;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:47:0x03d1
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private com.kuaishou.weapon.p0.y b(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 1248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kuaishou.weapon.p0.cw.b(java.lang.String):com.kuaishou.weapon.p0.y");
    }

    public void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("result", 0) == 1) {
                String a5 = new bn(this.f55484a).a(jSONObject.getString("antispamPluginRsp"));
                if (TextUtils.isEmpty(a5)) {
                    return;
                }
                y b5 = b(a5);
                if (b5 != null) {
                    df.a(this.f55484a).a(str, b5);
                } else {
                    df.a(this.f55484a).b(System.currentTimeMillis());
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            String str = cu.f55469a + cu.f55472d;
            String a5 = cv.a(this.f55484a);
            if (!TextUtils.isEmpty(a5)) {
                str = str + "?" + a5;
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject b5 = cv.b(this.f55484a);
            if (b5 != null) {
                jSONObject.put("data", new bn(this.f55484a).c(b5.toString()));
            }
            l a6 = l.a(this.f55484a);
            m mVar = new m(str, jSONObject);
            mVar.a(WeaponHI.cookieData);
            mVar.b(WeaponHI.encryENV);
            a6.b(mVar, new j() { // from class: com.kuaishou.weapon.p0.cw.1
                @Override // com.kuaishou.weapon.p0.j
                public void a(String str2) {
                    try {
                        cw.this.a(str2);
                    } catch (Exception unused) {
                    }
                }

                @Override // com.kuaishou.weapon.p0.j
                public void b(String str2) {
                }
            });
        } catch (Exception unused) {
        }
    }
}
