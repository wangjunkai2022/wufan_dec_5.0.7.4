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
public final class ManageTopItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23649b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f23650c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f23651d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f23652e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f23653f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f23654g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f23655h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f23656i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f23657j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f23658k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final ImageView f23659l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f23660m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final RelativeLayout f23661n;

    private ManageTopItemBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView2, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull RelativeLayout relativeLayout) {
        this.f23649b = linearLayout;
        this.f23650c = textView;
        this.f23651d = imageView;
        this.f23652e = imageView2;
        this.f23653f = textView2;
        this.f23654g = linearLayout2;
        this.f23655h = linearLayout3;
        this.f23656i = linearLayout4;
        this.f23657j = textView3;
        this.f23658k = textView4;
        this.f23659l = imageView3;
        this.f23660m = imageView4;
        this.f23661n = relativeLayout;
    }

    @NonNull
    public static ManageTopItemBinding bind(@NonNull View view) {
        int i4 = R.id.accountName;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.accountName);
        if (textView != null) {
            i4 = R.id.arrowImage;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.arrowImage);
            if (imageView != null) {
                i4 = R.id.genderText;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.genderText);
                if (imageView2 != null) {
                    i4 = R.id.levelTv;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.levelTv);
                    if (textView2 != null) {
                        LinearLayout linearLayout = (LinearLayout) view;
                        i4 = R.id.myAccountSuccess;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.myAccountSuccess);
                        if (linearLayout2 != null) {
                            i4 = R.id.myAccountUnSuccess;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.myAccountUnSuccess);
                            if (linearLayout3 != null) {
                                i4 = R.id.papaGonglue;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.papaGonglue);
                                if (textView3 != null) {
                                    i4 = R.id.papabiNumber;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.papabiNumber);
                                    if (textView4 != null) {
                                        i4 = R.id.setUser;
                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.setUser);
                                        if (imageView3 != null) {
                                            i4 = R.id.userIcon;
                                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.userIcon);
                                            if (imageView4 != null) {
                                                i4 = R.id.userModify;
                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.userModify);
                                                if (relativeLayout != null) {
                                                    return new ManageTopItemBinding(linearLayout, textView, imageView, imageView2, textView2, linearLayout, linearLayout2, linearLayout3, textView3, textView4, imageView3, imageView4, relativeLayout);
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
    public static ManageTopItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23649b;
    }

    @NonNull
    public static ManageTopItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.manage_top_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
