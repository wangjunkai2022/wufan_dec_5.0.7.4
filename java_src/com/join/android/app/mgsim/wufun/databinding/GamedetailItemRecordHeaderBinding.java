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
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class GamedetailItemRecordHeaderBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f20696b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f20697c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f20698d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f20699e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f20700f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f20701g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f20702h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f20703i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f20704j;

    private GamedetailItemRecordHeaderBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f20696b = linearLayout;
        this.f20697c = linearLayout2;
        this.f20698d = textView;
        this.f20699e = imageView;
        this.f20700f = textView2;
        this.f20701g = linearLayout3;
        this.f20702h = textView3;
        this.f20703i = textView4;
        this.f20704j = textView5;
    }

    @NonNull
    public static GamedetailItemRecordHeaderBinding bind(@NonNull View view) {
        int i4 = R.id.commentHeaderLayout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.commentHeaderLayout);
        if (linearLayout != null) {
            i4 = R.id.commitCount;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.commitCount);
            if (textView != null) {
                i4 = R.id.commitImage;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.commitImage);
                if (imageView != null) {
                    i4 = R.id.commitTv;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.commitTv);
                    if (textView2 != null) {
                        i4 = R.id.layoutBottom;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layoutBottom);
                        if (linearLayout2 != null) {
                            i4 = R.id.textView53;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textView53);
                            if (textView3 != null) {
                                i4 = R.id.textView9;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.textView9);
                                if (textView4 != null) {
                                    i4 = R.id.tv_right;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_right);
                                    if (textView5 != null) {
                                        return new GamedetailItemRecordHeaderBinding((LinearLayout) view, linearLayout, textView, imageView, textView2, linearLayout2, textView3, textView4, textView5);
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
    public static GamedetailItemRecordHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f20696b;
    }

    @NonNull
    public static GamedetailItemRecordHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamedetail_item_record_header, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
