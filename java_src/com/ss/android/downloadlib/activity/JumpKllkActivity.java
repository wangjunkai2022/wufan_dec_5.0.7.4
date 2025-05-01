package com.ss.android.downloadlib.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.ss.android.downloadlib.addownload.b;
import com.ss.android.downloadlib.n.qv;
import com.ss.android.socialbase.appdownloader.p;
/* loaded from: classes5.dex */
public class JumpKllkActivity extends TTDelegateActivity {
    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        p.vv((Activity) this);
    }

    @Override // com.ss.android.downloadlib.activity.TTDelegateActivity
    protected void vv() {
        Intent intent = getIntent();
        if (getIntent() == null) {
            com.ss.android.downloadlib.o.p.vv().vv("handleIntent is null");
            p.vv((Activity) this);
            return;
        }
        String stringExtra = intent.getStringExtra("p");
        long longExtra = intent.getLongExtra("id", 0L);
        if (TextUtils.isEmpty(stringExtra) || longExtra == 0) {
            com.ss.android.downloadlib.o.p.vv().vv("getPackage or id is null");
            p.vv((Activity) this);
        }
        boolean booleanExtra = intent.getBooleanExtra("dl", false);
        String stringExtra2 = intent.getStringExtra("bk");
        if (booleanExtra & (!TextUtils.isEmpty(stringExtra2))) {
            qv.vv((Context) this, stringExtra, longExtra, stringExtra2, true);
            p.vv((Activity) this);
            return;
        }
        int optInt = b.wv().optInt("ab", 0);
        qv.vv(this, stringExtra, longExtra, optInt == 1);
        if (optInt != 1) {
            p.vv((Activity) this);
        }
    }
}
