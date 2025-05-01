package com.join.kotlin.ui.cloudarchive;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.GameDetailModCloudListLayoutDatabindingBinding;
import com.join.kotlin.domain.common.LoadBindClickProxy;
import com.join.kotlin.domain.common.LoadBindindData;
import com.join.kotlin.domain.ext.EXTKt;
import com.join.kotlin.ui.cloudarchive.adapter.ModArchiveAdapter;
import com.join.kotlin.ui.cloudarchive.adapter.OnClickArchiveListener;
import com.join.kotlin.ui.cloudarchive.data.ArchiveData;
import com.join.kotlin.ui.cloudarchive.data.ArchiveDownEvent;
import com.join.kotlin.ui.cloudarchive.data.ModDataRequest;
import com.join.kotlin.ui.cloudarchive.dialog.ClickDelDialogListener;
import com.join.kotlin.ui.cloudarchive.dialog.DelArchiveDialog;
import com.join.kotlin.ui.cloudarchive.dialog.DialogData;
import com.join.kotlin.ui.cloudarchive.dialog.DownloadArchiveDialog;
import com.join.kotlin.ui.cloudarchive.dialog.ImageShowDialog;
import com.join.kotlin.ui.cloudarchive.dialog.RedownArchiveDialog;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.b0;
import com.join.mgps.Util.d0;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.join.mgps.activity.mygame.dialog.PlugDownDialogAcitivity_;
import com.join.mgps.dialog.d1;
import com.join.mgps.dto.DomainInfoBean;
import com.join.mgps.dto.ModGameArchiveTagBean;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.StandaloneCloudArchive;
import com.psk.kotlin.util.CommonListMainData;
import com.wufan.user.service.protobuf.n0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameDetailModCloudListFragment.kt */
@SourceDebugExtension({"SMAP\nGameDetailModCloudListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailModCloudListFragment.kt\ncom/join/kotlin/ui/cloudarchive/GameDetailModCloudListFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,672:1\n1#2:673\n766#3:674\n857#3,2:675\n1549#3:677\n1620#3,3:678\n*S KotlinDebug\n*F\n+ 1 GameDetailModCloudListFragment.kt\ncom/join/kotlin/ui/cloudarchive/GameDetailModCloudListFragment\n*L\n98#1:674\n98#1:675,2\n99#1:677\n99#1:678,3\n*E\n"})
/* loaded from: classes.dex */
public final class GameDetailModCloudListFragment extends Fragment implements OnClickArchiveListener, View.OnClickListener, LoadBindClickProxy {
    @NotNull
    private final Lazy adapterx$delegate;
    public ArchiveData archiveDataPop;
    @Nullable
    private ModGameArchiveTagBean archiveTag;
    @NotNull
    private final Lazy checkDownloadTypeDialog$delegate;
    public GameDetailModCloudListLayoutDatabindingBinding dataBinding;
    @NotNull
    private final Lazy delFragment$delegate;
    public TextView deleteCloud;
    @NotNull
    private final Lazy dialog$delegate;
    @NotNull
    private String gameId;
    @NotNull
    private final Lazy imageDialog$delegate;
    private boolean isLogin;
    private boolean isfirst;
    public View main;
    @Nullable
    private StandaloneCloudArchive modgameBean;
    private int page;
    @NotNull
    private final Lazy popWindow$delegate;
    public TextView reDownload;
    @NotNull
    private final Lazy redownFragment$delegate;
    public View trangleBottom;
    public View trangleTop;
    private int type;
    @NotNull
    private final Lazy viewModle$delegate;
    @NotNull
    private final Lazy viewModleShareViewModle$delegate;

