package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogAchievementDoneBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f18498b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f18499c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f18500d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18501e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18502f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f18503g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f18504h;

    private DialogAchievementDoneBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f18498b = constraintLayout;
        this.f18499c = simpleDraweeView;
        this.f18500d = imageView;
        this.f18501e = textView;
        this.f18502f = textView2;
        this.f18503g = textView3;
        this.f18504h = textView4;
    }

    @NonNull
    public static DialogAchievementDoneBinding bind(@NonNull View view) {
        int i4 = R.id.ivAchievement;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.ivAchievement);
        if (simpleDraweeView != null) {
            i4 = R.id.ivClose;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ivClose);
            if (imageView != null) {
                i4 = R.id.tvAchievement;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvAchievement);
                if (textView != null) {
                    i4 = R.id.tvRate;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvRate);
                    if (textView2 != null) {
                        i4 = R.id.tvTitle;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitle);
                        if (textView3 != null) {
                            i4 = R.id.tvToAll;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvToAll);
                            if (textView4 != null) {
                                return new DialogAchievementDoneBinding((ConstraintLayout) view, simpleDraweeView, imageView, textView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogAchievementDoneBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f18498b;
    }

    @NonNull
    public static DialogAchievementDoneBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_achievement_done, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
