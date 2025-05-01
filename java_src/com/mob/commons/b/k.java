package com.mob.commons.b;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.mob.commons.b.h;
import com.mob.commons.s;
import com.mob.tools.MobLog;
/* loaded from: classes5.dex */
public class k extends h {
    public k(Context context) {
        super(context);
    }

    private String a(String str, String str2) {
        Bundle b5 = b(str, str2);
        if (a(b5)) {
            return b5.getString(s.a("002*didc"));
        }
        if (b5 != null) {
            return b5.getString(s.a("0075df>f;fifiYdJej0f"));
        }
        return null;
    }

    @Override // com.mob.commons.b.h
    protected h.b b() {
        h.b bVar = new h.b();
        bVar.f56222a = a(s.a("007Tej]fiQghfdeefl"), (String) null);
        return bVar;
    }

    private Bundle b(String str, String str2) {
        Bundle bundle = null;
        try {
            Uri parse = Uri.parse(s.a("036cWdk8eifeikllcePdl0eUdgffdi>d8dldidcSfei9di1i7ec+l9didc%feiZdi>iMec"));
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 17) {
                ContentProviderClient acquireUnstableContentProviderClient = this.f56214a.getContentResolver().acquireUnstableContentProviderClient(parse);
                bundle = acquireUnstableContentProviderClient.call(str, str2, null);
                if (i4 >= 24) {
                    acquireUnstableContentProviderClient.close();
                } else {
                    acquireUnstableContentProviderClient.release();
                }
            } else if (i4 >= 11) {
                bundle = this.f56214a.getContentResolver().call(parse, str, str2, (Bundle) null);
            }
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
        return bundle;
    }

    private boolean a(Bundle bundle) {
        return bundle != null && bundle.getInt(s.a("004c;dkdcFf"), -1) == 0;
    }
}
