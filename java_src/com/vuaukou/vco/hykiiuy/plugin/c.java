package com.vuaukou.vco.hykiiuy.plugin;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes8.dex */
final class c implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Parcelable.Creator f64873a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f64874b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Signature f64875c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Parcelable.Creator creator, String str, Signature signature) {
        this.f64873a = creator;
        this.f64874b = str;
        this.f64875c = signature;
    }

    private PackageInfo a(Parcel parcel) {
        Signature[] apkContentsSigners;
        PackageInfo packageInfo = (PackageInfo) this.f64873a.createFromParcel(parcel);
        if (packageInfo.packageName.equals(this.f64874b)) {
            if (packageInfo.signatures != null && packageInfo.signatures.length > 0) {
                packageInfo.signatures[0] = this.f64875c;
            }
            if (Build.VERSION.SDK_INT >= 28 && packageInfo.signingInfo != null && (apkContentsSigners = packageInfo.signingInfo.getApkContentsSigners()) != null && apkContentsSigners.length > 0) {
                apkContentsSigners[0] = this.f64875c;
            }
        }
        return packageInfo;
    }

    private PackageInfo[] a(int i4) {
        return (PackageInfo[]) this.f64873a.newArray(i4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Signature[] apkContentsSigners;
        PackageInfo packageInfo = (PackageInfo) this.f64873a.createFromParcel(parcel);
        if (packageInfo.packageName.equals(this.f64874b)) {
            if (packageInfo.signatures != null && packageInfo.signatures.length > 0) {
                packageInfo.signatures[0] = this.f64875c;
            }
            if (Build.VERSION.SDK_INT >= 28 && packageInfo.signingInfo != null && (apkContentsSigners = packageInfo.signingInfo.getApkContentsSigners()) != null && apkContentsSigners.length > 0) {
                apkContentsSigners[0] = this.f64875c;
            }
        }
        return packageInfo;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i4) {
        return (PackageInfo[]) this.f64873a.newArray(i4);
    }
}
