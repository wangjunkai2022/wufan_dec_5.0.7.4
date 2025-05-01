package com.xinzhu.overmind.client.hook;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.VMCore;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
@SuppressLint({"SdCardPath"})
/* loaded from: classes.dex */
public class IOManager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TAG = "IOManager";
    private static ArrayList<String> sdcard_alias;
    private static final IOManager sIOManager = new IOManager();
    private static final Map<String, Map<String, String>> sCachePackageRedirect = new HashMap();
    private final Map<String, String> mRedirectMap = new LinkedHashMap();
    private final List<String> mBlacklist = new ArrayList();

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        sdcard_alias = arrayList;
        arrayList.add("/sdcard");
        sdcard_alias.add("/storage/emulated/" + Overmind.getHostUserId());
        sdcard_alias.add("/mnt/sdcard");
    }

    private void addHidePath(Map<String, String> map, String str) {
        map.put(str, str + "-fake");
    }

    public static IOManager get() {
        return sIOManager;
    }

    private void hideRoot(Map<String, String> map) {
        addHidePath(map, "/system/bin/failsafe/su");
        addHidePath(map, "/data/local/su");
        addHidePath(map, "/data/local/bin/su");
        addHidePath(map, "/data/local/xbin/su");
        addHidePath(map, "/system/sd/bin/su");
        addHidePath(map, "/system/sd/xbin/su");
        addHidePath(map, "/sbin");
        addHidePath(map, "/data/local/sbin");
        addHidePath(map, "/su");
        addHidePath(map, "/system/sbin");
        addHidePath(map, "/system/sd/sbin");
        addHidePath(map, "/apex/com.android.runtime/bin/daemonsu");
        addHidePath(map, "/apex/com.android.runtime/bin/su");
        addHidePath(map, "/data/adb/magisk/magisk");
        addHidePath(map, "/data/data-lib/com.kingroot.RushRoot");
        addHidePath(map, "/data/data-lib/com.kingroot.kinguser");
        addHidePath(map, "/data/data/com.kingoapp.apk");
        addHidePath(map, "/data/data/com.kingroot.kinguser");
        addHidePath(map, "/data/data/com.topjohnwu.magisk");
        addHidePath(map, "/data/app/com.topjohnwu.magisk");
        addHidePath(map, "/data/data/eu.chainfire.supersu");
        addHidePath(map, "/data/data/kingoroot.supersu");
        addHidePath(map, "/data/user/0/com.kingroot.kinguser");
        addHidePath(map, "/data/user_de/0/com.kingroot.kinguser");
        addHidePath(map, "/data/user_de/0/eu.chainfire.supersu");
        addHidePath(map, "/dev/__properties__/u:object_r:supersu_prop:s0");
        addHidePath(map, "/dev/com.koushikdutta.superuser.daemon");
        addHidePath(map, "/dev/kingroot");
        addHidePath(map, "/dev/kinguser_req_cache");
        addHidePath(map, "/init.supersu.rc");
        addHidePath(map, "/magisk");
        addHidePath(map, "/root/magisk");
        addHidePath(map, "/storage/emulated/0/daemonsu");
        addHidePath(map, "/storage/emulated/0/su");
        addHidePath(map, "/system/addon.d/51-addonsu.sh");
        addHidePath(map, "/system/app/KingoUser.apk");
        addHidePath(map, "/system/app/Superuser.apk");
        addHidePath(map, "/system/app/SuperSU.apk");
        addHidePath(map, "/system/app/Superuser");
        addHidePath(map, "/system/app/SuperSU");
        addHidePath(map, "/system/bin/.ext/.su");
        addHidePath(map, "/system/bin/su");
        addHidePath(map, "/system/etc/.has_su_daemon");
        addHidePath(map, "/system/etc/.installed_su_daemon");
        addHidePath(map, "/system/etc/init.d/99SuperSUDaemon");
        addHidePath(map, "/system/etc/init/superuser.rc");
        addHidePath(map, "/system/su");
        addHidePath(map, "/system/usr/we-need-root/su-backup");
        addHidePath(map, "/system/xbin/daemonsu");
        addHidePath(map, "/system/xbin/ku.sud");
        addHidePath(map, "/system/xbin/mu");
        addHidePath(map, "/system/xbin/start_kusud.sh");
        addHidePath(map, "/system/xbin/su");
        addHidePath(map, "/vendor/bin/daemonsu");
        addHidePath(map, "/vendor/bin/su");
        addHidePath(map, "root/magiskinit");
        addHidePath(map, "root/magiskinit");
    }

    public void addBlacklist(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mBlacklist.add(str);
        if (str.endsWith(net.lingala.zip4j.util.e.F0)) {
            str = str.substring(0, str.length() - 1);
        }
        String str2 = TAG;
        com.xinzhu.overmind.b.c(str2, "addRedirectBlacklist " + str);
        VMCore.addIOBlacklist(str);
    }

    public void addRedirect(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || this.mRedirectMap.get(str) != null) {
            return;
        }
        this.mRedirectMap.put(str, str2);
        if (str2.contains("/Android")) {
            File file = new File(str2);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        if (str.endsWith(net.lingala.zip4j.util.e.F0)) {
            str = str.substring(0, str.length() - 1);
        }
        if (str2.endsWith(net.lingala.zip4j.util.e.F0)) {
            str2 = str2.substring(0, str2.length() - 1);
        }
        String str3 = TAG;
        com.xinzhu.overmind.b.c(str3, "addRedirect " + str + " --> " + str2);
        VMCore.addIORule(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x02a9 A[Catch: Exception -> 0x0415, TryCatch #2 {Exception -> 0x0415, blocks: (B:3:0x0012, B:6:0x002b, B:8:0x003b, B:11:0x0067, B:19:0x0281, B:21:0x02a9, B:23:0x02b8, B:29:0x02c4, B:31:0x02c8, B:33:0x02ce, B:34:0x02d4, B:36:0x02da, B:37:0x0382, B:43:0x039a, B:45:0x039e, B:47:0x03a4, B:48:0x03aa, B:50:0x03b0, B:51:0x03c9, B:53:0x03d0, B:54:0x03d8, B:56:0x03de, B:57:0x03fa, B:58:0x03fd, B:59:0x0400, B:13:0x0157, B:15:0x0167, B:18:0x0193, B:10:0x0054, B:17:0x0180), top: B:83:0x0012, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02c4 A[Catch: Exception -> 0x0415, TryCatch #2 {Exception -> 0x0415, blocks: (B:3:0x0012, B:6:0x002b, B:8:0x003b, B:11:0x0067, B:19:0x0281, B:21:0x02a9, B:23:0x02b8, B:29:0x02c4, B:31:0x02c8, B:33:0x02ce, B:34:0x02d4, B:36:0x02da, B:37:0x0382, B:43:0x039a, B:45:0x039e, B:47:0x03a4, B:48:0x03aa, B:50:0x03b0, B:51:0x03c9, B:53:0x03d0, B:54:0x03d8, B:56:0x03de, B:57:0x03fa, B:58:0x03fd, B:59:0x0400, B:13:0x0157, B:15:0x0167, B:18:0x0193, B:10:0x0054, B:17:0x0180), top: B:83:0x0012, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03fd A[Catch: Exception -> 0x0415, TryCatch #2 {Exception -> 0x0415, blocks: (B:3:0x0012, B:6:0x002b, B:8:0x003b, B:11:0x0067, B:19:0x0281, B:21:0x02a9, B:23:0x02b8, B:29:0x02c4, B:31:0x02c8, B:33:0x02ce, B:34:0x02d4, B:36:0x02da, B:37:0x0382, B:43:0x039a, B:45:0x039e, B:47:0x03a4, B:48:0x03aa, B:50:0x03b0, B:51:0x03c9, B:53:0x03d0, B:54:0x03d8, B:56:0x03de, B:57:0x03fa, B:58:0x03fd, B:59:0x0400, B:13:0x0157, B:15:0x0167, B:18:0x0193, B:10:0x0054, B:17:0x0180), top: B:83:0x0012, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0425 A[LOOP:4: B:71:0x041f->B:73:0x0425, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0441 A[LOOP:5: B:75:0x043b->B:77:0x0441, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void enableRedirect(java.lang.String r17, java.util.Map<java.lang.String, java.lang.String> r18, int r19) {
        /*
            Method dump skipped, instructions count: 1110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xinzhu.overmind.client.hook.IOManager.enableRedirect(java.lang.String, java.util.Map, int):void");
    }

    public String redirectPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        for (String str2 : this.mRedirectMap.keySet()) {
            if (str.startsWith(str2)) {
                CharSequence charSequence = (String) this.mRedirectMap.get(str2);
                Objects.requireNonNull(charSequence);
                return str.replace(str2, charSequence);
            }
        }
        return str;
    }

    public String restoreRedirectPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        for (String str2 : this.mBlacklist) {
            if (str.startsWith(str2)) {
                return str;
            }
        }
        for (CharSequence charSequence : this.mRedirectMap.keySet()) {
            String str3 = this.mRedirectMap.get(charSequence);
            if (str3 != null && str.startsWith(str3)) {
                return str.replace(str3, charSequence);
            }
        }
        return str;
    }

    public File redirectPath(File file) {
        if (file == null) {
            return null;
        }
        return new File(redirectPath(file.getAbsolutePath()));
    }

    public String redirectPath(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        for (String str2 : this.mBlacklist) {
            if (str.startsWith(str2)) {
                return str;
            }
        }
        for (String str3 : map.keySet()) {
            if (str.startsWith(str3)) {
                CharSequence charSequence = (String) map.get(str3);
                Objects.requireNonNull(charSequence);
                return str.replace(str3, charSequence);
            }
        }
        return str;
    }

    public File redirectPath(File file, Map<String, String> map) {
        if (file == null) {
            return null;
        }
        return new File(redirectPath(file.getAbsolutePath(), map));
    }
}
