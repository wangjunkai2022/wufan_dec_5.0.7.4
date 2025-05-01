package com.xinzhu.overmind.utils.helpers;

import android.annotation.SuppressLint;
import android.content.pm.PackageParser;
import android.content.pm.Signature;
import android.os.Parcel;
import android.util.ArraySet;
import com.xinzhu.haunted.android.content.pm.j;
import com.xinzhu.haunted.android.os.p;
import java.security.PublicKey;
/* compiled from: SigningDetailsAmbulance.java */
/* loaded from: classes6.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private static final String f68335a = "k";

    public static PackageParser.SigningDetails a(Parcel parcel) {
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
    private static PackageParser.SigningDetails b(Parcel parcel) {
        parcel.readString();
        boolean z4 = parcel.readInt() != 0;
        String str = f68335a;
        com.xinzhu.overmind.b.c(str, "get if unknown signing details " + z4);
        if (z4) {
            return (PackageParser.SigningDetails) j.a.q();
        }
        j.a o4 = j.a.o(null, 0, null, null);
        ClassLoader classLoader = Object.class.getClassLoader();
        o4.D((Signature[]) parcel.createTypedArray(Signature.CREATOR));
        o4.C(parcel.readInt());
        p pVar = new p(parcel);
        int readInt = parcel.readInt();
        com.xinzhu.overmind.b.c(str, "type here111 " + readInt + " " + o4.u());
        if (readInt < 0) {
            return null;
        }
        ArraySet<PublicKey> arraySet = new ArraySet<>(readInt);
        for (int i4 = 0; i4 < readInt; i4++) {
            int readInt2 = parcel.readInt();
            String str2 = f68335a;
            com.xinzhu.overmind.b.c(str2, "type here " + readInt2);
            arraySet.add((PublicKey) pVar.f(readInt2, classLoader, null, null));
        }
        o4.B(arraySet);
        o4.z((Signature[]) parcel.createTypedArray(Signature.CREATOR));
        return (PackageParser.SigningDetails) o4.f66534a;
    }
}
