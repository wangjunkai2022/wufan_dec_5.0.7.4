package com.xinzhu.overmind.client.frameworks.accounts;

import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import android.accounts.IAccountManagerResponse;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.UserHandle;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.server.accounts.e;
import com.xinzhu.overmind.server.i;
import java.util.Map;
/* compiled from: MindAccountManager.java */
/* loaded from: classes.dex */
public class a extends e.b {
    private static a sAccountManager = new a();
    private e mService;

    public static a get() {
        return sAccountManager;
    }

    private e getService() {
        e eVar = this.mService;
        if (eVar != null && eVar.asBinder().isBinderAlive()) {
            return this.mService;
        }
        this.mService = e.b.asInterface(Overmind.get().getService(i.f68000l));
        return getService();
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public boolean accountAuthenticated(Account account) {
        try {
            return getService().accountAuthenticated(account);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void addAccount(IAccountManagerResponse iAccountManagerResponse, String str, String str2, String[] strArr, boolean z4, Bundle bundle) {
        try {
            getService().addAccount(iAccountManagerResponse, str, str2, strArr, z4, bundle);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void addAccountAsUser(IAccountManagerResponse iAccountManagerResponse, String str, String str2, String[] strArr, boolean z4, Bundle bundle, int i4) {
        try {
            getService().addAccountAsUser(iAccountManagerResponse, str, str2, strArr, z4, bundle, i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public boolean addAccountExplicitly(Account account, String str, Bundle bundle) {
        try {
            return getService().addAccountExplicitly(account, str, bundle);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public boolean addAccountExplicitlyWithVisibility(Account account, String str, Bundle bundle, Map map) {
        try {
            return getService().addAccountExplicitlyWithVisibility(account, str, bundle, map);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public boolean addSharedAccountAsUser(Account account, int i4) {
        try {
            return getService().addSharedAccountAsUser(account, i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void addSharedAccountsFromParentUser(int i4, int i5, String str) {
        try {
            getService().addSharedAccountsFromParentUser(i4, i5, str);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void clearPassword(Account account) {
        try {
            getService().clearPassword(account);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void confirmCredentialsAsUser(IAccountManagerResponse iAccountManagerResponse, Account account, Bundle bundle, boolean z4, int i4) {
        try {
            getService().confirmCredentialsAsUser(iAccountManagerResponse, account, bundle, z4, i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void copyAccountToUser(IAccountManagerResponse iAccountManagerResponse, Account account, int i4, int i5) {
        try {
            getService().copyAccountToUser(iAccountManagerResponse, account, i4, i5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public IntentSender createRequestAccountAccessIntentSenderAsUser(Account account, String str, UserHandle userHandle) {
        try {
            return getService().createRequestAccountAccessIntentSenderAsUser(account, str, userHandle);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void editProperties(IAccountManagerResponse iAccountManagerResponse, String str, boolean z4) {
        try {
            getService().editProperties(iAccountManagerResponse, str, z4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void finishSessionAsUser(IAccountManagerResponse iAccountManagerResponse, Bundle bundle, boolean z4, Bundle bundle2, int i4) {
        try {
            getService().finishSessionAsUser(iAccountManagerResponse, bundle, z4, bundle2, i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void getAccountByTypeAndFeatures(IAccountManagerResponse iAccountManagerResponse, String str, String[] strArr, String str2) {
        try {
            getService().getAccountByTypeAndFeatures(iAccountManagerResponse, str, strArr, str2);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public int getAccountVisibility(Account account, String str) {
        try {
            return getService().getAccountVisibility(account, str);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public Map getAccountsAndVisibilityForPackage(String str, String str2) {
        try {
            return getService().getAccountsAndVisibilityForPackage(str, str2);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public Account[] getAccountsAsUser(String str, int i4, String str2) {
        try {
            return getService().getAccountsAsUser(str, i4, str2);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void getAccountsByFeatures(IAccountManagerResponse iAccountManagerResponse, String str, String[] strArr, String str2) {
        try {
            getService().getAccountsByFeatures(iAccountManagerResponse, str, strArr, str2);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public Account[] getAccountsByTypeForPackage(String str, String str2, String str3) {
        try {
            return getService().getAccountsByTypeForPackage(str, str2, str3);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public Account[] getAccountsForPackage(String str, int i4, String str2) {
        try {
            return getService().getAccountsForPackage(str, i4, str2);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void getAuthToken(IAccountManagerResponse iAccountManagerResponse, Account account, String str, boolean z4, boolean z5, Bundle bundle, int i4) {
        try {
            getService().getAuthToken(iAccountManagerResponse, account, str, z4, z5, bundle, i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void getAuthTokenLabel(IAccountManagerResponse iAccountManagerResponse, String str, String str2) {
        try {
            getService().getAuthTokenLabel(iAccountManagerResponse, str, str2);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public AuthenticatorDescription[] getAuthenticatorTypes(int i4) {
        try {
            return getService().getAuthenticatorTypes(i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public Map getPackagesAndVisibilityForAccount(Account account) {
        try {
            return getService().getPackagesAndVisibilityForAccount(account);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public String getPassword(Account account) {
        try {
            return getService().getPassword(account);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public String getPreviousName(Account account) {
        try {
            return getService().getPreviousName(account);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public Account[] getSharedAccountsAsUser(int i4) {
        try {
            return getService().getSharedAccountsAsUser(i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public String getUserData(Account account, String str) {
        try {
            return getService().getUserData(account, str);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public boolean hasAccountAccess(Account account, String str, UserHandle userHandle) {
        try {
            return getService().hasAccountAccess(account, str, userHandle);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void hasFeatures(IAccountManagerResponse iAccountManagerResponse, Account account, String[] strArr, String str) {
        try {
            getService().hasFeatures(iAccountManagerResponse, account, strArr, str);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void invalidateAuthToken(String str, String str2) {
        try {
            getService().invalidateAuthToken(str, str2);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void isCredentialsUpdateSuggested(IAccountManagerResponse iAccountManagerResponse, Account account, String str) {
        try {
            getService().isCredentialsUpdateSuggested(iAccountManagerResponse, account, str);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void onAccountAccessed(String str) {
        try {
            getService().onAccountAccessed(str);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public String peekAuthToken(Account account, String str) {
        try {
            return getService().peekAuthToken(account, str);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void registerAccountListener(String[] strArr, String str) {
        try {
            getService().registerAccountListener(strArr, str);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void removeAccountAsUser(IAccountManagerResponse iAccountManagerResponse, Account account, boolean z4, int i4) {
        try {
            getService().removeAccountAsUser(iAccountManagerResponse, account, z4, i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public boolean removeAccountExplicitly(Account account) {
        try {
            return getService().removeAccountExplicitly(account);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public boolean removeSharedAccountAsUser(Account account, int i4) {
        try {
            return getService().removeSharedAccountAsUser(account, i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void renameAccount(IAccountManagerResponse iAccountManagerResponse, Account account, String str) {
        try {
            getService().renameAccount(iAccountManagerResponse, account, str);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public boolean renameSharedAccountAsUser(Account account, String str, int i4) {
        try {
            return getService().renameSharedAccountAsUser(account, str, i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public boolean setAccountVisibility(Account account, String str, int i4) {
        try {
            return getService().setAccountVisibility(account, str, i4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void setAuthToken(Account account, String str, String str2) {
        try {
            getService().setAuthToken(account, str, str2);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void setPassword(Account account, String str) {
        try {
            getService().setPassword(account, str);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void setUserData(Account account, String str, String str2) {
        try {
            getService().setUserData(account, str, str2);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public boolean someUserHasAccount(Account account) {
        try {
            return getService().someUserHasAccount(account);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void startAddAccountSession(IAccountManagerResponse iAccountManagerResponse, String str, String str2, String[] strArr, boolean z4, Bundle bundle) {
        try {
            getService().startAddAccountSession(iAccountManagerResponse, str, str2, strArr, z4, bundle);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void startUpdateCredentialsSession(IAccountManagerResponse iAccountManagerResponse, Account account, String str, boolean z4, Bundle bundle) {
        try {
            getService().startUpdateCredentialsSession(iAccountManagerResponse, account, str, z4, bundle);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void unregisterAccountListener(String[] strArr, String str) {
        try {
            getService().unregisterAccountListener(strArr, str);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void updateAppPermission(Account account, String str, int i4, boolean z4) {
        try {
            getService().updateAppPermission(account, str, i4, z4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void updateCredentials(IAccountManagerResponse iAccountManagerResponse, Account account, String str, boolean z4, Bundle bundle) {
        try {
            getService().updateCredentials(iAccountManagerResponse, account, str, z4, bundle);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }
}
