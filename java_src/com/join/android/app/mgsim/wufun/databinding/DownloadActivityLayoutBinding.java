package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DownloadActivityLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19126b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f19127c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f19128d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ListView f19129e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f19130f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f19131g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f19132h;

    private DownloadActivityLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull Button button2, @NonNull ListView listView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f19126b = linearLayout;
        this.f19127c = button;
        this.f19128d = button2;
        this.f19129e = listView;
        this.f19130f = textView;
        this.f19131g = textView2;
        this.f19132h = textView3;
    }

    @NonNull
    public static DownloadActivityLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.btnAllDownloaded;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnAllDownloaded);
        if (button != null) {
            i4 = R.id.btnDownload;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.btnDownload);
            if (button2 != null) {
                i4 = R.id.listView;
                ListView listView = (ListView) ViewBindings.findChildViewById(view, R.id.listView);
                if (listView != null) {
                    i4 = R.id.txtDownloadedList;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txtDownloadedList);
                    if (textView != null) {
                        i4 = R.id.txtIndicator;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txtIndicator);
                        if (textView2 != null) {
                            i4 = R.id.txtStatus;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txtStatus);
                            if (textView3 != null) {
                                return new DownloadActivityLayoutBinding((LinearLayout) view, button, button2, listView, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DownloadActivityLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19126b;
    }

    @NonNull
    public static DownloadActivityLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.download_activity_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
