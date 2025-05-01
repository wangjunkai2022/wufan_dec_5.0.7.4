package com.join.kotlin.zone.adapter;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseMultiItemAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.DataBindingHolder;
import com.join.android.app.component.video.MultiStandVideo;
import com.join.android.app.component.video.g;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ItemCommonZoneAdBinding;
import com.join.android.app.mgsim.wufun.databinding.ItemCommonZoneGameInfoBottomBinding;
import com.join.android.app.mgsim.wufun.databinding.ItemCommonZoneGameInfoBottomCardBinding;
import com.join.android.app.mgsim.wufun.databinding.ItemCommonZoneGameInfoBottomCardVideoBinding;
import com.join.android.app.mgsim.wufun.databinding.ItemCommonZoneGameInfoInnerBottomCardBinding;
import com.join.android.app.mgsim.wufun.databinding.ItemCommonZoneTitleBinding;
import com.join.kotlin.base.impl.OnMultiItemAdapterListenerImpl;
import com.join.kotlin.zone.model.bean.ZoneMultiEntry;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.GInfoBean;
import com.join.mgps.dto.TipBean;
import com.join.mgps.dto.TipNew;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w1.p;
/* compiled from: CommonZoneAdapter.kt */
@SourceDebugExtension({"SMAP\nCommonZoneAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonZoneAdapter.kt\ncom/join/kotlin/zone/adapter/CommonZoneAdapter\n+ 2 BaseMultiItemAdapter.kt\ncom/chad/library/adapter/base/BaseMultiItemAdapter\n*L\n1#1,219:1\n54#2:220\n54#2:221\n54#2:222\n54#2:223\n54#2:224\n54#2:225\n*S KotlinDebug\n*F\n+ 1 CommonZoneAdapter.kt\ncom/join/kotlin/zone/adapter/CommonZoneAdapter\n*L\n34#1:220\n47#1:221\n60#1:222\n84#1:223\n131#1:224\n154#1:225\n*E\n"})
/* loaded from: classes3.dex */
public final class CommonZoneAdapter extends BaseMultiItemAdapter<ZoneMultiEntry> {
    public static final int AD_PIC = 1;
    public static final int CARD_GAME_INFO_BOTTOM = 3;
    public static final int CARD_GAME_INFO_BOTTOM_VIDEO = 6;
    public static final int CARD_GAME_INFO_INNER_BOTTOM = 4;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_GAME_INFO_BOTTOM = 5;
    public static final int TITLE = 2;

    /* compiled from: CommonZoneAdapter.kt */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CommonZoneAdapter() {
        super(null, 1, null);
    }

