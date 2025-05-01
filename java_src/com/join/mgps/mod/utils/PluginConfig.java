package com.join.mgps.mod.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.text.TextUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.u;
/* loaded from: classes.dex */
public class PluginConfig {
    public static final boolean LOG = true;
    public static ClassLoader sPluginClassloader = PluginConfig.class.getClassLoader();

    public static String get(Context context, String str, String str2) {
        return context.getSharedPreferences(d.f53624g, 4).getString(str, str2);
    }

    public static u.c getArchiveSection(String str) {
        return new u(str).b("archiveInfo");
    }

    public static String getLastLaunchPkg(Context context) {
        return get(context, d.f53631n, "");
    }

    public static u.c getModConfig(String str) {
        return new u(str).b("config");
    }

    public static String getModGameId(String str) {
        u.c b5 = new u(str).b("gameInfo");
        return b5 == null ? "" : b5.c("gameId");
    }

    public static u.c getModMenuSwitch(String str) {
        return new u(str).b("switch");
    }

    public static <T> T getModMetaObj(String str, Class<T> cls) {
        u.c b5 = new u(str).b("modMeta");
        if (b5 == null) {
            return null;
        }
        String c5 = b5.c("modMetaStr");
        if (g2.h(c5)) {
            return null;
        }
        return (T) JsonMapper.getInstance().fromJson(c5, cls);
    }

    public static String getModPath(String str) {
        u.c b5 = new u(str).b("soInfo");
        return b5 == null ? "" : b5.c("modPath");
    }

    public static int getSoCode(String str) {
        u.c b5 = new u(str).b("soInfo");
        if (b5 == null) {
            return 0;
        }
        String c5 = b5.c("code");
        if (TextUtils.isEmpty(c5)) {
            return 0;
        }
        return Integer.parseInt(c5);
    }

    @TargetApi(11)
    public static long getSoLastModifiedTime(Context context, String str) {
        return context.getSharedPreferences(d.f53624g, 4).getLong(str, 0L);
    }

    public static String getSoVersion(String str) {
        u.c b5 = new u(str).b("soInfo");
        return b5 == null ? "0" : b5.c("version");
    }

    public static void put(Context context, String str, String str2) {
        context.getSharedPreferences(d.f53624g, 4).edit().putString(str, str2).apply();
    }

    public static void savaModMetaStr(String str, String str2) {
        u uVar = new u(str);
        u.c b5 = uVar.b("modMeta");
        if (b5 == null) {
            b5 = new u.c("modMetaStr");
            uVar.f(b5);
        }
        b5.e("modMetaStr", str2);
        uVar.j();
    }

    public static void setArchivePath(String str, String str2, String str3, String str4) {
        u uVar = new u(str);
        u.c b5 = uVar.b("archiveInfo");
        if (b5 == null) {
            b5 = new u.c("archiveInfo");
            uVar.f(b5);
        }
        b5.e("archivePath", str2);
        b5.e("archivePath2", str3);
        b5.e("archiveId", str4);
        uVar.j();
    }

    public static void setLastLaunchPkg(Context context, String str) {
        put(context, d.f53631n, str);
    }

    public static void setModConfig(String str, String str2, String str3, int i4, long j4) {
        u uVar = new u(str);
        u.c b5 = uVar.b("soInfo");
        if (b5 == null) {
            b5 = new u.c("soInfo");
            uVar.f(b5);
        }
        b5.e("modPath", str2);
        b5.e("version", str3);
        b5.e("code", i4 + "");
        b5.e("lastModifyTime", j4 + "");
        uVar.j();
    }

    public static void setModGameId(String str, String str2) {
        u uVar = new u(str);
        u.c b5 = uVar.b("gameInfo");
        if (b5 == null) {
            b5 = new u.c("gameInfo");
            uVar.f(b5);
        }
        b5.e("gameId", str2);
        uVar.j();
    }

    public static void setModPath(String str, String str2) {
        u uVar = new u(str);
        u.c b5 = uVar.b("gameInfo");
        if (b5 == null) {
            b5 = new u.c("gameInfo");
            uVar.f(b5);
        }
        b5.e("modPath", str2);
        uVar.j();
    }

    public static void setSoCode(Context context, int i4) {
        context.getSharedPreferences(d.f53624g, 4).edit().putInt(d.f53629l, i4).apply();
    }

    @TargetApi(11)
    public static void setSoLastModifiedTime(Context context, String str, long j4) {
        context.getSharedPreferences(d.f53624g, 4).edit().putLong(str, j4).apply();
    }

    public static void setSoVersion(Context context, String str) {
        put(context, d.f53630m, str);
    }

    public static String getSoVersion(Context context) {
        return get(context, d.f53630m, "");
    }

    public static int getSoCode(Context context) {
        return context.getSharedPreferences(d.f53624g, 4).getInt(d.f53629l, 0);
    }

    public static void setModConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        u uVar = new u(str);
        u.c b5 = uVar.b("switch");
        if (b5 == null) {
            b5 = new u.c("switch");
            uVar.f(b5);
        }
        b5.e("goldFingerSwitch", str2);
        b5.e("archiveCloudSwitch", str3);
        b5.e("introductionSwitch", str4);
        u.c b6 = uVar.b("config");
        if (b6 == null) {
            b6 = new u.c("config");
            uVar.f(b6);
        }
        b6.e("channelNum", str5);
        b6.e("targetVersion", str6);
        b6.e("androidId", str7);
        b6.e("platform", str8);
        b6.e("package_type", str9);
        b6.e("typeId", str10);
        uVar.j();
    }
}
