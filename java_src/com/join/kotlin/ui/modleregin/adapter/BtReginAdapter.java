package com.join.kotlin.ui.modleregin.adapter;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.component.video.c;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.BtHrecyclerviewGamelistLayoutBinding;
import com.join.android.app.mgsim.wufun.databinding.BtViewpagerLayoutBinding;
import com.join.android.app.mgsim.wufun.databinding.DatabBtHviewlistBinding;
import com.join.android.app.mgsim.wufun.databinding.MustplayItemLayoutBinding;
import com.join.kotlin.domain.adapter.BaseDataBindingAdapter;
import com.join.kotlin.domain.common.AppListItemShowBean;
import com.join.kotlin.ui.modleregin.GameListFragment;
import com.join.kotlin.ui.modleregin.modle.BtGameListItem;
import com.join.kotlin.ui.modleregin.modle.BtOnlineGame;
import com.join.kotlin.ui.modleregin.modle.BtTagSelecterBean;
import com.join.kotlin.ui.modleregin.modle.MustplayItemBean;
import com.join.kotlin.ui.modleregin.modle.TitleModle;
import com.join.kotlin.ui.modleregin.modle.VideoModle;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.d0;
import com.join.mgps.Util.y;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.dto.BannerBean;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.ExtBean;
import com.psk.kotlin.util.CommonListMainData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: BtReginAdapter.kt */
@SourceDebugExtension({"SMAP\nBtReginAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BtReginAdapter.kt\ncom/join/kotlin/ui/modleregin/adapter/BtReginAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,244:1\n1#2:245\n1855#3,2:246\n*S KotlinDebug\n*F\n+ 1 BtReginAdapter.kt\ncom/join/kotlin/ui/modleregin/adapter/BtReginAdapter\n*L\n136#1:246,2\n*E\n"})
/* loaded from: classes3.dex */
public final class BtReginAdapter extends BaseDataBindingAdapter<CommonListMainData, ViewDataBinding> {
    @NotNull
    private AppCompatActivity context;
    @NotNull
    private final c videoHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BtReginAdapter(@NotNull AppCompatActivity context, @NotNull c videoHelper) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoHelper, "videoHelper");
        this.context = context;
        this.videoHelper = videoHelper;
    }

    @NotNull
    public final AppCompatActivity getContext() {
        return this.context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i4) {
        List<CommonListMainData> listDatas = getListDatas();
        if (listDatas == null || listDatas.isEmpty()) {
            return 999;
        }
        List<CommonListMainData> listDatas2 = getListDatas();
        Intrinsics.checkNotNull(listDatas2);
        return listDatas2.get(i4).getType();
    }

    @Override // com.join.kotlin.domain.adapter.BaseDataBindingAdapter
    protected int getLayoutResId(int i4) {
        switch (i4) {
            case 1:
                return R.layout.databinding_title_layout;
            case 2:
                return R.layout.bt_listitem;
            case 3:
            default:
                return R.layout.databinding_line_layout;
            case 4:
                return R.layout.bt_video_item_layout;
            case 5:
                return R.layout.bt_tag_recycview_layout;
            case 6:
                return R.layout.bt_viewpager_layout;
            case 7:
                return R.layout.bt_hrecyclerview_gamelist_layout;
            case 8:
                return R.layout.datab_bt_hviewlist;
        }
    }

    @NotNull
    public final c getVideoHelper() {
        return this.videoHelper;
    }

    public final void setContext(@NotNull AppCompatActivity appCompatActivity) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "<set-?>");
        this.context = appCompatActivity;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [T, java.lang.Object, com.join.kotlin.ui.modleregin.modle.TitleModle] */
    @Override // com.join.kotlin.domain.adapter.BaseDataBindingAdapter
    public void onBindItem(@NotNull final ViewDataBinding binding, @NotNull CommonListMainData item, @Nullable RecyclerView.ViewHolder viewHolder) {
        String timeShow;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(item, "item");
        switch (item.getType()) {
            case 1:
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Object any = item.getAny();
                Intrinsics.checkNotNull(any, "null cannot be cast to non-null type com.join.kotlin.ui.modleregin.modle.TitleModle");
                ?? r13 = (TitleModle) any;
                objectRef.element = r13;
                binding.setVariable(9, r13);
                binding.setVariable(7, new View.OnClickListener() { // from class: com.join.kotlin.ui.modleregin.adapter.BtReginAdapter$onBindItem$1
                    @Override // android.view.View.OnClickListener
                    public void onClick(@Nullable View view) {
                        IntentUtil.getInstance().intentActivity(ViewDataBinding.this.getRoot().getContext(), objectRef.element.getIntentDateBean());
                    }
                });
                binding.setVariable(17, ((TitleModle) objectRef.element).getShowWhiteBack());
                return;
            case 2:
                Object any2 = item.getAny();
                Intrinsics.checkNotNull(any2, "null cannot be cast to non-null type com.join.kotlin.ui.modleregin.modle.BtGameListItem");
                BtGameListItem btGameListItem = (BtGameListItem) any2;
                binding.setVariable(3, btGameListItem);
                btGameListItem.getGameInfo().setReMarks(item.getReMarks());
                if (btGameListItem.getAppitemShow() == null) {
                    btGameListItem.setAppitemShow(new AppListItemShowBean(btGameListItem.getGameInfo(), false));
                    Unit unit = Unit.INSTANCE;
                }
                AppListItemShowBean appitemShow = btGameListItem.getAppitemShow();
                if (appitemShow != null) {
                    appitemShow.updateItemNormal(btGameListItem.getGameInfo());
                }
                binding.setVariable(19, btGameListItem.getAppitemShow());
                return;
            case 3:
            default:
                return;
            case 4:
                Object any3 = item.getAny();
                Intrinsics.checkNotNull(any3, "null cannot be cast to non-null type com.join.kotlin.ui.modleregin.modle.MustplayItemBean");
                MustplayItemBean mustplayItemBean = (MustplayItemBean) any3;
                mustplayItemBean.getGameinfo().setReMarks(item.getReMarks());
                binding.setVariable(33, this.videoHelper);
                IntentDateBean intentDataBean = mustplayItemBean.getGameinfo().getIntentDataBean();
                ExtBean extBean = intentDataBean.getExtBean();
                extBean.setReMarks(item.getReMarks());
                intentDataBean.setExtBean(extBean);
                binding.setVariable(9, mustplayItemBean);
                binding.setVariable(32, new VideoModle(mustplayItemBean.getPosition(), mustplayItemBean.getGame_info_top_video_url(), intentDataBean, mustplayItemBean.getVideoCover()));
                binding.setVariable(17, mustplayItemBean.getShowWhiteBack());
                return;
            case 5:
                Object any4 = item.getAny();
                Intrinsics.checkNotNull(any4, "null cannot be cast to non-null type kotlin.collections.List<com.join.mgps.dto.BannerBean>");
                binding.setVariable(28, (List) any4);
                HTagAdapter hTagAdapter = new HTagAdapter(this.context);
                hTagAdapter.setOnItemClickListener(new Function3<Integer, BannerBean, Integer, Unit>() { // from class: com.join.kotlin.ui.modleregin.adapter.BtReginAdapter$onBindItem$4
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Integer num, BannerBean bannerBean, Integer num2) {
                        invoke(num.intValue(), bannerBean, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(int i4, @NotNull BannerBean item2, int i5) {
                        Intrinsics.checkNotNullParameter(item2, "item");
                        IntentUtil.getInstance().intentActivity(BtReginAdapter.this.getContext(), item2.getIntentDataBean());
                    }
                });
                binding.setVariable(1, hTagAdapter);
                return;
            case 6:
                BtViewpagerLayoutBinding btViewpagerLayoutBinding = (BtViewpagerLayoutBinding) binding;
                Object any5 = item.getAny();
                Intrinsics.checkNotNull(any5, "null cannot be cast to non-null type kotlin.collections.List<com.join.kotlin.ui.modleregin.modle.BtOnlineGame>");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (BtOnlineGame btOnlineGame : (List) any5) {
                    long onlineTime = btOnlineGame.getOnlineTime() * 1000;
                    List<CollectionBeanSub> gameEntityList = btOnlineGame.getGameEntityList();
                    if (!(gameEntityList == null || gameEntityList.isEmpty())) {
                        if (y.u(onlineTime)) {
                            timeShow = "今天";
                        } else {
                            long j4 = 86400000;
                            if (y.u(onlineTime - j4)) {
                                timeShow = "明天";
                            } else {
                                timeShow = y.u(j4 + onlineTime) ? "昨天" : y.y(onlineTime, "MM-dd");
                            }
                        }
                        Intrinsics.checkNotNullExpressionValue(timeShow, "timeShow");
                        arrayList.add(timeShow);
                        GameListFragment gameListFragment = new GameListFragment();
                        Bundle bundle = new Bundle();
                        bundle.putLong("time", btOnlineGame.getOnlineTime());
                        gameListFragment.setArguments(bundle);
                        arrayList2.add(gameListFragment);
                    }
                }
                binding.setVariable(11, this.context.getSupportFragmentManager());
                binding.setVariable(31, arrayList);
                binding.setVariable(12, arrayList2);
                BtViewpagerLayoutBinding btViewpagerLayoutBinding2 = (BtViewpagerLayoutBinding) binding;
                binding.setVariable(35, btViewpagerLayoutBinding2.f17656c);
                btViewpagerLayoutBinding2.f17656c.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.join.kotlin.ui.modleregin.adapter.BtReginAdapter$onBindItem$6
                    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                    public void onPageScrollStateChanged(int i4) {
                    }

                    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                    public void onPageScrolled(int i4, float f5, int i5) {
                    }

                    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                    public void onPageSelected(int i4) {
                    }
                });
                return;
            case 7:
                Object any6 = item.getAny();
                Intrinsics.checkNotNull(any6, "null cannot be cast to non-null type kotlin.collections.List<com.join.mgps.business.CollectionBeanSubBusiness>");
                binding.setVariable(28, (List) any6);
                BtHrecyclerviewGamelistLayoutBinding btHrecyclerviewGamelistLayoutBinding = (BtHrecyclerviewGamelistLayoutBinding) binding;
                if (btHrecyclerviewGamelistLayoutBinding.f17585b.getAdapter() == null) {
                    HGamelistAdapter hGamelistAdapter = new HGamelistAdapter(this.context);
                    hGamelistAdapter.setOnItemClickListener(new Function3<Integer, CollectionBeanSubBusiness, Integer, Unit>() { // from class: com.join.kotlin.ui.modleregin.adapter.BtReginAdapter$onBindItem$3
                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Integer num, CollectionBeanSubBusiness collectionBeanSubBusiness, Integer num2) {
                            invoke(num.intValue(), collectionBeanSubBusiness, num2.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(int i4, @NotNull CollectionBeanSubBusiness item2, int i5) {
                            Intrinsics.checkNotNullParameter(item2, "item");
                            IntentUtil.getInstance().intentActivity(BtReginAdapter.this.getContext(), item2.getIntentDataBean());
                        }
                    });
                    binding.setVariable(1, hGamelistAdapter);
                    return;
                }
                RecyclerView.Adapter adapter = btHrecyclerviewGamelistLayoutBinding.f17585b.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                    return;
                }
                return;
            case 8:
                DatabBtHviewlistBinding databBtHviewlistBinding = (DatabBtHviewlistBinding) binding;
                Object any7 = item.getAny();
                Intrinsics.checkNotNull(any7, "null cannot be cast to non-null type kotlin.collections.List<com.join.kotlin.ui.modleregin.modle.BtTagSelecterBean>");
                BtTaglistAdapter btTaglistAdapter = new BtTaglistAdapter(this.context);
                binding.setVariable(1, btTaglistAdapter);
                binding.setVariable(28, (List) any7);
                btTaglistAdapter.setOnItemClickListener(new Function3<Integer, BtTagSelecterBean, Integer, Unit>() { // from class: com.join.kotlin.ui.modleregin.adapter.BtReginAdapter$onBindItem$7
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Integer num, BtTagSelecterBean btTagSelecterBean, Integer num2) {
                        invoke(num.intValue(), btTagSelecterBean, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(int i4, @NotNull BtTagSelecterBean item2, int i5) {
                        Intrinsics.checkNotNullParameter(item2, "item");
                        d0.a().c(item2);
                    }
                });
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.kotlin.domain.adapter.BaseDataBindingAdapter
    public void onBindItemPayloads(@NotNull ViewDataBinding binding, @NotNull CommonListMainData item, @Nullable RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(item, "item");
        int type = item.getType();
        if (type != 2) {
            if (type != 4) {
                return;
            }
            MustplayItemLayoutBinding mustplayItemLayoutBinding = (MustplayItemLayoutBinding) binding;
            Object any = item.getAny();
            Intrinsics.checkNotNull(any, "null cannot be cast to non-null type com.join.kotlin.ui.modleregin.modle.MustplayItemBean");
            MustplayItemBean mustplayItemBean = (MustplayItemBean) any;
            mustplayItemBean.getGameinfo().setReMarks(item.getReMarks());
            mustplayItemLayoutBinding.h(mustplayItemBean);
            IntentDateBean intentDataBean = mustplayItemBean.getGameinfo().getIntentDataBean();
            ExtBean extBean = intentDataBean.getExtBean();
            extBean.setReMarks(item.getReMarks());
            intentDataBean.setExtBean(extBean);
            mustplayItemLayoutBinding.i(new VideoModle(mustplayItemBean.getPosition(), mustplayItemBean.getVideoUrl(), intentDataBean, mustplayItemBean.getVideoCover()));
            mustplayItemLayoutBinding.j(this.videoHelper);
            return;
        }
        Object any2 = item.getAny();
        Intrinsics.checkNotNull(any2, "null cannot be cast to non-null type com.join.kotlin.ui.modleregin.modle.BtGameListItem");
        BtGameListItem btGameListItem = (BtGameListItem) any2;
        btGameListItem.getGameInfo().setReMarks(item.getReMarks());
        binding.setVariable(3, btGameListItem);
        if (btGameListItem.getAppitemShow() == null) {
            btGameListItem.setAppitemShow(new AppListItemShowBean(btGameListItem.getGameInfo(), true));
            Unit unit = Unit.INSTANCE;
        }
        AppListItemShowBean appitemShow = btGameListItem.getAppitemShow();
        if (appitemShow != null) {
            DownloadTask downloadTask = btGameListItem.getGameInfo().getDownloadTask();
            Intrinsics.checkNotNullExpressionValue(downloadTask, "data.gameInfo.downloadTask");
            appitemShow.updateItemProgress(downloadTask);
        }
        binding.setVariable(19, btGameListItem.getAppitemShow());
    }
}
