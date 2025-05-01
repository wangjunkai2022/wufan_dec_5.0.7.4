package com.xinzhu.overmind.client.frameworks.accounts;

import android.accounts.AccountManager;
import android.accounts.AuthenticatorDescription;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
/* loaded from: classes6.dex */
public class ChooseAccountTypeActivity extends Activity {

    /* renamed from: d  reason: collision with root package name */
    private static final String f67498d = "AccountChooser";

    /* renamed from: b  reason: collision with root package name */
    private HashMap<String, c> f67499b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private ArrayList<c> f67500c;

    /* loaded from: classes6.dex */
    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            ChooseAccountTypeActivity chooseAccountTypeActivity = ChooseAccountTypeActivity.this;
            chooseAccountTypeActivity.d(((c) chooseAccountTypeActivity.f67500c.get(i4)).f67504a.type);
        }
    }

    /* loaded from: classes6.dex */
    private static class b extends ArrayAdapter<c> {

        /* renamed from: b  reason: collision with root package name */
        private LayoutInflater f67502b;

        /* renamed from: c  reason: collision with root package name */
        private ArrayList<c> f67503c;

        public b(Context context, int i4, ArrayList<c> arrayList) {
            super(context, i4, arrayList);
            this.f67503c = arrayList;
            this.f67502b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            d dVar;
            if (view == null) {
                view = this.f67502b.inflate(a.b.j(), (ViewGroup) null);
                dVar = new d(null);
                dVar.f67508b = (TextView) view.findViewById(a.C0709a.m());
                dVar.f67507a = (ImageView) view.findViewById(a.C0709a.l());
                view.setTag(dVar);
            } else {
                dVar = (d) view.getTag();
            }
            dVar.f67508b.setText(this.f67503c.get(i4).f67505b);
            dVar.f67507a.setImageDrawable(this.f67503c.get(i4).f67506c);
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final AuthenticatorDescription f67504a;

        /* renamed from: b  reason: collision with root package name */
        final String f67505b;

        /* renamed from: c  reason: collision with root package name */
        final Drawable f67506c;

        c(AuthenticatorDescription authenticatorDescription, String str, Drawable drawable) {
            this.f67504a = authenticatorDescription;
            this.f67505b = str;
            this.f67506c = drawable;
        }
    }

    /* loaded from: classes6.dex */
    private static class d {

        /* renamed from: a  reason: collision with root package name */
        ImageView f67507a;

        /* renamed from: b  reason: collision with root package name */
        TextView f67508b;

        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    private void c() {
        AuthenticatorDescription[] authenticatorTypes;
        Drawable drawable;
        String str;
        Context createPackageContext;
        for (AuthenticatorDescription authenticatorDescription : AccountManager.get(this).getAuthenticatorTypes()) {
            try {
                createPackageContext = createPackageContext(authenticatorDescription.packageName, 0);
                drawable = createPackageContext.getDrawable(authenticatorDescription.iconId);
            } catch (PackageManager.NameNotFoundException unused) {
                drawable = null;
            } catch (Resources.NotFoundException unused2) {
                drawable = null;
            }
            try {
                CharSequence text = createPackageContext.getResources().getText(authenticatorDescription.labelId);
                if (text != null) {
                    text.toString();
                }
                str = text.toString();
            } catch (PackageManager.NameNotFoundException unused3) {
                if (Log.isLoggable(f67498d, 5)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("No icon name for account type ");
                    sb.append(authenticatorDescription.type);
                }
                str = null;
                this.f67499b.put(authenticatorDescription.type, new c(authenticatorDescription, str, drawable));
            } catch (Resources.NotFoundException unused4) {
                if (Log.isLoggable(f67498d, 5)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("No icon resource for account type ");
                    sb2.append(authenticatorDescription.type);
                }
                str = null;
                this.f67499b.put(authenticatorDescription.type, new c(authenticatorDescription, str, drawable));
            }
            this.f67499b.put(authenticatorDescription.type, new c(authenticatorDescription, str, drawable));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("accountType", str);
        setResult(-1, new Intent().putExtras(bundle));
        if (Log.isLoggable(f67498d, 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("ChooseAccountTypeActivity.setResultAndFinish: selected account type ");
            sb.append(str);
        }
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Log.isLoggable(f67498d, 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("ChooseAccountTypeActivity.onCreate(savedInstanceState=");
            sb.append(bundle);
            sb.append(")");
        }
        HashSet hashSet = null;
        String[] stringArrayExtra = getIntent().getStringArrayExtra(ChooseTypeAndAccountActivity.f67511s);
        if (stringArrayExtra != null) {
            hashSet = new HashSet(stringArrayExtra.length);
            for (String str : stringArrayExtra) {
                hashSet.add(str);
            }
        }
        c();
        this.f67500c = new ArrayList<>(this.f67499b.size());
        for (Map.Entry<String, c> entry : this.f67499b.entrySet()) {
            String key = entry.getKey();
            c value = entry.getValue();
            if (hashSet == null || hashSet.contains(key)) {
                this.f67500c.add(value);
            }
        }
        if (this.f67500c.isEmpty()) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("errorMessage", "no allowable account types");
            setResult(-1, new Intent().putExtras(bundle2));
            finish();
        } else if (this.f67500c.size() == 1) {
            d(this.f67500c.get(0).f67504a.type);
        } else {
            setContentView(a.b.k());
            ListView listView = (ListView) findViewById(16908298);
            listView.setAdapter((ListAdapter) new b(this, 17367043, this.f67500c));
            listView.setChoiceMode(0);
            listView.setTextFilterEnabled(false);
            listView.setOnItemClickListener(new a());
        }
    }
}
