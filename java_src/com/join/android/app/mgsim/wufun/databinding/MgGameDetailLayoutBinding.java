package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgGameDetailLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f24439b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f24440c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ProgressBar f24441d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f24442e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f24443f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final RelativeLayout f24444g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final RelativeLayout f24445h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f24446i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ListView f24447j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final DetialSearchLayoutBinding f24448k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f24449l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final RelativeLayout f24450m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final View f24451n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f24452o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f24453p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final LinearLayout f24454q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final RelativeLayout f24455r;

    private MgGameDetailLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ProgressBar progressBar, @NonNull ImageView imageView2, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull TextView textView, @NonNull ListView listView, @NonNull DetialSearchLayoutBinding detialSearchLayoutBinding, @NonNull TextView textView2, @NonNull RelativeLayout relativeLayout5, @NonNull View view, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout6) {
        this.f24439b = relativeLayout;
        this.f24440c = imageView;
        this.f24441d = progressBar;
        this.f24442e = imageView2;
        this.f24443f = relativeLayout2;
        this.f24444g = relativeLayout3;
        this.f24445h = relativeLayout4;
        this.f24446i = textView;
        this.f24447j = listView;
        this.f24448k = detialSearchLayoutBinding;
        this.f24449l = textView2;
        this.f24450m = relativeLayout5;
        this.f24451n = view;
        this.f24452o = textView3;
        this.f24453p = textView4;
        this.f24454q = linearLayout;
        this.f24455r = relativeLayout6;
    }

    @NonNull
    public static MgGameDetailLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.backBtn;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.backBtn);
        if (imageView != null) {
            i4 = R.id.butnProgressBar;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.butnProgressBar);
            if (progressBar != null) {
                i4 = R.id.butn_showdownload;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.butn_showdownload);
                if (imageView2 != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    i4 = R.id.detialDownBottom;
                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.detialDownBottom);
                    if (relativeLayout2 != null) {
                        i4 = R.id.downloadRLayout2;
                        RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.downloadRLayout2);
                        if (relativeLayout3 != null) {
                            i4 = R.id.gameDescribeInit;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.gameDescribeInit);
                            if (textView != null) {
                                i4 = R.id.gameListView;
                                ListView listView = (ListView) ViewBindings.findChildViewById(view, R.id.gameListView);
                                if (listView != null) {
                                    i4 = R.id.include2;
                                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.include2);
                                    if (findChildViewById != null) {
                                        DetialSearchLayoutBinding bind = DetialSearchLayoutBinding.bind(findChildViewById);
                                        i4 = R.id.instalButtomButn;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.instalButtomButn);
                                        if (textView2 != null) {
                                            i4 = R.id.instalbutnLayout;
                                            RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.instalbutnLayout);
                                            if (relativeLayout4 != null) {
                                                i4 = R.id.linebutn;
                                                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.linebutn);
                                                if (findChildViewById2 != null) {
                                                    i4 = R.id.moneyText;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.moneyText);
                                                    if (textView3 != null) {
                                                        i4 = R.id.percent;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.percent);
                                                        if (textView4 != null) {
                                                            i4 = R.id.progress_layout;
                                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.progress_layout);
                                                            if (linearLayout != null) {
                                                                i4 = R.id.progressbarLayout;
                                                                RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.progressbarLayout);
                                                                if (relativeLayout5 != null) {
                                                                    return new MgGameDetailLayoutBinding(relativeLayout, imageView, progressBar, imageView2, relativeLayout, relativeLayout2, relativeLayout3, textView, listView, bind, textView2, relativeLayout4, findChildViewById2, textView3, textView4, linearLayout, relativeLayout5);
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
    public static MgGameDetailLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f24439b;
    }

    @NonNull
    public static MgGameDetailLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_game_detail_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
