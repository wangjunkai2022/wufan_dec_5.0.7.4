package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgGamedetailUpdateBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24544b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f24545c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f24546d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f24547e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f24548f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f24549g;

    private MgGamedetailUpdateBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView2, @NonNull View view) {
        this.f24544b = linearLayout;
        this.f24545c = imageView;
        this.f24546d = textView;
        this.f24547e = relativeLayout;
        this.f24548f = textView2;
        this.f24549g = view;
    }

    @NonNull
    public static MgGamedetailUpdateBinding bind(@NonNull View view) {
        int i4 = R.id.arrowImage;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.arrowImage);
        if (imageView != null) {
            i4 = R.id.giftsCount;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.giftsCount);
            if (textView != null) {
                i4 = R.id.giftsLayout;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.giftsLayout);
                if (relativeLayout != null) {
                    i4 = R.id.giftsTitle;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.giftsTitle);
                    if (textView2 != null) {
                        i4 = R.id.lineUpdate;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.lineUpdate);
                        if (findChildViewById != null) {
                            return new MgGamedetailUpdateBinding((LinearLayout) view, imageView, textView, relativeLayout, textView2, findChildViewById);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgGamedetailUpdateBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24544b;
    }

    @NonNull
    public static MgGamedetailUpdateBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_gamedetail_update, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
