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
import androidx.viewpager2.widget.ViewPager2;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityHideAppHomeBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f16518b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f16519c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RelativeLayout f16520d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f16521e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f16522f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f16523g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f16524h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final View f16525i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f16526j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ViewPager2 f16527k;

    private ActivityHideAppHomeBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull View view, @NonNull TextView textView, @NonNull ViewPager2 viewPager2) {
        this.f16518b = linearLayout;
        this.f16519c = imageView;
        this.f16520d = relativeLayout;
        this.f16521e = imageView2;
        this.f16522f = imageView3;
        this.f16523g = imageView4;
        this.f16524h = imageView5;
        this.f16525i = view;
        this.f16526j = textView;
        this.f16527k = viewPager2;
    }

    @NonNull
    public static ActivityHideAppHomeBinding bind(@NonNull View view) {
        int i4 = R.id.back_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back_image);
        if (imageView != null) {
            i4 = R.id.headview;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.headview);
            if (relativeLayout != null) {
                i4 = R.id.icFake;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.icFake);
                if (imageView2 != null) {
                    i4 = R.id.icPretend;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.icPretend);
                    if (imageView3 != null) {
                        i4 = R.id.icProtected;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.icProtected);
                        if (imageView4 != null) {
                            i4 = R.id.icPwd;
                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.icPwd);
                            if (imageView5 != null) {
                                i4 = R.id.statubar;
                                View findChildViewById = ViewBindings.findChildViewById(view, R.id.statubar);
                                if (findChildViewById != null) {
                                    i4 = R.id.title_textview;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.title_textview);
                                    if (textView != null) {
                                        i4 = R.id.viewpager;
                                        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, R.id.viewpager);
                                        if (viewPager2 != null) {
                                            return new ActivityHideAppHomeBinding((LinearLayout) view, imageView, relativeLayout, imageView2, imageView3, imageView4, imageView5, findChildViewById, textView, viewPager2);
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
    public static ActivityHideAppHomeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f16518b;
    }

    @NonNull
    public static ActivityHideAppHomeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_hide_app_home, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
