package com.xinzhu.overmind.utils.helpers;

import android.annotation.SuppressLint;
import android.content.pm.ApplicationInfo;
import android.content.pm.SharedLibraryInfo;
import android.os.Parcel;
import android.text.TextUtils;
import com.xinzhu.haunted.android.os.p;
import com.xinzhu.overmind.Overmind;
import java.lang.reflect.Method;
import java.util.UUID;
/* compiled from: ApplicationInfoFixHelper.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f68331a = "b";

    public static ApplicationInfo a(Parcel parcel) {
        try {
            if (com.xinzhu.overmind.utils.e.j()) {
                return b(parcel);
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @SuppressLint({"NewApi"})
    private static ApplicationInfo b(Parcel parcel) {
        p pVar = new p(parcel);
        ApplicationInfo applicationInfo = new ApplicationInfo();
        parcel.readString();
        if (parcel.readInt() != 0) {
            com.xinzhu.overmind.b.c(f68331a, "unexpected squashed applicationinfo");
            Overmind.getStackTraceElement();
            return null;
        }
        com.xinzhu.haunted.android.content.pm.b bVar = new com.xinzhu.haunted.android.content.pm.b(applicationInfo);
        applicationInfo.name = pVar.e();
        applicationInfo.packageName = pVar.e();
        applicationInfo.labelRes = parcel.readInt();
        applicationInfo.nonLocalizedLabel = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        applicationInfo.icon = parcel.readInt();
        applicationInfo.logo = parcel.readInt();
        String str = f68331a;
        com.xinzhu.overmind.b.c(str, "class name app  asd " + applicationInfo.name);
        applicationInfo.metaData = parcel.readBundle();
        applicationInfo.banner = parcel.readInt();
        new com.xinzhu.haunted.android.content.pm.i(applicationInfo).c(parcel.readInt());
        applicationInfo.taskAffinity = pVar.e();
        applicationInfo.permission = pVar.e();
        applicationInfo.processName = pVar.e();
        applicationInfo.className = pVar.e();
        applicationInfo.theme = parcel.readInt();
        applicationInfo.flags = parcel.readInt();
        bVar.c1(parcel.readInt());
        bVar.d1(parcel.readInt());
        applicationInfo.requiresSmallestWidthDp = parcel.readInt();
        applicationInfo.compatibleWidthLimitDp = parcel.readInt();
        applicationInfo.largestWidthLimitDp = parcel.readInt();
        if (parcel.readInt() != 0) {
            UUID uuid = new UUID(parcel.readLong(), parcel.readLong());
            applicationInfo.storageUuid = uuid;
            bVar.t1(com.xinzhu.haunted.android.os.storage.c.f(uuid));
        }
        bVar.j1(pVar.e());
        bVar.i1(pVar.e());
        applicationInfo.sourceDir = pVar.e();
        applicationInfo.publicSourceDir = pVar.e();
        applicationInfo.splitNames = pVar.d();
        applicationInfo.splitSourceDirs = pVar.d();
        applicationInfo.splitPublicSourceDirs = pVar.d();
        bVar.q1(parcel.readSparseArray(null, int[].class));
        applicationInfo.nativeLibraryDir = pVar.e();
        bVar.n1(pVar.e());
        bVar.X0(pVar.e());
        bVar.Y0(parcel.readInt() != 0);
        bVar.b1(pVar.e());
        bVar.m1(pVar.e());
        bVar.f1(pVar.d());
        bVar.a1(pVar.d());
        bVar.k1(pVar.e());
        bVar.l1(pVar.e());
        applicationInfo.sharedLibraryFiles = pVar.d();
        bVar.o1(parcel.createTypedArrayList(SharedLibraryInfo.CREATOR));
        applicationInfo.dataDir = pVar.e();
        applicationInfo.deviceProtectedDataDir = pVar.e();
        bVar.J0(pVar.e());
        applicationInfo.uid = parcel.readInt();
        applicationInfo.minSdkVersion = parcel.readInt();
        applicationInfo.targetSdkVersion = parcel.readInt();
        bVar.F0(parcel.readLong());
        applicationInfo.enabled = parcel.readInt() != 0;
        bVar.O0(parcel.readInt());
        bVar.T0(parcel.readInt());
        applicationInfo.manageSpaceActivityName = pVar.e();
        applicationInfo.backupAgentName = pVar.e();
        applicationInfo.descriptionRes = parcel.readInt();
        applicationInfo.uiOptions = parcel.readInt();
        bVar.P0(parcel.readInt());
        bVar.L0(parcel.readInt());
        bVar.K0(parcel.readInt() != 0);
        bVar.Z0(parcel.readInt());
        applicationInfo.category = parcel.readInt();
        bVar.r1(parcel.readInt());
        bVar.H0(pVar.e());
        bVar.p1(pVar.d());
        applicationInfo.compileSdkVersion = parcel.readInt();
        applicationInfo.compileSdkVersionCodename = pVar.e();
        applicationInfo.appComponentFactory = pVar.e();
        bVar.S0(parcel.readInt());
        bVar.g1(parcel.readInt());
        bVar.U0(parcel.readInt());
        bVar.R0(parcel.readInt() != 0);
        bVar.u1(pVar.e());
        bVar.Q0(parcel.readInt());
        bVar.V0(parcel.readInt());
        bVar.W0(parcel.readInt());
        Object r02 = com.xinzhu.haunted.android.content.pm.b.r0();
        try {
            Method declaredMethod = r02.getClass().getDeclaredMethod("unparcel", Parcel.class);
            declaredMethod.setAccessible(true);
            bVar.e1((Boolean) declaredMethod.invoke(r02, parcel));
        } catch (Throwable th) {
            th.printStackTrace();
        }
        String str2 = f68331a;
        com.xinzhu.overmind.b.c(str2, "wtf application" + applicationInfo.processName);
        return applicationInfo;
    }
}
