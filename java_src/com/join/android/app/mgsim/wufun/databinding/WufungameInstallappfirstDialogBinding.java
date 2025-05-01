package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class WufungameInstallappfirstDialogBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f27170b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f27171c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final CheckBox f27172d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f27173e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f27174f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f27175g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final SimpleDraweeView f27176h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final SimpleDraweeView f27177i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f27178j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f27179k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f27180l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f27181m;

    private WufungameInstallappfirstDialogBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull CheckBox checkBox, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull LinearLayout linearLayout, @NonNull TextView textView4, @NonNull LinearLayout linearLayout2, @NonNull TextView textView5) {
        this.f27170b = relativeLayout;
        this.f27171c = textView;
        this.f27172d = checkBox;
        this.f27173e = imageView;
        this.f27174f = textView2;
        this.f27175g = textView3;
        this.f27176h = simpleDraweeView;
        this.f27177i = simpleDraweeView2;
        this.f27178j = linearLayout;
        this.f27179k = textView4;
        this.f27180l = linearLayout2;
        this.f27181m = textView5;
    }

    @NonNull
    public static WufungameInstallappfirstDialogBinding bind(@NonNull View view) {
        int i4 = R.id.appshow;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appshow);
        if (textView != null) {
            i4 = R.id.checkbox;
            CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.checkbox);
            if (checkBox != null) {
                i4 = R.id.close;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.close);
                if (imageView != null) {
                    i4 = R.id.gameName;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.gameName);
                    if (textView2 != null) {
                        i4 = R.id.goH5;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.goH5);
                        if (textView3 != null) {
                            i4 = R.id.icon;
                            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.icon);
                            if (simpleDraweeView != null) {
                                i4 = R.id.img;
                                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.img);
                                if (simpleDraweeView2 != null) {
                                    i4 = R.id.main;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.main);
                                    if (linearLayout != null) {
                                        i4 = R.id.message;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.message);
                                        if (textView4 != null) {
                                            i4 = R.id.moreSelecter;
                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.moreSelecter);
                                            if (linearLayout2 != null) {
                                                i4 = R.id.startButn;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.startButn);
                                                if (textView5 != null) {
                                                    return new WufungameInstallappfirstDialogBinding((RelativeLayout) view, textView, checkBox, imageView, textView2, textView3, simpleDraweeView, simpleDraweeView2, linearLayout, textView4, linearLayout2, textView5);
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
    public static WufungameInstallappfirstDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f27170b;
    }

    @NonNull
    public static WufungameInstallappfirstDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.wufungame_installappfirst_dialog, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
