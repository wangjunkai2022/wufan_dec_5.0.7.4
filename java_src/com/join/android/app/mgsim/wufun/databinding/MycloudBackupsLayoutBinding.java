package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MycloudBackupsLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25361b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ListView f25362c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f25363d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f25364e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f25365f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f25366g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f25367h;

    private MycloudBackupsLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull ListView listView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f25361b = linearLayout;
        this.f25362c = listView;
        this.f25363d = imageView;
        this.f25364e = imageView2;
        this.f25365f = linearLayout2;
        this.f25366g = textView;
        this.f25367h = textView2;
    }

    @NonNull
    public static MycloudBackupsLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.backupsList;
        ListView listView = (ListView) ViewBindings.findChildViewById(view, R.id.backupsList);
        if (listView != null) {
            i4 = R.id.imageView;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView);
            if (imageView != null) {
                i4 = R.id.imageView2;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView2);
                if (imageView2 != null) {
                    i4 = R.id.startBackups;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.startBackups);
                    if (linearLayout != null) {
                        i4 = R.id.textView;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textView);
                        if (textView != null) {
                            i4 = R.id.textView2;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textView2);
                            if (textView2 != null) {
                                return new MycloudBackupsLayoutBinding((LinearLayout) view, listView, imageView, imageView2, linearLayout, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MycloudBackupsLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25361b;
    }

    @NonNull
    public static MycloudBackupsLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mycloud_backups_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