    public final void addTags(@Nullable LinearLayout linearLayout, @Nullable List<? extends TipBean> list, @Nullable TipNew tipNew) {
        String str;
        if (linearLayout == null) {
            return;
        }
        try {
            linearLayout.removeAllViews();
            if (tipNew != null && tipNew.getModel() != null) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.rightMargin = (int) linearLayout.getContext().getResources().getDimension(R.dimen.wdp20);
                View inflate = View.inflate(linearLayout.getContext(), R.layout.item_tag_common_zone, null);
                TextView textView = (TextView) inflate.findViewById(R.id.tv_tag);
                StringBuilder sb = new StringBuilder();
                sb.append("平台: ");
                String name = tipNew.getModel().getName();
                if (name != null) {
                    str = name.toUpperCase();
                    Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toUpperCase()");
                } else {
                    str = null;
                }
                sb.append(str);
                textView.setText(sb.toString());
                linearLayout.addView(inflate, layoutParams);
            }
            if (list == null || !(!list.isEmpty())) {
                return;
            }
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.rightMargin = (int) linearLayout.getContext().getResources().getDimension(R.dimen.wdp20);
            View inflate2 = View.inflate(linearLayout.getContext(), R.layout.item_tag_common_zone, null);
            ((TextView) inflate2.findViewById(R.id.tv_tag)).setText(list.get(0).getName());
            linearLayout.addView(inflate2, layoutParams2);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public final void fillLabel(@Nullable TextView textView, @Nullable List<? extends TipBean> list, @Nullable TipNew tipNew) {
        if (textView == null) {
            return;
        }
        textView.setText(UtilsMy.N1(tipNew, list, " | "));
    }

    public CommonZoneAdapter(@Nullable final g gVar) {
        this();
        addItemType(1, DataBindingHolder.class, new OnMultiItemAdapterListenerImpl<ZoneMultiEntry, ItemCommonZoneAdBinding>() { // from class: com.join.kotlin.zone.adapter.CommonZoneAdapter.1
            @Override // com.join.kotlin.base.impl.OnMultiItemAdapterListenerImpl, com.chad.library.adapter.base.BaseMultiItemAdapter.b
            public boolean isFullSpanItem(int i4) {
                return true;
            }

            @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.b
            public void onBind(@NotNull DataBindingHolder<ItemCommonZoneAdBinding> holder, int i4, @Nullable ZoneMultiEntry zoneMultiEntry) {
                Intrinsics.checkNotNullParameter(holder, "holder");
                ItemCommonZoneAdBinding a5 = holder.a();
                if (a5 != null) {
                    a5.f(zoneMultiEntry != null ? (CommonGameInfoBean) zoneMultiEntry.dataVal() : null);
                }
            }
        }).addItemType(2, DataBindingHolder.class, new OnMultiItemAdapterListenerImpl<ZoneMultiEntry, ItemCommonZoneTitleBinding>() { // from class: com.join.kotlin.zone.adapter.CommonZoneAdapter.2
            @Override // com.join.kotlin.base.impl.OnMultiItemAdapterListenerImpl, com.chad.library.adapter.base.BaseMultiItemAdapter.b
            public boolean isFullSpanItem(int i4) {
                return true;
            }

            @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.b
            public void onBind(@NotNull DataBindingHolder<ItemCommonZoneTitleBinding> holder, int i4, @Nullable ZoneMultiEntry zoneMultiEntry) {
                Intrinsics.checkNotNullParameter(holder, "holder");
                ItemCommonZoneTitleBinding a5 = holder.a();
                if (a5 != null) {
                    a5.f(zoneMultiEntry != null ? (String) zoneMultiEntry.dataVal() : null);
                }
            }
        }).addItemType(3, DataBindingHolder.class, new OnMultiItemAdapterListenerImpl<ZoneMultiEntry, ItemCommonZoneGameInfoBottomCardBinding>() { // from class: com.join.kotlin.zone.adapter.CommonZoneAdapter.3
            {
                super(R.layout.item_common_zone_game_info_bottom_card);
            }

            @Override // com.join.kotlin.base.impl.OnMultiItemAdapterListenerImpl, com.chad.library.adapter.base.BaseMultiItemAdapter.b
            public boolean isFullSpanItem(int i4) {
                return true;
            }

            @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.b
            public void onBind(@NotNull DataBindingHolder<ItemCommonZoneGameInfoBottomCardBinding> holder, int i4, @Nullable ZoneMultiEntry zoneMultiEntry) {
                GInfoBean g_info;
                Intrinsics.checkNotNullParameter(holder, "holder");
                ItemCommonZoneGameInfoBottomCardBinding a5 = holder.a();
                if (a5 != null) {
                    CommonZoneAdapter commonZoneAdapter = CommonZoneAdapter.this;
                    a5.f(zoneMultiEntry != null ? (CommonGameInfoBean) zoneMultiEntry.dataVal() : null);
                    CommonGameInfoBean c5 = a5.c();
                    if (c5 == null || (g_info = c5.getG_info()) == null) {
                        return;
                    }
                    Intrinsics.checkNotNullExpressionValue(g_info, "g_info");
                    commonZoneAdapter.addTags(a5.f21784b, g_info.getTag_info(), g_info.getSp_tag_info());
                }
            }
        }).addItemType(6, DataBindingHolder.class, new OnMultiItemAdapterListenerImpl<ZoneMultiEntry, ItemCommonZoneGameInfoBottomCardVideoBinding>() { // from class: com.join.kotlin.zone.adapter.CommonZoneAdapter.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(R.layout.item_common_zone_game_info_bottom_card_video);
            }

            @Override // com.join.kotlin.base.impl.OnMultiItemAdapterListenerImpl, com.chad.library.adapter.base.BaseMultiItemAdapter.b
            public boolean isFullSpanItem(int i4) {
                return true;
            }

            @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.b
            public void onBind(@NotNull DataBindingHolder<ItemCommonZoneGameInfoBottomCardVideoBinding> holder, int i4, @Nullable ZoneMultiEntry zoneMultiEntry) {
                Intrinsics.checkNotNullParameter(holder, "holder");
                ItemCommonZoneGameInfoBottomCardVideoBinding a5 = holder.a();
                if (a5 != null) {
                    g gVar2 = g.this;
                    final CommonZoneAdapter commonZoneAdapter = this;
                    a5.f(zoneMultiEntry != null ? (CommonGameInfoBean) zoneMultiEntry.dataVal() : null);
                    final CommonGameInfoBean c5 = a5.c();
                    if (c5 != null) {
                        GInfoBean g_info = c5.getG_info();
                        if (g_info != null) {
                            Intrinsics.checkNotNullExpressionValue(g_info, "g_info");
                            commonZoneAdapter.addTags(a5.f21794b, g_info.getTag_info(), g_info.getSp_tag_info());
                        }
                        if (g2.i(c5.getV_url())) {
                            MultiStandVideo multiStandVideo = holder.a().f21798f;
                            Intrinsics.checkNotNullExpressionValue(multiStandVideo, "holder.binding.wfVideo");
                            if (multiStandVideo != null) {
                                multiStandVideo.g(c5.getBig_pic());
                                multiStandVideo.setPlayTag(gVar2 != null ? gVar2.p() : null);
                                multiStandVideo.setPlayPosition(c5.hashCode());
                                multiStandVideo.setUpLazy(c5.getV_url(), false, null, null, "");
                                multiStandVideo.setRotateViewAuto(false);
                                multiStandVideo.setLockLand(true);
                                multiStandVideo.setReleaseWhenLossAudio(false);
                                multiStandVideo.setShowFullAnimation(false);
                                multiStandVideo.setIsTouchWiget(false);
                                multiStandVideo.setNeedLockFull(false);
                                multiStandVideo.setVideoAllCallBack(new p() { // from class: com.join.kotlin.zone.adapter.CommonZoneAdapter$4$onBind$1$1$2
                                    @Override // w1.p, s2.h
                                    public void onClickBlank(@NotNull String s4, @NotNull Object... objects) {
                                        Intrinsics.checkNotNullParameter(s4, "s");
                                        Intrinsics.checkNotNullParameter(objects, "objects");
                                        super.onClickBlank(s4, Arrays.copyOf(objects, objects.length));
                                        IntentUtil.getInstance().intentActivity(CommonZoneAdapter.this.getContext(), c5.getIntentDataBean());
                                    }

                                    @Override // w1.p, w1.q
                                    public void onClickCover() {
                                        super.onClickCover();
                                        IntentUtil.getInstance().intentActivity(CommonZoneAdapter.this.getContext(), c5.getIntentDataBean());
                                    }
                                });
                            }
                        }
                    }
                }
            }
        }).addItemType(4, DataBindingHolder.class, new OnMultiItemAdapterListenerImpl<ZoneMultiEntry, ItemCommonZoneGameInfoInnerBottomCardBinding>() { // from class: com.join.kotlin.zone.adapter.CommonZoneAdapter.5
            {
                super(R.layout.item_common_zone_game_info_inner_bottom_card);
            }

            @Override // com.join.kotlin.base.impl.OnMultiItemAdapterListenerImpl, com.chad.library.adapter.base.BaseMultiItemAdapter.b
            public boolean isFullSpanItem(int i4) {
                return true;
            }

            @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.b
            public void onBind(@NotNull DataBindingHolder<ItemCommonZoneGameInfoInnerBottomCardBinding> holder, int i4, @Nullable ZoneMultiEntry zoneMultiEntry) {
                Intrinsics.checkNotNullParameter(holder, "holder");
                ItemCommonZoneGameInfoInnerBottomCardBinding a5 = holder.a();
                if (a5 != null) {
                    CommonZoneAdapter commonZoneAdapter = CommonZoneAdapter.this;
                    a5.f(zoneMultiEntry != null ? (CommonGameInfoBean) zoneMultiEntry.dataVal() : null);
                    CommonGameInfoBean c5 = a5.c();
                    GInfoBean g_info = c5 != null ? c5.getG_info() : null;
                    if (g_info != null) {
                        commonZoneAdapter.fillLabel(a5.f21806d, g_info.getTag_info(), g_info.getSp_tag_info());
                    }
                }
            }
        }).addItemType(5, DataBindingHolder.class, new OnMultiItemAdapterListenerImpl<ZoneMultiEntry, ItemCommonZoneGameInfoBottomBinding>() { // from class: com.join.kotlin.zone.adapter.CommonZoneAdapter.6
            {
                super(R.layout.item_common_zone_game_info_bottom);
            }

            @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.b
            public void onBind(@NotNull DataBindingHolder<ItemCommonZoneGameInfoBottomBinding> holder, int i4, @Nullable ZoneMultiEntry zoneMultiEntry) {
                Intrinsics.checkNotNullParameter(holder, "holder");
                ItemCommonZoneGameInfoBottomBinding a5 = holder.a();
                if (a5 != null) {
                    CommonZoneAdapter commonZoneAdapter = CommonZoneAdapter.this;
                    a5.f(zoneMultiEntry != null ? (CommonGameInfoBean) zoneMultiEntry.dataVal() : null);
                    CommonGameInfoBean c5 = a5.c();
                    GInfoBean g_info = c5 != null ? c5.getG_info() : null;
                    if (g_info != null) {
                        commonZoneAdapter.fillLabel(a5.f21778d, g_info.getTag_info(), g_info.getSp_tag_info());
                    }
                }
            }
        });
        onItemViewType(new BaseMultiItemAdapter.a<ZoneMultiEntry>() { // from class: com.join.kotlin.zone.adapter.CommonZoneAdapter.7
            @Override // com.chad.library.adapter.base.BaseMultiItemAdapter.a
            public int onItemViewType(int i4, @NotNull List<? extends ZoneMultiEntry> list) {
                Intrinsics.checkNotNullParameter(list, "list");
                return (list.isEmpty() || i4 == -1) ? BaseQuickAdapter.EMPTY_VIEW : list.get(i4).getViewType();
            }
        });
    }
}
