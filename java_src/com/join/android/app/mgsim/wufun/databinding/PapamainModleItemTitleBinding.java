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
public final class PapamainModleItemTitleBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f25812b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f25813c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f25814d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f25815e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f25816f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f25817g;

    private PapamainModleItemTitleBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f25812b = relativeLayout;
        this.f25813c = imageView;
        this.f25814d = linearLayout;
        this.f25815e = textView;
        this.f25816f = textView2;
        this.f25817g = textView3;
    }

    @NonNull
    public static PapamainModleItemTitleBinding bind(@NonNull View view) {
        int i4 = R.id.imageView5;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView5);
        if (imageView != null) {
            i4 = R.id.look_other;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.look_other);
            if (linearLayout != null) {
                i4 = R.id.subtitle;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.subtitle);
                if (textView != null) {
                    i4 = R.id.textView11;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textView11);
                    if (textView2 != null) {
                        i4 = R.id.title;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                        if (textView3 != null) {
                            return new PapamainModleItemTitleBinding((RelativeLayout) view, imageView, linearLayout, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PapamainModleItemTitleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f25812b;
    }

    @NonNull
    public static PapamainModleItemTitleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.papamain_modle_item_title, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
