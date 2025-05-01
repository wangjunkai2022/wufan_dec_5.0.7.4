package com.mob.tools.b;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.ResultReceiver;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mob.MobSDK;
import com.mob.commons.C0811r;
import com.mob.commons.v;
import com.mob.tools.MobLog;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.ReflectHelper;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
/* loaded from: classes5.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    static volatile IBinder f56777a = null;

    /* renamed from: b  reason: collision with root package name */
    private static int f56778b = 0;

    /* renamed from: c  reason: collision with root package name */
    private static volatile int f56779c = Integer.MIN_VALUE;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[Catch: all -> 0x0059, TryCatch #3 {all -> 0x0059, blocks: (B:14:0x004d, B:16:0x0051, B:17:0x0055, B:7:0x0025, B:9:0x003d, B:11:0x0043, B:12:0x0048), top: B:37:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055 A[Catch: all -> 0x0059, TRY_LEAVE, TryCatch #3 {all -> 0x0059, blocks: (B:14:0x004d, B:16:0x0051, B:17:0x0055, B:7:0x0025, B:9:0x003d, B:11:0x0043, B:12:0x0048), top: B:37:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Set<java.lang.String> a(android.content.Context r4, int r5) {
        /*
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = com.mob.commons.z.f56517a
            r1.append(r2)
            java.lang.String r2 = "XPL-1"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r0.start()
            r1 = 1
            r2 = 18
            r3 = 0
            if (r5 == r1) goto L48
            r1 = 4
            if (r5 == r1) goto L25
            goto L4d
        L25:
            java.lang.String r5 = "005_ce4eDchfccf"
            java.lang.String r5 = com.mob.commons.C0811r.b(r5)     // Catch: java.lang.Throwable -> L62
            com.mob.tools.b.c r1 = com.mob.tools.b.c.a(r4)     // Catch: java.lang.Throwable -> L62
            com.mob.tools.b.a r1 = r1.d()     // Catch: java.lang.Throwable -> L62
            java.lang.String r1 = r1.m()     // Catch: java.lang.Throwable -> L62
            boolean r5 = r5.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L62
            if (r5 != 0) goto L4d
            boolean r5 = a()     // Catch: java.lang.Throwable -> L62
            if (r5 == 0) goto L4d
            java.util.Set r4 = a(r4, r0)     // Catch: java.lang.Throwable -> L62
            goto L4c
        L48:
            java.util.Set r4 = a(r4, r1, r0)     // Catch: java.lang.Throwable -> L62
        L4c:
            r3 = r4
        L4d:
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L59
            if (r4 < r2) goto L55
            r0.quitSafely()     // Catch: java.lang.Throwable -> L59
            goto L75
        L55:
            r0.quit()     // Catch: java.lang.Throwable -> L59
            goto L75
        L59:
            r4 = move-exception
            com.mob.tools.log.NLog r5 = com.mob.tools.MobLog.getInstance()
            r5.d(r4)
            goto L75
        L62:
            r4 = move-exception
            com.mob.tools.log.NLog r5 = com.mob.tools.MobLog.getInstance()     // Catch: java.lang.Throwable -> L76
            r5.d(r4)     // Catch: java.lang.Throwable -> L76
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L59
            if (r4 < r2) goto L72
            r0.quitSafely()     // Catch: java.lang.Throwable -> L59
            goto L75
        L72:
            r0.quit()     // Catch: java.lang.Throwable -> L59
        L75:
            return r3
        L76:
            r4 = move-exception
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L83
            if (r5 < r2) goto L7f
            r0.quitSafely()     // Catch: java.lang.Throwable -> L83
            goto L8b
        L7f:
            r0.quit()     // Catch: java.lang.Throwable -> L83
            goto L8b
        L83:
            r5 = move-exception
            com.mob.tools.log.NLog r0 = com.mob.tools.MobLog.getInstance()
            r0.d(r5)
        L8b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.b.j.a(android.content.Context, int):java.util.Set");
    }

    private static Parcelable.Creator<?> b() throws Throwable {
        return (Parcelable.Creator) ReflectHelper.getStaticField(ReflectHelper.importClass(C0811r.b("030cdKcbcicjchcbckSbLcjQdhedhEck2iIceckfkTcbFdg%cOdiLeQdd>dJdecj")), C0811r.b("007Idcfifhecebfgfi"));
    }

    private static int c() {
        if (f56779c != Integer.MIN_VALUE) {
            return f56779c;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                int intValue = ((Integer) ReflectHelper.invokeStaticMethod(ReflectHelper.importClass(C0811r.b("021cdBcbcicjchcbckcjehckdjehAe9ciej0cd:cb;fe")), C0811r.b("009Ndi%eh*djehMeZciddcb"), new Object[]{Integer.valueOf(Process.myUid())}, new Class[]{Integer.TYPE})).intValue();
                f56779c = intValue;
                return intValue;
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }
        return 0;
    }

    public static Set<String> a(Context context, HandlerThread handlerThread) throws Throwable {
        FileInputStream fileInputStream;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader = null;
        if (com.mob.commons.d.b()) {
            File file = new File(context.getFilesDir(), ".tmp11");
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, C0811r.b("002Dch d") + System.currentTimeMillis());
            File file3 = new File(file, "out" + System.currentTimeMillis());
            File file4 = new File(file, NotificationCompat.CATEGORY_ERROR + System.currentTimeMillis());
            if (file3.exists()) {
                file3.delete();
            }
            try {
                a(context, C0811r.b("007icb:dg.c.di>e"), new String[]{C0811r.b("004fXchehUh"), "packages"}, file2, file3, file4, handlerThread);
                if (file3.exists() && file3.length() > 0) {
                    HashSet hashSet = new HashSet();
                    fileInputStream = new FileInputStream(file3);
                    try {
                        inputStreamReader = new InputStreamReader(fileInputStream, "utf-8");
                        try {
                            BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                            try {
                                String b5 = C0811r.b("008icb7dgJcYdiOej");
                                for (String readLine = bufferedReader2.readLine(); readLine != null; readLine = bufferedReader2.readLine()) {
                                    String trim = readLine.trim();
                                    if (trim.length() > b5.length() && trim.substring(0, b5.length()).equalsIgnoreCase(b5)) {
                                        String trim2 = trim.substring(b5.length()).trim();
                                        if (!TextUtils.isEmpty(trim2)) {
                                            hashSet.add(trim2);
                                        }
                                    }
                                }
                                v.a(bufferedReader2, inputStreamReader, fileInputStream);
                                file2.delete();
                                file3.delete();
                                file4.delete();
                                return hashSet;
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader = bufferedReader2;
                                v.a(bufferedReader, inputStreamReader, fileInputStream);
                                file2.delete();
                                file3.delete();
                                file4.delete();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStreamReader = null;
                    }
                } else {
                    v.a(null, null, null);
                    file2.delete();
                    file3.delete();
                    file4.delete();
                }
            } catch (Throwable th4) {
                th = th4;
                fileInputStream = null;
                inputStreamReader = null;
            }
        }
        return null;
    }

    public static Set<String> a(Context context, boolean z4, HandlerThread handlerThread) throws Throwable {
        FileInputStream fileInputStream;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader = null;
        if (com.mob.commons.d.b()) {
            File file = new File(context.getFilesDir(), ".tmp11");
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, C0811r.b("002'ch:d") + System.currentTimeMillis());
            File file3 = new File(file, "out" + System.currentTimeMillis());
            File file4 = new File(file, NotificationCompat.CATEGORY_ERROR + System.currentTimeMillis());
            if (file3.exists()) {
                file3.delete();
            }
            try {
                if (z4) {
                    a(context, C0811r.b("007icbAdg_c7di@e"), new String[]{C0811r.b("016Qcdcf4e>cidbgjLcbhWchccchBhPchPe eh"), "-a", C0811r.b("026cdDcbcicjchcbckch$dhedhAckGcbhJchcjEd(ckgbecdddf"), "--user", "0"}, file2, file3, file4, handlerThread);
                } else {
                    a(context, C0811r.b("007icbXdg_cDdi2e"), new String[]{C0811r.b("016$cdcfFe%cidbgj[cbh_chccch7h=chBe%eh"), "-a", C0811r.b("026cd5cbcicjchcbckchJdhedh5ckPcbhOchcjSd@ckgbecdddf"), "-c", C0811r.b("032cd4cbcicjchcbckch;dhedhOck0bche>dicjcidbckedecdjdfdcejfhfi"), "--user", "0"}, file2, file3, file4, handlerThread);
                }
                if (file3.exists() && file3.length() > 0) {
                    HashSet hashSet = new HashSet();
                    fileInputStream = new FileInputStream(file3);
                    try {
                        inputStreamReader = new InputStreamReader(fileInputStream, "utf-8");
                        try {
                            BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                            try {
                                String b5 = C0811r.b("012icb(dg>c)diFeJdf:c)ceWe1hh");
                                for (String readLine = bufferedReader2.readLine(); readLine != null; readLine = bufferedReader2.readLine()) {
                                    String trim = readLine.trim();
                                    if (trim.length() > b5.length() && trim.substring(0, b5.length()).equalsIgnoreCase(b5)) {
                                        String trim2 = trim.substring(b5.length()).trim();
                                        if (!TextUtils.isEmpty(trim2)) {
                                            hashSet.add(trim2);
                                        }
                                    }
                                }
                                v.a(bufferedReader2, inputStreamReader, fileInputStream);
                                file2.delete();
                                file3.delete();
                                file4.delete();
                                return hashSet;
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader = bufferedReader2;
                                v.a(bufferedReader, inputStreamReader, fileInputStream);
                                file2.delete();
                                file3.delete();
                                file4.delete();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStreamReader = null;
                    }
                } else {
                    v.a(null, null, null);
                    file2.delete();
                    file3.delete();
                    file4.delete();
                }
            } catch (Throwable th4) {
                th = th4;
                fileInputStream = null;
                inputStreamReader = null;
            }
        }
        return null;
    }

    private static int a(Context context, String str, String[] strArr, File file, File file2, File file3, HandlerThread handlerThread) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        Object a5;
        FileOutputStream fileOutputStream3 = null;
        try {
            IBinder iBinder = (IBinder) com.mob.tools.a.d.a(context).a(C0811r.b("025cdXcbcicjchcbckcjehckdk.e,ciccch_beTgb)cdc+diRe ci"), (Object) null, C0811r.b("0101diMeh@dkDeCciccch[be"), new Class[]{String.class}, new Object[]{str}, (Object[]) null);
            if (iBinder == null || (a5 = com.mob.tools.a.d.a(context).a(C0811r.b("024cd5cbcicjchcbckcjehckdkIgeff^dc6cff2ee$cb3dg"))) == null) {
                v.a(null, null, null);
                return -1;
            }
            FileOutputStream fileOutputStream4 = new FileOutputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    fileOutputStream2 = new FileOutputStream(file3);
                    try {
                        com.mob.tools.a.d.a(context).a(IBinder.class, iBinder, C0811r.b("0126ehFgeff'dccjceceAcd]cb"), new Class[]{FileDescriptor.class, FileDescriptor.class, FileDescriptor.class, String[].class, Class.forName(C0811r.b("024cdHcbcicjchcbckcjehckdk9geffBdcHcffGeeZcb7dg")), ResultReceiver.class}, new Object[]{fileOutputStream4.getFD(), fileOutputStream.getFD(), fileOutputStream2.getFD(), strArr, a5, new ResultReceiver(new Handler(handlerThread.getLooper()))}, (Object[]) null);
                        v.a(fileOutputStream4, fileOutputStream, fileOutputStream2);
                        return 0;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream3 = fileOutputStream4;
                        v.a(fileOutputStream3, fileOutputStream, fileOutputStream2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream2 = null;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
                fileOutputStream2 = null;
            }
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            fileOutputStream2 = null;
        }
    }

    public static Object a(Context context, String str, int i4) throws Throwable {
        return a(context, str, i4, c(), a(context));
    }

    private static Object a(Context context, String str, int i4, int i5, int i6) throws Throwable {
        if (Build.VERSION.SDK_INT < 23) {
            return null;
        }
        if (f56777a == null) {
            f56777a = (IBinder) com.mob.tools.a.d.a(context).a(C0811r.b("025cd5cbcicjchcbckcjehckdk,e.ciccchRbe;gbKcdcZdiRe8ci"), (Object) null, C0811r.b("010KdiWeh[dk?e@ciccchAbe"), new Class[]{String.class}, new Object[]{C0811r.b("007icb5dg>cAdi0e")}, (Object[]) null);
        }
        if (f56777a != null) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken(C0811r.b("034cd6cbcicjchcbck]bVcj]dhedh?ck7i@ceckddfk>cb6dg]c)di*e4gbAcdcFdi3e+ci"));
                obtain.writeString(str);
                obtain.writeInt(i4);
                obtain.writeInt(i5);
                f56777a.transact(i6, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readTypedObject(b());
            } finally {
                obtain2.recycle();
                obtain.recycle();
                com.mob.tools.a.d.a(context).b(context);
            }
        }
        return null;
    }

    private static int a(Context context) throws Throwable {
        int i4 = f56778b;
        if (i4 != 0) {
            return i4;
        }
        String b5 = C0811r.b("034cd=cbcicjchcbckMb2cjSdhedhUck'i1ceckddfkRcbMdg(c4di3eKgb9cdc]di[eSci");
        String b6 = C0811r.b("004:dkTh3cfee");
        int intValue = ((Integer) com.mob.tools.a.d.a(context).a(b5 + "$" + b6, C0811r.b("026;ebfiecdfdkecdcebddfgdfcgdi(eh'fkCcb3dg<c1di$e8dd0d)decj"), null, 0)).intValue();
        f56778b = intValue;
        return intValue;
    }

    public static boolean a() {
        try {
            if (C0811r.b("006g2cf4cNef_eHch").equalsIgnoreCase(DH.SyncMtd.getManufacturer())) {
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                final int[] iArr = new int[1];
                DH.requester(MobSDK.getContext()).getHmOsDetailedVer().request(new DH.DHResponder() { // from class: com.mob.tools.b.j.1
                    @Override // com.mob.tools.utils.DH.DHResponder
                    public void onResponse(DH.DHResponse dHResponse) {
                        String hmOsDetailedVer = dHResponse.getHmOsDetailedVer();
                        if (hmOsDetailedVer == null) {
                            hmOsDetailedVer = "";
                        }
                        iArr[0] = "3.0.0.200".compareTo(hmOsDetailedVer);
                        countDownLatch.countDown();
                    }
                });
                countDownLatch.await();
                return iArr[0] > 0;
            }
            return true;
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return true;
        }
    }
}
