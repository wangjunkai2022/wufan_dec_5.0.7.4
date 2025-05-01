package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class GenderCheckDialogLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21323b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final CheckBox f21324c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f21325d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f21326e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f21327f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final CheckBox f21328g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f21329h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f21330i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f21331j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f21332k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f21333l;

    private GenderCheckDialogLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull CheckBox checkBox, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull CheckBox checkBox2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f21323b = linearLayout;
        this.f21324c = checkBox;
        this.f21325d = linearLayout2;
        this.f21326e = imageView;
        this.f21327f = imageView2;
        this.f21328g = checkBox2;
        this.f21329h = linearLayout3;
        this.f21330i = textView;
        this.f21331j = textView2;
        this.f21332k = textView3;
        this.f21333l = textView4;
    }

    @NonNull
    public static GenderCheckDialogLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.girlCheckbox;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.girlCheckbox);
        if (checkBox != null) {
            i4 = R.id.girlLayout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.girlLayout);
            if (linearLayout != null) {
                i4 = R.id.imageView;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView);
                if (imageView != null) {
                    i4 = R.id.imageView2;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView2);
                    if (imageView2 != null) {
                        i4 = R.id.manCheckbox;
                        CheckBox checkBox2 = (CheckBox) ViewBindings.findChildViewById(view, R.id.manCheckbox);
                        if (checkBox2 != null) {
                            i4 = R.id.manLayout;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.manLayout);
                            if (linearLayout2 != null) {
                                i4 = R.id.textView;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textView);
                                if (textView != null) {
                                    i4 = R.id.textView2;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textView2);
                                    if (textView2 != null) {
                                        i4 = R.id.textView3;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textView3);
                                        if (textView3 != null) {
                                            i4 = R.id.textView4;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.textView4);
                                            if (textView4 != null) {
                                                return new GenderCheckDialogLayoutBinding((LinearLayout) view, checkBox, linearLayout, imageView, imageView2, checkBox2, linearLayout2, textView, textView2, textView3, textView4);
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
    public static GenderCheckDialogLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21323b;
    }

    @NonNull
    public static GenderCheckDialogLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gender_check_dialog_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
