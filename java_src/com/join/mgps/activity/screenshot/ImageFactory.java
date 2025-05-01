package com.join.mgps.activity.screenshot;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/* loaded from: classes4.dex */
public class ImageFactory {
    public void compressAndGenImage(Bitmap bitmap, String str, int i4) throws IOException {
        if (bitmap == null) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i5 = 100;
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        while (byteArrayOutputStream.toByteArray().length / 1024 > i4) {
            byteArrayOutputStream.reset();
            i5 -= 10;
            bitmap.compress(Bitmap.CompressFormat.JPEG, i5, byteArrayOutputStream);
        }
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        fileOutputStream.write(byteArrayOutputStream.toByteArray());
        fileOutputStream.flush();
        fileOutputStream.close();
    }

    public Bitmap getBitmap(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = 1;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        return BitmapFactory.decodeFile(str, options);
    }

    public Bitmap ratio(String str, float f5, float f6) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        BitmapFactory.decodeFile(str, options);
        options.inJustDecodeBounds = false;
        int i4 = options.outWidth;
        int i5 = options.outHeight;
        int i6 = (i4 <= i5 || ((float) i4) <= f5) ? (i4 >= i5 || ((float) i5) <= f6) ? 1 : (int) (i5 / f6) : (int) (i4 / f5);
        options.inSampleSize = i6 > 0 ? i6 : 1;
        return BitmapFactory.decodeFile(str, options);
    }

    public void ratioAndGenThumb(Bitmap bitmap, String str, float f5, float f6) throws FileNotFoundException {
        storeImage(ratio(bitmap, f5, f6), str);
    }

    public void storeImage(Bitmap bitmap, String str) throws FileNotFoundException {
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(str));
    }

    public void ratioAndGenThumb(String str, String str2, float f5, float f6, boolean z4) throws FileNotFoundException {
        storeImage(ratio(str, f5, f6), str2);
        if (z4) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public void compressAndGenImage(String str, String str2, int i4, boolean z4) throws IOException {
        compressAndGenImage(getBitmap(str), str2, i4);
        if (z4) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap ratio(android.graphics.Bitmap r7, float r8, float r9) {
        /*
            r6 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
            r2 = 100
            r7.compress(r1, r2, r0)
            byte[] r1 = r0.toByteArray()
            int r1 = r1.length
            r2 = 1024(0x400, float:1.435E-42)
            int r1 = r1 / r2
            if (r1 <= r2) goto L20
            r0.reset()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
            r2 = 50
            r7.compress(r1, r2, r0)
        L20:
            java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream
            byte[] r1 = r0.toByteArray()
            r7.<init>(r1)
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r2 = 1
            r1.inJustDecodeBounds = r2
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.RGB_565
            r1.inPreferredConfig = r3
            r3 = 0
            android.graphics.BitmapFactory.decodeStream(r7, r3, r1)
            r7 = 0
            r1.inJustDecodeBounds = r7
            int r7 = r1.outWidth
            int r4 = r1.outHeight
            if (r7 <= r4) goto L4b
            float r5 = (float) r7
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 <= 0) goto L4b
            float r7 = (float) r7
            float r7 = r7 / r8
        L49:
            int r7 = (int) r7
            goto L56
        L4b:
            if (r7 >= r4) goto L55
            float r7 = (float) r4
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L55
            float r7 = (float) r4
            float r7 = r7 / r9
            goto L49
        L55:
            r7 = 1
        L56:
            if (r7 > 0) goto L59
            goto L5a
        L59:
            r2 = r7
        L5a:
            r1.inSampleSize = r2
            java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream
            byte[] r8 = r0.toByteArray()
            r7.<init>(r8)
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeStream(r7, r3, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.screenshot.ImageFactory.ratio(android.graphics.Bitmap, float, float):android.graphics.Bitmap");
    }

    public void compressAndGenImage(String str, String str2, int i4, boolean z4, Context context) throws IOException {
        if (str.startsWith("content://")) {
            compressAndGenImage(MediaStore.Images.Media.getBitmap(context.getContentResolver(), Uri.parse(str)), str2, i4);
        } else {
            compressAndGenImage(getBitmap(str), str2, i4);
        }
        if (z4) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
    }
}
