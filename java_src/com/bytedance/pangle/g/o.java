package com.bytedance.pangle.g;

import android.content.pm.Signature;
import android.util.ArraySet;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.PublicKey;
import java.util.Arrays;
/* loaded from: classes2.dex */
final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f8421a = new o(null, 0, null, null, null);
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final Signature[] f8422b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8423c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final ArraySet<PublicKey> f8424d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public final Signature[] f8425e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public final int[] f8426f;

    public o(Signature[] signatureArr, int i4, ArraySet<PublicKey> arraySet, Signature[] signatureArr2, int[] iArr) {
        this.f8422b = signatureArr;
        this.f8423c = i4;
        this.f8424d = arraySet;
        this.f8425e = signatureArr2;
        this.f8426f = iArr;
    }

    private static ArraySet<PublicKey> a(Signature[] signatureArr) {
        ArraySet<PublicKey> arraySet = new ArraySet<>(signatureArr.length);
        for (Signature signature : signatureArr) {
            Method method = null;
            try {
                method = Signature.class.getMethod("getPublicKey", new Class[0]);
            } catch (NoSuchMethodException e5) {
                e5.printStackTrace();
            }
            if (method != null && method.isAccessible()) {
                try {
                    arraySet.add((PublicKey) method.invoke(signature, new Object[0]));
                } catch (IllegalAccessException e6) {
                    e6.printStackTrace();
                } catch (InvocationTargetException e7) {
                    e7.printStackTrace();
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
        }
        return arraySet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f8423c == oVar.f8423c && a(this.f8422b, oVar.f8422b)) {
                ArraySet<PublicKey> arraySet = this.f8424d;
                if (arraySet != null) {
                    if (!arraySet.equals(oVar.f8424d)) {
                        return false;
                    }
                } else if (oVar.f8424d != null) {
                    return false;
                }
                return Arrays.equals(this.f8425e, oVar.f8425e) && Arrays.equals(this.f8426f, oVar.f8426f);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((Arrays.hashCode(this.f8422b) * 31) + this.f8423c) * 31;
        ArraySet<PublicKey> arraySet = this.f8424d;
        return ((((hashCode + (arraySet != null ? arraySet.hashCode() : 0)) * 31) + Arrays.hashCode(this.f8425e)) * 31) + Arrays.hashCode(this.f8426f);
    }

    public o(Signature[] signatureArr, int i4, Signature[] signatureArr2, int[] iArr) {
        this(signatureArr, i4, a(signatureArr), signatureArr2, iArr);
    }

    public o(Signature[] signatureArr) {
        this(signatureArr, 2, null, null);
    }

    public static boolean a(Signature[] signatureArr, Signature[] signatureArr2) {
        return signatureArr.length == signatureArr2.length && com.bytedance.pangle.util.d.a((Object[]) signatureArr, (Object[]) signatureArr2) && com.bytedance.pangle.util.d.a((Object[]) signatureArr2, (Object[]) signatureArr);
    }

    public static boolean a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        for (int i4 = 0; i4 < bArr.length; i4++) {
            if (bArr[i4] != bArr2[i4]) {
                return false;
            }
        }
        return true;
    }
}
