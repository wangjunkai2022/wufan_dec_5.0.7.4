package com.xinzhu.overmind.utils.helpers;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.SharedLibraryInfo;
import android.os.Build;
import android.os.Parcel;
import android.text.TextUtils;
import com.xinzhu.haunted.android.content.pm.a;
import com.xinzhu.haunted.android.os.p;
import com.xinzhu.overmind.Overmind;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.UUID;
/* compiled from: ActivityInfoFixHelper.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f68330a = "a";

    public static ActivityInfo a(Parcel parcel) {
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
    private static ActivityInfo b(Parcel parcel) {
        p pVar = new p(parcel);
        ActivityInfo activityInfo = new ActivityInfo();
        com.xinzhu.haunted.android.content.pm.a aVar = new com.xinzhu.haunted.android.content.pm.a(activityInfo);
        com.xinzhu.haunted.android.content.pm.i iVar = new com.xinzhu.haunted.android.content.pm.i(activityInfo);
        String str = f68330a;
        com.xinzhu.overmind.b.c(str, "class name " + parcel.readString());
        activityInfo.name = pVar.e();
        activityInfo.packageName = pVar.e();
        activityInfo.labelRes = parcel.readInt();
        activityInfo.nonLocalizedLabel = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        activityInfo.icon = parcel.readInt();
        activityInfo.logo = parcel.readInt();
        activityInfo.metaData = parcel.readBundle();
        activityInfo.banner = parcel.readInt();
        iVar.c(parcel.readInt());
        if (parcel.readInt() != 0) {
            com.xinzhu.overmind.b.c(str, "unexpected squashed applicationinfo");
            Overmind.getStackTraceElement();
            return null;
        }
        activityInfo.applicationInfo = new ApplicationInfo();
        com.xinzhu.haunted.android.content.pm.b bVar = new com.xinzhu.haunted.android.content.pm.b(activityInfo.applicationInfo);
        activityInfo.applicationInfo.name = pVar.e();
        activityInfo.applicationInfo.packageName = pVar.e();
        activityInfo.applicationInfo.labelRes = parcel.readInt();
        activityInfo.applicationInfo.nonLocalizedLabel = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        activityInfo.applicationInfo.icon = parcel.readInt();
        activityInfo.applicationInfo.logo = parcel.readInt();
        activityInfo.applicationInfo.metaData = parcel.readBundle();
        activityInfo.applicationInfo.banner = parcel.readInt();
        new com.xinzhu.haunted.android.content.pm.i(activityInfo).c(parcel.readInt());
        activityInfo.applicationInfo.taskAffinity = pVar.e();
        activityInfo.applicationInfo.permission = pVar.e();
        activityInfo.applicationInfo.processName = pVar.e();
        activityInfo.applicationInfo.className = pVar.e();
        activityInfo.applicationInfo.theme = parcel.readInt();
        activityInfo.applicationInfo.flags = parcel.readInt();
        bVar.c1(parcel.readInt());
        bVar.d1(parcel.readInt());
        activityInfo.applicationInfo.requiresSmallestWidthDp = parcel.readInt();
        activityInfo.applicationInfo.compatibleWidthLimitDp = parcel.readInt();
        activityInfo.applicationInfo.largestWidthLimitDp = parcel.readInt();
        if (parcel.readInt() != 0) {
            activityInfo.applicationInfo.storageUuid = new UUID(parcel.readLong(), parcel.readLong());
            bVar.t1(com.xinzhu.haunted.android.os.storage.c.f(activityInfo.applicationInfo.storageUuid));
        }
        bVar.j1(pVar.e());
        bVar.i1(pVar.e());
        activityInfo.applicationInfo.sourceDir = pVar.e();
        activityInfo.applicationInfo.publicSourceDir = pVar.e();
        activityInfo.applicationInfo.splitNames = pVar.d();
        activityInfo.applicationInfo.splitSourceDirs = pVar.d();
        activityInfo.applicationInfo.splitPublicSourceDirs = pVar.d();
        bVar.q1(parcel.readSparseArray(null, int[].class));
        activityInfo.applicationInfo.nativeLibraryDir = pVar.e();
        bVar.n1(pVar.e());
        bVar.X0(pVar.e());
        bVar.Y0(parcel.readInt() != 0);
        bVar.b1(pVar.e());
        bVar.m1(pVar.e());
        bVar.f1(pVar.d());
        bVar.a1(pVar.d());
        bVar.k1(pVar.e());
        bVar.l1(pVar.e());
        activityInfo.applicationInfo.sharedLibraryFiles = pVar.d();
        bVar.o1(parcel.createTypedArrayList(SharedLibraryInfo.CREATOR));
        activityInfo.applicationInfo.dataDir = pVar.e();
        activityInfo.applicationInfo.deviceProtectedDataDir = pVar.e();
        bVar.J0(pVar.e());
        activityInfo.applicationInfo.uid = parcel.readInt();
        activityInfo.applicationInfo.minSdkVersion = parcel.readInt();
        activityInfo.applicationInfo.targetSdkVersion = parcel.readInt();
        bVar.F0(parcel.readLong());
        activityInfo.applicationInfo.enabled = parcel.readInt() != 0;
        bVar.O0(parcel.readInt());
        bVar.T0(parcel.readInt());
        activityInfo.applicationInfo.manageSpaceActivityName = pVar.e();
        activityInfo.applicationInfo.backupAgentName = pVar.e();
        activityInfo.applicationInfo.descriptionRes = parcel.readInt();
        activityInfo.applicationInfo.uiOptions = parcel.readInt();
        bVar.P0(parcel.readInt());
        bVar.L0(parcel.readInt());
        bVar.K0(parcel.readInt() != 0);
        bVar.Z0(parcel.readInt());
        activityInfo.applicationInfo.category = parcel.readInt();
        bVar.r1(parcel.readInt());
        bVar.H0(pVar.e());
        bVar.p1(pVar.d());
        activityInfo.applicationInfo.compileSdkVersion = parcel.readInt();
        activityInfo.applicationInfo.compileSdkVersionCodename = pVar.e();
        activityInfo.applicationInfo.appComponentFactory = pVar.e();
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
        activityInfo.processName = pVar.e();
        activityInfo.splitName = pVar.e();
        activityInfo.attributionTags = pVar.d();
        activityInfo.descriptionRes = parcel.readInt();
        activityInfo.enabled = parcel.readInt() != 0;
        activityInfo.exported = parcel.readInt() != 0;
        activityInfo.directBootAware = parcel.readInt() != 0;
        activityInfo.theme = parcel.readInt();
        activityInfo.launchMode = parcel.readInt();
        activityInfo.documentLaunchMode = parcel.readInt();
        activityInfo.permission = pVar.e();
        activityInfo.taskAffinity = pVar.e();
        activityInfo.targetActivity = pVar.e();
        aVar.w(pVar.e());
        activityInfo.flags = parcel.readInt();
        aVar.B(parcel.readInt());
        activityInfo.screenOrientation = parcel.readInt();
        activityInfo.configChanges = parcel.readInt();
        activityInfo.softInputMode = parcel.readInt();
        activityInfo.uiOptions = parcel.readInt();
        activityInfo.parentActivityName = pVar.e();
        activityInfo.persistableMode = parcel.readInt();
        activityInfo.maxRecents = parcel.readInt();
        aVar.x(parcel.readInt());
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 24 && parcel.readInt() == 1) {
            a.C0696a b5 = a.C0696a.b(parcel);
            Objects.requireNonNull(b5);
            activityInfo.windowLayout = (ActivityInfo.WindowLayout) b5.f66387a;
        }
        aVar.D(parcel.readInt());
        aVar.C(pVar.e());
        aVar.E(parcel.readInt());
        if (i4 >= 26) {
            activityInfo.colorMode = parcel.readInt();
        }
        aVar.z(parcel.readFloat());
        aVar.A(parcel.readFloat());
        aVar.F(parcel.readInt() != 0);
        String str2 = f68330a;
        com.xinzhu.overmind.b.c(str2, "wtf " + activityInfo.taskAffinity + " " + activityInfo.processName);
        return activityInfo;
    }
}
