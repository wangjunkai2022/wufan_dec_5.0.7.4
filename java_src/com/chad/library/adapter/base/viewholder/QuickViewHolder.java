package com.chad.library.adapter.base.viewholder;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: QuickViewHolder.kt */
@SourceDebugExtension({"SMAP\nQuickViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuickViewHolder.kt\ncom/chad/library/adapter/base/viewholder/QuickViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n1#2:109\n*E\n"})
/* loaded from: classes2.dex */
public class QuickViewHolder extends RecyclerView.ViewHolder {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<View> f9092a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.f9092a = new SparseArray<>();
    }

    @Nullable
    public final <T extends View> T a(int i4) {
        return (T) this.itemView.findViewById(i4);
    }

    @Nullable
    public final <T extends View> T b(@IdRes int i4) {
        T t4 = (T) this.f9092a.get(i4);
        if (t4 == null) {
            T t5 = (T) this.itemView.findViewById(i4);
            if (t5 != null) {
                this.f9092a.put(i4, t5);
                return t5;
            }
            return null;
        }
        return t4;
    }

    public final boolean c(@IdRes int i4) {
        return getView(i4).isEnabled();
    }

    public final boolean d(@IdRes int i4) {
        return getView(i4).isSelected();
    }

    @NotNull
    public final QuickViewHolder e(@IdRes int i4, @ColorInt int i5) {
        getView(i4).setBackgroundColor(i5);
        return this;
    }

    @NotNull
    public final QuickViewHolder f(@IdRes int i4, @DrawableRes int i5) {
        getView(i4).setBackgroundResource(i5);
        return this;
    }

    @NotNull
    public final QuickViewHolder g(@IdRes int i4, boolean z4) {
        getView(i4).isSelected();
        getView(i4).setEnabled(z4);
        return this;
    }

    @NotNull
    public final <T extends View> T getView(@IdRes int i4) {
        T t4 = (T) b(i4);
        if (t4 != null) {
            return t4;
        }
        throw new IllegalStateException(("No view found with id " + i4).toString());
    }

    @NotNull
    public final QuickViewHolder h(@IdRes int i4, boolean z4) {
        getView(i4).setVisibility(z4 ? 8 : 0);
        return this;
    }

    @NotNull
    public final QuickViewHolder i(@IdRes int i4, @Nullable Bitmap bitmap) {
        ((ImageView) getView(i4)).setImageBitmap(bitmap);
        return this;
    }

    @NotNull
    public final QuickViewHolder j(@IdRes int i4, @Nullable Drawable drawable) {
        ((ImageView) getView(i4)).setImageDrawable(drawable);
        return this;
    }

    @NotNull
    public final QuickViewHolder k(@IdRes int i4, @DrawableRes int i5) {
        ((ImageView) getView(i4)).setImageResource(i5);
        return this;
    }

    @NotNull
    public final QuickViewHolder l(@IdRes int i4, boolean z4) {
        getView(i4).setSelected(z4);
        return this;
    }

    @NotNull
    public final QuickViewHolder m(@IdRes int i4, @StringRes int i5) {
        ((TextView) getView(i4)).setText(i5);
        return this;
    }

    @NotNull
    public final QuickViewHolder n(@IdRes int i4, @Nullable CharSequence charSequence) {
        ((TextView) getView(i4)).setText(charSequence);
        return this;
    }

    @NotNull
    public final QuickViewHolder o(@IdRes int i4, @ColorInt int i5) {
        ((TextView) getView(i4)).setTextColor(i5);
        return this;
    }

    @NotNull
    public final QuickViewHolder p(@IdRes int i4, @ColorRes int i5) {
        ((TextView) getView(i4)).setTextColor(ContextCompat.getColor(this.itemView.getContext(), i5));
        return this;
    }

    @NotNull
    public final QuickViewHolder q(@IdRes int i4, boolean z4) {
        getView(i4).setVisibility(z4 ? 0 : 4);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public QuickViewHolder(@androidx.annotation.LayoutRes int r3, @org.jetbrains.annotations.NotNull android.view.ViewGroup r4) {
        /*
            r2 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 0
            android.view.View r3 = r0.inflate(r3, r4, r1)
            java.lang.String r4 = "from(parent.context).inflate(resId, parent, false)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chad.library.adapter.base.viewholder.QuickViewHolder.<init>(int, android.view.ViewGroup):void");
    }
}
