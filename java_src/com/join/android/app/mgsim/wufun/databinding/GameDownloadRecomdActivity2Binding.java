package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class GameDownloadRecomdActivity2Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f20350b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f20351c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f20352d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ConstraintLayout f20353e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f20354f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f20355g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f20356h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f20357i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f20358j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f20359k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f20360l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f20361m;

    private GameDownloadRecomdActivity2Binding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f20350b = linearLayout;
        this.f20351c = imageView;
        this.f20352d = textView;
        this.f20353e = constraintLayout;
        this.f20354f = simpleDraweeView;
        this.f20355g = imageView2;
        this.f20356h = linearLayout2;
        this.f20357i = textView2;
        this.f20358j = linearLayout3;
        this.f20359k = textView3;
        this.f20360l = textView4;
        this.f20361m = textView5;
    }

    @NonNull
    public static GameDownloadRecomdActivity2Binding bind(@NonNull View view) {
        int i4 = R.id.close2;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.close2);
        if (imageView != null) {
            i4 = R.id.downNumber;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.downNumber);
            if (textView != null) {
                i4 = R.id.downloadAcc;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.downloadAcc);
                if (constraintLayout != null) {
                    i4 = R.id.icon;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.icon);
                    if (simpleDraweeView != null) {
                        i4 = R.id.imageView56;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView56);
                        if (imageView2 != null) {
                            LinearLayout linearLayout = (LinearLayout) view;
                            i4 = R.id.seetext;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.seetext);
                            if (textView2 != null) {
                                i4 = R.id.speedLayout;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.speedLayout);
                                if (linearLayout2 != null) {
                                    i4 = R.id.table1;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.table1);
                                    if (textView3 != null) {
                                        i4 = R.id.table2;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.table2);
                                        if (textView4 != null) {
                                            i4 = R.id.tip;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tip);
                                            if (textView5 != null) {
                                                return new GameDownloadRecomdActivity2Binding(linearLayout, imageView, textView, constraintLayout, simpleDraweeView, imageView2, linearLayout, textView2, linearLayout2, textView3, textView4, textView5);
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
    public static GameDownloadRecomdActivity2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f20350b;
    }

    @NonNull
    public static GameDownloadRecomdActivity2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.game_download_recomd_activity2, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
