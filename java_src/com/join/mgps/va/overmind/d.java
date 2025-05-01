package com.join.mgps.va.overmind;

import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.annotation.RequiresApi;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.u;
import com.join.mgps.Util.v;
import com.join.mgps.Util.w0;
import com.join.mgps.mod.bean.ModMeta;
import com.join.mgps.mod.utils.PluginConfig;
import com.papa91.arc.util.FileUtils;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.entity.pm.InstallResult;
import com.xinzhu.overmind.server.os.MindShareFileInfo;
import com.xinzhu.overmind.server.pm.MindPackageSettings;
import com.xinzhu.overmind.server.user.MindUserInfo;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: VAUtils.kt */
@SourceDebugExtension({"SMAP\nVAUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VAUtils.kt\ncom/join/mgps/va/overmind/VAUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1355:1\n1855#2,2:1356\n1855#2,2:1358\n1855#2,2:1360\n1855#2,2:1362\n1855#2,2:1364\n*S KotlinDebug\n*F\n+ 1 VAUtils.kt\ncom/join/mgps/va/overmind/VAUtils\n*L\n192#1:1356,2\n226#1:1358,2\n260#1:1360,2\n432#1:1362,2\n444#1:1364,2\n*E\n"})
/* loaded from: classes.dex */
public final class d {

    /* renamed from: h */
    private static int f54938h = 0;

    /* renamed from: i */
    private static boolean f54939i = false;
    @NotNull

    /* renamed from: k */
    public static final String f54941k = "com.join.android.app.mgsim.wufun";
    @NotNull

    /* renamed from: l */
    public static final String f54942l = "com.join.android.app.mgsim.wufun.addon";
    @NotNull

    /* renamed from: m */
    public static final String f54943m = "com.join.android.app.mgsim.wufun";
    @NotNull

    /* renamed from: n */
    public static final String f54944n = "com.join.android.app.mgsim.wufun.addon";

    /* renamed from: a */
    private final String f54945a = d.class.getCanonicalName();
    @NotNull

    /* renamed from: b */
    private final ThreadPoolExecutor f54946b = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    @NotNull

    /* renamed from: c */
    private String f54947c = "";
    @Nullable

    /* renamed from: d */
    private String f54948d = "0";

    /* renamed from: e */
    private int f54949e;
    @Nullable

    /* renamed from: f */
    private com.join.mgps.mod.utils.b f54950f;
    @NotNull

    /* renamed from: g */
    public static final a f54937g = new a(null);
    @NotNull

    /* renamed from: j */
    private static d f54940j = new d();

    /* compiled from: VAUtils.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final ContentProviderClient a(Context context, Uri uri) {
            try {
                if (Build.VERSION.SDK_INT >= 16) {
                    return context.getContentResolver().acquireUnstableContentProviderClient(uri);
                }
                return context.getContentResolver().acquireContentProviderClient(uri);
            } catch (SecurityException e5) {
                e5.printStackTrace();
                return null;
            }
        }

        @JvmStatic
        public static /* synthetic */ void h() {
        }

        private final void j(ContentProviderClient contentProviderClient) {
            if (contentProviderClient != null) {
                try {
                    if (Build.VERSION.SDK_INT >= 24) {
                        contentProviderClient.close();
                    } else {
                        contentProviderClient.release();
                    }
                } catch (Exception unused) {
                }
            }
        }

        public static /* synthetic */ void n(a aVar, Intent intent, int i4, int i5, Object obj) {
            if ((i5 & 2) != 0) {
                i4 = 0;
            }
            aVar.m(intent, i4);
        }

        @JvmStatic
        @Nullable
        public Bundle b(@NotNull Context context, @NotNull Uri uri, @Nullable String str, @Nullable String str2, @Nullable Bundle bundle) throws IllegalAccessException {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(uri, "uri");
            if (Build.VERSION.SDK_INT < 17) {
                ContentResolver contentResolver = context.getContentResolver();
                Intrinsics.checkNotNull(str);
                return contentResolver.call(uri, str, str2, bundle);
            }
            ContentProviderClient a5 = a(context, uri);
            try {
                try {
                    if (a5 != null) {
                        Intrinsics.checkNotNull(str);
                        return a5.call(str, str2, bundle);
                    }
                    throw new IllegalAccessException();
                } catch (RemoteException e5) {
                    throw new IllegalAccessException(e5.getMessage());
                }
            } finally {
                j(a5);
            }
        }

        public final void c(@Nullable Context context) {
            if (d().O() && context != null) {
                try {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 4);
                    if (sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", -1) == -1) {
                        sharedPreferences.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 7).apply();
                    }
                    SharedPreferences sharedPreferences2 = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 4);
                    if (sharedPreferences2.getInt("kitsBitmask", -1) == -1) {
                        sharedPreferences2.edit().putInt("kitsBitmask", 551).apply();
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }

        @JvmStatic
        @NotNull
        public final d d() {
            return d.f54940j;
        }

        @NotNull
        public final String e() {
            return "content://com.join.android.app.mgsim.wufun.addon.virtual.service.fileprovider";
        }

        public final boolean f() {
            return d.f54939i;
        }

        public final boolean g() {
            if (d().O()) {
                return Overmind.is64Bit();
            }
            return false;
        }

        @JvmStatic
        public final void i(@NotNull String packageName, @Nullable String str) {
            MindPackageSettings k4;
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            if (d().O() && (k4 = Overmind.getMindPackageManager().k(packageName)) != null) {
                boolean z4 = true;
                Set<String> emptySet = str == null || str.length() == 0 ? SetsKt__SetsKt.emptySet() : b.f54935a.d(str);
                HashSet<String> hashSet = k4.f68132e;
                Intrinsics.checkNotNullExpressionValue(hashSet, "info.supportAbis");
                HashSet hashSet2 = new HashSet();
                hashSet2.addAll(hashSet);
                hashSet2.retainAll(emptySet);
                boolean z5 = !Overmind.is64Bit();
                k4.k();
                if (hashSet2.isEmpty()) {
                    if (hashSet.isEmpty()) {
                        return;
                    }
                    if ((z5 && b.f54935a.a(hashSet)) || (!z5 && b.f54935a.b(hashSet))) {
                        z4 = false;
                    }
                    if (k4.k() != z4) {
                        Overmind.getMindPackageManager().D(packageName, z4);
                    }
                } else if (emptySet.isEmpty()) {
                } else {
                    if ((z5 && b.f54935a.a(hashSet2)) || (!z5 && b.f54935a.b(hashSet2))) {
                        z4 = false;
                    }
                    if (k4.k() != z4) {
                        Overmind.getMindPackageManager().D(packageName, z4);
                    }
                }
            }
        }

