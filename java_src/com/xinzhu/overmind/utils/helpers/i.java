package com.xinzhu.overmind.utils.helpers;

import android.annotation.SuppressLint;
import android.content.pm.ApplicationInfo;
import android.content.pm.PathPermission;
import android.content.pm.ProviderInfo;
import android.content.pm.SharedLibraryInfo;
import android.os.Parcel;
import android.os.PatternMatcher;
import android.text.TextUtils;
import com.xinzhu.haunted.android.os.p;
import com.xinzhu.overmind.Overmind;
import java.lang.reflect.Method;
import java.util.UUID;
/* compiled from: ProviderInfoFixHelper.java */
/* loaded from: classes6.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private static final String f68333a = "i";

    public static ProviderInfo a(Parcel parcel) {
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
    private static ProviderInfo b(Parcel parcel) {
        p pVar = new p(parcel);
        ProviderInfo providerInfo = new ProviderInfo();
        com.xinzhu.haunted.android.content.pm.i iVar = new com.xinzhu.haunted.android.content.pm.i(providerInfo);
        String readString = parcel.readString();
        String str = f68333a;
        com.xinzhu.overmind.b.c(str, "class name " + readString);
        providerInfo.name = pVar.e();
        providerInfo.packageName = pVar.e();
        providerInfo.labelRes = parcel.readInt();
        providerInfo.nonLocalizedLabel = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        providerInfo.icon = parcel.readInt();
        providerInfo.logo = parcel.readInt();
        providerInfo.metaData = parcel.readBundle();
        providerInfo.banner = parcel.readInt();
        iVar.c(parcel.readInt());
        if (parcel.readInt() != 0) {
            com.xinzhu.overmind.b.c(str, "unexpected squashed applicationinfo");
            Overmind.getStackTraceElement();
            return null;
        }
        providerInfo.applicationInfo = new ApplicationInfo();
        com.xinzhu.haunted.android.content.pm.b bVar = new com.xinzhu.haunted.android.content.pm.b(providerInfo.applicationInfo);
        providerInfo.applicationInfo.name = pVar.e();
        providerInfo.applicationInfo.packageName = pVar.e();
        providerInfo.applicationInfo.labelRes = parcel.readInt();
        providerInfo.applicationInfo.nonLocalizedLabel = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        providerInfo.applicationInfo.icon = parcel.readInt();
        providerInfo.applicationInfo.logo = parcel.readInt();
        providerInfo.applicationInfo.metaData = parcel.readBundle();
        providerInfo.applicationInfo.banner = parcel.readInt();
        new com.xinzhu.haunted.android.content.pm.i(providerInfo).c(parcel.readInt());
        providerInfo.applicationInfo.taskAffinity = pVar.e();
        providerInfo.applicationInfo.permission = pVar.e();
        providerInfo.applicationInfo.processName = pVar.e();
        providerInfo.applicationInfo.className = pVar.e();
        providerInfo.applicationInfo.theme = parcel.readInt();
        providerInfo.applicationInfo.flags = parcel.readInt();
        bVar.c1(parcel.readInt());
        bVar.d1(parcel.readInt());
        providerInfo.applicationInfo.requiresSmallestWidthDp = parcel.readInt();
        providerInfo.applicationInfo.compatibleWidthLimitDp = parcel.readInt();
        providerInfo.applicationInfo.largestWidthLimitDp = parcel.readInt();
        if (parcel.readInt() != 0) {
            providerInfo.applicationInfo.storageUuid = new UUID(parcel.readLong(), parcel.readLong());
            bVar.t1(com.xinzhu.haunted.android.os.storage.c.f(providerInfo.applicationInfo.storageUuid));
        }
        bVar.j1(pVar.e());
        bVar.i1(pVar.e());
        providerInfo.applicationInfo.sourceDir = pVar.e();
        providerInfo.applicationInfo.publicSourceDir = pVar.e();
        providerInfo.applicationInfo.splitNames = pVar.d();
        providerInfo.applicationInfo.splitSourceDirs = pVar.d();
        providerInfo.applicationInfo.splitPublicSourceDirs = pVar.d();
        bVar.q1(parcel.readSparseArray(null, int[].class));
        providerInfo.applicationInfo.nativeLibraryDir = pVar.e();
        bVar.n1(pVar.e());
        bVar.X0(pVar.e());
        bVar.Y0(parcel.readInt() != 0);
        bVar.b1(pVar.e());
        bVar.m1(pVar.e());
        bVar.f1(pVar.d());
        bVar.a1(pVar.d());
        bVar.k1(pVar.e());
        bVar.l1(pVar.e());
        providerInfo.applicationInfo.sharedLibraryFiles = pVar.d();
        bVar.o1(parcel.createTypedArrayList(SharedLibraryInfo.CREATOR));
        providerInfo.applicationInfo.dataDir = pVar.e();
        providerInfo.applicationInfo.deviceProtectedDataDir = pVar.e();
        bVar.J0(pVar.e());
        providerInfo.applicationInfo.uid = parcel.readInt();
        providerInfo.applicationInfo.minSdkVersion = parcel.readInt();
        providerInfo.applicationInfo.targetSdkVersion = parcel.readInt();
        bVar.F0(parcel.readLong());
        providerInfo.applicationInfo.enabled = parcel.readInt() != 0;
        bVar.O0(parcel.readInt());
        bVar.T0(parcel.readInt());
        providerInfo.applicationInfo.manageSpaceActivityName = pVar.e();
        providerInfo.applicationInfo.backupAgentName = pVar.e();
        providerInfo.applicationInfo.descriptionRes = parcel.readInt();
        providerInfo.applicationInfo.uiOptions = parcel.readInt();
        bVar.P0(parcel.readInt());
        bVar.L0(parcel.readInt());
        bVar.K0(parcel.readInt() != 0);
        bVar.Z0(parcel.readInt());
        providerInfo.applicationInfo.category = parcel.readInt();
        bVar.r1(parcel.readInt());
        bVar.H0(pVar.e());
        bVar.p1(pVar.d());
        providerInfo.applicationInfo.compileSdkVersion = parcel.readInt();
        providerInfo.applicationInfo.compileSdkVersionCodename = pVar.e();
        providerInfo.applicationInfo.appComponentFactory = pVar.e();
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
        providerInfo.processName = pVar.e();
        providerInfo.splitName = pVar.e();
        providerInfo.attributionTags = pVar.d();
        providerInfo.descriptionRes = parcel.readInt();
        providerInfo.enabled = parcel.readInt() != 0;
        providerInfo.exported = parcel.readInt() != 0;
        providerInfo.directBootAware = parcel.readInt() != 0;
        providerInfo.authority = pVar.e();
        providerInfo.readPermission = pVar.e();
        providerInfo.writePermission = pVar.e();
        providerInfo.grantUriPermissions = parcel.readInt() != 0;
        providerInfo.forceUriPermissions = parcel.readInt() != 0;
        providerInfo.uriPermissionPatterns = (PatternMatcher[]) parcel.createTypedArray(PatternMatcher.CREATOR);
        providerInfo.pathPermissions = (PathPermission[]) parcel.createTypedArray(PathPermission.CREATOR);
        providerInfo.multiprocess = parcel.readInt() != 0;
        providerInfo.initOrder = parcel.readInt();
        providerInfo.flags = parcel.readInt();
        providerInfo.isSyncable = parcel.readInt() != 0;
        String str2 = f68333a;
        com.xinzhu.overmind.b.c(str2, "wtf provider" + providerInfo.processName);
        return providerInfo;
    }
}
