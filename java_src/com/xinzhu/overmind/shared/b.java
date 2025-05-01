package com.xinzhu.overmind.shared;

import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.join.mgps.Util.u;
import com.join.mgps.mod.utils.PluginConfig;
import com.join.mgps.va.overmind.PaCtrl;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.custom.CustomCallback;
import com.xinzhu.overmind.server.pm.MindPackageSettings;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CustomCallbackImpl.kt */
/* loaded from: classes.dex */
public class b extends CustomCallback {

    /* renamed from: a  reason: collision with root package name */
    private final String f68281a = b.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private boolean f68282b;

    public final boolean a() {
        return this.f68282b;
    }

    public final void b(boolean z4) {
        this.f68282b = z4;
    }

    @Override // com.xinzhu.overmind.custom.CustomCallback
    @Nullable
    public LinkedHashMap<String, String> customIORedirect(@NotNull String str, int i4) {
        String d5;
        String M;
        String W;
        String b02;
        List<String> emptyList;
        List sorted;
        boolean endsWith$default;
        boolean startsWith$default;
        boolean startsWith$default2;
        boolean startsWith$default3;
        String pkgName = str;
        Intrinsics.checkNotNullParameter(pkgName, "pkgName");
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        MindPackageSettings k4 = Overmind.getMindPackageManager().k(pkgName);
        if (k4.k()) {
            if (i4 == 0) {
                d5 = com.join.mgps.va.overmind.f.f54952a.f(pkgName);
            } else {
                d5 = com.join.mgps.va.overmind.f.f54952a.g(pkgName, i4);
            }
            com.join.mgps.va.overmind.f fVar = com.join.mgps.va.overmind.f.f54952a;
            M = fVar.O(pkgName);
            W = fVar.X();
            b02 = fVar.c0();
        } else {
            if (i4 == 0) {
                d5 = com.join.mgps.va.overmind.f.f54952a.c(pkgName);
            } else {
                d5 = com.join.mgps.va.overmind.f.f54952a.d(pkgName, i4);
            }
            com.join.mgps.va.overmind.f fVar2 = com.join.mgps.va.overmind.f.f54952a;
            M = fVar2.M(pkgName);
            W = fVar2.W();
            b02 = fVar2.b0();
        }
        Object obj = null;
        int i5 = 2;
        boolean z4 = false;
        u.c archiveSection = PluginConfig.getArchiveSection(k4.k() ? com.join.mgps.va.overmind.f.u(com.join.mgps.va.overmind.f.f54952a, pkgName, 0, 2, null) : com.join.mgps.va.overmind.f.r(com.join.mgps.va.overmind.f.f54952a, pkgName, 0, 2, null));
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        if (archiveSection != null) {
            archiveSection.c("archiveId");
            emptyList = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{archiveSection.c("archivePath"), archiveSection.c("archivePath2")});
        }
        ApplicationInfo f5 = Overmind.getMindPackageManager().f(pkgName, 128, com.xinzhu.overmind.client.e.getUserId());
        if (f5 != null) {
            linkedHashMap.put("data/data/" + pkgName, f5.dataDir);
        }
        sorted = CollectionsKt___CollectionsKt.sorted(com.join.mgps.va.overmind.f.f54952a.L());
        Iterator it2 = sorted.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            endsWith$default = StringsKt__StringsJVMKt.endsWith$default(str2, net.lingala.zip4j.util.e.F0, z4, i5, obj);
            if (!endsWith$default) {
                str2 = str2 + '/';
            }
            linkedHashMap.put(str2 + "Android/obb/" + pkgName, M);
            linkedHashMap.put(str2 + "Android/data/" + pkgName, d5);
            linkedHashMap.put(str2 + "android/data/" + pkgName, d5);
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("save_data/");
            linkedHashMap.put(sb.toString(), W + '/');
            if (i4 != 0) {
                for (String str3 : emptyList) {
                    if (str3 == null || str3.length() == 0) {
                        pkgName = str;
                        i5 = 2;
                    } else {
                        Iterator it3 = it2;
                        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str3, "/data/data", z4, i5, null);
                        if (!startsWith$default) {
                            startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(str3, "/Android/data", z4, i5, null);
                            if (!startsWith$default2) {
                                startsWith$default3 = StringsKt__StringsJVMKt.startsWith$default(str3, net.lingala.zip4j.util.e.F0, z4, i5, null);
                                if (startsWith$default3) {
                                    str3 = StringsKt__StringsJVMKt.replaceFirst$default(str3, net.lingala.zip4j.util.e.F0, "", false, 4, (Object) null);
                                }
                                String str4 = b02 + "/user/" + i4 + '/' + pkgName + '/' + str3;
                                if (new File(str4).exists()) {
                                    linkedHashMap.put(str2 + str3 + '/', str4);
                                    com.xinzhu.overmind.b.a(this.f68281a, "archiveRedirect: " + str2 + str3 + "/ => " + str4);
                                    pkgName = str;
                                    it2 = it3;
                                    i5 = 2;
                                    z4 = false;
                                }
                            }
                        }
                        pkgName = str;
                        it2 = it3;
                        i5 = 2;
                    }
                }
            }
            pkgName = str;
            obj = null;
            i5 = 2;
        }
        return linkedHashMap;
    }

    @Override // com.xinzhu.overmind.custom.CustomCallback
    public void customLoadLibgggg(@Nullable String str, int i4) {
        String str2;
        com.xinzhu.overmind.b.a(this.f68281a, "customLoadLibgggg " + str + ' ' + i4);
        if (str == null || str.length() == 0) {
            return;
        }
        String str3 = com.join.mgps.va.overmind.f.f54952a.w(str, 0) + "/app_pluginLib";
        Bundle bundle = new Bundle();
        bundle.putString("packageName", str);
        bundle.putInt("userId", i4);
        Bundle bundle2 = null;
        try {
            bundle2 = h.a(g.f68290e, "isUseNativeLib", null, bundle);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (bundle2 != null ? bundle2.getBoolean("isUseNativeLib", false) : false) {
            if (Overmind.is64Bit()) {
                str2 = com.join.mgps.va.overmind.f.l(com.join.mgps.va.overmind.f.f54952a, str, 0, false, 4, null) + "/arm64";
            } else {
                str2 = com.join.mgps.va.overmind.f.l(com.join.mgps.va.overmind.f.f54952a, str, 0, false, 4, null) + "/arm";
            }
            str3 = str2;
        }
        if (new File(str3).exists()) {
            PaCtrl.f54928a.mountLibGggg(str3);
            this.f68282b = true;
        }
    }

    @Override // com.xinzhu.overmind.custom.CustomCallback
    public void customOnSoLoaded(@NotNull String name, long j4) {
        Intrinsics.checkNotNullParameter(name, "name");
        String str = this.f68281a;
        com.xinzhu.overmind.b.a(str, "customOnSoLoaded " + name + ' ' + j4);
        if (this.f68282b) {
            PaCtrl.f54928a.onSoLoaded(name, j4);
        }
    }
}
