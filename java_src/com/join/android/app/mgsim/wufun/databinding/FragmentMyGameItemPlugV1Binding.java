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
public final class FragmentMyGameItemPlugV1Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f19975b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f19976c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f19977d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f19978e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f19979f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f19980g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final View f19981h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f19982i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ProgressBar f19983j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f19984k;

    private FragmentMyGameItemPlugV1Binding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull View view, @NonNull View view2, @NonNull TextView textView3, @NonNull ProgressBar progressBar, @NonNull TextView textView4) {
        this.f19975b = constraintLayout;
        this.f19976c = textView;
        this.f19977d = simpleDraweeView;
        this.f19978e = imageView;
        this.f19979f = textView2;
        this.f19980g = view;
        this.f19981h = view2;
        this.f19982i = textView3;
        this.f19983j = progressBar;
        this.f19984k = textView4;
    }

    @NonNull
    public static FragmentMyGameItemPlugV1Binding bind(@NonNull View view) {
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
                                            return new FragmentMyGameItemPlugV1Binding((ConstraintLayout) view, textView, simpleDraweeView, imageView, textView2, findChildViewById, findChildViewById2, textView3, progressBar, textView4);
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
    public static FragmentMyGameItemPlugV1Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f19975b;
    }

    @NonNull
    public static FragmentMyGameItemPlugV1Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_my_game_item_plug_v1, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
