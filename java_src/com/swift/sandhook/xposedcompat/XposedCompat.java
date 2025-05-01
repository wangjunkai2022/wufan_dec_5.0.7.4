package com.swift.sandhook.xposedcompat;

import android.app.Application;
import android.content.Context;
import com.swift.sandhook.xposedcompat.classloaders.ProxyClassLoader;
import com.swift.sandhook.xposedcompat.methodgen.DynamicBridge;
import com.swift.sandhook.xposedcompat.utils.ApplicationUtils;
import com.swift.sandhook.xposedcompat.utils.DexMakerUtils;
import com.swift.sandhook.xposedcompat.utils.FileUtils;
import com.swift.sandhook.xposedcompat.utils.ProcessUtils;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedInit;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import de.robv.android.xposed.callbacks.XCallback;
import java.io.File;
/* loaded from: classes.dex */
public class XposedCompat {
    public static File cacheDir = null;
    public static volatile ClassLoader classLoader = null;
    public static Context context = null;
    public static boolean isFirstApplication = false;
    public static String packageName = null;
    public static String processName = null;
    public static volatile boolean retryWhenCallOriginError = false;
    private static ClassLoader sandHookXposedClassLoader = null;
    public static volatile boolean useInternalStub = true;
    public static volatile boolean useNewCallBackup = true;

    public static void addXposedModuleCallback(IXposedHookLoadPackage iXposedHookLoadPackage) {
        XposedBridge.hookLoadPackage(new IXposedHookLoadPackage.Wrapper(iXposedHookLoadPackage));
    }

    public static void callXposedModuleInit() throws Throwable {
        XC_LoadPackage.LoadPackageParam loadPackageParam = new XC_LoadPackage.LoadPackageParam(XposedBridge.sLoadedPackageCallbacks);
        Application currentApplication = ApplicationUtils.currentApplication();
        if (currentApplication != null) {
            if (loadPackageParam.packageName == null) {
                loadPackageParam.packageName = currentApplication.getPackageName();
            }
            if (loadPackageParam.processName == null) {
                loadPackageParam.processName = ProcessUtils.getProcessName(currentApplication);
            }
            if (loadPackageParam.classLoader == null) {
                loadPackageParam.classLoader = currentApplication.getClassLoader();
            }
            if (loadPackageParam.appInfo == null) {
                loadPackageParam.appInfo = currentApplication.getApplicationInfo();
            }
            if (cacheDir == null) {
                currentApplication.getCacheDir();
            }
        }
        XCallback.callAll(loadPackageParam);
    }

    public static boolean clearCache() {
        try {
            FileUtils.delete(getCacheDir());
            getCacheDir().mkdirs();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void clearOatCache() {
        DynamicBridge.clearOatFile();
    }

    public static File getCacheDir() {
        if (cacheDir == null) {
            if (context == null) {
                context = ApplicationUtils.currentApplication();
            }
            if (context != null) {
                File cacheDir2 = context.getCacheDir();
                String str = processName;
                if (str == null) {
                    str = ProcessUtils.getProcessName(context);
                }
                cacheDir = new File(cacheDir2, DexMakerUtils.MD5(str));
            }
        }
        return cacheDir;
    }

    public static ClassLoader getSandHookXposedClassLoader(ClassLoader classLoader2, ClassLoader classLoader3) {
        ClassLoader classLoader4 = sandHookXposedClassLoader;
        if (classLoader4 != null) {
            return classLoader4;
        }
        ProxyClassLoader proxyClassLoader = new ProxyClassLoader(classLoader3, classLoader2);
        sandHookXposedClassLoader = proxyClassLoader;
        return proxyClassLoader;
    }

    public static void loadModule(String str, String str2, String str3, ClassLoader classLoader2) {
        XposedInit.loadModule(str, str2, str3, classLoader2);
    }
}
