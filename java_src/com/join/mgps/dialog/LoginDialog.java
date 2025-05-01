package com.join.mgps.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.NonNull;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes4.dex */
public class LoginDialog extends Dialog {

    /* renamed from: i  reason: collision with root package name */
    public static final int f49179i = 1;

    /* renamed from: j  reason: collision with root package name */
    public static final int f49180j = 2;

    /* renamed from: k  reason: collision with root package name */
    public static final int f49181k = 3;

    /* renamed from: l  reason: collision with root package name */
    public static final int f49182l = 4;

    /* renamed from: b  reason: collision with root package name */
    private View f49183b;

    /* renamed from: c  reason: collision with root package name */
    private View f49184c;

    /* renamed from: d  reason: collision with root package name */
    private View f49185d;

    /* renamed from: e  reason: collision with root package name */
    private int f49186e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f49187f;

    /* renamed from: g  reason: collision with root package name */
    private d f49188g;

    /* renamed from: h  reason: collision with root package name */
    private c f49189h;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface StyleType {
    }

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (LoginDialog.this.f49189h != null) {
                LoginDialog.this.f49189h.a(LoginDialog.this, 0);
            } else {
                LoginDialog.this.dismiss();
            }
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (LoginDialog.this.f49188g != null) {
                LoginDialog.this.f49188g.a(LoginDialog.this, 1);
                return;
            }
            LoginDialog.this.dismiss();
            IntentUtil.getInstance().goMyAccountLoginActivity(view.getContext());
        }
    }

    /* loaded from: classes4.dex */
    public interface c {
        void a(LoginDialog loginDialog, int i4);
    }

    /* loaded from: classes4.dex */
    public interface d {
        void a(LoginDialog loginDialog, int i4);
    }

    public LoginDialog(@NonNull Context context) {
        super(context, R.style.PapaTheme_Dialog);
        this.f49186e = 1;
        this.f49187f = false;
    }

    public static LoginDialog e(@NonNull Context context) {
        return new LoginDialog(context);
    }

    public LoginDialog c(boolean z4) {
        this.f49187f = z4;
        return this;
    }

    public LoginDialog d(c cVar) {
        this.f49189h = cVar;
        return this;
    }

    public LoginDialog f(d dVar) {
        this.f49188g = dVar;
        return this;
    }

    public LoginDialog g(int i4) {
        this.f49186e = i4;
        return this;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(this.f49187f);
        setContentView(R.layout.mg_dialog_login);
        this.f49183b = findViewById(R.id.main);
        this.f49184c = findViewById(R.id.vOK);
        this.f49185d = findViewById(R.id.vCancel);
        int i4 = this.f49186e;
        if (i4 == 1) {
            this.f49183b.setBackgroundResource(R.drawable.bg_login_normal);
        } else if (i4 == 2) {
            this.f49183b.setBackgroundResource(R.drawable.bg_login_battle);
        } else if (i4 == 3) {
            this.f49183b.setBackgroundResource(R.drawable.bg_login_interactive);
        } else if (i4 == 4) {
            this.f49183b.setBackgroundResource(R.drawable.bg_login_net_game);
        }
        this.f49185d.setOnClickListener(new a());
        this.f49184c.setOnClickListener(new b());
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 == 4 && keyEvent.getAction() == 0 && this.f49187f) {
            dismiss();
        }
        return super.onKeyDown(i4, keyEvent);
    }
}
