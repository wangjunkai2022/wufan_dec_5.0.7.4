package com.join.mgps.va.overmind;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageParser;
import android.os.Bundle;
import com.join.mgps.Util.h0;
import com.join.mgps.mod.utils.PluginConfig;
import com.join.mgps.va.overmind.d;
import com.xinzhu.haunted.android.content.pm.j;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.server.os.MindShareFileInfo;
import com.xinzhu.overmind.utils.q;
import java.io.File;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: VExtPackageAccessor.kt */
/* loaded from: classes5.dex */
public final class h {
    @NotNull

    /* renamed from: a */
    public static final a f54956a = new a(null);

    /* compiled from: VExtPackageAccessor.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final PackageParser.Package b(String str) {
            try {
                j k4 = j.k();
                Object l4 = k4.l(new File(str), 0);
                Intrinsics.checkNotNull(l4, "null cannot be cast to non-null type android.content.pm.PackageParser.Package");
                PackageParser.Package r12 = (PackageParser.Package) l4;
                if (com.xinzhu.overmind.utils.e.y()) {
                    k4.j(r12, true);
                } else {
                    k4.i(r12, 0);
                }
                return r12;
            } catch (Exception e5) {
                e5.printStackTrace();
                return null;
            }
        }

        public static /* synthetic */ void e(a aVar, String str, String str2, int i4, int i5, Object obj) {
            if ((i5 & 4) != 0) {
                i4 = 0;
            }
            aVar.d(str, str2, i4);
        }

        private final void g(Bundle bundle) {
            int i4 = bundle.getInt("userId", 0);
            String string = bundle.getString("packageName");
            String string2 = bundle.getString("goldSwitch");
            String string3 = bundle.getString("archiveSwitch");
            String string4 = bundle.getString("channelNum");
            String string5 = bundle.getString("targetVersion");
            String string6 = bundle.getString("androidId");
            String string7 = bundle.getString("platform");
            String string8 = bundle.getString("package_type");
            String string9 = bundle.getString("typeId");
            f fVar = f.f54952a;
            String G = fVar.G(string, i4);
            String J = fVar.J(string, i4);
            File file = new File(G);
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            g.i(G, string2, string3, string4, string5, string6, string7, string8, string9);
            com.xinzhu.overmind.plugin.b.f(G, J);
        }

        public final boolean a(@Nullable Context context, @NotNull String path) {
            PackageManager packageManager;
            PackageInfo packageArchiveInfo;
            Intrinsics.checkNotNullParameter(path, "path");
            if (context == null || (packageManager = context.getPackageManager()) == null || (packageArchiveInfo = packageManager.getPackageArchiveInfo(path, 128)) == null) {
                return false;
            }
            return packageArchiveInfo.applicationInfo.metaData.getBoolean(com.join.mgps.mod.utils.d.f53628k);
        }

