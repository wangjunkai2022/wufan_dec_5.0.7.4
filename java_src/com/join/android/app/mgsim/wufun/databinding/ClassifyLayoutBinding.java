package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ClassifyLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17859b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final FrameLayout f17860c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f17861d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f17862e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TopbarTitleLayoutBinding f17863f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final RelativeLayout f17864g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final RelativeLayout f17865h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f17866i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f17867j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f17868k;

    private ClassifyLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull View view, @NonNull View view2, @NonNull TopbarTitleLayoutBinding topbarTitleLayoutBinding, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f17859b = linearLayout;
        this.f17860c = frameLayout;
        this.f17861d = view;
        this.f17862e = view2;
        this.f17863f = topbarTitleLayoutBinding;
        this.f17864g = relativeLayout;
        this.f17865h = relativeLayout2;
        this.f17866i = linearLayout2;
        this.f17867j = textView;
        this.f17868k = textView2;
    }

    @NonNull
    public static ClassifyLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.classifyFrameLayout;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.classifyFrameLayout);
        if (frameLayout != null) {
            i4 = R.id.imgPT;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.imgPT);
            if (findChildViewById != null) {
                i4 = R.id.imgYX;
                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.imgYX);
                if (findChildViewById2 != null) {
                    i4 = R.id.include;
                    View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.include);
                    if (findChildViewById3 != null) {
                        TopbarTitleLayoutBinding bind = TopbarTitleLayoutBinding.bind(findChildViewById3);
                        i4 = R.id.lLayoutPT;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.lLayoutPT);
                        if (relativeLayout != null) {
                            i4 = R.id.lLayoutYX;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.lLayoutYX);
                            if (relativeLayout2 != null) {
                                i4 = R.id.linearLayout3;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayout3);
                                if (linearLayout != null) {
                                    i4 = R.id.textViewPT;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textViewPT);
                                    if (textView != null) {
                                        i4 = R.id.textViewYX;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textViewYX);
                                        if (textView2 != null) {
                                            return new ClassifyLayoutBinding((LinearLayout) view, frameLayout, findChildViewById, findChildViewById2, bind, relativeLayout, relativeLayout2, linearLayout, textView, textView2);
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
    public static ClassifyLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17859b;
    }

    @NonNull
    public static ClassifyLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.classify_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
