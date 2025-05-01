package com.mob.tools.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.opengl.GLES10;
import android.text.TextUtils;
import android.view.View;
import androidx.core.view.MotionEventCompat;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.join.mgps.Util.h0;
import com.mob.commons.a.l;
import com.mob.commons.v;
import com.mob.tools.MobLog;
import com.mob.tools.network.HttpConnection;
import com.mob.tools.network.HttpResponseCallback;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes5.dex */
public class BitmapHelper implements PublicMemberKeeper {

    /* renamed from: a  reason: collision with root package name */
    private static int f56860a;

    /* renamed from: b  reason: collision with root package name */
    private static int f56861b;

    static {
        int[] iArr = new int[1];
        GLES10.glGetIntegerv(3379, iArr, 0);
        int max = Math.max(iArr[0], 2048);
        f56860a = max;
        f56861b = max;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(HttpConnection httpConnection, String str) throws Throwable {
        String str2;
        List<String> list;
        int lastIndexOf;
        List<String> list2;
        String[] split;
        Map<String, List<String>> headerFields = httpConnection.getHeaderFields();
        if (headerFields == null || (list2 = headerFields.get("Content-Disposition")) == null || list2.size() <= 0) {
            str2 = null;
        } else {
            str2 = null;
            for (String str3 : list2.get(0).split(";")) {
                if (str3.trim().startsWith("filename")) {
                    String[] split2 = str3.split(SimpleComparison.EQUAL_TO_OPERATION);
                    if (split2.length >= 2) {
                        str2 = split2[1];
                        if (!TextUtils.isEmpty(str2) && str2.startsWith(m.a.f71493g) && str2.endsWith(m.a.f71493g)) {
                            str2 = str2.substring(1, str2.length() - 1);
                        }
                    }
                }
            }
        }
        if (str2 == null) {
            String MD5 = Data.MD5(str);
            if (headerFields == null || (list = headerFields.get("Content-Type")) == null || list.size() <= 0) {
                return MD5;
            }
            String str4 = list.get(0);
            String trim = str4 == null ? "" : str4.trim();
            if (trim.startsWith("image/")) {
                String substring = trim.substring(6);
                StringBuilder sb = new StringBuilder();
                sb.append(MD5);
                sb.append(h0.f27805a);
                if ("jpeg".equals(substring)) {
                    substring = "jpg";
                }
                sb.append(substring);
                return sb.toString();
            }
            int lastIndexOf2 = str.lastIndexOf(47);
            String substring2 = lastIndexOf2 > 0 ? str.substring(lastIndexOf2 + 1) : null;
            if (substring2 == null || substring2.length() <= 0 || (lastIndexOf = substring2.lastIndexOf(46)) <= 0 || substring2.length() - lastIndexOf >= 10) {
                return MD5;
            }
            return MD5 + substring2.substring(lastIndexOf);
        }
        return str2;
    }

    public static Bitmap blur(Bitmap bitmap, int i4, int i5) {
        float f5 = i5;
        Bitmap createBitmap = Bitmap.createBitmap((int) ((bitmap.getWidth() / f5) + 0.5f), (int) ((bitmap.getHeight() / f5) + 0.5f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f6 = 1.0f / f5;
        canvas.scale(f6, f6);
        Paint paint = new Paint();
        paint.setFlags(2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        a(createBitmap, (int) ((i4 / f5) + 0.5f), true);
        return createBitmap;
    }

    public static Bitmap captureView(View view, int i4, int i5) throws Throwable {
        Bitmap createBitmap = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public static Bitmap compressByQuality(Bitmap bitmap, int i4) {
        return compressByQuality(bitmap, i4, false);
    }

    public static Bitmap cropBitmap(Bitmap bitmap, int i4, int i5, int i6, int i7) {
        int width = (bitmap.getWidth() - i4) - i6;
        int height = (bitmap.getHeight() - i5) - i7;
        if (width == bitmap.getWidth() && height == bitmap.getHeight()) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, -i4, -i5, new Paint());
        return createBitmap;
    }

    public static String downloadBitmap(Context context, final String str) throws Throwable {
        final String cachePath = ResHelper.getCachePath(context, "images");
        File file = new File(cachePath, Data.MD5(str));
        if (file.exists()) {
            return file.getAbsolutePath();
        }
        final HashMap hashMap = new HashMap();
        new NetworkHelper().rawGet(str, new HttpResponseCallback() { // from class: com.mob.tools.utils.BitmapHelper.1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v7, types: [com.mob.tools.utils.BitmapHelper$1$1, java.io.InputStream] */
            /* JADX WARN: Type inference failed for: r5v9, types: [java.io.OutputStream, java.io.FileOutputStream] */
            /* JADX WARN: Type inference failed for: r8v14, types: [java.io.Closeable[]] */
            /* JADX WARN: Type inference failed for: r8v9, types: [android.graphics.Bitmap] */
            @Override // com.mob.tools.network.HttpResponseCallback
            public void onResponse(HttpConnection httpConnection) throws Throwable {
                InputStreamReader inputStreamReader;
                int responseCode = httpConnection.getResponseCode();
                BufferedReader bufferedReader = null;
                if (responseCode == 200) {
                    String b5 = BitmapHelper.b(httpConnection, str);
                    File file2 = new File(cachePath, b5);
                    if (!file2.getParentFile().exists()) {
                        file2.getParentFile().mkdirs();
                    }
                    if (file2.exists()) {
                        file2.delete();
                    }
                    try {
                        ?? r5 = new FilterInputStream(httpConnection.getInputStream()) { // from class: com.mob.tools.utils.BitmapHelper.1.1
                            @Override // java.io.FilterInputStream, java.io.InputStream
                            public long skip(long j4) throws IOException {
                                long j5 = 0;
                                while (j5 < j4) {
                                    long skip = ((FilterInputStream) this).in.skip(j4 - j5);
                                    if (skip == 0) {
                                        break;
                                    }
                                    j5 += skip;
                                }
                                return j5;
                            }
                        };
                        try {
                            ?? bitmap = BitmapHelper.getBitmap((InputStream) r5, 1);
                            if (bitmap == 0 || bitmap.isRecycled()) {
                                return;
                            }
                            try {
                                ?? fileOutputStream = new FileOutputStream(file2);
                                try {
                                    if (!b5.toLowerCase().endsWith(".gif") && !b5.toLowerCase().endsWith(".png")) {
                                        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                                        fileOutputStream.flush();
                                        hashMap.put("bitmap", file2.getAbsolutePath());
                                        v.a((Closeable[]) new Closeable[]{fileOutputStream});
                                    }
                                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                                    fileOutputStream.flush();
                                    hashMap.put("bitmap", file2.getAbsolutePath());
                                    v.a((Closeable[]) new Closeable[]{fileOutputStream});
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedReader = fileOutputStream;
                                    v.a(bufferedReader);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedReader = r5;
                            v.a(bufferedReader);
                            if (file2.exists()) {
                                file2.delete();
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } else {
                    try {
                        StringBuilder sb = new StringBuilder();
                        inputStreamReader = new InputStreamReader(httpConnection.getErrorStream(), Charset.forName("utf-8"));
                        try {
                            BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                            try {
                                for (String readLine = bufferedReader2.readLine(); readLine != null; readLine = bufferedReader2.readLine()) {
                                    if (sb.length() > 0) {
                                        sb.append('\n');
                                    }
                                    sb.append(readLine);
                                }
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put(l.a("005g*ekekelek"), sb.toString());
                                hashMap2.put(l.a("006Egj'jej2ehgj"), Integer.valueOf(responseCode));
                                throw new Throwable(HashonHelper.fromHashMap(hashMap2));
                            } catch (Throwable th5) {
                                th = th5;
                                bufferedReader = bufferedReader2;
                                v.a(bufferedReader, inputStreamReader);
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        inputStreamReader = null;
                    }
                }
            }
        }, (NetworkHelper.NetworkTimeOut) null);
        return (String) hashMap.get("bitmap");
    }

    public static int[] fixRect(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[2];
        if (iArr[0] / iArr[1] > iArr2[0] / iArr2[1]) {
            iArr3[0] = iArr2[0];
            iArr3[1] = (int) (((iArr[1] * iArr2[0]) / iArr[0]) + 0.5f);
        } else {
            iArr3[1] = iArr2[1];
            iArr3[0] = (int) (((iArr[0] * iArr2[1]) / iArr[1]) + 0.5f);
        }
        return iArr3;
    }

    public static int[] fixRect_2(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[2];
        if (iArr[0] / iArr[1] > iArr2[0] / iArr2[1]) {
            iArr3[1] = iArr2[1];
            iArr3[0] = (int) (((iArr[0] * iArr2[1]) / iArr[1]) + 0.5f);
        } else {
            iArr3[0] = iArr2[0];
            iArr3[1] = (int) (((iArr[1] * iArr2[0]) / iArr[0]) + 0.5f);
        }
        return iArr3;
    }

    public static Bitmap getBitmap(String str, int i4) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return getBitmap(new File(str), i4);
    }

    public static Bitmap getBitmapByCompressQuality(String str, int i4, int i5, int i6, long j4) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            Bitmap bitmapByCompressSize = getBitmapByCompressSize(str, i4, i5);
            i6 = (i6 < 10 || i6 > 100) ? 100 : 100;
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                Bitmap.CompressFormat bmpFormat = getBmpFormat(str);
                bitmapByCompressSize.compress(bmpFormat, i6, byteArrayOutputStream2);
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (j4 < 10240) {
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                    v.a(byteArrayOutputStream2);
                    return decodeByteArray;
                }
                while (byteArray.length > j4 && i6 >= 11) {
                    byteArrayOutputStream2.reset();
                    i6 -= 6;
                    bitmapByCompressSize.compress(bmpFormat, i6, byteArrayOutputStream2);
                    byteArray = byteArrayOutputStream2.toByteArray();
                }
                if (i6 != 100) {
                    bitmapByCompressSize = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                }
                v.a(byteArrayOutputStream2);
                return bitmapByCompressSize;
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                v.a(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Bitmap getBitmapByCompressSize(String str, int i4, int i5) throws Throwable {
        int i6;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i7 = options.outWidth;
        int i8 = options.outHeight;
        if (i4 <= 1 || i5 <= 1) {
            i6 = 1;
        } else {
            float f5 = 1.0f;
            float min = (Math.min(i7, i8) * 1.0f) / Math.min(i4, i5);
            float max = (Math.max(i7, i8) * 1.0f) / Math.max(i4, i5);
            float f6 = i7 / i8;
            if (f6 <= 2.0f && f6 >= 0.5d) {
                float min2 = Math.min(min, max);
                while (true) {
                    float f7 = f5 * 2.0f;
                    if (f7 > min2) {
                        break;
                    }
                    f5 = f7;
                }
            } else {
                while (true) {
                    float f8 = f5 * 2.0f;
                    if (f8 > min) {
                        break;
                    }
                    f5 = f8;
                }
            }
            i6 = (int) f5;
        }
        int i9 = i6 >= 1 ? i6 : 1;
        while (true) {
            if (i7 / i9 <= f56860a && i8 / i9 <= f56861b) {
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inPreferredConfig = Bitmap.Config.RGB_565;
                options2.inSampleSize = i9;
                return BitmapFactory.decodeFile(str, options2);
            }
            i9++;
        }
    }

    public static Bitmap.CompressFormat getBmpFormat(byte[] bArr) {
        String a5 = a(bArr);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        return a5 != null ? (a5.endsWith("png") || a5.endsWith("gif")) ? Bitmap.CompressFormat.PNG : compressFormat : compressFormat;
    }

    public static String getMime(String str) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e5) {
            e = e5;
        }
        try {
            byte[] bArr = new byte[8];
            fileInputStream.read(bArr);
            String a5 = a(bArr);
            v.a(fileInputStream);
            return a5;
        } catch (Exception e6) {
            e = e6;
            fileInputStream2 = fileInputStream;
            MobLog.getInstance().w(e);
            v.a(fileInputStream2);
            return "";
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            v.a(fileInputStream2);
            throw th;
        }
    }

    public static boolean isBlackBitmap(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return true;
        }
        int width = bitmap.getWidth() * bitmap.getHeight();
        int[] iArr = new int[width];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        boolean z4 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= width) {
                break;
            } else if ((iArr[i4] & 16777215) != 0) {
                z4 = true;
                break;
            } else {
                i4++;
            }
        }
        return !z4;
    }

    public static int mixAlpha(int i4, int i5) {
        int i6 = i4 >>> 24;
        int i7 = 255 - i6;
        return ((((((i4 & 16711680) >>> 16) * i6) + (((16711680 & i5) >>> 16) * i7)) / 255) << 16) | (-16777216) | ((((((i4 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >>> 8) * i6) + (((65280 & i5) >>> 8) * i7)) / 255) << 8) | (((i6 * (i4 & 255)) + (i7 * (i5 & 255))) / 255);
    }

    public static Bitmap roundBitmap(Bitmap bitmap, int i4, int i5, float f5, float f6, float f7, float f8) throws Throwable {
        Bitmap createBitmap;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Rect rect = new Rect(0, 0, width, height);
        if (width == i4 && height == i5) {
            createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        } else {
            createBitmap = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect2 = new Rect(0, 0, i4, i5);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        float[] fArr = {f5, f5, f6, f6, f7, f7, f8, f8};
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, new RectF(0.0f, 0.0f, 0.0f, 0.0f), fArr));
        shapeDrawable.setBounds(rect2);
        shapeDrawable.draw(canvas);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect2, paint);
        return createBitmap;
    }

    public static boolean save(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        return save(bitmap, FileUtils.getFileByPath(str), compressFormat, false);
    }

    public static String saveBitmap(Context context, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i4) throws Throwable {
        FileOutputStream fileOutputStream;
        Throwable th;
        File file = new File(ResHelper.getCachePath(context, "images"), String.valueOf(System.currentTimeMillis()) + (compressFormat == Bitmap.CompressFormat.PNG ? ".png" : ".jpg"));
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                bitmap.compress(compressFormat, i4, fileOutputStream);
                fileOutputStream.flush();
                v.a(fileOutputStream);
                return file.getAbsolutePath();
            } catch (Throwable th2) {
                th = th2;
                v.a(fileOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            fileOutputStream = null;
            th = th3;
        }
    }

    public static String saveBitmapByCompress(String str, int i4, int i5, int i6) throws Throwable {
        FileOutputStream fileOutputStream;
        Throwable th;
        Bitmap bitmapByCompressSize = getBitmapByCompressSize(str, i4, i5);
        if (i6 > 100) {
            i6 = 100;
        } else if (i6 < 10) {
            i6 = 10;
        }
        Bitmap.CompressFormat bmpFormat = getBmpFormat(str);
        String str2 = bmpFormat == Bitmap.CompressFormat.PNG ? ".png" : ".jpg";
        File file = new File(new File(str).getParent(), String.valueOf(System.currentTimeMillis()) + str2);
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                bitmapByCompressSize.compress(bmpFormat, i6, fileOutputStream);
                fileOutputStream.flush();
                v.a(fileOutputStream);
                return file.getAbsolutePath();
            } catch (Throwable th2) {
                th = th2;
                v.a(fileOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            fileOutputStream = null;
            th = th3;
        }
    }

    public static String saveViewToImage(View view) throws Throwable {
        if (view == null) {
            return null;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        return saveViewToImage(view, width, height);
    }

    public static Bitmap scaleBitmapByHeight(Context context, int i4, int i5) throws Throwable {
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i4);
        boolean z4 = i5 != decodeResource.getHeight();
        Bitmap scaleBitmapByHeight = scaleBitmapByHeight(decodeResource, i5);
        if (z4) {
            decodeResource.recycle();
        }
        return scaleBitmapByHeight;
    }

    private static Bitmap a(Bitmap bitmap, int i4, boolean z4) {
        int[] iArr;
        int i5 = i4;
        Bitmap copy = z4 ? bitmap : bitmap.copy(bitmap.getConfig(), true);
        if (i5 < 1) {
            return null;
        }
        int width = copy.getWidth();
        int height = copy.getHeight();
        int i6 = width * height;
        int[] iArr2 = new int[i6];
        copy.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i7 = width - 1;
        int i8 = height - 1;
        int i9 = i5 + i5 + 1;
        int[] iArr3 = new int[i6];
        int[] iArr4 = new int[i6];
        int[] iArr5 = new int[i6];
        int[] iArr6 = new int[Math.max(width, height)];
        int i10 = (i9 + 1) >> 1;
        int i11 = i10 * i10;
        int i12 = i11 * 256;
        int[] iArr7 = new int[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            iArr7[i13] = i13 / i11;
        }
        int[][] iArr8 = (int[][]) Array.newInstance(int.class, i9, 3);
        int i14 = i5 + 1;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < height) {
            Bitmap bitmap2 = copy;
            int i18 = height;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            int i27 = -i5;
            int i28 = 0;
            while (i27 <= i5) {
                int i29 = i8;
                int[] iArr9 = iArr6;
                int i30 = iArr2[i16 + Math.min(i7, Math.max(i27, 0))];
                int[] iArr10 = iArr8[i27 + i5];
                iArr10[0] = (i30 & 16711680) >> 16;
                iArr10[1] = (i30 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr10[2] = i30 & 255;
                int abs = i14 - Math.abs(i27);
                i28 += iArr10[0] * abs;
                i19 += iArr10[1] * abs;
                i20 += iArr10[2] * abs;
                if (i27 > 0) {
                    i24 += iArr10[0];
                    i25 += iArr10[1];
                    i26 += iArr10[2];
                } else {
                    i21 += iArr10[0];
                    i22 += iArr10[1];
                    i23 += iArr10[2];
                }
                i27++;
                i8 = i29;
                iArr6 = iArr9;
            }
            int i31 = i8;
            int[] iArr11 = iArr6;
            int i32 = i5;
            int i33 = i28;
            int i34 = 0;
            while (i34 < width) {
                iArr3[i16] = iArr7[i33];
                iArr4[i16] = iArr7[i19];
                iArr5[i16] = iArr7[i20];
                int i35 = i33 - i21;
                int i36 = i19 - i22;
                int i37 = i20 - i23;
                int[] iArr12 = iArr8[((i32 - i5) + i9) % i9];
                int i38 = i21 - iArr12[0];
                int i39 = i22 - iArr12[1];
                int i40 = i23 - iArr12[2];
                if (i15 == 0) {
                    iArr = iArr7;
                    iArr11[i34] = Math.min(i34 + i5 + 1, i7);
                } else {
                    iArr = iArr7;
                }
                int i41 = iArr2[i17 + iArr11[i34]];
                iArr12[0] = (i41 & 16711680) >> 16;
                iArr12[1] = (i41 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr12[2] = i41 & 255;
                int i42 = i24 + iArr12[0];
                int i43 = i25 + iArr12[1];
                int i44 = i26 + iArr12[2];
                i33 = i35 + i42;
                i19 = i36 + i43;
                i20 = i37 + i44;
                i32 = (i32 + 1) % i9;
                int[] iArr13 = iArr8[i32 % i9];
                i21 = i38 + iArr13[0];
                i22 = i39 + iArr13[1];
                i23 = i40 + iArr13[2];
                i24 = i42 - iArr13[0];
                i25 = i43 - iArr13[1];
                i26 = i44 - iArr13[2];
                i16++;
                i34++;
                iArr7 = iArr;
            }
            i17 += width;
            i15++;
            copy = bitmap2;
            height = i18;
            i8 = i31;
            iArr6 = iArr11;
        }
        Bitmap bitmap3 = copy;
        int i45 = i8;
        int[] iArr14 = iArr6;
        int i46 = height;
        int[] iArr15 = iArr7;
        int i47 = 0;
        while (i47 < width) {
            int i48 = -i5;
            int i49 = i9;
            int[] iArr16 = iArr2;
            int i50 = 0;
            int i51 = 0;
            int i52 = 0;
            int i53 = 0;
            int i54 = 0;
            int i55 = 0;
            int i56 = 0;
            int i57 = i48;
            int i58 = i48 * width;
            int i59 = 0;
            int i60 = 0;
            while (i57 <= i5) {
                int i61 = width;
                int max = Math.max(0, i58) + i47;
                int[] iArr17 = iArr8[i57 + i5];
                iArr17[0] = iArr3[max];
                iArr17[1] = iArr4[max];
                iArr17[2] = iArr5[max];
                int abs2 = i14 - Math.abs(i57);
                i59 += iArr3[max] * abs2;
                i60 += iArr4[max] * abs2;
                i50 += iArr5[max] * abs2;
                if (i57 > 0) {
                    i54 += iArr17[0];
                    i55 += iArr17[1];
                    i56 += iArr17[2];
                } else {
                    i51 += iArr17[0];
                    i52 += iArr17[1];
                    i53 += iArr17[2];
                }
                int i62 = i45;
                if (i57 < i62) {
                    i58 += i61;
                }
                i57++;
                i45 = i62;
                width = i61;
            }
            int i63 = width;
            int i64 = i45;
            int i65 = i5;
            int i66 = i47;
            int i67 = i60;
            int i68 = i46;
            int i69 = i59;
            int i70 = 0;
            while (i70 < i68) {
                iArr16[i66] = (iArr16[i66] & (-16777216)) | (iArr15[i69] << 16) | (iArr15[i67] << 8) | iArr15[i50];
                int i71 = i69 - i51;
                int i72 = i67 - i52;
                int i73 = i50 - i53;
                int[] iArr18 = iArr8[((i65 - i5) + i49) % i49];
                int i74 = i51 - iArr18[0];
                int i75 = i52 - iArr18[1];
                int i76 = i53 - iArr18[2];
                if (i47 == 0) {
                    iArr14[i70] = Math.min(i70 + i14, i64) * i63;
                }
                int i77 = iArr14[i70] + i47;
                iArr18[0] = iArr3[i77];
                iArr18[1] = iArr4[i77];
                iArr18[2] = iArr5[i77];
                int i78 = i54 + iArr18[0];
                int i79 = i55 + iArr18[1];
                int i80 = i56 + iArr18[2];
                i69 = i71 + i78;
                i67 = i72 + i79;
                i50 = i73 + i80;
                i65 = (i65 + 1) % i49;
                int[] iArr19 = iArr8[i65];
                i51 = i74 + iArr19[0];
                i52 = i75 + iArr19[1];
                i53 = i76 + iArr19[2];
                i54 = i78 - iArr19[0];
                i55 = i79 - iArr19[1];
                i56 = i80 - iArr19[2];
                i66 += i63;
                i70++;
                i5 = i4;
            }
            i47++;
            i5 = i4;
            i45 = i64;
            i46 = i68;
            i9 = i49;
            iArr2 = iArr16;
            width = i63;
        }
        int i81 = width;
        bitmap3.setPixels(iArr2, 0, i81, 0, 0, i81, i46);
        return bitmap3;
    }

    public static Bitmap compressByQuality(Bitmap bitmap, int i4, boolean z4) {
        ByteArrayOutputStream byteArrayOutputStream = null;
        if (a(bitmap)) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, i4, byteArrayOutputStream2);
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (z4 && !bitmap.isRecycled()) {
                    bitmap.recycle();
                }
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                v.a(byteArrayOutputStream2);
                return decodeByteArray;
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                v.a(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean save(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat, boolean z4) {
        boolean z5;
        if (a(bitmap) || !FileUtils.createFileByDeleteOldFile(file)) {
            return false;
        }
        BufferedOutputStream bufferedOutputStream = null;
        try {
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
            try {
                z5 = bitmap.compress(compressFormat, 100, bufferedOutputStream2);
                if (z4) {
                    try {
                        if (!bitmap.isRecycled()) {
                            bitmap.recycle();
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream = bufferedOutputStream2;
                        try {
                            MobLog.getInstance().d(th);
                            v.a(bufferedOutputStream);
                            return z5;
                        } catch (Throwable th2) {
                            v.a(bufferedOutputStream);
                            throw th2;
                        }
                    }
                }
                v.a(bufferedOutputStream2);
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = bufferedOutputStream2;
                z5 = false;
                MobLog.getInstance().d(th);
                v.a(bufferedOutputStream);
                return z5;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        return z5;
    }

    public static Bitmap getBitmap(File file, int i4) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            Bitmap bitmap = getBitmap(fileInputStream, i4);
            v.a(fileInputStream);
            return bitmap;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            v.a(fileInputStream2);
            throw th;
        }
    }

    public static String saveViewToImage(View view, int i4, int i5) throws Throwable {
        Bitmap captureView = captureView(view, i4, i5);
        FileOutputStream fileOutputStream = null;
        if (captureView == null || captureView.isRecycled()) {
            return null;
        }
        String cachePath = ResHelper.getCachePath(view.getContext(), "screenshot");
        File file = new File(cachePath, String.valueOf(System.currentTimeMillis()) + ".jpg");
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                captureView.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream2);
                fileOutputStream2.flush();
                v.a(fileOutputStream2);
                return file.getAbsolutePath();
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                v.a(fileOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Bitmap.CompressFormat getBmpFormat(String str) {
        String lowerCase = str.toLowerCase();
        if (!lowerCase.endsWith("png") && !lowerCase.endsWith("gif")) {
            if (!lowerCase.endsWith("jpg") && !lowerCase.endsWith("jpeg") && !lowerCase.endsWith("bmp") && !lowerCase.endsWith("tif")) {
                String mime = getMime(str);
                if (!mime.endsWith("png") && !mime.endsWith("gif")) {
                    return Bitmap.CompressFormat.JPEG;
                }
                return Bitmap.CompressFormat.PNG;
            }
            return Bitmap.CompressFormat.JPEG;
        }
        return Bitmap.CompressFormat.PNG;
    }

    public static Bitmap scaleBitmapByHeight(Bitmap bitmap, int i4) {
        return Bitmap.createScaledBitmap(bitmap, (bitmap.getWidth() * i4) / bitmap.getHeight(), i4, true);
    }

    public static Bitmap getBitmap(InputStream inputStream, int i4) {
        if (inputStream == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i4;
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    public static Bitmap compressByQuality(Bitmap bitmap, long j4) {
        return compressByQuality(bitmap, j4, false);
    }

    public static String saveBitmap(Context context, Bitmap bitmap) throws Throwable {
        return saveBitmap(context, bitmap, Bitmap.CompressFormat.JPEG, 80);
    }

    public static Bitmap compressByQuality(Bitmap bitmap, long j4, boolean z4) {
        byte[] byteArray;
        ByteArrayOutputStream byteArrayOutputStream = null;
        if (a(bitmap) || j4 <= 0) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                int i4 = 100;
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream2);
                if (byteArrayOutputStream2.size() <= j4) {
                    byteArray = byteArrayOutputStream2.toByteArray();
                } else {
                    byteArrayOutputStream2.reset();
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 0, byteArrayOutputStream2);
                    if (byteArrayOutputStream2.size() >= j4) {
                        byteArray = byteArrayOutputStream2.toByteArray();
                    } else {
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < i4) {
                            i6 = (i5 + i4) / 2;
                            byteArrayOutputStream2.reset();
                            bitmap.compress(Bitmap.CompressFormat.JPEG, i6, byteArrayOutputStream2);
                            long size = byteArrayOutputStream2.size();
                            if (size == j4) {
                                break;
                            } else if (size > j4) {
                                i4 = i6 - 1;
                            } else {
                                i5 = i6 + 1;
                            }
                        }
                        if (i4 == i6 - 1) {
                            byteArrayOutputStream2.reset();
                            bitmap.compress(Bitmap.CompressFormat.JPEG, i5, byteArrayOutputStream2);
                        }
                        byteArray = byteArrayOutputStream2.toByteArray();
                    }
                }
                if (z4 && !bitmap.isRecycled()) {
                    bitmap.recycle();
                }
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                v.a(byteArrayOutputStream2);
                return decodeByteArray;
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                v.a(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Bitmap getBitmap(String str) throws Throwable {
        return getBitmap(str, 1);
    }

    public static Bitmap getBitmap(Context context, String str) throws Throwable {
        return getBitmap(downloadBitmap(context, str));
    }

    private static String a(byte[] bArr) {
        byte[] bArr2 = {-1, -40, -1, -31};
        if (a(bArr, new byte[]{-1, -40, -1, -32}) || a(bArr, bArr2)) {
            return "jpg";
        }
        if (a(bArr, new byte[]{-119, 80, 78, 71})) {
            return "png";
        }
        if (a(bArr, "GIF".getBytes())) {
            return "gif";
        }
        if (a(bArr, "BM".getBytes())) {
            return "bmp";
        }
        return (a(bArr, new byte[]{73, 73, 42}) || a(bArr, new byte[]{77, 77, 42})) ? "tif" : "";
    }

    private static boolean a(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i4 = 0; i4 < bArr2.length; i4++) {
            if (bArr[i4] != bArr2[i4]) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(Bitmap bitmap) {
        return bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0;
    }
}
