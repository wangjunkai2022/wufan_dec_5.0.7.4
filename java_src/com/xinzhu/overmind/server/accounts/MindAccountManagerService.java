package com.xinzhu.overmind.server.accounts;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.AuthenticatorDescription;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountAuthenticatorResponse;
import android.accounts.IAccountManagerResponse;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallback;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.UserHandle;
import android.text.TextUtils;
import android.util.AtomicFile;
import android.util.Pair;
import android.util.SparseArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.join.mgps.activity.arena.GameRoomActivity_;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.frameworks.accounts.ChooseAccountActivity;
import com.xinzhu.overmind.client.frameworks.accounts.GrantCredentialsPermissionActivity;
import com.xinzhu.overmind.os.BinderHelper;
import com.xinzhu.overmind.server.accounts.MindAccountManagerService;
import com.xinzhu.overmind.server.accounts.b;
import com.xinzhu.overmind.server.accounts.e;
import com.xinzhu.overmind.server.pm.m;
import com.xinzhu.overmind.server.user.MindUserHandle;
import com.xinzhu.overmind.server.user.MindUserInfo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public class MindAccountManagerService extends e.b implements com.xinzhu.overmind.server.d {
    private static final String ACCOUNTS_FILE_AUTH_TOKEN = "authtoken.db";
    private static final String ACCOUNTS_FILE_DATA = "accounts.db";
    private static final String ACCOUNTS_FILE_PREVIOUS_NAME = "previous.db";
    private static final String ACCOUNTS_FILE_UID_GRANT = "grant.db";
    private static final String ACCOUNTS_FILE_USER_DATA = "userdata.db";
    private static final String ACCOUNTS_FILE_VISIBILITY = "visibility.db";
    public static final String ACCOUNT_ACCESS_TOKEN_TYPE = "com.android.AccountManager.ACCOUNT_ACCESS_TOKEN_TYPE";
    public static final String ACTION_ACCOUNT_REMOVED = "android.accounts.action.ACCOUNT_REMOVED";
    public static final String ACTION_VISIBLE_ACCOUNTS_CHANGED = "android.accounts.action.VISIBLE_ACCOUNTS_CHANGED";
    public static final int ERROR_CODE_MANAGEMENT_DISABLED_FOR_ACCOUNT_TYPE = 101;
    public static final int ERROR_CODE_USER_RESTRICTED = 100;
    public static final String KEY_ACCOUNT_ACCESS_ID = "accountAccessId";
    public static final String KEY_ACCOUNT_SESSION_BUNDLE = "accountSessionBundle";
    public static final String KEY_CUSTOM_TOKEN_EXPIRY = "android.accounts.expiry";
    public static final String KEY_LAST_AUTHENTICATED_TIME = "lastAuthenticatedTime";
    public static final String KEY_NOTIFY_ON_FAILURE = "notifyOnAuthFailure";
    private static final int MESSAGE_COPY_SHARED_ACCOUNT = 4;
    private static final int MESSAGE_TIMED_OUT = 3;
    public static final String PACKAGE_NAME_KEY_LEGACY_NOT_VISIBLE = "android:accounts:key_legacy_not_visible";
    public static final String PACKAGE_NAME_KEY_LEGACY_VISIBLE = "android:accounts:key_legacy_visible";
    private static final int SIGNATURE_CHECK_MATCH = 1;
    private static final int SIGNATURE_CHECK_MISMATCH = 0;
    private static final int SIGNATURE_CHECK_UID_MATCH = 2;
    private static final String TAG = "MAccountManagerService";
    public static final int VISIBILITY_NOT_VISIBLE = 3;
    public static final int VISIBILITY_UNDEFINED = 0;
    public static final int VISIBILITY_USER_MANAGED_NOT_VISIBLE = 4;
    public static final int VISIBILITY_USER_MANAGED_VISIBLE = 2;
    public static final int VISIBILITY_VISIBLE = 1;
    private final com.xinzhu.overmind.server.accounts.d mAuthenticatorCache;
    final t mHandler;
    private final com.xinzhu.overmind.server.pm.k mPackageMonitor;
    private final com.xinzhu.overmind.server.user.b mUserListener;
    private static final MindAccountManagerService sService = new MindAccountManagerService();
    private static final Account[] EMPTY_ACCOUNT_ARRAY = new Account[0];
    private static final byte[] ACCOUNTS_FILE_DATA_MAGIC = {65, 67, 67, 84};
    private static final byte[] ACCOUNTS_FILE_USER_DATA_MAGIC = {65, 67, 67, 85};
    private static final byte[] ACCOUNTS_FILE_AUTH_TOKEN_MAGIC = {65, 67, 67, 86};
    private static final byte[] ACCOUNTS_FILE_VISIBILITY_MAGIC = {65, 67, 67, 87};
    private static final byte[] ACCOUNTS_FILE_PREVIOUS_NAME_MAGIC = {65, 67, 67, 88};
    private static final byte[] ACCOUNTS_FILE_UID_GRANT_MAGIC = {65, 67, 67, 89};
    private static final Intent ACCOUNTS_CHANGED_INTENT = new Intent("android.accounts.LOGIN_ACCOUNTS_CHANGED");
    private com.xinzhu.overmind.client.frameworks.i mUserManager = null;
    private Context mContext = Overmind.getContext();
    private final LinkedHashMap<String, x> mSessions = new LinkedHashMap<>();
    private final CopyOnWriteArrayList<v> mAppPermissionChangeListeners = new CopyOnWriteArrayList<>();
    private final SparseArray<a0> mUsers = new SparseArray<>();

    /* loaded from: classes.dex */
    class a extends x {
        final /* synthetic */ String val$accountType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(a0 a0Var, IAccountManagerResponse iAccountManagerResponse, String str, boolean z4, boolean z5, String str2, boolean z6, String str3) {
            super(MindAccountManagerService.this, a0Var, iAccountManagerResponse, str, z4, z5, str2, z6);
            this.val$accountType = str3;
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x
        public void run() throws RemoteException {
            this.mAuthenticator.editProperties(this, this.mAccountType);
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x
        protected String toDebugString(long j4) {
            return super.toDebugString(j4) + ", editProperties, accountType " + this.val$accountType;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a0 {

        /* renamed from: a  reason: collision with root package name */
        private final int f67844a;

        /* renamed from: b  reason: collision with root package name */
        final Object f67845b = new Object();

        /* renamed from: c  reason: collision with root package name */
        private final Map<Account, MindAccount> f67846c = new HashMap();

        /* renamed from: d  reason: collision with root package name */
        private final HashMap<Pair<Pair<Account, String>, Integer>, u> f67847d = new HashMap<>();

        /* renamed from: e  reason: collision with root package name */
        private final HashMap<Account, u> f67848e = new HashMap<>();

        /* renamed from: f  reason: collision with root package name */
        final HashMap<String, Account[]> f67849f = new LinkedHashMap();

        /* renamed from: g  reason: collision with root package name */
        private final Map<Account, Map<String, String>> f67850g = new HashMap();

        /* renamed from: h  reason: collision with root package name */
        private final Map<Account, Map<String, String>> f67851h = new HashMap();

        /* renamed from: i  reason: collision with root package name */
        private final com.xinzhu.overmind.server.accounts.i f67852i = new com.xinzhu.overmind.server.accounts.i();

        /* renamed from: j  reason: collision with root package name */
        private final Map<Account, Map<String, Integer>> f67853j = new HashMap();

        /* renamed from: k  reason: collision with root package name */
        private final Map<String, Map<String, Integer>> f67854k = new HashMap();

        /* renamed from: l  reason: collision with root package name */
        private final Map<Account, AtomicReference<String>> f67855l = new HashMap();

        /* renamed from: m  reason: collision with root package name */
        private final List<UidGrant> f67856m = new LinkedList();

        a0(int i4) {
            this.f67844a = i4;
        }

        void l(Account account, String str, int i4) {
            synchronized (this.f67845b) {
                ListIterator<UidGrant> listIterator = this.f67856m.listIterator();
                while (listIterator.hasNext()) {
                    UidGrant next = listIterator.next();
                    if (next.f67841b == i4 && next.f67842c.equals(str) && next.f67843d.equals(account)) {
                        listIterator.remove();
                    }
                }
            }
        }

        void m(int i4) {
            synchronized (this.f67845b) {
                ListIterator<UidGrant> listIterator = this.f67856m.listIterator();
                while (listIterator.hasNext()) {
                    if (listIterator.next().f67841b == i4) {
                        listIterator.remove();
                    }
                }
            }
        }

        List<Integer> n() {
            LinkedList linkedList = new LinkedList();
            synchronized (this.f67845b) {
                for (UidGrant uidGrant : this.f67856m) {
                    linkedList.add(Integer.valueOf(uidGrant.f67841b));
                }
            }
            return linkedList;
        }

        long o(int i4, String str, Account account) {
            long j4;
            synchronized (this.f67845b) {
                j4 = 0;
                for (UidGrant uidGrant : this.f67856m) {
                    if (uidGrant.f67841b == i4 && uidGrant.f67842c.equals(str) && uidGrant.f67843d.equals(account)) {
                        j4++;
                    }
                }
            }
            return j4;
        }

        long p(int i4, Account account) {
            long j4;
            synchronized (this.f67845b) {
                j4 = 0;
                for (UidGrant uidGrant : this.f67856m) {
                    if (uidGrant.f67841b == i4 && uidGrant.f67843d.equals(account)) {
                        j4++;
                    }
                }
            }
            return j4;
        }

        void q(Account account, String str, int i4) {
            synchronized (this.f67845b) {
                this.f67856m.add(new UidGrant(i4, str, account));
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends x {
        final /* synthetic */ Account val$account;
        final /* synthetic */ Bundle val$options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a0 a0Var, IAccountManagerResponse iAccountManagerResponse, String str, boolean z4, boolean z5, String str2, boolean z6, boolean z7, Account account, Bundle bundle) {
            super(a0Var, iAccountManagerResponse, str, z4, z5, str2, z6, z7);
            this.val$account = account;
            this.val$options = bundle;
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x
        public void run() throws RemoteException {
            this.mAuthenticator.confirmCredentials(this, this.val$account, this.val$options);
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x
        protected String toDebugString(long j4) {
            return super.toDebugString(j4) + ", confirmCredentials, " + this.val$account;
        }
    }

    /* loaded from: classes.dex */
    class c extends x {
        final /* synthetic */ String val$accountType;
        final /* synthetic */ String val$authTokenType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a0 a0Var, IAccountManagerResponse iAccountManagerResponse, String str, boolean z4, boolean z5, String str2, boolean z6, String str3, String str4) {
            super(MindAccountManagerService.this, a0Var, iAccountManagerResponse, str, z4, z5, str2, z6);
            this.val$accountType = str3;
            this.val$authTokenType = str4;
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x, android.accounts.IAccountAuthenticatorResponse
        public void onResult(Bundle bundle) {
            if (bundle != null) {
                String string = bundle.getString("authTokenLabelKey");
                Bundle bundle2 = new Bundle();
                bundle2.putString("authTokenLabelKey", string);
                super.onResult(bundle2);
                return;
            }
            super.onResult(bundle);
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x
        public void run() throws RemoteException {
            this.mAuthenticator.getAuthTokenLabel(this, this.val$authTokenType);
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x
        protected String toDebugString(long j4) {
            return super.toDebugString(j4) + ", getAuthTokenLabel, " + this.val$accountType + ", authTokenType " + this.val$authTokenType;
        }
    }

    /* loaded from: classes.dex */
    class d extends y {
        final /* synthetic */ String val$accountType;
        final /* synthetic */ String val$authTokenType;
        final /* synthetic */ Bundle val$options;
        final /* synthetic */ String[] val$requiredFeatures;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(a0 a0Var, IAccountManagerResponse iAccountManagerResponse, String str, boolean z4, String str2, boolean z5, boolean z6, boolean z7, String str3, String[] strArr, Bundle bundle, String str4) {
            super(a0Var, iAccountManagerResponse, str, z4, str2, z5, z6, z7);
            this.val$authTokenType = str3;
            this.val$requiredFeatures = strArr;
            this.val$options = bundle;
            this.val$accountType = str4;
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x
        public void run() throws RemoteException {
            this.mAuthenticator.startAddAccountSession(this, this.mAccountType, this.val$authTokenType, this.val$requiredFeatures, this.val$options);
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x
        protected String toDebugString(long j4) {
            String join = TextUtils.join(",", this.val$requiredFeatures);
            StringBuilder sb = new StringBuilder();
            sb.append(super.toDebugString(j4));
            sb.append(", startAddAccountSession, accountType ");
            sb.append(this.val$accountType);
            sb.append(", requiredFeatures ");
            if (this.val$requiredFeatures == null) {
                join = null;
            }
            sb.append(join);
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    class e extends y {
        final /* synthetic */ Account val$account;
        final /* synthetic */ String val$authTokenType;
        final /* synthetic */ Bundle val$loginOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(a0 a0Var, IAccountManagerResponse iAccountManagerResponse, String str, boolean z4, String str2, boolean z5, boolean z6, boolean z7, Account account, String str3, Bundle bundle) {
            super(a0Var, iAccountManagerResponse, str, z4, str2, z5, z6, z7);
            this.val$account = account;
            this.val$authTokenType = str3;
            this.val$loginOptions = bundle;
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x
        public void run() throws RemoteException {
            this.mAuthenticator.startUpdateCredentialsSession(this, this.val$account, this.val$authTokenType, this.val$loginOptions);
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x
        protected String toDebugString(long j4) {
            Bundle bundle = this.val$loginOptions;
            if (bundle != null) {
                bundle.keySet();
            }
            return super.toDebugString(j4) + ", startUpdateCredentialsSession, " + this.val$account + ", authTokenType " + this.val$authTokenType + ", loginOptions " + this.val$loginOptions;
        }
    }

    /* loaded from: classes.dex */
    class f extends x {
        final /* synthetic */ String val$accountType;
        final /* synthetic */ Bundle val$decryptedBundle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(a0 a0Var, IAccountManagerResponse iAccountManagerResponse, String str, boolean z4, boolean z5, String str2, boolean z6, boolean z7, Bundle bundle, String str3) {
            super(a0Var, iAccountManagerResponse, str, z4, z5, str2, z6, z7);
            this.val$decryptedBundle = bundle;
            this.val$accountType = str3;
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x
        public void run() throws RemoteException {
            this.mAuthenticator.finishSession(this, this.mAccountType, this.val$decryptedBundle);
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x
        protected String toDebugString(long j4) {
            return super.toDebugString(j4) + ", finishSession, accountType " + this.val$accountType;
        }
    }

    /* loaded from: classes.dex */
    class g extends x {
        final /* synthetic */ Account val$account;
        final /* synthetic */ String val$statusToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(a0 a0Var, IAccountManagerResponse iAccountManagerResponse, String str, boolean z4, boolean z5, String str2, boolean z6, Account account, String str3) {
            super(MindAccountManagerService.this, a0Var, iAccountManagerResponse, str, z4, z5, str2, z6);
            this.val$account = account;
            this.val$statusToken = str3;
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x, android.accounts.IAccountAuthenticatorResponse
        public void onResult(Bundle bundle) {
            IAccountManagerResponse responseAndClose = getResponseAndClose();
            if (responseAndClose == null) {
                return;
            }
            if (bundle == null) {
                MindAccountManagerService.this.sendErrorResponse(responseAndClose, 5, "null bundle");
                return;
            }
            if (com.xinzhu.overmind.utils.n.g(MindAccountManagerService.TAG, 2)) {
                com.xinzhu.overmind.utils.n.i(MindAccountManagerService.TAG, getClass().getSimpleName() + " calling onResult() on response " + responseAndClose);
            }
            if (bundle.getInt(MediationConstant.KEY_ERROR_CODE, -1) > 0) {
                MindAccountManagerService.this.sendErrorResponse(responseAndClose, bundle.getInt(MediationConstant.KEY_ERROR_CODE), bundle.getString("errorMessage"));
            } else if (!bundle.containsKey("booleanResult")) {
                MindAccountManagerService.this.sendErrorResponse(responseAndClose, 5, "no result in response");
            } else {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("booleanResult", bundle.getBoolean("booleanResult", false));
                MindAccountManagerService.this.sendResponse(responseAndClose, bundle2);
            }
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x
        public void run() throws RemoteException {
            this.mAuthenticator.isCredentialsUpdateSuggested(this, this.val$account, this.val$statusToken);
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x
        protected String toDebugString(long j4) {
            return super.toDebugString(j4) + ", isCredentialsUpdateSuggested, " + this.val$account;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h extends IAccountAuthenticatorResponse.Stub {
        final /* synthetic */ Account val$account;
        final /* synthetic */ RemoteCallback val$callback;
        final /* synthetic */ String val$packageName;
        final /* synthetic */ int val$uid;

        h(Account account, int i4, String str, RemoteCallback remoteCallback) {
            this.val$account = account;
            this.val$uid = i4;
            this.val$packageName = str;
            this.val$callback = remoteCallback;
        }

        private void handleAuthenticatorResponse(boolean z4) {
            MindAccountManagerService mindAccountManagerService = MindAccountManagerService.this;
            mindAccountManagerService.cancelNotification(mindAccountManagerService.getCredentialPermissionNotificationId(this.val$account, MindAccountManagerService.ACCOUNT_ACCESS_TOKEN_TYPE, this.val$uid), this.val$packageName, MindUserHandle.j(this.val$uid));
            if (this.val$callback != null) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("booleanResult", z4);
                this.val$callback.sendResult(bundle);
            }
        }

        @Override // android.accounts.IAccountAuthenticatorResponse
        public void onError(int i4, String str) {
            handleAuthenticatorResponse(false);
        }

        @Override // android.accounts.IAccountAuthenticatorResponse
        public void onRequestContinued() {
        }

        @Override // android.accounts.IAccountAuthenticatorResponse
        public void onResult(Bundle bundle) {
            handleAuthenticatorResponse(true);
        }
    }

    /* loaded from: classes.dex */
    class i implements com.xinzhu.overmind.server.user.b {
        i() {
        }

        @Override // com.xinzhu.overmind.server.user.b
        public void a(int i4) {
            MindAccountManagerService.this.purgeUserData(i4);
        }

        @Override // com.xinzhu.overmind.server.user.b
        public void b(int i4) {
        }

        @Override // com.xinzhu.overmind.server.user.b
        public void c(int i4) {
        }
    }

    /* loaded from: classes.dex */
    class j implements com.xinzhu.overmind.server.pm.k {

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f67859b;

            a(String str) {
                this.f67859b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                MindAccountManagerService.this.purgeOldGrantsAll();
                MindAccountManagerService.this.removeVisibilityValuesForPackage(this.f67859b);
            }
        }

        j() {
        }

        @Override // com.xinzhu.overmind.server.pm.k
        public void a(String str, int i4) {
            MindAccountManagerService.this.mHandler.post(new a(str));
        }

        @Override // com.xinzhu.overmind.server.pm.k
        public void b(String str, int i4) {
        }

        @Override // com.xinzhu.overmind.server.pm.k
        public void c(String str, int i4) {
        }
    }

    /* loaded from: classes.dex */
    class k extends IAccountManagerResponse.Stub {
        final /* synthetic */ String val$opPackageName;
        final /* synthetic */ IAccountManagerResponse val$response;

        k(IAccountManagerResponse iAccountManagerResponse, String str) {
            this.val$response = iAccountManagerResponse;
            this.val$opPackageName = str;
        }

        @Override // android.accounts.IAccountManagerResponse
        public void onError(int i4, String str) {
        }

        @Override // android.accounts.IAccountManagerResponse
        public void onResult(Bundle bundle) {
            Parcelable[] parcelableArray = bundle.getParcelableArray("accounts");
            Account[] accountArr = new Account[parcelableArray.length];
            for (int i4 = 0; i4 < parcelableArray.length; i4++) {
                accountArr[i4] = (Account) parcelableArray[i4];
            }
            MindAccountManagerService.this.handleGetAccountsResult(this.val$response, accountArr, this.val$opPackageName);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class l extends x {
        final /* synthetic */ Account val$account;
        final /* synthetic */ Bundle val$accountCredentials;
        final /* synthetic */ int val$parentUserId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(a0 a0Var, IAccountManagerResponse iAccountManagerResponse, String str, boolean z4, boolean z5, String str2, boolean z6, Account account, int i4, Bundle bundle) {
            super(MindAccountManagerService.this, a0Var, iAccountManagerResponse, str, z4, z5, str2, z6);
            this.val$account = account;
            this.val$parentUserId = i4;
            this.val$accountCredentials = bundle;
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x, android.accounts.IAccountAuthenticatorResponse
        public void onError(int i4, String str) {
            super.onError(i4, str);
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x, android.accounts.IAccountAuthenticatorResponse
        public void onResult(Bundle bundle) {
            super.onResult(bundle);
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x
        public void run() throws RemoteException {
            for (Account account : MindAccountManagerService.this.getAccounts(this.val$parentUserId, q.a.f73126a)) {
                if (account.equals(this.val$account)) {
                    this.mAuthenticator.addAccountFromCredentials(this, this.val$account, this.val$accountCredentials);
                    return;
                }
            }
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x
        protected String toDebugString(long j4) {
            return super.toDebugString(j4) + ", getAccountCredentialsForClone, " + this.val$account.type;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class m extends x {
        final /* synthetic */ Account val$account;
        final /* synthetic */ IAccountManagerResponse val$response;
        final /* synthetic */ a0 val$toAccounts;
        final /* synthetic */ int val$userFrom;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(a0 a0Var, IAccountManagerResponse iAccountManagerResponse, String str, boolean z4, boolean z5, String str2, boolean z6, Account account, IAccountManagerResponse iAccountManagerResponse2, a0 a0Var2, int i4) {
            super(MindAccountManagerService.this, a0Var, iAccountManagerResponse, str, z4, z5, str2, z6);
            this.val$account = account;
            this.val$response = iAccountManagerResponse2;
            this.val$toAccounts = a0Var2;
            this.val$userFrom = i4;
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x, android.accounts.IAccountAuthenticatorResponse
        public void onResult(Bundle bundle) {
            if (bundle != null && bundle.getBoolean("booleanResult", false)) {
                MindAccountManagerService.this.completeCloningAccount(this.val$response, bundle, this.val$account, this.val$toAccounts, this.val$userFrom);
            } else {
                super.onResult(bundle);
            }
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x
        public void run() throws RemoteException {
            this.mAuthenticator.getAccountCredentialsForCloning(this, this.val$account);
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x
        protected String toDebugString(long j4) {
            return super.toDebugString(j4) + ", getAccountCredentialsForClone, " + this.val$account.type;
        }
    }

    /* loaded from: classes.dex */
    class n extends x {
        final /* synthetic */ Account val$account;
        final /* synthetic */ a0 val$accounts;
        final /* synthetic */ String val$authTokenType;
        final /* synthetic */ String val$callerPkg;
        final /* synthetic */ byte[] val$callerPkgSigDigest;
        final /* synthetic */ int val$callerUid;
        final /* synthetic */ boolean val$customTokens;
        final /* synthetic */ Bundle val$loginOptions;
        final /* synthetic */ boolean val$notifyOnAuthFailure;
        final /* synthetic */ boolean val$permissionGranted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(a0 a0Var, IAccountManagerResponse iAccountManagerResponse, String str, boolean z4, boolean z5, String str2, boolean z6, Bundle bundle, Account account, String str3, boolean z7, boolean z8, int i4, boolean z9, String str4, byte[] bArr, a0 a0Var2) {
            super(MindAccountManagerService.this, a0Var, iAccountManagerResponse, str, z4, z5, str2, z6);
            this.val$loginOptions = bundle;
            this.val$account = account;
            this.val$authTokenType = str3;
            this.val$notifyOnAuthFailure = z7;
            this.val$permissionGranted = z8;
            this.val$callerUid = i4;
            this.val$customTokens = z9;
            this.val$callerPkg = str4;
            this.val$callerPkgSigDigest = bArr;
            this.val$accounts = a0Var2;
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x, android.accounts.IAccountAuthenticatorResponse
        public void onResult(Bundle bundle) {
            if (bundle != null) {
                if (bundle.containsKey("authTokenLabelKey")) {
                    Intent newGrantCredentialsPermissionIntent = MindAccountManagerService.this.newGrantCredentialsPermissionIntent(this.val$account, null, this.val$callerUid, (AccountAuthenticatorResponse) com.xinzhu.haunted.android.accounts.b.b(this).f65698a, this.val$authTokenType, true);
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("intent", newGrantCredentialsPermissionIntent);
                    onResult(bundle2);
                    return;
                }
                String string = bundle.getString("authtoken");
                if (string != null) {
                    String string2 = bundle.getString("authAccount");
                    String string3 = bundle.getString("accountType");
                    if (!TextUtils.isEmpty(string3) && !TextUtils.isEmpty(string2)) {
                        Account account = new Account(string2, string3);
                        if (!this.val$customTokens) {
                            MindAccountManagerService.this.saveAuthTokenToDatabase(this.mAccounts, account, this.val$authTokenType, string);
                        }
                        long j4 = bundle.getLong(MindAccountManagerService.KEY_CUSTOM_TOKEN_EXPIRY, 0L);
                        if (this.val$customTokens && j4 > System.currentTimeMillis()) {
                            MindAccountManagerService.this.saveCachedToken(this.mAccounts, this.val$account, this.val$callerPkg, this.val$callerPkgSigDigest, this.val$authTokenType, string, j4);
                        }
                    } else {
                        onError(5, "the type and name should not be empty");
                        return;
                    }
                }
                Intent intent = (Intent) bundle.getParcelable("intent");
                if (intent != null && this.val$notifyOnAuthFailure && !this.val$customTokens) {
                    if (checkKeyIntent(BinderHelper.b().f67823c, intent)) {
                        MindAccountManagerService.this.doNotification(this.mAccounts, this.val$account, bundle.getString("authFailedMessage"), intent, q.a.f73126a, this.val$accounts.f67844a);
                    } else {
                        onError(5, "invalid intent in bundle returned");
                        return;
                    }
                }
            }
            super.onResult(bundle);
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x
        public void run() throws RemoteException {
            if (!this.val$permissionGranted) {
                this.mAuthenticator.getAuthTokenLabel(this, this.val$authTokenType);
            } else {
                this.mAuthenticator.getAuthToken(this, this.val$account, this.val$authTokenType, this.val$loginOptions);
            }
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x
        protected String toDebugString(long j4) {
            Bundle bundle = this.val$loginOptions;
            if (bundle != null) {
                bundle.keySet();
            }
            return super.toDebugString(j4) + ", getAuthToken, " + this.val$account + ", authTokenType " + this.val$authTokenType + ", loginOptions " + this.val$loginOptions + ", notifyOnAuthFailure " + this.val$notifyOnAuthFailure;
        }
    }

    /* loaded from: classes.dex */
    class o extends x {
        final /* synthetic */ String val$accountType;
        final /* synthetic */ String val$authTokenType;
        final /* synthetic */ Bundle val$options;
        final /* synthetic */ String[] val$requiredFeatures;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(a0 a0Var, IAccountManagerResponse iAccountManagerResponse, String str, boolean z4, boolean z5, String str2, boolean z6, boolean z7, String str3, String[] strArr, Bundle bundle, String str4) {
            super(a0Var, iAccountManagerResponse, str, z4, z5, str2, z6, z7);
            this.val$authTokenType = str3;
            this.val$requiredFeatures = strArr;
            this.val$options = bundle;
            this.val$accountType = str4;
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x
        public void run() throws RemoteException {
            this.mAuthenticator.addAccount(this, this.mAccountType, this.val$authTokenType, this.val$requiredFeatures, this.val$options);
            com.xinzhu.overmind.b.c(MindAccountManagerService.TAG, "session addaccount finish");
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x
        protected String toDebugString(long j4) {
            return super.toDebugString(j4) + ", addAccount, accountType " + this.val$accountType + ", requiredFeatures " + Arrays.toString(this.val$requiredFeatures);
        }
    }

    /* loaded from: classes.dex */
    class p extends x {
        final /* synthetic */ String val$accountType;
        final /* synthetic */ String val$authTokenType;
        final /* synthetic */ Bundle val$options;
        final /* synthetic */ String[] val$requiredFeatures;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(a0 a0Var, IAccountManagerResponse iAccountManagerResponse, String str, boolean z4, boolean z5, String str2, boolean z6, boolean z7, String str3, String[] strArr, Bundle bundle, String str4) {
            super(a0Var, iAccountManagerResponse, str, z4, z5, str2, z6, z7);
            this.val$authTokenType = str3;
            this.val$requiredFeatures = strArr;
            this.val$options = bundle;
            this.val$accountType = str4;
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x
        public void run() throws RemoteException {
            this.mAuthenticator.addAccount(this, this.mAccountType, this.val$authTokenType, this.val$requiredFeatures, this.val$options);
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x
        protected String toDebugString(long j4) {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toDebugString(j4));
            sb.append(", addAccount, accountType ");
            sb.append(this.val$accountType);
            sb.append(", requiredFeatures ");
            String[] strArr = this.val$requiredFeatures;
            sb.append(strArr != null ? TextUtils.join(",", strArr) : null);
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    class q extends x {
        final /* synthetic */ Account val$account;
        final /* synthetic */ String val$authTokenType;
        final /* synthetic */ Bundle val$loginOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(a0 a0Var, IAccountManagerResponse iAccountManagerResponse, String str, boolean z4, boolean z5, String str2, boolean z6, boolean z7, Account account, String str3, Bundle bundle) {
            super(a0Var, iAccountManagerResponse, str, z4, z5, str2, z6, z7);
            this.val$account = account;
            this.val$authTokenType = str3;
            this.val$loginOptions = bundle;
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x
        public void run() throws RemoteException {
            this.mAuthenticator.updateCredentials(this, this.val$account, this.val$authTokenType, this.val$loginOptions);
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x
        protected String toDebugString(long j4) {
            Bundle bundle = this.val$loginOptions;
            if (bundle != null) {
                bundle.keySet();
            }
            return super.toDebugString(j4) + ", updateCredentials, " + this.val$account + ", authTokenType " + this.val$authTokenType + ", loginOptions " + this.val$loginOptions;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class r {

        /* renamed from: a  reason: collision with root package name */
        public Account f67861a;

        /* renamed from: b  reason: collision with root package name */
        public int f67862b;

        public r(Account account, int i4) {
            this.f67861a = account;
            this.f67862b = i4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof r) {
                r rVar = (r) obj;
                return this.f67861a.equals(rVar.f67861a) && this.f67862b == rVar.f67862b;
            }
            return false;
        }

        public int hashCode() {
            return this.f67861a.hashCode() + this.f67862b;
        }

        public String toString() {
            return this.f67861a.toString() + " u" + this.f67862b;
        }
    }

    /* loaded from: classes.dex */
    private class s extends x {
        private volatile Account[] mAccountsOfType;
        private volatile ArrayList<Account> mAccountsWithFeatures;
        private final int mCallingUid;
        private volatile int mCurrentAccount;
        private final String[] mFeatures;
        private final boolean mIncludeManagedNotVisible;
        private final String mPackageName;

        public s(a0 a0Var, IAccountManagerResponse iAccountManagerResponse, String str, String[] strArr, int i4, String str2, boolean z4) {
            super(MindAccountManagerService.this, a0Var, iAccountManagerResponse, str, false, true, null, false);
            this.mAccountsOfType = null;
            this.mAccountsWithFeatures = null;
            this.mCurrentAccount = 0;
            this.mCallingUid = i4;
            this.mFeatures = strArr;
            this.mPackageName = str2;
            this.mIncludeManagedNotVisible = z4;
        }

        public void checkAccount() {
            if (this.mCurrentAccount >= this.mAccountsOfType.length) {
                sendResult();
                return;
            }
            IAccountAuthenticator iAccountAuthenticator = this.mAuthenticator;
            if (iAccountAuthenticator == null) {
                if (com.xinzhu.overmind.utils.n.g(MindAccountManagerService.TAG, 2)) {
                    com.xinzhu.overmind.utils.n.i(MindAccountManagerService.TAG, "checkAccount: aborting session since we are no longer connected to the authenticator, " + toDebugString());
                    return;
                }
                return;
            }
            try {
                iAccountAuthenticator.hasFeatures(this, this.mAccountsOfType[this.mCurrentAccount], this.mFeatures);
            } catch (RemoteException unused) {
                onError(1, "remote exception");
            }
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x, android.accounts.IAccountAuthenticatorResponse
        public void onResult(Bundle bundle) {
            this.mNumResults++;
            if (bundle == null) {
                onError(5, "null bundle");
                return;
            }
            if (bundle.getBoolean("booleanResult", false)) {
                this.mAccountsWithFeatures.add(this.mAccountsOfType[this.mCurrentAccount]);
            }
            this.mCurrentAccount++;
            checkAccount();
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x
        public void run() throws RemoteException {
            this.mAccountsOfType = MindAccountManagerService.this.getAccountsFromCache(this.mAccounts, this.mAccountType, this.mCallingUid, this.mPackageName, this.mIncludeManagedNotVisible);
            this.mAccountsWithFeatures = new ArrayList<>(this.mAccountsOfType.length);
            this.mCurrentAccount = 0;
            checkAccount();
        }

        public void sendResult() {
            IAccountManagerResponse responseAndClose = getResponseAndClose();
            if (responseAndClose != null) {
                try {
                    int size = this.mAccountsWithFeatures.size();
                    Account[] accountArr = new Account[size];
                    for (int i4 = 0; i4 < size; i4++) {
                        accountArr[i4] = this.mAccountsWithFeatures.get(i4);
                    }
                    if (com.xinzhu.overmind.utils.n.g(MindAccountManagerService.TAG, 2)) {
                        com.xinzhu.overmind.utils.n.i(MindAccountManagerService.TAG, getClass().getSimpleName() + " calling onResult() on response " + responseAndClose);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putParcelableArray("accounts", accountArr);
                    responseAndClose.onResult(bundle);
                } catch (RemoteException e5) {
                    if (com.xinzhu.overmind.utils.n.g(MindAccountManagerService.TAG, 2)) {
                        com.xinzhu.overmind.utils.n.j(MindAccountManagerService.TAG, "failure while notifying response", e5);
                    }
                }
            }
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x
        protected String toDebugString(long j4) {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toDebugString(j4));
            sb.append(", getAccountsByTypeAndFeatures, ");
            String[] strArr = this.mFeatures;
            sb.append(strArr != null ? TextUtils.join(",", strArr) : null);
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class t extends Handler {
        t(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 3) {
                ((x) message.obj).onTimedOut();
            } else if (i4 == 4) {
                MindAccountManagerService.this.copyAccountToUser(null, (Account) message.obj, message.arg1, message.arg2);
            } else {
                throw new IllegalStateException("unhandled message: " + message.what);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class u {

        /* renamed from: a  reason: collision with root package name */
        final String f67864a;

        /* renamed from: b  reason: collision with root package name */
        private final int f67865b;

        u(String str, int i4) {
            this.f67864a = str;
            this.f67865b = i4;
        }
    }

    /* loaded from: classes.dex */
    public interface v {
        void a(Account account, int i4);
    }

    /* loaded from: classes.dex */
    private class w extends x {
        final Account mAccount;

        public w(a0 a0Var, IAccountManagerResponse iAccountManagerResponse, Account account, boolean z4) {
            super(MindAccountManagerService.this, a0Var, iAccountManagerResponse, account.type, z4, true, account.name, false);
            this.mAccount = account;
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x, android.accounts.IAccountAuthenticatorResponse
        public void onResult(Bundle bundle) {
            if (bundle != null && bundle.containsKey("booleanResult") && !bundle.containsKey("intent")) {
                if (bundle.getBoolean("booleanResult")) {
                    MindAccountManagerService.this.removeAccountInternal(this.mAccounts, this.mAccount, Binder.getCallingUid());
                }
                IAccountManagerResponse responseAndClose = getResponseAndClose();
                if (responseAndClose != null) {
                    if (com.xinzhu.overmind.utils.n.g(MindAccountManagerService.TAG, 2)) {
                        com.xinzhu.overmind.utils.n.i(MindAccountManagerService.TAG, getClass().getSimpleName() + " calling onResult() on response " + responseAndClose);
                    }
                    try {
                        responseAndClose.onResult(bundle);
                    } catch (RemoteException e5) {
                        com.xinzhu.overmind.utils.v.d(MindAccountManagerService.TAG, "Error calling onResult()", e5);
                    }
                }
            }
            super.onResult(bundle);
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x
        public void run() throws RemoteException {
            this.mAuthenticator.getAccountRemovalAllowed(this, this.mAccount);
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x
        protected String toDebugString(long j4) {
            return super.toDebugString(j4) + ", removeAccount, account " + this.mAccount;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public abstract class x extends IAccountAuthenticatorResponse.Stub implements IBinder.DeathRecipient, ServiceConnection {
        final String mAccountName;
        final String mAccountType;
        protected final a0 mAccounts;
        final boolean mAuthDetailsRequired;
        IAccountAuthenticator mAuthenticator;
        final long mCreationTime;
        final boolean mExpectActivityLaunch;
        private int mNumErrors;
        private int mNumRequestContinued;
        public int mNumResults;
        IAccountManagerResponse mResponse;
        private final boolean mStripAuthTokenFromResult;
        final boolean mUpdateLastAuthenticatedTime;

        public x(MindAccountManagerService mindAccountManagerService, a0 a0Var, IAccountManagerResponse iAccountManagerResponse, String str, boolean z4, boolean z5, String str2, boolean z6) {
            this(a0Var, iAccountManagerResponse, str, z4, z5, str2, z6, false);
        }

        private boolean bindToAuthenticator(String str) {
            m.d<AuthenticatorDescription> d5 = MindAccountManagerService.this.mAuthenticatorCache.d(AuthenticatorDescription.newKey(str), this.mAccounts.f67844a);
            if (d5 == null) {
                if (com.xinzhu.overmind.utils.n.g(MindAccountManagerService.TAG, 2)) {
                    com.xinzhu.overmind.utils.n.i(MindAccountManagerService.TAG, "there is no authenticator for " + str + ", bailing out");
                }
                return false;
            }
            Intent intent = new Intent();
            intent.setAction("android.accounts.AccountAuthenticator");
            intent.setComponent(d5.f68224c);
            if (com.xinzhu.overmind.utils.n.g(MindAccountManagerService.TAG, 2)) {
                com.xinzhu.overmind.utils.n.i(MindAccountManagerService.TAG, "performing bindService to " + d5.f68224c);
            }
            try {
                MindAccountManagerService.this.mContext.bindService(com.xinzhu.overmind.server.am.f.get().bindService(intent, this, intent.resolveTypeIfNeeded(Overmind.getContext().getContentResolver()), this.mAccounts.f67844a, 0), this, 1);
                return true;
            } catch (RemoteException unused) {
                if (com.xinzhu.overmind.utils.n.g(MindAccountManagerService.TAG, 2)) {
                    com.xinzhu.overmind.utils.n.i(MindAccountManagerService.TAG, "bindService to " + d5.f68224c + " failed");
                }
                return false;
            }
        }

        private void close() {
            synchronized (MindAccountManagerService.this.mSessions) {
                if (MindAccountManagerService.this.mSessions.remove(toString()) == null) {
                    return;
                }
                IAccountManagerResponse iAccountManagerResponse = this.mResponse;
                if (iAccountManagerResponse != null) {
                    iAccountManagerResponse.asBinder().unlinkToDeath(this, 0);
                    this.mResponse = null;
                }
                cancelTimeout();
                unbind();
            }
        }

        private void unbind() {
            if (this.mAuthenticator != null) {
                this.mAuthenticator = null;
                try {
                    com.xinzhu.overmind.server.am.f.get().unbindService(this, MindUserHandle.k(1000));
                    MindAccountManagerService.this.mContext.unbindService(this);
                } catch (RemoteException unused) {
                }
            }
        }

        void bind() {
            if (com.xinzhu.overmind.utils.n.g(MindAccountManagerService.TAG, 2)) {
                com.xinzhu.overmind.utils.n.i(MindAccountManagerService.TAG, "initiating bind to authenticator type " + this.mAccountType);
            }
            if (bindToAuthenticator(this.mAccountType)) {
                return;
            }
            com.xinzhu.overmind.utils.n.a(MindAccountManagerService.TAG, "bind attempt failed for " + toDebugString());
            onError(1, "bind failure");
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            this.mResponse = null;
            close();
        }

        public void cancelTimeout() {
            MindAccountManagerService.this.mHandler.removeMessages(3, this);
        }

        protected boolean checkKeyIntent(int i4, Intent intent) {
            if (intent.getClipData() == null) {
                intent.setClipData(ClipData.newPlainText(null, null));
            }
            intent.setFlags(intent.getFlags() & (-196));
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                com.xinzhu.overmind.server.pm.i iVar = com.xinzhu.overmind.server.pm.i.get();
                ResolveInfo resolveActivity = iVar.resolveActivity(intent, 0, intent.resolveTypeIfNeeded(Overmind.getContext().getContentResolver()), this.mAccounts.f67844a);
                if (resolveActivity == null) {
                    return false;
                }
                ActivityInfo activityInfo = resolveActivity.activityInfo;
                if (iVar.hasSignatureCapability(activityInfo.applicationInfo.uid, i4, 16)) {
                    return true;
                }
                com.xinzhu.overmind.utils.n.c(MindAccountManagerService.TAG, String.format("KEY_INTENT resolved to an Activity (%s) in a package (%s) that does not share a signature with the supplying authenticator (%s).", activityInfo.name, activityInfo.packageName, this.mAccountType));
                return false;
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        IAccountManagerResponse getResponseAndClose() {
            IAccountManagerResponse iAccountManagerResponse = this.mResponse;
            if (iAccountManagerResponse == null) {
                return null;
            }
            close();
            return iAccountManagerResponse;
        }

        public void onError(int i4, String str) {
            this.mNumErrors++;
            IAccountManagerResponse responseAndClose = getResponseAndClose();
            if (responseAndClose != null) {
                if (com.xinzhu.overmind.utils.n.g(MindAccountManagerService.TAG, 2)) {
                    com.xinzhu.overmind.utils.n.i(MindAccountManagerService.TAG, getClass().getSimpleName() + " calling onError() on response " + responseAndClose);
                }
                try {
                    responseAndClose.onError(i4, str);
                } catch (RemoteException e5) {
                    if (com.xinzhu.overmind.utils.n.g(MindAccountManagerService.TAG, 2)) {
                        com.xinzhu.overmind.utils.n.j(MindAccountManagerService.TAG, "Session.onError: caught RemoteException while responding", e5);
                    }
                }
            } else if (com.xinzhu.overmind.utils.n.g(MindAccountManagerService.TAG, 2)) {
                com.xinzhu.overmind.utils.n.i(MindAccountManagerService.TAG, "Session.onError: already closed");
            }
        }

        @Override // android.accounts.IAccountAuthenticatorResponse
        public void onRequestContinued() {
            this.mNumRequestContinued++;
        }

        public void onResult(Bundle bundle) {
            Intent intent;
            IAccountManagerResponse responseAndClose;
            MindAccount mindAccount;
            boolean z4 = true;
            this.mNumResults++;
            if (bundle != null) {
                boolean z5 = bundle.getBoolean("booleanResult", false);
                boolean z6 = bundle.containsKey("authAccount") && bundle.containsKey("accountType");
                if (!this.mUpdateLastAuthenticatedTime || (!z5 && !z6)) {
                    z4 = false;
                }
                if (z4 || this.mAuthDetailsRequired) {
                    boolean isAccountPresentForCaller = MindAccountManagerService.this.isAccountPresentForCaller(this.mAccountName, this.mAccountType);
                    if (z4 && isAccountPresentForCaller) {
                        MindAccountManagerService.this.updateLastAuthenticatedTime(new Account(this.mAccountName, this.mAccountType));
                    }
                    if (this.mAuthDetailsRequired) {
                        long j4 = -1;
                        if (isAccountPresentForCaller && (mindAccount = (MindAccount) this.mAccounts.f67846c.get(new Account(this.mAccountName, this.mAccountType))) != null) {
                            j4 = mindAccount.f67840d;
                        }
                        bundle.putLong(MindAccountManagerService.KEY_LAST_AUTHENTICATED_TIME, j4);
                    }
                }
            }
            if (bundle != null) {
                intent = (Intent) bundle.getParcelable("intent");
                if (intent != null) {
                    if (!checkKeyIntent(BinderHelper.b().f67823c, intent)) {
                        onError(5, "invalid intent in bundle returned");
                        return;
                    }
                    PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(TypedValues.AttributesType.S_TARGET);
                }
            } else {
                intent = null;
            }
            if (bundle != null && !TextUtils.isEmpty(bundle.getString("authtoken"))) {
                String string = bundle.getString("authAccount");
                String string2 = bundle.getString("accountType");
                if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                    Account account = new Account(string, string2);
                    MindAccountManagerService mindAccountManagerService = MindAccountManagerService.this;
                    mindAccountManagerService.cancelNotification(mindAccountManagerService.getSigninRequiredNotificationId(this.mAccounts, account), new MindUserHandle(this.mAccounts.f67844a));
                }
            }
            if (this.mExpectActivityLaunch && bundle != null && bundle.containsKey("intent")) {
                responseAndClose = this.mResponse;
            } else {
                responseAndClose = getResponseAndClose();
            }
            if (responseAndClose != null) {
                try {
                    if (bundle == null) {
                        if (com.xinzhu.overmind.utils.n.g(MindAccountManagerService.TAG, 2)) {
                            com.xinzhu.overmind.utils.n.i(MindAccountManagerService.TAG, getClass().getSimpleName() + " calling onError() on response " + responseAndClose);
                        }
                        responseAndClose.onError(5, "null bundle returned");
                        return;
                    }
                    if (this.mStripAuthTokenFromResult) {
                        bundle.remove("authtoken");
                    }
                    if (com.xinzhu.overmind.utils.n.g(MindAccountManagerService.TAG, 2)) {
                        com.xinzhu.overmind.utils.n.i(MindAccountManagerService.TAG, getClass().getSimpleName() + " calling onResult() on response " + responseAndClose);
                    }
                    if (bundle.getInt(MediationConstant.KEY_ERROR_CODE, -1) > 0 && intent == null) {
                        responseAndClose.onError(bundle.getInt(MediationConstant.KEY_ERROR_CODE), bundle.getString("errorMessage"));
                    } else {
                        responseAndClose.onResult(bundle);
                    }
                } catch (RemoteException e5) {
                    if (com.xinzhu.overmind.utils.n.g(MindAccountManagerService.TAG, 2)) {
                        com.xinzhu.overmind.utils.n.j(MindAccountManagerService.TAG, "failure while notifying response", e5);
                    }
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.mAuthenticator = IAccountAuthenticator.Stub.asInterface(iBinder);
            try {
                run();
            } catch (RemoteException unused) {
                onError(1, "remote exception");
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            this.mAuthenticator = null;
            IAccountManagerResponse responseAndClose = getResponseAndClose();
            if (responseAndClose != null) {
                try {
                    responseAndClose.onError(1, NetworkUtil.NETWORK_CLASS_DISCONNECTED);
                } catch (RemoteException e5) {
                    if (com.xinzhu.overmind.utils.n.g(MindAccountManagerService.TAG, 2)) {
                        com.xinzhu.overmind.utils.n.j(MindAccountManagerService.TAG, "Session.onServiceDisconnected: caught RemoteException while responding", e5);
                    }
                }
            }
        }

        public void onTimedOut() {
            IAccountManagerResponse responseAndClose = getResponseAndClose();
            if (responseAndClose != null) {
                try {
                    responseAndClose.onError(1, "timeout");
                } catch (RemoteException e5) {
                    if (com.xinzhu.overmind.utils.n.g(MindAccountManagerService.TAG, 2)) {
                        com.xinzhu.overmind.utils.n.j(MindAccountManagerService.TAG, "Session.onTimedOut: caught RemoteException while responding", e5);
                    }
                }
            }
        }

        public abstract void run() throws RemoteException;

        protected String toDebugString() {
            return toDebugString(SystemClock.elapsedRealtime());
        }

        public x(a0 a0Var, IAccountManagerResponse iAccountManagerResponse, String str, boolean z4, boolean z5, String str2, boolean z6, boolean z7) {
            this.mNumResults = 0;
            this.mNumRequestContinued = 0;
            this.mNumErrors = 0;
            this.mAuthenticator = null;
            if (str != null) {
                this.mAccounts = a0Var;
                this.mStripAuthTokenFromResult = z5;
                this.mResponse = iAccountManagerResponse;
                this.mAccountType = str;
                this.mExpectActivityLaunch = z4;
                this.mCreationTime = SystemClock.elapsedRealtime();
                this.mAccountName = str2;
                this.mAuthDetailsRequired = z6;
                this.mUpdateLastAuthenticatedTime = z7;
                synchronized (MindAccountManagerService.this.mSessions) {
                    MindAccountManagerService.this.mSessions.put(toString(), this);
                }
                if (iAccountManagerResponse != null) {
                    try {
                        iAccountManagerResponse.asBinder().linkToDeath(this, 0);
                        return;
                    } catch (RemoteException unused) {
                        this.mResponse = null;
                        binderDied();
                        return;
                    }
                }
                return;
            }
            throw new IllegalArgumentException("accountType is null");
        }

        protected String toDebugString(long j4) {
            StringBuilder sb = new StringBuilder();
            sb.append("Session: expectLaunch ");
            sb.append(this.mExpectActivityLaunch);
            sb.append(", connected ");
            sb.append(this.mAuthenticator != null);
            sb.append(", stats (");
            sb.append(this.mNumResults);
            sb.append(net.lingala.zip4j.util.e.F0);
            sb.append(this.mNumRequestContinued);
            sb.append(net.lingala.zip4j.util.e.F0);
            sb.append(this.mNumErrors);
            sb.append("), lifetime ");
            double d5 = j4 - this.mCreationTime;
            Double.isNaN(d5);
            sb.append(d5 / 1000.0d);
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    private abstract class y extends x {
        private final boolean mIsPasswordForwardingAllowed;

        public y(a0 a0Var, IAccountManagerResponse iAccountManagerResponse, String str, boolean z4, String str2, boolean z5, boolean z6, boolean z7) {
            super(a0Var, iAccountManagerResponse, str, z4, true, str2, z5, z6);
            this.mIsPasswordForwardingAllowed = z7;
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x, android.accounts.IAccountAuthenticatorResponse
        public void onResult(Bundle bundle) {
            Intent intent;
            IAccountManagerResponse responseAndClose;
            this.mNumResults++;
            if (bundle != null) {
                intent = (Intent) bundle.getParcelable("intent");
                if (intent != null && !checkKeyIntent(BinderHelper.b().f67823c, intent)) {
                    onError(5, "invalid intent in bundle returned");
                    return;
                }
            } else {
                intent = null;
            }
            if (this.mExpectActivityLaunch && bundle != null && bundle.containsKey("intent")) {
                responseAndClose = this.mResponse;
            } else {
                responseAndClose = getResponseAndClose();
            }
            if (responseAndClose == null) {
                return;
            }
            if (bundle == null) {
                if (com.xinzhu.overmind.utils.n.g(MindAccountManagerService.TAG, 2)) {
                    com.xinzhu.overmind.utils.n.i(MindAccountManagerService.TAG, getClass().getSimpleName() + " calling onError() on response " + responseAndClose);
                }
                MindAccountManagerService.this.sendErrorResponse(responseAndClose, 5, "null bundle returned");
            } else if (bundle.getInt(MediationConstant.KEY_ERROR_CODE, -1) > 0 && intent == null) {
                MindAccountManagerService.this.sendErrorResponse(responseAndClose, bundle.getInt(MediationConstant.KEY_ERROR_CODE), bundle.getString("errorMessage"));
            } else {
                if (!this.mIsPasswordForwardingAllowed) {
                    bundle.remove(GameRoomActivity_.f38656u3);
                }
                bundle.remove("authtoken");
                if (com.xinzhu.overmind.utils.n.g(MindAccountManagerService.TAG, 2)) {
                    com.xinzhu.overmind.utils.n.i(MindAccountManagerService.TAG, getClass().getSimpleName() + " calling onResult() on response " + responseAndClose);
                }
                Bundle bundle2 = bundle.getBundle(MindAccountManagerService.KEY_ACCOUNT_SESSION_BUNDLE);
                if (bundle2 != null) {
                    String string = bundle2.getString("accountType");
                    if (TextUtils.isEmpty(string) || !this.mAccountType.equalsIgnoreCase(string)) {
                        com.xinzhu.overmind.utils.n.k(MindAccountManagerService.TAG, "Account type in session bundle doesn't match request.");
                    }
                    bundle2.putString("accountType", this.mAccountType);
                    try {
                        bundle.putBundle(MindAccountManagerService.KEY_ACCOUNT_SESSION_BUNDLE, com.xinzhu.overmind.server.accounts.c.e().d(bundle2));
                    } catch (GeneralSecurityException e5) {
                        if (com.xinzhu.overmind.utils.n.g(MindAccountManagerService.TAG, 3)) {
                            com.xinzhu.overmind.utils.n.j(MindAccountManagerService.TAG, "Failed to encrypt session bundle!", e5);
                        }
                        MindAccountManagerService.this.sendErrorResponse(responseAndClose, 5, "failed to encrypt session bundle");
                        return;
                    }
                }
                MindAccountManagerService.this.sendResponse(responseAndClose, bundle);
            }
        }
    }

    /* loaded from: classes.dex */
    private class z extends x {
        private final Account mAccount;
        private final String[] mFeatures;

        public z(a0 a0Var, IAccountManagerResponse iAccountManagerResponse, Account account, String[] strArr) {
            super(MindAccountManagerService.this, a0Var, iAccountManagerResponse, account.type, false, true, account.name, false);
            this.mFeatures = strArr;
            this.mAccount = account;
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x, android.accounts.IAccountAuthenticatorResponse
        public void onResult(Bundle bundle) {
            IAccountManagerResponse responseAndClose = getResponseAndClose();
            if (responseAndClose != null) {
                try {
                    if (bundle == null) {
                        responseAndClose.onError(5, "null bundle");
                        return;
                    }
                    if (com.xinzhu.overmind.utils.n.g(MindAccountManagerService.TAG, 2)) {
                        com.xinzhu.overmind.utils.n.i(MindAccountManagerService.TAG, getClass().getSimpleName() + " calling onResult() on response " + responseAndClose);
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("booleanResult", bundle.getBoolean("booleanResult", false));
                    responseAndClose.onResult(bundle2);
                } catch (RemoteException e5) {
                    if (com.xinzhu.overmind.utils.n.g(MindAccountManagerService.TAG, 2)) {
                        com.xinzhu.overmind.utils.n.j(MindAccountManagerService.TAG, "failure while notifying response", e5);
                    }
                }
            }
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x
        public void run() throws RemoteException {
            try {
                this.mAuthenticator.hasFeatures(this, this.mAccount, this.mFeatures);
            } catch (RemoteException unused) {
                onError(1, "remote exception");
            }
        }

        @Override // com.xinzhu.overmind.server.accounts.MindAccountManagerService.x
        protected String toDebugString(long j4) {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toDebugString(j4));
            sb.append(", hasFeatures, ");
            sb.append(this.mAccount);
            sb.append(", ");
            String[] strArr = this.mFeatures;
            sb.append(strArr != null ? TextUtils.join(",", strArr) : null);
            return sb.toString();
        }
    }

    public MindAccountManagerService() {
        i iVar = new i();
        this.mUserListener = iVar;
        j jVar = new j();
        this.mPackageMonitor = jVar;
        this.mAuthenticatorCache = new com.xinzhu.overmind.server.accounts.a(Overmind.getContext());
        com.xinzhu.overmind.server.j jVar2 = new com.xinzhu.overmind.server.j(TAG, -2, true);
        jVar2.start();
        this.mHandler = new t(jVar2.getLooper());
        com.xinzhu.overmind.server.user.c.get().registerListener(iVar);
        com.xinzhu.overmind.server.pm.i.get().addPackageMonitor(jVar);
    }

    private boolean accountExistsCache(a0 a0Var, Account account) {
        Account[] accountArr;
        synchronized (a0Var.f67846c) {
            if (a0Var.f67849f.containsKey(account.type) && (accountArr = a0Var.f67849f.get(account.type)) != null) {
                for (Account account2 : accountArr) {
                    if (account2.name.equals(account.name)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    private boolean accountTypeManagesContacts(String str, int i4) {
        if (str == null) {
            return false;
        }
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            Collection<m.d<AuthenticatorDescription>> e5 = this.mAuthenticatorCache.e(i4);
            Binder.restoreCallingIdentity(clearCallingIdentity);
            for (m.d<AuthenticatorDescription> dVar : e5) {
                if (str.equals(dVar.f68222a.type)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    private boolean addAccountInternal(a0 a0Var, Account account, String str, Bundle bundle, int i4, Map<String, Integer> map) {
        if (account == null) {
            return false;
        }
        synchronized (a0Var.f67845b) {
            MindAccount mindAccount = new MindAccount(account);
            if (a0Var.f67846c.containsKey(account)) {
                com.xinzhu.overmind.utils.n.k(TAG, "insertAccountIntoDatabase: " + account + ", skipping since the account already exists");
                return false;
            }
            mindAccount.f67839c = str;
            a0Var.f67846c.put(account, mindAccount);
            saveAccountDataLocked(a0Var);
            if (bundle != null) {
                HashMap hashMap = new HashMap();
                for (String str2 : bundle.keySet()) {
                    hashMap.put(str2, bundle.getString(str2));
                }
                a0Var.f67850g.put(account, hashMap);
                saveAccountUserDataLocked(a0Var);
            }
            if (map != null) {
                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    setAccountVisibility(account, entry.getKey(), entry.getValue().intValue(), false, a0Var);
                }
            }
            insertAccountIntoCacheLocked(a0Var, account);
            sendNotificationAccountUpdated(account, a0Var);
            sendAccountsChangedBroadcast(a0Var.f67844a);
            return true;
        }
    }

    private byte[] calculatePackageSignatureDigest(String str) {
        MessageDigest messageDigest;
        int i4;
        PackageInfo packageInfo;
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
            packageInfo = com.xinzhu.overmind.server.pm.i.get().getPackageInfo(str, 64, 0);
        } catch (NoSuchAlgorithmException e5) {
            com.xinzhu.overmind.utils.n.o(TAG, "SHA-256 should be available", e5);
            messageDigest = null;
        }
        if (packageInfo == null) {
            com.xinzhu.overmind.utils.n.k(TAG, "Could not find packageinfo for: " + str);
            return null;
        }
        for (Signature signature : packageInfo.signatures) {
            messageDigest.update(signature.toByteArray());
        }
        if (messageDigest == null) {
            return null;
        }
        return messageDigest.digest();
    }

    private boolean canUserModifyAccounts(int i4, int i5) {
        return MindUserHandle.k(i5) == i4;
    }

    private boolean canUserModifyAccountsForType(int i4, String str, int i5) {
        return MindUserHandle.k(i5) == i4;
    }

    private void cancelAccountAccessRequestNotificationIfNeeded(int i4, boolean z4) {
        for (Account account : getAccountsAsUser(null, MindUserHandle.k(i4), q.a.f73126a)) {
            cancelAccountAccessRequestNotificationIfNeeded(account, i4, z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelNotification(u uVar, MindUserHandle mindUserHandle) {
        cancelNotification(uVar, Overmind.getContext().getPackageName(), mindUserHandle);
    }

    private int checkPackageSignature(String str, int i4, int i5) {
        if (str == null) {
            return 0;
        }
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            Collection<m.d<AuthenticatorDescription>> e5 = this.mAuthenticatorCache.e(i5);
            Binder.restoreCallingIdentity(clearCallingIdentity);
            for (m.d<AuthenticatorDescription> dVar : e5) {
                if (str.equals(dVar.f68222a.type)) {
                    if (dVar.f68225d == i4) {
                        return 2;
                    }
                    if (com.xinzhu.overmind.server.pm.i.get().hasSignatureCapability(dVar.f68225d, i4, 16)) {
                        return 1;
                    }
                }
            }
            return 0;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    private void checkReadAccountsPermitted(int i4, String str, int i5, String str2) {
        if (isAccountVisibleToCaller(str, i4, i5, str2)) {
            return;
        }
        String format = String.format("caller uid %s cannot access %s accounts", Integer.valueOf(i4), str);
        com.xinzhu.overmind.utils.n.k(TAG, "  " + format);
        throw new SecurityException(format);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void completeCloningAccount(IAccountManagerResponse iAccountManagerResponse, Bundle bundle, Account account, a0 a0Var, int i4) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            new l(a0Var, iAccountManagerResponse, account.type, false, false, account.name, false, account, i4, bundle).bind();
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doNotification(a0 a0Var, Account account, CharSequence charSequence, Intent intent, String str, int i4) {
    }

    private Account[] filterAccounts(a0 a0Var, Account[] accountArr, int i4, String str, boolean z4) {
        String packageNameForUid = str == null ? getPackageNameForUid(i4) : str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Account account : accountArr) {
            int intValue = resolveAccountVisibility(account, packageNameForUid, a0Var).intValue();
            if (intValue == 1 || intValue == 2 || (z4 && intValue == 4)) {
                linkedHashMap.put(account, Integer.valueOf(intValue));
            }
        }
        Map<Account, Integer> filterSharedAccounts = filterSharedAccounts(a0Var, linkedHashMap, i4, str);
        return (Account[]) filterSharedAccounts.keySet().toArray(new Account[filterSharedAccounts.size()]);
    }

    private Map<Account, Integer> filterSharedAccounts(a0 a0Var, Map<Account, Integer> map, int i4, String str) {
        return map;
    }

    public static MindAccountManagerService get() {
        return sService;
    }

    private List<String> getAccountRemovedReceivers(Account account, a0 a0Var) {
        Intent intent = new Intent(ACTION_ACCOUNT_REMOVED);
        List<ResolveInfo> queryIntentBroadcastReceivers = com.xinzhu.overmind.server.pm.i.get().queryIntentBroadcastReceivers(intent, 0, intent.resolveTypeIfNeeded(Overmind.getContext().getContentResolver()), a0Var.f67844a);
        ArrayList arrayList = new ArrayList();
        if (queryIntentBroadcastReceivers == null) {
            return arrayList;
        }
        for (ResolveInfo resolveInfo : queryIntentBroadcastReceivers) {
            String str = resolveInfo.activityInfo.applicationInfo.packageName;
            int intValue = resolveAccountVisibility(account, str, a0Var).intValue();
            if (intValue == 1 || intValue == 2) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    private int getAccountVisibilityFromCache(Account account, String str, a0 a0Var) {
        int intValue;
        synchronized (a0Var.f67845b) {
            Integer num = getPackagesAndVisibilityForAccountLocked(account, a0Var).get(str);
            intValue = num != null ? num.intValue() : 0;
        }
        return intValue;
    }

    private Map<Account, Integer> getAccountsAndVisibilityForPackage(String str, List<String> list, Integer num, a0 a0Var) {
        if (!packageExistsForUser(str, a0Var.f67844a)) {
            com.xinzhu.overmind.utils.n.a(TAG, "Package not found " + str);
            return new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str2 : list) {
            synchronized (a0Var.f67845b) {
                Account[] accountArr = a0Var.f67849f.get(str2);
                if (accountArr != null) {
                    for (Account account : accountArr) {
                        linkedHashMap.put(account, resolveAccountVisibility(account, str, a0Var));
                    }
                }
            }
        }
        return filterSharedAccounts(a0Var, linkedHashMap, num.intValue(), str);
    }

    private Account[] getAccountsAsUserForPackage(String str, int i4, String str2, int i5, String str3, boolean z4) {
        String str4;
        int i6;
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        int i7 = b5.f67823c;
        if (i4 != b5.f67824d && i7 != 1000) {
            throw new SecurityException("User " + b5.f67824d + " trying to get account for " + i4);
        }
        if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
            com.xinzhu.overmind.utils.n.i(TAG, "getAccounts: accountType " + str + ", caller's uid " + BinderHelper.b().f67823c + ", pid " + Binder.getCallingPid());
        }
        List<String> typesManagedByCaller = getTypesManagedByCaller(i7, MindUserHandle.k(i7));
        if (i5 == -1 || (!MindUserHandle.o(i7, 1000) && (str == null || !typesManagedByCaller.contains(str)))) {
            str4 = str3;
            i6 = i7;
        } else {
            str4 = str2;
            i6 = i5;
        }
        List<String> typesVisibleToCaller = getTypesVisibleToCaller(i6, i4, str4);
        if (!typesVisibleToCaller.isEmpty() && (str == null || typesVisibleToCaller.contains(str))) {
            if (typesVisibleToCaller.contains(str)) {
                typesVisibleToCaller = new ArrayList<>();
                typesVisibleToCaller.add(str);
            }
            List<String> list = typesVisibleToCaller;
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return getAccountsInternal(getUserAccounts(i4), i6, str4, list, z4);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return EMPTY_ACCOUNT_ARRAY;
    }

    private Account[] getAccountsInternal(a0 a0Var, int i4, String str, List<String> list, boolean z4) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            Account[] accountsFromCache = getAccountsFromCache(a0Var, str2, i4, str, z4);
            if (accountsFromCache != null) {
                arrayList.addAll(Arrays.asList(accountsFromCache));
            }
        }
        Account[] accountArr = new Account[arrayList.size()];
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            accountArr[i5] = (Account) arrayList.get(i5);
        }
        return accountArr;
    }

    private AuthenticatorDescription[] getAuthenticatorTypesInternal(int i4) {
        this.mAuthenticatorCache.b(i4);
        Collection<m.d<AuthenticatorDescription>> e5 = this.mAuthenticatorCache.e(i4);
        AuthenticatorDescription[] authenticatorDescriptionArr = new AuthenticatorDescription[e5.size()];
        int i5 = 0;
        for (m.d<AuthenticatorDescription> dVar : e5) {
            authenticatorDescriptionArr[i5] = dVar.f68222a;
            i5++;
        }
        return authenticatorDescriptionArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public u getCredentialPermissionNotificationId(Account account, String str, int i4) {
        u uVar;
        a0 userAccounts = getUserAccounts(MindUserHandle.k(i4));
        synchronized (userAccounts.f67847d) {
            Pair pair = new Pair(new Pair(account, str), Integer.valueOf(i4));
            uVar = (u) userAccounts.f67847d.get(pair);
            if (uVar == null) {
                uVar = new u("MAccountManagerService:38:" + account.hashCode() + ":" + str.hashCode(), 38);
                userAccounts.f67847d.put(pair, uVar);
            }
        }
        return uVar;
    }

    private String getPackageNameForUid(int i4) {
        int i5;
        String[] packagesForUid = com.xinzhu.overmind.server.pm.i.get().getPackagesForUid(i4);
        if (com.xinzhu.overmind.utils.d.o(packagesForUid)) {
            return null;
        }
        String str = packagesForUid[0];
        if (packagesForUid.length == 1) {
            return str;
        }
        int i6 = Integer.MAX_VALUE;
        for (String str2 : packagesForUid) {
            ApplicationInfo applicationInfo = com.xinzhu.overmind.server.pm.i.get().getApplicationInfo(str2, 0, MindUserHandle.k(i4));
            if (applicationInfo != null && (i5 = applicationInfo.targetSdkVersion) < i6) {
                str = str2;
                i6 = i5;
            }
        }
        return str;
    }

    private Map<String, Integer> getPackagesAndVisibilityForAccountLocked(Account account, a0 a0Var) {
        Map<String, Integer> map = (Map) a0Var.f67853j.get(account);
        if (map == null) {
            com.xinzhu.overmind.utils.n.a(TAG, "Visibility was not initialized");
            HashMap hashMap = new HashMap();
            a0Var.f67853j.put(account, hashMap);
            return hashMap;
        }
        return map;
    }

    private Map<String, Integer> getRequestingPackages(Account account, a0 a0Var) {
        HashSet<String> hashSet = new HashSet();
        synchronized (a0Var.f67854k) {
            String[] strArr = {account.type, null};
            for (int i4 = 0; i4 < 2; i4++) {
                Map map = (Map) a0Var.f67854k.get(strArr[i4]);
                if (map != null) {
                    hashSet.addAll(map.keySet());
                }
            }
        }
        HashMap hashMap = new HashMap();
        for (String str : hashSet) {
            hashMap.put(str, resolveAccountVisibility(account, str, a0Var));
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public u getSigninRequiredNotificationId(a0 a0Var, Account account) {
        u uVar;
        synchronized (a0Var.f67848e) {
            uVar = (u) a0Var.f67848e.get(account);
            if (uVar == null) {
                u uVar2 = new u("MAccountManagerService:37:" + account.hashCode(), 37);
                a0Var.f67848e.put(account, uVar2);
                uVar = uVar2;
            }
        }
        return uVar;
    }

    private List<String> getTypesForCaller(int i4, int i5, boolean z4) {
        ArrayList arrayList = new ArrayList();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            Collection<m.d<AuthenticatorDescription>> e5 = this.mAuthenticatorCache.e(i5);
            Binder.restoreCallingIdentity(clearCallingIdentity);
            for (m.d<AuthenticatorDescription> dVar : e5) {
                if (z4 || com.xinzhu.overmind.server.pm.i.get().hasSignatureCapability(dVar.f68225d, i4, 16)) {
                    arrayList.add(dVar.f68222a.type);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    private List<String> getTypesManagedByCaller(int i4, int i5) {
        return getTypesForCaller(i4, i5, false);
    }

    private List<String> getTypesVisibleToCaller(int i4, int i5, String str) {
        return getTypesForCaller(i4, i5, true);
    }

    private a0 getUserAccountsForCaller() {
        return getUserAccounts(BinderHelper.b().f67824d);
    }

    private com.xinzhu.overmind.client.frameworks.i getUserManager() {
        if (this.mUserManager == null) {
            this.mUserManager = com.xinzhu.overmind.client.frameworks.i.d();
        }
        return this.mUserManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleGetAccountsResult(IAccountManagerResponse iAccountManagerResponse, Account[] accountArr, String str) {
        if (needToStartChooseAccountActivity(accountArr, str)) {
            startChooseAccountActivityWithAccounts(iAccountManagerResponse, accountArr, str);
        } else if (accountArr.length == 1) {
            Bundle bundle = new Bundle();
            bundle.putString("authAccount", accountArr[0].name);
            bundle.putString("accountType", accountArr[0].type);
            onResult(iAccountManagerResponse, bundle);
        } else {
            onResult(iAccountManagerResponse, new Bundle());
        }
    }

    private boolean hasAccountAccess(Account account, String str, int i4) {
        int intValue;
        if (str == null && (str = getPackageNameForUid(i4)) == null) {
            return false;
        }
        return permissionIsGranted(account, null, i4, MindUserHandle.k(i4)) || (intValue = resolveAccountVisibility(account, str, getUserAccounts(MindUserHandle.k(i4))).intValue()) == 1 || intValue == 2;
    }

    private boolean hasExplicitlyGrantedPermission(Account account, String str, int i4) {
        long p4;
        boolean z4 = true;
        if (MindUserHandle.a(i4) == 1000) {
            return true;
        }
        a0 userAccounts = getUserAccounts(MindUserHandle.k(i4));
        synchronized (userAccounts.f67845b) {
            if (str != null) {
                p4 = userAccounts.o(i4, str, account);
            } else {
                p4 = userAccounts.p(i4, account);
            }
            if (p4 <= 0) {
                z4 = false;
            }
        }
        return z4;
    }

    private Account insertAccountIntoCacheLocked(a0 a0Var, Account account) {
        String uuid;
        Account[] accountArr = a0Var.f67849f.get(account.type);
        int length = accountArr != null ? accountArr.length : 0;
        Account[] accountArr2 = new Account[length + 1];
        if (accountArr != null) {
            System.arraycopy(accountArr, 0, accountArr2, 0, length);
        }
        if (new com.xinzhu.haunted.android.accounts.a(account).h() != null) {
            uuid = new com.xinzhu.haunted.android.accounts.a(account).h();
        } else {
            uuid = UUID.randomUUID().toString();
        }
        accountArr2[length] = (Account) com.xinzhu.haunted.android.accounts.a.f(account, uuid).f65693a;
        a0Var.f67849f.put(account.type, accountArr2);
        return accountArr2[length];
    }

    private List<Pair<Account, String>> invalidateAuthTokenLocked(a0 a0Var, String str, String str2) {
        Map map;
        ArrayList arrayList = new ArrayList();
        synchronized (a0Var.f67845b) {
            for (MindAccount mindAccount : a0Var.f67846c.values()) {
                if (mindAccount.f67838b.type.equals(str) && (map = (Map) a0Var.f67851h.get(mindAccount.f67838b)) != null) {
                    Iterator it2 = map.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        if (((String) entry.getValue()).equals(str2)) {
                            arrayList.add(Pair.create(new Account(mindAccount.f67838b.name, str), (String) entry.getKey()));
                            it2.remove();
                        }
                    }
                }
            }
            saveAccountAuthTokenLocked(a0Var);
        }
        return arrayList;
    }

    private boolean isAccountManagedByCaller(String str, int i4, int i5) {
        if (str == null) {
            return false;
        }
        return getTypesManagedByCaller(i4, i5).contains(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isAccountPresentForCaller(String str, String str2) {
        Account[] accountArr;
        a0 userAccountsForCaller = getUserAccountsForCaller();
        synchronized (userAccountsForCaller.f67845b) {
            if (userAccountsForCaller.f67849f.containsKey(str2) && (accountArr = userAccountsForCaller.f67849f.get(str2)) != null) {
                for (Account account : accountArr) {
                    if (account.name.equals(str)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    private boolean isAccountVisibleToCaller(String str, int i4, int i5, String str2) {
        if (str == null) {
            return false;
        }
        return getTypesVisibleToCaller(i4, i5, str2).contains(str);
    }

    private boolean isCrossUser(int i4, int i5) {
        return (i5 == MindUserHandle.k(i4) || i4 == 1000) ? false : true;
    }

    private boolean isPreOApplication(String str) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            ApplicationInfo applicationInfo = com.xinzhu.overmind.server.pm.i.get().getApplicationInfo(str, 0, MindUserHandle.k(1000));
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return applicationInfo == null || applicationInfo.targetSdkVersion < 26;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    private boolean isSpecialPackageKey(String str) {
        return PACKAGE_NAME_KEY_LEGACY_VISIBLE.equals(str) || PACKAGE_NAME_KEY_LEGACY_NOT_VISIBLE.equals(str);
    }

    private boolean isSystemUid(int i4) {
        return i4 == 1000;
    }

    private boolean isVisible(int i4) {
        return i4 == 1 || i4 == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeAccountInternal$0(Account account, int i4) {
        cancelAccountAccessRequestNotificationIfNeeded(account, i4, false);
    }

    private void loadAllAccounts() {
        FileInputStream fileInputStream;
        byte[] bArr;
        if (com.xinzhu.overmind.server.accounts.b.b()) {
            loadCompatAccounts();
            com.xinzhu.overmind.server.accounts.b.a();
            return;
        }
        for (MindUserInfo mindUserInfo : com.xinzhu.overmind.server.user.c.get().getUsers()) {
            File file = new File(com.xinzhu.overmind.a.b(mindUserInfo.f68255b), ACCOUNTS_FILE_DATA);
            Parcel obtain = Parcel.obtain();
            FileInputStream fileInputStream2 = null;
            try {
                try {
                    fileInputStream = new FileInputStream(file);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (FileNotFoundException unused) {
            } catch (IOException e5) {
                e = e5;
            }
            try {
                bArr = new byte[4];
                fileInputStream.read(bArr);
            } catch (FileNotFoundException unused2) {
                fileInputStream2 = fileInputStream;
                obtain.recycle();
                com.xinzhu.overmind.utils.m.a(fileInputStream2);
            } catch (IOException e6) {
                e = e6;
                fileInputStream2 = fileInputStream;
                com.xinzhu.overmind.utils.n.c(TAG, "Error reading accounts for user " + mindUserInfo.f68255b);
                e.printStackTrace();
                obtain.recycle();
                com.xinzhu.overmind.utils.m.a(fileInputStream2);
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                obtain.recycle();
                com.xinzhu.overmind.utils.m.a(fileInputStream2);
                throw th;
            }
            if (Arrays.equals(bArr, ACCOUNTS_FILE_DATA_MAGIC)) {
                a0 a0Var = new a0(mindUserInfo.f68255b);
                byte[] w4 = com.xinzhu.overmind.utils.k.w(fileInputStream);
                obtain.unmarshall(w4, 0, w4.length);
                obtain.setDataPosition(0);
                ArrayList createTypedArrayList = obtain.createTypedArrayList(MindAccount.CREATOR);
                if (createTypedArrayList != null) {
                    Iterator it2 = createTypedArrayList.iterator();
                    while (it2.hasNext()) {
                        MindAccount mindAccount = (MindAccount) it2.next();
                        insertAccountIntoCacheLocked(a0Var, mindAccount.f67838b);
                        a0Var.f67846c.put(mindAccount.f67838b, mindAccount);
                    }
                    Map<Account, Map<String, String>> loadUserData = loadUserData(a0Var);
                    if (loadUserData != null) {
                        a0Var.f67850g.putAll(loadUserData);
                    }
                    Map<Account, Map<String, String>> loadAuthToken = loadAuthToken(a0Var);
                    if (loadAuthToken != null) {
                        a0Var.f67851h.putAll(loadAuthToken);
                    }
                    Map<Account, Map<String, Integer>> loadVisibilities = loadVisibilities(a0Var);
                    if (loadVisibilities != null) {
                        a0Var.f67853j.putAll(loadVisibilities);
                    }
                    Map<Account, AtomicReference<String>> loadPreviousName = loadPreviousName(a0Var);
                    if (loadPreviousName != null) {
                        a0Var.f67855l.putAll(loadPreviousName);
                    }
                    List<UidGrant> loadUidGrants = loadUidGrants(a0Var);
                    if (loadUidGrants != null) {
                        a0Var.f67856m.addAll(loadUidGrants);
                    }
                    this.mUsers.put(mindUserInfo.f68255b, a0Var);
                    obtain.recycle();
                    com.xinzhu.overmind.utils.m.a(fileInputStream);
                } else {
                    throw new IOException();
                }
            } else {
                throw new IOException();
            }
        }
    }

    private Map<Account, Map<String, String>> loadAuthToken(a0 a0Var) {
        return loadMap(new File(com.xinzhu.overmind.a.b(a0Var.f67844a), ACCOUNTS_FILE_AUTH_TOKEN), ACCOUNTS_FILE_AUTH_TOKEN_MAGIC);
    }

    private void loadCompatAccounts() {
        com.xinzhu.overmind.client.frameworks.i userManager = getUserManager();
        for (b.a aVar : com.xinzhu.overmind.server.accounts.b.c()) {
            if (userManager.c(aVar.f67869a)) {
                MindAccount mindAccount = new MindAccount(aVar.f67870b);
                mindAccount.f67839c = aVar.f67872d;
                mindAccount.f67840d = aVar.f67873e;
                a0 a0Var = this.mUsers.get(aVar.f67869a);
                if (a0Var == null) {
                    a0Var = new a0(aVar.f67869a);
                    this.mUsers.put(aVar.f67869a, a0Var);
                }
                insertAccountIntoCacheLocked(a0Var, mindAccount.f67838b);
                a0Var.f67846c.put(mindAccount.f67838b, mindAccount);
                HashMap hashMap = new HashMap();
                for (Pair<String, String> pair : aVar.f67875g) {
                    hashMap.put((String) pair.first, (String) pair.second);
                }
                a0Var.f67850g.put(mindAccount.f67838b, hashMap);
                HashMap hashMap2 = new HashMap();
                for (Pair<String, String> pair2 : aVar.f67874f) {
                    hashMap2.put((String) pair2.first, (String) pair2.second);
                }
                a0Var.f67851h.put(mindAccount.f67838b, hashMap2);
                a0Var.f67855l.put(mindAccount.f67838b, new AtomicReference(aVar.f67871c));
            }
        }
        for (b.C0750b c0750b : com.xinzhu.overmind.server.accounts.b.d()) {
            a0 a0Var2 = this.mUsers.get(c0750b.f67876a);
            if (a0Var2 != null && a0Var2.f67846c.get(c0750b.f67877b) != null) {
                HashMap hashMap3 = new HashMap();
                for (Pair<String, Integer> pair3 : c0750b.f67878c) {
                    hashMap3.put((String) pair3.first, (Integer) pair3.second);
                }
                a0Var2.f67853j.put(c0750b.f67877b, hashMap3);
            }
        }
    }

    private <V> List<V> loadList(File file, byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr2 = new byte[bArr.length];
                fileInputStream.read(bArr2);
                if (Arrays.equals(bArr2, bArr)) {
                    byte[] w4 = com.xinzhu.overmind.utils.k.w(fileInputStream);
                    obtain.unmarshall(w4, 0, w4.length);
                    obtain.setDataPosition(0);
                    return obtain.readArrayList(MindAccountManagerService.class.getClassLoader());
                }
                return null;
            } catch (FileNotFoundException unused) {
                return null;
            } catch (IOException e5) {
                com.xinzhu.overmind.utils.n.c(TAG, "Error reading data file " + file);
                e5.printStackTrace();
                return null;
            }
        } finally {
            obtain.recycle();
        }
    }

    private <K, V> Map<K, V> loadMap(File file, byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr2 = new byte[bArr.length];
                fileInputStream.read(bArr2);
                if (Arrays.equals(bArr2, bArr)) {
                    byte[] w4 = com.xinzhu.overmind.utils.k.w(fileInputStream);
                    obtain.unmarshall(w4, 0, w4.length);
                    obtain.setDataPosition(0);
                    return obtain.readHashMap(MindAccountManagerService.class.getClassLoader());
                }
                return null;
            } catch (FileNotFoundException unused) {
                return null;
            } catch (IOException e5) {
                com.xinzhu.overmind.utils.n.c(TAG, "Error reading data file " + file);
                e5.printStackTrace();
                return null;
            }
        } finally {
            obtain.recycle();
        }
    }

    private Map<Account, AtomicReference<String>> loadPreviousName(a0 a0Var) {
        return loadMap(new File(com.xinzhu.overmind.a.b(a0Var.f67844a), ACCOUNTS_FILE_PREVIOUS_NAME), ACCOUNTS_FILE_PREVIOUS_NAME_MAGIC);
    }

    private List<UidGrant> loadUidGrants(a0 a0Var) {
        return loadList(new File(com.xinzhu.overmind.a.b(a0Var.f67844a), ACCOUNTS_FILE_UID_GRANT), ACCOUNTS_FILE_UID_GRANT_MAGIC);
    }

    private Map<Account, Map<String, String>> loadUserData(a0 a0Var) {
        return loadMap(new File(com.xinzhu.overmind.a.b(a0Var.f67844a), ACCOUNTS_FILE_USER_DATA), ACCOUNTS_FILE_USER_DATA_MAGIC);
    }

    private Map<Account, Map<String, Integer>> loadVisibilities(a0 a0Var) {
        return loadMap(new File(com.xinzhu.overmind.a.b(a0Var.f67844a), ACCOUNTS_FILE_VISIBILITY), ACCOUNTS_FILE_VISIBILITY_MAGIC);
    }

    private boolean needToStartChooseAccountActivity(Account[] accountArr, String str) {
        if (accountArr.length < 1) {
            return false;
        }
        return accountArr.length > 1 || resolveAccountVisibility(accountArr[0], str, getUserAccounts(BinderHelper.b().f67824d)).intValue() == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Intent newGrantCredentialsPermissionIntent(Account account, String str, int i4, AccountAuthenticatorResponse accountAuthenticatorResponse, String str2, boolean z4) {
        Intent intent = new Intent(Overmind.getContext(), GrantCredentialsPermissionActivity.class);
        if (z4) {
            intent.setFlags(268435456);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getCredentialPermissionNotificationId(account, str2, i4).f67864a);
        if (str == null) {
            str = "";
        }
        sb.append(str);
        intent.addCategory(sb.toString());
        intent.putExtra(GrantCredentialsPermissionActivity.f67535g, account);
        intent.putExtra("authTokenType", str2);
        intent.putExtra(GrantCredentialsPermissionActivity.f67537i, accountAuthenticatorResponse);
        intent.putExtra("uid", i4);
        return intent;
    }

    private Intent newRequestAccountAccessIntent(Account account, String str, int i4, RemoteCallback remoteCallback) {
        return newGrantCredentialsPermissionIntent(account, str, i4, (AccountAuthenticatorResponse) com.xinzhu.haunted.android.accounts.b.b(new h(account, i4, str, remoteCallback)).f65698a, ACCOUNT_ACCESS_TOKEN_TYPE, false);
    }

    private void notifyPackage(String str, a0 a0Var) {
        Intent intent = new Intent(ACTION_VISIBLE_ACCOUNTS_CHANGED);
        intent.setPackage(str);
        intent.setFlags(1073741824);
        try {
            this.mContext.sendBroadcast(com.xinzhu.overmind.client.hook.env.a.k(com.xinzhu.overmind.server.am.f.get().sendBroadcast(intent, intent.resolveTypeIfNeeded(Overmind.getContext().getContentResolver()), a0Var.f67844a)));
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    private void onResult(IAccountManagerResponse iAccountManagerResponse, Bundle bundle) {
        if (bundle == null) {
            com.xinzhu.overmind.utils.n.d(TAG, "the result is unexpectedly null", new Exception());
        }
        if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
            com.xinzhu.overmind.utils.n.i(TAG, getClass().getSimpleName() + " calling onResult() on response " + iAccountManagerResponse);
        }
        try {
            iAccountManagerResponse.onResult(bundle);
        } catch (RemoteException e5) {
            if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
                com.xinzhu.overmind.utils.n.j(TAG, "failure while notifying response", e5);
            }
        }
    }

    private boolean packageExistsForUser(String str, int i4) {
        return com.xinzhu.overmind.server.pm.i.get().getPackageUid(str, 0, i4) != -1;
    }

    private boolean permissionIsGranted(Account account, String str, int i4, int i5) {
        if (MindUserHandle.a(i4) == 1000) {
            if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
                com.xinzhu.overmind.utils.n.i(TAG, "Access to " + account + " granted calling uid is system");
            }
            return true;
        } else if (account != null && isAccountManagedByCaller(account.type, i4, i5)) {
            if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
                com.xinzhu.overmind.utils.n.i(TAG, "Access to " + account + " granted calling uid " + i4 + " manages the account");
            }
            return true;
        } else if (account != null && hasExplicitlyGrantedPermission(account, str, i4)) {
            if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
                com.xinzhu.overmind.utils.n.i(TAG, "Access to " + account + " granted calling uid " + i4 + " user granted access");
            }
            return true;
        } else if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
            com.xinzhu.overmind.utils.n.i(TAG, "Access to " + account + " not granted for uid " + i4);
            return false;
        } else {
            return false;
        }
    }

    private void purgeOldGrants(a0 a0Var) {
        synchronized (a0Var.f67845b) {
            for (Integer num : a0Var.n()) {
                int intValue = num.intValue();
                if (!(com.xinzhu.overmind.server.pm.i.get().getPackagesForUid(intValue) != null)) {
                    com.xinzhu.overmind.utils.n.a(TAG, "deleting grants for UID " + intValue + " because its package is no longer installed");
                    a0Var.m(intValue);
                    saveUidGrantsLocked(a0Var);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void purgeOldGrantsAll() {
        synchronized (this.mUsers) {
            for (int i4 = 0; i4 < this.mUsers.size(); i4++) {
                purgeOldGrants(this.mUsers.valueAt(i4));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void purgeUserData(int i4) {
        synchronized (this.mUsers) {
            this.mUsers.remove(i4);
        }
    }

    private String readPasswordInternal(a0 a0Var, Account account) {
        synchronized (a0Var.f67845b) {
            for (MindAccount mindAccount : a0Var.f67846c.values()) {
                if (account.name.equals(mindAccount.f67838b.name) && account.type.equals(mindAccount.f67838b.type)) {
                    return mindAccount.a();
                }
            }
            return null;
        }
    }

    private String readPreviousNameInternal(a0 a0Var, Account account) {
        if (account == null) {
            return null;
        }
        synchronized (a0Var.f67845b) {
            AtomicReference atomicReference = (AtomicReference) a0Var.f67855l.get(account);
            if (atomicReference == null) {
                String str = account.name;
                a0Var.f67855l.put(account, new AtomicReference(str));
                saveAccountPreviousNameLocked(a0Var);
                return str;
            }
            return (String) atomicReference.get();
        }
    }

    private void registerAccountListener(String[] strArr, String str, a0 a0Var) {
        synchronized (a0Var.f67854k) {
            if (strArr == null) {
                strArr = new String[]{null};
            }
            for (String str2 : strArr) {
                Map map = (Map) a0Var.f67854k.get(str2);
                if (map == null) {
                    map = new HashMap();
                    a0Var.f67854k.put(str2, map);
                }
                Integer num = (Integer) map.get(str);
                int i4 = 1;
                if (num != null) {
                    i4 = 1 + num.intValue();
                }
                map.put(str, Integer.valueOf(i4));
            }
        }
    }

    private void removeAccountFromCacheLocked(a0 a0Var, Account account) {
        Account[] accountArr = a0Var.f67849f.get(account.type);
        if (accountArr != null) {
            ArrayList arrayList = new ArrayList();
            for (Account account2 : accountArr) {
                if (!account2.equals(account)) {
                    arrayList.add(account2);
                }
            }
            if (arrayList.isEmpty()) {
                a0Var.f67849f.remove(account.type);
            } else {
                a0Var.f67849f.put(account.type, (Account[]) arrayList.toArray(new Account[arrayList.size()]));
            }
        }
        a0Var.f67850g.remove(account);
        saveAccountUserDataLocked(a0Var);
        a0Var.f67851h.remove(account);
        saveAccountAuthTokenLocked(a0Var);
        a0Var.f67855l.remove(account);
        saveAccountPreviousNameLocked(a0Var);
        a0Var.f67853j.remove(account);
        saveAccountVisibilitiesLocked(a0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean removeAccountInternal(a0 a0Var, final Account account, int i4) {
        synchronized (a0Var.f67845b) {
            Map<String, Integer> requestingPackages = getRequestingPackages(account, a0Var);
            List<String> accountRemovedReceivers = getAccountRemovedReceivers(account, a0Var);
            a0Var.f67846c.remove(account);
            saveAccountDataLocked(a0Var);
            removeAccountFromCacheLocked(a0Var, account);
            for (Map.Entry<String, Integer> entry : requestingPackages.entrySet()) {
                if (entry.getValue().intValue() == 1 || entry.getValue().intValue() == 2) {
                    notifyPackage(entry.getKey(), a0Var);
                }
            }
            sendAccountsChangedBroadcast(a0Var.f67844a);
            for (String str : accountRemovedReceivers) {
                sendAccountRemovedBroadcast(account, str, a0Var.f67844a);
            }
        }
        synchronized (a0Var.f67847d) {
            for (Pair pair : a0Var.f67847d.keySet()) {
                if (account.equals(((Pair) pair.first).first) && ACCOUNT_ACCESS_TOKEN_TYPE.equals(((Pair) pair.first).second)) {
                    final int intValue = ((Integer) pair.second).intValue();
                    this.mHandler.post(new Runnable() { // from class: com.xinzhu.overmind.server.accounts.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            MindAccountManagerService.this.lambda$removeAccountInternal$0(account, intValue);
                        }
                    });
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeVisibilityValuesForPackage(String str) {
        if (isSpecialPackageKey(str)) {
            return;
        }
        synchronized (this.mUsers) {
            int size = this.mUsers.size();
            for (int i4 = 0; i4 < size; i4++) {
                a0 valueAt = this.mUsers.valueAt(i4);
                if (-1 == com.xinzhu.overmind.server.pm.i.get().getPackageUid(str, 0, valueAt.f67844a)) {
                    synchronized (valueAt.f67845b) {
                        for (Account account : valueAt.f67853j.keySet()) {
                            getPackagesAndVisibilityForAccountLocked(account, valueAt).remove(str);
                        }
                        saveAccountVisibilitiesLocked(valueAt);
                    }
                }
            }
        }
    }

    private Account renameAccountInternal(a0 a0Var, Account account, String str) {
        cancelNotification(getSigninRequiredNotificationId(a0Var, account), new MindUserHandle(a0Var.f67844a));
        synchronized (a0Var.f67847d) {
            for (Pair pair : a0Var.f67847d.keySet()) {
                if (account.equals(((Pair) pair.first).first)) {
                    cancelNotification((u) a0Var.f67847d.get(pair), new MindUserHandle(a0Var.f67844a));
                }
            }
        }
        synchronized (a0Var.f67845b) {
            List<String> accountRemovedReceivers = getAccountRemovedReceivers(account, a0Var);
            Account account2 = new Account(str, account.type);
            MindAccount mindAccount = new MindAccount(account2);
            if (((MindAccount) a0Var.f67846c.get(account2)) == null) {
                MindAccount mindAccount2 = (MindAccount) a0Var.f67846c.get(account);
                if (mindAccount2 != null) {
                    mindAccount.f67839c = mindAccount2.f67839c;
                }
                a0Var.f67846c.remove(account);
                a0Var.f67846c.put(account2, mindAccount);
                saveAccountDataLocked(a0Var);
                Account insertAccountIntoCacheLocked = insertAccountIntoCacheLocked(a0Var, account2);
                removeAccountFromCacheLocked(a0Var, account);
                a0Var.f67850g.put(insertAccountIntoCacheLocked, (Map) a0Var.f67850g.get(account));
                saveAccountUserDataLocked(a0Var);
                a0Var.f67851h.put(insertAccountIntoCacheLocked, (Map) a0Var.f67851h.get(account));
                saveAccountAuthTokenLocked(a0Var);
                a0Var.f67853j.put(insertAccountIntoCacheLocked, (Map) a0Var.f67853j.get(account));
                saveAccountVisibilitiesLocked(a0Var);
                a0Var.f67855l.put(insertAccountIntoCacheLocked, new AtomicReference(account.name));
                saveAccountPreviousNameLocked(a0Var);
                sendNotificationAccountUpdated(insertAccountIntoCacheLocked, a0Var);
                sendAccountsChangedBroadcast(a0Var.f67844a);
                for (String str2 : accountRemovedReceivers) {
                    sendAccountRemovedBroadcast(account, str2, a0Var.f67844a);
                }
                return insertAccountIntoCacheLocked;
            }
            com.xinzhu.overmind.utils.n.c(TAG, "renameAccount failed - account with new name already exists");
            return null;
        }
    }

    private Integer resolveAccountVisibility(Account account, String str, a0 a0Var) {
        Objects.requireNonNull(str, "packageName cannot be null");
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            int packageUid = com.xinzhu.overmind.server.pm.i.get().getPackageUid(str, 0, a0Var.f67844a);
            Binder.restoreCallingIdentity(clearCallingIdentity);
            if (!MindUserHandle.o(packageUid, 1000)) {
                int checkPackageSignature = checkPackageSignature(account.type, packageUid, a0Var.f67844a);
                int i4 = 2;
                if (checkPackageSignature == 2) {
                    return 1;
                }
                int accountVisibilityFromCache = getAccountVisibilityFromCache(account, str, a0Var);
                if (accountVisibilityFromCache != 0) {
                    return Integer.valueOf(accountVisibilityFromCache);
                }
                boolean isPreOApplication = isPreOApplication(str);
                if (checkPackageSignature == 0 && !isPreOApplication && !accountTypeManagesContacts(account.type, a0Var.f67844a)) {
                    i4 = getAccountVisibilityFromCache(account, PACKAGE_NAME_KEY_LEGACY_NOT_VISIBLE, a0Var);
                    if (i4 == 0) {
                        i4 = 4;
                    }
                } else {
                    int accountVisibilityFromCache2 = getAccountVisibilityFromCache(account, PACKAGE_NAME_KEY_LEGACY_VISIBLE, a0Var);
                    if (accountVisibilityFromCache2 != 0) {
                        i4 = accountVisibilityFromCache2;
                    }
                }
                return Integer.valueOf(i4);
            }
            return 1;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    private void revokeAppPermission(final Account account, String str, final int i4) {
        if (account != null && str != null) {
            a0 userAccounts = getUserAccounts(MindUserHandle.k(i4));
            synchronized (userAccounts.f67845b) {
                userAccounts.l(account, str, i4);
                cancelNotification(getCredentialPermissionNotificationId(account, str, i4), MindUserHandle.s(userAccounts.f67844a));
            }
            Iterator<v> it2 = this.mAppPermissionChangeListeners.iterator();
            while (it2.hasNext()) {
                final v next = it2.next();
                this.mHandler.post(new Runnable() { // from class: com.xinzhu.overmind.server.accounts.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        MindAccountManagerService.v.this.a(account, i4);
                    }
                });
            }
            return;
        }
        com.xinzhu.overmind.utils.n.d(TAG, "revokeAppPermission: called with invalid arguments", new Exception());
    }

    private void saveAccountAuthTokenLocked(a0 a0Var) {
        saveMap(new File(com.xinzhu.overmind.a.b(a0Var.f67844a), ACCOUNTS_FILE_AUTH_TOKEN), ACCOUNTS_FILE_AUTH_TOKEN_MAGIC, a0Var.f67851h);
    }

    private void saveAccountDataLocked(a0 a0Var) {
        Parcel obtain = Parcel.obtain();
        AtomicFile atomicFile = new AtomicFile(new File(com.xinzhu.overmind.a.b(a0Var.f67844a), ACCOUNTS_FILE_DATA));
        FileOutputStream fileOutputStream = null;
        try {
            obtain.writeTypedList(new ArrayList(a0Var.f67846c.values()));
            obtain.setDataPosition(0);
            fileOutputStream = atomicFile.startWrite();
            fileOutputStream.write(ACCOUNTS_FILE_DATA_MAGIC);
            com.xinzhu.overmind.utils.k.z(obtain, fileOutputStream);
            atomicFile.finishWrite(fileOutputStream);
            obtain.recycle();
            com.xinzhu.overmind.utils.m.a(fileOutputStream);
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                atomicFile.failWrite(fileOutputStream);
                obtain.recycle();
                com.xinzhu.overmind.utils.m.a(fileOutputStream);
            } catch (Throwable th2) {
                obtain.recycle();
                com.xinzhu.overmind.utils.m.a(fileOutputStream);
                throw th2;
            }
        }
    }

    private void saveAccountPreviousNameLocked(a0 a0Var) {
        saveMap(new File(com.xinzhu.overmind.a.b(a0Var.f67844a), ACCOUNTS_FILE_PREVIOUS_NAME), ACCOUNTS_FILE_PREVIOUS_NAME_MAGIC, a0Var.f67855l);
    }

    private void saveAccountUserDataLocked(a0 a0Var) {
        saveMap(new File(com.xinzhu.overmind.a.b(a0Var.f67844a), ACCOUNTS_FILE_USER_DATA), ACCOUNTS_FILE_USER_DATA_MAGIC, a0Var.f67850g);
    }

    private void saveAccountVisibilitiesLocked(a0 a0Var) {
        saveMap(new File(com.xinzhu.overmind.a.b(a0Var.f67844a), ACCOUNTS_FILE_VISIBILITY), ACCOUNTS_FILE_VISIBILITY_MAGIC, a0Var.f67853j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean saveAuthTokenToDatabase(a0 a0Var, Account account, String str, String str2) {
        if (account == null || str == null) {
            return false;
        }
        cancelNotification(getSigninRequiredNotificationId(a0Var, account), new MindUserHandle(a0Var.f67844a));
        synchronized (a0Var.f67845b) {
            writeAuthTokenIntoCacheLocked(a0Var, account, str, str2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveCachedToken(a0 a0Var, Account account, String str, byte[] bArr, String str2, String str3, long j4) {
        if (account == null || str2 == null || str == null || bArr == null) {
            return;
        }
        cancelNotification(getSigninRequiredNotificationId(a0Var, account), MindUserHandle.s(a0Var.f67844a));
        synchronized (a0Var.f67845b) {
            a0Var.f67852i.b(account, str3, str2, str, bArr, j4);
        }
    }

    private void saveList(File file, byte[] bArr, List list) {
        Parcel obtain = Parcel.obtain();
        AtomicFile atomicFile = new AtomicFile(file);
        FileOutputStream fileOutputStream = null;
        try {
            obtain.writeList(list);
            obtain.setDataPosition(0);
            fileOutputStream = atomicFile.startWrite();
            fileOutputStream.write(bArr);
            com.xinzhu.overmind.utils.k.z(obtain, fileOutputStream);
            atomicFile.finishWrite(fileOutputStream);
            obtain.recycle();
            com.xinzhu.overmind.utils.m.a(fileOutputStream);
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                atomicFile.failWrite(fileOutputStream);
                obtain.recycle();
                com.xinzhu.overmind.utils.m.a(fileOutputStream);
            } catch (Throwable th2) {
                obtain.recycle();
                com.xinzhu.overmind.utils.m.a(fileOutputStream);
                throw th2;
            }
        }
    }

    private void saveMap(File file, byte[] bArr, Map map) {
        Parcel obtain = Parcel.obtain();
        AtomicFile atomicFile = new AtomicFile(file);
        FileOutputStream fileOutputStream = null;
        try {
            obtain.writeMap(map);
            obtain.setDataPosition(0);
            fileOutputStream = atomicFile.startWrite();
            fileOutputStream.write(bArr);
            com.xinzhu.overmind.utils.k.z(obtain, fileOutputStream);
            atomicFile.finishWrite(fileOutputStream);
            obtain.recycle();
            com.xinzhu.overmind.utils.m.a(fileOutputStream);
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                atomicFile.failWrite(fileOutputStream);
                obtain.recycle();
                com.xinzhu.overmind.utils.m.a(fileOutputStream);
            } catch (Throwable th2) {
                obtain.recycle();
                com.xinzhu.overmind.utils.m.a(fileOutputStream);
                throw th2;
            }
        }
    }

    private void saveUidGrantsLocked(a0 a0Var) {
        saveList(new File(com.xinzhu.overmind.a.b(a0Var.f67844a), ACCOUNTS_FILE_UID_GRANT), ACCOUNTS_FILE_UID_GRANT_MAGIC, a0Var.f67856m);
    }

    private void sendAccountRemovedBroadcast(Account account, String str, int i4) {
        Intent intent = new Intent(ACTION_ACCOUNT_REMOVED);
        intent.setPackage(str);
        intent.putExtra("authAccount", account.name);
        intent.putExtra("accountType", account.type);
        try {
            this.mContext.sendBroadcast(com.xinzhu.overmind.client.hook.env.a.k(com.xinzhu.overmind.server.am.f.get().sendBroadcast(intent, intent.resolveTypeIfNeeded(Overmind.getContext().getContentResolver()), i4)));
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    private void sendAccountsChangedBroadcast(int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append("the accounts changed, sending broadcast of ");
        Intent intent = ACCOUNTS_CHANGED_INTENT;
        sb.append(intent.getAction());
        com.xinzhu.overmind.utils.n.e(TAG, sb.toString());
        try {
            this.mContext.sendBroadcast(com.xinzhu.overmind.client.hook.env.a.k(com.xinzhu.overmind.server.am.f.get().sendBroadcast(intent, intent.resolveTypeIfNeeded(Overmind.getContext().getContentResolver()), i4)));
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendErrorResponse(IAccountManagerResponse iAccountManagerResponse, int i4, String str) {
        try {
            iAccountManagerResponse.onError(i4, str);
        } catch (RemoteException e5) {
            if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
                com.xinzhu.overmind.utils.n.j(TAG, "failure while notifying response", e5);
            }
        }
    }

    private void sendNotificationAccountUpdated(Account account, a0 a0Var) {
        for (Map.Entry<String, Integer> entry : getRequestingPackages(account, a0Var).entrySet()) {
            if (entry.getValue().intValue() != 3 && entry.getValue().intValue() != 4) {
                notifyPackage(entry.getKey(), a0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendResponse(IAccountManagerResponse iAccountManagerResponse, Bundle bundle) {
        try {
            iAccountManagerResponse.onResult(bundle);
        } catch (RemoteException e5) {
            if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
                com.xinzhu.overmind.utils.n.j(TAG, "failure while notifying response", e5);
            }
        }
    }

    private boolean setAccountVisibility(Account account, String str, int i4, boolean z4, a0 a0Var) {
        Map<String, Integer> emptyMap;
        List<String> emptyList;
        synchronized (a0Var.f67845b) {
            if (z4) {
                if (!isSpecialPackageKey(str)) {
                    if (!packageExistsForUser(str, a0Var.f67844a)) {
                        return false;
                    }
                    emptyMap = new HashMap<>();
                    emptyMap.put(str, resolveAccountVisibility(account, str, a0Var));
                    emptyList = new ArrayList<>();
                    if (shouldNotifyPackageOnAccountRemoval(account, str, a0Var)) {
                        emptyList.add(str);
                    }
                } else {
                    emptyMap = getRequestingPackages(account, a0Var);
                    emptyList = getAccountRemovedReceivers(account, a0Var);
                }
            } else if (!isSpecialPackageKey(str) && !packageExistsForUser(str, a0Var.f67844a)) {
                return false;
            } else {
                emptyMap = Collections.emptyMap();
                emptyList = Collections.emptyList();
            }
            if (updateAccountVisibilityLocked(account, str, i4, a0Var)) {
                if (z4) {
                    for (Map.Entry<String, Integer> entry : emptyMap.entrySet()) {
                        if (isVisible(entry.getValue().intValue()) != isVisible(resolveAccountVisibility(account, str, a0Var).intValue())) {
                            notifyPackage(entry.getKey(), a0Var);
                        }
                    }
                    for (String str2 : emptyList) {
                        sendAccountRemovedBroadcast(account, str2, a0Var.f67844a);
                    }
                    sendAccountsChangedBroadcast(a0Var.f67844a);
                }
                return true;
            }
            return false;
        }
    }

    private void setPasswordInternal(a0 a0Var, Account account, String str, int i4) {
        if (account == null) {
            return;
        }
        synchronized (a0Var.f67845b) {
            MindAccount mindAccount = (MindAccount) a0Var.f67846c.get(account);
            if (mindAccount != null) {
                mindAccount.f67839c = str;
                a0Var.f67851h.remove(account);
                a0Var.f67852i.c(account);
                saveAccountDataLocked(a0Var);
                saveAccountAuthTokenLocked(a0Var);
                sendNotificationAccountUpdated(account, a0Var);
                sendAccountsChangedBroadcast(a0Var.f67844a);
            }
        }
    }

    private void setUserdataInternal(a0 a0Var, Account account, String str, String str2) {
        synchronized (a0Var.f67845b) {
            writeUserDataIntoCacheLocked(a0Var, account, str, str2);
        }
    }

    private boolean shouldNotifyPackageOnAccountRemoval(Account account, String str, a0 a0Var) {
        int intValue = resolveAccountVisibility(account, str, a0Var).intValue();
        if (intValue == 1 || intValue == 2) {
            Intent intent = new Intent(ACTION_ACCOUNT_REMOVED);
            intent.setPackage(str);
            List<ResolveInfo> queryIntentBroadcastReceivers = com.xinzhu.overmind.server.pm.i.get().queryIntentBroadcastReceivers(intent, 0, intent.resolveTypeIfNeeded(Overmind.getContext().getContentResolver()), a0Var.f67844a);
            return queryIntentBroadcastReceivers != null && queryIntentBroadcastReceivers.size() > 0;
        }
        return false;
    }

    private void showCantAddAccount(int i4, int i5) {
    }

    private void startChooseAccountActivityWithAccounts(IAccountManagerResponse iAccountManagerResponse, Account[] accountArr, String str) {
        Intent intent = new Intent(Overmind.getContext(), ChooseAccountActivity.class);
        intent.putExtra("accounts", accountArr);
        intent.putExtra("accountManagerResponse", new AccountManagerResponse(iAccountManagerResponse));
        intent.putExtra("androidPackageName", str);
        Overmind.getContext().startActivity(intent);
    }

    private void unregisterAccountListener(String[] strArr, String str, a0 a0Var) {
        synchronized (a0Var.f67854k) {
            if (strArr == null) {
                strArr = new String[]{null};
            }
            for (String str2 : strArr) {
                Map map = (Map) a0Var.f67854k.get(str2);
                if (map != null && map.get(str) != null) {
                    Integer num = (Integer) map.get(str);
                    if (num != null) {
                        if (num.intValue() == 1) {
                            map.remove(str);
                        } else {
                            map.put(str, Integer.valueOf(num.intValue() - 1));
                        }
                    }
                } else {
                    throw new IllegalArgumentException("attempt to unregister wrong receiver");
                }
            }
        }
    }

    private boolean updateAccountVisibilityLocked(Account account, String str, int i4, a0 a0Var) {
        if (((MindAccount) a0Var.f67846c.get(account)) == null) {
            return false;
        }
        getPackagesAndVisibilityForAccountLocked(account, a0Var).put(str, Integer.valueOf(i4));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean updateLastAuthenticatedTime(Account account) {
        a0 userAccountsForCaller = getUserAccountsForCaller();
        synchronized (userAccountsForCaller.f67845b) {
            MindAccount mindAccount = (MindAccount) userAccountsForCaller.f67846c.get(account);
            if (mindAccount != null) {
                mindAccount.f67840d = System.currentTimeMillis();
                saveAccountDataLocked(userAccountsForCaller);
                return true;
            }
            return false;
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public boolean accountAuthenticated(Account account) {
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        int i4 = b5.f67823c;
        if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
            com.xinzhu.overmind.utils.n.i(TAG, String.format("accountAuthenticated( account: %s, callerUid: %s)", account, Integer.valueOf(i4)));
        }
        Objects.requireNonNull(account, "account cannot be null");
        int i5 = b5.f67824d;
        if (isAccountManagedByCaller(account.type, i4, i5)) {
            if (canUserModifyAccounts(i5, i4) && canUserModifyAccountsForType(i5, account.type, i4)) {
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    getUserAccounts(i5);
                    return updateLastAuthenticatedTime(account);
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            return false;
        }
        throw new SecurityException(String.format("uid %s cannot notify authentication for accounts of type: %s", Integer.valueOf(i4), account.type));
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void addAccount(IAccountManagerResponse iAccountManagerResponse, String str, String str2, String[] strArr, boolean z4, Bundle bundle) {
        if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
            com.xinzhu.overmind.utils.n.i(TAG, "addAccount: accountType " + str + ", response " + iAccountManagerResponse + ", authTokenType " + str2 + ", requiredFeatures " + Arrays.toString(strArr) + ", expectActivityLaunch " + z4 + ", caller's uid " + BinderHelper.b().f67823c + ", pid " + Binder.getCallingPid() + " helperuid " + BinderHelper.b().f67823c + " realuid " + Overmind.getHostUid() + " " + Arrays.asList(this.mContext.getPackageManager().getPackagesForUid(Overmind.getHostUid())));
        }
        if (iAccountManagerResponse == null) {
            throw new IllegalArgumentException("response is null");
        }
        if (str != null) {
            BinderHelper.CallingInfo b5 = BinderHelper.b();
            int i4 = b5.f67823c;
            int k4 = MindUserHandle.k(i4);
            if (!canUserModifyAccounts(k4, i4)) {
                try {
                    iAccountManagerResponse.onError(100, "User is not allowed to add an account!");
                } catch (RemoteException unused) {
                }
                showCantAddAccount(100, k4);
                return;
            } else if (!canUserModifyAccountsForType(k4, str, i4)) {
                try {
                    iAccountManagerResponse.onError(101, "User cannot modify accounts of this type (policy).");
                } catch (RemoteException unused2) {
                }
                showCantAddAccount(101, k4);
                return;
            } else {
                int i5 = b5.f67822b;
                Bundle bundle2 = bundle == null ? new Bundle() : bundle;
                bundle2.putInt("callerUid", i4);
                bundle2.putInt("callerPid", i5);
                int i6 = b5.f67824d;
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    new o(getUserAccounts(i6), iAccountManagerResponse, str, z4, true, null, false, true, str2, strArr, bundle2, str).bind();
                    return;
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
        }
        throw new IllegalArgumentException("accountType is null");
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void addAccountAsUser(IAccountManagerResponse iAccountManagerResponse, String str, String str2, String[] strArr, boolean z4, Bundle bundle, int i4) {
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        int i5 = b5.f67823c;
        if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
            com.xinzhu.overmind.utils.n.i(TAG, "addAccount: accountType " + str + ", response " + iAccountManagerResponse + ", authTokenType " + str2 + ", requiredFeatures " + Arrays.toString(strArr) + ", expectActivityLaunch " + z4 + ", caller's uid " + BinderHelper.b().f67823c + ", pid " + Binder.getCallingPid() + ", for user id " + i4);
        }
        Objects.requireNonNull(iAccountManagerResponse, "response cannot be null");
        Objects.requireNonNull(str, "accountType cannot be null");
        if (!isCrossUser(i5, i4)) {
            if (!canUserModifyAccounts(i4, i5)) {
                try {
                    iAccountManagerResponse.onError(100, "User is not allowed to add an account!");
                } catch (RemoteException unused) {
                }
                showCantAddAccount(100, i4);
                return;
            } else if (!canUserModifyAccountsForType(i4, str, i5)) {
                try {
                    iAccountManagerResponse.onError(101, "User cannot modify accounts of this type (policy).");
                } catch (RemoteException unused2) {
                }
                showCantAddAccount(101, i4);
                return;
            } else {
                int i6 = b5.f67822b;
                int i7 = b5.f67823c;
                Bundle bundle2 = bundle == null ? new Bundle() : bundle;
                bundle2.putInt("callerUid", i7);
                bundle2.putInt("callerPid", i6);
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    new p(getUserAccounts(i4), iAccountManagerResponse, str, z4, true, null, false, true, str2, strArr, bundle2, str).bind();
                    return;
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
        }
        throw new SecurityException(String.format("User %s trying to add account for %s", Integer.valueOf(b5.f67824d), Integer.valueOf(i4)));
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public boolean addAccountExplicitly(Account account, String str, Bundle bundle) {
        return addAccountExplicitlyWithVisibility(account, str, bundle, null);
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public boolean addAccountExplicitlyWithVisibility(Account account, String str, Bundle bundle, Map map) {
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        int i4 = b5.f67823c;
        int i5 = b5.f67824d;
        if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
            com.xinzhu.overmind.utils.n.i(TAG, "addAccountExplicitly: " + account + ", caller's uid " + i4 + ", pid " + Binder.getCallingPid());
        }
        Objects.requireNonNull(account, "account cannot be null");
        if (isAccountManagedByCaller(account.type, i4, i5)) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return addAccountInternal(getUserAccounts(i5), account, str, bundle, i4, map);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        throw new SecurityException(String.format("uid %s cannot explicitly add accounts of type: %s", Integer.valueOf(i4), account.type));
    }

    public void addOnAppPermissionChangeListener(v vVar) {
        this.mAppPermissionChangeListeners.add(vVar);
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public boolean addSharedAccountAsUser(Account account, int i4) throws RemoteException {
        throw new RuntimeException("Not implemented.");
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void addSharedAccountsFromParentUser(int i4, int i5, String str) {
        throw new RuntimeException("Not implemented.");
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void clearPassword(Account account) {
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        int i4 = b5.f67823c;
        if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
            com.xinzhu.overmind.utils.n.i(TAG, "clearPassword: " + account + ", caller's uid " + i4 + ", pid " + Binder.getCallingPid());
        }
        Objects.requireNonNull(account, "account cannot be null");
        int i5 = b5.f67824d;
        if (isAccountManagedByCaller(account.type, i4, i5)) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                setPasswordInternal(getUserAccounts(i5), account, null, i4);
                return;
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        throw new SecurityException(String.format("uid %s cannot clear passwords for accounts of type: %s", Integer.valueOf(i4), account.type));
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void confirmCredentialsAsUser(IAccountManagerResponse iAccountManagerResponse, Account account, Bundle bundle, boolean z4, int i4) {
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        int i5 = b5.f67823c;
        if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
            com.xinzhu.overmind.utils.n.i(TAG, "confirmCredentials: " + account + ", response " + iAccountManagerResponse + ", expectActivityLaunch " + z4 + ", caller's uid " + i5 + ", pid " + b5.f67822b);
        }
        if (isCrossUser(i5, i4)) {
            throw new SecurityException(String.format("User %s trying to confirm account credentials for %s", Integer.valueOf(b5.f67824d), Integer.valueOf(i4)));
        }
        if (iAccountManagerResponse == null) {
            throw new IllegalArgumentException("response is null");
        }
        if (account != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                new b(getUserAccounts(i4), iAccountManagerResponse, account.type, z4, true, account.name, true, true, account, bundle).bind();
                return;
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        throw new IllegalArgumentException("account is null");
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void copyAccountToUser(IAccountManagerResponse iAccountManagerResponse, Account account, int i4, int i5) {
        if (!isCrossUser(BinderHelper.b().f67823c, -1)) {
            a0 userAccounts = getUserAccounts(i4);
            a0 userAccounts2 = getUserAccounts(i5);
            if (userAccounts == null || userAccounts2 == null) {
                if (iAccountManagerResponse != null) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("booleanResult", false);
                    try {
                        iAccountManagerResponse.onResult(bundle);
                        return;
                    } catch (RemoteException e5) {
                        com.xinzhu.overmind.utils.v.j(TAG, "Failed to report error back to the client." + e5);
                        return;
                    }
                }
                return;
            }
            com.xinzhu.overmind.utils.v.a(TAG, "Copying account " + account.toString() + " from user " + i4 + " to user " + i5);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                new m(userAccounts, iAccountManagerResponse, account.type, false, false, account.name, false, account, iAccountManagerResponse, userAccounts2, i4).bind();
                return;
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        throw new SecurityException("Calling copyAccountToUser requires android.Manifest.permission.INTERACT_ACROSS_USERS_FULL");
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public IntentSender createRequestAccountAccessIntentSenderAsUser(Account account, String str, UserHandle userHandle) {
        if (MindUserHandle.a(BinderHelper.b().f67823c) == 1000) {
            Objects.requireNonNull(account, "account cannot be null");
            Objects.requireNonNull(str, "packageName cannot be null");
            Objects.requireNonNull(userHandle, "userHandle cannot be null");
            int identifier = new com.xinzhu.haunted.android.os.w(userHandle).getIdentifier();
            if (identifier >= 0) {
                int packageUid = com.xinzhu.overmind.server.pm.i.get().getPackageUid(str, 0, identifier);
                if (packageUid == -1) {
                    com.xinzhu.overmind.utils.v.c(TAG, "Unknown package " + str);
                    return null;
                }
                Intent newRequestAccountAccessIntent = newRequestAccountAccessIntent(account, str, packageUid, null);
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    return com.xinzhu.haunted.android.app.w.c(Overmind.getContext(), 0, newRequestAccountAccessIntent, 1342177280, null, new MindUserHandle(identifier).v()).getIntentSender();
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            throw new IllegalArgumentException("user must be concrete");
        }
        throw new SecurityException("Can be called only by system UID");
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void editProperties(IAccountManagerResponse iAccountManagerResponse, String str, boolean z4) {
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        int i4 = b5.f67823c;
        if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
            com.xinzhu.overmind.utils.n.i(TAG, "editProperties: accountType " + str + ", response " + iAccountManagerResponse + ", expectActivityLaunch " + z4 + ", caller's uid " + i4 + ", pid " + Binder.getCallingPid());
        }
        if (iAccountManagerResponse == null) {
            throw new IllegalArgumentException("response is null");
        }
        if (str != null) {
            int i5 = b5.f67824d;
            if (!isAccountManagedByCaller(str, i4, i5) && !isSystemUid(i4)) {
                throw new SecurityException(String.format("uid %s cannot edit authenticator properites for account type: %s", Integer.valueOf(i4), str));
            }
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                new a(getUserAccounts(i5), iAccountManagerResponse, str, z4, true, null, false, str).bind();
                return;
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        throw new IllegalArgumentException("accountType is null");
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void finishSessionAsUser(IAccountManagerResponse iAccountManagerResponse, Bundle bundle, boolean z4, Bundle bundle2, int i4) {
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        int i5 = b5.f67823c;
        if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
            com.xinzhu.overmind.utils.n.i(TAG, "finishSession: response " + iAccountManagerResponse + ", expectActivityLaunch " + z4 + ", caller's uid " + i5 + ", caller's user id " + b5.f67824d + ", pid " + Binder.getCallingPid() + ", for user id " + i4);
        }
        Objects.requireNonNull(iAccountManagerResponse, "response cannot be null");
        if (bundle != null && bundle.size() != 0) {
            if (!isCrossUser(i5, i4)) {
                if (!canUserModifyAccounts(i4, i5)) {
                    sendErrorResponse(iAccountManagerResponse, 100, "User is not allowed to add an account!");
                    showCantAddAccount(100, i4);
                    return;
                }
                int callingPid = Binder.getCallingPid();
                try {
                    Bundle c5 = com.xinzhu.overmind.server.accounts.c.e().c(bundle);
                    if (c5 == null) {
                        sendErrorResponse(iAccountManagerResponse, 8, "failed to decrypt session bundle");
                        return;
                    }
                    String string = c5.getString("accountType");
                    if (TextUtils.isEmpty(string)) {
                        sendErrorResponse(iAccountManagerResponse, 7, "accountType is empty");
                        return;
                    }
                    if (bundle2 != null) {
                        c5.putAll(bundle2);
                    }
                    c5.putInt("callerUid", i5);
                    c5.putInt("callerPid", callingPid);
                    if (!canUserModifyAccountsForType(i4, string, i5)) {
                        sendErrorResponse(iAccountManagerResponse, 101, "User cannot modify accounts of this type (policy).");
                        showCantAddAccount(101, i4);
                        return;
                    }
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        new f(getUserAccounts(i4), iAccountManagerResponse, string, z4, true, null, false, true, c5, string).bind();
                        return;
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                } catch (GeneralSecurityException e5) {
                    if (com.xinzhu.overmind.utils.n.g(TAG, 3)) {
                        com.xinzhu.overmind.utils.n.j(TAG, "Failed to decrypt session bundle!", e5);
                    }
                    sendErrorResponse(iAccountManagerResponse, 8, "failed to decrypt session bundle");
                    return;
                }
            }
            throw new SecurityException(String.format("User %s trying to finish session for %s without cross user permission", Integer.valueOf(b5.f67824d), Integer.valueOf(i4)));
        }
        throw new IllegalArgumentException("sessionBundle is empty");
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void getAccountByTypeAndFeatures(IAccountManagerResponse iAccountManagerResponse, String str, String[] strArr, String str2) {
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        int i4 = b5.f67823c;
        if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
            com.xinzhu.overmind.utils.n.i(TAG, "getAccount: accountType " + str + ", response " + iAccountManagerResponse + ", features " + Arrays.toString(strArr) + ", caller's uid " + i4 + ", pid " + Binder.getCallingPid());
        }
        if (iAccountManagerResponse == null) {
            throw new IllegalArgumentException("response is null");
        }
        if (str != null) {
            int i5 = b5.f67824d;
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                a0 userAccounts = getUserAccounts(i5);
                if (com.xinzhu.overmind.utils.d.o(strArr)) {
                    handleGetAccountsResult(iAccountManagerResponse, getAccountsFromCache(userAccounts, str, i4, str2, true), str2);
                    return;
                } else {
                    new s(userAccounts, new k(iAccountManagerResponse, str2), str, strArr, i4, str2, true).bind();
                    return;
                }
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        throw new IllegalArgumentException("accountType is null");
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public int getAccountVisibility(Account account, String str) {
        Objects.requireNonNull(account, "account cannot be null");
        Objects.requireNonNull(str, "packageName cannot be null");
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        int i4 = b5.f67823c;
        int i5 = b5.f67824d;
        if (!isAccountManagedByCaller(account.type, i4, i5) && !isSystemUid(i4)) {
            throw new SecurityException(String.format("uid %s cannot get secrets for accounts of type: %s", Integer.valueOf(i4), account.type));
        }
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            a0 userAccounts = getUserAccounts(i5);
            if (PACKAGE_NAME_KEY_LEGACY_VISIBLE.equals(str)) {
                int accountVisibilityFromCache = getAccountVisibilityFromCache(account, str, userAccounts);
                if (accountVisibilityFromCache != 0) {
                    return accountVisibilityFromCache;
                }
                return 2;
            } else if (PACKAGE_NAME_KEY_LEGACY_NOT_VISIBLE.equals(str)) {
                int accountVisibilityFromCache2 = getAccountVisibilityFromCache(account, str, userAccounts);
                if (accountVisibilityFromCache2 != 0) {
                    return accountVisibilityFromCache2;
                }
                return 4;
            } else {
                return resolveAccountVisibility(account, str, userAccounts).intValue();
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public Account[] getAccounts(int i4, String str) {
        int i5 = BinderHelper.b().f67823c;
        List<String> typesVisibleToCaller = getTypesVisibleToCaller(i5, i4, str);
        if (typesVisibleToCaller.isEmpty()) {
            return EMPTY_ACCOUNT_ARRAY;
        }
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            return getAccountsInternal(getUserAccounts(i4), i5, str, typesVisibleToCaller, false);
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public Account[] getAccountsAsUser(String str, int i4, String str2) {
        return getAccountsAsUserForPackage(str, i4, str2, -1, str2, false);
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void getAccountsByFeatures(IAccountManagerResponse iAccountManagerResponse, String str, String[] strArr, String str2) {
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        int i4 = b5.f67823c;
        if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
            com.xinzhu.overmind.utils.n.i(TAG, "getAccounts: accountType " + str + ", response " + iAccountManagerResponse + ", features " + Arrays.toString(strArr) + ", caller's uid " + i4 + ", pid " + Binder.getCallingPid());
        }
        if (iAccountManagerResponse == null) {
            throw new IllegalArgumentException("response is null");
        }
        if (str != null) {
            int i5 = b5.f67824d;
            if (!getTypesVisibleToCaller(i4, i5, str2).contains(str)) {
                Bundle bundle = new Bundle();
                bundle.putParcelableArray("accounts", EMPTY_ACCOUNT_ARRAY);
                try {
                    iAccountManagerResponse.onResult(bundle);
                    return;
                } catch (RemoteException e5) {
                    com.xinzhu.overmind.utils.n.d(TAG, "Cannot respond to caller do to exception.", e5);
                    return;
                }
            }
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                a0 userAccounts = getUserAccounts(i5);
                if (strArr != null && strArr.length != 0) {
                    new s(userAccounts, iAccountManagerResponse, str, strArr, i4, str2, false).bind();
                    return;
                }
                Account[] accountsFromCache = getAccountsFromCache(userAccounts, str, i4, str2, false);
                Bundle bundle2 = new Bundle();
                bundle2.putParcelableArray("accounts", accountsFromCache);
                onResult(iAccountManagerResponse, bundle2);
                return;
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        throw new IllegalArgumentException("accountType is null");
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public Account[] getAccountsByTypeForPackage(String str, String str2, String str3) {
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        int i4 = b5.f67823c;
        int i5 = b5.f67824d;
        int packageUid = com.xinzhu.overmind.server.pm.i.get().getPackageUid(str2, 0, i5);
        if (packageUid == -1) {
            com.xinzhu.overmind.utils.v.c(TAG, "Couldn't determine the packageUid for " + str2);
            return EMPTY_ACCOUNT_ARRAY;
        } else if (!MindUserHandle.o(i4, 1000) && str != null && !isAccountManagedByCaller(str, i4, i5)) {
            return EMPTY_ACCOUNT_ARRAY;
        } else {
            if (!MindUserHandle.o(i4, 1000) && str == null) {
                return getAccountsAsUserForPackage(str, i5, str2, packageUid, str3, false);
            }
            return getAccountsAsUserForPackage(str, i5, str2, packageUid, str3, true);
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public Account[] getAccountsForPackage(String str, int i4, String str2) {
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        int i5 = b5.f67823c;
        if (MindUserHandle.o(i5, 1000)) {
            return getAccountsAsUserForPackage(null, b5.f67824d, str, i4, str2, true);
        }
        throw new SecurityException("getAccountsForPackage() called from unauthorized uid " + i5 + " with uid=" + i4);
    }

    protected Account[] getAccountsFromCache(a0 a0Var, String str, int i4, String str2, boolean z4) {
        Account[] accountArr;
        if (str != null) {
            synchronized (a0Var.f67845b) {
                accountArr = a0Var.f67849f.get(str);
            }
            if (accountArr == null) {
                return EMPTY_ACCOUNT_ARRAY;
            }
            return filterAccounts(a0Var, (Account[]) Arrays.copyOf(accountArr, accountArr.length), i4, str2, z4);
        }
        synchronized (a0Var.f67845b) {
            int i5 = 0;
            for (Account[] accountArr2 : a0Var.f67849f.values()) {
                i5 += accountArr2.length;
            }
            if (i5 == 0) {
                return EMPTY_ACCOUNT_ARRAY;
            }
            Account[] accountArr3 = new Account[i5];
            int i6 = 0;
            for (Account[] accountArr4 : a0Var.f67849f.values()) {
                System.arraycopy(accountArr4, 0, accountArr3, i6, accountArr4.length);
                i6 += accountArr4.length;
            }
            return filterAccounts(a0Var, accountArr3, i4, str2, z4);
        }
    }

    public r[] getAllAccounts() {
        List<MindUserInfo> f5 = com.xinzhu.overmind.client.frameworks.i.d().f();
        int size = f5.size();
        int[] iArr = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr[i4] = f5.get(i4).f68255b;
        }
        return getAccounts(iArr);
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void getAuthToken(IAccountManagerResponse iAccountManagerResponse, Account account, String str, boolean z4, boolean z5, Bundle bundle, int i4) {
        a0 a0Var;
        String readAuthTokenInternal;
        if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
            com.xinzhu.overmind.utils.n.i(TAG, "getAuthToken: " + account + ", response " + iAccountManagerResponse + ", authTokenType " + str + ", notifyOnAuthFailure " + z4 + ", expectActivityLaunch " + z5 + ", caller's uid " + BinderHelper.b().f67823c + ", pid " + Binder.getCallingPid());
        }
        Objects.requireNonNull(iAccountManagerResponse, "response cannot be null");
        try {
            if (account == null) {
                com.xinzhu.overmind.utils.v.j(TAG, "getAuthToken called with null account");
                iAccountManagerResponse.onError(7, "account is null");
            } else if (str == null) {
                com.xinzhu.overmind.utils.v.j(TAG, "getAuthToken called with null authTokenType");
                iAccountManagerResponse.onError(7, "authTokenType is null");
            } else {
                int i5 = BinderHelper.b().f67824d;
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    a0 userAccounts = getUserAccounts(i5);
                    m.d<AuthenticatorDescription> d5 = this.mAuthenticatorCache.d(AuthenticatorDescription.newKey(account.type), userAccounts.f67844a);
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    boolean z6 = d5 != null && d5.f68222a.customTokens;
                    boolean z7 = z6 || permissionIsGranted(account, str, i4, i5);
                    String string = bundle.getString("androidPackageName");
                    clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        List asList = Arrays.asList(com.xinzhu.overmind.server.pm.i.get().getPackagesForUid(i4));
                        if (string != null && asList.contains(string)) {
                            bundle.putInt("callerUid", i4);
                            bundle.putInt("callerPid", Binder.getCallingPid());
                            if (z4) {
                                bundle.putBoolean(KEY_NOTIFY_ON_FAILURE, true);
                            }
                            clearCallingIdentity = Binder.clearCallingIdentity();
                            try {
                                byte[] calculatePackageSignatureDigest = calculatePackageSignatureDigest(string);
                                if (!z6 && z7 && (readAuthTokenInternal = readAuthTokenInternal(userAccounts, account, str)) != null) {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("authtoken", readAuthTokenInternal);
                                    bundle2.putString("authAccount", account.name);
                                    bundle2.putString("accountType", account.type);
                                    onResult(iAccountManagerResponse, bundle2);
                                    return;
                                }
                                if (z6) {
                                    a0Var = userAccounts;
                                    String readCachedTokenInternal = readCachedTokenInternal(userAccounts, account, str, string, calculatePackageSignatureDigest);
                                    if (readCachedTokenInternal != null) {
                                        if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
                                            com.xinzhu.overmind.utils.n.i(TAG, "getAuthToken: cache hit ofr custom token authenticator.");
                                        }
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putString("authtoken", readCachedTokenInternal);
                                        bundle3.putString("authAccount", account.name);
                                        bundle3.putString("accountType", account.type);
                                        onResult(iAccountManagerResponse, bundle3);
                                        return;
                                    }
                                } else {
                                    a0Var = userAccounts;
                                }
                                new n(a0Var, iAccountManagerResponse, account.type, z5, false, account.name, false, bundle, account, str, z4, z7, i4, z6, string, calculatePackageSignatureDigest, a0Var).bind();
                                return;
                            } finally {
                            }
                        }
                        throw new SecurityException(String.format("Uid %s is attempting to illegally masquerade as package %s!", Integer.valueOf(i4), string));
                    } finally {
                    }
                } finally {
                }
            }
        } catch (RemoteException e5) {
            com.xinzhu.overmind.utils.v.j(TAG, "Failed to report error back to the client." + e5);
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void getAuthTokenLabel(IAccountManagerResponse iAccountManagerResponse, String str, String str2) {
        Objects.requireNonNull(str, "accountType cannot be null");
        Objects.requireNonNull(str2, "authTokenType cannot be null");
        int callingUid = Binder.getCallingUid();
        Binder.clearCallingIdentity();
        if (MindUserHandle.a(callingUid) == 1000) {
            int k4 = MindUserHandle.k(callingUid);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                new c(getUserAccounts(k4), iAccountManagerResponse, str, false, false, null, false, str, str2).bind();
                return;
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        throw new SecurityException("can only call from system");
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public AuthenticatorDescription[] getAuthenticatorTypes(int i4) {
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        int i5 = b5.f67823c;
        if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
            com.xinzhu.overmind.utils.n.i(TAG, "getAuthenticatorTypes: for user id " + i4 + " caller's uid " + i5 + ", pid " + Binder.getCallingPid());
        }
        if (!isCrossUser(i5, i4)) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return getAuthenticatorTypesInternal(i4);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        throw new SecurityException(String.format("User %s tying to get authenticator types for %s", Integer.valueOf(b5.f67824d), Integer.valueOf(i4)));
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public Map<String, Integer> getPackagesAndVisibilityForAccount(Account account) {
        Map<String, Integer> packagesAndVisibilityForAccountLocked;
        Objects.requireNonNull(account, "account cannot be null");
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        int i4 = b5.f67823c;
        int i5 = b5.f67824d;
        if (!isAccountManagedByCaller(account.type, i4, i5) && !isSystemUid(i4)) {
            throw new SecurityException(String.format("uid %s cannot get secrets for account %s", Integer.valueOf(i4), account));
        }
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            a0 userAccounts = getUserAccounts(i5);
            synchronized (userAccounts.f67845b) {
                packagesAndVisibilityForAccountLocked = getPackagesAndVisibilityForAccountLocked(account, userAccounts);
            }
            return packagesAndVisibilityForAccountLocked;
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public String getPassword(Account account) {
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        int i4 = b5.f67823c;
        if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
            com.xinzhu.overmind.utils.n.i(TAG, "getPassword: " + account + ", caller's uid " + b5.f67823c + ", pid " + b5.f67822b);
        }
        if (account != null) {
            int i5 = b5.f67824d;
            if (isAccountManagedByCaller(account.type, i4, i5)) {
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    return readPasswordInternal(getUserAccounts(i5), account);
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            throw new SecurityException(String.format("uid %s cannot get secrets for accounts of type: %s", Integer.valueOf(i4), account.type));
        }
        throw new IllegalArgumentException("account is null");
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public String getPreviousName(Account account) {
        if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
            com.xinzhu.overmind.utils.n.i(TAG, "getPreviousName: " + account + ", caller's uid " + BinderHelper.b().f67823c + ", pid " + Binder.getCallingPid());
        }
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        Objects.requireNonNull(account, "account cannot be null");
        int i4 = b5.f67824d;
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            return readPreviousNameInternal(getUserAccounts(i4), account);
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public Account[] getSharedAccountsAsUser(int i4) throws RemoteException {
        throw new RuntimeException("Not implemented.");
    }

    protected a0 getUserAccounts(int i4) {
        a0 a0Var;
        synchronized (this.mUsers) {
            a0Var = this.mUsers.get(i4);
            if (a0Var == null) {
                a0Var = new a0(i4);
                this.mUsers.append(i4, a0Var);
                purgeOldGrants(a0Var);
            }
        }
        return a0Var;
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public String getUserData(Account account, String str) {
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        int i4 = b5.f67823c;
        if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
            com.xinzhu.overmind.utils.n.i(TAG, String.format("getUserData( account: %s, key: %s, callerUid: %s, pid: %s", account, str, Integer.valueOf(i4), Integer.valueOf(Binder.getCallingPid())));
        }
        Objects.requireNonNull(account, "account cannot be null");
        Objects.requireNonNull(str, "key cannot be null");
        int i5 = b5.f67824d;
        if (isAccountManagedByCaller(account.type, i4, i5)) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return readUserDataInternal(getUserAccounts(i5), account, str);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        throw new SecurityException(String.format("uid %s cannot get user data for accounts of type: %s", Integer.valueOf(i4), account.type));
    }

    void grantAppPermission(final Account account, String str, final int i4) {
        if (account != null && str != null) {
            a0 userAccounts = getUserAccounts(MindUserHandle.k(i4));
            synchronized (userAccounts.f67845b) {
                userAccounts.q(account, str, i4);
                saveUidGrantsLocked(userAccounts);
                cancelNotification(getCredentialPermissionNotificationId(account, str, i4), MindUserHandle.s(userAccounts.f67844a));
                cancelAccountAccessRequestNotificationIfNeeded(account, i4, true);
            }
            Iterator<v> it2 = this.mAppPermissionChangeListeners.iterator();
            while (it2.hasNext()) {
                final v next = it2.next();
                this.mHandler.post(new Runnable() { // from class: com.xinzhu.overmind.server.accounts.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        MindAccountManagerService.v.this.a(account, i4);
                    }
                });
            }
            return;
        }
        com.xinzhu.overmind.utils.n.d(TAG, "grantAppPermission: called with invalid arguments", new Exception());
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void hasFeatures(IAccountManagerResponse iAccountManagerResponse, Account account, String[] strArr, String str) {
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
            com.xinzhu.overmind.utils.n.i(TAG, "hasFeatures: " + account + ", response " + iAccountManagerResponse + ", features " + Arrays.toString(strArr) + ", caller's uid " + b5.f67823c + ", pid " + Binder.getCallingPid());
        }
        Objects.requireNonNull(account, "account cannot be null");
        Objects.requireNonNull(iAccountManagerResponse, "response cannot be null");
        Objects.requireNonNull(strArr, "features cannot be null");
        int i4 = b5.f67824d;
        checkReadAccountsPermitted(b5.f67823c, account.type, i4, str);
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            new z(getUserAccounts(i4), iAccountManagerResponse, account, strArr).bind();
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void invalidateAuthToken(String str, String str2) {
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        int i4 = b5.f67823c;
        Objects.requireNonNull(str, "accountType cannot be null");
        Objects.requireNonNull(str2, "authToken cannot be null");
        if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
            com.xinzhu.overmind.utils.n.i(TAG, "invalidateAuthToken: accountType " + str + ", caller's uid " + i4 + ", pid " + Binder.getCallingPid());
        }
        int i5 = b5.f67824d;
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            a0 userAccounts = getUserAccounts(i5);
            synchronized (userAccounts.f67845b) {
                for (Pair<Account, String> pair : invalidateAuthTokenLocked(userAccounts, str, str2)) {
                    writeAuthTokenIntoCacheLocked(userAccounts, (Account) pair.first, (String) pair.second, null);
                }
                userAccounts.f67852i.d(str, str2);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void isCredentialsUpdateSuggested(IAccountManagerResponse iAccountManagerResponse, Account account, String str) {
        if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
            com.xinzhu.overmind.utils.n.i(TAG, "isCredentialsUpdateSuggested: " + account + ", response " + iAccountManagerResponse + ", caller's uid " + BinderHelper.b().f67823c + ", pid " + Binder.getCallingPid());
        }
        if (iAccountManagerResponse == null) {
            throw new IllegalArgumentException("response is null");
        }
        if (account != null) {
            if (!TextUtils.isEmpty(str)) {
                int i4 = BinderHelper.b().f67824d;
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    new g(getUserAccounts(i4), iAccountManagerResponse, account.type, false, false, account.name, false, account, str).bind();
                    return;
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            throw new IllegalArgumentException("status token is empty");
        }
        throw new IllegalArgumentException("account is null");
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void onAccountAccessed(String str) {
        Account[] accounts;
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        int i4 = b5.f67823c;
        if (MindUserHandle.a(i4) == 1000) {
            return;
        }
        int i5 = b5.f67824d;
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            for (Account account : getAccounts(i5, q.a.f73126a)) {
                if (Objects.equals(new com.xinzhu.haunted.android.accounts.a(account).h(), str) && !hasAccountAccess(account, (String) null, i4)) {
                    updateAppPermission(account, ACCOUNT_ACCESS_TOKEN_TYPE, i4, true);
                }
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public String peekAuthToken(Account account, String str) {
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        int i4 = b5.f67823c;
        if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
            com.xinzhu.overmind.utils.n.i(TAG, "peekAuthToken: " + account + ", authTokenType " + str + ", caller's uid " + i4 + ", pid " + Binder.getCallingPid());
        }
        Objects.requireNonNull(account, "account cannot be null");
        Objects.requireNonNull(str, "authTokenType cannot be null");
        int i5 = b5.f67824d;
        if (isAccountManagedByCaller(account.type, i4, i5)) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return readAuthTokenInternal(getUserAccounts(i5), account, str);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        throw new SecurityException(String.format("uid %s cannot peek the authtokens associated with accounts of type: %s", Integer.valueOf(i4), account.type));
    }

    protected String readAuthTokenInternal(a0 a0Var, Account account, String str) {
        synchronized (a0Var.f67845b) {
            Map map = (Map) a0Var.f67851h.get(account);
            if (map != null) {
                return (String) map.get(str);
            }
            return null;
        }
    }

    protected String readCachedTokenInternal(a0 a0Var, Account account, String str, String str2, byte[] bArr) {
        String a5;
        synchronized (a0Var.f67845b) {
            a5 = a0Var.f67852i.a(account, str, str2, bArr);
        }
        return a5;
    }

    public String readUserDataInternal(a0 a0Var, Account account, String str) {
        synchronized (a0Var.f67845b) {
            Map map = (Map) a0Var.f67850g.get(account);
            if (map == null) {
                return null;
            }
            return (String) map.get(str);
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void removeAccountAsUser(IAccountManagerResponse iAccountManagerResponse, Account account, boolean z4, int i4) {
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        int i5 = b5.f67823c;
        if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
            com.xinzhu.overmind.utils.n.i(TAG, "removeAccount: " + account + ", response " + iAccountManagerResponse + ", caller's uid " + i5 + ", pid " + Binder.getCallingPid() + ", for user id " + i4);
        }
        Objects.requireNonNull(account, "account cannot be null");
        Objects.requireNonNull(iAccountManagerResponse, "response cannot be null");
        if (!isCrossUser(i5, i4)) {
            if (isAccountManagedByCaller(account.type, i5, i4)) {
                long clearCallingIdentity = Binder.clearCallingIdentity();
                a0 userAccounts = getUserAccounts(i4);
                MindUserHandle mindUserHandle = new MindUserHandle(i4);
                cancelNotification(getSigninRequiredNotificationId(userAccounts, account), mindUserHandle);
                synchronized (userAccounts.f67847d) {
                    for (Pair pair : userAccounts.f67847d.keySet()) {
                        if (account.equals(((Pair) pair.first).first)) {
                            cancelNotification((u) userAccounts.f67847d.get(pair), mindUserHandle);
                        }
                    }
                }
                try {
                    new w(userAccounts, iAccountManagerResponse, account, z4).bind();
                    return;
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            throw new SecurityException(String.format("uid %s cannot remove accounts of type: %s", Integer.valueOf(i5), account.type));
        }
        throw new SecurityException(String.format("User %s tying remove account for %s", Integer.valueOf(b5.f67824d), Integer.valueOf(i4)));
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public boolean removeAccountExplicitly(Account account) {
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        int i4 = b5.f67823c;
        if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
            com.xinzhu.overmind.utils.n.i(TAG, "removeAccountExplicitly: " + account + ", caller's uid " + i4 + ", pid " + Binder.getCallingPid());
        }
        int i5 = b5.f67824d;
        if (account == null) {
            com.xinzhu.overmind.utils.n.c(TAG, "account is null");
            return false;
        } else if (isAccountManagedByCaller(account.type, i4, i5)) {
            a0 userAccountsForCaller = getUserAccountsForCaller();
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return removeAccountInternal(userAccountsForCaller, account, i4);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } else {
            throw new SecurityException(String.format("uid %s cannot explicitly remove accounts of type: %s", Integer.valueOf(i4), account.type));
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public boolean removeSharedAccountAsUser(Account account, int i4) throws RemoteException {
        throw new RuntimeException("Not implemented.");
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void renameAccount(IAccountManagerResponse iAccountManagerResponse, Account account, String str) {
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        int i4 = b5.f67823c;
        if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
            com.xinzhu.overmind.utils.n.i(TAG, "renameAccount: " + account + " -> " + str + ", caller's uid " + i4 + ", pid " + Binder.getCallingPid());
        }
        if (account != null) {
            int i5 = b5.f67824d;
            if (isAccountManagedByCaller(account.type, i4, i5)) {
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    Account renameAccountInternal = renameAccountInternal(getUserAccounts(i5), account, str);
                    Bundle bundle = new Bundle();
                    bundle.putString("authAccount", renameAccountInternal.name);
                    bundle.putString("accountType", renameAccountInternal.type);
                    bundle.putString(KEY_ACCOUNT_ACCESS_ID, new com.xinzhu.haunted.android.accounts.a(renameAccountInternal).h());
                    try {
                        iAccountManagerResponse.onResult(bundle);
                    } catch (RemoteException e5) {
                        com.xinzhu.overmind.utils.n.k(TAG, e5.getMessage());
                    }
                    return;
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            throw new SecurityException(String.format("uid %s cannot rename accounts of type: %s", Integer.valueOf(i4), account.type));
        }
        throw new IllegalArgumentException("account is null");
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public boolean renameSharedAccountAsUser(Account account, String str, int i4) throws RemoteException {
        throw new RuntimeException("Not implemented.");
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void setAuthToken(Account account, String str, String str2) {
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        int i4 = b5.f67823c;
        if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
            com.xinzhu.overmind.utils.n.i(TAG, "setAuthToken: " + account + ", authTokenType " + str + ", caller's uid " + i4 + ", pid " + Binder.getCallingPid());
        }
        Objects.requireNonNull(account, "account cannot be null");
        Objects.requireNonNull(str, "authTokenType cannot be null");
        int i5 = b5.f67824d;
        if (isAccountManagedByCaller(account.type, i4, i5)) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                saveAuthTokenToDatabase(getUserAccounts(i5), account, str, str2);
                return;
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        throw new SecurityException(String.format("uid %s cannot set auth tokens associated with accounts of type: %s", Integer.valueOf(i4), account.type));
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void setPassword(Account account, String str) {
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        int i4 = b5.f67823c;
        if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
            com.xinzhu.overmind.utils.n.i(TAG, "setAuthToken: " + account + ", caller's uid " + i4 + ", pid " + Binder.getCallingPid());
        }
        Objects.requireNonNull(account, "account cannot be null");
        int i5 = b5.f67824d;
        if (isAccountManagedByCaller(account.type, i4, i5)) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                setPasswordInternal(getUserAccounts(i5), account, str, i4);
                return;
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        throw new SecurityException(String.format("uid %s cannot set secrets for accounts of type: %s", Integer.valueOf(i4), account.type));
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void setUserData(Account account, String str, String str2) {
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        int i4 = b5.f67823c;
        if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
            com.xinzhu.overmind.utils.n.i(TAG, "setUserData: " + account + ", key " + str + ", caller's uid " + i4 + ", pid " + Binder.getCallingPid());
        }
        if (str == null) {
            throw new IllegalArgumentException("key is null");
        }
        if (account != null) {
            int i5 = b5.f67824d;
            if (isAccountManagedByCaller(account.type, i4, i5)) {
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    a0 userAccounts = getUserAccounts(i5);
                    if (accountExistsCache(userAccounts, account)) {
                        setUserdataInternal(userAccounts, account, str, str2);
                        return;
                    }
                    return;
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            throw new SecurityException(String.format("uid %s cannot set user data for accounts of type: %s", Integer.valueOf(i4), account.type));
        }
        throw new IllegalArgumentException("account is null");
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public boolean someUserHasAccount(Account account) {
        if (MindUserHandle.o(1000, BinderHelper.b().f67823c)) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                r[] allAccounts = getAllAccounts();
                for (int length = allAccounts.length - 1; length >= 0; length--) {
                    if (allAccounts[length].f67861a.equals(account)) {
                        return true;
                    }
                }
                return false;
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        throw new SecurityException("Only system can check for accounts across users");
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void startAddAccountSession(IAccountManagerResponse iAccountManagerResponse, String str, String str2, String[] strArr, boolean z4, Bundle bundle) {
        if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
            com.xinzhu.overmind.utils.n.i(TAG, "startAddAccountSession: accountType " + str + ", response " + iAccountManagerResponse + ", authTokenType " + str2 + ", requiredFeatures " + Arrays.toString(strArr) + ", expectActivityLaunch " + z4 + ", caller's uid " + BinderHelper.b().f67823c + ", pid " + Binder.getCallingPid());
        }
        Objects.requireNonNull(iAccountManagerResponse, "response cannot be null");
        Objects.requireNonNull(str, "accountType cannot be null");
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        int i4 = b5.f67823c;
        int i5 = b5.f67824d;
        if (!canUserModifyAccounts(i5, i4)) {
            try {
                iAccountManagerResponse.onError(100, "User is not allowed to add an account!");
            } catch (RemoteException unused) {
            }
            showCantAddAccount(100, i5);
        } else if (!canUserModifyAccountsForType(i5, str, i4)) {
            try {
                iAccountManagerResponse.onError(101, "User cannot modify accounts of this type (policy).");
            } catch (RemoteException unused2) {
            }
            showCantAddAccount(101, i5);
        } else {
            int callingPid = Binder.getCallingPid();
            Bundle bundle2 = bundle == null ? new Bundle() : bundle;
            bundle2.putInt("callerUid", i4);
            bundle2.putInt("callerPid", callingPid);
            bundle2.getString("androidPackageName");
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                new d(getUserAccounts(i5), iAccountManagerResponse, str, z4, null, false, true, false, str2, strArr, bundle2, str).bind();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void startUpdateCredentialsSession(IAccountManagerResponse iAccountManagerResponse, Account account, String str, boolean z4, Bundle bundle) {
        if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
            com.xinzhu.overmind.utils.n.i(TAG, "startUpdateCredentialsSession: " + account + ", response " + iAccountManagerResponse + ", authTokenType " + str + ", expectActivityLaunch " + z4 + ", caller's uid " + BinderHelper.b().f67823c + ", pid " + Binder.getCallingPid());
        }
        if (iAccountManagerResponse == null) {
            throw new IllegalArgumentException("response is null");
        }
        if (account != null) {
            BinderHelper.CallingInfo b5 = BinderHelper.b();
            int i4 = b5.f67823c;
            int i5 = b5.f67824d;
            bundle.getString("androidPackageName");
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                new e(getUserAccounts(i5), iAccountManagerResponse, account.type, z4, account.name, false, true, false, account, str, bundle).bind();
                return;
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        throw new IllegalArgumentException("account is null");
    }

    @Override // com.xinzhu.overmind.server.d
    public void systemReady() {
        loadAllAccounts();
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void updateAppPermission(Account account, String str, int i4, boolean z4) {
        if (MindUserHandle.a(BinderHelper.b().f67823c) != 1000) {
            throw new SecurityException();
        }
        if (z4) {
            grantAppPermission(account, str, i4);
        } else {
            revokeAppPermission(account, str, i4);
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void updateCredentials(IAccountManagerResponse iAccountManagerResponse, Account account, String str, boolean z4, Bundle bundle) {
        if (com.xinzhu.overmind.utils.n.g(TAG, 2)) {
            com.xinzhu.overmind.utils.n.i(TAG, "updateCredentials: " + account + ", response " + iAccountManagerResponse + ", authTokenType " + str + ", expectActivityLaunch " + z4 + ", caller's uid " + BinderHelper.b().f67823c + ", pid " + Binder.getCallingPid());
        }
        if (iAccountManagerResponse == null) {
            throw new IllegalArgumentException("response is null");
        }
        if (account != null) {
            int i4 = BinderHelper.b().f67824d;
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                new q(getUserAccounts(i4), iAccountManagerResponse, account.type, z4, true, account.name, false, true, account, str, bundle).bind();
                return;
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        throw new IllegalArgumentException("account is null");
    }

    protected void writeAuthTokenIntoCacheLocked(a0 a0Var, Account account, String str, String str2) {
        Map map = (Map) a0Var.f67851h.get(account);
        if (map == null) {
            map = new HashMap();
            a0Var.f67851h.put(account, map);
        }
        if (str2 == null) {
            map.remove(str);
        } else {
            map.put(str, str2);
        }
        saveAccountAuthTokenLocked(a0Var);
    }

    protected void writeUserDataIntoCacheLocked(a0 a0Var, Account account, String str, String str2) {
        Map map = (Map) a0Var.f67850g.get(account);
        if (map == null) {
            map = new HashMap();
            a0Var.f67850g.put(account, map);
        }
        if (str2 == null) {
            map.remove(str);
        } else {
            map.put(str, str2);
        }
        saveAccountUserDataLocked(a0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelNotification(u uVar, String str, MindUserHandle mindUserHandle) {
        ((NotificationManager) Overmind.getContext().getSystemService("notification")).cancel(uVar.f67865b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static class UidGrant implements Parcelable {
        public static final Parcelable.Creator<UidGrant> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        public int f67841b;

        /* renamed from: c  reason: collision with root package name */
        public String f67842c;

        /* renamed from: d  reason: collision with root package name */
        public Account f67843d;

        /* loaded from: classes6.dex */
        class a implements Parcelable.Creator<UidGrant> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public UidGrant createFromParcel(Parcel parcel) {
                return new UidGrant(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public UidGrant[] newArray(int i4) {
                return new UidGrant[i4];
            }
        }

        public UidGrant(int i4, String str, Account account) {
            this.f67841b = i4;
            this.f67842c = str;
            this.f67843d = account;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.f67841b);
            parcel.writeString(this.f67842c);
            parcel.writeParcelable(this.f67843d, i4);
        }

        protected UidGrant(Parcel parcel) {
            this.f67841b = parcel.readInt();
            this.f67842c = parcel.readString();
            this.f67843d = (Account) parcel.readParcelable(Account.class.getClassLoader());
        }
    }

    private void cancelAccountAccessRequestNotificationIfNeeded(String str, int i4, boolean z4) {
        for (Account account : getAccountsAsUser(null, MindUserHandle.k(i4), q.a.f73126a)) {
            cancelAccountAccessRequestNotificationIfNeeded(account, i4, str, z4);
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public boolean hasAccountAccess(Account account, String str, UserHandle userHandle) {
        if (MindUserHandle.a(BinderHelper.b().f67823c) == 1000) {
            Objects.requireNonNull(account, "account cannot be null");
            Objects.requireNonNull(str, "packageName cannot be null");
            Objects.requireNonNull(userHandle, "userHandle cannot be null");
            int identifier = new com.xinzhu.haunted.android.os.w(userHandle).getIdentifier();
            if (identifier >= 0) {
                int packageUid = com.xinzhu.overmind.server.pm.i.get().getPackageUid(str, 0, identifier);
                if (packageUid == -1) {
                    com.xinzhu.overmind.utils.n.a(TAG, "Package not found ");
                    return false;
                }
                return hasAccountAccess(account, str, packageUid);
            }
            throw new IllegalArgumentException("user must be concrete");
        }
        throw new SecurityException("Can be called only by system UID");
    }

    private void cancelAccountAccessRequestNotificationIfNeeded(Account account, int i4, boolean z4) {
        String[] packagesForUid = com.xinzhu.overmind.server.pm.i.get().getPackagesForUid(i4);
        if (packagesForUid != null) {
            for (String str : packagesForUid) {
                cancelAccountAccessRequestNotificationIfNeeded(account, i4, str, z4);
            }
        }
    }

    private void cancelAccountAccessRequestNotificationIfNeeded(Account account, int i4, String str, boolean z4) {
        if (!z4 || hasAccountAccess(account, str, MindUserHandle.j(i4).v())) {
            cancelNotification(getCredentialPermissionNotificationId(account, ACCOUNT_ACCESS_TOKEN_TYPE, i4), str, MindUserHandle.j(i4));
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void registerAccountListener(String[] strArr, String str) {
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        int i4 = b5.f67823c;
        int i5 = b5.f67824d;
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            registerAccountListener(strArr, str, getUserAccounts(i5));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    private r[] getAccounts(int[] iArr) {
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        ArrayList arrayList = new ArrayList();
        for (int i4 : iArr) {
            a0 userAccounts = getUserAccounts(i4);
            if (userAccounts != null) {
                for (Account account : getAccountsFromCache(userAccounts, null, b5.f67823c, null, false)) {
                    arrayList.add(new r(account, i4));
                }
            }
        }
        return (r[]) arrayList.toArray(new r[arrayList.size()]);
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public void unregisterAccountListener(String[] strArr, String str) {
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        int i4 = b5.f67823c;
        int i5 = b5.f67824d;
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            unregisterAccountListener(strArr, str, getUserAccounts(i5));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public Map<Account, Integer> getAccountsAndVisibilityForPackage(String str, String str2) {
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        int i4 = b5.f67823c;
        int i5 = b5.f67824d;
        boolean o4 = MindUserHandle.o(i4, 1000);
        List<String> typesForCaller = getTypesForCaller(i4, i5, o4);
        if ((str2 != null && !typesForCaller.contains(str2)) || (str2 == null && !o4)) {
            throw new SecurityException("getAccountsAndVisibilityForPackage() called from unauthorized uid " + i4 + " with packageName=" + str);
        }
        if (str2 != null) {
            typesForCaller = new ArrayList<>();
            typesForCaller.add(str2);
        }
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            return getAccountsAndVisibilityForPackage(str, typesForCaller, Integer.valueOf(i4), getUserAccounts(i5));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // com.xinzhu.overmind.server.accounts.e
    public boolean setAccountVisibility(Account account, String str, int i4) {
        Objects.requireNonNull(account, "account cannot be null");
        Objects.requireNonNull(str, "packageName cannot be null");
        BinderHelper.CallingInfo b5 = BinderHelper.b();
        int i5 = b5.f67823c;
        int i6 = b5.f67824d;
        if (!isAccountManagedByCaller(account.type, i5, i6) && !isSystemUid(i5)) {
            throw new SecurityException(String.format("uid %s cannot get secrets for accounts of type: %s", Integer.valueOf(i5), account.type));
        }
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            return setAccountVisibility(account, str, i4, true, getUserAccounts(i6));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }
}
