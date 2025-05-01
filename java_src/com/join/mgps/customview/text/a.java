package com.join.mgps.customview.text;

import android.content.Context;
import android.graphics.Color;
import android.text.Editable;
import android.text.Html;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Field;
import java.util.HashMap;
import org.xml.sax.XMLReader;
/* compiled from: HtmlTagHandler.java */
/* loaded from: classes4.dex */
public class a implements Html.TagHandler {

    /* renamed from: f  reason: collision with root package name */
    static final /* synthetic */ boolean f48784f = false;

    /* renamed from: b  reason: collision with root package name */
    private final String f48785b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f48786c;

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<String, String> f48787d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private int f48788e = 0;

    public a(String str, Context context) {
        this.f48785b = str;
        this.f48786c = context;
    }

    private void a(int i4, int i5, Editable editable, String str) {
        String str2;
        String[] split = str.split(";");
        HashMap hashMap = new HashMap();
        for (String str3 : split) {
            String[] split2 = str3.split(":");
            if (split2.length == 2) {
                hashMap.put(split2[0].trim(), split2[1].trim());
            }
        }
        String str4 = (String) hashMap.get(TypedValues.Custom.S_COLOR);
        if (!TextUtils.isEmpty(str4)) {
            if (str4.startsWith("rgb")) {
                String[] split3 = str4.replace("rgb(", "").replace(")", "").split(", ");
                str4 = g(Integer.parseInt(split3[0]), Integer.parseInt(split3[1]), Integer.parseInt(split3[2]));
            }
            try {
                editable.setSpan(new ForegroundColorSpan(Color.parseColor(str4)), i4, i5, 33);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        if (TextUtils.isEmpty((String) hashMap.get("font-size"))) {
            return;
        }
        try {
            editable.setSpan(new AbsoluteSizeSpan(d(this.f48786c, Integer.parseInt(str2.split("px")[0]))), i4, i5, 33);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    private void b(Editable editable) {
        int length = editable.length();
        String str = this.f48787d.get("style");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(this.f48788e, length, editable, str);
    }

    private void c(XMLReader xMLReader) {
        try {
            Field declaredField = xMLReader.getClass().getDeclaredField("theNewElement");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(xMLReader);
            if (obj != null) {
                Field declaredField2 = obj.getClass().getDeclaredField("theAtts");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(obj);
                if (obj2 != null) {
                    Field declaredField3 = obj2.getClass().getDeclaredField("data");
                    declaredField3.setAccessible(true);
                    String[] strArr = (String[]) declaredField3.get(obj2);
                    Field declaredField4 = obj2.getClass().getDeclaredField("length");
                    declaredField4.setAccessible(true);
                    Object obj3 = declaredField4.get(obj2);
                    int intValue = obj3 == null ? 0 : ((Integer) obj3).intValue();
                    for (int i4 = 0; i4 < intValue; i4++) {
                        int i5 = i4 * 5;
                        this.f48787d.put(strArr[i5 + 1], strArr[i5 + 4]);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    private static int d(Context context, float f5) {
        return (int) ((f5 * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    private void e(Editable editable) {
        this.f48788e = editable.length();
    }

    private static String f(int i4) {
        StringBuilder sb = new StringBuilder(Integer.toHexString(i4 & 255));
        while (sb.length() < 2) {
            sb.append("0");
        }
        return sb.toString().toUpperCase();
    }

    private static String g(int i4, int i5, int i6) {
        return "#" + f(i4) + f(i5) + f(i6);
    }

    @Override // android.text.Html.TagHandler
    public void handleTag(boolean z4, String str, Editable editable, XMLReader xMLReader) {
        if (this.f48785b.equalsIgnoreCase(str)) {
            c(xMLReader);
            if (z4) {
                e(editable);
                return;
            }
            b(editable);
            this.f48787d.clear();
        }
    }
}
