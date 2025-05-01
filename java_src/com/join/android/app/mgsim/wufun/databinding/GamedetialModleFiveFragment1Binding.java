package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class GamedetialModleFiveFragment1Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final View f20928b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ProgressBar f20929c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f20930d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f20931e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ConstraintLayout f20932f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f20933g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f20934h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f20935i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f20936j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final RelativeLayout f20937k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final RelativeLayout f20938l;

    private GamedetialModleFiveFragment1Binding(@NonNull View view, @NonNull ProgressBar progressBar, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView2, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2) {
        this.f20928b = view;
        this.f20929c = progressBar;
        this.f20930d = imageView;
        this.f20931e = textView;
        this.f20932f = constraintLayout;
        this.f20933g = imageView2;
        this.f20934h = textView2;
        this.f20935i = textView3;
        this.f20936j = linearLayout;
        this.f20937k = relativeLayout;
        this.f20938l = relativeLayout2;
    }

    @NonNull
    public static GamedetialModleFiveFragment1Binding a(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.gamedetial_modle_five_fragment1, viewGroup);
        return bind(viewGroup);
    }

    @NonNull
    public static GamedetialModleFiveFragment1Binding bind(@NonNull View view) {
        int i4 = R.id.butnProgressBar;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.butnProgressBar);
        if (progressBar != null) {
            i4 = R.id.butn_showdownload;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.butn_showdownload);
            if (imageView != null) {
                i4 = R.id.instalButtomButn;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.instalButtomButn);
                if (textView != null) {
                    i4 = R.id.instalbutnLayout;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.instalbutnLayout);
                    if (constraintLayout != null) {
                        i4 = R.id.ivGameResource;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ivGameResource);
                        if (imageView2 != null) {
                            i4 = R.id.moneyText;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.moneyText);
                            if (textView2 != null) {
                                i4 = R.id.percent;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.percent);
                                if (textView3 != null) {
                                    i4 = R.id.progress_layout;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.progress_layout);
                                    if (linearLayout != null) {
                                        i4 = R.id.progressbarLayout;
                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.progressbarLayout);
                                        if (relativeLayout != null) {
                                            i4 = R.id.rlNormalDownload;
                                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rlNormalDownload);
                                            if (relativeLayout2 != null) {
                                                return new GamedetialModleFiveFragment1Binding(view, progressBar, imageView, textView, constraintLayout, imageView2, textView2, textView3, linearLayout, relativeLayout, relativeLayout2);
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

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f20928b;
    }
}
