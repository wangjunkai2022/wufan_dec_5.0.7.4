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
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.GameDetailEmusCloudListLayoutDatabindingBinding;
import com.join.kotlin.domain.common.LoadBindClickProxy;
import com.join.kotlin.domain.common.LoadBindindData;
import com.join.kotlin.domain.ext.EXTKt;
import com.join.kotlin.ui.cloudarchive.adapter.EmusArchiveAdapter;
import com.join.kotlin.ui.cloudarchive.adapter.OnEmusClickArchiveListener;
import com.join.kotlin.ui.cloudarchive.data.ArchiveDownEvent;
import com.join.kotlin.ui.cloudarchive.data.EmusDataRequest;
import com.join.kotlin.ui.cloudarchive.dialog.DelArchiveDialog;
import com.join.kotlin.ui.cloudarchive.dialog.ImageShowDialog;
import com.join.kotlin.ui.cloudarchive.dialog.RedownArchiveDialog;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.b0;
import com.join.mgps.Util.d0;
import com.join.mgps.Util.g2;
import com.join.mgps.dialog.d1;
import com.join.mgps.dto.ArchiveShopDataBean;
import com.join.mgps.dto.CloudListDataBean;
import com.join.mgps.dto.GamedetialModleFourBean;
import com.join.mgps.dto.ModGameArchiveTagBean;
import com.join.mgps.dto.StandaloneCloudArchive;
import com.wufan.user.service.protobuf.n0;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameDetailEmusCloudListFragment.kt */
/* loaded from: classes.dex */
public final class GameDetailEmusCloudListFragment extends Fragment implements OnEmusClickArchiveListener, View.OnClickListener, LoadBindClickProxy {
    @NotNull
    private final Lazy adapterx$delegate;
    public CloudListDataBean archiveDataPop;
    @Nullable
    private ModGameArchiveTagBean archiveTag;
    public GameDetailEmusCloudListLayoutDatabindingBinding dataBinding;
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
    @Nullable
    private IOnRunListener mListener;
    public View main;
    @Nullable
    private StandaloneCloudArchive modgameBean;
    @Nullable
    private GamedetialModleFourBean modleFourBean;
    private int page;
    @NotNull
    private final Lazy popWindow$delegate;
    public TextView reDownload;
    @NotNull
    private final Lazy redownFragment$delegate;
    public View trangleBottom;
    public View trangleTop;
    @NotNull
    private final Lazy viewModle$delegate;
    @NotNull
    private final Lazy viewModleShareViewModle$delegate;

