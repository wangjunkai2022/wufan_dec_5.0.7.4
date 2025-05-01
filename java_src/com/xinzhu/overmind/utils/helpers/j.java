package com.xinzhu.overmind.utils.helpers;

import android.annotation.SuppressLint;
import android.content.pm.ApplicationInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.SharedLibraryInfo;
import android.os.Parcel;
import android.text.TextUtils;
import com.xinzhu.haunted.android.os.p;
import com.xinzhu.overmind.Overmind;
import java.lang.reflect.Method;
import java.util.UUID;
/* compiled from: ServiceInfoFixHelper.java */
/* loaded from: classes6.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private static final String f68334a = "j";

    public static ServiceInfo a(Parcel parcel) {
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
    private static ServiceInfo b(Parcel parcel) {
        p pVar = new p(parcel);
        ServiceInfo serviceInfo = new ServiceInfo();
        com.xinzhu.haunted.android.content.pm.l lVar = new com.xinzhu.haunted.android.content.pm.l(serviceInfo);
        com.xinzhu.haunted.android.content.pm.i iVar = new com.xinzhu.haunted.android.content.pm.i(serviceInfo);
        String readString = parcel.readString();
        String str = f68334a;
        com.xinzhu.overmind.b.c(str, "class name " + readString);
        serviceInfo.name = pVar.e();
        serviceInfo.packageName = pVar.e();
        serviceInfo.labelRes = parcel.readInt();
        serviceInfo.nonLocalizedLabel = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        serviceInfo.icon = parcel.readInt();
        serviceInfo.logo = parcel.readInt();
        serviceInfo.metaData = parcel.readBundle();
        serviceInfo.banner = parcel.readInt();
        iVar.c(parcel.readInt());
        if (parcel.readInt() != 0) {
            com.xinzhu.overmind.b.c(str, "unexpected squashed applicationinfo");
            Overmind.getStackTraceElement();
            return null;
        }
        serviceInfo.applicationInfo = new ApplicationInfo();
        com.xinzhu.haunted.android.content.pm.b bVar = new com.xinzhu.haunted.android.content.pm.b(serviceInfo.applicationInfo);
        serviceInfo.applicationInfo.name = pVar.e();
        serviceInfo.applicationInfo.packageName = pVar.e();
        serviceInfo.applicationInfo.labelRes = parcel.readInt();
        serviceInfo.applicationInfo.nonLocalizedLabel = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        serviceInfo.applicationInfo.icon = parcel.readInt();
        serviceInfo.applicationInfo.logo = parcel.readInt();
        serviceInfo.applicationInfo.metaData = parcel.readBundle();
        serviceInfo.applicationInfo.banner = parcel.readInt();
        new com.xinzhu.haunted.android.content.pm.i(serviceInfo).c(parcel.readInt());
        serviceInfo.applicationInfo.taskAffinity = pVar.e();
        serviceInfo.applicationInfo.permission = pVar.e();
        serviceInfo.applicationInfo.processName = pVar.e();
        serviceInfo.applicationInfo.className = pVar.e();
        serviceInfo.applicationInfo.theme = parcel.readInt();
        serviceInfo.applicationInfo.flags = parcel.readInt();
        bVar.c1(parcel.readInt());
        bVar.d1(parcel.readInt());
        serviceInfo.applicationInfo.requiresSmallestWidthDp = parcel.readInt();
        serviceInfo.applicationInfo.compatibleWidthLimitDp = parcel.readInt();
        serviceInfo.applicationInfo.largestWidthLimitDp = parcel.readInt();
        if (parcel.readInt() != 0) {
            serviceInfo.applicationInfo.storageUuid = new UUID(parcel.readLong(), parcel.readLong());
            bVar.t1(com.xinzhu.haunted.android.os.storage.c.f(serviceInfo.applicationInfo.storageUuid));
        }
        bVar.j1(pVar.e());
        bVar.i1(pVar.e());
        serviceInfo.applicationInfo.sourceDir = pVar.e();
        serviceInfo.applicationInfo.publicSourceDir = pVar.e();
        serviceInfo.applicationInfo.splitNames = pVar.d();
        serviceInfo.applicationInfo.splitSourceDirs = pVar.d();
        serviceInfo.applicationInfo.splitPublicSourceDirs = pVar.d();
        bVar.q1(parcel.readSparseArray(null, int[].class));
        serviceInfo.applicationInfo.nativeLibraryDir = pVar.e();
        bVar.n1(pVar.e());
        bVar.X0(pVar.e());
        bVar.Y0(parcel.readInt() != 0);
        bVar.b1(pVar.e());
        bVar.m1(pVar.e());
        bVar.f1(pVar.d());
        bVar.a1(pVar.d());
        bVar.k1(pVar.e());
        bVar.l1(pVar.e());
        serviceInfo.applicationInfo.sharedLibraryFiles = pVar.d();
        bVar.o1(parcel.createTypedArrayList(SharedLibraryInfo.CREATOR));
        serviceInfo.applicationInfo.dataDir = pVar.e();
        serviceInfo.applicationInfo.deviceProtectedDataDir = pVar.e();
        bVar.J0(pVar.e());
        serviceInfo.applicationInfo.uid = parcel.readInt();
        serviceInfo.applicationInfo.minSdkVersion = parcel.readInt();
        serviceInfo.applicationInfo.targetSdkVersion = parcel.readInt();
        bVar.F0(parcel.readLong());
        serviceInfo.applicationInfo.enabled = parcel.readInt() != 0;
        bVar.O0(parcel.readInt());
        bVar.T0(parcel.readInt());
        serviceInfo.applicationInfo.manageSpaceActivityName = pVar.e();
        serviceInfo.applicationInfo.backupAgentName = pVar.e();
        serviceInfo.applicationInfo.descriptionRes = parcel.readInt();
        serviceInfo.applicationInfo.uiOptions = parcel.readInt();
        bVar.P0(parcel.readInt());
        bVar.L0(parcel.readInt());
        bVar.K0(parcel.readInt() != 0);
        bVar.Z0(parcel.readInt());
        serviceInfo.applicationInfo.category = parcel.readInt();
        bVar.r1(parcel.readInt());
        bVar.H0(pVar.e());
        bVar.p1(pVar.d());
        serviceInfo.applicationInfo.compileSdkVersion = parcel.readInt();
        serviceInfo.applicationInfo.compileSdkVersionCodename = pVar.e();
        serviceInfo.applicationInfo.appComponentFactory = pVar.e();
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
        serviceInfo.processName = pVar.e();
        serviceInfo.splitName = pVar.e();
        serviceInfo.attributionTags = pVar.d();
        serviceInfo.descriptionRes = parcel.readInt();
        serviceInfo.enabled = parcel.readInt() != 0;
        serviceInfo.exported = parcel.readInt() != 0;
        serviceInfo.directBootAware = parcel.readInt() != 0;
        serviceInfo.permission = pVar.e();
        serviceInfo.flags = parcel.readInt();
        lVar.c(parcel.readInt());
        String str2 = f68334a;
        com.xinzhu.overmind.b.c(str2, "wtf " + serviceInfo.processName);
        return serviceInfo;
    }
}
