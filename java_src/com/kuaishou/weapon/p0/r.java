package com.kuaishou.weapon.p0;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes5.dex */
public class r {

    /* renamed from: c  reason: collision with root package name */
    private static r f55650c;

    /* renamed from: d  reason: collision with root package name */
    private static Application f55651d;

    /* renamed from: a  reason: collision with root package name */
    public boolean f55655a;

    /* renamed from: e  reason: collision with root package name */
    private String f55656e;

    /* renamed from: f  reason: collision with root package name */
    private static Random f55652f = new Random();

    /* renamed from: g  reason: collision with root package name */
    private static Map<String, s> f55653g = new ConcurrentHashMap();

    /* renamed from: h  reason: collision with root package name */
    private static Map<String, s> f55654h = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public static List<Integer> f55649b = new ArrayList();

    private r() {
    }

    public static r a(Context context, boolean z4) {
        try {
            if (f55650c == null) {
                f55651d = (Application) context.getApplicationContext();
                f55650c = new r();
            }
        } catch (Throwable unused) {
        }
        return f55650c;
    }

    public static boolean e(String str) {
        try {
            File file = new File(str);
            if (file.exists() && !file.isDirectory()) {
                file.delete();
            }
            if (file.exists()) {
                return true;
            }
            file.mkdirs();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean b(String str) {
        s sVar = f55654h.get(str);
        if (sVar != null) {
            f55653g.remove(sVar.f55661e);
            f55654h.remove(str);
            dn.c(sVar.f55669m);
            Application application = f55651d;
            if (application != null) {
                dn.c(application.getFileStreamPath(sVar.f55659c).getAbsolutePath());
                return true;
            }
            return true;
        }
        return false;
    }

    public s c(String str) {
        try {
            return f55653g.get(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public s d(String str) {
        try {
            return f55654h.get(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static r a() {
        return f55650c;
    }

    public boolean a(s sVar, boolean z4) {
        this.f55655a = z4;
        this.f55656e = sVar.f55660d;
        return a(sVar);
    }

    public Map<String, s> b() {
        return f55654h;
    }

    private synchronized boolean a(s sVar) {
        if (sVar != null) {
            if (!TextUtils.isEmpty(sVar.f55661e)) {
                s sVar2 = f55653g.get(sVar.f55661e);
                if (sVar2 != null) {
                    if (sVar2.f55660d.equals(sVar.f55660d)) {
                        return true;
                    }
                    a(sVar2.f55661e);
                }
                try {
                    try {
                        sVar.f55662f = f55651d;
                        if (sVar.f55672p == 1) {
                            if (!TextUtils.isEmpty(sVar.f55659c) && !TextUtils.isEmpty(sVar.f55661e)) {
                                sVar.f55669m = f55651d.getFilesDir().getCanonicalPath() + bi.f55317j + sVar.f55657a;
                                String str = sVar.f55669m + "/dex";
                                dn.c(sVar.f55669m + "/lib");
                                String str2 = (sVar.f55669m + "/lib/" + this.f55656e) + net.lingala.zip4j.util.e.F0 + f55652f.nextInt();
                                e(str);
                                dn.a(str, Boolean.FALSE);
                                e(str2);
                                a(sVar, str2, str, false);
                                f55654h.put(sVar.f55659c, sVar);
                                f55653g.put(sVar.f55661e, sVar);
                            } else {
                                throw new RuntimeException("apkPackageName or apkPkgPath is null");
                            }
                        }
                        if (sVar.f55672p != 1 || 0 != 0) {
                            PackageInfo packageInfo = sVar.f55674r;
                            if (packageInfo == null || TextUtils.isEmpty(packageInfo.packageName) || TextUtils.isEmpty(packageInfo.versionName)) {
                                packageInfo = f55651d.getPackageManager().getPackageArchiveInfo(sVar.f55661e, 1);
                            }
                            if (!TextUtils.isEmpty(packageInfo.packageName) && packageInfo.packageName.startsWith("com.kuaishou.weapon")) {
                                if (sVar.f55672p != 1 && sVar.f55658b != 1 && !((Boolean) a(sVar.f55666j, sVar.f55661e).first).booleanValue()) {
                                    return false;
                                }
                                sVar.f55659c = packageInfo.packageName;
                                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                                sVar.f55671o = applicationInfo.className;
                                sVar.f55660d = packageInfo.versionName;
                                sVar.f55668l = packageInfo.activities;
                                sVar.f55673q = applicationInfo.theme;
                                sVar.f55669m = f55651d.getFilesDir().getCanonicalPath() + bi.f55317j + sVar.f55657a;
                                String str3 = sVar.f55669m + "/dex";
                                dn.c(sVar.f55669m + "/lib");
                                String str4 = (sVar.f55669m + "/lib/" + this.f55656e) + net.lingala.zip4j.util.e.F0 + f55652f.nextInt();
                                e(str3);
                                dn.a(str3, Boolean.FALSE);
                                e(str4);
                                a(sVar, str4, str3, true);
                                f55654h.put(sVar.f55659c, sVar);
                                f55653g.put(sVar.f55661e, sVar);
                                f55649b.add(Integer.valueOf(sVar.f55657a));
                            } else {
                                throw new Exception("weapon package name check failed");
                            }
                        }
                        return true;
                    } catch (Throwable unused) {
                        a(sVar.f55661e);
                        return false;
                    }
                } catch (Throwable unused2) {
                    return false;
                }
            }
        }
        return false;
    }

    private Pair<Boolean, String> a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            File file = new File(str2);
            if (!dn.a(file)) {
                return new Pair<>(Boolean.FALSE, "");
            }
            String a5 = f.a(file);
            if (TextUtils.isEmpty(a5)) {
                return new Pair<>(Boolean.FALSE, "");
            }
            if (!a5.equalsIgnoreCase(str)) {
                return new Pair<>(Boolean.FALSE, a5);
            }
            return new Pair<>(Boolean.TRUE, "");
        }
        return new Pair<>(Boolean.FALSE, "");
    }

    public boolean a(String str) {
        s sVar = f55653g.get(str);
        if (sVar != null) {
            f55653g.remove(str);
            f55654h.remove(sVar.f55659c);
            dn.c(sVar.f55669m);
            Application application = f55651d;
            if (application != null) {
                dn.c(application.getFileStreamPath(sVar.f55659c).getAbsolutePath());
                return true;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:26|(1:247)(17:30|31|32|33|34|(12:240|241|37|38|(3:230|231|181)|45|46|47|48|(3:49|50|(3:52|53|54)(1:155))|156|157)|36|37|38|(1:235)(6:40|219|234|230|231|181)|45|46|47|48|(4:49|50|(0)(0)|54)|156|157)|158|159|(1:203)(11:164|165|166|167|168|(3:169|170|(1:172)(1:173))|174|175|176|177|178)|179|180|181|23|24) */
    /* JADX WARN: Can't wrap try/catch for region: R(28:1|(2:5|(25:9|10|(1:12)(1:281)|13|(1:15)|16|17|18|20|21|22|(10:26|(1:247)(17:30|31|32|33|34|(12:240|241|37|38|(3:230|231|181)|45|46|47|48|(3:49|50|(3:52|53|54)(1:155))|156|157)|36|37|38|(1:235)(6:40|219|234|230|231|181)|45|46|47|48|(4:49|50|(0)(0)|54)|156|157)|158|159|(1:203)(11:164|165|166|167|168|(3:169|170|(1:172)(1:173))|174|175|176|177|178)|179|180|181|23|24)|249|250|(1:252)|(1:254)|255|69|(6:71|72|73|(2:75|(2:77|78))|80|(1:82)(1:112))(4:114|115|(2:117|(2:119|120))|122)|83|(1:89)|96|97|98|(2:100|(2:106|107)(1:104))(1:109)))|282|10|(0)(0)|13|(0)|16|17|18|20|21|22|(2:23|24)|249|250|(0)|(0)|255|69|(0)(0)|83|(3:85|87|89)|96|97|98|(0)(0)|(2:(0)|(1:275))) */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0205, code lost:
        r15 = r22;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x023e, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x023f, code lost:
        r18 = null;
        r19 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0247, code lost:
        r21 = "";
        r14 = r5;
        r18 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x024d, code lost:
        r21 = "";
        r14 = r5;
        r18 = null;
        r19 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0257, code lost:
        r21 = "";
        r14 = r5;
        r18 = null;
        r19 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02a4, code lost:
        if (r19 != 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02c4, code lost:
        if (r19 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02e4, code lost:
        if (r19 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02e6, code lost:
        r19.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03f6 A[Catch: all -> 0x046c, TryCatch #10 {all -> 0x046c, blocks: (B:203:0x03d5, B:205:0x03f6, B:207:0x0400, B:209:0x040a), top: B:238:0x03d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x046c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0361 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[Catch: all -> 0x022f, IOException -> 0x0231, EOFException -> 0x0236, FileNotFoundException | ZipException -> 0x023a, TryCatch #13 {all -> 0x022f, blocks: (B:24:0x0067, B:26:0x006d, B:28:0x0083, B:30:0x0089, B:39:0x009e, B:41:0x00a4, B:43:0x00aa, B:45:0x00b0, B:47:0x00b6, B:49:0x00bc, B:51:0x00c2, B:55:0x00d0, B:109:0x020b, B:111:0x0211), top: B:243:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0138 A[EDGE_INSN: B:289:0x0138->B:62:0x0138 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012f  */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v64 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.kuaishou.weapon.p0.s r25, java.lang.String r26, java.lang.String r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 1154
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kuaishou.weapon.p0.r.a(com.kuaishou.weapon.p0.s, java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00d4 A[EDGE_INSN: B:103:0x00d4->B:35:0x00d4 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf A[Catch: all -> 0x00de, LOOP:1: B:87:0x00c9->B:34:0x00cf, LOOP_END, TryCatch #5 {all -> 0x00de, blocks: (B:32:0x00c9, B:34:0x00cf, B:35:0x00d4), top: B:87:0x00c9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.kuaishou.weapon.p0.s r17, java.lang.String r18, java.lang.String r19, java.util.HashSet<java.lang.String> r20, byte[] r21, java.lang.StringBuilder r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kuaishou.weapon.p0.r.a(com.kuaishou.weapon.p0.s, java.lang.String, java.lang.String, java.util.HashSet, byte[], java.lang.StringBuilder, boolean):void");
    }
}
