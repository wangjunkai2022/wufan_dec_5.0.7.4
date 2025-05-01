package com.xinzhu.overmind.client.frameworks.accounts;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorDescription;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xinzhu.haunted.android.accounts.c;
import com.xinzhu.haunted.com.android.internal.a;
import com.xinzhu.overmind.server.accounts.MindAccountManagerService;
import java.io.IOException;
/* loaded from: classes.dex */
public class GrantCredentialsPermissionActivity extends Activity implements View.OnClickListener {

    /* renamed from: g  reason: collision with root package name */
    public static final String f67535g = "account";

    /* renamed from: h  reason: collision with root package name */
    public static final String f67536h = "authTokenType";

    /* renamed from: i  reason: collision with root package name */
    public static final String f67537i = "response";

    /* renamed from: j  reason: collision with root package name */
    public static final String f67538j = "uid";

    /* renamed from: b  reason: collision with root package name */
    private Account f67539b;

    /* renamed from: c  reason: collision with root package name */
    private String f67540c;

    /* renamed from: d  reason: collision with root package name */
    private int f67541d;

    /* renamed from: e  reason: collision with root package name */
    private Bundle f67542e = null;

    /* renamed from: f  reason: collision with root package name */
    protected LayoutInflater f67543f;

    /* loaded from: classes6.dex */
    class a implements AccountManagerCallback<String> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f67544b;

        /* renamed from: com.xinzhu.overmind.client.frameworks.accounts.GrantCredentialsPermissionActivity$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        class RunnableC0721a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f67546b;

            RunnableC0721a(String str) {
                this.f67546b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (GrantCredentialsPermissionActivity.this.isFinishing()) {
                    return;
                }
                a.this.f67544b.setText(this.f67546b);
                a.this.f67544b.setVisibility(0);
            }
        }

        a(TextView textView) {
            this.f67544b = textView;
        }

        @Override // android.accounts.AccountManagerCallback
        public void run(AccountManagerFuture<String> accountManagerFuture) {
            try {
                String result = accountManagerFuture.getResult();
                if (TextUtils.isEmpty(result)) {
                    return;
                }
                GrantCredentialsPermissionActivity.this.runOnUiThread(new RunnableC0721a(result));
            } catch (AuthenticatorException | OperationCanceledException | IOException unused) {
            }
        }
    }

    private String a(Account account) {
        AuthenticatorDescription[] authenticatorTypes;
        for (AuthenticatorDescription authenticatorDescription : AccountManager.get(this).getAuthenticatorTypes()) {
            if (authenticatorDescription.type.equals(account.type)) {
                try {
                    return createPackageContext(authenticatorDescription.packageName, 0).getString(authenticatorDescription.labelId);
                } catch (PackageManager.NameNotFoundException unused) {
                    return account.type;
                } catch (Resources.NotFoundException unused2) {
                    return account.type;
                }
            }
        }
        return account.type;
    }

    private View b(String str) {
        View inflate = this.f67543f.inflate(a.b.n(), (ViewGroup) null);
        ((TextView) inflate.findViewById(a.C0709a.s())).setText(str);
        return inflate;
    }

    public final void c(Bundle bundle) {
        this.f67542e = bundle;
    }

    @Override // android.app.Activity
    public void finish() {
        AccountAuthenticatorResponse accountAuthenticatorResponse = (AccountAuthenticatorResponse) getIntent().getParcelableExtra(f67537i);
        if (accountAuthenticatorResponse != null) {
            Bundle bundle = this.f67542e;
            if (bundle != null) {
                accountAuthenticatorResponse.onResult(bundle);
            } else {
                accountAuthenticatorResponse.onError(4, "canceled");
            }
        }
        super.finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == a.C0709a.o()) {
            MindAccountManagerService.get().updateAppPermission(this.f67539b, this.f67540c, this.f67541d, true);
            Intent intent = new Intent();
            intent.putExtra("retry", true);
            setResult(-1, intent);
            c(intent.getExtras());
        } else if (view.getId() == a.C0709a.q()) {
            MindAccountManagerService.get().updateAppPermission(this.f67539b, this.f67540c, this.f67541d, false);
            setResult(0);
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(a.b.m());
        setTitle(a.c.f());
        this.f67543f = (LayoutInflater) getSystemService("layout_inflater");
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            setResult(0);
            finish();
            return;
        }
        this.f67539b = (Account) extras.getParcelable(f67535g);
        this.f67540c = extras.getString("authTokenType");
        this.f67541d = extras.getInt("uid");
        PackageManager packageManager = getPackageManager();
        String[] packagesForUid = packageManager.getPackagesForUid(this.f67541d);
        Account account = this.f67539b;
        if (account != null && this.f67540c != null && packagesForUid != null) {
            try {
                String a5 = a(account);
                TextView textView = (TextView) findViewById(a.C0709a.p());
                textView.setVisibility(8);
                new c(AccountManager.get(this)).f(this.f67539b.type, this.f67540c, new a(textView), null);
                findViewById(a.C0709a.o()).setOnClickListener(this);
                findViewById(a.C0709a.q()).setOnClickListener(this);
                LinearLayout linearLayout = (LinearLayout) findViewById(a.C0709a.t());
                for (String str : packagesForUid) {
                    try {
                        str = packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    linearLayout.addView(b(str));
                }
                ((TextView) findViewById(a.C0709a.k())).setText(this.f67539b.name);
                ((TextView) findViewById(a.C0709a.n())).setText(a5);
                return;
            } catch (IllegalArgumentException unused2) {
                setResult(0);
                finish();
                return;
            }
        }
        setResult(0);
        finish();
    }
}
