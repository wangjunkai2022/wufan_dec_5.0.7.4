package com.join.kotlin.bindingadapter;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import androidx.databinding.BindingAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ViewBindingTextview.kt */
@SourceDebugExtension({"SMAP\nViewBindingTextview.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewBindingTextview.kt\ncom/join/kotlin/bindingadapter/ViewBindingTextviewKt\n+ 2 CommonExt.kt\ncom/join/kotlin/base/utils/CommonExtKt\n*L\n1#1,58:1\n29#2,6:59\n*S KotlinDebug\n*F\n+ 1 ViewBindingTextview.kt\ncom/join/kotlin/bindingadapter/ViewBindingTextviewKt\n*L\n49#1:59,6\n*E\n"})
/* loaded from: classes3.dex */
public final class ViewBindingTextviewKt {
    @BindingAdapter(requireAll = false, value = {"setTextForBlood"})
    public static final void textViewBinding(@NotNull TextView textView, @NotNull String text) {
        boolean contains$default;
        String replace$default;
        String replace$default2;
        int indexOf$default;
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(text, "text");
        contains$default = StringsKt__StringsKt.contains$default((CharSequence) text, (CharSequence) "《", false, 2, (Object) null);
        if (contains$default) {
            replace$default = StringsKt__StringsJVMKt.replace$default(text, "《", " ", false, 4, (Object) null);
            replace$default2 = StringsKt__StringsJVMKt.replace$default(replace$default, "》", " ", false, 4, (Object) null);
            SpannableString spannableString = new SpannableString(replace$default2);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#303030"));
            indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) text, (char) 12298, 0, false, 6, (Object) null);
            spannableString.setSpan(foregroundColorSpan, indexOf$default, replace$default2.length(), 33);
            textView.setText(spannableString);
            return;
        }
        textView.setText(text);
    }

    @BindingAdapter(requireAll = false, value = {"textColor"})
    public static final void textViewColorBinding(@NotNull TextView textView, int i4) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        textView.setTextColor(i4);
    }

    public static /* synthetic */ void textViewColorBinding$default(TextView textView, String str, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str = "#000000";
        }
        textViewColorBinding(textView, str);
    }

    @BindingAdapter(requireAll = false, value = {"textColorStr"})
    public static final void textViewColorBinding(@NotNull TextView textView, @Nullable String str) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        try {
            if (str != null) {
                textView.setTextColor(Color.parseColor(str));
            } else {
                textView.setTextColor(Color.parseColor("#000000"));
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
