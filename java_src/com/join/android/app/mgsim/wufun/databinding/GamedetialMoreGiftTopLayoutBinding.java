package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class GamedetialMoreGiftTopLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21077b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21078c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f21079d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f21080e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f21081f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f21082g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final Button f21083h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final View f21084i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f21085j;

    private GamedetialMoreGiftTopLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull Button button, @NonNull View view, @NonNull LinearLayout linearLayout2) {
        this.f21077b = linearLayout;
        this.f21078c = textView;
        this.f21079d = textView2;
        this.f21080e = simpleDraweeView;
        this.f21081f = textView3;
        this.f21082g = textView4;
        this.f21083h = button;
        this.f21084i = view;
        this.f21085j = linearLayout2;
    }

    @NonNull
    public static GamedetialMoreGiftTopLayoutBinding bind(@NonNull View view) {
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
                                i4 = R.id.line;
                                View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
                                if (findChildViewById != null) {
                                    i4 = R.id.tipsLayout;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.tipsLayout);
                                    if (linearLayout != null) {
                                        return new GamedetialMoreGiftTopLayoutBinding((LinearLayout) view, textView, textView2, simpleDraweeView, textView3, textView4, button, findChildViewById, linearLayout);
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
    public static GamedetialMoreGiftTopLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21077b;
    }

    @NonNull
    public static GamedetialMoreGiftTopLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamedetial_more_gift_top_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
