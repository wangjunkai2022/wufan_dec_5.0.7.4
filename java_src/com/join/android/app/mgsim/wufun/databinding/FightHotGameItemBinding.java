package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class FightHotGameItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19480b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f19481c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f19482d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f19483e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f19484f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final RelativeLayout f19485g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final RelativeLayout f19486h;

    private FightHotGameItemBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2) {
        this.f19480b = linearLayout;
        this.f19481c = imageView;
        this.f19482d = imageView2;
        this.f19483e = simpleDraweeView;
        this.f19484f = simpleDraweeView2;
        this.f19485g = relativeLayout;
        this.f19486h = relativeLayout2;
    }

    @NonNull
    public static FightHotGameItemBinding bind(@NonNull View view) {
        int i4 = R.id.fightIconLeft;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.fightIconLeft);
        if (imageView != null) {
            i4 = R.id.fightIconRight;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.fightIconRight);
            if (imageView2 != null) {
                i4 = R.id.fightImgLeft;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.fightImgLeft);
                if (simpleDraweeView != null) {
                    i4 = R.id.fightImgRight;
                    SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.fightImgRight);
                    if (simpleDraweeView2 != null) {
                        i4 = R.id.fightLayoutLeft;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.fightLayoutLeft);
                        if (relativeLayout != null) {
                            i4 = R.id.fightLayoutRight;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.fightLayoutRight);
                            if (relativeLayout2 != null) {
                                return new FightHotGameItemBinding((LinearLayout) view, imageView, imageView2, simpleDraweeView, simpleDraweeView2, relativeLayout, relativeLayout2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FightHotGameItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19480b;
    }

    @NonNull
    public static FightHotGameItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fight_hot_game_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
