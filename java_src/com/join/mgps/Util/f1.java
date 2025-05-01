package com.join.mgps.Util;

import android.content.Context;
import android.text.InputFilter;
import android.text.Spanned;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: NameLengthFilter.java */
/* loaded from: classes3.dex */
public class f1 implements InputFilter {

    /* renamed from: b  reason: collision with root package name */
    int f27796b;

    /* renamed from: e  reason: collision with root package name */
    Context f27799e;

    /* renamed from: c  reason: collision with root package name */
    String f27797c = "[\\u4e00-\\u9fa5]";

    /* renamed from: d  reason: collision with root package name */
    String f27798d = "[\\ud83c\\udc00-\\ud83c\\udfff]|[\\ud83d\\udc00-\\ud83d\\udfff]|[\\u2600-\\u27ff]";

    /* renamed from: f  reason: collision with root package name */
    Pattern f27800f = Pattern.compile("[\\u4e00-\\u9fa5]");

    /* renamed from: g  reason: collision with root package name */
    Pattern f27801g = Pattern.compile(this.f27798d);

    public f1(int i4, Context context) {
        this.f27796b = i4;
        this.f27799e = context;
    }

    private int a(String str) {
        Matcher matcher = this.f27800f.matcher(str);
        int i4 = 0;
        while (matcher.find()) {
            for (int i5 = 0; i5 <= matcher.groupCount(); i5++) {
                i4++;
            }
        }
        return i4;
    }

    private boolean b(String str) {
        return Pattern.matches(this.f27797c, str);
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i4, int i5, Spanned spanned, int i6, int i7) {
        if (this.f27801g.matcher(charSequence).find()) {
            l2.a(this.f27799e).b("不支持表情");
        }
        int length = spanned.toString().length() + a(spanned.toString());
        int length2 = charSequence.toString().length() + a(charSequence.toString());
        int i8 = length + length2;
        int i9 = this.f27796b;
        if (i8 > i9) {
            int i10 = i9 - length;
            int i11 = 0;
            String str = "";
            while (i10 > 0) {
                char charAt = charSequence.charAt(i11);
                if (b(charAt + "")) {
                    if (length2 >= 2) {
                        str = str + charAt;
                    }
                    i10 -= 2;
                } else {
                    str = str + charAt;
                    i10--;
                }
                i11++;
            }
            return str;
        }
        return charSequence;
    }
}
