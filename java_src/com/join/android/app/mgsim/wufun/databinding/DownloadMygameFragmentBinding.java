package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DownloadMygameFragmentBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f19176b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ListView f19177c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f19178d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f19179e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final Button f19180f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f19181g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f19182h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f19183i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f19184j;

    private DownloadMygameFragmentBinding(@NonNull RelativeLayout relativeLayout, @NonNull ListView listView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView2, @NonNull TextView textView2) {
        this.f19176b = relativeLayout;
        this.f19177c = listView;
        this.f19178d = imageView;
        this.f19179e = linearLayout;
        this.f19180f = button;
        this.f19181g = textView;
        this.f19182h = linearLayout2;
        this.f19183i = imageView2;
        this.f19184j = textView2;
    }

    @NonNull
    public static DownloadMygameFragmentBinding bind(@NonNull View view) {
        int i4 = R.id.downloadListView;
        ListView listView = (ListView) ViewBindings.findChildViewById(view, R.id.downloadListView);
        if (listView != null) {
            i4 = R.id.lodingBackImage;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.lodingBackImage);
            if (imageView != null) {
                i4 = R.id.noneLayout;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.noneLayout);
                if (linearLayout != null) {
                    i4 = R.id.setNetwork;
                    Button button = (Button) ViewBindings.findChildViewById(view, R.id.setNetwork);
                    if (button != null) {
                        i4 = R.id.textView3;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textView3);
                        if (textView != null) {
                            i4 = R.id.topTip;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.topTip);
                            if (linearLayout2 != null) {
                                i4 = R.id.topTipClose;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.topTipClose);
                                if (imageView2 != null) {
                                    i4 = R.id.toptipText;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.toptipText);
                                    if (textView2 != null) {
                                        return new DownloadMygameFragmentBinding((RelativeLayout) view, listView, imageView, linearLayout, button, textView, linearLayout2, imageView2, textView2);
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
    public static DownloadMygameFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f19176b;
    }

    @NonNull
    public static DownloadMygameFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.download_mygame_fragment, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
