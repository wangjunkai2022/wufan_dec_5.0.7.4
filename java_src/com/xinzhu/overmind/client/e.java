package com.xinzhu.overmind.client;

import android.app.Activity;
import android.app.Application;
import android.app.DialogFragment;
import android.app.Instrumentation;
import android.app.Service;
import android.content.AttributionSource;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.ArrayMap;
import com.xinzhu.haunted.android.app.g;
import com.xinzhu.haunted.android.app.m;
import com.xinzhu.haunted.android.app.u;
import com.xinzhu.haunted.android.app.x;
import com.xinzhu.haunted.android.os.t;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.c;
import com.xinzhu.overmind.client.hook.IOManager;
import com.xinzhu.overmind.client.hook.delegate.AppInstrumentationHook;
import com.xinzhu.overmind.client.hook.fixer.ContextFixer;
import com.xinzhu.overmind.entity.ClientConfig;
import com.xinzhu.overmind.server.ProcessRecord;
import com.xinzhu.overmind.server.os.MindDeviceInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Method;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: Overlord.java */
/* loaded from: classes.dex */
public class e extends c.b {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int HANDLE_FINISH = 0;
    public static final int HANDLE_NEW_INTENT = 0;
    public static final String TAG = e.class.getSimpleName();
    private static e sOverlord;
    private IInterface mActivityThread;
    private l mBoundApplication;
    private ClientConfig mClientConfig;
    private Application mInitialApplication;
    private Map<String, Application> mApplicationsMap = new HashMap();
    private List<ProviderInfo> mProviders = new ArrayList();
    private final Handler mH = new Handler(Looper.getMainLooper());

    /* compiled from: Overlord.java */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IBinder f67459b;

