package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class MgViewForumMyHeaderViewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final View f24715b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f24716c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f24717d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f24718e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f24719f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final RelativeLayout f24720g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final RelativeLayout f24721h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f24722i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f24723j;

    private MgViewForumMyHeaderViewBinding(@NonNull View view, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull TextView textView, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull ImageView imageView4, @NonNull TextView textView2) {
        this.f24715b = view;
        this.f24716c = imageView;
        this.f24717d = imageView2;
        this.f24718e = imageView3;
        this.f24719f = textView;
        this.f24720g = relativeLayout;
        this.f24721h = relativeLayout2;
        this.f24722i = imageView4;
        this.f24723j = textView2;
    }

    @NonNull
    public static MgViewForumMyHeaderViewBinding a(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.mg_view_forum_my_header_view, viewGroup);
        return bind(viewGroup);
    }

    @NonNull
    public static MgViewForumMyHeaderViewBinding bind(@NonNull View view) {
        int i4 = R.id.arrowImage;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.arrowImage);
        if (imageView != null) {
            i4 = R.id.arrowImageCommit;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.arrowImageCommit);
            if (imageView2 != null) {
                i4 = R.id.commitImage;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.commitImage);
                if (imageView3 != null) {
                    i4 = R.id.itemTitle;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.itemTitle);
                    if (textView != null) {
                        i4 = R.id.llComment;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.llComment);
                        if (relativeLayout != null) {
                            i4 = R.id.llPost;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.llPost);
                            if (relativeLayout2 != null) {
                                i4 = R.id.messageImage;
                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.messageImage);
                                if (imageView4 != null) {
                                    i4 = R.id.unreadMessageCountBadge;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.unreadMessageCountBadge);
                                    if (textView2 != null) {
                                        return new MgViewForumMyHeaderViewBinding(view, imageView, imageView2, imageView3, textView, relativeLayout, relativeLayout2, imageView4, textView2);
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
        return this.f24715b;
    }
}
