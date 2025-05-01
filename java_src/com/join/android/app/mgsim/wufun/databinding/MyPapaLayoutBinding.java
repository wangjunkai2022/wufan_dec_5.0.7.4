package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
/* loaded from: classes3.dex */
public final class MyPapaLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f25330b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final XListView2 f25331c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f25332d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f25333e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final Button f25334f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f25335g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f25336h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f25337i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f25338j;

    private MyPapaLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull XListView2 xListView2, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView2, @NonNull TextView textView2) {
        this.f25330b = relativeLayout;
        this.f25331c = xListView2;
        this.f25332d = imageView;
        this.f25333e = linearLayout;
        this.f25334f = button;
        this.f25335g = textView;
        this.f25336h = linearLayout2;
        this.f25337i = imageView2;
        this.f25338j = textView2;
    }

    @NonNull
    public static MyPapaLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.classifyListView;
        XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.classifyListView);
        if (xListView2 != null) {
            i4 = R.id.lodingBackImage;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.lodingBackImage);
            if (imageView != null) {
                i4 = R.id.noneLayout;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.noneLayout);
                if (linearLayout != null) {
                    i4 = R.id.setNetwork;
                    Button button = (Button) ViewBindings.findChildViewById(view, R.id.setNetwork);
                    if (button != null) {
                        i4 = R.id.textView3;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textView3);
                        if (textView != null) {
                            i4 = R.id.topTip;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.topTip);
                            if (linearLayout2 != null) {
                                i4 = R.id.topTipClose;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.topTipClose);
                                if (imageView2 != null) {
                                    i4 = R.id.toptipText;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.toptipText);
                                    if (textView2 != null) {
                                        return new MyPapaLayoutBinding((RelativeLayout) view, xListView2, imageView, linearLayout, button, textView, linearLayout2, imageView2, textView2);
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
    public static MyPapaLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f25330b;
    }

    @NonNull
    public static MyPapaLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.my_papa_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
