package com.join.mgps.customview.input;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.input.InputNumView;
/* compiled from: InputNumDialog.java */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private Dialog f48533a;

    /* renamed from: b  reason: collision with root package name */
    private Window f48534b;

    /* renamed from: c  reason: collision with root package name */
    private InputNumView f48535c;

    /* renamed from: d  reason: collision with root package name */
    private Context f48536d;

    /* renamed from: e  reason: collision with root package name */
    private InputNumView.d f48537e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InputNumDialog.java */
    /* renamed from: com.join.mgps.customview.input.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0359a implements InputNumView.d {
        C0359a() {
        }

        @Override // com.join.mgps.customview.input.InputNumView.d
        public void a(String str) {
            if (a.this.f48537e != null) {
                a.this.f48537e.a(str);
            }
        }

        @Override // com.join.mgps.customview.input.InputNumView.d
        public void hide() {
            if (a.this.f48537e != null) {
                a.this.f48537e.hide();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InputNumDialog.java */
    /* loaded from: classes4.dex */
    public class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            a.this.f48535c.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InputNumDialog.java */
    /* loaded from: classes4.dex */
    public class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            a.this.f48535c.d();
        }
    }

    public a(Context context, String str, int i4, boolean z4) {
        this.f48536d = context;
        InputNumView inputNumView = new InputNumView(context);
        this.f48535c = inputNumView;
        inputNumView.setNumLengthAndIsPwd(i4, z4);
        this.f48535c.setTitle(str);
        d();
    }

    private void d() {
        Dialog dialog = new Dialog(this.f48536d, R.style.newtrans_floating_dialog);
        this.f48533a = dialog;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            this.f48533a.getWindow().setAttributes(attributes);
        }
        this.f48533a.setContentView(this.f48535c);
        if (i4 >= 28) {
            WindowManager.LayoutParams attributes2 = this.f48533a.getWindow().getAttributes();
            attributes2.layoutInDisplayCutoutMode = 1;
            this.f48533a.getWindow().setAttributes(attributes2);
        }
        Window window = this.f48533a.getWindow();
        this.f48534b = window;
        WindowManager.LayoutParams attributes3 = window.getAttributes();
        attributes3.height = -1;
        attributes3.width = -1;
        this.f48534b.setGravity(80);
        this.f48535c.setListener(new C0359a());
        this.f48533a.setOnCancelListener(new b());
        this.f48533a.setOnDismissListener(new c());
    }

    public void c() {
        this.f48533a.dismiss();
    }

    public boolean e() {
        return this.f48533a.isShowing();
    }

    public void f(String str) {
        this.f48535c.setCurrentPwd(str);
    }

    public void g(InputNumView.d dVar) {
        this.f48537e = dVar;
    }

    public void h() {
        if (this.f48533a.isShowing()) {
            return;
        }
        this.f48533a.show();
    }
}
