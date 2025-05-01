package com.xinzhu.overmind.client.hook.proxies.accounts;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;
import android.os.IInterface;
import android.os.UserHandle;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.frameworks.accounts.GrantCredentialsPermissionActivity;
import com.xinzhu.overmind.client.hook.BinderInvocationStub;
import java.lang.reflect.Method;
import java.util.Map;
/* compiled from: AccountManagerStub.java */
/* loaded from: classes.dex */
public class a extends BinderInvocationStub {

    /* renamed from: b  reason: collision with root package name */
    public static final String f67638b = "AccountManagerStub";

    /* renamed from: c  reason: collision with root package name */
    private static final com.xinzhu.overmind.client.frameworks.accounts.a f67639c = com.xinzhu.overmind.client.frameworks.accounts.a.get();

    /* compiled from: AccountManagerStub.java */
    /* renamed from: com.xinzhu.overmind.client.hook.proxies.accounts.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0724a extends com.xinzhu.overmind.client.hook.e {
        C0724a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "accountAuthenticated";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            return Boolean.valueOf(a.f67639c.accountAuthenticated((Account) objArr[0]));
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class a0 extends com.xinzhu.overmind.client.hook.e {
        a0() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getPreviousName";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            return a.f67639c.getPreviousName((Account) objArr[0]);
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class b extends com.xinzhu.overmind.client.hook.e {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "addAccount";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            a.f67639c.addAccount((IAccountManagerResponse) objArr[0], (String) objArr[1], (String) objArr[2], (String[]) objArr[3], ((Boolean) objArr[4]).booleanValue(), (Bundle) objArr[5]);
            return null;
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class b0 extends com.xinzhu.overmind.client.hook.e {
        b0() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getSharedAccountsAsUser";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            return a.f67639c.getSharedAccountsAsUser(((Integer) objArr[0]).intValue());
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class c extends com.xinzhu.overmind.client.hook.e {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "addAccountAsUser";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            a.f67639c.addAccountAsUser((IAccountManagerResponse) objArr[0], (String) objArr[1], (String) objArr[2], (String[]) objArr[3], ((Boolean) objArr[4]).booleanValue(), (Bundle) objArr[5], ((Integer) objArr[6]).intValue());
            return null;
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class c0 extends com.xinzhu.overmind.client.hook.e {
        c0() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getUserData";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            return a.f67639c.getUserData((Account) objArr[0], (String) objArr[1]);
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class d extends com.xinzhu.overmind.client.hook.e {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "addAccountExplicitly";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            return Boolean.valueOf(a.f67639c.addAccountExplicitly((Account) objArr[0], (String) objArr[1], (Bundle) objArr[2]));
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class d0 extends com.xinzhu.overmind.client.hook.e {
        d0() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "hasAccountAccess";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            return Boolean.valueOf(a.f67639c.hasAccountAccess((Account) objArr[0], (String) objArr[1], (UserHandle) objArr[2]));
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class e extends com.xinzhu.overmind.client.hook.e {
        e() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "addAccountExplicitlyWithVisibility";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            return Boolean.valueOf(a.f67639c.addAccountExplicitlyWithVisibility((Account) objArr[0], (String) objArr[1], (Bundle) objArr[2], (Map) objArr[3]));
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class e0 extends com.xinzhu.overmind.client.hook.e {
        e0() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "hasFeatures";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            a.f67639c.hasFeatures((IAccountManagerResponse) objArr[0], (Account) objArr[1], (String[]) objArr[2], objArr.length >= 4 ? (String) objArr[3] : null);
            return null;
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class f extends com.xinzhu.overmind.client.hook.e {
        f() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "addSharedAccountAsUser";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            int intValue = ((Integer) objArr[1]).intValue();
            return Boolean.valueOf(a.f67639c.addSharedAccountAsUser((Account) objArr[0], intValue));
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class f0 extends com.xinzhu.overmind.client.hook.e {
        f0() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "invalidateAuthToken";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            a.f67639c.invalidateAuthToken((String) objArr[0], (String) objArr[1]);
            return null;
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class g extends com.xinzhu.overmind.client.hook.e {
        g() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "addSharedAccountsFromParentUser";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            a.f67639c.addSharedAccountsFromParentUser(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), objArr.length >= 3 ? (String) objArr[2] : null);
            return null;
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class g0 extends com.xinzhu.overmind.client.hook.e {
        g0() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "isCredentialsUpdateSuggested";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            a.f67639c.isCredentialsUpdateSuggested((IAccountManagerResponse) objArr[0], (Account) objArr[1], (String) objArr[2]);
            return null;
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class h extends com.xinzhu.overmind.client.hook.e {
        h() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "clearPassword";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            a.f67639c.clearPassword((Account) objArr[0]);
            return null;
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class h0 extends com.xinzhu.overmind.client.hook.e {
        h0() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "onAccountAccessed";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            a.f67639c.onAccountAccessed((String) objArr[0]);
            return null;
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class i extends com.xinzhu.overmind.client.hook.e {
        i() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "confirmCredentialsAsUser";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            a.f67639c.confirmCredentialsAsUser((IAccountManagerResponse) objArr[0], (Account) objArr[1], (Bundle) objArr[2], ((Boolean) objArr[3]).booleanValue(), ((Integer) objArr[4]).intValue());
            return null;
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class i0 extends com.xinzhu.overmind.client.hook.e {
        i0() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "peekAuthToken";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            return a.f67639c.peekAuthToken((Account) objArr[0], (String) objArr[1]);
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class j extends com.xinzhu.overmind.client.hook.e {
        j() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "copyAccountToUser";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            int intValue = ((Integer) objArr[2]).intValue();
            int intValue2 = ((Integer) objArr[3]).intValue();
            a.f67639c.copyAccountToUser((IAccountManagerResponse) objArr[0], (Account) objArr[1], intValue, intValue2);
            return null;
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class j0 extends com.xinzhu.overmind.client.hook.e {
        j0() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "registerAccountListener";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            a.f67639c.registerAccountListener((String[]) objArr[0], (String) objArr[1]);
            return null;
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class k extends com.xinzhu.overmind.client.hook.e {
        k() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "createRequestAccountAccessIntentSenderAsUser";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            return a.f67639c.createRequestAccountAccessIntentSenderAsUser((Account) objArr[0], (String) objArr[1], (UserHandle) objArr[2]);
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class k0 extends com.xinzhu.overmind.client.hook.e {
        k0() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "removeAccount";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            a.f67639c.removeAccountAsUser((IAccountManagerResponse) objArr[0], (Account) objArr[1], objArr.length >= 3 ? ((Boolean) objArr[2]).booleanValue() : false, com.xinzhu.overmind.client.e.getUserId());
            return null;
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class l extends com.xinzhu.overmind.client.hook.e {
        l() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "editProperties";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            a.f67639c.editProperties((IAccountManagerResponse) objArr[0], (String) objArr[1], booleanValue);
            return null;
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class l0 extends com.xinzhu.overmind.client.hook.e {
        l0() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "removeAccountAsUser";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            int i4;
            boolean z4 = false;
            IAccountManagerResponse iAccountManagerResponse = (IAccountManagerResponse) objArr[0];
            Account account = (Account) objArr[1];
            if (objArr.length == 3) {
                i4 = ((Integer) objArr[2]).intValue();
            } else if (objArr.length >= 4) {
                z4 = ((Boolean) objArr[2]).booleanValue();
                i4 = ((Integer) objArr[3]).intValue();
            } else {
                i4 = 0;
            }
            a.f67639c.removeAccountAsUser(iAccountManagerResponse, account, z4, i4);
            return null;
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class m extends com.xinzhu.overmind.client.hook.e {
        m() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "finishSessionAsUser";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            a.f67639c.finishSessionAsUser((IAccountManagerResponse) objArr[0], (Bundle) objArr[1], ((Boolean) objArr[2]).booleanValue(), (Bundle) objArr[3], ((Integer) objArr[4]).intValue());
            return null;
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class m0 extends com.xinzhu.overmind.client.hook.e {
        m0() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "removeAccountExplicitly";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            a.f67639c.removeAccountExplicitly((Account) objArr[0]);
            return null;
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class n extends com.xinzhu.overmind.client.hook.e {
        n() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getAccountByTypeAndFeatures";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            a.f67639c.getAccountByTypeAndFeatures((IAccountManagerResponse) objArr[0], (String) objArr[1], (String[]) objArr[2], (String) objArr[3]);
            return null;
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class n0 extends com.xinzhu.overmind.client.hook.e {
        n0() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "removeSharedAccountAsUser";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            int intValue = ((Integer) objArr[1]).intValue();
            return Boolean.valueOf(a.f67639c.removeSharedAccountAsUser((Account) objArr[0], intValue));
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class o extends com.xinzhu.overmind.client.hook.e {
        o() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getAccountVisibility";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            return Integer.valueOf(a.f67639c.getAccountVisibility((Account) objArr[0], (String) objArr[1]));
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class o0 extends com.xinzhu.overmind.client.hook.e {
        o0() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "renameAccount";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            a.f67639c.renameAccount((IAccountManagerResponse) objArr[0], (Account) objArr[1], (String) objArr[2]);
            return null;
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class p extends com.xinzhu.overmind.client.hook.e {
        p() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getAccounts";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            return a.f67639c.getAccountsAsUser((String) objArr[0], com.xinzhu.overmind.client.e.getUserId(), objArr.length >= 2 ? (String) objArr[1] : null);
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class p0 extends com.xinzhu.overmind.client.hook.e {
        p0() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "renameSharedAccountAsUser";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            int intValue = ((Integer) objArr[2]).intValue();
            return Boolean.valueOf(a.f67639c.renameSharedAccountAsUser((Account) objArr[0], (String) objArr[1], intValue));
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class q extends com.xinzhu.overmind.client.hook.e {
        q() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getAccountsAndVisibilityForPackage";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            return a.f67639c.getAccountsAndVisibilityForPackage((String) objArr[0], (String) objArr[1]);
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class q0 extends com.xinzhu.overmind.client.hook.e {
        q0() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "setAccountVisibility";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            int intValue = ((Integer) objArr[2]).intValue();
            return Boolean.valueOf(a.f67639c.setAccountVisibility((Account) objArr[0], (String) objArr[1], intValue));
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class r extends com.xinzhu.overmind.client.hook.e {
        r() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getAccountsAsUser";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            return a.f67639c.getAccountsAsUser((String) objArr[0], ((Integer) objArr[1]).intValue(), objArr.length >= 3 ? (String) objArr[2] : null);
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class r0 extends com.xinzhu.overmind.client.hook.e {
        r0() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "setAuthToken";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            a.f67639c.setAuthToken((Account) objArr[0], (String) objArr[1], (String) objArr[2]);
            return null;
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class s extends com.xinzhu.overmind.client.hook.e {
        s() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getAccountsByFeatures";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            a.f67639c.getAccountsByFeatures((IAccountManagerResponse) objArr[0], (String) objArr[1], (String[]) objArr[2], objArr.length >= 4 ? (String) objArr[3] : null);
            return null;
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class s0 extends com.xinzhu.overmind.client.hook.e {
        s0() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "setPassword";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            a.f67639c.setPassword((Account) objArr[0], (String) objArr[1]);
            return null;
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class t extends com.xinzhu.overmind.client.hook.e {
        t() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getAccountsByTypeForPackage";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            return a.f67639c.getAccountsByTypeForPackage((String) objArr[0], (String) objArr[1], objArr.length >= 3 ? (String) objArr[2] : null);
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class t0 extends com.xinzhu.overmind.client.hook.e {
        t0() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "setUserData";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            a.f67639c.setUserData((Account) objArr[0], (String) objArr[1], (String) objArr[2]);
            return null;
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class u extends com.xinzhu.overmind.client.hook.e {
        u() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getAccountsForPackage";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            return a.f67639c.getAccountsForPackage((String) objArr[0], ((Integer) objArr[1]).intValue(), objArr.length >= 3 ? (String) objArr[2] : null);
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class u0 extends com.xinzhu.overmind.client.hook.e {
        u0() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "someUserHasAccount";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            return Boolean.valueOf(a.f67639c.someUserHasAccount((Account) objArr[0]));
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class v extends com.xinzhu.overmind.client.hook.e {
        v() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getAuthToken";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            a.f67639c.getAuthToken((IAccountManagerResponse) objArr[0], (Account) objArr[1], (String) objArr[2], ((Boolean) objArr[3]).booleanValue(), ((Boolean) objArr[4]).booleanValue(), (Bundle) objArr[5], com.xinzhu.overmind.client.e.getVUid());
            return null;
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class v0 extends com.xinzhu.overmind.client.hook.e {
        v0() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "startAddAccountSession";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            a.f67639c.startAddAccountSession((IAccountManagerResponse) objArr[0], (String) objArr[1], (String) objArr[2], (String[]) objArr[3], ((Boolean) objArr[4]).booleanValue(), (Bundle) objArr[5]);
            return null;
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class w extends com.xinzhu.overmind.client.hook.e {
        w() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getAuthTokenLabel";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            a.f67639c.getAuthTokenLabel((IAccountManagerResponse) objArr[0], (String) objArr[1], (String) objArr[2]);
            return null;
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class w0 extends com.xinzhu.overmind.client.hook.e {
        w0() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "startUpdateCredentialsSession";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            a.f67639c.startUpdateCredentialsSession((IAccountManagerResponse) objArr[0], (Account) objArr[1], (String) objArr[2], ((Boolean) objArr[3]).booleanValue(), (Bundle) objArr[4]);
            return null;
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class x extends com.xinzhu.overmind.client.hook.e {
        x() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getAuthenticatorTypes";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            return a.f67639c.getAuthenticatorTypes(((Integer) objArr[0]).intValue());
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class x0 extends com.xinzhu.overmind.client.hook.e {
        x0() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "unregisterAccountListener";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            a.f67639c.unregisterAccountListener((String[]) objArr[0], (String) objArr[1]);
            return null;
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class y extends com.xinzhu.overmind.client.hook.e {
        y() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getPackagesAndVisibilityForAccount";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            return a.f67639c.getPackagesAndVisibilityForAccount((Account) objArr[0]);
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class y0 extends com.xinzhu.overmind.client.hook.e {
        y0() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "updateAppPermission";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            int intValue = ((Integer) objArr[2]).intValue();
            boolean booleanValue = ((Boolean) objArr[3]).booleanValue();
            a.f67639c.updateAppPermission((Account) objArr[0], (String) objArr[1], intValue, booleanValue);
            return null;
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class z extends com.xinzhu.overmind.client.hook.e {
        z() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "getPassword";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            return a.f67639c.getPassword((Account) objArr[0]);
        }
    }

    /* compiled from: AccountManagerStub.java */
    /* loaded from: classes.dex */
    static class z0 extends com.xinzhu.overmind.client.hook.e {
        z0() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public String c() {
            return "updateCredentials";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xinzhu.overmind.client.hook.e
        public Object d(Object obj, Method method, Object[] objArr) throws Throwable {
            a.f67639c.updateCredentials((IAccountManagerResponse) objArr[0], (Account) objArr[1], (String) objArr[2], ((Boolean) objArr[3]).booleanValue(), (Bundle) objArr[4]);
            return null;
        }
    }

