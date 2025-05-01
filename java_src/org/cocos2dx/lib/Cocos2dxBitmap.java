package org.cocos2dx.lib;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedList;
/* loaded from: classes7.dex */
public class Cocos2dxBitmap {
    private static final int HORIZONTALALIGN_CENTER = 3;
    private static final int HORIZONTALALIGN_LEFT = 1;
    private static final int HORIZONTALALIGN_RIGHT = 2;
    private static final int VERTICALALIGN_BOTTOM = 2;
    private static final int VERTICALALIGN_CENTER = 3;
    private static final int VERTICALALIGN_TOP = 1;
    private static Context sContext;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public static class TextProperty {
        private final int mHeightPerLine;
        private final String[] mLines;
        private final int mMaxWidth;
        private final int mTotalHeight;

        TextProperty(int i4, int i5, String[] strArr) {
            this.mMaxWidth = i4;
            this.mHeightPerLine = i5;
            this.mTotalHeight = i5 * strArr.length;
            this.mLines = strArr;
        }
    }

    private static TextProperty computeTextProperty(String str, int i4, int i5, Paint paint) {
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int ceil = (int) Math.ceil(fontMetricsInt.bottom - fontMetricsInt.top);
        String[] splitString = splitString(str, i4, i5, paint);
        if (i4 == 0) {
            int i6 = 0;
            for (String str2 : splitString) {
                int ceil2 = (int) Math.ceil(paint.measureText(str2, 0, str2.length()));
                if (ceil2 > i6) {
                    i6 = ceil2;
                }
            }
            i4 = i6;
        }
        return new TextProperty(i4, ceil, splitString);
    }

    private static int computeX(String str, int i4, int i5) {
        if (i5 != 2) {
            if (i5 != 3) {
                return 0;
            }
            return i4 / 2;
        }
        return i4;
    }

    private static int computeY(Paint.FontMetricsInt fontMetricsInt, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9 = fontMetricsInt.top;
        int i10 = -i9;
        if (i4 > i5) {
            if (i6 != 1) {
                if (i6 == 2) {
                    i7 = -i9;
                    i8 = i4 - i5;
                } else if (i6 != 3) {
                    return i10;
                } else {
                    i7 = -i9;
                    i8 = (i4 - i5) / 2;
                }
                return i7 + i8;
            }
            return -i9;
        }
        return i10;
    }

    public static void createTextBitmap(String str, String str2, int i4, int i5, int i6, int i7) {
        createTextBitmapShadowStroke(str.getBytes(), str2, i4, 255, 255, 255, 255, i5, i6, i7, false, 0.0f, 0.0f, 0.0f, 0.0f, false, 255, 255, 255, 255, 0.0f);
    }

