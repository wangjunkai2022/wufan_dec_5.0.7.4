package com.join.mgps.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.CircleDownloadProgressBar;
/* compiled from: LodingProgressDialog.java */
/* loaded from: classes4.dex */
public class e1 extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    boolean f49342b;

    /* renamed from: c  reason: collision with root package name */
    String f49343c;

    /* renamed from: d  reason: collision with root package name */
    TextView f49344d;

    /* renamed from: e  reason: collision with root package name */
    CircleDownloadProgressBar f49345e;

    protected e1(Context context, boolean z4, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z4, onCancelListener);
        this.f49342b = false;
    }

    public Dialog a(int i4) {
        CircleDownloadProgressBar circleDownloadProgressBar = this.f49345e;
        if (circleDownloadProgressBar != null) {
            circleDownloadProgressBar.setProgress(i4);
        }
        return this;
    }

    public Dialog b(String str) {
        TextView textView = this.f49344d;
        if (textView != null) {
            textView.setText(str);
        }
        this.f49343c = str;
        return this;
    }

    public void c() {
        try {
            if (isShowing()) {
                return;
            }
            show();
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.loding_progress_layout);
        setCancelable(this.f49342b);
        this.f49344d = (TextView) findViewById(R.id.textView);
        this.f49345e = (CircleDownloadProgressBar) findViewById(R.id.progressBar);
        if (TextUtils.isEmpty(this.f49343c)) {
            return;
        }
        this.f49344d.setText(this.f49343c);
    }

    public e1(Context context) {
        super(context);
        this.f49342b = false;
    }

    public e1(Context context, int i4) {
        super(context, i4);
        this.f49342b = false;
    }

    public e1(Context context, int i4, boolean z4) {
        super(context, i4);
        this.f49342b = false;
        this.f49342b = z4;
    }

    public e1(Context context, int i4, String str) {
        super(context, i4);
        this.f49342b = false;
        this.f49342b = false;
        this.f49343c = str;
    }

    public e1(Context context, int i4, String str, boolean z4) {
        super(context, i4);
        this.f49342b = false;
        this.f49342b = z4;
        this.f49343c = str;
    }
}
