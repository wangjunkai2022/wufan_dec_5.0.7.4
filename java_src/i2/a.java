package i2;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.join.mgps.Util.c0;
import java.util.Hashtable;
/* compiled from: QRCodeUtil.java */
/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static int f69138a;

    /* renamed from: b  reason: collision with root package name */
    private static int f69139b;

    public static Bitmap a(String str, int i4, int i5) {
        Bitmap bitmap = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Hashtable hashtable = new Hashtable();
            hashtable.put(EncodeHintType.CHARACTER_SET, "utf-8");
            BitMatrix encode = new QRCodeWriter().encode(str, BarcodeFormat.QR_CODE, i4, i5, hashtable);
            int[] iArr = new int[i4 * i5];
            for (int i6 = 0; i6 < i5; i6++) {
                for (int i7 = 0; i7 < i4; i7++) {
                    if (encode.get(i7, i6)) {
                        iArr[(i6 * i4) + i7] = -16777216;
                    } else {
                        iArr[(i6 * i4) + i7] = -1;
                    }
                }
            }
            bitmap = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
            bitmap.setPixels(iArr, 0, i4, 0, 0, i4, i5);
            return bitmap;
        } catch (WriterException e5) {
            e5.printStackTrace();
            return bitmap;
        }
    }

    public static Bitmap b(String str, Context context) {
        Bitmap bitmap = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        f69138a = c0.a(context, 200.0f);
        f69139b = c0.a(context, 200.0f);
        try {
            Hashtable hashtable = new Hashtable();
            hashtable.put(EncodeHintType.CHARACTER_SET, "utf-8");
            BitMatrix encode = new QRCodeWriter().encode(str, BarcodeFormat.QR_CODE, f69138a, f69139b, hashtable);
            int[] iArr = new int[f69138a * f69139b];
            int i4 = 0;
            while (true) {
                int i5 = f69139b;
                if (i4 < i5) {
                    for (int i6 = 0; i6 < f69138a; i6++) {
                        if (encode.get(i6, i4)) {
                            iArr[(f69138a * i4) + i6] = -16777216;
                        } else {
                            iArr[(f69138a * i4) + i6] = -1;
                        }
                    }
                    i4++;
                } else {
                    bitmap = Bitmap.createBitmap(f69138a, i5, Bitmap.Config.ARGB_8888);
                    int i7 = f69138a;
                    bitmap.setPixels(iArr, 0, i7, 0, 0, i7, f69139b);
                    return bitmap;
                }
            }
        } catch (WriterException e5) {
            e5.printStackTrace();
            return bitmap;
        }
    }
}
