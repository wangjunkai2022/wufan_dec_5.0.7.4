package com.join.mgps.Util;

import android.content.Context;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.EditText;
/* compiled from: CheckEmojiUtile.java */
/* loaded from: classes3.dex */
public class o {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckEmojiUtile.java */
    /* loaded from: classes3.dex */
    public class a implements InputFilter {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f27961b;

        a(Context context) {
            this.f27961b = context;
        }

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i4, int i5, Spanned spanned, int i6, int i7) {
            StringBuffer stringBuffer = new StringBuffer();
            int i8 = i4;
            while (i8 < i5) {
                char charAt = charSequence.charAt(i8);
                if (!o.c(charAt)) {
                    stringBuffer.append(charAt);
                } else {
                    l2.a(this.f27961b).b("昵称不能含有表情");
                    i8++;
                }
                i8++;
            }
            if (!(charSequence instanceof Spanned) || charSequence.length() <= 0) {
                return stringBuffer;
            }
            SpannableString spannableString = new SpannableString(stringBuffer);
            TextUtils.copySpansFrom((Spanned) charSequence, i4, i5, null, spannableString, 0);
            return spannableString;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckEmojiUtile.java */
    /* loaded from: classes3.dex */
    public class b implements InputFilter {
        b() {
        }

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i4, int i5, Spanned spanned, int i6, int i7) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i8 = i4; i8 < i5; i8++) {
                stringBuffer.append(charSequence.charAt(i8));
            }
            if (charSequence instanceof Spanned) {
                SpannableString spannableString = new SpannableString(stringBuffer);
                TextUtils.copySpansFrom((Spanned) charSequence, i4, i5, null, spannableString, 0);
                return spannableString;
            }
            return stringBuffer;
        }
    }

    public static InputFilter a(Context context) {
        return new a(context);
    }

    public static InputFilter b(Context context) {
        return new b();
    }

    public static boolean c(char c5) {
        if (c5 == 0 || c5 == '\t' || c5 == '\n' || c5 == '\r') {
            return false;
        }
        if (c5 < ' ' || c5 > 55295) {
            if (c5 < 57344 || c5 > 65533) {
                return c5 < 0 || c5 > 65535;
            }
            return false;
        }
        return false;
    }

    public static boolean d(char c5) {
        return Character.getType(c5) > 10;
    }

    private static boolean e(char c5) {
        return (c5 == 0 || c5 == '\t' || c5 == '\n' || c5 == '\r' || (c5 >= ' ' && c5 <= 55295) || ((c5 >= 57344 && c5 <= 65533) || (c5 >= 0 && c5 <= 65535))) ? false : true;
    }

    public static boolean f(String str) {
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (e(str.charAt(i4))) {
                return true;
            }
        }
        return false;
    }

    public static void g(EditText editText) {
        editText.setFilters(new InputFilter[]{a(editText.getContext()), b(editText.getContext())});
    }
}
