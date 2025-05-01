package com.ss.android.socialbase.appdownloader.view;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.ss.android.socialbase.appdownloader.i;
import com.ss.android.socialbase.appdownloader.m;
import com.ss.android.socialbase.appdownloader.p;
import com.ss.android.socialbase.appdownloader.p.b;
import com.ss.android.socialbase.appdownloader.p.jh;
import com.ss.android.socialbase.appdownloader.qv;
import com.ss.android.socialbase.appdownloader.wv;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class JumpUnknownSourceActivity extends Activity {

    /* renamed from: i  reason: collision with root package name */
    private int f60921i;

    /* renamed from: m  reason: collision with root package name */
    private Intent f60922m;

    /* renamed from: o  reason: collision with root package name */
    private JSONObject f60923o;
    @Nullable

    /* renamed from: p  reason: collision with root package name */
    private Intent f60924p;
    private b vv;

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        vv();
        qv.vv().vv(this);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        qv.vv().vv(this);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        Intent intent = getIntent();
        this.f60922m = intent;
        if (intent != null) {
            this.f60924p = (Intent) intent.getParcelableExtra("intent");
            this.f60921i = intent.getIntExtra("id", -1);
            try {
                this.f60923o = new JSONObject(intent.getStringExtra("config"));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        if (this.f60923o == null) {
            p.vv((Activity) this);
            return;
        }
        m();
        b bVar = this.vv;
        if (bVar != null && !bVar.m()) {
            this.vv.vv();
        } else if (this.vv == null) {
            finish();
        }
    }

    private void m() {
        if (this.vv != null || this.f60922m == null) {
            return;
        }
        try {
            com.ss.android.socialbase.appdownloader.p.p vv = i.k().vv();
            jh vv2 = vv != null ? vv.vv(this) : null;
            if (vv2 == null) {
                vv2 = new com.ss.android.socialbase.appdownloader.i.vv(this);
            }
            int vv3 = wv.vv(this, "tt_appdownloader_tip");
            int vv4 = wv.vv(this, "tt_appdownloader_label_ok");
            int vv5 = wv.vv(this, "tt_appdownloader_label_cancel");
            String optString = this.f60923o.optString("jump_unknown_source_tips");
            if (TextUtils.isEmpty(optString)) {
                optString = getString(wv.vv(this, "tt_appdownloader_jump_unknown_source_tips"));
            }
            vv2.vv(vv3).vv(optString).vv(vv4, new DialogInterface.OnClickListener() { // from class: com.ss.android.socialbase.appdownloader.view.JumpUnknownSourceActivity.3
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i4) {
                    JumpUnknownSourceActivity jumpUnknownSourceActivity = JumpUnknownSourceActivity.this;
                    if (m.vv(jumpUnknownSourceActivity, jumpUnknownSourceActivity.f60924p, JumpUnknownSourceActivity.this.f60921i, JumpUnknownSourceActivity.this.f60923o)) {
                        m.p(JumpUnknownSourceActivity.this.f60921i, JumpUnknownSourceActivity.this.f60923o);
                    } else {
                        JumpUnknownSourceActivity jumpUnknownSourceActivity2 = JumpUnknownSourceActivity.this;
                        m.vv((Context) jumpUnknownSourceActivity2, jumpUnknownSourceActivity2.f60924p, true);
                    }
                    m.vv(JumpUnknownSourceActivity.this.f60921i, JumpUnknownSourceActivity.this.f60923o);
                    JumpUnknownSourceActivity.this.finish();
                }
            }).m(vv5, new DialogInterface.OnClickListener() { // from class: com.ss.android.socialbase.appdownloader.view.JumpUnknownSourceActivity.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i4) {
                    if (JumpUnknownSourceActivity.this.f60924p != null) {
                        JumpUnknownSourceActivity jumpUnknownSourceActivity = JumpUnknownSourceActivity.this;
                        m.vv((Context) jumpUnknownSourceActivity, jumpUnknownSourceActivity.f60924p, true);
                    }
                    m.m(JumpUnknownSourceActivity.this.f60921i, JumpUnknownSourceActivity.this.f60923o);
                    JumpUnknownSourceActivity.this.finish();
                }
            }).vv(new DialogInterface.OnCancelListener() { // from class: com.ss.android.socialbase.appdownloader.view.JumpUnknownSourceActivity.1
                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    if (JumpUnknownSourceActivity.this.f60924p != null) {
                        JumpUnknownSourceActivity jumpUnknownSourceActivity = JumpUnknownSourceActivity.this;
                        m.vv((Context) jumpUnknownSourceActivity, jumpUnknownSourceActivity.f60924p, true);
                    }
                    m.m(JumpUnknownSourceActivity.this.f60921i, JumpUnknownSourceActivity.this.f60923o);
                    JumpUnknownSourceActivity.this.finish();
                }
            }).vv(false);
            this.vv = vv2.vv();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void vv() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
    }
}
