package com.join.mgps.va.overmind;

import android.content.Context;
import android.os.storage.StorageManager;
import com.join.mgps.Util.w0;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.server.pm.MindPackageSettings;
import java.io.File;
import java.io.IOException;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: VDir.kt */
/* loaded from: classes.dex */
public final class f {
    @NotNull

    /* renamed from: a */
    public static final f f54952a;
    @NotNull

    /* renamed from: b */
    private static final String f54953b;
    @NotNull

    /* renamed from: c */
    private static final String f54954c;
    @NotNull

    /* renamed from: d */
    private static final String f54955d;

    static {
        f fVar = new f();
        f54952a = fVar;
        StringBuilder sb = new StringBuilder();
        sb.append(Overmind.is64Bit() ? com.xinzhu.overmind.a.b0() : com.xinzhu.overmind.a.a0().getAbsolutePath());
        sb.append("/sdcard");
        String a5 = fVar.a(sb.toString());
        f54953b = a5;
        f54954c = fVar.a(com.xinzhu.overmind.a.b0().getAbsolutePath() + "/sdcard");
        f54955d = fVar.a(a5 + "/Android");
    }

    private f() {
    }

    public static /* synthetic */ String A(f fVar, String str, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return fVar.z(str, i4);
    }

    public static /* synthetic */ String C(f fVar, String str, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return fVar.B(str, i4);
    }

    public static /* synthetic */ String E(f fVar, String str, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return fVar.D(str, i4);
    }

    public static /* synthetic */ String H(f fVar, String str, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return fVar.G(str, i4);
    }

    public static /* synthetic */ String K(f fVar, String str, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return fVar.J(str, i4);
    }

    public static /* synthetic */ String S(f fVar, String str, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return fVar.R(str, i4);
    }

    public static /* synthetic */ String V(f fVar, String str, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return fVar.U(str, i4);
    }

    private final String a(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    public static /* synthetic */ String e(f fVar, String str, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return fVar.d(str, i4);
    }

    public static /* synthetic */ String h(f fVar, String str, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return fVar.g(str, i4);
    }

    public static /* synthetic */ String l(f fVar, String str, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        return fVar.k(str, i4, z4);
    }

    public static /* synthetic */ String o(f fVar, String str, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return fVar.n(str, i4);
    }

    public static /* synthetic */ String r(f fVar, String str, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return fVar.q(str, i4);
    }

    public static /* synthetic */ String u(f fVar, String str, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return fVar.t(str, i4);
    }

    public static /* synthetic */ String x(f fVar, String str, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return fVar.w(str, i4);
    }

    @NotNull
    public final String B(@NotNull String packageName, int i4) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        String str = f54953b + "/user/" + i4 + '/' + packageName;
        a(str);
        return str;
    }