        a(IBinder iBinder) {
            this.f67459b = iBinder;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            ArrayMap<IBinder, Object> T = new com.xinzhu.haunted.android.app.g(Overmind.mainThread()).T();
            if (T.isEmpty() || (obj = T.get(this.f67459b)) == null) {
                return;
            }
            Activity g4 = new g.a(obj).g();
            while (g4.getParent() != null) {
                g4 = g4.getParent();
            }
            com.xinzhu.haunted.android.app.a aVar = new com.xinzhu.haunted.android.app.a(g4);
            int j4 = aVar.j();
            Intent k4 = aVar.k();
            if (com.xinzhu.overmind.utils.e.d()) {
                new m(com.xinzhu.haunted.android.app.d.c()).g(this.f67459b, j4, k4, 0);
            } else if (com.xinzhu.overmind.utils.e.a()) {
                new m(com.xinzhu.haunted.android.app.d.c()).h(this.f67459b, j4, k4, false);
            } else {
                throw new RuntimeException("not support lower than sdk 21");
            }
            aVar.n(true);
        }
    }

    /* compiled from: Overlord.java */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Intent f67461b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ IBinder f67462c;

        b(Intent intent, IBinder iBinder) {
            this.f67461b = intent;
            this.f67462c = iBinder;
        }

        @Override // java.lang.Runnable
        public void run() {
            Intent intent;
            if (Build.VERSION.SDK_INT >= 22) {
                intent = (Intent) com.xinzhu.haunted.com.android.internal.content.a.b(this.f67461b, Overmind.getHostPkg()).f67292a;
            } else {
                intent = this.f67461b;
            }
            com.xinzhu.haunted.android.app.g gVar = new com.xinzhu.haunted.android.app.g(Overmind.mainThread());
            if (com.xinzhu.overmind.utils.e.h()) {
                gVar.e0(gVar.T().get(this.f67462c), Collections.singletonList(intent));
            } else if (gVar.C(this.f67462c, Collections.singletonList(intent))) {
                gVar.h0(this.f67462c, Collections.singletonList(intent));
            } else if (gVar.D(this.f67462c, Collections.singletonList(intent), true)) {
                gVar.i0(this.f67462c, Collections.singletonList(intent), true);
            } else if (gVar.y(this.f67462c, Collections.singletonList(intent))) {
                gVar.d0(this.f67462c, Collections.singletonList(intent));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Overlord.java */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f67464b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f67465c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ConditionVariable f67466d;

        c(String str, String str2, ConditionVariable conditionVariable) {
            this.f67464b = str;
            this.f67465c = str2;
            this.f67466d = conditionVariable;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.handleBindApplication(this.f67464b, this.f67465c);
            this.f67466d.open();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Overlord.java */
    /* loaded from: classes.dex */
    public class d extends XC_MethodHook {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // de.robv.android.xposed.XC_MethodHook
        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            methodHookParam.returnEarly = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Overlord.java */
    /* renamed from: com.xinzhu.overmind.client.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0720e extends XC_MethodHook {
        C0720e() {
        }

        @Override // de.robv.android.xposed.XC_MethodHook
        public void callAfterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            ProcessRecord c5 = com.xinzhu.overmind.client.frameworks.a.d().c(Binder.getCallingPid());
            if (c5 == null || c5.processName == null) {
                return;
            }
            methodHookParam.setResult(Integer.valueOf(c5.vuid));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Overlord.java */
    /* loaded from: classes.dex */
    public class f extends XC_MethodHook {
        f() {
        }

        @Override // de.robv.android.xposed.XC_MethodHook
        public void callAfterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            methodHookParam.setResult(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Overlord.java */
    /* loaded from: classes.dex */
    public class g extends XC_MethodReplacement {
        g() {
        }

        @Override // de.robv.android.xposed.XC_MethodReplacement
        protected Object replaceHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Overlord.java */
    /* loaded from: classes.dex */
    public class h extends XC_MethodHook {
        h() {
        }

        @Override // de.robv.android.xposed.XC_MethodHook
        protected void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            try {
                MatrixCursor matrixCursor = (MatrixCursor) methodHookParam.getResult();
                String[] strArr = (String[]) methodHookParam.args[3];
                if (Arrays.asList(strArr).contains("android_id")) {
                    MatrixCursor matrixCursor2 = new MatrixCursor(matrixCursor.getColumnNames());
                    for (int i4 = 0; i4 < strArr.length; i4++) {
                        if (strArr[i4].equals("android_id")) {
                            MindDeviceInfo b5 = com.xinzhu.overmind.client.frameworks.c.a().b(e.getUserId());
                            if (b5 != null && b5.f68007b) {
                                matrixCursor2.addRow(new Object[]{"android_id", b5.f68008c});
                            }
                        } else if (matrixCursor.moveToPosition(i4)) {
                            matrixCursor2.addRow(new String[]{matrixCursor.getString(0), matrixCursor.getString(1)});
                        }
                    }
                    methodHookParam.setResult(matrixCursor2);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Overlord.java */
    /* loaded from: classes.dex */
    public class i extends XC_MethodHook {
        i() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // de.robv.android.xposed.XC_MethodHook
        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            try {
                if (methodHookParam.thisObject.getClass().getName().equals("com.google.android.gms.common.ErrorDialogFragment")) {
                    String str = e.TAG;
                    com.xinzhu.overmind.b.l(str, "DialogFragment ondismiss " + methodHookParam.args[0] + " " + methodHookParam.thisObject.getClass());
                    Method declaredMethod = methodHookParam.thisObject.getClass().getDeclaredMethod("onCancel", DialogInterface.class);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(methodHookParam.thisObject, (DialogInterface) methodHookParam.args[0]);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Overlord.java */
    /* loaded from: classes.dex */
    public class j extends XC_MethodHook {
        j() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // de.robv.android.xposed.XC_MethodHook
        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (int i4 = 0; i4 < stackTrace.length; i4++) {
                if (stackTrace[i4].getClassName().equals("android.widget.TextView") && stackTrace[i4].getMethodName().equals("setInputType")) {
                    methodHookParam.returnEarly = true;
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Overlord.java */
    /* loaded from: classes.dex */
    public class k extends XC_MethodHook {
        k() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // de.robv.android.xposed.XC_MethodHook
        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (int i4 = 0; i4 < stackTrace.length; i4++) {
                if (stackTrace[i4].getClassName().equals("android.widget.TextView") && stackTrace[i4].getMethodName().equals("setInputType")) {
                    methodHookParam.returnEarly = true;
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Overlord.java */
    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: a  reason: collision with root package name */
        int f67476a;

        /* renamed from: b  reason: collision with root package name */
        String f67477b;

        /* renamed from: c  reason: collision with root package name */
        ApplicationInfo f67478c;

        /* renamed from: d  reason: collision with root package name */
        List<ProviderInfo> f67479d;

        /* renamed from: e  reason: collision with root package name */
        Object f67480e;

        private l() {
        }

        /* synthetic */ l(c cVar) {
            this();
        }
    }

    private Context createPackageContext(ApplicationInfo applicationInfo) {
        try {
            return Overmind.getContext().createPackageContext(applicationInfo.packageName, 3);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    private void gameSpecificHooks(String str) {
        try {
            String str2 = TAG;
            com.xinzhu.overmind.b.c(str2, "gameSpecificHooks " + str);
            if (str.equals(com.xinzhu.overmind.client.hook.env.b.f67614d)) {
                try {
                    XposedHelpers.findAndHookMethod("com.google.android.gsf.gservices.GservicesProvider", getApplication().getClassLoader(), "query", Uri.class, String[].class, String.class, String[].class, String.class, new h());
                } catch (Throwable unused) {
                }
            }
            XposedHelpers.findAndHookMethod(DialogFragment.class, "onDismiss", DialogInterface.class, new i());
            if (!str.contains("gta") || Overmind.is64Bit()) {
                return;
            }
            ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
            Class cls = Boolean.TYPE;
            XposedHelpers.findAndHookMethod("android.widget.TextView", systemClassLoader, "applySingleLine", cls, cls, cls, new j());
        } catch (Throwable unused2) {
            com.xinzhu.overmind.b.c(TAG, "Cannot do hook both!");
        }
    }

    public static Application getApplication() {
        return getClient().mInitialApplication;
    }

    public static int getBaseVUid() {
        if (getClientConfig() == null) {
            return 10000;
        }
        return getClientConfig().f67768h;
    }

    public static e getClient() {
        if (sOverlord == null) {
            synchronized (e.class) {
                if (sOverlord == null) {
                    sOverlord = new e();
                }
            }
        }
        return sOverlord;
    }

    public static synchronized ClientConfig getClientConfig() {
        ClientConfig clientConfig;
        synchronized (e.class) {
            clientConfig = getClient().mClientConfig;
        }
        return clientConfig;
    }

    public static List<ProviderInfo> getProviders() {
        return getClient().mProviders;
    }

    public static int getUid() {
        if (getClientConfig() == null) {
            return -1;
        }
        return getClientConfig().f67766f;
    }

    public static int getUserId() {
        if (getClientConfig() == null) {
            return 0;
        }
        return getClientConfig().f67767g;
    }

    public static String getVPackageName() {
        if (getClientConfig() != null) {
            return getClientConfig().f67762b;
        }
        if (getClient().mInitialApplication != null) {
            return getClient().mInitialApplication.getPackageName();
        }
        return null;
    }

    public static int getVPid() {
        if (getClientConfig() == null) {
            return -1;
        }
        return getClientConfig().f67764d;
    }

    public static String getVProcessName() {
        if (getClientConfig() != null) {
            return getClientConfig().f67763c;
        }
        if (getClient().mBoundApplication != null) {
            return getClient().mBoundApplication.f67477b;
        }
        return null;
    }

    public static int getVUid() {
        if (getClientConfig() == null) {
            return 10000;
        }
        return getClientConfig().f67765e;
    }

    private void installProviders(Context context, String str, List<ProviderInfo> list) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            for (ProviderInfo providerInfo : list) {
                providerInfo.authority = providerInfo.authority.split(";")[0];
                String str2 = TAG;
                com.xinzhu.overmind.b.c(str2, "installProviders info " + providerInfo);
                if (str.equals(providerInfo.processName)) {
                    if (com.xinzhu.overmind.utils.e.w()) {
                        new com.xinzhu.haunted.android.app.g(Overmind.mainThread()).g0(context, null, providerInfo, false, true, true);
                    } else {
                        new com.xinzhu.haunted.android.app.g(Overmind.mainThread()).f0(context, null, providerInfo, false, true, true);
                    }
                }
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            com.xinzhu.overmind.client.hook.delegate.b.d();
        }
    }

    private void uidHooks() {
        try {
            XposedHelpers.findAndHookMethod(Binder.class, "getCallingUid", new C0720e());
            if (Build.VERSION.SDK_INT >= 31) {
                XposedHelpers.findAndHookMethod(AttributionSource.class, "checkCallingUid", new f());
            }
            if (!com.xinzhu.overmind.utils.e.j() || com.xinzhu.overmind.utils.e.k()) {
                return;
            }
            XposedHelpers.findAndHookMethod("android.provider.DeviceConfig", Overmind.getContext().getClassLoader(), "enforceReadPermission", Context.class, String.class, new g());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.xinzhu.overmind.client.c
    public IBinder acquireContentProviderClient(ProviderInfo providerInfo) throws RemoteException {
        if (!isInit()) {
            bindApplication(getClientConfig().f67762b, getClientConfig().f67763c);
        }
        IInterface b5 = new com.xinzhu.haunted.android.content.e(Overmind.getContext().getContentResolver().acquireContentProviderClient(providerInfo.authority.split(";")[0])).b();
        if (b5 == null) {
            return null;
        }
        return new com.xinzhu.overmind.client.hook.proxies.context.providers.a().b(b5, Overmind.getHostPkg()).asBinder();
    }

    public void bindApplication(String str, String str2) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            ConditionVariable conditionVariable = new ConditionVariable();
            new Handler(Looper.getMainLooper()).post(new c(str, str2, conditionVariable));
            conditionVariable.block();
            return;
        }
        handleBindApplication(str, str2);
    }

    public Service createJobService(ServiceInfo serviceInfo) {
        if (!getClient().isInit()) {
            getClient().bindApplication(serviceInfo.packageName, serviceInfo.processName);
        }
        try {
            Service service = (Service) new u(this.mBoundApplication.f67480e).i().loadClass(serviceInfo.name).newInstance();
            try {
                Context createPackageContext = Overmind.getContext().createPackageContext(serviceInfo.packageName, 3);
                new com.xinzhu.haunted.android.app.l(createPackageContext).p(service);
                new x(service).a(createPackageContext, Overmind.mainThread(), serviceInfo.name, getClient().getActivityThread(), this.mInitialApplication, com.xinzhu.haunted.android.app.d.c());
                ContextFixer.fix(createPackageContext);
                service.onCreate();
                service.onBind(null);
                return service;
            } catch (Exception e5) {
                throw new RuntimeException("Unable to create JobService " + serviceInfo.name + ": " + e5.toString(), e5);
            }
        } catch (Exception e6) {
            throw new RuntimeException("Unable to instantiate service " + serviceInfo.name + ": " + e6.toString(), e6);
        }
    }

    public Service createService(ServiceInfo serviceInfo) {
        if (!getClient().isInit()) {
            getClient().bindApplication(serviceInfo.packageName, serviceInfo.processName);
        }
        try {
            Service service = (Service) new u(this.mBoundApplication.f67480e).i().loadClass(serviceInfo.name).newInstance();
            try {
                Context createPackageContext = Overmind.getContext().createPackageContext(serviceInfo.packageName, 3);
                new com.xinzhu.haunted.android.app.l(createPackageContext).p(service);
                new x(service).a(createPackageContext, Overmind.mainThread(), serviceInfo.name, getClient().getActivityThread(), this.mInitialApplication, com.xinzhu.haunted.android.app.d.c());
                ContextFixer.fix(createPackageContext);
                service.onCreate();
                return service;
            } catch (Exception e5) {
                e5.printStackTrace();
                throw new RuntimeException("Unable to create service " + serviceInfo.name + ": " + e5.toString(), e5);
            }
        } catch (Exception e6) {
            throw new RuntimeException("Unable to instantiate service " + serviceInfo.name + ": " + e6.toString(), e6);
        }
    }

    @Override // com.xinzhu.overmind.client.c
    public void finishActivity(IBinder iBinder) {
        this.mH.post(new a(iBinder));
    }

    @Override // com.xinzhu.overmind.client.c
    public IBinder getActivityThread() {
        return new com.xinzhu.haunted.android.app.g(Overmind.mainThread()).K();
    }

    public synchronized void handleBindApplication(String str, String str2) {
        try {
            com.xinzhu.overmind.client.b.a();
        } catch (Throwable unused) {
        }
        if (getClientConfig() == null) {
            return;
        }
        if (this.mApplicationsMap.containsKey(str)) {
            return;
        }
        PackageInfo l4 = Overmind.getMindPackageManager().l(str, 8, getUserId());
        IOManager.get().enableRedirect(str, Overmind.get().getCustomCallback().customIORedirect(str, getUserId()), l4.applicationInfo.targetSdkVersion);
        VMCore.initClientClassloader(Overmind.getContext().getClassLoader());
        VMCore.init(Build.VERSION.SDK_INT, Overmind.getHostPkg(), getVPackageName(), (getClientConfig().f67770j ? com.xinzhu.overmind.a.m() : com.xinzhu.overmind.a.l()).getAbsolutePath());
        ApplicationInfo applicationInfo = com.xinzhu.overmind.server.pm.j.d(l4).applicationInfo;
        com.xinzhu.overmind.client.hook.env.c.h(str2, applicationInfo);
        this.mProviders = com.xinzhu.overmind.client.frameworks.g.d().u(str2, getVUid(), 128, getUserId());
        com.xinzhu.haunted.android.app.g gVar = new com.xinzhu.haunted.android.app.g(Overmind.mainThread());
        Object U = gVar.U();
        Context createPackageContext = createPackageContext(applicationInfo);
        Object m4 = new com.xinzhu.haunted.android.app.l(createPackageContext).m();
        u uVar = new u(m4);
        uVar.s(false);
        uVar.q(applicationInfo);
        int i4 = applicationInfo.targetSdkVersion;
        if (i4 < 9) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(StrictMode.getThreadPolicy()).permitNetwork().build());
        }
        if (com.xinzhu.overmind.utils.e.d() && i4 < 24) {
            t.c();
        }
        com.xinzhu.haunted.dalvik.system.a.e().h(applicationInfo.targetSdkVersion);
        try {
            XposedHelpers.findAndHookMethod("dalvik.system.VMRuntime", ClassLoader.getSystemClassLoader(), "setHiddenApiExemptions", String[].class, new d());
        } catch (Throwable unused2) {
        }
        Overmind.get().getCustomCallback().customLoadLibgggg(str, getUserId());
        l lVar = new l(null);
        lVar.f67478c = applicationInfo;
        lVar.f67477b = str2;
        lVar.f67480e = m4;
        lVar.f67479d = this.mProviders;
        g.b bVar = new g.b(U);
        bVar.m(new ComponentName(lVar.f67478c.packageName, Instrumentation.class.getName()));
        bVar.k(lVar.f67478c);
        bVar.l(lVar.f67480e);
        bVar.n(lVar.f67477b);
        bVar.o(lVar.f67479d);
        this.mBoundApplication = lVar;
        Security.removeProvider("AndroidNSSP");
        if (com.xinzhu.overmind.utils.e.d()) {
            com.xinzhu.haunted.android.security.net.config.a.b(null);
        }
        try {
            uidHooks();
            Overmind.get().getAppLifecycleCallback().c(str, str2, createPackageContext);
            Application p4 = uVar.p(false, null);
            this.mInitialApplication = p4;
            gVar.n0(p4);
            ContextFixer.fix((Context) new com.xinzhu.haunted.android.app.g(Overmind.mainThread()).R());
            ContextFixer.fix(this.mInitialApplication);
            f3.a.a(str, p4);
            installProviders(this.mInitialApplication, lVar.f67477b, lVar.f67479d);
            Overmind.get().getAppLifecycleCallback().b(str, str2, p4);
            AppInstrumentationHook.h().i().callApplicationOnCreate(p4);
            ContextFixer.fix(this.mInitialApplication);
            com.xinzhu.overmind.client.hook.c.c().b(com.xinzhu.overmind.client.hook.proxies.clipboard.a.class);
            com.xinzhu.overmind.client.hook.c.c().b(com.xinzhu.overmind.client.hook.proxies.app.b.class);
            Overmind.get().getAppLifecycleCallback().a(str, str2, p4);
            registerReceivers(this.mInitialApplication);
            this.mApplicationsMap.put(str, p4);
            gameSpecificHooks(str);
        } catch (Exception e5) {
            e5.printStackTrace();
            throw new RuntimeException("Failed to makeApplication", e5);
        }
    }

    @Override // com.xinzhu.overmind.client.c
    public void handleNewIntent(IBinder iBinder, Intent intent) {
        this.mH.post(new b(intent, iBinder));
    }

    public void initProcess(ClientConfig clientConfig) {
        if (this.mClientConfig == null) {
            this.mClientConfig = clientConfig;
            return;
        }
        throw new RuntimeException("reject init process: " + clientConfig.f67763c + ", this process is : " + this.mClientConfig.f67763c);
    }

    public boolean isInit() {
        return this.mBoundApplication != null;
    }

    public void loadXposed(Context context) {
    }

    @Override // com.xinzhu.overmind.client.c
    public IBinder peekService(Intent intent) {
        return com.xinzhu.overmind.server.b.b().k(intent);
    }

    public void registerReceivers(Application application) {
        try {
            Intent intent = new Intent();
            intent.setPackage(application.getPackageName());
            for (ResolveInfo resolveInfo : Overmind.getMindPackageManager().w(intent, 64, null, getUserId())) {
                String str = resolveInfo.activityInfo.processName;
                if (str == null || str.equals(getVProcessName())) {
                    this.mInitialApplication.registerReceiver((BroadcastReceiver) this.mInitialApplication.getClassLoader().loadClass(resolveInfo.activityInfo.name).newInstance(), resolveInfo.filter);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.xinzhu.overmind.client.c
    public void restartJobService(String str) throws RemoteException {
    }

    @Override // com.xinzhu.overmind.client.c
    public void stopService(Intent intent) {
        com.xinzhu.overmind.server.b.b().stopService(intent);
    }

    @Override // com.xinzhu.overmind.client.c
    public void bindApplication() {
        if (isInit()) {
            return;
        }
        bindApplication(getVPackageName(), getVProcessName());
    }
}
