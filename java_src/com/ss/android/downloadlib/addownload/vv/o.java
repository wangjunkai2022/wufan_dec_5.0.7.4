package com.ss.android.downloadlib.addownload.vv;

import android.app.Activity;
import android.app.Dialog;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.R;
/* loaded from: classes5.dex */
public class o extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    private String f60585b;

    /* renamed from: i  reason: collision with root package name */
    private TextView f60586i;
    private String jh;

    /* renamed from: k  reason: collision with root package name */
    private String f60587k;

    /* renamed from: m  reason: collision with root package name */
    private TextView f60588m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f60589n;

    /* renamed from: o  reason: collision with root package name */
    private i f60590o;

    /* renamed from: p  reason: collision with root package name */
    private TextView f60591p;
    private boolean qv;

    /* renamed from: r  reason: collision with root package name */
    private String f60592r;

    /* renamed from: u  reason: collision with root package name */
    private p f60593u;
    private TextView vv;
    private Activity wv;

    /* loaded from: classes5.dex */
    public static class vv {

        /* renamed from: i  reason: collision with root package name */
        private String f60594i;

        /* renamed from: m  reason: collision with root package name */
        private String f60595m;

        /* renamed from: n  reason: collision with root package name */
        private i f60596n;

        /* renamed from: o  reason: collision with root package name */
        private String f60597o;

        /* renamed from: p  reason: collision with root package name */
        private String f60598p;
        private p qv;

        /* renamed from: u  reason: collision with root package name */
        private boolean f60599u;
        private Activity vv;

        public vv(Activity activity) {
            this.vv = activity;
        }

        public vv i(String str) {
            this.f60597o = str;
            return this;
        }

        public vv m(String str) {
            this.f60598p = str;
            return this;
        }

        public vv p(String str) {
            this.f60594i = str;
            return this;
        }

        public vv vv(String str) {
            this.f60595m = str;
            return this;
        }

        public vv vv(boolean z4) {
            this.f60599u = z4;
            return this;
        }

        public vv vv(i iVar) {
            this.f60596n = iVar;
            return this;
        }

        public vv vv(p pVar) {
            this.qv = pVar;
            return this;
        }

        public o vv() {
            return new o(this.vv, this.f60595m, this.f60598p, this.f60594i, this.f60597o, this.f60599u, this.f60596n, this.qv);
        }
    }

    public o(@NonNull Activity activity, String str, String str2, String str3, String str4, boolean z4, @NonNull i iVar, p pVar) {
        super(activity, R.style.ttdownloader_translucent_dialog);
        this.wv = activity;
        this.f60590o = iVar;
        this.f60587k = str;
        this.f60585b = str2;
        this.jh = str3;
        this.f60592r = str4;
        this.f60593u = pVar;
        setCanceledOnTouchOutside(z4);
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void delete() {
        this.qv = true;
        dismiss();
    }

    private void i() {
        setContentView(LayoutInflater.from(this.wv.getApplicationContext()).inflate(vv(), (ViewGroup) null));
        this.vv = (TextView) findViewById(m());
        this.f60588m = (TextView) findViewById(p());
        this.f60591p = (TextView) findViewById(R.id.message_tv);
        this.f60586i = (TextView) findViewById(R.id.delete_tv);
        if (!TextUtils.isEmpty(this.f60585b)) {
            this.vv.setText(this.f60585b);
        }
        if (!TextUtils.isEmpty(this.jh)) {
            this.f60588m.setText(this.jh);
        }
        if (!TextUtils.isEmpty(this.f60592r)) {
            this.f60586i.setText(this.f60592r);
        } else {
            this.f60586i.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f60587k)) {
            this.f60591p.setText(this.f60587k);
        }
        this.vv.setOnClickListener(new View.OnClickListener() { // from class: com.ss.android.downloadlib.addownload.vv.o.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                o.this.o();
            }
        });
        this.f60588m.setOnClickListener(new View.OnClickListener() { // from class: com.ss.android.downloadlib.addownload.vv.o.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                o.this.u();
            }
        });
        this.f60586i.setOnClickListener(new View.OnClickListener() { // from class: com.ss.android.downloadlib.addownload.vv.o.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                o.this.delete();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        this.f60589n = true;
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        dismiss();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        if (!this.wv.isFinishing()) {
            this.wv.finish();
        }
        if (this.f60589n) {
            this.f60590o.vv();
        } else if (this.qv) {
            this.f60593u.delete();
        } else {
            this.f60590o.m();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public int m() {
        return R.id.confirm_tv;
    }

    public int p() {
        return R.id.cancel_tv;
    }

    public int vv() {
        return R.layout.ttdownloader_dialog_select_operation;
    }
}
