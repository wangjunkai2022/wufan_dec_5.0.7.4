package com.xinzhu.overmind.client.frameworks.accounts;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorDescription;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.xinzhu.haunted.com.android.internal.a;
import com.xinzhu.overmind.server.accounts.MindAccountManagerService;
import com.xinzhu.overmind.server.am.f;
import com.xinzhu.overmind.server.user.MindUserHandle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class ChooseTypeAndAccountActivity extends Activity implements AccountManagerCallback<Bundle> {
    public static final int A = 1;
    public static final int B = 2;
    private static final String C = "pendingRequest";
    private static final String D = "existingAccounts";
    private static final String E = "selectedAccountName";
    private static final String F = "selectedAddAccount";
    private static final String G = "accountsList";
    private static final String H = "visibilityList";
    private static final int I = -1;
    private static final ComponentName J = ComponentName.unflattenFromString(Resources.getSystem().getString(a.c.e()));

    /* renamed from: q  reason: collision with root package name */
    private static final String f67509q = "AccountChooser";

    /* renamed from: r  reason: collision with root package name */
    public static final String f67510r = "allowableAccounts";

    /* renamed from: s  reason: collision with root package name */
    public static final String f67511s = "allowableAccountTypes";

    /* renamed from: t  reason: collision with root package name */
    public static final String f67512t = "addAccountOptions";

    /* renamed from: u  reason: collision with root package name */
    public static final String f67513u = "addAccountRequiredFeatures";

    /* renamed from: v  reason: collision with root package name */
    public static final String f67514v = "authTokenType";

    /* renamed from: w  reason: collision with root package name */
    public static final String f67515w = "selectedAccount";
    @Deprecated

    /* renamed from: x  reason: collision with root package name */
    public static final String f67516x = "alwaysPromptForAccount";

    /* renamed from: y  reason: collision with root package name */
    public static final String f67517y = "descriptionTextOverride";

    /* renamed from: z  reason: collision with root package name */
    public static final int f67518z = 0;

    /* renamed from: b  reason: collision with root package name */
    private Set<Account> f67519b;

    /* renamed from: c  reason: collision with root package name */
    private Set<String> f67520c;

    /* renamed from: f  reason: collision with root package name */
    private String f67523f;

    /* renamed from: g  reason: collision with root package name */
    private LinkedHashMap<Account, Integer> f67524g;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<Account> f67525h;

    /* renamed from: k  reason: collision with root package name */
    private int f67528k;

    /* renamed from: l  reason: collision with root package name */
    private Button f67529l;

    /* renamed from: m  reason: collision with root package name */
    private int f67530m;

    /* renamed from: n  reason: collision with root package name */
    private String f67531n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f67532o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f67533p;

    /* renamed from: d  reason: collision with root package name */
    private String f67521d = null;

    /* renamed from: e  reason: collision with root package name */
    private boolean f67522e = false;

    /* renamed from: i  reason: collision with root package name */
    private int f67526i = 0;

    /* renamed from: j  reason: collision with root package name */
    private Parcelable[] f67527j = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            ChooseTypeAndAccountActivity.this.f67528k = i4;
            ChooseTypeAndAccountActivity.this.f67529l.setEnabled(true);
        }
    }

    private LinkedHashMap<Account, Integer> c(com.xinzhu.overmind.client.frameworks.accounts.a aVar) {
        Set<String> set;
        Map accountsAndVisibilityForPackage = aVar.getAccountsAndVisibilityForPackage(this.f67531n, null);
        Account[] accountsAsUser = aVar.getAccountsAsUser(null, MindUserHandle.k(1000), null);
        LinkedHashMap<Account, Integer> linkedHashMap = new LinkedHashMap<>(accountsAndVisibilityForPackage.size());
        for (Account account : accountsAsUser) {
            Set<Account> set2 = this.f67519b;
            if ((set2 == null || set2.contains(account)) && (((set = this.f67520c) == null || set.contains(account.type)) && accountsAndVisibilityForPackage.get(account) != null)) {
                linkedHashMap.put(account, (Integer) accountsAndVisibilityForPackage.get(account));
            }
        }
        return linkedHashMap;
    }

    private Set<Account> d(Intent intent) {
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(f67510r);
        if (parcelableArrayListExtra != null) {
            HashSet hashSet = new HashSet(parcelableArrayListExtra.size());
            Iterator it2 = parcelableArrayListExtra.iterator();
            while (it2.hasNext()) {
                hashSet.add((Account) ((Parcelable) it2.next()));
            }
            return hashSet;
        }
        return null;
    }

    private int e(ArrayList<Account> arrayList, String str, boolean z4) {
        if (z4) {
            return arrayList.size();
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            if (arrayList.get(i4).name.equals(str)) {
                return i4;
            }
        }
        return -1;
    }

    private String[] f(ArrayList<Account> arrayList) {
        String[] strArr = new String[arrayList.size() + (!this.f67532o ? 1 : 0)];
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            strArr[i4] = arrayList.get(i4).name;
        }
        if (!this.f67532o) {
            strArr[arrayList.size()] = getResources().getString(a.c.d());
        }
        return strArr;
    }

    private Set<String> g(Intent intent) {
        String[] stringArrayExtra = intent.getStringArrayExtra(f67511s);
        AuthenticatorDescription[] authenticatorTypes = AccountManager.get(this).getAuthenticatorTypes();
        HashSet hashSet = new HashSet(authenticatorTypes.length);
        for (AuthenticatorDescription authenticatorDescription : authenticatorTypes) {
            hashSet.add(authenticatorDescription.type);
        }
        if (stringArrayExtra != null) {
            HashSet hashSet2 = new HashSet(Arrays.asList(stringArrayExtra));
            hashSet2.retainAll(hashSet);
            return hashSet2;
        }
        return hashSet;
    }

    public static boolean h(Intent intent) {
        return J.equals(intent.getComponent());
    }

    private void i(Account account) {
        StringBuilder sb = new StringBuilder();
        sb.append("selected account ");
        sb.append(account);
        n(account.name, account.type);
    }

    private void j(String str) {
        TextView textView = (TextView) findViewById(a.C0709a.r());
        if (!TextUtils.isEmpty(str)) {
            textView.setText(str);
        } else {
            textView.setVisibility(8);
        }
    }

    private final void k(String[] strArr) {
        ListView listView = (ListView) findViewById(16908298);
        listView.setAdapter((ListAdapter) new ArrayAdapter(this, 17367055, strArr));
        listView.setChoiceMode(1);
        listView.setItemsCanFocus(false);
        listView.setOnItemClickListener(new a());
        int i4 = this.f67528k;
        if (i4 != -1) {
            listView.setItemChecked(i4, true);
            if (Log.isLoggable(f67509q, 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("List item ");
                sb.append(this.f67528k);
                sb.append(" should be selected");
            }
        }
    }

    private void m(Bundle bundle) {
        setTheme(a.d.b());
        super.onCreate(bundle);
    }

    private void n(String str, String str2) {
        Account account = new Account(str, str2);
        Integer valueOf = Integer.valueOf(MindAccountManagerService.get().getAccountVisibility(account, this.f67531n));
        if (valueOf != null && valueOf.intValue() == 4) {
            MindAccountManagerService.get().setAccountVisibility(account, this.f67531n, 2);
        }
        if (valueOf != null && valueOf.intValue() == 3) {
            setResult(0);
            finish();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        bundle.putString("accountType", str2);
        setResult(-1, new Intent().putExtras(bundle));
        if (Log.isLoggable(f67509q, 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("ChooseTypeAndAccountActivity.setResultAndFinish: selected account ");
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
        }
        finish();
    }

    private void o() {
        Intent intent = new Intent(this, ChooseAccountTypeActivity.class);
        intent.setFlags(524288);
        intent.putExtra(f67511s, getIntent().getStringArrayExtra(f67511s));
        intent.putExtra(f67512t, getIntent().getBundleExtra(f67512t));
        intent.putExtra(f67513u, getIntent().getStringArrayExtra(f67513u));
        intent.putExtra("authTokenType", getIntent().getStringExtra("authTokenType"));
        startActivityForResult(intent, 1);
        this.f67526i = 1;
    }

    protected void l(String str) {
        if (Log.isLoggable(f67509q, 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("runAddAccountForAuthenticator: ");
            sb.append(str);
        }
        Bundle bundleExtra = getIntent().getBundleExtra(f67512t);
        String[] stringArrayExtra = getIntent().getStringArrayExtra(f67513u);
        AccountManager.get(this).addAccount(str, getIntent().getStringExtra("authTokenType"), stringArrayExtra, bundleExtra, null, this, null);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i4, int i5, Intent intent) {
        String str;
        String stringExtra;
        String str2 = null;
        if (Log.isLoggable(f67509q, 2)) {
            if (intent != null && intent.getExtras() != null) {
                intent.getExtras().keySet();
            }
            Bundle extras = intent != null ? intent.getExtras() : null;
            StringBuilder sb = new StringBuilder();
            sb.append("ChooseTypeAndAccountActivity.onActivityResult(reqCode=");
            sb.append(i4);
            sb.append(", resCode=");
            sb.append(i5);
            sb.append(", extras=");
            sb.append(extras);
            sb.append(")");
        }
        this.f67526i = 0;
        if (i5 == 0) {
            if (this.f67525h.isEmpty()) {
                setResult(0);
                finish();
                return;
            }
            return;
        }
        if (i5 == -1) {
            if (i4 == 1) {
                if (intent != null && (stringExtra = intent.getStringExtra("accountType")) != null) {
                    l(stringExtra);
                    return;
                }
            } else if (i4 == 2) {
                if (intent != null) {
                    str2 = intent.getStringExtra("authAccount");
                    str = intent.getStringExtra("accountType");
                } else {
                    str = null;
                }
                if (str2 == null || str == null) {
                    MindAccountManagerService mindAccountManagerService = MindAccountManagerService.get();
                    String str3 = this.f67531n;
                    Account[] accountsForPackage = mindAccountManagerService.getAccountsForPackage(str3, this.f67530m, str3);
                    HashSet hashSet = new HashSet();
                    for (Parcelable parcelable : this.f67527j) {
                        hashSet.add((Account) parcelable);
                    }
                    int length = accountsForPackage.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length) {
                            break;
                        }
                        Account account = accountsForPackage[i6];
                        if (!hashSet.contains(account)) {
                            str2 = account.name;
                            str = account.type;
                            break;
                        }
                        i6++;
                    }
                }
                if (str2 != null || str != null) {
                    n(str2, str);
                    return;
                }
            }
        }
        setResult(0);
        finish();
    }

    public void onCancelButtonClicked(View view) {
        onBackPressed();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        if (Log.isLoggable(f67509q, 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("ChooseTypeAndAccountActivity.onCreate(savedInstanceState=");
            sb.append(bundle);
            sb.append(")");
        }
        try {
            IBinder g4 = new com.xinzhu.haunted.android.app.a(this).g();
            this.f67530m = f.get().getLaunchedFromUid(g4);
            String launchedFromPackage = f.get().getLaunchedFromPackage(g4);
            this.f67531n = launchedFromPackage;
            if (this.f67530m != 0 && launchedFromPackage != null) {
                this.f67532o = false;
            }
        } catch (RemoteException e5) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to get caller identity \n");
            sb2.append(e5);
        }
        Intent intent = getIntent();
        this.f67519b = d(intent);
        this.f67520c = g(intent);
        this.f67523f = intent.getStringExtra(f67517y);
        if (bundle != null) {
            this.f67526i = bundle.getInt(C);
            this.f67527j = bundle.getParcelableArray(D);
            this.f67521d = bundle.getString(E);
            this.f67522e = bundle.getBoolean(F, false);
            Parcelable[] parcelableArray = bundle.getParcelableArray(G);
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(H);
            this.f67524g = new LinkedHashMap<>();
            for (int i4 = 0; i4 < parcelableArray.length; i4++) {
                this.f67524g.put((Account) parcelableArray[i4], integerArrayList.get(i4));
            }
        } else {
            this.f67526i = 0;
            this.f67527j = null;
            Account account = (Account) intent.getParcelableExtra(f67515w);
            if (account != null) {
                this.f67521d = account.name;
            }
            this.f67524g = c(com.xinzhu.overmind.client.frameworks.accounts.a.get());
        }
        if (Log.isLoggable(f67509q, 2)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("selected account name is ");
            sb3.append(this.f67521d);
        }
        this.f67525h = new ArrayList<>(this.f67524g.size());
        for (Map.Entry<Account, Integer> entry : this.f67524g.entrySet()) {
            if (3 != entry.getValue().intValue()) {
                this.f67525h.add(entry.getKey());
            }
        }
        if (this.f67525h.isEmpty() && this.f67532o) {
            requestWindowFeature(1);
            setContentView(a.b.h());
            this.f67533p = true;
        }
        if (this.f67533p) {
            super.onCreate(bundle);
            return;
        }
        if (this.f67526i == 0 && this.f67525h.isEmpty()) {
            m(bundle);
            if (this.f67520c.size() == 1) {
                l(this.f67520c.iterator().next());
            } else {
                o();
            }
        }
        String[] f5 = f(this.f67525h);
        this.f67528k = e(this.f67525h, this.f67521d, this.f67522e);
        super.onCreate(bundle);
        setContentView(a.b.l());
        j(this.f67523f);
        k(f5);
        Button button = (Button) findViewById(16908314);
        this.f67529l = button;
        button.setEnabled(this.f67528k != -1);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
    }

    public void onOkButtonClicked(View view) {
        if (this.f67528k == this.f67525h.size()) {
            o();
            return;
        }
        int i4 = this.f67528k;
        if (i4 != -1) {
            i(this.f67525h.get(i4));
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(C, this.f67526i);
        if (this.f67526i == 2) {
            bundle.putParcelableArray(D, this.f67527j);
        }
        int i4 = this.f67528k;
        int i5 = 0;
        if (i4 != -1) {
            if (i4 == this.f67525h.size()) {
                bundle.putBoolean(F, true);
            } else {
                bundle.putBoolean(F, false);
                bundle.putString(E, this.f67525h.get(this.f67528k).name);
            }
        }
        Parcelable[] parcelableArr = new Parcelable[this.f67524g.size()];
        ArrayList<Integer> arrayList = new ArrayList<>(this.f67524g.size());
        for (Map.Entry<Account, Integer> entry : this.f67524g.entrySet()) {
            parcelableArr[i5] = entry.getKey();
            arrayList.add(entry.getValue());
            i5++;
        }
        bundle.putParcelableArray(G, parcelableArr);
        bundle.putIntegerArrayList(H, arrayList);
    }

    @Override // android.accounts.AccountManagerCallback
    public void run(AccountManagerFuture<Bundle> accountManagerFuture) {
        try {
            Intent intent = (Intent) accountManagerFuture.getResult().getParcelable("intent");
            if (intent != null) {
                this.f67526i = 2;
                MindAccountManagerService mindAccountManagerService = MindAccountManagerService.get();
                String str = this.f67531n;
                this.f67527j = mindAccountManagerService.getAccountsForPackage(str, this.f67530m, str);
                intent.setFlags(intent.getFlags() & (-268435457));
                startActivityForResult(intent, 2);
                return;
            }
        } catch (AuthenticatorException | IOException unused) {
        } catch (OperationCanceledException unused2) {
            setResult(0);
            finish();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("errorMessage", "error communicating with server");
        setResult(-1, new Intent().putExtras(bundle));
        finish();
    }
}
