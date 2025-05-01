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
import com.join.mgps.customview.ScrollTextViewLayout;
import com.join.mgps.customview.XListView2;
import com.join.mgps.ptr.PtrClassicFrameLayout;
/* loaded from: classes3.dex */
public final class ActivityCollectionModuleSixBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f15777b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f15778c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f15779d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final XListView2 f15780e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f15781f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f15782g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f15783h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f15784i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f15785j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ImageView f15786k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final PtrClassicFrameLayout f15787l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final RelativeLayout f15788m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final RelativeLayout f15789n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f15790o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final ScrollTextViewLayout f15791p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final ImageView f15792q;

    private ActivityCollectionModuleSixBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull XListView2 xListView2, @NonNull RelativeLayout relativeLayout2, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull TextView textView2, @NonNull ScrollTextViewLayout scrollTextViewLayout, @NonNull ImageView imageView6) {
        this.f15777b = relativeLayout;
        this.f15778c = imageView;
        this.f15779d = textView;
        this.f15780e = xListView2;
        this.f15781f = relativeLayout2;
        this.f15782g = imageView2;
        this.f15783h = linearLayout;
        this.f15784i = imageView3;
        this.f15785j = imageView4;
        this.f15786k = imageView5;
        this.f15787l = ptrClassicFrameLayout;
        this.f15788m = relativeLayout3;
        this.f15789n = relativeLayout4;
        this.f15790o = textView2;
        this.f15791p = scrollTextViewLayout;
        this.f15792q = imageView6;
    }

    @NonNull
    public static ActivityCollectionModuleSixBinding bind(@NonNull View view) {
        int i4 = R.id.back_image_rl;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back_image_rl);
        if (imageView != null) {
            i4 = R.id.biground;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.biground);
            if (textView != null) {
                i4 = R.id.breakListView;
                XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.breakListView);
                if (xListView2 != null) {
                    i4 = R.id.downLayout;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.downLayout);
                    if (relativeLayout != null) {
                        i4 = R.id.download_bg;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.download_bg);
                        if (imageView2 != null) {
                            i4 = R.id.downloadLayout;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.downloadLayout);
                            if (linearLayout != null) {
                                i4 = R.id.downloadLine;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.downloadLine);
                                if (imageView3 != null) {
                                    i4 = R.id.hasNewFinishedGameImage;
                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.hasNewFinishedGameImage);
                                    if (imageView4 != null) {
                                        i4 = R.id.imageLoading;
                                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageLoading);
                                        if (imageView5 != null) {
                                            i4 = R.id.mPtrFrame;
                                            PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.mPtrFrame);
                                            if (ptrClassicFrameLayout != null) {
                                                RelativeLayout relativeLayout2 = (RelativeLayout) view;
                                                i4 = R.id.moduleSixTitleRl;
                                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.moduleSixTitleRl);
                                                if (relativeLayout3 != null) {
                                                    i4 = R.id.scroll_text;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.scroll_text);
                                                    if (textView2 != null) {
                                                        i4 = R.id.scroll_text_layout;
                                                        ScrollTextViewLayout scrollTextViewLayout = (ScrollTextViewLayout) ViewBindings.findChildViewById(view, R.id.scroll_text_layout);
                                                        if (scrollTextViewLayout != null) {
                                                            i4 = R.id.title_normal_search_img_rl;
                                                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.title_normal_search_img_rl);
                                                            if (imageView6 != null) {
                                                                return new ActivityCollectionModuleSixBinding(relativeLayout2, imageView, textView, xListView2, relativeLayout, imageView2, linearLayout, imageView3, imageView4, imageView5, ptrClassicFrameLayout, relativeLayout2, relativeLayout3, textView2, scrollTextViewLayout, imageView6);
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
    public static ActivityCollectionModuleSixBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f15777b;
    }

    @NonNull
    public static ActivityCollectionModuleSixBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_collection_module_six, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
