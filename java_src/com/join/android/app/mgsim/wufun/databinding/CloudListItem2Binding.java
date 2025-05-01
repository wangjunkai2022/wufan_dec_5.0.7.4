package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.CloudDownButn;
/* loaded from: classes3.dex */
public final class CloudListItem2Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17945b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f17946c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f17947d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final CloudDownButn f17948e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f17949f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f17950g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f17951h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f17952i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f17953j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f17954k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final SimpleDraweeView f17955l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f17956m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f17957n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f17958o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f17959p;

    private CloudListItem2Binding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull CloudDownButn cloudDownButn, @NonNull TextView textView3, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull TextView textView4, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8) {
        this.f17945b = linearLayout;
        this.f17946c = textView;
        this.f17947d = textView2;
        this.f17948e = cloudDownButn;
        this.f17949f = textView3;
        this.f17950g = linearLayout2;
        this.f17951h = imageView;
        this.f17952i = linearLayout3;
        this.f17953j = linearLayout4;
        this.f17954k = textView4;
        this.f17955l = simpleDraweeView;
        this.f17956m = textView5;
        this.f17957n = textView6;
        this.f17958o = textView7;
        this.f17959p = textView8;
    }

    @NonNull
    public static CloudListItem2Binding bind(@NonNull View view) {
        int i4 = R.id.authorname;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.authorname);
        if (textView != null) {
            i4 = R.id.backUp;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.backUp);
            if (textView2 != null) {
                i4 = R.id.downButton;
                CloudDownButn cloudDownButn = (CloudDownButn) ViewBindings.findChildViewById(view, R.id.downButton);
                if (cloudDownButn != null) {
                    i4 = R.id.goodauthor;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.goodauthor);
                    if (textView3 != null) {
                        i4 = R.id.iv_more;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.iv_more);
                        if (linearLayout != null) {
                            i4 = R.id.ivgoodauthor;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ivgoodauthor);
                            if (imageView != null) {
                                i4 = R.id.ll_info;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_info);
                                if (linearLayout2 != null) {
                                    i4 = R.id.ll_vip;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_vip);
                                    if (linearLayout3 != null) {
                                        i4 = R.id.shape;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.shape);
                                        if (textView4 != null) {
                                            i4 = R.id.simv;
                                            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.simv);
                                            if (simpleDraweeView != null) {
                                                i4 = R.id.tv_evalute;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_evalute);
                                                if (textView5 != null) {
                                                    i4 = R.id.tv_name;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name);
                                                    if (textView6 != null) {
                                                        i4 = R.id.tvcouldnum;
                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvcouldnum);
                                                        if (textView7 != null) {
                                                            i4 = R.id.tvgoodpraisenum;
                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvgoodpraisenum);
                                                            if (textView8 != null) {
                                                                return new CloudListItem2Binding((LinearLayout) view, textView, textView2, cloudDownButn, textView3, linearLayout, imageView, linearLayout2, linearLayout3, textView4, simpleDraweeView, textView5, textView6, textView7, textView8);
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
    public static CloudListItem2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17945b;
    }

    @NonNull
    public static CloudListItem2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.cloud_list_item2, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