        @NotNull
        public final String k(@NotNull String path) {
            int indexOf$default;
            int indexOf$default2;
            String replace$default;
            Intrinsics.checkNotNullParameter(path, "path");
            try {
                String str = "com.join.android.app.mgsim.wufun";
                indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) path, "com.join.android.app.mgsim.wufun", 0, false, 6, (Object) null);
                indexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) path, net.lingala.zip4j.util.e.F0, indexOf$default, false, 4, (Object) null);
                if (indexOf$default != -1 && indexOf$default < indexOf$default2) {
                    str = path.substring(indexOf$default, indexOf$default2);
                    Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                replace$default = StringsKt__StringsJVMKt.replace$default(path, str, "com.join.android.app.mgsim.wufun.addon", false, 4, (Object) null);
            } catch (Exception e5) {
                e = e5;
            }
            try {
                w0.e("replace " + path + " → " + replace$default);
                return replace$default;
            } catch (Exception e6) {
                e = e6;
                path = replace$default;
                e.printStackTrace();
                return path;
            }
        }

        @JvmStatic
        @JvmOverloads
        public final void l(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            n(this, intent, 0, 2, null);
        }

        @JvmStatic
        @JvmOverloads
        public final void m(@NotNull Intent intent, int i4) {
            Intrinsics.checkNotNullParameter(intent, "intent");
        }

        public final void o(boolean z4) {
            d.f54939i = z4;
        }
    }

    public static final boolean D() {
        return f54937g.g();
    }

    private final boolean E(String str) {
        return com.xinzhu.overmind.a.d(str).exists();
    }

    public static /* synthetic */ boolean H(d dVar, String str, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = f54938h;
        }
        return dVar.G(str, i4);
    }

    public static /* synthetic */ boolean J(d dVar, String str, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return dVar.I(str, i4);
    }

    public static final void T(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        f54937g.d().Q(str);
        w0.e("killModApp:" + f54938h + ' ' + str);
    }

    public static /* synthetic */ void Y(d dVar, Context context, ModMeta modMeta, int i4, String str, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i4 = f54938h;
        }
        if ((i5 & 8) != 0) {
            str = null;
        }
        dVar.V(context, modMeta, i4, str);
    }

    private final String Z(Context context, ApplicationInfo applicationInfo) {
        String str = "";
        if (context != null && applicationInfo != null) {
            try {
                String str2 = applicationInfo.packageName;
                Intrinsics.checkNotNullExpressionValue(str2, "ai.packageName");
                f2.a u4 = u(this, str2, 0, 2, null);
                if (u4 != null) {
                    str = u4.f68996e.toString();
                } else {
                    str = applicationInfo.loadLabel(context.getPackageManager()).toString();
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return str;
    }

    @JvmStatic
    public static final void b0(@NotNull String str, @Nullable String str2) {
        f54937g.i(str, str2);
    }

    private final void f0() {
        if (O()) {
            Overmind overmind = Overmind.get();
            List<MindUserInfo> userList = overmind.getUsers();
            if (userList == null || userList.isEmpty()) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue(userList, "userList");
            int i4 = ((MindUserInfo) CollectionsKt.last((List<? extends Object>) userList)).f68255b;
            if (overmind.getInstalledApplications(0, i4).isEmpty()) {
                overmind.deleteUser(i4);
                f0();
            }
        }
    }

    @JvmStatic
    @JvmOverloads
    public static final void g0(@NotNull Intent intent) {
        f54937g.l(intent);
    }

    @JvmStatic
    @JvmOverloads
    public static final void h0(@NotNull Intent intent, int i4) {
        f54937g.m(intent, i4);
    }

    private final void k(String str, int i4) {
        String N;
        String d5;
        String D;
        List<String> listOf;
        String B;
        String str2;
        String str3;
        List<String> listOf2;
        if (O()) {
            MindPackageSettings k4 = Overmind.getMindPackageManager().k(str);
            f fVar = f.f54952a;
            String w4 = fVar.w(str, i4);
            if (i4 == 0) {
                N = fVar.M(str);
                d5 = fVar.c(str);
                D = fVar.Y(str);
            } else {
                N = fVar.N(str, i4);
                d5 = fVar.d(str, i4);
                D = fVar.D(str, i4);
            }
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{w4, N, d5, D});
            for (String str4 : listOf) {
                FileUtils.deleteDirs(str4);
            }
            if (k4.k()) {
                f fVar2 = f.f54952a;
                String z4 = fVar2.z(str, i4);
                if (i4 == 0) {
                    str2 = fVar2.O(str);
                    str3 = fVar2.f(str);
                    B = fVar2.Z(str);
                } else {
                    String P = fVar2.P(str, i4);
                    String g4 = fVar2.g(str, i4);
                    B = fVar2.B(str, i4);
                    str2 = P;
                    str3 = g4;
                }
                listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{z4, str2, str3, B});
                for (String str5 : listOf2) {
                    com.xinzhu.overmind.plugin.b.h(str5);
                }
            }
        }
    }

    public static /* synthetic */ void k0(d dVar, String str, String str2, int i4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i4 = 0;
        }
        dVar.j0(str, str2, i4);
    }

    static /* synthetic */ void l(d dVar, String str, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        dVar.k(str, i4);
    }

    @JvmStatic
    @Nullable
    public static Bundle n(@NotNull Context context, @NotNull Uri uri, @Nullable String str, @Nullable String str2, @Nullable Bundle bundle) throws IllegalAccessException {
        return f54937g.b(context, uri, str, str2, bundle);
    }

    @JvmStatic
    @NotNull
    public static final d o() {
        return f54937g.d();
    }

    public static /* synthetic */ f2.a u(d dVar, String str, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return dVar.t(str, i4);
    }

    public static /* synthetic */ int x(d dVar, String str, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = f54938h;
        }
        return dVar.w(str, i4);
    }

    private final int y(Context context, String str) {
        try {
            PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(str, 128);
            w0.e(this.f54945a, "loadApk packageInfo");
            if (packageArchiveInfo != null) {
                return packageArchiveInfo.versionCode;
            }
            return 0;
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    private final String z(Context context, String str) {
        try {
            PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(str, 128);
            if (packageArchiveInfo == null) {
                return "0";
            }
            String str2 = packageArchiveInfo.versionName;
            Intrinsics.checkNotNullExpressionValue(str2, "packageInfo.versionName");
            return str2;
        } catch (Exception e5) {
            e5.printStackTrace();
            return "0";
        }
    }

    public final void A(@NotNull String packageName, @NotNull String archivePath, @Nullable String str, @NotNull String archiveId) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(archivePath, "archivePath");
        Intrinsics.checkNotNullParameter(archiveId, "archiveId");
        String r4 = f.r(f.f54952a, packageName, 0, 2, null);
        StringBuilder sb = new StringBuilder();
        sb.append(packageName);
        sb.append(" \n ");
        sb.append(archivePath);
        sb.append("\n ");
        sb.append(archiveId);
        sb.append('\n');
        sb.append(r4);
        sb.append("  ");
        PluginConfig.setArchivePath(r4, archivePath, str, archiveId);
    }

    @Nullable
    public final InstallResult B(@NotNull String source) {
        boolean startsWith$default;
        InstallResult installPackageAsUser_System;
        String str;
        Intrinsics.checkNotNullParameter(source, "source");
        if (O()) {
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(source, net.lingala.zip4j.util.e.F0, false, 2, null);
            if (startsWith$default) {
                source = "file://" + source;
            }
            Overmind overmind = Overmind.get();
            if (URLUtil.isValidUrl(source)) {
                installPackageAsUser_System = overmind.installPackageAsUser_Storage(Uri.parse(source), f54938h);
            } else {
                installPackageAsUser_System = overmind.installPackageAsUser_System(source, f54938h);
            }
            if (installPackageAsUser_System != null) {
                String[] strArr = new String[1];
                if (installPackageAsUser_System.f67790b) {
                    str = "安装成功";
                } else {
                    str = "安装失败： " + installPackageAsUser_System.f67792d;
                }
                strArr[0] = str;
                w0.e(strArr);
            }
            f0();
            return installPackageAsUser_System;
        }
        return null;
    }

    public final boolean C(@Nullable String str, int i4) {
        InstallResult installPackageAsUser_System;
        String str2;
        if ((str == null || str.length() == 0) || !O()) {
            return false;
        }
        Overmind overmind = Overmind.get();
        if (Overmind.getMindPackageManager().k(str) != null) {
            installPackageAsUser_System = overmind.installPackageAsUser_Exist(str, i4);
        } else {
            installPackageAsUser_System = overmind.installPackageAsUser_System(str, i4);
        }
        if (installPackageAsUser_System == null) {
            w0.e("安装失败： " + installPackageAsUser_System + " is Null");
            return false;
        }
        String[] strArr = new String[1];
        if (installPackageAsUser_System.f67790b) {
            str2 = "安装成功";
        } else {
            str2 = "安装失败： " + installPackageAsUser_System.f67792d;
        }
        strArr[0] = str2;
        w0.e(strArr);
        f0();
        return installPackageAsUser_System.f67790b;
    }

    @JvmOverloads
    public final boolean F(@Nullable String str) {
        return H(this, str, 0, 2, null);
    }

    @JvmOverloads
    public final boolean G(@Nullable String str, int i4) {
        boolean z4;
        if ((str == null || str.length() == 0) || !O()) {
            return false;
        }
        if (Overmind.getMindPackageManager() == null) {
            return E(str);
        }
        try {
            z4 = Overmind.getMindPackageManager().t(str, i4);
        } catch (Exception e5) {
            e5.printStackTrace();
            z4 = false;
        }
        return z4 || E(str);
    }

    public final boolean I(@Nullable String str, int i4) {
        if (O()) {
            if (str == null || str.length() == 0) {
                return false;
            }
            try {
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = Overmind.get().getRunningAppProcessesContainPlugin();
                Intrinsics.checkNotNullExpressionValue(runningAppProcesses, "runningAppProcesses");
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (Intrinsics.areEqual(runningAppProcessInfo.processName, str) && i4 == runningAppProcessInfo.uid) {
                        return true;
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            return false;
        }
        return false;
    }

    public final boolean K(@Nullable ApplicationInfo applicationInfo) {
        if (!O() || Overmind.getContext() == null || applicationInfo == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 23 && Overmind.getContext().getApplicationInfo().targetSdkVersion >= 23 && applicationInfo.targetSdkVersion < 23;
    }

    public final boolean L() {
        if (O()) {
            return Overmind.isPluginPkgInstalled();
        }
        return false;
    }

    public final boolean M() {
        if (O()) {
            try {
                ApplicationInfo applicationInfo = Overmind.getContext().getPackageManager().getApplicationInfo(Overmind.getPluginPkg(), 128);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "pm.getApplicationInfo(Ov…ageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    if (Intrinsics.areEqual(bundle.get("vmengine"), "overmind")) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        }
        return false;
    }

    public final boolean N(@Nullable String str) {
        if (O()) {
            if (str == null || str.length() == 0) {
                return false;
            }
            MindPackageSettings k4 = Overmind.getMindPackageManager().k(str);
            if (k4 == null) {
                File d5 = com.xinzhu.overmind.a.d(str);
                return d5 != null && d5.exists();
            }
            return k4.k();
        }
        return false;
    }

    public final boolean O() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public final boolean P(@Nullable Context context, @NotNull String path) {
        PackageManager packageManager;
        PackageInfo packageArchiveInfo;
        Intrinsics.checkNotNullParameter(path, "path");
        if (context == null || (packageManager = context.getPackageManager()) == null || (packageArchiveInfo = packageManager.getPackageArchiveInfo(path, 128)) == null) {
            return false;
        }
        return packageArchiveInfo.applicationInfo.metaData.getBoolean(com.join.mgps.mod.utils.d.f53628k);
    }

    public final void Q(@Nullable String str) {
        if (O()) {
            if (str == null || str.length() == 0) {
                return;
            }
            Overmind.get().stopApk(str, f54938h);
        }
    }

    public final void R() {
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0016 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0017 A[Catch: Exception -> 0x0022, TRY_LEAVE, TryCatch #0 {Exception -> 0x0022, blocks: (B:24:0x0002, B:26:0x000a, B:33:0x0017), top: B:38:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S(@org.jetbrains.annotations.Nullable android.content.Intent r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L26
            java.lang.String r0 = "exitGamePackage"
            java.lang.String r3 = r3.getStringExtra(r0)     // Catch: java.lang.Exception -> L22
            if (r3 == 0) goto L13
            int r0 = r3.length()     // Catch: java.lang.Exception -> L22
            if (r0 != 0) goto L11
            goto L13
        L11:
            r0 = 0
            goto L14
        L13:
            r0 = 1
        L14:
            if (r0 == 0) goto L17
            return
        L17:
            java.util.concurrent.ThreadPoolExecutor r0 = r2.f54946b     // Catch: java.lang.Exception -> L22
            com.join.mgps.va.overmind.c r1 = new com.join.mgps.va.overmind.c     // Catch: java.lang.Exception -> L22
            r1.<init>()     // Catch: java.lang.Exception -> L22
            r0.execute(r1)     // Catch: java.lang.Exception -> L22
            goto L26
        L22:
            r3 = move-exception
            r3.printStackTrace()
        L26:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.va.overmind.d.S(android.content.Intent):void");
    }

    public final void U(@NotNull Context context, int i4, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (O()) {
            if (str == null || str.length() == 0) {
                return;
            }
            try {
                PluginConfig.setLastLaunchPkg(context, str);
                Overmind.get().launchApk(str, i4);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01be A[Catch: Exception -> 0x01c8, TryCatch #0 {Exception -> 0x01c8, blocks: (B:71:0x0019, B:73:0x0041, B:75:0x004b, B:78:0x0053, B:80:0x00dd, B:82:0x00e5, B:84:0x00f6, B:86:0x0100, B:89:0x0107, B:91:0x0115, B:93:0x011b, B:95:0x012b, B:97:0x0136, B:99:0x013b, B:101:0x0143, B:103:0x0152, B:110:0x016d, B:111:0x0174, B:113:0x01b2, B:119:0x01be, B:120:0x01c3, B:108:0x0164), top: B:126:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V(@org.jetbrains.annotations.NotNull android.content.Context r20, @org.jetbrains.annotations.Nullable com.join.mgps.mod.bean.ModMeta r21, int r22, @org.jetbrains.annotations.Nullable java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.va.overmind.d.V(android.content.Context, com.join.mgps.mod.bean.ModMeta, int, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00f0 A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:84:0x001d, B:88:0x0026, B:90:0x004a, B:92:0x0050, B:98:0x005c, B:101:0x0064, B:103:0x00f0, B:105:0x00fa, B:107:0x010b, B:109:0x0115, B:112:0x011c, B:114:0x012c, B:116:0x0132, B:118:0x0142, B:120:0x014c, B:123:0x0153, B:125:0x015c, B:127:0x0169, B:129:0x017c, B:137:0x019a, B:140:0x01df, B:147:0x020a, B:141:0x01ed, B:143:0x01f5, B:144:0x01fd, B:146:0x0203, B:135:0x018b, B:136:0x0193), top: B:152:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00fa A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:84:0x001d, B:88:0x0026, B:90:0x004a, B:92:0x0050, B:98:0x005c, B:101:0x0064, B:103:0x00f0, B:105:0x00fa, B:107:0x010b, B:109:0x0115, B:112:0x011c, B:114:0x012c, B:116:0x0132, B:118:0x0142, B:120:0x014c, B:123:0x0153, B:125:0x015c, B:127:0x0169, B:129:0x017c, B:137:0x019a, B:140:0x01df, B:147:0x020a, B:141:0x01ed, B:143:0x01f5, B:144:0x01fd, B:146:0x0203, B:135:0x018b, B:136:0x0193), top: B:152:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W(@org.jetbrains.annotations.NotNull android.content.Context r20, @org.jetbrains.annotations.Nullable com.join.mgps.mod.bean.ModMeta r21, @org.jetbrains.annotations.NotNull com.github.snowdream.android.app.downloader.DownloadTask r22) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.va.overmind.d.W(android.content.Context, com.join.mgps.mod.bean.ModMeta, com.github.snowdream.android.app.downloader.DownloadTask):void");
    }

    public final void X(@NotNull Context context, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (O()) {
            w0.e("launchApp " + f54938h + ' ' + packageName);
            U(context, f54938h, packageName);
        }
    }

    @Nullable
    public final Object a0(@NotNull String packageName, @Nullable String str, @Nullable Application application) {
        Object obj;
        String lastLaunchPkg;
        StringBuilder sb;
        String H;
        String S;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i4;
        int i5;
        String str8;
        String str9;
        String str10;
        boolean contains$default;
        String str11;
        String str12;
        String str13;
        int parseInt;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (O()) {
            try {
                lastLaunchPkg = PluginConfig.getLastLaunchPkg(VApp.Companion.a());
            } catch (Exception e5) {
                e = e5;
                obj = null;
            }
            if (TextUtils.isEmpty(lastLaunchPkg) || Intrinsics.areEqual(lastLaunchPkg, packageName)) {
                Overmind.getContext().sendBroadcast(new Intent(com.join.mgps.mod.utils.d.f53639v));
                boolean z4 = L() && N(packageName);
                w0.e("load mod", "packageName=" + packageName + ", lastLaunchPackage=" + lastLaunchPkg + ' ' + z4);
                if (Overmind.is64Bit()) {
                    sb = new StringBuilder();
                    sb.append(f.l(f.f54952a, packageName, 0, false, 6, null));
                    sb.append("/arm64");
                } else {
                    sb = new StringBuilder();
                    sb.append(f.l(f.f54952a, packageName, 0, false, 6, null));
                    sb.append("/arm");
                }
                String sb2 = sb.toString();
                if (z4) {
                    f fVar = f.f54952a;
                    H = f.K(fVar, packageName, 0, 2, null);
                    S = f.V(fVar, packageName, 0, 2, null);
                } else {
                    f fVar2 = f.f54952a;
                    H = f.H(fVar2, packageName, 0, 2, null);
                    S = f.S(fVar2, packageName, 0, 2, null);
                }
                String str14 = "wufun";
                String str15 = "";
                String str16 = "0";
                if ((H == null || H.length() == 0) || !new File(H).exists()) {
                    str2 = "wufun";
                    str3 = "";
                    str4 = "0";
                    str5 = str4;
                    str6 = str5;
                    str7 = str6;
                    i4 = 0;
                } else {
                    String modPath = PluginConfig.getModPath(H);
                    try {
                        Intrinsics.checkNotNullExpressionValue(modPath, "getModPath(cfgPath)");
                        this.f54947c = modPath;
                        this.f54948d = PluginConfig.getSoVersion(H);
                        this.f54949e = PluginConfig.getSoCode(H);
                        String modGameId = PluginConfig.getModGameId(H);
                        Intrinsics.checkNotNullExpressionValue(modGameId, "getModGameId(cfgPath)");
                        u.c modMenuSwitch = PluginConfig.getModMenuSwitch(H);
                        if (modMenuSwitch != null) {
                            str13 = modMenuSwitch.c("goldFingerSwitch");
                            str6 = modMenuSwitch.c("archiveCloudSwitch");
                            str11 = modGameId;
                            str12 = modMenuSwitch.c("introductionSwitch");
                        } else {
                            str11 = modGameId;
                            str12 = "0";
                            str13 = str12;
                            str6 = str13;
                        }
                        u.c modConfig = PluginConfig.getModConfig(H);
                        if (modConfig != null) {
                            String c5 = modConfig.c("channelNum");
                            Intrinsics.checkNotNullExpressionValue(c5, "configSection[\"channelNum\"]");
                            if (g2.i(modConfig.c("targetVersion"))) {
                                try {
                                    String c6 = modConfig.c("targetVersion");
                                    Intrinsics.checkNotNullExpressionValue(c6, "configSection[\"targetVersion\"]");
                                    parseInt = Integer.parseInt(c6);
                                } catch (Exception e6) {
                                    e6.printStackTrace();
                                }
                                String c7 = modConfig.c("androidId");
                                String c8 = modConfig.c("platform");
                                String c9 = modConfig.c("package_type");
                                int i6 = parseInt;
                                Intrinsics.checkNotNullExpressionValue(c9, "configSection[\"package_type\"]");
                                String c10 = modConfig.c("typeId");
                                Intrinsics.checkNotNullExpressionValue(c10, "configSection[\"typeId\"]");
                                str7 = c10;
                                str2 = c8;
                                str14 = c9;
                                i4 = i6;
                                str4 = str12;
                                str3 = c7;
                                str15 = str11;
                                String str17 = str13;
                                str5 = c5;
                                str16 = str17;
                            }
                            parseInt = 0;
                            String c72 = modConfig.c("androidId");
                            String c82 = modConfig.c("platform");
                            String c92 = modConfig.c("package_type");
                            int i62 = parseInt;
                            Intrinsics.checkNotNullExpressionValue(c92, "configSection[\"package_type\"]");
                            String c102 = modConfig.c("typeId");
                            Intrinsics.checkNotNullExpressionValue(c102, "configSection[\"typeId\"]");
                            str7 = c102;
                            str2 = c82;
                            str14 = c92;
                            i4 = i62;
                            str4 = str12;
                            str3 = c72;
                            str15 = str11;
                            String str172 = str13;
                            str5 = c5;
                            str16 = str172;
                        } else {
                            str4 = str12;
                            str2 = "wufun";
                            str3 = "";
                            str7 = "0";
                            str15 = str11;
                            i4 = 0;
                            str16 = str13;
                            str5 = str7;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        obj = null;
                        e.printStackTrace();
                        return obj;
                    }
                }
                if (z4) {
                    String str18 = this.f54947c;
                    i5 = i4;
                    String pluginPkg = Overmind.getPluginPkg();
                    str8 = str2;
                    Intrinsics.checkNotNullExpressionValue(pluginPkg, "getPluginPkg()");
                    str9 = str3;
                    str10 = str14;
                    try {
                        contains$default = StringsKt__StringsKt.contains$default((CharSequence) str18, (CharSequence) pluginPkg, false, 2, (Object) null);
                        if (!contains$default) {
                            this.f54947c = f54937g.k(this.f54947c);
                        }
                    } catch (Exception e8) {
                        e = e8;
                        obj = null;
                        e.printStackTrace();
                        return obj;
                    }
                } else {
                    i5 = i4;
                    str8 = str2;
                    str9 = str3;
                    str10 = str14;
                }
                w0.e("load mod", "modPath=" + this.f54947c);
                if (TextUtils.isEmpty(this.f54947c)) {
                    return null;
                }
                boolean P = P(application, this.f54947c);
                f54939i = P;
                com.join.mgps.mod.utils.b bVar = new com.join.mgps.mod.utils.b(application, P ? sb2 : S);
                this.f54950f = bVar;
                Intrinsics.checkNotNull(bVar);
                if (bVar.j()) {
                    obj = null;
                    return obj;
                }
                com.join.mgps.mod.utils.b bVar2 = this.f54950f;
                Intrinsics.checkNotNull(bVar2);
                bVar2.k(this.f54947c);
                com.join.mgps.mod.utils.b bVar3 = this.f54950f;
                Intrinsics.checkNotNull(bVar3);
                if (bVar3.j()) {
                    obj = null;
                    try {
                        ModMeta modMeta = new ModMeta();
                        Context applicationContext = VApp.Companion.a().getApplicationContext();
                        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
                        modMeta.bind((Application) applicationContext, packageName, str, application);
                        String str19 = this.f54947c;
                        com.join.mgps.mod.utils.b bVar4 = this.f54950f;
                        Intrinsics.checkNotNull(bVar4);
                        PackageInfo h4 = bVar4.h();
                        com.join.mgps.mod.utils.b bVar5 = this.f54950f;
                        Intrinsics.checkNotNull(bVar5);
                        DexClassLoader e9 = bVar5.e();
                        com.join.mgps.mod.utils.b bVar6 = this.f54950f;
                        Intrinsics.checkNotNull(bVar6);
                        Resources resources = bVar6.getResources();
                        com.join.mgps.mod.utils.b bVar7 = this.f54950f;
                        Intrinsics.checkNotNull(bVar7);
                        modMeta.setModInfo(str19, h4, e9, resources, bVar7.f());
                        com.join.mgps.mod.utils.b bVar8 = this.f54950f;
                        Intrinsics.checkNotNull(bVar8);
                        modMeta.setEntryDataClass(bVar8.g());
                        modMeta.setGameId(str15);
                        modMeta.setUseNativeLibDir(f54939i);
                        modMeta.setNativeLibDir(sb2);
                        modMeta.setPluginLibDir(S);
                        modMeta.setModVersion(this.f54948d);
                        modMeta.setModCode(this.f54949e);
                        modMeta.setHostPackage(Overmind.getMainPkg());
                        modMeta.setUserId(com.xinzhu.overmind.client.e.getUserId());
                        modMeta.setGoldFingerSwitch(str16);
                        modMeta.setArchiveCloudSwitch(str6);
                        modMeta.setIntroductionSwitch(str4);
                        modMeta.setChannelNum(str5);
                        modMeta.setAndroidId(str9);
                        modMeta.setPackage_type(str10);
                        modMeta.setPlatform(str8);
                        modMeta.setTarget_version(i5);
                        modMeta.setTypeId(str7);
                        com.join.mgps.mod.utils.b bVar9 = this.f54950f;
                        Intrinsics.checkNotNull(bVar9);
                        return bVar9.n(modMeta);
                    } catch (Exception e10) {
                        e = e10;
                        e.printStackTrace();
                        return obj;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void c0(int i4) {
        if (O()) {
            Overmind overmind = Overmind.get();
            MindUserInfo mindUserInfo = null;
            for (MindUserInfo mindUserInfo2 : overmind.getUsers()) {
                if (mindUserInfo2.f68255b == i4) {
                    mindUserInfo = mindUserInfo2;
                }
            }
            if (mindUserInfo == null && overmind.createUser(i4) == null) {
                throw new IllegalStateException();
            }
        }
    }

    public final void d0() {
        try {
            if (O() && com.xinzhu.datatransfer.b.a().exists()) {
                boolean isPkgInstalledOutside = Overmind.isPkgInstalledOutside(Overmind.getPluginPkg());
                if (!L() && !isPkgInstalledOutside) {
                    Overmind.get().doTransferInstalls();
                } else if (!M()) {
                    Overmind.get().doTransferInstallsOnlyForMainPackage();
                } else {
                    com.xinzhu.overmind.plugin.b.e(com.xinzhu.overmind.a.i().getAbsolutePath(), com.xinzhu.overmind.a.h().getAbsolutePath());
                    Overmind.get().doTransferInstalls();
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public final void e() {
    }

    public final void e0(@NotNull String targetPkg) {
        Intrinsics.checkNotNullParameter(targetPkg, "targetPkg");
        try {
            if (O() && com.xinzhu.datatransfer.b.a().exists()) {
                if (!L()) {
                    Overmind.get().doTransferInstalls();
                } else if (!M()) {
                    Overmind.get().doTransferInstallsOnlyForMainPackage();
                } else {
                    com.xinzhu.overmind.plugin.b.e(com.xinzhu.overmind.a.i().getAbsolutePath(), com.xinzhu.overmind.a.d(targetPkg).getAbsolutePath());
                    Overmind.get().doTransferInstalls();
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public final boolean f(@Nullable String str, int i4) {
        boolean z4 = false;
        if ((str == null || str.length() == 0) || !O()) {
            return false;
        }
        Overmind overmind = Overmind.get();
        MindPackageSettings k4 = Overmind.getMindPackageManager().k(str);
        if (k4 == null) {
            return false;
        }
        for (Integer num : k4.f()) {
            if (num != null && num.intValue() == i4) {
                z4 = true;
            }
        }
        if (!z4) {
            MindUserInfo mindUserInfo = null;
            for (MindUserInfo mindUserInfo2 : overmind.getUsers()) {
                if (mindUserInfo2.f68255b == i4) {
                    mindUserInfo = mindUserInfo2;
                }
            }
            if (mindUserInfo == null && overmind.createUser(i4) == null) {
                throw new IllegalStateException();
            }
            if (overmind.installPackageAsUser_Exist(str, i4).f67790b) {
                return true;
            }
        }
        return z4;
    }

    @RequiresApi(api = 23)
    public final boolean g(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (O() && Overmind.isPluginPkgInstalled() && !com.xinzhu.overmind.plugin.b.i()) {
            Intent a5 = com.overmind.virtual.oem.a.a(context);
            if (a5 != null) {
                try {
                    context.startActivity(a5);
                    return true;
                } catch (Throwable th) {
                    th.printStackTrace();
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public final long h(@Nullable String str) {
        MindShareFileInfo b5;
        long j4;
        long j5 = 0;
        if ((str == null || str.length() == 0) || (b5 = com.xinzhu.overmind.plugin.b.b(str)) == null) {
            return 0L;
        }
        if (!b5.f68018d.booleanValue()) {
            return b5.f68019e;
        }
        try {
            for (MindShareFileInfo mindShareFileInfo : com.xinzhu.overmind.plugin.b.m(str)) {
                Boolean bool = mindShareFileInfo.f68017c;
                Intrinsics.checkNotNullExpressionValue(bool, "file.exists");
                if (bool.booleanValue()) {
                    Boolean bool2 = mindShareFileInfo.f68018d;
                    Intrinsics.checkNotNullExpressionValue(bool2, "file.isDirectory");
                    if (bool2.booleanValue()) {
                        j4 = h(mindShareFileInfo.f68016b);
                        j5 += j4;
                    }
                }
                MindShareFileInfo b6 = com.xinzhu.overmind.plugin.b.b(mindShareFileInfo.f68016b);
                if (b6 != null) {
                    j4 = b6.f68019e;
                    j5 += j4;
                }
            }
        } catch (Exception unused) {
        }
        return j5;
    }

    public final boolean i(@Nullable String[] strArr, boolean z4) {
        if (strArr == null) {
            return true;
        }
        Iterator it2 = ArrayIteratorKt.iterator(strArr);
        while (it2.hasNext()) {
            if (!j((String) it2.next(), z4)) {
                return false;
            }
        }
        return true;
    }

    @JvmOverloads
    public final void i0(@NotNull String packageName, @NotNull String abi) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(abi, "abi");
        k0(this, packageName, abi, 0, 4, null);
    }

    public final boolean j(@Nullable String str, boolean z4) {
        if (O() && Overmind.getContext() != null) {
            if (str == null || str.length() == 0) {
                return false;
            }
            PackageManager packageManager = Overmind.getContext().getPackageManager();
            if (z4) {
                if (packageManager.checkPermission(str, "com.join.android.app.mgsim.wufun.addon") != 0) {
                    return false;
                }
            } else if (packageManager.checkPermission(str, "com.join.android.app.mgsim.wufun") != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @JvmOverloads
    public final void j0(@NotNull String packageName, @NotNull String abi, int i4) {
        MindPackageSettings k4;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(abi, "abi");
        if (O() && (k4 = Overmind.getMindPackageManager().k(packageName)) != null) {
            k4.k();
            boolean z4 = b.f54935a.f(abi) != Overmind.is64Bit();
            if (z4 != k4.k()) {
                Overmind.getMindPackageManager().D(packageName, z4);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0017 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0018 A[Catch: Exception -> 0x0012, TryCatch #0 {Exception -> 0x0012, blocks: (B:35:0x0009, B:44:0x0018, B:46:0x0022, B:47:0x002a, B:49:0x0030, B:50:0x0043), top: B:54:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l0(@org.jetbrains.annotations.Nullable java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = r3.O()
            if (r0 != 0) goto L7
            return
        L7:
            if (r4 == 0) goto L14
            int r0 = r4.length()     // Catch: java.lang.Exception -> L12
            if (r0 != 0) goto L10
            goto L14
        L10:
            r0 = 0
            goto L15
        L12:
            r4 = move-exception
            goto L55
        L14:
            r0 = 1
        L15:
            if (r0 == 0) goto L18
            return
        L18:
            com.xinzhu.overmind.client.frameworks.g r0 = com.xinzhu.overmind.Overmind.getMindPackageManager()     // Catch: java.lang.Exception -> L12
            com.xinzhu.overmind.server.pm.MindPackageSettings r0 = r0.k(r4)     // Catch: java.lang.Exception -> L12
            if (r0 == 0) goto L43
            java.util.List r0 = r0.f()     // Catch: java.lang.Exception -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L12
        L2a:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L12
            if (r1 == 0) goto L43
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L12
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L12
            java.lang.String r2 = "userId"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch: java.lang.Exception -> L12
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L12
            r3.k(r4, r1)     // Catch: java.lang.Exception -> L12
            goto L2a
        L43:
            b2.g r0 = b2.g.t()     // Catch: java.lang.Exception -> L12
            r0.n(r4)     // Catch: java.lang.Exception -> L12
            com.xinzhu.overmind.Overmind r0 = com.xinzhu.overmind.Overmind.get()     // Catch: java.lang.Exception -> L12
            r0.uninstallPackage(r4)     // Catch: java.lang.Exception -> L12
            r3.f0()     // Catch: java.lang.Exception -> L12
            goto L58
        L55:
            r4.printStackTrace()
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.va.overmind.d.l0(java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x00f6 A[Catch: Exception -> 0x01e1, all -> 0x01fc, TryCatch #2 {all -> 0x01fc, blocks: (B:101:0x009f, B:103:0x00b2, B:104:0x00b5, B:106:0x00c0, B:110:0x00d4, B:112:0x00da, B:118:0x00e6, B:120:0x00ec, B:121:0x00ef, B:123:0x00f6, B:127:0x0102, B:129:0x0111, B:132:0x0118, B:135:0x011e, B:139:0x017b, B:142:0x0194, B:144:0x0198, B:146:0x01b4, B:145:0x01a8, B:126:0x00fe, B:109:0x00d0, B:154:0x01ea), top: B:161:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0198 A[Catch: Exception -> 0x01e1, all -> 0x01fc, TryCatch #2 {all -> 0x01fc, blocks: (B:101:0x009f, B:103:0x00b2, B:104:0x00b5, B:106:0x00c0, B:110:0x00d4, B:112:0x00da, B:118:0x00e6, B:120:0x00ec, B:121:0x00ef, B:123:0x00f6, B:127:0x0102, B:129:0x0111, B:132:0x0118, B:135:0x011e, B:139:0x017b, B:142:0x0194, B:144:0x0198, B:146:0x01b4, B:145:0x01a8, B:126:0x00fe, B:109:0x00d0, B:154:0x01ea), top: B:161:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a8 A[Catch: Exception -> 0x01e1, all -> 0x01fc, TryCatch #2 {all -> 0x01fc, blocks: (B:101:0x009f, B:103:0x00b2, B:104:0x00b5, B:106:0x00c0, B:110:0x00d4, B:112:0x00da, B:118:0x00e6, B:120:0x00ec, B:121:0x00ef, B:123:0x00f6, B:127:0x0102, B:129:0x0111, B:132:0x0118, B:135:0x011e, B:139:0x017b, B:142:0x0194, B:144:0x0198, B:146:0x01b4, B:145:0x01a8, B:126:0x00fe, B:109:0x00d0, B:154:0x01ea), top: B:161:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(@org.jetbrains.annotations.NotNull android.content.Context r19, @org.jetbrains.annotations.NotNull java.lang.String r20, @org.jetbrains.annotations.NotNull java.lang.String r21, @org.jetbrains.annotations.Nullable java.lang.String r22, int r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.va.overmind.d.m(android.content.Context, java.lang.String, java.lang.String, java.lang.String, int, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0019 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x001a A[Catch: Exception -> 0x0014, TRY_LEAVE, TryCatch #0 {Exception -> 0x0014, blocks: (B:29:0x000b, B:38:0x001a), top: B:42:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m0(@org.jetbrains.annotations.Nullable java.lang.String r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.O()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = 1
            if (r4 == 0) goto L16
            int r2 = r4.length()     // Catch: java.lang.Exception -> L14
            if (r2 != 0) goto L12
            goto L16
        L12:
            r2 = 0
            goto L17
        L14:
            r4 = move-exception
            goto L28
        L16:
            r2 = 1
        L17:
            if (r2 == 0) goto L1a
            return r1
        L1a:
            com.xinzhu.overmind.Overmind r2 = com.xinzhu.overmind.Overmind.get()     // Catch: java.lang.Exception -> L14
            r2.uninstallPackageAsUser(r4, r5)     // Catch: java.lang.Exception -> L14
            r3.f0()     // Catch: java.lang.Exception -> L14
            r3.k(r4, r5)     // Catch: java.lang.Exception -> L14
            return r0
        L28:
            r4.printStackTrace()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.va.overmind.d.m0(java.lang.String, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n0(@org.jetbrains.annotations.Nullable java.lang.String r9, @org.jetbrains.annotations.Nullable java.lang.String r10) {
        /*
            r8 = this;
            boolean r0 = r8.O()
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 1
            r1 = 0
            if (r9 == 0) goto L16
            int r2 = r9.length()     // Catch: java.lang.Exception -> L14
            if (r2 != 0) goto L12
            goto L16
        L12:
            r2 = 0
            goto L17
        L14:
            r9 = move-exception
            goto L48
        L16:
            r2 = 1
        L17:
            if (r2 != 0) goto L4b
            if (r10 == 0) goto L23
            int r2 = r10.length()     // Catch: java.lang.Exception -> L14
            if (r2 != 0) goto L22
            goto L23
        L22:
            r0 = 0
        L23:
            if (r0 == 0) goto L26
            goto L4b
        L26:
            com.join.mgps.va.overmind.d$a r0 = com.join.mgps.va.overmind.d.f54937g     // Catch: java.lang.Exception -> L14
            com.join.mgps.va.overmind.d r0 = r0.d()     // Catch: java.lang.Exception -> L14
            boolean r0 = r0.N(r9)     // Catch: java.lang.Exception -> L14
            com.join.mgps.va.overmind.f r2 = com.join.mgps.va.overmind.f.f54952a     // Catch: java.lang.Exception -> L14
            r3 = 2
            r4 = 0
            java.lang.String r1 = com.join.mgps.va.overmind.f.H(r2, r9, r1, r3, r4)     // Catch: java.lang.Exception -> L14
            com.join.mgps.mod.utils.PluginConfig.setModGameId(r1, r10)     // Catch: java.lang.Exception -> L14
            if (r0 == 0) goto L4b
            com.join.mgps.va.overmind.h$a r2 = com.join.mgps.va.overmind.h.f54956a     // Catch: java.lang.Exception -> L14
            r5 = 0
            r6 = 4
            r7 = 0
            r3 = r9
            r4 = r10
            com.join.mgps.va.overmind.h.a.e(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L14
            goto L4b
        L48:
            r9.printStackTrace()
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.va.overmind.d.n0(java.lang.String, java.lang.String):void");
    }

    public final void o0(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        if (O()) {
            try {
                boolean N = f54937g.d().N(str);
                if (!N) {
                    PluginConfig.setModConfig(new File(f.H(f.f54952a, str, 0, 2, null)).getAbsolutePath(), str2, str3, str4, str5, str6, str7, str8, str9, str10);
                    return;
                }
                w0.e("syncWriteModSwitch", "start");
                Bundle bundle = new Bundle();
                bundle.putString("action", "writeModSwitch");
                bundle.putInt("userId", com.xinzhu.overmind.client.e.getUserId());
                bundle.putString("packageName", str);
                bundle.putString("goldSwitch", str2);
                bundle.putString("archiveSwitch", str3);
                bundle.putString("channelNum", str5);
                bundle.putString("targetVersion", str6);
                bundle.putString("androidId", str7);
                bundle.putString("platform", str8);
                bundle.putString("package_type", str9);
                bundle.putString("typeId", str10);
                if (N) {
                    h.f54956a.c(bundle);
                }
                w0.e("syncWriteModSwitch", "end");
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    @NotNull
    public final String p(boolean z4) {
        if (!O() || !z4) {
            String PATH_ANDROID_DATA = v.f28117q;
            Intrinsics.checkNotNullExpressionValue(PATH_ANDROID_DATA, "PATH_ANDROID_DATA");
            return PATH_ANDROID_DATA;
        }
        return f.f54952a.a0() + "/data";
    }

    @NotNull
    public final String q(boolean z4) {
        if (O() && z4) {
            return f.f54952a.a0();
        }
        String PATH_ANDROID = v.f28118r;
        Intrinsics.checkNotNullExpressionValue(PATH_ANDROID, "PATH_ANDROID");
        return PATH_ANDROID;
    }

    @NotNull
    public final String r(boolean z4) {
        if (!O() || !z4) {
            String PATH_ANDROID_OBB = v.f28116p;
            Intrinsics.checkNotNullExpressionValue(PATH_ANDROID_OBB, "PATH_ANDROID_OBB");
            return PATH_ANDROID_OBB;
        }
        return f.f54952a.a0() + "/obb";
    }

    @JvmOverloads
    @Nullable
    public final f2.a s(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return u(this, packageName, 0, 2, null);
    }

    @JvmOverloads
    @Nullable
    public final f2.a t(@NotNull String packageName, int i4) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        f2.a aVar = new f2.a();
        boolean z4 = true;
        if (!O()) {
            List<DownloadTask> tasks = p1.f.K().H(packageName);
            if (!(tasks == null || tasks.isEmpty())) {
                Intrinsics.checkNotNullExpressionValue(tasks, "tasks");
                for (DownloadTask downloadTask : tasks) {
                    if (APKUtils.f14829a.z(downloadTask)) {
                        aVar.f68996e = downloadTask.getShowName();
                        aVar.f69002k = downloadTask.getVerCode();
                        aVar.f69003l = downloadTask.getVer_name();
                        aVar.f68992a = downloadTask.getPackageName();
                        return aVar;
                    }
                }
            }
        }
        for (PackageInfo packageInfo : Overmind.get().getInstalledPackages(0, i4)) {
            String str = packageInfo.packageName;
            if (!((str == null || str.length() == 0) | (!Intrinsics.areEqual(packageInfo.packageName, packageName)))) {
                aVar.f69003l = packageInfo.versionName;
                aVar.f69002k = packageInfo.versionCode;
                aVar.f68992a = packageInfo.packageName;
                try {
                    if (!Overmind.getMindPackageManager().k(packageInfo.packageName).k()) {
                        aVar.f68996e = packageInfo.applicationInfo.loadLabel(Overmind.getPackageManager()).toString();
                        aVar.f68995d = packageInfo.applicationInfo.loadIcon(Overmind.getPackageManager());
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                return aVar;
            }
        }
        if (N(packageName) && L() && !M()) {
            f2.a aVar2 = new f2.a();
            List<DownloadTask> tasks2 = p1.f.K().H(packageName);
            if (tasks2 != null && !tasks2.isEmpty()) {
                z4 = false;
            }
            if (z4) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(tasks2, "tasks");
            for (DownloadTask downloadTask2 : tasks2) {
                if (APKUtils.f14829a.z(downloadTask2)) {
                    aVar2.f68996e = downloadTask2.getShowName();
                    aVar2.f69002k = downloadTask2.getVerCode();
                    aVar2.f69003l = downloadTask2.getVer_name();
                    aVar2.f68992a = downloadTask2.getPackageName();
                    return aVar2;
                }
            }
            return null;
        }
        return null;
    }

    @NotNull
    public final List<f2.a> v() {
        List<f2.a> emptyList;
        if (!O()) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        List<ApplicationInfo> applicationList = Overmind.get().getInstalledApplications(0, f54938h);
        List<PackageInfo> packageList = Overmind.get().getInstalledPackages(0, f54938h);
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 31) {
            Intrinsics.checkNotNullExpressionValue(applicationList, "applicationList");
            for (ApplicationInfo applicationInfo : applicationList) {
                f2.a aVar = new f2.a();
                aVar.f69003l = applicationInfo.compileSdkVersionCodename;
                aVar.f69002k = applicationInfo.compileSdkVersion;
                aVar.f68992a = applicationInfo.packageName;
                aVar.f68996e = applicationInfo.loadLabel(Overmind.getPackageManager()).toString();
                aVar.f68995d = applicationInfo.loadIcon(Overmind.getPackageManager());
                arrayList.add(aVar);
            }
        } else {
            Intrinsics.checkNotNullExpressionValue(packageList, "packageList");
            for (PackageInfo packageInfo : packageList) {
                f2.a aVar2 = new f2.a();
                aVar2.f69003l = packageInfo.versionName;
                aVar2.f69002k = packageInfo.versionCode;
                aVar2.f68992a = packageInfo.packageName;
                aVar2.f68996e = packageInfo.applicationInfo.loadLabel(Overmind.getPackageManager()).toString();
                aVar2.f68995d = packageInfo.applicationInfo.loadIcon(Overmind.getPackageManager());
                arrayList.add(aVar2);
            }
        }
        return arrayList;
    }

    public final int w(@Nullable String str, int i4) {
        Intent j4;
        ComponentName component;
        if (!(str == null || str.length() == 0) && (j4 = Overmind.getMindPackageManager().j(str, i4)) != null && (component = j4.getComponent()) != null) {
            ActivityInfo e5 = Overmind.getMindPackageManager().e(component, j4.getFlags(), i4);
            if (e5 != null) {
                return e5.screenOrientation;
            }
        }
        return 6;
    }
}
