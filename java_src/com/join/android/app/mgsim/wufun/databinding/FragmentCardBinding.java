package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.HtmlTextView;
/* loaded from: classes3.dex */
public final class FragmentCardBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f19605b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f19606c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f19607d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ProgressBar f19608e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f19609f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f19610g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f19611h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f19612i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final SimpleDraweeView f19613j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ImageView f19614k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final Button f19615l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f19616m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f19617n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final LinearLayout f19618o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final RelativeLayout f19619p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final HtmlTextView f19620q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f19621r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final TextView f19622s;

    private FragmentCardBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull LinearLayout linearLayout, @NonNull ProgressBar progressBar, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView3, @NonNull Button button, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull LinearLayout linearLayout3, @NonNull RelativeLayout relativeLayout3, @NonNull HtmlTextView htmlTextView, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f19605b = relativeLayout;
        this.f19606c = relativeLayout2;
        this.f19607d = linearLayout;
        this.f19608e = progressBar;
        this.f19609f = imageView;
        this.f19610g = textView;
        this.f19611h = linearLayout2;
        this.f19612i = imageView2;
        this.f19613j = simpleDraweeView;
        this.f19614k = imageView3;
        this.f19615l = button;
        this.f19616m = textView2;
        this.f19617n = textView3;
        this.f19618o = linearLayout3;
        this.f19619p = relativeLayout3;
        this.f19620q = htmlTextView;
        this.f19621r = textView4;
        this.f19622s = textView5;
    }

    @NonNull
    public static FragmentCardBinding bind(@NonNull View view) {
        int i4 = R.id.box_card;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.box_card);
        if (relativeLayout != null) {
            i4 = R.id.box_title;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.box_title);
            if (linearLayout != null) {
                i4 = R.id.butnProgressBar;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.butnProgressBar);
                if (progressBar != null) {
                    i4 = R.id.butn_showdownload;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.butn_showdownload);
                    if (imageView != null) {
                        i4 = R.id.date_tag;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.date_tag);
                        if (textView != null) {
                            i4 = R.id.detialDownBottom;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.detialDownBottom);
                            if (linearLayout2 != null) {
                                i4 = R.id.image_bottom_edge;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.image_bottom_edge);
                                if (imageView2 != null) {
                                    i4 = R.id.image_cover;
                                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.image_cover);
                                    if (simpleDraweeView != null) {
                                        i4 = R.id.image_tag;
                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.image_tag);
                                        if (imageView3 != null) {
                                            i4 = R.id.instalButtomButn;
                                            Button button = (Button) ViewBindings.findChildViewById(view, R.id.instalButtomButn);
                                            if (button != null) {
                                                i4 = R.id.moneyText;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.moneyText);
                                                if (textView2 != null) {
                                                    i4 = R.id.percent;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.percent);
                                                    if (textView3 != null) {
                                                        i4 = R.id.progress_layout;
                                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.progress_layout);
                                                        if (linearLayout3 != null) {
                                                            i4 = R.id.progressbarLayout;
                                                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.progressbarLayout);
                                                            if (relativeLayout2 != null) {
                                                                i4 = R.id.text_digest;
                                                                HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(view, R.id.text_digest);
                                                                if (htmlTextView != null) {
                                                                    i4 = R.id.text_subtitle;
                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.text_subtitle);
                                                                    if (textView4 != null) {
                                                                        i4 = R.id.text_title;
                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.text_title);
                                                                        if (textView5 != null) {
                                                                            return new FragmentCardBinding((RelativeLayout) view, relativeLayout, linearLayout, progressBar, imageView, textView, linearLayout2, imageView2, simpleDraweeView, imageView3, button, textView2, textView3, linearLayout3, relativeLayout2, htmlTextView, textView4, textView5);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FragmentCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f19605b;
    }

    @NonNull
    public static FragmentCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_card, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
