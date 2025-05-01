package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.HorizontalScrollView;
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
public final class MgGamedetailTitleBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f24527b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f24528c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f24529d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f24530e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f24531f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f24532g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final Button f24533h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final SimpleDraweeView f24534i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f24535j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final HorizontalScrollView f24536k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f24537l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f24538m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final Button f24539n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final LinearLayout f24540o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f24541p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final LinearLayout f24542q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final LinearLayout f24543r;

    private MgGamedetailTitleBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull Button button, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull ImageView imageView, @NonNull HorizontalScrollView horizontalScrollView, @NonNull TextView textView5, @NonNull LinearLayout linearLayout, @NonNull Button button2, @NonNull LinearLayout linearLayout2, @NonNull TextView textView6, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4) {
        this.f24527b = relativeLayout;
        this.f24528c = textView;
        this.f24529d = textView2;
        this.f24530e = simpleDraweeView;
        this.f24531f = textView3;
        this.f24532g = textView4;
        this.f24533h = button;
        this.f24534i = simpleDraweeView2;
        this.f24535j = imageView;
        this.f24536k = horizontalScrollView;
        this.f24537l = textView5;
        this.f24538m = linearLayout;
        this.f24539n = button2;
        this.f24540o = linearLayout2;
        this.f24541p = textView6;
        this.f24542q = linearLayout3;
        this.f24543r = linearLayout4;
    }

    @NonNull
    public static MgGamedetailTitleBinding bind(@NonNull View view) {
        int i4 = R.id.appCompany;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appCompany);
        if (textView != null) {
            i4 = R.id.appDownloadCount;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.appDownloadCount);
            if (textView2 != null) {
                i4 = R.id.appIcon;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.appIcon);
                if (simpleDraweeView != null) {
                    i4 = R.id.appName;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.appName);
                    if (textView3 != null) {
                        i4 = R.id.appSize;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.appSize);
                        if (textView4 != null) {
                            i4 = R.id.gameFollowButn;
                            Button button = (Button) ViewBindings.findChildViewById(view, R.id.gameFollowButn);
                            if (button != null) {
                                i4 = R.id.gameInfoLayout;
                                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.gameInfoLayout);
                                if (simpleDraweeView2 != null) {
                                    i4 = R.id.imageView18;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView18);
                                    if (imageView != null) {
                                        i4 = R.id.scrollView;
                                        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ViewBindings.findChildViewById(view, R.id.scrollView);
                                        if (horizontalScrollView != null) {
                                            i4 = R.id.textNullToTwo;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.textNullToTwo);
                                            if (textView5 != null) {
                                                i4 = R.id.tipsLayout;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.tipsLayout);
                                                if (linearLayout != null) {
                                                    i4 = R.id.titleMoreBookButn;
                                                    Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.titleMoreBookButn);
                                                    if (button2 != null) {
                                                        i4 = R.id.titleMoreLayout;
                                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.titleMoreLayout);
                                                        if (linearLayout2 != null) {
                                                            i4 = R.id.titleMoreMessage;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.titleMoreMessage);
                                                            if (textView6 != null) {
                                                                i4 = R.id.titleMoreTip;
                                                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.titleMoreTip);
                                                                if (linearLayout3 != null) {
                                                                    i4 = R.id.titlelayout;
                                                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.titlelayout);
                                                                    if (linearLayout4 != null) {
                                                                        return new MgGamedetailTitleBinding((RelativeLayout) view, textView, textView2, simpleDraweeView, textView3, textView4, button, simpleDraweeView2, imageView, horizontalScrollView, textView5, linearLayout, button2, linearLayout2, textView6, linearLayout3, linearLayout4);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgGamedetailTitleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f24527b;
    }

    @NonNull
    public static MgGamedetailTitleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_gamedetail_title, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
