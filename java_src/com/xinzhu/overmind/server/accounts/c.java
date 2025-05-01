package com.xinzhu.overmind.server.accounts;

import android.os.Bundle;
import android.os.Parcel;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
/* compiled from: CryptoHelper.java */
/* loaded from: classes.dex */
class c {

    /* renamed from: c  reason: collision with root package name */
    private static final String f67879c = "Account";

    /* renamed from: d  reason: collision with root package name */
    private static final String f67880d = "cipher";

    /* renamed from: e  reason: collision with root package name */
    private static final String f67881e = "mac";

    /* renamed from: f  reason: collision with root package name */
    private static final String f67882f = "AES";

    /* renamed from: g  reason: collision with root package name */
    private static final String f67883g = "iv";

    /* renamed from: h  reason: collision with root package name */
    private static final String f67884h = "AES/CBC/PKCS5Padding";

    /* renamed from: i  reason: collision with root package name */
    private static final String f67885i = "HMACSHA256";

    /* renamed from: j  reason: collision with root package name */
    private static final int f67886j = 16;

    /* renamed from: k  reason: collision with root package name */
    private static c f67887k;

    /* renamed from: a  reason: collision with root package name */
    private final SecretKey f67888a = KeyGenerator.getInstance(f67882f).generateKey();

    /* renamed from: b  reason: collision with root package name */
    private final SecretKey f67889b = KeyGenerator.getInstance(f67885i).generateKey();

    private c() throws NoSuchAlgorithmException {
    }

    private static boolean a(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return bArr == bArr2;
        } else if (bArr.length != bArr2.length) {
            return false;
        } else {
            boolean z4 = true;
            for (int i4 = 0; i4 < bArr2.length; i4++) {
                z4 &= bArr[i4] == bArr2[i4];
            }
            return z4;
        }
    }

    private byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Mac mac = Mac.getInstance(f67885i);
        mac.init(this.f67889b);
        mac.update(bArr);
        mac.update(bArr2);
        return mac.doFinal();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized c e() throws NoSuchAlgorithmException {
        c cVar;
        synchronized (c.class) {
            if (f67887k == null) {
                f67887k = new c();
            }
            cVar = f67887k;
        }
        return cVar;
    }

    private boolean f(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (bArr == null || bArr.length == 0 || bArr3 == null || bArr3.length == 0) {
            return false;
        }
        return a(bArr3, b(bArr, bArr2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bundle c(Bundle bundle) throws GeneralSecurityException {
        Objects.requireNonNull(bundle, "Cannot decrypt null bundle.");
        byte[] byteArray = bundle.getByteArray(f67883g);
        byte[] byteArray2 = bundle.getByteArray(f67880d);
        if (f(byteArray2, byteArray, bundle.getByteArray(f67881e))) {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(byteArray);
            Cipher cipher = Cipher.getInstance(f67884h);
            cipher.init(2, this.f67888a, ivParameterSpec);
            byte[] doFinal = cipher.doFinal(byteArray2);
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(doFinal, 0, doFinal.length);
            obtain.setDataPosition(0);
            Bundle bundle2 = new Bundle();
            bundle2.readFromParcel(obtain);
            obtain.recycle();
            return bundle2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bundle d(Bundle bundle) throws GeneralSecurityException {
        Objects.requireNonNull(bundle, "Cannot encrypt null bundle.");
        Parcel obtain = Parcel.obtain();
        bundle.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        Cipher cipher = Cipher.getInstance(f67884h);
        cipher.init(1, this.f67888a);
        byte[] doFinal = cipher.doFinal(marshall);
        byte[] iv = cipher.getIV();
        byte[] b5 = b(doFinal, iv);
        Bundle bundle2 = new Bundle();
        bundle2.putByteArray(f67880d, doFinal);
        bundle2.putByteArray(f67881e, b5);
        bundle2.putByteArray(f67883g, iv);
        return bundle2;
    }
}
