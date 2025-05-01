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
public final class FragmentMyGameItemGuessLikeBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f19956b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f19957c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f19958d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f19959e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f19960f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f19961g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final View f19962h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f19963i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f19964j;

    private FragmentMyGameItemGuessLikeBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull ImageView imageView, @NonNull View view, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f19956b = constraintLayout;
        this.f19957c = textView;
        this.f19958d = simpleDraweeView;
        this.f19959e = simpleDraweeView2;
        this.f19960f = simpleDraweeView3;
        this.f19961g = imageView;
        this.f19962h = view;
        this.f19963i = textView2;
        this.f19964j = textView3;
    }

    @NonNull
    public static FragmentMyGameItemGuessLikeBinding bind(@NonNull View view) {
        int i4 = R.id.count;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.count);
        if (textView != null) {
            i4 = R.id.icon1;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.icon1);
            if (simpleDraweeView != null) {
                i4 = R.id.icon2;
                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.icon2);
                if (simpleDraweeView2 != null) {
                    i4 = R.id.icon3;
                    SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.icon3);
                    if (simpleDraweeView3 != null) {
                        i4 = R.id.imageView60;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView60);
                        if (imageView != null) {
                            i4 = R.id.line;
                            View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
                            if (findChildViewById != null) {
                                i4 = R.id.textView87;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textView87);
                                if (textView2 != null) {
                                    i4 = R.id.textView88;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textView88);
                                    if (textView3 != null) {
                                        return new FragmentMyGameItemGuessLikeBinding((ConstraintLayout) view, textView, simpleDraweeView, simpleDraweeView2, simpleDraweeView3, imageView, findChildViewById, textView2, textView3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentMyGameItemGuessLikeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f19956b;
    }

    @NonNull
    public static FragmentMyGameItemGuessLikeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_my_game_item_guess_like, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
