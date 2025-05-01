package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class FragmentMyGameItemPlugBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f19965b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f19966c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f19967d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f19968e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f19969f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f19970g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final View f19971h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f19972i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ProgressBar f19973j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f19974k;

    private FragmentMyGameItemPlugBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull View view, @NonNull View view2, @NonNull TextView textView3, @NonNull ProgressBar progressBar, @NonNull TextView textView4) {
        this.f19965b = constraintLayout;
        this.f19966c = textView;
        this.f19967d = simpleDraweeView;
        this.f19968e = imageView;
        this.f19969f = textView2;
        this.f19970g = view;
        this.f19971h = view2;
        this.f19972i = textView3;
        this.f19973j = progressBar;
        this.f19974k = textView4;
    }

    @NonNull
    public static FragmentMyGameItemPlugBinding bind(@NonNull View view) {
        int i4 = R.id.desc;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.desc);
        if (textView != null) {
            i4 = R.id.icon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.icon);
            if (simpleDraweeView != null) {
                i4 = R.id.imageView61;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView61);
                if (imageView != null) {
                    i4 = R.id.install;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.install);
                    if (textView2 != null) {
                        i4 = R.id.line;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
                        if (findChildViewById != null) {
                            i4 = R.id.more;
                            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.more);
                            if (findChildViewById2 != null) {
                                i4 = R.id.name;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                                if (textView3 != null) {
                                    i4 = R.id.progressBar;
                                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
                                    if (progressBar != null) {
                                        i4 = R.id.speedUp;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.speedUp);
                                        if (textView4 != null) {
                                            return new FragmentMyGameItemPlugBinding((ConstraintLayout) view, textView, simpleDraweeView, imageView, textView2, findChildViewById, findChildViewById2, textView3, progressBar, textView4);
                                        }
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
    public static FragmentMyGameItemPlugBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f19965b;
    }

    @NonNull
    public static FragmentMyGameItemPlugBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_my_game_item_plug, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
