package com.xinzhu.overmind.client.frameworks.accounts;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorDescription;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.xinzhu.haunted.com.android.internal.a;
import com.xinzhu.overmind.server.accounts.AccountManagerResponse;
import com.xinzhu.overmind.server.am.f;
import com.xinzhu.overmind.server.user.MindUserHandle;
import java.util.HashMap;
/* loaded from: classes.dex */
public class ChooseAccountActivity extends Activity {

    /* renamed from: h  reason: collision with root package name */
    private static final String f67484h = "AccountManager";

    /* renamed from: d  reason: collision with root package name */
    private Bundle f67487d;

    /* renamed from: e  reason: collision with root package name */
    private int f67488e;

    /* renamed from: f  reason: collision with root package name */
    private String f67489f;

    /* renamed from: b  reason: collision with root package name */
    private Parcelable[] f67485b = null;

    /* renamed from: c  reason: collision with root package name */
    private AccountManagerResponse f67486c = null;

    /* renamed from: g  reason: collision with root package name */
    private HashMap<String, AuthenticatorDescription> f67490g = new HashMap<>();

    /* loaded from: classes6.dex */
    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            ChooseAccountActivity.this.c((ListView) adapterView, view, i4, j4);
        }
    }

    /* loaded from: classes6.dex */
    private static class b extends ArrayAdapter<c> {

        /* renamed from: b  reason: collision with root package name */
        private LayoutInflater f67492b;

        /* renamed from: c  reason: collision with root package name */
        private c[] f67493c;

        public b(Context context, int i4, c[] cVarArr) {
            super(context, i4, cVarArr);
            this.f67493c = cVarArr;
            this.f67492b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            d dVar;
            if (view == null) {
                view = this.f67492b.inflate(a.b.j(), (ViewGroup) null);
                dVar = new d(null);
                dVar.f67497b = (TextView) view.findViewById(a.C0709a.m());
                dVar.f67496a = (ImageView) view.findViewById(a.C0709a.l());
                view.setTag(dVar);
            } else {
                dVar = (d) view.getTag();
            }
            dVar.f67497b.setText(this.f67493c[i4].f67494a);
            dVar.f67496a.setImageDrawable(this.f67493c[i4].f67495b);
            return view;
        }
    }

    /* loaded from: classes6.dex */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        final String f67494a;

        /* renamed from: b  reason: collision with root package name */
        final Drawable f67495b;

        c(String str, Drawable drawable) {
            this.f67494a = str;
            this.f67495b = drawable;
        }
    }

    /* loaded from: classes6.dex */
    private static class d {

        /* renamed from: a  reason: collision with root package name */
        ImageView f67496a;

        /* renamed from: b  reason: collision with root package name */
        TextView f67497b;

        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    private void a() {
        AuthenticatorDescription[] authenticatorTypes;
        for (AuthenticatorDescription authenticatorDescription : AccountManager.get(this).getAuthenticatorTypes()) {
            this.f67490g.put(authenticatorDescription.type, authenticatorDescription);
        }
    }

    private Drawable b(String str) {
        if (this.f67490g.containsKey(str)) {
            try {
                AuthenticatorDescription authenticatorDescription = this.f67490g.get(str);
                return createPackageContext(authenticatorDescription.packageName, 0).getDrawable(authenticatorDescription.iconId);
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable(f67484h, 5)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("No icon name for account type ");
                    sb.append(str);
                }
            } catch (Resources.NotFoundException unused2) {
                if (Log.isLoggable(f67484h, 5)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("No icon resource for account type ");
                    sb2.append(str);
                }
            }
        }
        return null;
    }

    protected void c(ListView listView, View view, int i4, long j4) {
        Account account = (Account) this.f67485b[i4];
        com.xinzhu.overmind.client.frameworks.accounts.a aVar = com.xinzhu.overmind.client.frameworks.accounts.a.get();
        Integer valueOf = Integer.valueOf(aVar.getAccountVisibility(account, this.f67489f));
        if (valueOf != null && valueOf.intValue() == 4) {
            aVar.setAccountVisibility(account, this.f67489f, 2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("selected account ");
        sb.append(account);
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", account.name);
        bundle.putString("accountType", account.type);
        this.f67487d = bundle;
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        AccountManagerResponse accountManagerResponse = this.f67486c;
        if (accountManagerResponse != null) {
            Bundle bundle = this.f67487d;
            if (bundle != null) {
                accountManagerResponse.b(bundle);
            } else {
                accountManagerResponse.a(4, "canceled");
            }
        }
        super.finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f67485b = getIntent().getParcelableArrayExtra("accounts");
        this.f67486c = (AccountManagerResponse) getIntent().getParcelableExtra("accountManagerResponse");
        int i4 = 0;
        if (this.f67485b == null) {
            setResult(0);
            finish();
            return;
        }
        try {
            IBinder g4 = new com.xinzhu.haunted.android.app.a(this).g();
            this.f67488e = f.get().getLaunchedFromUid(g4);
            this.f67489f = f.get().getLaunchedFromPackage(g4);
        } catch (RemoteException e5) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to get caller identity \n");
            sb.append(e5);
        }
        if (MindUserHandle.o(this.f67488e, 1000) && getIntent().getStringExtra("androidPackageName") != null) {
            this.f67489f = getIntent().getStringExtra("androidPackageName");
        }
        if (!MindUserHandle.o(this.f67488e, 1000) && getIntent().getStringExtra("androidPackageName") != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Non-system Uid: ");
            sb2.append(this.f67488e);
            sb2.append(" tried to override packageName \n");
        }
        a();
        c[] cVarArr = new c[this.f67485b.length];
        while (true) {
            Parcelable[] parcelableArr = this.f67485b;
            if (i4 < parcelableArr.length) {
                cVarArr[i4] = new c(((Account) parcelableArr[i4]).name, b(((Account) parcelableArr[i4]).type));
                i4++;
            } else {
                setContentView(a.b.i());
                ListView listView = (ListView) findViewById(16908298);
                listView.setAdapter((ListAdapter) new b(this, 17367043, cVarArr));
                listView.setChoiceMode(1);
                listView.setTextFilterEnabled(true);
                listView.setOnItemClickListener(new a());
                return;
            }
        }
    }
}
