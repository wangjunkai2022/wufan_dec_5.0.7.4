package com.xinzhu.overmind;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.IBinder;
import android.os.Process;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.join.mgps.Util.h0;
import com.swift.sandhook.HookLog;
import com.swift.sandhook.SandHook;
import com.swift.sandhook.SandHookConfig;
import com.swift.sandhook.xposedcompat.XposedCompat;
import com.xinzhu.haunted.android.content.pm.e;
import com.xinzhu.overmind.client.VMCore;
import com.xinzhu.overmind.client.f;
import com.xinzhu.overmind.client.frameworks.g;
import com.xinzhu.overmind.client.frameworks.h;
import com.xinzhu.overmind.custom.CustomCallback;
import com.xinzhu.overmind.entity.pm.InstallOption;
import com.xinzhu.overmind.entity.pm.InstallResult;
import com.xinzhu.overmind.entity.pm.InstalledModule;
import com.xinzhu.overmind.hiddenapibypass.HiddenApiBypass;
import com.xinzhu.overmind.server.DaemonService;
import com.xinzhu.overmind.server.i;
import com.xinzhu.overmind.server.user.MindUserHandle;
import com.xinzhu.overmind.server.user.MindUserInfo;
import com.xinzhu.overmind.utils.k;
import com.xinzhu.overmind.utils.u;
import com.xinzhu.overmind.utils.wrappers.ContentProviderWrapper;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.Thread;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public class Overmind extends com.xinzhu.overmind.client.a {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TAG = "Overmind";
    private static e hostPm;
    private static Context sContext;
    private com.xinzhu.overmind.client.a mClientConfiguration;
    private Thread.UncaughtExceptionHandler mExceptionHandler;
    private ProcessType mProcessType;
    private static Overmind sOvermind = new Overmind();
    private static int hostRealUid = Process.myUid();
    private Map<String, IBinder> mServices = new HashMap();
    private com.xinzhu.overmind.client.hook.a mAppLifecycleCallback = com.xinzhu.overmind.client.hook.a.f67567a;
    private com.xinzhu.overmind.client.hook.delegate.a mActivityLifecycleCallback = com.xinzhu.overmind.client.hook.delegate.a.f67595b;
    private CustomCallback mCustomCallback = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum ProcessType {
        Server,
        MAppClient,
        Main,
        PluginMonitor,
        Others
    }

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Intent intent = new Intent();
            intent.setClassName("com.tencent.mm", "com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService");
            Intent startService = Overmind.getMindActivityManager().startService(intent, null, 0, 0);
            if (startService != null) {
                startService.putExtra("operation", "start_service");
                Overmind.getContext().startService(startService);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements SandHook.HookModeCallBack {
        b() {
        }

        @Override // com.swift.sandhook.SandHook.HookModeCallBack
        public int hookMode(Member member) {
            return Build.VERSION.SDK_INT >= 30 ? 2 : 0;
        }
    }

    /* loaded from: classes.dex */
    class c implements IBinder.DeathRecipient {
        c() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            com.xinzhu.overmind.b.c(Overmind.TAG, ":mind process dead, finish this process.");
            Process.killProcess(Process.myPid());
        }
    }

    /* loaded from: classes.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Intent f67430b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f67431c;

        d(Intent intent, int i4) {
            this.f67430b = intent;
            this.f67431c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            Overmind.this.startActivity(this.f67430b, this.f67431c);
        }
    }

    public static void critical(String str) {
        throw new RuntimeException(str);
    }

    public static Overmind get() {
        return sOvermind;
    }

    public static Context getContext() {
        return sContext;
    }

    public static String getHostPkg() {
        return get().getHostPackageName();
    }

    public static e getHostPm() {
        return hostPm;
    }

    public static int getHostUid() {
        return hostRealUid;
    }

    public static int getHostUserId() {
        return MindUserHandle.k(hostRealUid);
    }

    public static String getMainPkg() {
        return get().getMainPackageName();
    }

    public static com.xinzhu.overmind.client.frameworks.a getMindActivityManager() {
        return com.xinzhu.overmind.client.frameworks.a.d();
    }

    public static com.xinzhu.overmind.client.frameworks.e getMindJobManager() {
        return com.xinzhu.overmind.client.frameworks.e.c();
    }

    public static g getMindPackageManager() {
        return g.d();
    }

    public static h getMindStorageManager() {
        return h.a();
    }

    public static String getOvermindBuildDate() {
        return g3.a.f69123g;
    }

    public static PackageManager getPackageManager() {
        return sContext.getPackageManager();
    }

    public static String getPluginPkg() {
        return get().getPluginPackageName();
    }

    private static String getProcessName(Context context) {
        try {
            String J = com.xinzhu.haunted.android.app.g.J();
            String str = TAG;
            com.xinzhu.overmind.b.c(str, "get process name " + J);
            return J;
        } catch (Throwable th) {
            th.printStackTrace();
            int myPid = Process.myPid();
            String str2 = null;
            Iterator<ActivityManager.RunningAppProcessInfo> it2 = ((ActivityManager) context.getSystemService(TTDownloadField.TT_ACTIVITY)).getRunningAppProcesses().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it2.next();
                if (next.pid == myPid) {
                    str2 = next.processName;
                    break;
                }
            }
            if (str2 != null) {
                return str2;
            }
            throw new RuntimeException("processName = null");
        }
    }

    public static void getStackTraceElement() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i4 = 1; i4 < stackTrace.length; i4++) {
            StackTraceElement stackTraceElement = stackTrace[i4];
            PrintStream printStream = System.out;
            printStream.println("\tat " + stackTraceElement.getClassName() + h0.f27805a + stackTraceElement.getMethodName() + "(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")");
        }
    }

    private void initHostPm(Context context) {
        hostPm = new e(com.xinzhu.haunted.android.app.g.P());
    }

    private void initJarEnv() {
        try {
            k.e(getContext().getAssets().open("junit.jar"), com.xinzhu.overmind.a.f67440h);
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }

    public static void initJavaHooks() {
        VMCore.initLibrary();
        try {
            if (com.xinzhu.haunted.dalvik.system.a.e().c()) {
                SandHookConfig.DEBUG = com.xinzhu.haunted.dalvik.system.a.e().g().booleanValue();
            } else {
                SandHookConfig.DEBUG = false;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        HookLog.DEBUG = false;
        SandHookConfig.SDK_INT = Build.VERSION.SDK_INT;
        SandHookConfig.compiler = SandHookConfig.SDK_INT < 26;
        SandHookConfig.delayHook = false;
        SandHook.setHookModeCallBack(new b());
        SandHook.disableVMInline();
        XposedCompat.cacheDir = new File(getContext().getCacheDir(), "hook_cache");
    }

    private void initService() {
        get().getService(i.f67991c);
        get().getService(i.f67994f);
        get().getService(i.f67995g);
        get().getService(i.f67992d);
    }

    @SuppressLint({"NewApi"})
    public static boolean is64Bit() {
        if (com.xinzhu.overmind.utils.e.c()) {
            return Process.is64Bit();
        }
        return Build.CPU_ABI.equals("arm64-v8a");
    }

    public static boolean isInPlugin() {
        return is64Bit() == get().use32BitMainPackage();
    }

    private boolean isMAppClientProcess(String str) {
        String str2 = this.mClientConfiguration.getHostPackageName() + ":p";
        if (str.startsWith(str2)) {
            try {
                Integer.parseInt(str.substring(str2.length()));
                return true;
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    public static boolean isOvermindPkg(String str) {
        return getMainPkg().equals(str) || getPluginPkg().equals(str);
    }

    public static boolean isPkgInstalledOutside(String str) {
        ApplicationInfo f5;
        try {
            if (com.xinzhu.overmind.utils.e.j()) {
                f5 = hostPm.g(str, 0L, getHostUserId());
            } else {
                f5 = hostPm.f(str, 0, getHostUserId());
            }
        } catch (Exception unused) {
        }
        return f5 != null;
    }

    public static boolean isPluginPkgInstalled() {
        if (isPkgInstalledOutside(getPluginPkg())) {
            return get().mClientConfiguration.isPluginValid();
        }
        return false;
    }

    public static Object mainThread() {
        return com.xinzhu.haunted.android.app.g.F();
    }

    private void startLogcat() {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        File file = new File(externalStoragePublicDirectory, getContext().getPackageName() + "_logcat.txt");
        k.j(file);
        u.b("logcat -c", false);
        u.b("logcat >> " + file.getAbsolutePath() + " &", false);
    }

    @SuppressLint({"NewApi"})
    private static void unsealReflectionRestrictions() {
        if (com.xinzhu.overmind.utils.e.g()) {
            HiddenApiBypass.addHiddenApiExemptions("L");
        } else if (com.xinzhu.overmind.utils.e.y()) {
            try {
                Class cls = (Class) Class.class.getDeclaredMethod("forName", String.class).invoke(null, "dalvik.system.VMRuntime");
                Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
                ((Method) declaredMethod.invoke(cls, "setHiddenApiExemptions", new Class[]{String[].class})).invoke(((Method) declaredMethod.invoke(cls, "getRuntime", new Class[0])).invoke(null, new Object[0]), new String[]{"L"});
            } catch (Throwable th) {
                th.printStackTrace();
                critical("reflect unsealing failed");
            }
        }
    }

    public MindUserInfo createUser(int i4) {
        return com.xinzhu.overmind.client.frameworks.i.d().a(i4);
    }

    public void deleteUser(int i4) {
        com.xinzhu.overmind.client.frameworks.i.d().b(i4);
    }

    @SuppressLint({"NewApi"})
    public void doAttachBaseContext(Context context, com.xinzhu.overmind.client.a aVar) {
        String str = TAG;
        com.xinzhu.overmind.b.a(str, "doAttachBaseContext begin");
        if (aVar != null) {
            if (this.mClientConfiguration != null) {
                com.xinzhu.overmind.b.c(str, "doAttachBaseContext second time, skip.");
                return;
            }
            initHostPm(context);
            this.mClientConfiguration = aVar;
            unsealReflectionRestrictions();
            sContext = context;
            String processName = getProcessName(getContext());
            if (processName.equals(getMainPkg())) {
                this.mProcessType = ProcessType.Main;
            } else if (processName.endsWith(":mind")) {
                this.mProcessType = ProcessType.Server;
            } else if (processName.endsWith(":plugin_monitor")) {
                this.mProcessType = ProcessType.PluginMonitor;
                if (!get().ifDisablePluginPackageAutoManage()) {
                    com.xinzhu.overmind.plugin.b.p();
                }
            } else if (isMAppClientProcess(processName)) {
                this.mProcessType = ProcessType.MAppClient;
                initJavaHooks();
            } else {
                this.mProcessType = ProcessType.Others;
            }
            if (isServerProcess()) {
                if (!get().ifDisableDaemonService()) {
                    Intent intent = new Intent();
                    intent.setClass(getContext(), DaemonService.class);
                    if (com.xinzhu.overmind.utils.e.w()) {
                        getContext().startForegroundService(intent);
                    } else {
                        getContext().startService(intent);
                    }
                }
            } else {
                initService();
            }
            if (get().isVirtualProcess() || get().isMonitorProcess()) {
                try {
                    getService(i.f67991c).linkToDeath(new c(), 0);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            com.xinzhu.overmind.client.hook.c.c().d();
            return;
        }
        throw new IllegalArgumentException("ClientConfiguration is null!");
    }

    public void doCreate() {
        if (isVirtualProcess()) {
            com.xinzhu.overmind.client.hook.delegate.b.d();
        }
    }

    public void doTransferInstalls() {
        getMindPackageManager().b();
    }

    public void doTransferInstallsOnlyForMainPackage() {
        getMindPackageManager().c();
    }

    public com.xinzhu.overmind.client.hook.delegate.a getActivityLifecycleCallback() {
        return this.mActivityLifecycleCallback;
    }

    public com.xinzhu.overmind.client.hook.a getAppLifecycleCallback() {
        return this.mAppLifecycleCallback;
    }

    public CustomCallback getCustomCallback() {
        return this.mCustomCallback;
    }

    public Thread.UncaughtExceptionHandler getExceptionHandler() {
        return this.mExceptionHandler;
    }

    @Override // com.xinzhu.overmind.client.a
    public String getHostPackageName() {
        return this.mClientConfiguration.getHostPackageName();
    }

    public List<ApplicationInfo> getInstalledApplications(int i4, int i5) {
        return getMindPackageManager().g(i4, i5);
    }

    public List<PackageInfo> getInstalledPackages(int i4, int i5) {
        return getMindPackageManager().h(i4, i5);
    }

    public List<InstalledModule> getInstalledXPModules() {
        return null;
    }

    @Override // com.xinzhu.overmind.client.a
    public String getMainAuthorityPrefix() {
        return this.mClientConfiguration.getMainAuthorityPrefix();
    }

    @Override // com.xinzhu.overmind.client.a
    public String getMainPackageName() {
        return this.mClientConfiguration.getMainPackageName();
    }

    @Override // com.xinzhu.overmind.client.a
    public String getPluginAuthorityPrefix() {
        return this.mClientConfiguration.getPluginAuthorityPrefix();
    }

    @Override // com.xinzhu.overmind.client.a
    public String getPluginPackageName() {
        return this.mClientConfiguration.getPluginPackageName();
    }

    public List<ActivityManager.RecentTaskInfo> getRecentTasksContainPlugin(int i4, int i5) {
        List<ActivityManager.RecentTaskInfo> recentTasks = ((ActivityManager) getContext().getSystemService(TTDownloadField.TT_ACTIVITY)).getRecentTasks(i4, i5);
        List<ActivityManager.RecentTaskInfo> j4 = com.xinzhu.overmind.plugin.b.j(i4, i5);
        if (j4 != null) {
            recentTasks.addAll(j4);
        }
        return recentTasks;
    }

    public List<ActivityManager.RunningAppProcessInfo> getRunningAppProcessesContainPlugin() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) getContext().getSystemService(TTDownloadField.TT_ACTIVITY)).getRunningAppProcesses();
        List<ActivityManager.RunningAppProcessInfo> k4 = com.xinzhu.overmind.plugin.b.k();
        if (k4 != null) {
            runningAppProcesses.addAll(k4);
        }
        return runningAppProcesses;
    }

    public IBinder getService(String str) {
        if (isServerProcess()) {
            return i.b(str);
        }
        IBinder iBinder = this.mServices.get(str);
        if (iBinder == null || !iBinder.isBinderAlive()) {
            Bundle bundle = new Bundle();
            bundle.putString("_VM_|_server_name_", str);
            IBinder b5 = com.xinzhu.overmind.utils.helpers.d.b(ContentProviderWrapper.acquire(f.a(), "VM", null, bundle), "_VM_|_server_");
            this.mServices.put(str, b5);
            return b5;
        }
        return iBinder;
    }

    public List<MindUserInfo> getUsers() {
        return com.xinzhu.overmind.client.frameworks.i.d().f();
    }

    public boolean hostCheckPermission(String str, boolean z4) {
        return z4 ? hostPm.a(str, getPluginPackageName(), getHostUserId()) == 0 : hostPm.a(str, getMainPackageName(), getHostUserId()) == 0;
    }

    @Override // com.xinzhu.overmind.client.a
    public boolean ifDisableDaemonService() {
        return this.mClientConfiguration.ifDisableDaemonService();
    }

    @Override // com.xinzhu.overmind.client.a
    public boolean ifDisablePluginPackageAutoManage() {
        return this.mClientConfiguration.ifDisablePluginPackageAutoManage();
    }

    @Override // com.xinzhu.overmind.client.a
    public boolean ifDisableVirtualDeviceForPackage(String str, int i4) {
        return this.mClientConfiguration.ifDisableVirtualDeviceForPackage(str, i4);
    }

    public InstallResult installPackageAsUser_Exist(String str, int i4) {
        String str2 = TAG;
        com.xinzhu.overmind.b.c(str2, "installPackageAsUser_Exist pkg: " + str + " user: " + i4);
        if (!get().isInstalled(str)) {
            InstallResult installResult = new InstallResult();
            return installResult.a("installPackageAsUser_Exist package non-exist: " + str);
        }
        return getMindPackageManager().r(str, i4);
    }

    public InstallResult installPackageAsUser_Storage(File file, int i4) {
        return getMindPackageManager().s(file.getAbsolutePath(), InstallOption.a(), i4);
    }

    public InstallResult installPackageAsUser_System(String str, int i4) {
        try {
            return getMindPackageManager().s(getPackageManager().getPackageInfo(str, 0).applicationInfo.sourceDir, InstallOption.b(), i4);
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
            return new InstallResult().a(e5.getMessage());
        }
    }

    public InstallResult installXPModule(File file) {
        return getMindPackageManager().s(file.getAbsolutePath(), InstallOption.a().e(), -4);
    }

    @Override // com.xinzhu.overmind.client.a
    public boolean isHideRoot() {
        return this.mClientConfiguration.isHideRoot();
    }

    @Override // com.xinzhu.overmind.client.a
    public boolean isHideXposed() {
        return this.mClientConfiguration.isHideXposed();
    }

    public boolean isInstalled(String str, int i4) {
        return getMindPackageManager().t(str, i4);
    }

    public boolean isInstalledXposedModule(String str) {
        return false;
    }

    public boolean isMainProcess() {
        return this.mProcessType == ProcessType.Main;
    }

    public boolean isModuleEnable(String str) {
        return false;
    }

    public boolean isMonitorProcess() {
        return this.mProcessType == ProcessType.PluginMonitor;
    }

    @Override // com.xinzhu.overmind.client.a
    public boolean isPluginValid() {
        return this.mClientConfiguration.isPluginValid();
    }

    public boolean isServerProcess() {
        return this.mProcessType == ProcessType.Server;
    }

    @Override // com.xinzhu.overmind.client.a
    public boolean isUseGlobalFakePath() {
        return this.mClientConfiguration.isUseGlobalFakePath();
    }

    public boolean isVirtualProcess() {
        return this.mProcessType == ProcessType.MAppClient;
    }

    public boolean isXPEnable() {
        return false;
    }

    public boolean isXposedModule(File file) {
        return false;
    }

    public boolean launchApk(String str, int i4) {
        Intent j4;
        if ((!getMindPackageManager().k(str).k() || com.xinzhu.overmind.plugin.b.i()) && (j4 = getMindPackageManager().j(str, i4)) != null) {
            new Thread(new d(j4, i4)).start();
            return true;
        }
        return false;
    }

    public void preStartMM() {
        if (isInstalled("com.tencent.mm")) {
            com.xinzhu.overmind.client.hook.env.c.e().post(new a());
        }
    }

    public void setActivityLifecycleCallback(com.xinzhu.overmind.client.hook.delegate.a aVar) {
        if (aVar != null) {
            this.mActivityLifecycleCallback = aVar;
            return;
        }
        throw new IllegalArgumentException("activityLifecycleCallback is null!");
    }

    public void setAppLifecycleCallback(com.xinzhu.overmind.client.hook.a aVar) {
        if (aVar != null) {
            this.mAppLifecycleCallback = aVar;
            return;
        }
        throw new IllegalArgumentException("AppLifecycleCallback is null!");
    }

    public void setCustomCallback(CustomCallback customCallback) {
        if (customCallback != null) {
            this.mCustomCallback = customCallback;
            return;
        }
        throw new IllegalArgumentException("customCallback is null!");
    }

    public void setExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.mExceptionHandler = uncaughtExceptionHandler;
    }

    public void setModuleEnable(String str, boolean z4) {
    }

    public void setXPEnable(boolean z4) {
    }

    public void startActivity(Intent intent, int i4) {
        getMindActivityManager().startActivity(intent, i4);
    }

    public void stopApk(String str, int i4) {
        com.xinzhu.overmind.client.frameworks.a.d().A(str, i4);
    }

    public void uninstallPackage(String str) {
        getMindPackageManager().E(str);
    }

    public void uninstallPackageAsUser(String str, int i4) {
        getMindPackageManager().F(str, i4);
    }

    public void uninstallXPModule(String str) {
        uninstallPackage(str);
    }

    @Override // com.xinzhu.overmind.client.a
    public boolean use32BitMainPackage() {
        return this.mClientConfiguration.use32BitMainPackage();
    }

    @Override // com.xinzhu.overmind.client.a
    public boolean useRandomGeneratedVirtualDevice() {
        return this.mClientConfiguration.useRandomGeneratedVirtualDevice();
    }

    public InstallResult installPackageAsUser_Storage(Uri uri, int i4) {
        return getMindPackageManager().s(uri.toString(), InstallOption.a().d(), i4);
    }

    public InstallResult installXPModule(Uri uri) {
        return getMindPackageManager().s(uri.toString(), InstallOption.a().e().d(), -4);
    }

    public boolean isInstalled(String str) {
        if (get().isServerProcess()) {
            for (MindUserInfo mindUserInfo : com.xinzhu.overmind.server.user.c.get().getUsers()) {
                if (com.xinzhu.overmind.server.pm.i.get().isInstalled(str, mindUserInfo.f68255b)) {
                    return true;
                }
            }
            return false;
        }
        for (MindUserInfo mindUserInfo2 : com.xinzhu.overmind.client.frameworks.i.d().f()) {
            if (getMindPackageManager().t(str, mindUserInfo2.f68255b)) {
                return true;
            }
        }
        return false;
    }

    public InstallResult installXPModule(String str) {
        try {
            return getMindPackageManager().s(getPackageManager().getPackageInfo(str, 0).applicationInfo.sourceDir, InstallOption.b().e(), -4);
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
            return new InstallResult().a(e5.getMessage());
        }
    }
}
