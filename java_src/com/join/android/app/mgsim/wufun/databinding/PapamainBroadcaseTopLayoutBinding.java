package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class PapamainBroadcaseTopLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25685b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f25686c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25687d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f25688e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f25689f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final SimpleDraweeView f25690g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final SimpleDraweeView f25691h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f25692i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f25693j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f25694k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f25695l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f25696m;

    private PapamainBroadcaseTopLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull LinearLayout linearLayout3) {
        this.f25685b = linearLayout;
        this.f25686c = textView;
        this.f25687d = textView2;
        this.f25688e = linearLayout2;
        this.f25689f = simpleDraweeView;
        this.f25690g = simpleDraweeView2;
        this.f25691h = simpleDraweeView3;
        this.f25692i = textView3;
        this.f25693j = textView4;
        this.f25694k = textView5;
        this.f25695l = textView6;
        this.f25696m = linearLayout3;
    }

    @NonNull
    public static PapamainBroadcaseTopLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.comment;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.comment);
        if (textView != null) {
            i4 = R.id.commentNumber;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.commentNumber);
            if (textView2 != null) {
                i4 = R.id.gamebroadcastTop;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.gamebroadcastTop);
                if (linearLayout != null) {
                    i4 = R.id.gamebroadcastTopImage1;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.gamebroadcastTopImage1);
                    if (simpleDraweeView != null) {
                        i4 = R.id.gamebroadcastTopImage2;
                        SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.gamebroadcastTopImage2);
                        if (simpleDraweeView2 != null) {
                            i4 = R.id.gamebroadcastTopImage3;
                            SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.gamebroadcastTopImage3);
                            if (simpleDraweeView3 != null) {
                                i4 = R.id.gamebroadcastTopText1;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.gamebroadcastTopText1);
                                if (textView3 != null) {
                                    i4 = R.id.gamebroadcastTopText2;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.gamebroadcastTopText2);
                                    if (textView4 != null) {
                                        i4 = R.id.read;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.read);
                                        if (textView5 != null) {
                                            i4 = R.id.readNumber;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.readNumber);
                                            if (textView6 != null) {
                                                i4 = R.id.topTextLayout;
                                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.topTextLayout);
                                                if (linearLayout2 != null) {
                                                    return new PapamainBroadcaseTopLayoutBinding((LinearLayout) view, textView, textView2, linearLayout, simpleDraweeView, simpleDraweeView2, simpleDraweeView3, textView3, textView4, textView5, textView6, linearLayout2);
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
    public static PapamainBroadcaseTopLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25685b;
    }

    @NonNull
    public static PapamainBroadcaseTopLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.papamain_broadcase_top_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