    @NotNull
    public final String D(@NotNull String packageName, int i4) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        String str = f54953b + "/user/" + i4 + '/' + packageName;
        a(str);
        return str;
    }

    @JvmOverloads
    @NotNull
    public final String F(@Nullable String str) {
        return H(this, str, 0, 2, null);
    }

    @JvmOverloads
    @NotNull
    public final String G(@Nullable String str, int i4) {
        File file = new File(com.xinzhu.overmind.a.r(str, i4) + "/files/mod_cfg.ini");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }
        w0.e("ModConfigPath → " + file.getAbsolutePath());
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "cfgFile.absolutePath");
        return absolutePath;
    }

    @JvmOverloads
    @NotNull
    public final String I(@Nullable String str) {
        return K(this, str, 0, 2, null);
    }

    @JvmOverloads
    @NotNull
    public final String J(@Nullable String str, int i4) {
        return com.xinzhu.overmind.a.s(str, i4) + "/files/mod_cfg.ini";
    }

    @NotNull
    public final List<String> L() {
        List<String> mutableListOf;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf("/mnt/sdcard/", "/sdcard/", "/storage/emulated/" + Overmind.getHostUserId() + '/', "storage/emulated/" + Overmind.getHostUserId() + '/');
        Context context = Overmind.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext()");
        String[] b5 = b(context);
        if (b5 != null) {
            CollectionsKt__MutableCollectionsKt.addAll(mutableListOf, b5);
        }
        return mutableListOf;
    }

    @NotNull
    public final String M(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return a(f54953b + "/Android/obb/" + packageName);
    }

    @NotNull
    public final String N(@NotNull String packageName, int i4) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return a(f54953b + "/Android/obb/user/" + i4 + '/' + packageName);
    }

    @NotNull
    public final String O(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return com.xinzhu.overmind.a.b0() + "/sdcard/Android/obb/" + packageName;
    }

    @NotNull
    public final String P(@NotNull String packageName, int i4) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return com.xinzhu.overmind.a.b0() + "/sdcard/Android/obb/user/" + i4 + '/' + packageName;
    }

    @JvmOverloads
    @NotNull
    public final String Q(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return S(this, packageName, 0, 2, null);
    }

    @JvmOverloads
    @NotNull
    public final String R(@NotNull String packageName, int i4) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        File file = new File(com.xinzhu.overmind.a.r(packageName, i4).getAbsolutePath(), "app_pluginLib");
        if (!file.exists()) {
            file.mkdirs();
        }
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "libDir.absolutePath");
        return absolutePath;
    }

    @JvmOverloads
    @NotNull
    public final String T(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return V(this, packageName, 0, 2, null);
    }

    @JvmOverloads
    @NotNull
    public final String U(@NotNull String packageName, int i4) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return com.xinzhu.overmind.a.s(packageName, i4).getAbsolutePath() + "/app_pluginLib";
    }

    @NotNull
    public final String W() {
        return f54953b + "/save_data";
    }

    @NotNull
    public final String X() {
        return f54954c + "/save_data";
    }

    @NotNull
    public final String Y(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        String str = W() + '/' + packageName;
        a(str);
        return str;
    }

    @NotNull
    public final String Z(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        String str = X() + '/' + packageName;
        a(str);
        return str;
    }

    @NotNull
    public final String a0() {
        return f54955d;
    }

    @Nullable
    public final String[] b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("storage");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.storage.StorageManager");
        StorageManager storageManager = (StorageManager) systemService;
        try {
            Object invoke = storageManager.getClass().getMethod("getVolumePaths", new Class[0]).invoke(storageManager, new Object[0]);
            Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            return (String[]) invoke;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @NotNull
    public final String b0() {
        return f54953b;
    }

    @NotNull
    public final String c(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        String str = f54953b + "/Android/data/" + packageName;
        a(str);
        return str;
    }

    @NotNull
    public final String c0() {
        return f54954c;
    }

    @NotNull
    public final String d(@NotNull String packageName, int i4) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        String str = f54953b + "/Android/data/user/" + i4 + '/' + packageName;
        a(str);
        return str;
    }

    @NotNull
    public final String f(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        String str = f54954c + "/Android/data/" + packageName;
        a(str);
        return str;
    }

    @NotNull
    public final String g(@NotNull String packageName, int i4) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        String str = f54954c + "/Android/data/user/" + i4 + '/' + packageName;
        a(str);
        return str;
    }

    @JvmOverloads
    @NotNull
    public final String i(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return l(this, packageName, 0, false, 6, null);
    }

    @JvmOverloads
    @NotNull
    public final String j(@NotNull String packageName, int i4) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return l(this, packageName, i4, false, 4, null);
    }

    @JvmOverloads
    @NotNull
    public final String k(@NotNull String packageName, int i4, boolean z4) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (d.f54937g.d().N(packageName) && !z4) {
            String absolutePath = com.xinzhu.overmind.a.g(packageName).getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAppLibDir_plugin(packageName).absolutePath");
            return absolutePath;
        }
        String absolutePath2 = com.xinzhu.overmind.a.f(packageName).getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath2, "getAppLibDir(packageName).absolutePath");
        return absolutePath2;
    }

    @JvmOverloads
    @NotNull
    public final String m(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return o(this, packageName, 0, 2, null);
    }

    @JvmOverloads
    @NotNull
    public final String n(@NotNull String packageName, int i4) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        String absolutePath = com.xinzhu.overmind.a.g(packageName).getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAppLibDir_plugin(packageName).absolutePath");
        return absolutePath;
    }

    @JvmOverloads
    @NotNull
    public final String p(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return r(this, packageName, 0, 2, null);
    }

    @JvmOverloads
    @NotNull
    public final String q(@NotNull String packageName, int i4) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        File file = new File(com.xinzhu.overmind.a.r(packageName, i4).getAbsolutePath() + "/files/archive_cfg.ini");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "file.absolutePath");
        return absolutePath;
    }

    @JvmOverloads
    @NotNull
    public final String s(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return u(this, packageName, 0, 2, null);
    }

    @JvmOverloads
    @NotNull
    public final String t(@NotNull String packageName, int i4) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        File file = new File(com.xinzhu.overmind.a.r(packageName, i4).getAbsolutePath() + "/files/archive_cfg.ini");
        MindPackageSettings k4 = Overmind.getMindPackageManager().k(packageName);
        if (k4 != null && k4.k()) {
            file = new File(com.xinzhu.overmind.a.s(packageName, i4).getAbsolutePath() + "/files/archive_cfg.ini");
        }
        if ((k4 == null || !k4.k()) && !file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "file.absolutePath");
        return absolutePath;
    }

    @JvmOverloads
    @NotNull
    public final String v(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return x(this, packageName, 0, 2, null);
    }

    @JvmOverloads
    @NotNull
    public final String w(@NotNull String packageName, int i4) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (Overmind.is64Bit()) {
            String absolutePath = com.xinzhu.overmind.a.s(packageName, i4).getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getDataDir_plugin(\n     …Id\n        ).absolutePath");
            return absolutePath;
        }
        String absolutePath2 = com.xinzhu.overmind.a.r(packageName, i4).getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath2, "getDataDir(packageName, userId).absolutePath");
        return absolutePath2;
    }

    @JvmOverloads
    @NotNull
    public final String y(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return A(this, packageName, 0, 2, null);
    }

    @JvmOverloads
    @NotNull
    public final String z(@NotNull String packageName, int i4) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        String absolutePath = com.xinzhu.overmind.a.s(packageName, i4).getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getDataDir_plugin(packag…ame, userId).absolutePath");
        return absolutePath;
    }
}
