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
public final class FragmentMyGameItemGameBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f19923b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f19924c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f19925d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f19926e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f19927f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final SimpleDraweeView f19928g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f19929h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f19930i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final View f19931j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final View f19932k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f19933l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f19934m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final ProgressBar f19935n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f19936o;

    private FragmentMyGameItemGameBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull View view, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView, @NonNull TextView textView4, @NonNull View view2, @NonNull View view3, @NonNull TextView textView5, @NonNull ImageView imageView2, @NonNull ProgressBar progressBar, @NonNull TextView textView6) {
        this.f19923b = constraintLayout;
        this.f19924c = textView;
        this.f19925d = textView2;
        this.f19926e = textView3;
        this.f19927f = view;
        this.f19928g = simpleDraweeView;
        this.f19929h = imageView;
        this.f19930i = textView4;
        this.f19931j = view2;
        this.f19932k = view3;
        this.f19933l = textView5;
        this.f19934m = imageView2;
        this.f19935n = progressBar;
        this.f19936o = textView6;
    }

    @NonNull
    public static FragmentMyGameItemGameBinding bind(@NonNull View view) {
        int i4 = R.id.addShortcut;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.addShortcut);
        if (textView != null) {
            i4 = R.id.count;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.count);
            if (textView2 != null) {
                i4 = R.id.desc;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.desc);
                if (textView3 != null) {
                    i4 = R.id.focus;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.focus);
                    if (findChildViewById != null) {
                        i4 = R.id.icon;
                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.icon);
                        if (simpleDraweeView != null) {
                            i4 = R.id.imageView61;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView61);
                            if (imageView != null) {
                                i4 = R.id.install;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.install);
                                if (textView4 != null) {
                                    i4 = R.id.line;
                                    View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.line);
                                    if (findChildViewById2 != null) {
                                        i4 = R.id.more;
                                        View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.more);
                                        if (findChildViewById3 != null) {
                                            i4 = R.id.name;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                                            if (textView5 != null) {
                                                i4 = R.id.notOpen;
                                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.notOpen);
                                                if (imageView2 != null) {
                                                    i4 = R.id.progressBar;
                                                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
                                                    if (progressBar != null) {
                                                        i4 = R.id.speedUp;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.speedUp);
                                                        if (textView6 != null) {
                                                            return new FragmentMyGameItemGameBinding((ConstraintLayout) view, textView, textView2, textView3, findChildViewById, simpleDraweeView, imageView, textView4, findChildViewById2, findChildViewById3, textView5, imageView2, progressBar, textView6);
                                                        }
                                                    }
                                                }
                                            }
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
    public static FragmentMyGameItemGameBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f19923b;
    }

    @NonNull
    public static FragmentMyGameItemGameBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_my_game_item_game, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