    public GameDetailEmusCloudListFragment() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Lazy lazy5;
        Lazy lazy6;
        Lazy lazy7;
        Lazy lazy8;
        lazy = LazyKt__LazyJVMKt.lazy(new Function0<GameDetailEmusCloudViewModle>() { // from class: com.join.kotlin.ui.cloudarchive.GameDetailEmusCloudListFragment$viewModle$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GameDetailEmusCloudViewModle invoke() {
                return (GameDetailEmusCloudViewModle) new ViewModelProvider(GameDetailEmusCloudListFragment.this, new ViewModelProvider.NewInstanceFactory()).get(GameDetailEmusCloudViewModle.class);
            }
        });
        this.viewModle$delegate = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new Function0<CloudShareViewModle>() { // from class: com.join.kotlin.ui.cloudarchive.GameDetailEmusCloudListFragment$viewModleShareViewModle$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CloudShareViewModle invoke() {
                FragmentActivity requireActivity = GameDetailEmusCloudListFragment.this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                return (CloudShareViewModle) new ViewModelProvider(requireActivity, new ViewModelProvider.NewInstanceFactory()).get(CloudShareViewModle.class);
            }
        });
        this.viewModleShareViewModle$delegate = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new Function0<EmusArchiveAdapter>() { // from class: com.join.kotlin.ui.cloudarchive.GameDetailEmusCloudListFragment$adapterx$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final EmusArchiveAdapter invoke() {
                Context requireContext = GameDetailEmusCloudListFragment.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                return new EmusArchiveAdapter(requireContext, GameDetailEmusCloudListFragment.this);
            }
        });
        this.adapterx$delegate = lazy3;
        this.page = 1;
        this.gameId = "";
        this.isfirst = true;
        lazy4 = LazyKt__LazyJVMKt.lazy(new Function0<d1>() { // from class: com.join.kotlin.ui.cloudarchive.GameDetailEmusCloudListFragment$dialog$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final d1 invoke() {
                return b0.f0(GameDetailEmusCloudListFragment.this.getContext()).y(GameDetailEmusCloudListFragment.this.getContext(), "存档拷贝中");
            }
        });
        this.dialog$delegate = lazy4;
        lazy5 = LazyKt__LazyJVMKt.lazy(new Function0<PopupWindow>() { // from class: com.join.kotlin.ui.cloudarchive.GameDetailEmusCloudListFragment$popWindow$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final PopupWindow invoke() {
                return GameDetailEmusCloudListFragment.this.createPopwindow();
            }
        });
        this.popWindow$delegate = lazy5;
        lazy6 = LazyKt__LazyJVMKt.lazy(new Function0<ImageShowDialog>() { // from class: com.join.kotlin.ui.cloudarchive.GameDetailEmusCloudListFragment$imageDialog$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ImageShowDialog invoke() {
                return new ImageShowDialog(1);
            }
        });
        this.imageDialog$delegate = lazy6;
        lazy7 = LazyKt__LazyJVMKt.lazy(new Function0<DelArchiveDialog>() { // from class: com.join.kotlin.ui.cloudarchive.GameDetailEmusCloudListFragment$delFragment$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DelArchiveDialog invoke() {
                return new DelArchiveDialog();
            }
        });
        this.delFragment$delegate = lazy7;
        lazy8 = LazyKt__LazyJVMKt.lazy(new Function0<RedownArchiveDialog>() { // from class: com.join.kotlin.ui.cloudarchive.GameDetailEmusCloudListFragment$redownFragment$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final RedownArchiveDialog invoke() {
                return new RedownArchiveDialog();
            }
        });
        this.redownFragment$delegate = lazy8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
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
    public final EmusArchiveAdapter getAdapterx() {
        return (EmusArchiveAdapter) this.adapterx$delegate.getValue();
    }

    @NotNull
    public final CloudListDataBean getArchiveDataPop() {
        CloudListDataBean cloudListDataBean = this.archiveDataPop;
        if (cloudListDataBean != null) {
            return cloudListDataBean;
        }
        Intrinsics.throwUninitializedPropertyAccessException("archiveDataPop");
        return null;
    }

    @Nullable
    public final ModGameArchiveTagBean getArchiveTag() {
        return this.archiveTag;
    }

    @NotNull
    public final GameDetailEmusCloudListLayoutDatabindingBinding getDataBinding() {
        GameDetailEmusCloudListLayoutDatabindingBinding gameDetailEmusCloudListLayoutDatabindingBinding = this.dataBinding;
        if (gameDetailEmusCloudListLayoutDatabindingBinding != null) {
            return gameDetailEmusCloudListLayoutDatabindingBinding;
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

    @Nullable
    public final IOnRunListener getMListener() {
        return this.mListener;
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

    @Nullable
    public final GamedetialModleFourBean getModleFourBean() {
        return this.modleFourBean;
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

    @NotNull
    public final GameDetailEmusCloudViewModle getViewModle() {
        return (GameDetailEmusCloudViewModle) this.viewModle$delegate.getValue();
    }

    @NotNull
    public final CloudShareViewModle getViewModleShareViewModle() {
        return (CloudShareViewModle) this.viewModleShareViewModle$delegate.getValue();
    }

    public final void initData() {
        d0.a().d(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("gameId", "");
            Intrinsics.checkNotNullExpressionValue(string, "getString(\"gameId\", \"\")");
            this.gameId = string;
            String string2 = arguments.getString("modleFourBean");
            if (g2.i(string2)) {
                this.modleFourBean = (GamedetialModleFourBean) JsonMapper.getInstance().fromJson(string2, GamedetialModleFourBean.class);
            }
        }
        loadData();
        getDataBinding().setLifecycleOwner(this);
        getDataBinding().setVariable(34, getViewModle());
        getDataBinding().setVariable(21, this);
        getDataBinding().f20251c.setAdapter(getAdapterx());
        getDataBinding().f20251c.getLayoutManager();
        getDataBinding().f20251c.setLoadingListener(new XRecyclerView.f() { // from class: com.join.kotlin.ui.cloudarchive.GameDetailEmusCloudListFragment$initData$2
            @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
            public void onLoadMore() {
                GameDetailEmusCloudListFragment.this.loadData();
            }

            @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
            public void onRefresh() {
                GameDetailEmusCloudListFragment.this.setPage(1);
                GameDetailEmusCloudListFragment.this.loadData();
            }
        });
        MutableLiveData<List<CloudListDataBean>> listArchive = getViewModle().getListArchive();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        final Function1<List<CloudListDataBean>, Unit> function1 = new Function1<List<CloudListDataBean>, Unit>() { // from class: com.join.kotlin.ui.cloudarchive.GameDetailEmusCloudListFragment$initData$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<CloudListDataBean> list) {
                invoke2(list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(List<CloudListDataBean> list) {
                GameDetailEmusCloudListFragment.this.getAdapterx().notifyDataSetChanged();
            }
        };
        listArchive.observe(viewLifecycleOwner, new Observer() { // from class: com.join.kotlin.ui.cloudarchive.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                GameDetailEmusCloudListFragment.initData$lambda$1(Function1.this, obj);
            }
        });
        MutableLiveData<ArchiveShopDataBean> resultData = getViewModle().getRequest().getResultData();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        final Function1<ArchiveShopDataBean, Unit> function12 = new Function1<ArchiveShopDataBean, Unit>() { // from class: com.join.kotlin.ui.cloudarchive.GameDetailEmusCloudListFragment$initData$4
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ArchiveShopDataBean archiveShopDataBean) {
                invoke2(archiveShopDataBean);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ArchiveShopDataBean archiveShopDataBean) {
                boolean z4 = false;
                if (archiveShopDataBean != null && archiveShopDataBean.getCode() == 600) {
                    GameDetailEmusCloudListFragment.this.getViewModle().getLoadBindData().setValue(new LoadBindindData(1));
                    ArchiveShopDataBean.DataInfoBean data_info = archiveShopDataBean.getData_info();
                    if (archiveShopDataBean.getData_info().getPn() == 1) {
                        List<CloudListDataBean> value = GameDetailEmusCloudListFragment.this.getViewModle().getListArchive().getValue();
                        if (value != null) {
                            value.clear();
                        }
                        GameDetailEmusCloudListFragment.this.getAdapterx().notifyDataSetChanged();
                    }
                    if (data_info != null && !data_info.getMarketList().isEmpty()) {
                        GameDetailEmusCloudListFragment gameDetailEmusCloudListFragment = GameDetailEmusCloudListFragment.this;
                        gameDetailEmusCloudListFragment.setPage(gameDetailEmusCloudListFragment.getPage() + 1);
                        GameDetailEmusCloudListFragment.this.getDataBinding().f20251c.loadMoreComplete();
                        List<CloudListDataBean> value2 = GameDetailEmusCloudListFragment.this.getViewModle().getListArchive().getValue();
                        if (value2 != null) {
                            List<CloudListDataBean> marketList = archiveShopDataBean.getData_info().getMarketList();
                            Intrinsics.checkNotNullExpressionValue(marketList, "it.data_info.marketList");
                            value2.addAll(marketList);
                        }
                        GameDetailEmusCloudListFragment.this.getAdapterx().notifyDataSetChanged();
                        return;
                    }
                    List<CloudListDataBean> value3 = GameDetailEmusCloudListFragment.this.getViewModle().getListArchive().getValue();
                    if (value3 != null && value3.size() == 0) {
                        z4 = true;
                    }
                    if (z4) {
                        GameDetailEmusCloudListFragment.this.getViewModle().getLoadBindData().setValue(new LoadBindindData(4));
                    }
                    GameDetailEmusCloudListFragment.this.getDataBinding().f20251c.setNoMore();
                    return;
                }
                List<CloudListDataBean> value4 = GameDetailEmusCloudListFragment.this.getViewModle().getListArchive().getValue();
                if (!(value4 != null && value4.size() == 0)) {
                    GameDetailEmusCloudListFragment.this.getViewModle().getLoadBindData().setValue(new LoadBindindData(1));
                    return;
                }
                if (archiveShopDataBean != null && (archiveShopDataBean.getData_info() == null || archiveShopDataBean.getData_info().getPn() == 1 || archiveShopDataBean.getData_info().getPn() == 0)) {
                    List<CloudListDataBean> value5 = GameDetailEmusCloudListFragment.this.getViewModle().getListArchive().getValue();
                    if (value5 != null) {
                        value5.clear();
                    }
                    GameDetailEmusCloudListFragment.this.getAdapterx().notifyDataSetChanged();
                }
                List<CloudListDataBean> value6 = GameDetailEmusCloudListFragment.this.getViewModle().getListArchive().getValue();
                if (value6 != null && value6.size() == 0) {
                    z4 = true;
                }
                if (z4) {
                    GameDetailEmusCloudListFragment.this.getViewModle().getLoadBindData().setValue(new LoadBindindData(3));
                }
            }
        };
        resultData.observe(viewLifecycleOwner2, new Observer() { // from class: com.join.kotlin.ui.cloudarchive.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                GameDetailEmusCloudListFragment.initData$lambda$2(Function1.this, obj);
            }
        });
        getViewModle().getRequest().setInstallInExtPlug(getViewModleShareViewModle().getInstallInExtPlug());
        getViewModle().getRequest().getDataChangeItem().observe(getViewLifecycleOwner(), new Observer<CloudListDataBean>() { // from class: com.join.kotlin.ui.cloudarchive.GameDetailEmusCloudListFragment$initData$5
            @Override // androidx.lifecycle.Observer
            public void onChanged(@Nullable CloudListDataBean cloudListDataBean) {
                GameDetailEmusCloudViewModle viewModle = GameDetailEmusCloudListFragment.this.getViewModle();
                Intrinsics.checkNotNull(cloudListDataBean);
                viewModle.onitemChanged(cloudListDataBean, GameDetailEmusCloudListFragment.this.getAdapterx());
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
        if (this.page == 1) {
            getViewModle().getLoadBindData().setValue(new LoadBindindData(2));
        }
        EmusDataRequest request = getViewModle().getRequest();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        request.getModeDatas(requireContext, this.page, this.gameId);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View view) {
    }

    @Override // com.join.kotlin.ui.cloudarchive.adapter.OnEmusClickArchiveListener
    public void onClickDislike(@NotNull CloudListDataBean archive) {
        Intrinsics.checkNotNullParameter(archive, "archive");
    }

    @Override // com.join.kotlin.ui.cloudarchive.adapter.OnEmusClickArchiveListener
    public void onClickImage(@Nullable String str) {
        getImageDialog().setImageDialogPath(str);
        if (EXTKt.dialogFragmentCanShow(getImageDialog())) {
            ImageShowDialog imageDialog = getImageDialog();
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
            imageDialog.show(childFragmentManager, "imageDialog");
        }
    }

    @Override // com.join.kotlin.ui.cloudarchive.adapter.OnEmusClickArchiveListener
    public void onClickMore(@NotNull View view, @NotNull CloudListDataBean archive) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(archive, "archive");
        setArchiveDataPop(archive);
        getPopWindow().setOutsideTouchable(true);
        if (getPopWindow().isShowing()) {
            getPopWindow().dismiss();
        } else {
            getDeleteCloud().setText("删除");
        }
    }

    @Override // com.join.kotlin.domain.common.LoadBindClickProxy
    public void onClickReload() {
        loadData();
    }

    @Override // com.join.kotlin.ui.cloudarchive.adapter.OnEmusClickArchiveListener
    public void onClickRun(@NotNull CloudListDataBean archive) {
        Intrinsics.checkNotNullParameter(archive, "archive");
        IOnRunListener iOnRunListener = this.mListener;
        if (iOnRunListener != null) {
            Intrinsics.checkNotNull(iOnRunListener);
            iOnRunListener.onRun();
        }
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
        ViewDataBinding inflate = DataBindingUtil.inflate(inflater, R.layout.game_detail_emus_cloud_list_layout_databinding, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            inf…          false\n        )");
        setDataBinding((GameDetailEmusCloudListLayoutDatabindingBinding) inflate);
        initData();
        GameDetailEmusCloudListLayoutDatabindingBinding dataBinding = getDataBinding();
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

    @Override // com.join.kotlin.ui.cloudarchive.adapter.OnEmusClickArchiveListener
    public void onPraise(@NotNull CloudListDataBean archive) {
        Intrinsics.checkNotNullParameter(archive, "archive");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onRecivedDownLoadEVent(@NotNull ArchiveDownEvent archiveDownEvent) {
        Intrinsics.checkNotNullParameter(archiveDownEvent, "archiveDownEvent");
        StringBuilder sb = new StringBuilder();
        sb.append("onRecivedDownLoadEVent: ");
        ModGameArchiveTagBean modGameArchiveTagBean = this.archiveTag;
        sb.append(modGameArchiveTagBean != null ? modGameArchiveTagBean.getName() : null);
    }

    public final void scrollToTop() {
        if (getDataBinding() == null) {
            return;
        }
        getDataBinding().f20251c.smoothScrollToPosition(0);
    }

    public final void setArchiveDataPop(@NotNull CloudListDataBean cloudListDataBean) {
        Intrinsics.checkNotNullParameter(cloudListDataBean, "<set-?>");
        this.archiveDataPop = cloudListDataBean;
    }

    public final void setArchiveTag(@Nullable ModGameArchiveTagBean modGameArchiveTagBean) {
        this.archiveTag = modGameArchiveTagBean;
    }

    public final void setDataBinding(@NotNull GameDetailEmusCloudListLayoutDatabindingBinding gameDetailEmusCloudListLayoutDatabindingBinding) {
        Intrinsics.checkNotNullParameter(gameDetailEmusCloudListLayoutDatabindingBinding, "<set-?>");
        this.dataBinding = gameDetailEmusCloudListLayoutDatabindingBinding;
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

    public final void setMListener(@Nullable IOnRunListener iOnRunListener) {
        this.mListener = iOnRunListener;
    }

    public final void setMain(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.main = view;
    }

    public final void setModgameBean(@Nullable StandaloneCloudArchive standaloneCloudArchive) {
        this.modgameBean = standaloneCloudArchive;
    }

    public final void setModleFourBean(@Nullable GamedetialModleFourBean gamedetialModleFourBean) {
        this.modleFourBean = gamedetialModleFourBean;
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

    @Override // com.join.kotlin.ui.cloudarchive.adapter.OnEmusClickArchiveListener
    public void uploadCloud() {
    }
}