    public GameDetailModCloudListFragment() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Lazy lazy5;
        Lazy lazy6;
        Lazy lazy7;
        Lazy lazy8;
        Lazy lazy9;
        lazy = LazyKt__LazyJVMKt.lazy(new Function0<ModGameCloudViewModle>() { // from class: com.join.kotlin.ui.cloudarchive.GameDetailModCloudListFragment$viewModle$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ModGameCloudViewModle invoke() {
                return (ModGameCloudViewModle) new ViewModelProvider(GameDetailModCloudListFragment.this, new ViewModelProvider.NewInstanceFactory()).get(ModGameCloudViewModle.class);
            }
        });
        this.viewModle$delegate = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new Function0<CloudShareViewModle>() { // from class: com.join.kotlin.ui.cloudarchive.GameDetailModCloudListFragment$viewModleShareViewModle$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CloudShareViewModle invoke() {
                FragmentActivity requireActivity = GameDetailModCloudListFragment.this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                return (CloudShareViewModle) new ViewModelProvider(requireActivity, new ViewModelProvider.NewInstanceFactory()).get(CloudShareViewModle.class);
            }
        });
        this.viewModleShareViewModle$delegate = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new Function0<ModArchiveAdapter>() { // from class: com.join.kotlin.ui.cloudarchive.GameDetailModCloudListFragment$adapterx$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ModArchiveAdapter invoke() {
                Context requireContext = GameDetailModCloudListFragment.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                GameDetailModCloudListFragment gameDetailModCloudListFragment = GameDetailModCloudListFragment.this;
                ModGameArchiveTagBean archiveTag = gameDetailModCloudListFragment.getArchiveTag();
                boolean z4 = true;
                if (!(archiveTag != null && archiveTag.getType() == 2)) {
                    ModGameArchiveTagBean archiveTag2 = GameDetailModCloudListFragment.this.getArchiveTag();
                    if (!Intrinsics.areEqual(archiveTag2 != null ? archiveTag2.getName() : null, "精选")) {
                        z4 = false;
                    }
                }
                return new ModArchiveAdapter(requireContext, gameDetailModCloudListFragment, z4);
            }
        });
        this.adapterx$delegate = lazy3;
        this.page = 1;
        this.type = 1;
        this.gameId = "";
        this.isfirst = true;
        lazy4 = LazyKt__LazyJVMKt.lazy(new Function0<DelArchiveDialog>() { // from class: com.join.kotlin.ui.cloudarchive.GameDetailModCloudListFragment$checkDownloadTypeDialog$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DelArchiveDialog invoke() {
                return new DelArchiveDialog();
            }
        });
        this.checkDownloadTypeDialog$delegate = lazy4;
        lazy5 = LazyKt__LazyJVMKt.lazy(new Function0<d1>() { // from class: com.join.kotlin.ui.cloudarchive.GameDetailModCloudListFragment$dialog$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final d1 invoke() {
                return b0.f0(GameDetailModCloudListFragment.this.getContext()).y(GameDetailModCloudListFragment.this.getContext(), "存档拷贝中");
            }
        });
        this.dialog$delegate = lazy5;
        lazy6 = LazyKt__LazyJVMKt.lazy(new Function0<PopupWindow>() { // from class: com.join.kotlin.ui.cloudarchive.GameDetailModCloudListFragment$popWindow$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final PopupWindow invoke() {
                return GameDetailModCloudListFragment.this.createPopwindow();
            }
        });
        this.popWindow$delegate = lazy6;
        lazy7 = LazyKt__LazyJVMKt.lazy(new Function0<ImageShowDialog>() { // from class: com.join.kotlin.ui.cloudarchive.GameDetailModCloudListFragment$imageDialog$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ImageShowDialog invoke() {
                return new ImageShowDialog(1);
            }
        });
        this.imageDialog$delegate = lazy7;
        lazy8 = LazyKt__LazyJVMKt.lazy(new Function0<DelArchiveDialog>() { // from class: com.join.kotlin.ui.cloudarchive.GameDetailModCloudListFragment$delFragment$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DelArchiveDialog invoke() {
                return new DelArchiveDialog();
            }
        });
        this.delFragment$delegate = lazy8;
        lazy9 = LazyKt__LazyJVMKt.lazy(new Function0<RedownArchiveDialog>() { // from class: com.join.kotlin.ui.cloudarchive.GameDetailModCloudListFragment$redownFragment$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final RedownArchiveDialog invoke() {
                return new RedownArchiveDialog();
            }
        });
        this.redownFragment$delegate = lazy9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$8(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void showDownloadDialog(ArchiveData archiveData, int i4) {
        DownloadArchiveDialog downloadArchiveDialog = new DownloadArchiveDialog();
        Bundle bundle = new Bundle();
        bundle.putSerializable("archive", archiveData);
        bundle.putInt(PlugDownDialogAcitivity_.DOWNLOAD_TYPE_EXTRA, i4);
        bundle.putBoolean("installInExtPlug", getViewModleShareViewModle().getInstallInExtPlug());
        bundle.putSerializable("cloud_archive_local_path", getViewModle().getCloud_archive_local_path().getValue());
        downloadArchiveDialog.setArguments(bundle);
        if (EXTKt.dialogFragmentCanShow(downloadArchiveDialog)) {
            downloadArchiveDialog.show(getChildFragmentManager(), "dialog");
        }
    }

    private final void updateLocaDataToShow() {
        long longValue;
        int collectionSizeOrDefault;
        List<CommonListMainData> value = getViewModle().getListArchive().getValue();
        if (value != null) {
            value.clear();
        }
        getAdapterx().notifyDataSetChanged();
        if (getViewModle().getLocalAllArchive().getValue() != null) {
            List<ArchiveData> value2 = getViewModle().getLocalAllArchive().getValue();
            Intrinsics.checkNotNull(value2);
            for (ArchiveData archiveData : value2) {
                archiveData.setIsDownloadArchive(1);
                archiveData.setStatus(8);
                archiveData.setShowText("启动");
                archiveData.setShowType(2);
                Long value3 = getViewModleShareViewModle().getRunIngArchiveId().getValue();
                if (value3 == null) {
                    Long l4 = 0L;
                    longValue = l4.longValue();
                } else {
                    longValue = value3.longValue();
                }
                archiveData.setRuningArchiveId(longValue);
                if (archiveData.getUid() == 0) {
                    List<CommonListMainData> value4 = getViewModle().getListArchive().getValue();
                    if (value4 != null) {
                        value4.add(new CommonListMainData(4, archiveData, null, null, 12, null));
                    }
                } else if (archiveData.getUserId() == 0 && !Intrinsics.areEqual(archiveData.getId(), "0")) {
                    List<ArchiveData> value5 = getViewModle().getLocalAllArchive().getValue();
                    if (value5 != null) {
                        ArrayList<ArchiveData> arrayList = new ArrayList();
                        for (Object obj : value5) {
                            if (((ArchiveData) obj).getUid() == 0) {
                                arrayList.add(obj);
                            }
                        }
                        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
                        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                        for (ArchiveData archiveData2 : arrayList) {
                            archiveData2.setArchiveDesc("我的默认存档");
                            arrayList2.add(Unit.INSTANCE);
                        }
                    }
                } else {
                    List<CommonListMainData> value6 = getViewModle().getListArchive().getValue();
                    if (value6 != null) {
                        value6.add(new CommonListMainData(3, archiveData, null, null, 12, null));
                    }
                }
            }
        }
        getDataBinding().f20285c.setNoMore();
        getAdapterx().notifyDataSetChanged();
        this.page = 1;
        ModDataRequest request = getViewModle().getRequest();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        request.getAllDownloedArchive(requireContext, this.page, this.gameId);
    }

    @NotNull
    public final PopupWindow createPopwindow() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.cloud_archive_more_pop, (ViewGroup) null);
        PopupWindow popupWindow = new PopupWindow(inflate);
        popupWindow.setWidth(-2);
        popupWindow.setHeight(-2);
        View findViewById = inflate.findViewById(R.id.deleteCloud);
        Intrinsics.checkNotNullExpressionValue(findViewById, "contentView.findViewById(R.id.deleteCloud)");
        setDeleteCloud((TextView) findViewById);
        View findViewById2 = inflate.findViewById(R.id.reDownload);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "contentView.findViewById(R.id.reDownload)");
        setReDownload((TextView) findViewById2);
        View findViewById3 = inflate.findViewById(R.id.main);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "contentView.findViewById(R.id.main)");
        setMain(findViewById3);
        View findViewById4 = inflate.findViewById(R.id.trangleTop);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "contentView.findViewById<View>(R.id.trangleTop)");
        setTrangleTop(findViewById4);
        View findViewById5 = inflate.findViewById(R.id.trangleBottom);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "contentView.findViewById<View>(R.id.trangleBottom)");
        setTrangleBottom(findViewById5);
        getReDownload().setOnClickListener(this);
        getDeleteCloud().setOnClickListener(this);
        return popupWindow;
    }

    @NotNull
    public final ModArchiveAdapter getAdapterx() {
        return (ModArchiveAdapter) this.adapterx$delegate.getValue();
    }

    @NotNull
    public final ArchiveData getArchiveDataPop() {
        ArchiveData archiveData = this.archiveDataPop;
        if (archiveData != null) {
            return archiveData;
        }
        Intrinsics.throwUninitializedPropertyAccessException("archiveDataPop");
        return null;
    }

    @Nullable
    public final ModGameArchiveTagBean getArchiveTag() {
        return this.archiveTag;
    }

    @NotNull
    public final DelArchiveDialog getCheckDownloadTypeDialog() {
        return (DelArchiveDialog) this.checkDownloadTypeDialog$delegate.getValue();
    }

    @NotNull
    public final GameDetailModCloudListLayoutDatabindingBinding getDataBinding() {
        GameDetailModCloudListLayoutDatabindingBinding gameDetailModCloudListLayoutDatabindingBinding = this.dataBinding;
        if (gameDetailModCloudListLayoutDatabindingBinding != null) {
            return gameDetailModCloudListLayoutDatabindingBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dataBinding");
        return null;
    }

    @NotNull
    public final DelArchiveDialog getDelFragment() {
        return (DelArchiveDialog) this.delFragment$delegate.getValue();
    }

    @NotNull
    public final TextView getDeleteCloud() {
        TextView textView = this.deleteCloud;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deleteCloud");
        return null;
    }

    @NotNull
    public final Dialog getDialog() {
        Object value = this.dialog$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-dialog>(...)");
        return (Dialog) value;
    }

    @NotNull
    public final String getGameId() {
        return this.gameId;
    }

    @NotNull
    public final ImageShowDialog getImageDialog() {
        return (ImageShowDialog) this.imageDialog$delegate.getValue();
    }

    public final boolean getIsfirst() {
        return this.isfirst;
    }

    @NotNull
    public final View getMain() {
        View view = this.main;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("main");
        return null;
    }

    @Nullable
    public final StandaloneCloudArchive getModgameBean() {
        return this.modgameBean;
    }

    public final int getPage() {
        return this.page;
    }

    @NotNull
    public final PopupWindow getPopWindow() {
        return (PopupWindow) this.popWindow$delegate.getValue();
    }

    @NotNull
    public final TextView getReDownload() {
        TextView textView = this.reDownload;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reDownload");
        return null;
    }

    @NotNull
    public final RedownArchiveDialog getRedownFragment() {
        return (RedownArchiveDialog) this.redownFragment$delegate.getValue();
    }

    @NotNull
    public final View getTrangleBottom() {
        View view = this.trangleBottom;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("trangleBottom");
        return null;
    }

    @NotNull
    public final View getTrangleTop() {
        View view = this.trangleTop;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("trangleTop");
        return null;
    }

    public final int getType() {
        return this.type;
    }

    @NotNull
    public final ModGameCloudViewModle getViewModle() {
        return (ModGameCloudViewModle) this.viewModle$delegate.getValue();
    }

    @NotNull
    public final CloudShareViewModle getViewModleShareViewModle() {
        return (CloudShareViewModle) this.viewModleShareViewModle$delegate.getValue();
    }

    public final void initData() {
        d0.a().d(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.type = arguments.getInt("type");
            String string = arguments.getString("gameId", "");
            Intrinsics.checkNotNullExpressionValue(string, "getString(\"gameId\", \"\")");
            this.gameId = string;
            Serializable serializable = arguments.getSerializable("datas");
            Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.join.mgps.dto.StandaloneCloudArchive");
            this.modgameBean = (StandaloneCloudArchive) serializable;
            this.archiveTag = (ModGameArchiveTagBean) arguments.getSerializable("tag");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("initData: ");
        ModGameArchiveTagBean modGameArchiveTagBean = this.archiveTag;
        sb.append(modGameArchiveTagBean != null ? modGameArchiveTagBean.getName() : null);
        loadData();
        getDataBinding().setLifecycleOwner(this);
        getDataBinding().setVariable(34, getViewModle());
        getDataBinding().setVariable(21, this);
        getDataBinding().f20285c.setAdapter(getAdapterx());
        getDataBinding().f20285c.getLayoutManager();
        getDataBinding().f20285c.setLoadingListener(new XRecyclerView.f() { // from class: com.join.kotlin.ui.cloudarchive.GameDetailModCloudListFragment$initData$2
            @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
            public void onLoadMore() {
                GameDetailModCloudListFragment.this.loadData();
            }

            @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
            public void onRefresh() {
                GameDetailModCloudListFragment.this.setPage(1);
                GameDetailModCloudListFragment.this.loadData();
            }
        });
        MutableLiveData<List<CommonListMainData>> listArchive = getViewModle().getListArchive();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        final Function1<List<CommonListMainData>, Unit> function1 = new Function1<List<CommonListMainData>, Unit>() { // from class: com.join.kotlin.ui.cloudarchive.GameDetailModCloudListFragment$initData$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<CommonListMainData> list) {
                invoke2(list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(List<CommonListMainData> list) {
                GameDetailModCloudListFragment.this.getAdapterx().notifyDataSetChanged();
            }
        };
        listArchive.observe(viewLifecycleOwner, new Observer() { // from class: com.join.kotlin.ui.cloudarchive.e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                GameDetailModCloudListFragment.initData$lambda$5(Function1.this, obj);
            }
        });
        MutableLiveData<ResponseModel<List<ArchiveData>>> resultData = getViewModle().getRequest().getResultData();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        final Function1<ResponseModel<List<? extends ArchiveData>>, Unit> function12 = new Function1<ResponseModel<List<? extends ArchiveData>>, Unit>() { // from class: com.join.kotlin.ui.cloudarchive.GameDetailModCloudListFragment$initData$4
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ResponseModel<List<? extends ArchiveData>> responseModel) {
                invoke2((ResponseModel<List<ArchiveData>>) responseModel);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ResponseModel<List<ArchiveData>> responseModel) {
                boolean z4 = false;
                if (responseModel != null && responseModel.getCode() == 200) {
                    GameDetailModCloudListFragment.this.getViewModle().getLoadBindData().setValue(new LoadBindindData(1));
                    List<ArchiveData> data = responseModel.getData();
                    if (responseModel.getPage() == 1) {
                        List<CommonListMainData> value = GameDetailModCloudListFragment.this.getViewModle().getListArchive().getValue();
                        if (value != null) {
                            value.clear();
                        }
                        GameDetailModCloudListFragment.this.getAdapterx().notifyDataSetChanged();
                    }
                    if (data != null && !data.isEmpty()) {
                        List<ArchiveData> value2 = GameDetailModCloudListFragment.this.getViewModle().getLocalAllArchive().getValue();
                        GameDetailModCloudListFragment gameDetailModCloudListFragment = GameDetailModCloudListFragment.this;
                        gameDetailModCloudListFragment.setPage(gameDetailModCloudListFragment.getPage() + 1);
                        GameDetailModCloudListFragment.this.getDataBinding().f20285c.loadMoreComplete();
                        for (ArchiveData archiveData : data) {
                            archiveData.setShowType(GameDetailModCloudListFragment.this.getType());
                            archiveData.setGame_id(GameDetailModCloudListFragment.this.getGameId());
                            archiveData.setIsDownloadArchive(0);
                            if (value2 != null && (!value2.isEmpty())) {
                                for (ArchiveData archiveData2 : value2) {
                                    if (Intrinsics.areEqual(archiveData2.getId(), archiveData.getId())) {
                                        archiveData.setUserId(archiveData2.getUserId());
                                        archiveData.setArchiveLocalZipPath(archiveData2.getArchiveLocalZipPath());
                                        archiveData.setIsDownloadArchive(1);
                                        archiveData.setPackageName(archiveData2.getPackageName());
                                        archiveData.setIsFirstRun(archiveData2.getIsFirstRun());
                                        archiveData.setMainArchiveLocalPath(archiveData2.getMainArchiveLocalPath());
                                        archiveData.setMainArchiveLocalPath2(archiveData2.getMainArchiveLocalPath2());
                                        archiveData.setArchiveLocalPath(archiveData2.getArchiveLocalPath());
                                        Long value3 = GameDetailModCloudListFragment.this.getViewModleShareViewModle().getRunIngArchiveId().getValue();
                                        archiveData.setRuningArchiveId(value3 == null ? 0L : value3.longValue());
                                        archiveData.setShowText("启动");
                                        archiveData.setStatus(8);
                                    }
                                }
                            }
                            if (GameDetailModCloudListFragment.this.getType() != 1 && GameDetailModCloudListFragment.this.getType() != 2) {
                                List<CommonListMainData> value4 = GameDetailModCloudListFragment.this.getViewModle().getListArchive().getValue();
                                if (value4 != null) {
                                    value4.add(new CommonListMainData(4, archiveData, null, null, 12, null));
                                }
                            } else {
                                List<CommonListMainData> value5 = GameDetailModCloudListFragment.this.getViewModle().getListArchive().getValue();
                                if (value5 != null) {
                                    value5.add(new CommonListMainData(5, archiveData, null, null, 12, null));
                                }
                            }
                        }
                        GameDetailModCloudListFragment.this.getAdapterx().notifyDataSetChanged();
                        return;
                    }
                    List<CommonListMainData> value6 = GameDetailModCloudListFragment.this.getViewModle().getListArchive().getValue();
                    if (value6 != null && value6.size() == 0) {
                        z4 = true;
                    }
                    if (z4) {
                        GameDetailModCloudListFragment.this.getViewModle().getLoadBindData().setValue(new LoadBindindData(4));
                    }
                    GameDetailModCloudListFragment.this.getDataBinding().f20285c.setNoMore();
                    return;
                }
                List<CommonListMainData> value7 = GameDetailModCloudListFragment.this.getViewModle().getListArchive().getValue();
                if (!(value7 != null && value7.size() == 0)) {
                    GameDetailModCloudListFragment.this.getViewModle().getLoadBindData().setValue(new LoadBindindData(1));
                    return;
                }
                if (responseModel != null && (responseModel.getPage() == 1 || responseModel.getPage() == 0)) {
                    List<CommonListMainData> value8 = GameDetailModCloudListFragment.this.getViewModle().getListArchive().getValue();
                    if (value8 != null) {
                        value8.clear();
                    }
                    GameDetailModCloudListFragment.this.getAdapterx().notifyDataSetChanged();
                }
                List<CommonListMainData> value9 = GameDetailModCloudListFragment.this.getViewModle().getListArchive().getValue();
                if (value9 != null && value9.size() == 0) {
                    z4 = true;
                }
                if (z4) {
                    GameDetailModCloudListFragment.this.getViewModle().getLoadBindData().setValue(new LoadBindindData(3));
                }
            }
        };
        resultData.observe(viewLifecycleOwner2, new Observer() { // from class: com.join.kotlin.ui.cloudarchive.f
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                GameDetailModCloudListFragment.initData$lambda$6(Function1.this, obj);
            }
        });
        getViewModle().getRequest().setInstallInExtPlug(getViewModleShareViewModle().getInstallInExtPlug());
        MutableLiveData<ResponseModel<List<ArchiveData>>> resultAllHasDownloadData = getViewModle().getRequest().getResultAllHasDownloadData();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        final Function1<ResponseModel<List<? extends ArchiveData>>, Unit> function13 = new Function1<ResponseModel<List<? extends ArchiveData>>, Unit>() { // from class: com.join.kotlin.ui.cloudarchive.GameDetailModCloudListFragment$initData$5
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ResponseModel<List<? extends ArchiveData>> responseModel) {
                invoke2((ResponseModel<List<ArchiveData>>) responseModel);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ResponseModel<List<ArchiveData>> responseModel) {
                int collectionSizeOrDefault;
                int collectionSizeOrDefault2;
                if (responseModel == null || responseModel.getCode() != 200) {
                    return;
                }
                List<ArchiveData> data = responseModel.getData();
                if (data != null && !data.isEmpty()) {
                    if (responseModel.getPage() == 1) {
                        GameDetailModCloudListFragment.this.setPage(1);
                        List<CommonListMainData> value = GameDetailModCloudListFragment.this.getViewModle().getListArchive().getValue();
                        if (value != null) {
                            value.clear();
                        }
                    }
                    GameDetailModCloudListFragment.this.getViewModle().getLocalAllArchive().getValue();
                    GameDetailModCloudListFragment gameDetailModCloudListFragment = GameDetailModCloudListFragment.this;
                    gameDetailModCloudListFragment.setPage(gameDetailModCloudListFragment.getPage() + 1);
                    GameDetailModCloudListFragment.this.getDataBinding().f20285c.loadMoreComplete();
                    List<ArchiveData> value2 = GameDetailModCloudListFragment.this.getViewModle().getLocalAllArchive().getValue();
                    Intrinsics.checkNotNull(value2);
                    for (ArchiveData archiveData : value2) {
                        archiveData.setIsDownloadArchive(1);
                        archiveData.setStatus(8);
                        archiveData.setShowText("启动");
                        archiveData.setShowType(2);
                        Long value3 = GameDetailModCloudListFragment.this.getViewModleShareViewModle().getRunIngArchiveId().getValue();
                        archiveData.setRuningArchiveId(value3 == null ? 0L : value3.longValue());
                        if (archiveData.getUid() == 0) {
                            archiveData.setShowType(1);
                            List<CommonListMainData> value4 = GameDetailModCloudListFragment.this.getViewModle().getListArchive().getValue();
                            if (value4 != null) {
                                value4.add(new CommonListMainData(4, archiveData, null, null, 12, null));
                            }
                        } else if (archiveData.getUserId() == 0 && !Intrinsics.areEqual(archiveData.getId(), "0")) {
                            List<ArchiveData> value5 = GameDetailModCloudListFragment.this.getViewModle().getLocalAllArchive().getValue();
                            if (value5 != null) {
                                ArrayList<ArchiveData> arrayList = new ArrayList();
                                for (Object obj : value5) {
                                    if (((ArchiveData) obj).getUid() == 0) {
                                        arrayList.add(obj);
                                    }
                                }
                                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
                                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
                                for (ArchiveData archiveData2 : arrayList) {
                                    archiveData2.setArchiveDesc("我的默认存档");
                                    arrayList2.add(Unit.INSTANCE);
                                }
                            }
                        } else {
                            List<CommonListMainData> value6 = GameDetailModCloudListFragment.this.getViewModle().getListArchive().getValue();
                            if (value6 != null) {
                                value6.add(new CommonListMainData(3, archiveData, null, null, 12, null));
                            }
                        }
                        ArrayList<ArchiveData> arrayList3 = new ArrayList();
                        for (Object obj2 : data) {
                            if (Intrinsics.areEqual(((ArchiveData) obj2).getId(), archiveData.getId())) {
                                arrayList3.add(obj2);
                            }
                        }
                        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10);
                        ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault);
                        for (ArchiveData archiveData3 : arrayList3) {
                            archiveData.setArchiveDesc(archiveData3.getArchiveDesc());
                            archiveData.setIsLike(archiveData3.getIsLike());
                            archiveData.setLikeCount(archiveData3.getLikeCount());
                            archiveData.setDownloadCount(archiveData3.getDownloadCount());
                            arrayList4.add(Unit.INSTANCE);
                        }
                    }
                    for (ArchiveData archiveData4 : data) {
                        archiveData4.setShowType(GameDetailModCloudListFragment.this.getType());
                        archiveData4.setGame_id(GameDetailModCloudListFragment.this.getGameId());
                        archiveData4.setIsDownloadArchive(0);
                        archiveData4.setPackageName(GameDetailModCloudListFragment.this.getViewModle().getPackageName());
                        List<CommonListMainData> value7 = GameDetailModCloudListFragment.this.getViewModle().getListArchive().getValue();
                        if (value7 != null) {
                            value7.add(new CommonListMainData(5, archiveData4, null, null, 12, null));
                        }
                    }
                    GameDetailModCloudListFragment.this.getAdapterx().notifyDataSetChanged();
                    return;
                }
                GameDetailModCloudListFragment.this.getDataBinding().f20285c.setNoMore();
            }
        };
        resultAllHasDownloadData.observe(viewLifecycleOwner3, new Observer() { // from class: com.join.kotlin.ui.cloudarchive.c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                GameDetailModCloudListFragment.initData$lambda$7(Function1.this, obj);
            }
        });
        getViewModle().getRequest().getDataChangeItem().observe(getViewLifecycleOwner(), new Observer<ArchiveData>() { // from class: com.join.kotlin.ui.cloudarchive.GameDetailModCloudListFragment$initData$6
            @Override // androidx.lifecycle.Observer
            public void onChanged(@Nullable ArchiveData archiveData) {
                ModGameCloudViewModle viewModle = GameDetailModCloudListFragment.this.getViewModle();
                Intrinsics.checkNotNull(archiveData);
                viewModle.onitemChanged(archiveData, GameDetailModCloudListFragment.this.getAdapterx());
            }
        });
        MutableLiveData<Long> runIngArchiveId = getViewModleShareViewModle().getRunIngArchiveId();
        FragmentActivity requireActivity = requireActivity();
        final Function1<Long, Unit> function14 = new Function1<Long, Unit>() { // from class: com.join.kotlin.ui.cloudarchive.GameDetailModCloudListFragment$initData$7
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l4) {
                invoke2(l4);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Long l4) {
                if (GameDetailModCloudListFragment.this.getType() == 2) {
                    List<CommonListMainData> value = GameDetailModCloudListFragment.this.getViewModle().getListArchive().getValue();
                    Intrinsics.checkNotNull(value);
                    for (CommonListMainData commonListMainData : value) {
                        Object any = commonListMainData.getAny();
                        Intrinsics.checkNotNull(any, "null cannot be cast to non-null type com.join.kotlin.ui.cloudarchive.data.ArchiveData");
                        Intrinsics.checkNotNull(l4);
                        ((ArchiveData) any).setRuningArchiveId(l4.longValue());
                    }
                    GameDetailModCloudListFragment.this.getViewModle().getListArchive().setValue(GameDetailModCloudListFragment.this.getViewModle().getListArchive().getValue());
                }
            }
        };
        runIngArchiveId.observe(requireActivity, new Observer() { // from class: com.join.kotlin.ui.cloudarchive.d
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                GameDetailModCloudListFragment.initData$lambda$8(Function1.this, obj);
            }
        });
        n0 accountData = AccountUtil_.getInstance_(getActivity()).getAccountData();
        Intrinsics.checkNotNullExpressionValue(accountData, "getInstance_(activity).accountData");
        this.isLogin = (g2.h(accountData.getToken()) || AccountUtil_.getInstance_(getActivity()).isTourist()) ? false : true;
    }

    public final boolean isLogin() {
        return this.isLogin;
    }

    public final void loadData() {
        getViewModle().getShowPosition().setValue(Integer.valueOf(this.type));
        int i4 = this.type;
        if (i4 != 1) {
            if (i4 == 2) {
                getViewModle().getLoadBindData().setValue(new LoadBindindData(1));
                updateLocaDataToShow();
                return;
            } else if (i4 == 3) {
                if (this.page == 1) {
                    getViewModle().getLoadBindData().setValue(new LoadBindindData(2));
                }
                ModDataRequest request = getViewModle().getRequest();
                Context requireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                request.loadMyInShop(requireContext, this.page, this.gameId);
                return;
            } else {
                return;
            }
        }
        if (this.page == 1) {
            getViewModle().getLoadBindData().setValue(new LoadBindindData(2));
        }
        ModDataRequest request2 = getViewModle().getRequest();
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext()");
        int i5 = this.page;
        String str = this.gameId;
        StandaloneCloudArchive standaloneCloudArchive = this.modgameBean;
        long last_enter_main_page_time = standaloneCloudArchive != null ? standaloneCloudArchive.getLast_enter_main_page_time() : 0L;
        ModGameArchiveTagBean modGameArchiveTagBean = this.archiveTag;
        String tagId = modGameArchiveTagBean != null ? modGameArchiveTagBean.getTagId() : null;
        ModGameArchiveTagBean modGameArchiveTagBean2 = this.archiveTag;
        request2.getModeDatas(requireContext2, i5, str, last_enter_main_page_time, tagId, modGameArchiveTagBean2 != null ? Integer.valueOf(modGameArchiveTagBean2.getType()) : null);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View view) {
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == R.id.deleteCloud) {
            getPopWindow().dismiss();
            if (this.type == 2) {
                if (Intrinsics.areEqual("我的默认存档(暂无)", getArchiveDataPop().getArchiveDesc())) {
                    l2.a(getContext()).b("删除失败：暂无默认存档");
                    return;
                } else {
                    getDelFragment().setClickDelDialogListener(new ClickDelDialogListener() { // from class: com.join.kotlin.ui.cloudarchive.GameDetailModCloudListFragment$onClick$1
                        @Override // com.join.kotlin.ui.cloudarchive.dialog.ClickDelDialogListener
                        public void onClickCancleButn() {
                            GameDetailModCloudListFragment.this.getDelFragment().dismiss();
                        }

                        @Override // com.join.kotlin.ui.cloudarchive.dialog.ClickDelDialogListener
                        public void onClickOkButn() {
                            if (Intrinsics.areEqual(GameDetailModCloudListFragment.this.getArchiveDataPop().getId(), String.valueOf(GameDetailModCloudListFragment.this.getViewModleShareViewModle().getRunIngArchiveId().getValue()))) {
                                GameDetailModCloudListFragment.this.getViewModleShareViewModle().getRunIngArchiveId().setValue(0L);
                            }
                            ModGameCloudViewModle viewModle = GameDetailModCloudListFragment.this.getViewModle();
                            FragmentActivity activity = GameDetailModCloudListFragment.this.getActivity();
                            Intrinsics.checkNotNull(activity);
                            viewModle.delMyDownloadArchive(activity, GameDetailModCloudListFragment.this.getArchiveDataPop());
                            GameDetailModCloudListFragment.this.getDelFragment().dismiss();
                        }
                    });
                    getDelFragment().setDatas(new DialogData("是否删除此存档", "", "删除", "取消", false, 16, null));
                }
            } else {
                getDelFragment().setClickDelDialogListener(new ClickDelDialogListener() { // from class: com.join.kotlin.ui.cloudarchive.GameDetailModCloudListFragment$onClick$2
                    @Override // com.join.kotlin.ui.cloudarchive.dialog.ClickDelDialogListener
                    public void onClickCancleButn() {
                        GameDetailModCloudListFragment.this.getDelFragment().dismiss();
                    }

                    @Override // com.join.kotlin.ui.cloudarchive.dialog.ClickDelDialogListener
                    public void onClickOkButn() {
                        ModGameCloudViewModle viewModle = GameDetailModCloudListFragment.this.getViewModle();
                        FragmentActivity activity = GameDetailModCloudListFragment.this.getActivity();
                        Intrinsics.checkNotNull(activity);
                        viewModle.delMyArchiveFromCloud(activity, GameDetailModCloudListFragment.this.getArchiveDataPop());
                        GameDetailModCloudListFragment.this.getDelFragment().dismiss();
                    }
                });
                if (Intrinsics.areEqual(getArchiveDataPop().getId(), "0")) {
                    getDelFragment().setDatas(new DialogData("删除本地默认存档", "删除后，本地默认存档进度将被清空，确定删除吗？", "删除", "取消", false, 16, null));
                } else {
                    getDelFragment().setDatas(new DialogData("删除社区内您发布的此存档", "注：只删除存档社区内的存档，不会影响本地默认存档", "删除", "取消", false, 16, null));
                }
            }
            DelArchiveDialog delFragment = getDelFragment();
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
            delFragment.show(childFragmentManager, "");
        }
    }

    @Override // com.join.kotlin.ui.cloudarchive.adapter.OnClickArchiveListener
    public void onClickDislike(@NotNull final ArchiveData archive) {
        Intrinsics.checkNotNullParameter(archive, "archive");
        if (!com.join.mgps.va.overmind.d.H(com.join.mgps.va.overmind.d.f54937g.d(), getViewModle().getPackageName(), 0, 2, null)) {
            getViewModleShareViewModle().getShowDownlloadDialog().setValue(1);
            return;
        }
        Context context = getContext();
        if (context != null) {
            EXTKt.checkHasLogin(context, new Function0<Unit>() { // from class: com.join.kotlin.ui.cloudarchive.GameDetailModCloudListFragment$onClickDislike$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ModGameCloudViewModle viewModle = GameDetailModCloudListFragment.this.getViewModle();
                    Context requireContext = GameDetailModCloudListFragment.this.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                    viewModle.commentArchive(requireContext, archive, "NEGATIVE", GameDetailModCloudListFragment.this.getType());
                }
            });
        }
    }

    @Override // com.join.kotlin.ui.cloudarchive.adapter.OnClickArchiveListener
    public void onClickDomain(@Nullable DomainInfoBean domainInfoBean) {
    }

    @Override // com.join.kotlin.ui.cloudarchive.adapter.OnClickArchiveListener
    public void onClickImage(@Nullable String str) {
        getImageDialog().setImageDialogPath(str);
        if (EXTKt.dialogFragmentCanShow(getImageDialog())) {
            ImageShowDialog imageDialog = getImageDialog();
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
            imageDialog.show(childFragmentManager, "imageDialog");
        }
    }

    @Override // com.join.kotlin.ui.cloudarchive.adapter.OnClickArchiveListener
    public void onClickMore(@NotNull View view, @NotNull ArchiveData archive) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(archive, "archive");
        setArchiveDataPop(archive);
        getPopWindow().setOutsideTouchable(true);
        if (getPopWindow().isShowing()) {
            getPopWindow().dismiss();
            return;
        }
        getDeleteCloud().setText("删除");
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.wdp170);
        int i4 = 2;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (this.type == 3) {
            getReDownload().setVisibility(0);
            i4 = 1;
        } else {
            getReDownload().setVisibility(8);
        }
        if (this.type == 3) {
            getReDownload().setText("编辑");
        }
        int i5 = dimensionPixelOffset / i4;
        if (iArr[1] + i5 + view.getHeight() > com.join.android.app.common.utils.n.n(getContext()).k(getActivity())) {
            getMain().setBackgroundResource(R.drawable.cloud_conner_back_5_bottom);
            getTrangleTop().setVisibility(8);
            getTrangleBottom().setVisibility(0);
            getPopWindow().showAsDropDown(view, -getResources().getDimensionPixelOffset(R.dimen.wdp115), -(((int) view.getY()) + i5 + view.getHeight()));
            return;
        }
        getMain().setBackgroundResource(R.drawable.cloud_conner_back_5);
        getTrangleTop().setVisibility(0);
        getTrangleBottom().setVisibility(8);
        getPopWindow().showAsDropDown(view, -getResources().getDimensionPixelOffset(R.dimen.wdp115), getResources().getDimensionPixelOffset(R.dimen.wdp12));
    }

    @Override // com.join.kotlin.domain.common.LoadBindClickProxy
    public void onClickReload() {
        loadData();
    }

    @Override // com.join.kotlin.ui.cloudarchive.adapter.OnClickArchiveListener
    public void onClickRun(@NotNull ArchiveData archive) {
        Intrinsics.checkNotNullParameter(archive, "archive");
    }

    @Override // com.join.kotlin.domain.common.LoadBindClickProxy
    public void onClickSetNetWork() {
        UtilsMy.w3(getContext());
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View root;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ViewDataBinding inflate = DataBindingUtil.inflate(inflater, R.layout.game_detail_mod_cloud_list_layout_databinding, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            inf…          false\n        )");
        setDataBinding((GameDetailModCloudListLayoutDatabindingBinding) inflate);
        initData();
        GameDetailModCloudListLayoutDatabindingBinding dataBinding = getDataBinding();
        if (dataBinding != null && (root = dataBinding.getRoot()) != null) {
            root.setBackgroundResource(R.drawable.alph);
        }
        return getDataBinding().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        d0.a().e(this);
    }

    @Override // com.join.kotlin.ui.cloudarchive.adapter.OnClickArchiveListener
    public void onPraise(@NotNull final ArchiveData archive) {
        Intrinsics.checkNotNullParameter(archive, "archive");
        if (!com.join.mgps.va.overmind.d.H(com.join.mgps.va.overmind.d.f54937g.d(), getViewModle().getPackageName(), 0, 2, null)) {
            getViewModleShareViewModle().getShowDownlloadDialog().setValue(1);
            return;
        }
        Context context = getContext();
        if (context != null) {
            EXTKt.checkHasLogin(context, new Function0<Unit>() { // from class: com.join.kotlin.ui.cloudarchive.GameDetailModCloudListFragment$onPraise$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ModGameCloudViewModle viewModle = GameDetailModCloudListFragment.this.getViewModle();
                    Context requireContext = GameDetailModCloudListFragment.this.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                    viewModle.commentArchive(requireContext, archive, SimpleComparison.LIKE_OPERATION, GameDetailModCloudListFragment.this.getType());
                }
            });
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onRecivedDownLoadEVent(@NotNull ArchiveDownEvent archiveDownEvent) {
        Intrinsics.checkNotNullParameter(archiveDownEvent, "archiveDownEvent");
        StringBuilder sb = new StringBuilder();
        sb.append("onRecivedDownLoadEVent: ");
        ModGameArchiveTagBean modGameArchiveTagBean = this.archiveTag;
        sb.append(modGameArchiveTagBean != null ? modGameArchiveTagBean.getName() : null);
        getViewModle().onRecivedDownLoadEVent(archiveDownEvent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        boolean z4 = true;
        this.page = 1;
        n0 accountData = AccountUtil_.getInstance_(getActivity()).getAccountData();
        Intrinsics.checkNotNullExpressionValue(accountData, "getInstance_(activity).accountData");
        z4 = (g2.h(accountData.getToken()) || AccountUtil_.getInstance_(getActivity()).isTourist()) ? false : false;
        if (z4 != this.isLogin) {
            loadData();
            this.isLogin = z4;
        }
    }

    public final void scrollToTop() {
        if (getDataBinding() == null) {
            return;
        }
        getDataBinding().f20285c.smoothScrollToPosition(0);
    }

    public final void setArchiveDataPop(@NotNull ArchiveData archiveData) {
        Intrinsics.checkNotNullParameter(archiveData, "<set-?>");
        this.archiveDataPop = archiveData;
    }

    public final void setArchiveTag(@Nullable ModGameArchiveTagBean modGameArchiveTagBean) {
        this.archiveTag = modGameArchiveTagBean;
    }

    public final void setDataBinding(@NotNull GameDetailModCloudListLayoutDatabindingBinding gameDetailModCloudListLayoutDatabindingBinding) {
        Intrinsics.checkNotNullParameter(gameDetailModCloudListLayoutDatabindingBinding, "<set-?>");
        this.dataBinding = gameDetailModCloudListLayoutDatabindingBinding;
    }

    public final void setDeleteCloud(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.deleteCloud = textView;
    }

    public final void setGameId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.gameId = str;
    }

    public final void setIsfirst(boolean z4) {
        this.isfirst = z4;
    }

    public final void setLogin(boolean z4) {
        this.isLogin = z4;
    }

    public final void setMain(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.main = view;
    }

    public final void setModgameBean(@Nullable StandaloneCloudArchive standaloneCloudArchive) {
        this.modgameBean = standaloneCloudArchive;
    }

    public final void setPage(int i4) {
        this.page = i4;
    }

    public final void setReDownload(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.reDownload = textView;
    }

    public final void setTrangleBottom(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.trangleBottom = view;
    }

    public final void setTrangleTop(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.trangleTop = view;
    }

    public final void setType(int i4) {
        this.type = i4;
    }

    @Override // com.join.kotlin.ui.cloudarchive.adapter.OnClickArchiveListener
    public void uploadCloud() {
    }
}
