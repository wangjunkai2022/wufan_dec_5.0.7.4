package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class RecomentActivityLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26233b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26234c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f26235d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ConstraintLayout f26236e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f26237f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f26238g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final RecyclerView f26239h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f26240i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f26241j;

    private RecomentActivityLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView2, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f26233b = linearLayout;
        this.f26234c = textView;
        this.f26235d = imageView;
        this.f26236e = constraintLayout;
        this.f26237f = imageView2;
        this.f26238g = view;
        this.f26239h = recyclerView;
        this.f26240i = textView2;
        this.f26241j = textView3;
    }

    @NonNull
    public static RecomentActivityLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.enterGame;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.enterGame);
        if (textView != null) {
            i4 = R.id.lodingImg;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.lodingImg);
            if (imageView != null) {
                i4 = R.id.protocol;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.protocol);
                if (constraintLayout != null) {
                    i4 = R.id.protocolCheck;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.protocolCheck);
                    if (imageView2 != null) {
                        i4 = R.id.protocolCheckPlaceholder;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.protocolCheckPlaceholder);
                        if (findChildViewById != null) {
                            i4 = R.id.recycleView;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.recycleView);
                            if (recyclerView != null) {
                                i4 = R.id.title;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                                if (textView2 != null) {
                                    i4 = R.id.userProtocolTxt;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.userProtocolTxt);
                                    if (textView3 != null) {
                                        return new RecomentActivityLayoutBinding((LinearLayout) view, textView, imageView, constraintLayout, imageView2, findChildViewById, recyclerView, textView2, textView3);
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
    public static RecomentActivityLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26233b;
    }

    @NonNull
    public static RecomentActivityLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.recoment_activity_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
