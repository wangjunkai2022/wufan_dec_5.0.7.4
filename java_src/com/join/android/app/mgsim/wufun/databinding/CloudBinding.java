package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class CloudBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f17923b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f17924c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ListView f17925d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f17926e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f17927f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final Button f17928g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f17929h;

    private CloudBinding(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ListView listView, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull Button button, @NonNull TextView textView2) {
        this.f17923b = frameLayout;
        this.f17924c = imageView;
        this.f17925d = listView;
        this.f17926e = relativeLayout;
        this.f17927f = textView;
        this.f17928g = button;
        this.f17929h = textView2;
    }

    @NonNull
    public static CloudBinding bind(@NonNull View view) {
        int i4 = R.id.backImage;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.backImage);
        if (imageView != null) {
            i4 = R.id.listview;
            ListView listView = (ListView) ViewBindings.findChildViewById(view, R.id.listview);
            if (listView != null) {
                i4 = R.id.relativeLayout;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.relativeLayout);
                if (relativeLayout != null) {
                    i4 = R.id.select_txt;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.select_txt);
                    if (textView != null) {
                        i4 = R.id.sub;
                        Button button = (Button) ViewBindings.findChildViewById(view, R.id.sub);
                        if (button != null) {
                            i4 = R.id.titleText;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.titleText);
                            if (textView2 != null) {
                                return new CloudBinding((FrameLayout) view, imageView, listView, relativeLayout, textView, button, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static CloudBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f17923b;
    }

    @NonNull
    public static CloudBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.cloud, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
