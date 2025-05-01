package com.qq.e.comm;

import android.content.Context;
import android.content.Intent;
import com.qq.e.comm.util.GDTLogger;
/* loaded from: classes5.dex */
public class a {
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
        com.qq.e.comm.util.GDTLogger.e(java.lang.String.format("Service[%s]需要在AndroidManifest.xml中声明", r4.getName()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a9, code lost:
        r8 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Context r8) {
        /*
            r0 = 0
            java.lang.String r1 = "android.permission.INTERNET"
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}     // Catch: java.lang.Throwable -> Lb0
            r2 = 0
        La:
            r3 = 1
            r4 = 2
            if (r2 >= r4) goto L30
            r4 = r1[r2]     // Catch: java.lang.Throwable -> L28
            int r5 = r8.checkCallingOrSelfPermission(r4)     // Catch: java.lang.Throwable -> L28
            r6 = -1
            if (r5 != r6) goto L25
            java.lang.String r1 = "Permission[%s]需要在AndroidManifest.xml中声明"
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L28
            r2[r0] = r4     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = java.lang.String.format(r1, r2)     // Catch: java.lang.Throwable -> L28
            com.qq.e.comm.util.GDTLogger.e(r1)     // Catch: java.lang.Throwable -> L28
            goto L2e
        L25:
            int r2 = r2 + 1
            goto La
        L28:
            r1 = move-exception
            java.lang.String r2 = "检查权限时发生异常"
            com.qq.e.comm.util.GDTLogger.e(r2, r1)     // Catch: java.lang.Throwable -> Lb0
        L2e:
            r1 = 0
            goto L31
        L30:
            r1 = 1
        L31:
            if (r1 == 0) goto Laf
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r2 = com.qq.e.comm.constants.CustomPkgConstants.getADActivityName()     // Catch: java.lang.Throwable -> Lb0
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> Lb0
            r1[r0] = r2     // Catch: java.lang.Throwable -> Lb0
            boolean r1 = b(r8, r1)     // Catch: java.lang.Throwable -> Lb0
            if (r1 == 0) goto Laf
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r2 = com.qq.e.comm.constants.CustomPkgConstants.getPortraitADActivityName()     // Catch: java.lang.Throwable -> Lb0
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> Lb0
            r1[r0] = r2     // Catch: java.lang.Throwable -> Lb0
            boolean r1 = b(r8, r1)     // Catch: java.lang.Throwable -> Lb0
            if (r1 == 0) goto Laf
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r2 = com.qq.e.comm.constants.CustomPkgConstants.getLandscapeADActivityName()     // Catch: java.lang.Throwable -> Lb0
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> Lb0
            r1[r0] = r2     // Catch: java.lang.Throwable -> Lb0
            boolean r1 = b(r8, r1)     // Catch: java.lang.Throwable -> Lb0
            if (r1 == 0) goto Laf
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r2 = com.qq.e.comm.constants.CustomPkgConstants.getDownLoadServiceName()     // Catch: java.lang.Throwable -> Lb0
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> Lb0
            r1[r0] = r2     // Catch: java.lang.Throwable -> Lb0
            r2 = 0
        L76:
            if (r2 >= r3) goto Lab
            r4 = r1[r2]     // Catch: java.lang.Throwable -> La3
            android.content.Intent r5 = new android.content.Intent     // Catch: java.lang.Throwable -> La3
            r5.<init>()     // Catch: java.lang.Throwable -> La3
            r5.setClass(r8, r4)     // Catch: java.lang.Throwable -> La3
            android.content.pm.PackageManager r6 = r8.getPackageManager()     // Catch: java.lang.Throwable -> La3
            r7 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r5 = r6.resolveService(r5, r7)     // Catch: java.lang.Throwable -> La3
            if (r5 != 0) goto La0
            java.lang.String r8 = "Service[%s]需要在AndroidManifest.xml中声明"
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> La3
            java.lang.String r2 = r4.getName()     // Catch: java.lang.Throwable -> La3
            r1[r0] = r2     // Catch: java.lang.Throwable -> La3
            java.lang.String r8 = java.lang.String.format(r8, r1)     // Catch: java.lang.Throwable -> La3
            com.qq.e.comm.util.GDTLogger.e(r8)     // Catch: java.lang.Throwable -> La3
            goto La9
        La0:
            int r2 = r2 + 1
            goto L76
        La3:
            r8 = move-exception
            java.lang.String r1 = "检查Service时发生异常"
            com.qq.e.comm.util.GDTLogger.e(r1, r8)     // Catch: java.lang.Throwable -> Lb0
        La9:
            r8 = 0
            goto Lac
        Lab:
            r8 = 1
        Lac:
            if (r8 == 0) goto Laf
            r0 = 1
        Laf:
            return r0
        Lb0:
            r8 = move-exception
            java.lang.String r1 = "检查AndroidManifest.xml时发生异常"
            com.qq.e.comm.util.GDTLogger.e(r1, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qq.e.comm.a.a(android.content.Context):boolean");
    }

    private static boolean b(Context context, Class<?>... clsArr) {
        for (int i4 = 0; i4 < clsArr.length; i4++) {
            try {
                Intent intent = new Intent();
                intent.setClass(context, clsArr[i4]);
                if (context.getPackageManager().resolveActivity(intent, 65536) == null) {
                    GDTLogger.e(String.format("Activity[%s]需要在AndroidManifest.xml中声明", clsArr[i4].getName()));
                    return false;
                }
            } catch (Throwable th) {
                GDTLogger.e("检查Activity时发生异常", th);
                return false;
            }
        }
        return true;
    }
}