        public final void c(@Nullable Bundle bundle) {
            if (bundle == null) {
                return;
            }
            try {
                if (Intrinsics.areEqual(bundle.getString("action"), "writeModSwitch")) {
                    g(bundle);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }

        public final void d(@NotNull String packageName, @NotNull String gameId, int i4) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(gameId, "gameId");
            try {
                f fVar = f.f54952a;
                String G = fVar.G(packageName, i4);
                String J = fVar.J(packageName, i4);
                if (!new File(G).exists()) {
                    PluginConfig.setModGameId(G, gameId);
                }
                com.xinzhu.overmind.plugin.b.f(G, J);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }

        @JvmStatic
        public final void delete(@Nullable String str) {
            if (str == null || str.length() == 0) {
                return;
            }
            com.xinzhu.overmind.plugin.b.h(str);
        }

        @JvmStatic
        public final void f(@NotNull String packageName, int i4, @NotNull Bundle args) {
            List<String> listOf;
            int indexOf$default;
            int indexOf$default2;
            String replace$default;
            File file;
            String str;
            String str2;
            StringBuilder sb;
            File[] listFiles;
            File[] listFiles2;
            f fVar;
            String str3;
            int i5;
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(args, "args");
            f fVar2 = f.f54952a;
            String M = fVar2.M(packageName);
            String O = fVar2.O(packageName);
            boolean z4 = args.getBoolean("isOnlySyncData");
            long j4 = args.getLong("obbSize");
            long h4 = d.f54937g.d().h(O);
            if (!z4) {
                com.xinzhu.overmind.plugin.b.q(packageName, i4);
                if (h4 != j4 && j4 > 0) {
                    List<MindShareFileInfo> m4 = com.xinzhu.overmind.plugin.b.m(O);
                    if (m4 != null) {
                        for (MindShareFileInfo mindShareFileInfo : m4) {
                            delete(mindShareFileInfo.f68016b);
                        }
                    }
                    com.xinzhu.overmind.plugin.b.d(M, O);
                }
            }
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"Papa_Stat_SharedPreferences.xml", "PrefDef.xml"});
            for (String str4 : listOf) {
                com.xinzhu.overmind.plugin.b.f(com.xinzhu.overmind.a.a0().getParentFile().getAbsolutePath() + "/shared_prefs/" + str4, com.xinzhu.overmind.a.b0().getParentFile().getAbsolutePath() + "/shared_prefs/" + str4);
            }
            String string = args.getString("modPath");
            if (string == null || string.length() == 0) {
                return;
            }
            File file2 = new File(string);
            if (file2.exists()) {
                String mainPkg = Overmind.getMainPkg();
                Intrinsics.checkNotNullExpressionValue(mainPkg, "getMainPkg()");
                indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) string, mainPkg, 0, false, 6, (Object) null);
                indexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) string, "/files/", 0, false, 6, (Object) null);
                String substring = string.substring(indexOf$default, indexOf$default2);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String pluginPkg = Overmind.getPluginPkg();
                Intrinsics.checkNotNullExpressionValue(pluginPkg, "getPluginPkg()");
                replace$default = StringsKt__StringsJVMKt.replace$default(string, substring, pluginPkg, false, 4, (Object) null);
                File file3 = new File(replace$default);
                MindShareFileInfo b5 = com.xinzhu.overmind.plugin.b.b(file3.getAbsolutePath());
                d.a aVar = d.f54937g;
                long h5 = aVar.d().h(file3.getAbsolutePath());
                if (b5 == null || !b5.f68017c.booleanValue() || h5 != file2.length()) {
                    com.xinzhu.overmind.plugin.b.f(file2.getAbsolutePath(), file3.getAbsolutePath());
                }
                if (a(Overmind.getContext(), string)) {
                    StringBuilder sb2 = new StringBuilder();
                    file = file2;
                    str = string;
                    sb2.append(f.l(f.f54952a, packageName, i4, false, 4, null));
                    sb2.append("/arm");
                    str2 = sb2.toString();
                } else {
                    file = file2;
                    str = string;
                    str2 = f.f54952a.w(packageName, i4) + "/app_pluginLib";
                }
                if (a(Overmind.getContext(), str)) {
                    sb = new StringBuilder();
                    sb.append(f.f54952a.U(packageName, i4));
                    sb.append("/arm64");
                } else {
                    sb = new StringBuilder();
                    sb.append(f.f54952a.z(packageName, i4));
                    sb.append("/app_pluginLib");
                }
                String sb3 = sb.toString();
                MindShareFileInfo b6 = com.xinzhu.overmind.plugin.b.b(sb3);
                long h6 = aVar.d().h(sb3);
                if (b6 == null || !b6.f68017c.booleanValue() || h6 != h0.q(str2)) {
                    File file4 = new File(str2);
                    if (file4.exists() && (listFiles2 = file4.listFiles()) != null) {
                        for (File file5 : listFiles2) {
                            file5.delete();
                        }
                    }
                    File file6 = new File(sb3);
                    if (file6.exists() && (listFiles = file6.listFiles()) != null) {
                        for (File file7 : listFiles) {
                            com.xinzhu.overmind.plugin.b.h(file7.getAbsolutePath());
                        }
                    }
                    q.a(file, new File(str2), !Overmind.is64Bit());
                    com.xinzhu.overmind.plugin.b.d(str2, sb3);
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append(f.f54952a.w(packageName, i4));
                sb4.append("/files/mod_cfg.ini");
                String sb5 = sb4.toString();
                String str5 = fVar.z(packageName, i4) + "/files/mod_cfg.ini";
                String absolutePath = file.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "modFile.absolutePath");
                PackageParser.Package b7 = b(absolutePath);
                if (b7 != null) {
                    String str6 = b7.mVersionName;
                    Intrinsics.checkNotNullExpressionValue(str6, "it.mVersionName");
                    i5 = b7.mVersionCode;
                    str3 = str6;
                } else {
                    str3 = "1.0";
                    i5 = 1;
                }
                g.h(sb5, file.getAbsolutePath(), str3, i5, System.currentTimeMillis());
                g.j(sb5, args.getString("gameId"));
                com.xinzhu.overmind.plugin.b.f(sb5, str5);
            }
        }
    }

    @JvmStatic
    public static final void a(@NotNull String str, int i4, @NotNull Bundle bundle) {
        f54956a.f(str, i4, bundle);
    }

    @JvmStatic
    public static final void delete(@Nullable String str) {
        f54956a.delete(str);
    }
}
