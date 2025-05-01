package com.join.mgps.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: ModDownloadSupportDialog.java */
/* loaded from: classes4.dex */
public class g1 extends p implements View.OnClickListener, DialogInterface.OnShowListener {

    /* renamed from: k  reason: collision with root package name */
    private TextView f49409k;

    /* renamed from: l  reason: collision with root package name */
    a f49410l;

    /* compiled from: ModDownloadSupportDialog.java */
    /* loaded from: classes4.dex */
    public interface a {
        void a(g1 g1Var);
    }

    public g1(@NonNull Context context) {
        super(context, R.style.Dialog);
    }

    public void m(String str) {
        this.f49409k.setText(str);
    }

    public void n(a aVar) {
        this.f49410l = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar;
        if (view.getId() != R.id.tv_download || (aVar = this.f49410l) == null) {
            return;
        }
        aVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.dialog.p, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_mod_download_support);
        this.f49409k = (TextView) findViewById(R.id.tv_download);
        setOnShowListener(this);
        this.f49409k.setOnClickListener(this);
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
    }
}
