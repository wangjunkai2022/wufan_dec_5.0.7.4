package com.join.mgps.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import com.join.android.app.mgsim.wufun.R;
import m.framework.ui.widget.asyncview.AsyncImageView;
/* compiled from: UninstallConfirmDialog.java */
/* loaded from: classes4.dex */
public class l2 extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    private a f49495b;

    /* compiled from: UninstallConfirmDialog.java */
    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    public l2(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        a aVar = this.f49495b;
        if (aVar != null) {
            aVar.a();
        }
        dismiss();
    }

    public void e(a aVar) {
        this.f49495b = aVar;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_uninstall_confirm);
        setCanceledOnTouchOutside(false);
        getWindow().setBackgroundDrawableResource(AsyncImageView.DEFAULT_TRANSPARENT);
        getWindow().getDecorView().setPadding(0, 0, 0, 0);
        View findViewById = findViewById(R.id.tvCancel);
        View findViewById2 = findViewById(R.id.tvConfirm);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.dialog.j2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l2.this.c(view);
            }
        });
        findViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.dialog.k2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l2.this.d(view);
            }
        });
    }
}
