package a2;

import android.annotation.TargetApi;
import android.content.ContentUris;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import com.facebook.common.util.f;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import net.lingala.zip4j.util.e;
/* compiled from: ConvertUtils.java */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final long f24a = 1073741824;

    /* renamed from: b  reason: collision with root package name */
    public static final long f25b = 1048576;

    /* renamed from: c  reason: collision with root package name */
    public static final long f26c = 1024;

    public static String A(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b5 : str.getBytes()) {
            sb.append(Integer.toHexString(b5 & 255));
            sb.append(" ");
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String B(byte... bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[bArr.length * 2];
        int i4 = 0;
        for (int i5 = 0; i5 < bArr.length; i5++) {
            int i6 = bArr[i5] < 0 ? bArr[i5] + 256 : bArr[i5];
            int i7 = i4 + 1;
            cArr2[i4] = cArr[i6 >>> 4];
            i4 = i7 + 1;
            cArr2[i7] = cArr[i6 & 15];
        }
        return new String(cArr2);
    }

    public static int C(Object obj) {
        try {
            return Integer.parseInt(obj.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static int D(byte[] bArr) {
        int i4 = 0;
        for (int i5 = 0; i5 < bArr.length; i5++) {
            i4 += (bArr[i5] & 255) << (i5 * 8);
        }
        return i4;
    }

    public static <T> List<T> E(T[] tArr) {
        return Arrays.asList(tArr);
    }

    public static long F(Object obj) {
        try {
            return Long.parseLong(obj.toString());
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @TargetApi(19)
    public static String G(Context context, Uri uri) {
        if (uri == null) {
            return "";
        }
        String path = uri.getPath();
        String scheme = uri.getScheme();
        String authority = uri.getAuthority();
        Uri uri2 = null;
        if ((Build.VERSION.SDK_INT >= 19) && DocumentsContract.isDocumentUri(context, uri)) {
            String documentId = DocumentsContract.getDocumentId(uri);
            String[] split = documentId.split(":");
            String str = split[0];
            authority.hashCode();
            char c5 = 65535;
            switch (authority.hashCode()) {
                case 320699453:
                    if (authority.equals("com.android.providers.downloads.documents")) {
                        c5 = 0;
                        break;
                    }
                    break;
                case 596745902:
                    if (authority.equals("com.android.externalstorage.documents")) {
                        c5 = 1;
                        break;
                    }
                    break;
                case 1734583286:
                    if (authority.equals("com.android.providers.media.documents")) {
                        c5 = 2;
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                    return a(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null, null);
                case 1:
                    if ("primary".equalsIgnoreCase(str)) {
                        return Environment.getExternalStorageDirectory() + e.F0 + split[1];
                    }
                    break;
                case 2:
                    if ("image".equals(str)) {
                        uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if ("video".equals(str)) {
                        uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if ("audio".equals(str)) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    return a(context, uri2, "_id=?", new String[]{split[1]});
            }
        } else if ("content".equalsIgnoreCase(scheme)) {
            if (authority.equals("com.google.android.apps.photos.content")) {
                return uri.getLastPathSegment();
            }
            return a(context, uri, null, null);
        } else if (f.f10925c.equalsIgnoreCase(scheme)) {
            return uri.getPath();
        }
        return path;
    }

    public static int H(Context context, float f5) {
        return (int) ((f5 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int I(byte b5, byte b6) {
        return (b5 << 8) + (b6 & 255);
    }

    public static String J(String str) {
        char[] charArray;
        String str2 = "";
        for (char c5 : str.toCharArray()) {
            if (c5 == '\"' || c5 == '\'' || c5 == '\\') {
                str2 = str2 + "\\";
            }
            str2 = str2 + c5;
        }
        return str2;
    }

    public static int K(Context context, float f5) {
        return (int) ((f5 / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static String L(InputStream inputStream) {
        return M(inputStream, "utf-8");
    }

    public static String M(InputStream inputStream, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, str));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
                sb.append("\n");
            }
            bufferedReader.close();
            inputStream.close();
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public static String N(Object[] objArr) {
        return Arrays.deepToString(objArr);
    }

    public static String O(Object[] objArr, String str) {
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            sb.append(obj);
            sb.append(str);
        }
        return sb.toString();
    }

    private static String a(Context context, Uri uri, String str, String[] strArr) {
        String str2 = null;
        try {
            Cursor query = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
            if (query != null) {
                int columnIndexOrThrow = query.getColumnIndexOrThrow("_data");
                query.moveToFirst();
                str2 = query.getString(columnIndexOrThrow);
                query.close();
                return str2;
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return str2;
        }
    }

    public static <T> T[] b(List<T> list) {
        return (T[]) list.toArray();
    }

    public static String c(int i4) {
        return Integer.toBinaryString(i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String d(byte... bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[bArr.length * 8];
        int i4 = 0;
        for (int i5 = 0; i5 < bArr.length; i5++) {
            int i6 = bArr[i5] < 0 ? bArr[i5] + 256 : bArr[i5];
            int i7 = i4 + 1;
            cArr2[i4] = cArr[(i6 >>> 7) & 1];
            int i8 = i7 + 1;
            cArr2[i7] = cArr[(i6 >>> 6) & 1];
            int i9 = i8 + 1;
            cArr2[i8] = cArr[(i6 >>> 5) & 1];
            int i10 = i9 + 1;
            cArr2[i9] = cArr[(i6 >>> 4) & 1];
            int i11 = i10 + 1;
            cArr2[i10] = cArr[(i6 >>> 3) & 1];
            int i12 = i11 + 1;
            cArr2[i11] = cArr[(i6 >>> 2) & 1];
            int i13 = i12 + 1;
            cArr2[i12] = cArr[(i6 >>> 1) & 1];
            i4 = i13 + 1;
            cArr2[i13] = cArr[i6 & 1];
        }
        return new String(cArr2);
    }

    public static Bitmap e(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        if (drawable instanceof ColorDrawable) {
            Bitmap createBitmap = Bitmap.createBitmap(32, 32, Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawColor(((ColorDrawable) drawable).getColor());
            return createBitmap;
        } else if (drawable instanceof NinePatchDrawable) {
            Bitmap createBitmap2 = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap2);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            drawable.draw(canvas);
            return createBitmap2;
        } else {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap f(android.view.View r7) {
        /*
            int r0 = r7.getWidth()
            int r1 = r7.getHeight()
            boolean r2 = r7 instanceof android.widget.ListView
            r3 = 0
            if (r2 == 0) goto L24
            r1 = r7
            android.widget.ListView r1 = (android.widget.ListView) r1
            r2 = 0
            r4 = 0
        L12:
            int r5 = r1.getChildCount()
            if (r4 >= r5) goto L3f
            android.view.View r5 = r1.getChildAt(r4)
            int r5 = r5.getHeight()
            int r2 = r2 + r5
            int r4 = r4 + 1
            goto L12
        L24:
            boolean r2 = r7 instanceof android.widget.ScrollView
            if (r2 == 0) goto L40
            r1 = r7
            android.widget.ScrollView r1 = (android.widget.ScrollView) r1
            r2 = 0
            r4 = 0
        L2d:
            int r5 = r1.getChildCount()
            if (r4 >= r5) goto L3f
            android.view.View r5 = r1.getChildAt(r4)
            int r5 = r5.getHeight()
            int r2 = r2 + r5
            int r4 = r4 + 1
            goto L2d
        L3f:
            r1 = r2
        L40:
            r2 = 1
            r7.setDrawingCacheEnabled(r2)
            r7.clearFocus()
            r7.setPressed(r3)
            boolean r2 = r7.willNotCacheDrawing()
            r7.setWillNotCacheDrawing(r3)
            int r3 = r7.getDrawingCacheBackgroundColor()
            r4 = -1
            r7.setDrawingCacheBackgroundColor(r4)
            if (r3 == r4) goto L5e
            r7.destroyDrawingCache()
        L5e:
            r7.buildDrawingCache()
            android.graphics.Bitmap r4 = r7.getDrawingCache()
            r5 = 0
            if (r4 != 0) goto L69
            return r5
        L69:
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r6)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            r6 = 0
            r1.drawBitmap(r4, r6, r6, r5)
            r1.save()
            r1.restore()
            boolean r1 = r0.isRecycled()
            if (r1 != 0) goto L87
            r0.recycle()
        L87:
            r7.destroyDrawingCache()
            r7.setWillNotCacheDrawing(r2)
            r7.setDrawingCacheBackgroundColor(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.a.f(android.view.View):android.graphics.Bitmap");
    }

    public static Bitmap g(byte[] bArr) {
        return h(bArr, -1, -1);
    }

    public static Bitmap h(byte[] bArr, int i4, int i5) {
        Bitmap bitmap = null;
        if (bArr.length != 0) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inDither = false;
                options.inPreferredConfig = null;
                if (i4 > 0 && i5 > 0) {
                    options.outWidth = i4;
                    options.outHeight = i5;
                }
                bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                bitmap.setDensity(96);
                return bitmap;
            } catch (Exception unused) {
                return bitmap;
            }
        }
        return null;
    }

    public static byte[] i(int i4) {
        return ByteBuffer.allocate(4).putInt(i4).array();
    }

    public static byte[] j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused) {
        }
        return byteArray;
    }

    public static byte[] k(Drawable drawable) {
        return j(e(drawable));
    }

    public static byte[] l(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[100];
            while (true) {
                int read = inputStream.read(bArr, 0, 100);
                if (read == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    inputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static byte[] m(String str, boolean z4) {
        if (str == null || str.equals("")) {
            return null;
        }
        if (!z4) {
            return str.getBytes();
        }
        String replaceAll = str.replaceAll("\\s+", "");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(replaceAll.length() / 2);
        for (int i4 = 0; i4 < replaceAll.length(); i4 += 2) {
            byteArrayOutputStream.write((net.lingala.zip4j.crypto.PBKDF2.a.f71726a.indexOf(replaceAll.charAt(i4)) << 4) | net.lingala.zip4j.crypto.PBKDF2.a.f71726a.indexOf(replaceAll.charAt(i4 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused) {
        }
        return byteArray;
    }

    public static ColorStateList n(@ColorInt int i4, @ColorInt int i5) {
        return o(i4, i5, i5, i4);
    }

    public static ColorStateList o(@ColorInt int i4, @ColorInt int i5, @ColorInt int i6, @ColorInt int i7) {
        return new ColorStateList(new int[][]{new int[]{16842919, 16842910}, new int[]{16842910, 16842908}, new int[]{16842910}, new int[]{16842908}, new int[]{16842909}, new int[0]}, new int[]{i5, i6, i4, i6, i7, i4});
    }

    public static String p(@ColorInt int i4) {
        return q(i4, false);
    }

    public static String q(@ColorInt int i4, boolean z4) {
        String hexString = Integer.toHexString(Color.alpha(i4));
        String hexString2 = Integer.toHexString(Color.red(i4));
        String hexString3 = Integer.toHexString(Color.green(i4));
        String hexString4 = Integer.toHexString(Color.blue(i4));
        if (hexString.length() == 1) {
            hexString = "0" + hexString;
        }
        if (hexString2.length() == 1) {
            hexString2 = "0" + hexString2;
        }
        if (hexString3.length() == 1) {
            hexString3 = "0" + hexString3;
        }
        if (hexString4.length() == 1) {
            hexString4 = "0" + hexString4;
        }
        if (z4) {
            return hexString + hexString2 + hexString3 + hexString4;
        }
        return hexString2 + hexString3 + hexString4;
    }

    public static int r(@ColorInt int i4) {
        return s(i4, 0.8f);
    }

    public static int s(@ColorInt int i4, @FloatRange(from = 0.0d, to = 1.0d) float f5) {
        Color.colorToHSV(i4, r0);
        float[] fArr = {0.0f, 0.0f, fArr[2] * f5};
        return Color.HSVToColor(fArr);
    }

    public static int t(Context context, float f5) {
        return (int) ((f5 / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static Drawable u(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new BitmapDrawable(Resources.getSystem(), bitmap);
    }

    public static Drawable v(byte[] bArr) {
        return u(g(bArr));
    }

    public static String w(long j4) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        if (j4 < 1024) {
            return j4 + "B";
        } else if (j4 < 1048576) {
            StringBuilder sb = new StringBuilder();
            double d5 = j4;
            Double.isNaN(d5);
            sb.append(decimalFormat.format(d5 / 1024.0d));
            sb.append("K");
            return sb.toString();
        } else if (j4 < 1073741824) {
            StringBuilder sb2 = new StringBuilder();
            double d6 = j4;
            Double.isNaN(d6);
            sb2.append(decimalFormat.format(d6 / 1048576.0d));
            sb2.append("M");
            return sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            double d7 = j4;
            Double.isNaN(d7);
            sb3.append(decimalFormat.format(d7 / 1.073741824E9d));
            sb3.append("G");
            return sb3.toString();
        }
    }

    public static float x(Object obj) {
        try {
            return Float.parseFloat(obj.toString());
        } catch (NumberFormatException unused) {
            return -1.0f;
        }
    }

    public static String y(String str) {
        try {
            return new String(str.getBytes("utf-8"), "gbk");
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    public static String z(int i4) {
        return Integer.toHexString(i4);
    }
}
