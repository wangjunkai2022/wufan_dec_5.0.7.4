package com.join.kotlin.bindingadapter;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.databinding.BindingAdapter;
import com.join.mgps.Util.j0;
import com.join.mgps.dto.ForumBean;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: TextView.kt */
/* loaded from: classes3.dex */
public final class TextViewKt {
    @BindingAdapter(requireAll = false, value = {"tagName", "tagName2", "message"})
    public static final void setTagText(@NotNull TextView textView, @NotNull String tagName, @NotNull String tagName2, @NotNull String message) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(tagName, "tagName");
        Intrinsics.checkNotNullParameter(tagName2, "tagName2");
        Intrinsics.checkNotNullParameter(message, "message");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        if (!(tagName.length() == 0)) {
            ForumBean.ForumPostsBean.TagInfo tagInfo = new ForumBean.ForumPostsBean.TagInfo();
            tagInfo.setName(tagName);
            tagInfo.setColor("#FF372F");
            tagInfo.setFont_color("#ffffff");
            arrayList.add(tagInfo);
        }
        if (!(tagName2.length() == 0)) {
            ForumBean.ForumPostsBean.TagInfo tagInfo2 = new ForumBean.ForumPostsBean.TagInfo();
            tagInfo2.setName(tagName2);
            tagInfo2.setColor("#0570FF");
            tagInfo2.setFont_color("#ffffff");
            arrayList.add(tagInfo2);
        }
        j0.e(textView.getContext(), spannableStringBuilder, arrayList);
        if (TextUtils.isEmpty(message)) {
            message = "";
        }
        spannableStringBuilder.append((CharSequence) message);
        textView.setText(spannableStringBuilder);
    }
}
