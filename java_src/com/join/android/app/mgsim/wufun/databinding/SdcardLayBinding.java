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
public final class SdcardLayBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26312b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f26313c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ListView f26314d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26315e;

    private SdcardLayBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull ListView listView, @NonNull TextView textView) {
        this.f26312b = linearLayout;
        this.f26313c = button;
        this.f26314d = listView;
        this.f26315e = textView;
    }

    @NonNull
    public static SdcardLayBinding bind(@NonNull View view) {
        int i4 = R.id.btnParent;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnParent);
        if (button != null) {
            i4 = R.id.lvFiles;
            ListView listView = (ListView) ViewBindings.findChildViewById(view, R.id.lvFiles);
            if (listView != null) {
                i4 = R.id.tvpath;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvpath);
                if (textView != null) {
                    return new SdcardLayBinding((LinearLayout) view, button, listView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static SdcardLayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26312b;
    }

    @NonNull
    public static SdcardLayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.sdcard_lay, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