    public a() {
        super(((IInterface) new com.xinzhu.haunted.android.accounts.c(AccountManager.get(Overmind.getContext())).g().f65714a).asBinder());
    }

    @Override // com.xinzhu.overmind.client.hook.d
    public boolean a() {
        return false;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected Object getWho() {
        return new com.xinzhu.haunted.android.accounts.c(AccountManager.get(Overmind.getContext())).g().f65714a;
    }

    @Override // com.xinzhu.overmind.client.hook.b
    protected void inject(Object obj, Object obj2) {
        com.xinzhu.haunted.android.accounts.c cVar = new com.xinzhu.haunted.android.accounts.c(AccountManager.get(Overmind.getContext()));
        cVar.i(new com.xinzhu.haunted.android.accounts.d(obj2));
        if (cVar.b()) {
            cVar.e();
        }
        replaceSystemService(GrantCredentialsPermissionActivity.f67535g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xinzhu.overmind.client.hook.BinderInvocationStub, com.xinzhu.overmind.client.hook.b
    public void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new z());
        addMethodHook(new c0());
        addMethodHook(new x());
        addMethodHook(new p());
        addMethodHook(new u());
        addMethodHook(new t());
        addMethodHook(new r());
        addMethodHook(new e0());
        addMethodHook(new t());
        addMethodHook(new n());
        addMethodHook(new s());
        addMethodHook(new d());
        addMethodHook(new k0());
        addMethodHook(new l0());
        addMethodHook(new m0());
        addMethodHook(new j());
        addMethodHook(new f0());
        addMethodHook(new i0());
        addMethodHook(new r0());
        addMethodHook(new s0());
        addMethodHook(new h());
        addMethodHook(new t0());
        addMethodHook(new y0());
        addMethodHook(new v());
        addMethodHook(new b());
        addMethodHook(new c());
        addMethodHook(new z0());
        addMethodHook(new l());
        addMethodHook(new i());
        addMethodHook(new C0724a());
        addMethodHook(new w());
        addMethodHook(new f());
        addMethodHook(new b0());
        addMethodHook(new n0());
        addMethodHook(new p0());
        addMethodHook(new g());
        addMethodHook(new o0());
        addMethodHook(new a0());
        if (com.xinzhu.overmind.utils.e.d()) {
            addMethodHook(new v0());
            addMethodHook(new w0());
            addMethodHook(new m());
            addMethodHook(new u0());
            addMethodHook(new g0());
            if (com.xinzhu.overmind.utils.e.w()) {
                addMethodHook(new y());
                addMethodHook(new e());
                addMethodHook(new q0());
                addMethodHook(new o());
                addMethodHook(new q());
                addMethodHook(new j0());
                addMethodHook(new x0());
                addMethodHook(new d0());
                addMethodHook(new k());
                addMethodHook(new h0());
            }
        }
    }
}