    public static boolean createTextBitmapShadowStroke(byte[] bArr, String str, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z4, float f5, float f6, float f7, float f8, boolean z5, int i12, int i13, int i14, int i15, float f9) {
        int i16 = i9 & 15;
        int i17 = (i9 >> 4) & 15;
        String refactorString = refactorString((bArr == null || bArr.length == 0) ? "" : new String(bArr));
        Paint newPaint = newPaint(str, i4, i16);
        int i18 = 0;
        if (i10 == 0 || ((int) Math.ceil(newPaint.measureText(refactorString, 0, 1))) <= i10) {
            newPaint.setARGB(i8, i5, i6, i7);
            TextProperty computeTextProperty = computeTextProperty(refactorString, i10, i11, newPaint);
            int i19 = i11 == 0 ? computeTextProperty.mTotalHeight : i11;
            if (computeTextProperty.mMaxWidth == 0 || i19 == 0) {
                return false;
            }
            int i20 = (int) 0.0f;
            Bitmap createBitmap = Bitmap.createBitmap(computeTextProperty.mMaxWidth + i20, i19 + i20, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint.FontMetricsInt fontMetricsInt = newPaint.getFontMetricsInt();
            if (!z5) {
                int computeY = computeY(fontMetricsInt, i11, computeTextProperty.mTotalHeight, i17);
                String[] strArr = computeTextProperty.mLines;
                int length = strArr.length;
                while (i18 < length) {
                    String str2 = strArr[i18];
                    canvas.drawText(str2, computeX(str2, computeTextProperty.mMaxWidth, i16) + 0.0f, computeY + 0.0f, newPaint);
                    computeY += computeTextProperty.mHeightPerLine;
                    i18++;
                }
            } else {
                Paint newPaint2 = newPaint(str, i4, i16);
                newPaint2.setStyle(Paint.Style.STROKE);
                newPaint2.setStrokeWidth(f9);
                newPaint2.setARGB(i15, i12, i13, i14);
                int computeY2 = computeY(fontMetricsInt, i11, computeTextProperty.mTotalHeight, i17);
                String[] strArr2 = computeTextProperty.mLines;
                int length2 = strArr2.length;
                while (i18 < length2) {
                    String str3 = strArr2[i18];
                    float computeX = computeX(str3, computeTextProperty.mMaxWidth, i16) + 0.0f;
                    float f10 = computeY2 + 0.0f;
                    canvas.drawText(str3, computeX, f10, newPaint2);
                    canvas.drawText(str3, computeX, f10, newPaint);
                    computeY2 += computeTextProperty.mHeightPerLine;
                    i18++;
                }
            }
            initNativeObject(createBitmap);
            return true;
        }
        return false;
    }

    private static LinkedList<String> divideStringWithMaxWidth(String str, int i4, Paint paint) {
        int length = str.length();
        LinkedList<String> linkedList = new LinkedList<>();
        int i5 = 1;
        int i6 = 0;
        while (i5 <= length) {
            int ceil = (int) Math.ceil(paint.measureText(str, i6, i5));
            if (ceil >= i4) {
                int lastIndexOf = str.substring(0, i5).lastIndexOf(" ");
                if (lastIndexOf != -1 && lastIndexOf > i6) {
                    linkedList.add(str.substring(i6, lastIndexOf));
                    i5 = lastIndexOf + 1;
                } else if (ceil > i4 && i5 != i6 + 1) {
                    linkedList.add(str.substring(i6, i5 - 1));
                    i5--;
                } else {
                    linkedList.add(str.substring(i6, i5));
                }
                while (i5 < length && str.charAt(i5) == ' ') {
                    i5++;
                }
                i6 = i5;
            }
            i5++;
        }
        if (i6 < length) {
            linkedList.add(str.substring(i6));
        }
        return linkedList;
    }

    private static int getFontSizeAccordingHeight(int i4) {
        Paint paint = new Paint();
        Rect rect = new Rect();
        paint.setTypeface(Typeface.DEFAULT);
        boolean z4 = false;
        int i5 = 1;
        while (!z4) {
            paint.setTextSize(i5);
            paint.getTextBounds("SghMNy", 0, 6, rect);
            i5++;
            if (i4 - rect.height() <= 2) {
                z4 = true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("incr size:");
            sb.append(i5);
        }
        return i5;
    }

    private static byte[] getPixels(Bitmap bitmap) {
        if (bitmap != null) {
            byte[] bArr = new byte[bitmap.getWidth() * bitmap.getHeight() * 4];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.order(ByteOrder.nativeOrder());
            bitmap.copyPixelsToBuffer(wrap);
            return bArr;
        }
        return null;
    }

    private static String getStringWithEllipsis(String str, float f5, float f6) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTypeface(Typeface.DEFAULT);
        textPaint.setTextSize(f6);
        return TextUtils.ellipsize(str, textPaint, f5, TextUtils.TruncateAt.END).toString();
    }

    private static void initNativeObject(Bitmap bitmap) {
        byte[] pixels = getPixels(bitmap);
        if (pixels == null) {
            return;
        }
        nativeInitBitmapDC(bitmap.getWidth(), bitmap.getHeight(), pixels);
    }

    private static native void nativeInitBitmapDC(int i4, int i5, byte[] bArr);

    private static Paint newPaint(String str, int i4, int i5) {
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setTextSize(i4);
        paint.setAntiAlias(true);
        if (str.endsWith(".ttf")) {
            try {
                paint.setTypeface(Cocos2dxTypefaces.get(sContext, str));
            } catch (Exception unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("error to create ttf type face: ");
                sb.append(str);
                paint.setTypeface(Typeface.create(str, 0));
            }
        } else {
            paint.setTypeface(Typeface.create(str, 0));
        }
        if (i5 == 2) {
            paint.setTextAlign(Paint.Align.RIGHT);
        } else if (i5 != 3) {
            paint.setTextAlign(Paint.Align.LEFT);
        } else {
            paint.setTextAlign(Paint.Align.CENTER);
        }
        return paint;
    }

    private static String refactorString(String str) {
        if (str.compareTo("") == 0) {
            return " ";
        }
        StringBuilder sb = new StringBuilder(str);
        int i4 = 0;
        for (int indexOf = sb.indexOf("\n"); indexOf != -1; indexOf = sb.indexOf("\n", i4)) {
            if (indexOf == 0 || sb.charAt(indexOf - 1) == '\n') {
                sb.insert(i4, " ");
                i4 = indexOf + 2;
            } else {
                i4 = indexOf + 1;
            }
            if (i4 > sb.length() || indexOf == sb.length()) {
                break;
            }
        }
        return sb.toString();
    }

    public static void setContext(Context context) {
        sContext = context;
    }

    private static String[] splitString(String str, int i4, int i5, Paint paint) {
        String[] split = str.split("\\n");
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int ceil = i5 / ((int) Math.ceil(fontMetricsInt.bottom - fontMetricsInt.top));
        int i6 = 0;
        if (i4 != 0) {
            LinkedList linkedList = new LinkedList();
            int length = split.length;
            while (i6 < length) {
                String str2 = split[i6];
                if (((int) Math.ceil(paint.measureText(str2))) > i4) {
                    linkedList.addAll(divideStringWithMaxWidth(str2, i4, paint));
                } else {
                    linkedList.add(str2);
                }
                if (ceil > 0 && linkedList.size() >= ceil) {
                    break;
                }
                i6++;
            }
            if (ceil > 0 && linkedList.size() > ceil) {
                while (linkedList.size() > ceil) {
                    linkedList.removeLast();
                }
            }
            String[] strArr = new String[linkedList.size()];
            linkedList.toArray(strArr);
            return strArr;
        } else if (i5 == 0 || split.length <= ceil) {
            return split;
        } else {
            LinkedList linkedList2 = new LinkedList();
            while (i6 < ceil) {
                linkedList2.add(split[i6]);
                i6++;
            }
            String[] strArr2 = new String[linkedList2.size()];
            linkedList2.toArray(strArr2);
            return strArr2;
        }
    }
}
