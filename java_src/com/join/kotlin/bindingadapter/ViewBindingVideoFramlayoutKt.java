package com.join.kotlin.bindingadapter;

import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.BindingAdapter;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.video.c;
import com.join.kotlin.bindingadapter.ViewBindingVideoFramlayoutKt;
import com.join.kotlin.ui.modleregin.modle.VideoModle;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.v0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ViewBindingVideoFramlayout.kt */
/* loaded from: classes3.dex */
public final class ViewBindingVideoFramlayoutKt {
    @BindingAdapter(requireAll = false, value = {"videoData", "videoHelper", "intentData"})
    public static final void loadVideoUrl(@NotNull FrameLayout frameLayout, @NotNull final VideoModle videoData, @NotNull final c videoHelper, @Nullable IntentDateBean intentDateBean) {
        Intrinsics.checkNotNullParameter(frameLayout, "frameLayout");
        Intrinsics.checkNotNullParameter(videoData, "videoData");
        Intrinsics.checkNotNullParameter(videoHelper, "videoHelper");
        String videoUrl = videoData.getVideoUrl();
        if (videoUrl == null || videoUrl.length() == 0) {
            return;
        }
        videoHelper.e(videoData.getPosition(), new c.l(videoData.getPosition(), videoData.getVideoUrl(), videoData.getVideoCover(), intentDateBean), new boolean[0]);
        videoHelper.R(videoData.getPosition(), frameLayout);
        if (intentDateBean == null) {
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: q1.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ViewBindingVideoFramlayoutKt.loadVideoUrl$lambda$0(c.this, videoData, view);
                }
            });
        }
        v0.d("MyListViewVideoHelper", "loadVideoUrl position= " + videoData.getPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadVideoUrl$lambda$0(c videoHelper, VideoModle videoData, View view) {
        Intrinsics.checkNotNullParameter(videoHelper, "$videoHelper");
        Intrinsics.checkNotNullParameter(videoData, "$videoData");
        videoHelper.F(videoData.getPosition());
    }

    @BindingAdapter(requireAll = false, value = {"setVideoTag", "videoHelper", "intentData", "loadCover"})
    public static final void setvideoTag(@NotNull final SimpleDraweeView simpleDraweeView, int i4, @Nullable c cVar, @Nullable final IntentDateBean intentDateBean, @Nullable String str) {
        Intrinsics.checkNotNullParameter(simpleDraweeView, "simpleDraweeView");
        MyImageLoader.i(simpleDraweeView, str, simpleDraweeView.getHierarchy().l());
        v0.d("MyListViewVideoHelper", "setvideoTag setVideoTag= " + i4);
        simpleDraweeView.setTag(Integer.valueOf(i4));
        if (cVar != null) {
            cVar.S(i4, simpleDraweeView);
        }
        if (intentDateBean != null) {
            simpleDraweeView.setOnClickListener(new View.OnClickListener() { // from class: q1.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ViewBindingVideoFramlayoutKt.setvideoTag$lambda$1(SimpleDraweeView.this, intentDateBean, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setvideoTag$lambda$1(SimpleDraweeView simpleDraweeView, IntentDateBean intentDateBean, View view) {
        Intrinsics.checkNotNullParameter(simpleDraweeView, "$simpleDraweeView");
        IntentUtil.getInstance().intentActivity(simpleDraweeView.getContext(), intentDateBean);
    }
}
