package com.join.mgps.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: CloudFirstDialog.java */
/* loaded from: classes4.dex */
public class v extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    Context f49704b;

    /* renamed from: c  reason: collision with root package name */
    TextView f49705c;

    /* renamed from: d  reason: collision with root package name */
    TextView f49706d;

    public v(Context context) {
        super(context);
        this.f49704b = context;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(this.f49704b).inflate(R.layout.dialog_cloud_first, (ViewGroup) null));
    }

    protected v(Context context, boolean z4, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z4, onCancelListener);
        this.f49704b = context;
    }

    public v(Context context, int i4) {
        super(context, i4);
        this.f49704b = context;
    }
}
