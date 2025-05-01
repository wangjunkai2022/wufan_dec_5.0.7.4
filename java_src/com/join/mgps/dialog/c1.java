package com.join.mgps.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: InviteDialog.java */
/* loaded from: classes4.dex */
public class c1 {

    /* renamed from: a  reason: collision with root package name */
    private Dialog f49290a;

    /* renamed from: b  reason: collision with root package name */
    private Window f49291b;

    /* renamed from: c  reason: collision with root package name */
    private Context f49292c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f49293d;

    /* renamed from: e  reason: collision with root package name */
    private c f49294e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InviteDialog.java */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c1.this.f49294e.a();
            c1.this.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InviteDialog.java */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c1.this.b();
        }
    }

    /* compiled from: InviteDialog.java */
    /* loaded from: classes4.dex */
    public interface c {
        void a();
    }

    public c1(Context context, c cVar) {
        this.f49292c = context;
        this.f49294e = cVar;
        c(context);
    }

    private void c(Context context) {
        Dialog dialog = new Dialog(context, R.style.newtrans_floating_dialog);
        this.f49290a = dialog;
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            this.f49290a.getWindow().setAttributes(attributes);
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.dialog_invite_pwd, (ViewGroup) null);
        this.f49293d = (TextView) inflate.findViewById(R.id.tv_pwd_info);
        inflate.findViewById(R.id.btn_copy).setOnClickListener(new a());
        inflate.findViewById(R.id.iv_close).setOnClickListener(new b());
        this.f49290a.setContentView(inflate);
        Window window = this.f49290a.getWindow();
        this.f49291b = window;
        WindowManager.LayoutParams attributes2 = window.getAttributes();
        attributes2.height = -1;
        attributes2.width = -1;
        this.f49291b.setGravity(17);
    }

    public void b() {
        this.f49290a.dismiss();
    }

    public boolean d() {
        return this.f49290a.isShowing();
    }

    public void e(String str) {
        this.f49293d.setText(str);
    }

    public void f() {
        this.f49290a.show();
    }
}
