package com.join.kotlin.ui.cloudarchive;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
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
import com.MApplication;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.RecyclerviewLayoutDatabindingBinding;
import com.join.kotlin.domain.common.LiveDataExtensionKt;
import com.join.kotlin.domain.common.LoadBindClickProxy;
import com.join.kotlin.domain.common.LoadBindindData;
import com.join.kotlin.domain.ext.EXTKt;
import com.join.kotlin.ui.cloudarchive.CloudShareViewModle;
import com.join.kotlin.ui.cloudarchive.adapter.ModArchiveAdapter;
import com.join.kotlin.ui.cloudarchive.adapter.OnClickArchiveListener;
import com.join.kotlin.ui.cloudarchive.data.ArchiveData;
import com.join.kotlin.ui.cloudarchive.data.ArchiveDownEvent;
import com.join.kotlin.ui.cloudarchive.data.ModDataRequest;
import com.join.kotlin.ui.cloudarchive.data.ModGameArchivePathData;
import com.join.kotlin.ui.cloudarchive.dialog.ClickDelDialogListener;
import com.join.kotlin.ui.cloudarchive.dialog.CommentArchiveDialog;
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
import com.join.mgps.Util.w0;
import com.join.mgps.Util.y;
import com.join.mgps.activity.mygame.dialog.PlugDownDialogAcitivity_;
import com.join.mgps.db.tables.CloudArchiveTable;
import com.join.mgps.dialog.d1;
import com.join.mgps.dto.ArchiveDataAddPd;
import com.join.mgps.dto.CloudArchiveCfg;
import com.join.mgps.dto.DomainInfoBean;
import com.join.mgps.dto.GamedetialModleFourBean;
import com.join.mgps.dto.GoldFingerBean;
import com.join.mgps.dto.ModGameArchiveTagBean;
import com.join.mgps.dto.ModGameDetailBean;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.va.overmind.d;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.psk.kotlin.util.CommonListMainData;
import com.wufan.user.service.protobuf.n0;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ModgameCloudListFragment.kt */
@SourceDebugExtension({"SMAP\nModgameCloudListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModgameCloudListFragment.kt\ncom/join/kotlin/ui/cloudarchive/ModgameCloudListFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1158:1\n1#2:1159\n766#3:1160\n857#3,2:1161\n1549#3:1163\n1620#3,3:1164\n*S KotlinDebug\n*F\n+ 1 ModgameCloudListFragment.kt\ncom/join/kotlin/ui/cloudarchive/ModgameCloudListFragment\n*L\n113#1:1160\n113#1:1161,2\n114#1:1163\n114#1:1164,3\n*E\n"})
/* loaded from: classes.dex */
public final class ModgameCloudListFragment extends Fragment implements OnClickArchiveListener, View.OnClickListener, LoadBindClickProxy {
    @NotNull
    private final Lazy adapterx$delegate;
    public ArchiveData archiveDataPop;
    @Nullable
    private ModGameArchiveTagBean archiveTag;
    @NotNull
    private final Lazy checkDownloadTypeDialog$delegate;
    public RecyclerviewLayoutDatabindingBinding dataBinding;
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
    private ModGameDetailBean modgameBean;
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

    public ModgameCloudListFragment() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Lazy lazy5;
        Lazy lazy6;
        Lazy lazy7;
        Lazy lazy8;
        Lazy lazy9;
        lazy = LazyKt__LazyJVMKt.lazy(new Function0<ModGameCloudViewModle>() { // from class: com.join.kotlin.ui.cloudarchive.ModgameCloudListFragment$viewModle$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ModGameCloudViewModle invoke() {
                return (ModGameCloudViewModle) new ViewModelProvider(ModgameCloudListFragment.this, new ViewModelProvider.NewInstanceFactory()).get(ModGameCloudViewModle.class);
            }
        });
        this.viewModle$delegate = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new Function0<CloudShareViewModle>() { // from class: com.join.kotlin.ui.cloudarchive.ModgameCloudListFragment$viewModleShareViewModle$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CloudShareViewModle invoke() {
                FragmentActivity requireActivity = ModgameCloudListFragment.this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                return (CloudShareViewModle) new ViewModelProvider(requireActivity, new ViewModelProvider.NewInstanceFactory()).get(CloudShareViewModle.class);
            }
        });
        this.viewModleShareViewModle$delegate = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new Function0<ModArchiveAdapter>() { // from class: com.join.kotlin.ui.cloudarchive.ModgameCloudListFragment$adapterx$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ModArchiveAdapter invoke() {
                Context requireContext = ModgameCloudListFragment.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                ModgameCloudListFragment modgameCloudListFragment = ModgameCloudListFragment.this;
                ModGameArchiveTagBean archiveTag = modgameCloudListFragment.getArchiveTag();
                boolean z4 = true;
                if (!(archiveTag != null && archiveTag.getType() == 2)) {
                    ModGameArchiveTagBean archiveTag2 = ModgameCloudListFragment.this.getArchiveTag();
                    if (!Intrinsics.areEqual(archiveTag2 != null ? archiveTag2.getName() : null, "精选")) {
                        z4 = false;
                    }
                }
                return new ModArchiveAdapter(requireContext, modgameCloudListFragment, z4);
            }
        });
        this.adapterx$delegate = lazy3;
        this.page = 1;
        this.type = 1;
        this.gameId = "";
        this.isfirst = true;
        lazy4 = LazyKt__LazyJVMKt.lazy(new Function0<DelArchiveDialog>() { // from class: com.join.kotlin.ui.cloudarchive.ModgameCloudListFragment$checkDownloadTypeDialog$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DelArchiveDialog invoke() {
                return new DelArchiveDialog();
            }
        });
        this.checkDownloadTypeDialog$delegate = lazy4;
        lazy5 = LazyKt__LazyJVMKt.lazy(new Function0<d1>() { // from class: com.join.kotlin.ui.cloudarchive.ModgameCloudListFragment$dialog$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final d1 invoke() {
                return b0.f0(ModgameCloudListFragment.this.getContext()).y(ModgameCloudListFragment.this.getContext(), "存档拷贝中");
            }
        });
        this.dialog$delegate = lazy5;
        lazy6 = LazyKt__LazyJVMKt.lazy(new Function0<PopupWindow>() { // from class: com.join.kotlin.ui.cloudarchive.ModgameCloudListFragment$popWindow$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final PopupWindow invoke() {
                return ModgameCloudListFragment.this.createPopwindow();
            }
        });
        this.popWindow$delegate = lazy6;
        lazy7 = LazyKt__LazyJVMKt.lazy(new Function0<ImageShowDialog>() { // from class: com.join.kotlin.ui.cloudarchive.ModgameCloudListFragment$imageDialog$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ImageShowDialog invoke() {
                return new ImageShowDialog(0);
            }
        });
        this.imageDialog$delegate = lazy7;
        lazy8 = LazyKt__LazyJVMKt.lazy(new Function0<DelArchiveDialog>() { // from class: com.join.kotlin.ui.cloudarchive.ModgameCloudListFragment$delFragment$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DelArchiveDialog invoke() {
                return new DelArchiveDialog();
            }
        });
        this.delFragment$delegate = lazy8;
        lazy9 = LazyKt__LazyJVMKt.lazy(new Function0<RedownArchiveDialog>() { // from class: com.join.kotlin.ui.cloudarchive.ModgameCloudListFragment$redownFragment$2
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
    public static final void initData$lambda$10(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$11(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDownloadDialog(ArchiveData archiveData, int i4) {
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

    private final void startGame(final ArchiveData archiveData) {
        if (archiveData != null) {
            String packageName = archiveData.getPackageName();
            if (packageName == null || packageName.length() == 0) {
                return;
            }
            getViewModleShareViewModle().setLastStartArchive(archiveData);
            try {
                d.a aVar = com.join.mgps.va.overmind.d.f54937g;
                if (aVar.d().f(archiveData.getPackageName(), archiveData.getUserId())) {
                    if (aVar.d().G(archiveData.getPackageName(), archiveData.getUserId())) {
                        getViewModle().startGameADCheck(getContext(), new Function0<Unit>() { // from class: com.join.kotlin.ui.cloudarchive.ModgameCloudListFragment$startGame$1
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
                                GamedetialModleFourBean mod_game_info;
                                GamedetialModleFourBean mod_game_info2;
                                Context context = ModgameCloudListFragment.this.getContext();
                                if (context == null) {
                                    context = MApplication.f1497x;
                                }
                                Context context2 = context;
                                if (context2 == null) {
                                    return;
                                }
                                if (archiveData.getUserId() == 0) {
                                    ModgameCloudListFragment.this.getViewModleShareViewModle().getRunIngArchiveId().setValue(0L);
                                } else {
                                    MutableLiveData<Long> runIngArchiveId = ModgameCloudListFragment.this.getViewModleShareViewModle().getRunIngArchiveId();
                                    String id = archiveData.getId();
                                    Intrinsics.checkNotNullExpressionValue(id, "archive.id");
                                    runIngArchiveId.setValue(Long.valueOf(Long.parseLong(id)));
                                }
                                if (archiveData.getUid() != AccountUtil_.getInstance_(context2).getAccountData().getUid() && archiveData.getUid() != 0) {
                                    l2 a5 = l2.a(context2);
                                    a5.b("当前正在使用 " + archiveData.getNickname() + " 的存档");
                                }
                                List<GoldFingerBean> goldFingerBean = ModgameCloudListFragment.this.getViewModleShareViewModle().getGoldFingerBean();
                                String str = goldFingerBean == null || goldFingerBean.isEmpty() ? "0" : "1";
                                DownloadTask F = p1.f.K().F(archiveData.getGame_id());
                                ModGameDetailBean modgameBean = ModgameCloudListFragment.this.getModgameBean();
                                ModInfoBean modInfoBean = null;
                                String valueOf = String.valueOf((modgameBean == null || (mod_game_info2 = modgameBean.getMod_game_info()) == null) ? null : Integer.valueOf(mod_game_info2.getBbs_strategy_switch()));
                                if (ModgameCloudListFragment.this.getModgameBean() != null && F != null) {
                                    ModInfoBean modInfoBean2 = F.getModInfoBean();
                                    Intrinsics.checkNotNullExpressionValue(modInfoBean2, "downloadTask.modInfoBean");
                                    ModGameDetailBean modgameBean2 = ModgameCloudListFragment.this.getModgameBean();
                                    if (modgameBean2 != null && (mod_game_info = modgameBean2.getMod_game_info()) != null) {
                                        modInfoBean = mod_game_info.getMod_info();
                                    }
                                    if (modInfoBean != null && modInfoBean.getVer() > modInfoBean2.getVer()) {
                                        modInfoBean.setStatus(9);
                                        F.setMod_info(JsonMapper.toJsonString(modInfoBean));
                                        p1.f.K().m(F);
                                    }
                                }
                                if (F != null) {
                                    APKUtils.f14829a.B(context2, archiveData, str, valueOf, F);
                                }
                            }
                        });
                    } else {
                        aVar.d().C(archiveData.getPackageName(), archiveData.getUserId());
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateLocaDataToShow() {
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
        getDataBinding().f26242b.setNoMore();
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
    public final RecyclerviewLayoutDatabindingBinding getDataBinding() {
        RecyclerviewLayoutDatabindingBinding recyclerviewLayoutDatabindingBinding = this.dataBinding;
        if (recyclerviewLayoutDatabindingBinding != null) {
            return recyclerviewLayoutDatabindingBinding;
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
    public final ModGameDetailBean getModgameBean() {
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
            Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.join.mgps.dto.ModGameDetailBean");
            this.modgameBean = (ModGameDetailBean) serializable;
            this.archiveTag = (ModGameArchiveTagBean) arguments.getSerializable("tag");
            ModGameCloudViewModle viewModle = getViewModle();
            ModGameDetailBean modGameDetailBean = this.modgameBean;
            Intrinsics.checkNotNull(modGameDetailBean);
            String packageName = modGameDetailBean.getMod_game_info().getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "modgameBean!!.mod_game_info.packageName");
            viewModle.setPackageName(packageName);
            MutableLiveData<ModGameArchivePathData> cloud_archive_local_path = getViewModle().getCloud_archive_local_path();
            ModGameDetailBean modGameDetailBean2 = this.modgameBean;
            cloud_archive_local_path.setValue(modGameDetailBean2 != null ? modGameDetailBean2.getCloud_archive_local_path() : null);
        }
        ModGameCloudViewModle viewModle2 = getViewModle();
        ModGameDetailBean modGameDetailBean3 = this.modgameBean;
        Intrinsics.checkNotNull(modGameDetailBean3);
        String packageName2 = modGameDetailBean3.getMod_game_info().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName2, "modgameBean!!.mod_game_info.packageName");
        ModGameDetailBean modGameDetailBean4 = this.modgameBean;
        ModGameArchivePathData cloud_archive_local_path2 = modGameDetailBean4 != null ? modGameDetailBean4.getCloud_archive_local_path() : null;
        Intrinsics.checkNotNull(cloud_archive_local_path2);
        Long value = getViewModleShareViewModle().getRunIngArchiveId().getValue();
        Intrinsics.checkNotNull(value);
        viewModle2.loadAllArchives(packageName2, cloud_archive_local_path2, value.longValue(), getViewModleShareViewModle().getLocalArchiveLists().getValue());
        getDataBinding().setLifecycleOwner(this);
        getDataBinding().setVariable(34, getViewModle());
        getDataBinding().setVariable(21, this);
        getDataBinding().f26242b.setAdapter(getAdapterx());
        getDataBinding().f26242b.getLayoutManager();
        getDataBinding().f26242b.setLoadingListener(new XRecyclerView.f() { // from class: com.join.kotlin.ui.cloudarchive.ModgameCloudListFragment$initData$2
            @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
            public void onLoadMore() {
                ModgameCloudListFragment.this.loadData();
            }

            @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
            public void onRefresh() {
                ModgameCloudListFragment.this.setPage(1);
                ModgameCloudListFragment.this.loadData();
            }
        });
        MutableLiveData<List<CommonListMainData>> listArchive = getViewModle().getListArchive();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        final Function1<List<CommonListMainData>, Unit> function1 = new Function1<List<CommonListMainData>, Unit>() { // from class: com.join.kotlin.ui.cloudarchive.ModgameCloudListFragment$initData$3
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
                ModgameCloudListFragment.this.getAdapterx().notifyDataSetChanged();
            }
        };
        listArchive.observe(viewLifecycleOwner, new Observer() { // from class: com.join.kotlin.ui.cloudarchive.t
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ModgameCloudListFragment.initData$lambda$5(Function1.this, obj);
            }
        });
        MutableLiveData<ResponseModel<ArchiveDataAddPd>> resultDataPd = getViewModle().getRequest().getResultDataPd();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        final Function1<ResponseModel<ArchiveDataAddPd>, Unit> function12 = new Function1<ResponseModel<ArchiveDataAddPd>, Unit>() { // from class: com.join.kotlin.ui.cloudarchive.ModgameCloudListFragment$initData$4
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ResponseModel<ArchiveDataAddPd> responseModel) {
                invoke2(responseModel);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ResponseModel<ArchiveDataAddPd> responseModel) {
                boolean z4 = false;
                if (responseModel != null && responseModel.getCode() == 200) {
                    ModgameCloudListFragment.this.getViewModle().getLoadBindData().setValue(new LoadBindindData(1));
                    ArchiveDataAddPd data = responseModel.getData();
                    List<ArchiveData> cloud_archives = data != null ? data.getCloud_archives() : null;
                    ArchiveDataAddPd data2 = responseModel.getData();
                    DomainInfoBean pd_info = data2 != null ? data2.getPd_info() : null;
                    if (responseModel.getPage() == 1) {
                        List<CommonListMainData> value2 = ModgameCloudListFragment.this.getViewModle().getListArchive().getValue();
                        if (value2 != null) {
                            value2.clear();
                        }
                        ModgameCloudListFragment.this.getAdapterx().notifyDataSetChanged();
                    }
                    if (cloud_archives != null && !cloud_archives.isEmpty()) {
                        List<ArchiveData> value3 = ModgameCloudListFragment.this.getViewModle().getLocalAllArchive().getValue();
                        if (ModgameCloudListFragment.this.getPage() == 1 && pd_info != null) {
                            List<CommonListMainData> value4 = ModgameCloudListFragment.this.getViewModle().getListArchive().getValue();
                            if (value4 != null) {
                                value4.add(new CommonListMainData(6, pd_info, null, null, 12, null));
                            }
                            com.papa.sim.statistic.p.l(ModgameCloudListFragment.this.getContext()).O1(Event.pdSingleArchiveDetails, new Ext().setGameId(ModgameCloudListFragment.this.getGameId()).setIsJoin(pd_info.getIs_join()).setTestAbNumber(pd_info.getAb_test_number()));
                        }
                        ModgameCloudListFragment modgameCloudListFragment = ModgameCloudListFragment.this;
                        modgameCloudListFragment.setPage(modgameCloudListFragment.getPage() + 1);
                        ModgameCloudListFragment.this.getDataBinding().f26242b.loadMoreComplete();
                        for (ArchiveData it2 : cloud_archives) {
                            it2.setShowType(ModgameCloudListFragment.this.getType());
                            it2.setGame_id(ModgameCloudListFragment.this.getGameId());
                            it2.setIsDownloadArchive(0);
                            if (value3 != null && (!value3.isEmpty())) {
                                for (ArchiveData archiveData : value3) {
                                    if (Intrinsics.areEqual(archiveData.getId(), it2.getId())) {
                                        it2.setUserId(archiveData.getUserId());
                                        it2.setArchiveLocalZipPath(archiveData.getArchiveLocalZipPath());
                                        it2.setIsDownloadArchive(1);
                                        it2.setPackageName(archiveData.getPackageName());
                                        it2.setIsFirstRun(archiveData.getIsFirstRun());
                                        it2.setMainArchiveLocalPath(archiveData.getMainArchiveLocalPath());
                                        it2.setMainArchiveLocalPath2(archiveData.getMainArchiveLocalPath2());
                                        it2.setArchiveLocalPath(archiveData.getArchiveLocalPath());
                                        Long value5 = ModgameCloudListFragment.this.getViewModleShareViewModle().getRunIngArchiveId().getValue();
                                        it2.setRuningArchiveId(value5 == null ? 0L : value5.longValue());
                                        it2.setShowText("启动");
                                        it2.setStatus(8);
                                    }
                                }
                            }
                            if (ModgameCloudListFragment.this.getType() != 1 && ModgameCloudListFragment.this.getType() != 2) {
                                List<CommonListMainData> value6 = ModgameCloudListFragment.this.getViewModle().getListArchive().getValue();
                                if (value6 != null) {
                                    Intrinsics.checkNotNullExpressionValue(it2, "it");
                                    value6.add(new CommonListMainData(4, it2, null, null, 12, null));
                                }
                            } else {
                                List<CommonListMainData> value7 = ModgameCloudListFragment.this.getViewModle().getListArchive().getValue();
                                if (value7 != null) {
                                    Intrinsics.checkNotNullExpressionValue(it2, "it");
                                    value7.add(new CommonListMainData(3, it2, null, null, 12, null));
                                }
                            }
                        }
                        ModgameCloudListFragment.this.getAdapterx().notifyDataSetChanged();
                        return;
                    }
                    List<CommonListMainData> value8 = ModgameCloudListFragment.this.getViewModle().getListArchive().getValue();
                    if (value8 != null && value8.size() == 0) {
                        z4 = true;
                    }
                    if (z4) {
                        ModgameCloudListFragment.this.getViewModle().getLoadBindData().setValue(new LoadBindindData(4));
                    }
                    ModgameCloudListFragment.this.getDataBinding().f26242b.setNoMore();
                    return;
                }
                List<CommonListMainData> value9 = ModgameCloudListFragment.this.getViewModle().getListArchive().getValue();
                if (!(value9 != null && value9.size() == 0)) {
                    ModgameCloudListFragment.this.getViewModle().getLoadBindData().setValue(new LoadBindindData(1));
                    return;
                }
                if (responseModel != null && (responseModel.getPage() == 1 || responseModel.getPage() == 0)) {
                    List<CommonListMainData> value10 = ModgameCloudListFragment.this.getViewModle().getListArchive().getValue();
                    if (value10 != null) {
                        value10.clear();
                    }
                    ModgameCloudListFragment.this.getAdapterx().notifyDataSetChanged();
                }
                List<CommonListMainData> value11 = ModgameCloudListFragment.this.getViewModle().getListArchive().getValue();
                if (value11 != null && value11.size() == 0) {
                    z4 = true;
                }
                if (z4) {
                    ModgameCloudListFragment.this.getViewModle().getLoadBindData().setValue(new LoadBindindData(3));
                }
            }
        };
        resultDataPd.observe(viewLifecycleOwner2, new Observer() { // from class: com.join.kotlin.ui.cloudarchive.q
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ModgameCloudListFragment.initData$lambda$6(Function1.this, obj);
            }
        });
        MutableLiveData<ResponseModel<List<ArchiveData>>> resultData = getViewModle().getRequest().getResultData();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        final Function1<ResponseModel<List<? extends ArchiveData>>, Unit> function13 = new Function1<ResponseModel<List<? extends ArchiveData>>, Unit>() { // from class: com.join.kotlin.ui.cloudarchive.ModgameCloudListFragment$initData$5
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
                    ModgameCloudListFragment.this.getViewModle().getLoadBindData().setValue(new LoadBindindData(1));
                    List<ArchiveData> data = responseModel.getData();
                    if (responseModel.getPage() == 1) {
                        List<CommonListMainData> value2 = ModgameCloudListFragment.this.getViewModle().getListArchive().getValue();
                        if (value2 != null) {
                            value2.clear();
                        }
                        ModgameCloudListFragment.this.getAdapterx().notifyDataSetChanged();
                    }
                    if (data != null && !data.isEmpty()) {
                        List<ArchiveData> value3 = ModgameCloudListFragment.this.getViewModle().getLocalAllArchive().getValue();
                        ModgameCloudListFragment modgameCloudListFragment = ModgameCloudListFragment.this;
                        modgameCloudListFragment.setPage(modgameCloudListFragment.getPage() + 1);
                        ModgameCloudListFragment.this.getDataBinding().f26242b.loadMoreComplete();
                        for (ArchiveData archiveData : data) {
                            archiveData.setShowType(ModgameCloudListFragment.this.getType());
                            archiveData.setGame_id(ModgameCloudListFragment.this.getGameId());
                            archiveData.setIsDownloadArchive(0);
                            if (value3 != null && (!value3.isEmpty())) {
                                for (ArchiveData archiveData2 : value3) {
                                    if (Intrinsics.areEqual(archiveData2.getId(), archiveData.getId())) {
                                        archiveData.setUserId(archiveData2.getUserId());
                                        archiveData.setArchiveLocalZipPath(archiveData2.getArchiveLocalZipPath());
                                        archiveData.setIsDownloadArchive(1);
                                        archiveData.setPackageName(archiveData2.getPackageName());
                                        archiveData.setIsFirstRun(archiveData2.getIsFirstRun());
                                        archiveData.setMainArchiveLocalPath(archiveData2.getMainArchiveLocalPath());
                                        archiveData.setMainArchiveLocalPath2(archiveData2.getMainArchiveLocalPath2());
                                        archiveData.setArchiveLocalPath(archiveData2.getArchiveLocalPath());
                                        Long value4 = ModgameCloudListFragment.this.getViewModleShareViewModle().getRunIngArchiveId().getValue();
                                        archiveData.setRuningArchiveId(value4 == null ? 0L : value4.longValue());
                                        archiveData.setShowText("启动");
                                        archiveData.setStatus(8);
                                    }
                                }
                            }
                            if (ModgameCloudListFragment.this.getType() != 1 && ModgameCloudListFragment.this.getType() != 2) {
                                List<CommonListMainData> value5 = ModgameCloudListFragment.this.getViewModle().getListArchive().getValue();
                                if (value5 != null) {
                                    value5.add(new CommonListMainData(4, archiveData, null, null, 12, null));
                                }
                            } else {
                                List<CommonListMainData> value6 = ModgameCloudListFragment.this.getViewModle().getListArchive().getValue();
                                if (value6 != null) {
                                    value6.add(new CommonListMainData(3, archiveData, null, null, 12, null));
                                }
                            }
                        }
                        ModgameCloudListFragment.this.getAdapterx().notifyDataSetChanged();
                        return;
                    }
                    List<CommonListMainData> value7 = ModgameCloudListFragment.this.getViewModle().getListArchive().getValue();
                    if (value7 != null && value7.size() == 0) {
                        z4 = true;
                    }
                    if (z4) {
                        ModgameCloudListFragment.this.getViewModle().getLoadBindData().setValue(new LoadBindindData(4));
                    }
                    ModgameCloudListFragment.this.getDataBinding().f26242b.setNoMore();
                    return;
                }
                List<CommonListMainData> value8 = ModgameCloudListFragment.this.getViewModle().getListArchive().getValue();
                if (!(value8 != null && value8.size() == 0)) {
                    ModgameCloudListFragment.this.getViewModle().getLoadBindData().setValue(new LoadBindindData(1));
                    return;
                }
                if (responseModel != null && (responseModel.getPage() == 1 || responseModel.getPage() == 0)) {
                    List<CommonListMainData> value9 = ModgameCloudListFragment.this.getViewModle().getListArchive().getValue();
                    if (value9 != null) {
                        value9.clear();
                    }
                    ModgameCloudListFragment.this.getAdapterx().notifyDataSetChanged();
                }
                List<CommonListMainData> value10 = ModgameCloudListFragment.this.getViewModle().getListArchive().getValue();
                if (value10 != null && value10.size() == 0) {
                    z4 = true;
                }
                if (z4) {
                    ModgameCloudListFragment.this.getViewModle().getLoadBindData().setValue(new LoadBindindData(3));
                }
            }
        };
        resultData.observe(viewLifecycleOwner3, new Observer() { // from class: com.join.kotlin.ui.cloudarchive.u
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ModgameCloudListFragment.initData$lambda$7(Function1.this, obj);
            }
        });
        getViewModle().getRequest().setInstallInExtPlug(getViewModleShareViewModle().getInstallInExtPlug());
        MutableLiveData<ResponseModel<List<ArchiveData>>> resultAllHasDownloadData = getViewModle().getRequest().getResultAllHasDownloadData();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        final Function1<ResponseModel<List<? extends ArchiveData>>, Unit> function14 = new Function1<ResponseModel<List<? extends ArchiveData>>, Unit>() { // from class: com.join.kotlin.ui.cloudarchive.ModgameCloudListFragment$initData$6
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
                boolean z4;
                List<CommonListMainData> value2;
                int collectionSizeOrDefault;
                int collectionSizeOrDefault2;
                if (responseModel == null || responseModel.getCode() != 200) {
                    return;
                }
                List<ArchiveData> data = responseModel.getData();
                if (data != null && !data.isEmpty()) {
                    if (responseModel.getPage() == 1) {
                        ModgameCloudListFragment.this.setPage(1);
                        List<CommonListMainData> value3 = ModgameCloudListFragment.this.getViewModle().getListArchive().getValue();
                        if (value3 != null) {
                            value3.clear();
                        }
                    }
                    List<ArchiveData> value4 = ModgameCloudListFragment.this.getViewModle().getLocalAllArchive().getValue();
                    ModgameCloudListFragment modgameCloudListFragment = ModgameCloudListFragment.this;
                    modgameCloudListFragment.setPage(modgameCloudListFragment.getPage() + 1);
                    ModgameCloudListFragment.this.getDataBinding().f26242b.loadMoreComplete();
                    List<ArchiveData> value5 = ModgameCloudListFragment.this.getViewModle().getLocalAllArchive().getValue();
                    Intrinsics.checkNotNull(value5);
                    Iterator<ArchiveData> it2 = value5.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        ArchiveData next = it2.next();
                        next.setIsDownloadArchive(1);
                        next.setStatus(8);
                        next.setShowText("启动");
                        next.setShowType(2);
                        Long value6 = ModgameCloudListFragment.this.getViewModleShareViewModle().getRunIngArchiveId().getValue();
                        next.setRuningArchiveId(value6 != null ? value6.longValue() : 0L);
                        if (next.getUid() == 0) {
                            next.setShowType(1);
                            List<CommonListMainData> value7 = ModgameCloudListFragment.this.getViewModle().getListArchive().getValue();
                            if (value7 != null) {
                                value7.add(new CommonListMainData(4, next, null, null, 12, null));
                            }
                        } else if (next.getUserId() == 0 && !Intrinsics.areEqual(next.getId(), "0")) {
                            List<ArchiveData> value8 = ModgameCloudListFragment.this.getViewModle().getLocalAllArchive().getValue();
                            if (value8 != null) {
                                ArrayList<ArchiveData> arrayList = new ArrayList();
                                for (Object obj : value8) {
                                    if (((ArchiveData) obj).getUid() == 0) {
                                        arrayList.add(obj);
                                    }
                                }
                                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
                                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
                                for (ArchiveData archiveData : arrayList) {
                                    archiveData.setArchiveDesc("我的默认存档");
                                    arrayList2.add(Unit.INSTANCE);
                                }
                            }
                        } else {
                            List<CommonListMainData> value9 = ModgameCloudListFragment.this.getViewModle().getListArchive().getValue();
                            if (value9 != null) {
                                value9.add(new CommonListMainData(3, next, null, null, 12, null));
                            }
                        }
                        ArrayList<ArchiveData> arrayList3 = new ArrayList();
                        for (Object obj2 : data) {
                            if (Intrinsics.areEqual(((ArchiveData) obj2).getId(), next.getId())) {
                                arrayList3.add(obj2);
                            }
                        }
                        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10);
                        ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault);
                        for (ArchiveData archiveData2 : arrayList3) {
                            next.setArchiveDesc(archiveData2.getArchiveDesc());
                            next.setIsLike(archiveData2.getIsLike());
                            next.setLikeCount(archiveData2.getLikeCount());
                            next.setDownloadCount(archiveData2.getDownloadCount());
                            arrayList4.add(Unit.INSTANCE);
                        }
                    }
                    for (ArchiveData archiveData3 : data) {
                        archiveData3.setShowType(ModgameCloudListFragment.this.getType());
                        archiveData3.setGame_id(ModgameCloudListFragment.this.getGameId());
                        archiveData3.setIsDownloadArchive(0);
                        archiveData3.setPackageName(ModgameCloudListFragment.this.getViewModle().getPackageName());
                        if (value4 != null && (!value4.isEmpty())) {
                            Iterator<ArchiveData> it3 = value4.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z4 = false;
                                    break;
                                }
                                ArchiveData next2 = it3.next();
                                if (Intrinsics.areEqual(next2.getId(), archiveData3.getId())) {
                                    archiveData3.setUserId(next2.getUserId());
                                    archiveData3.setArchiveLocalZipPath(next2.getArchiveLocalZipPath());
                                    archiveData3.setIsDownloadArchive(1);
                                    archiveData3.setPackageName(next2.getPackageName());
                                    archiveData3.setIsFirstRun(next2.getIsFirstRun());
                                    archiveData3.setMainArchiveLocalPath(next2.getMainArchiveLocalPath());
                                    archiveData3.setMainArchiveLocalPath2(next2.getMainArchiveLocalPath2());
                                    archiveData3.setArchiveLocalPath(next2.getArchiveLocalPath());
                                    Long value10 = ModgameCloudListFragment.this.getViewModleShareViewModle().getRunIngArchiveId().getValue();
                                    archiveData3.setRuningArchiveId(value10 == null ? 0L : value10.longValue());
                                    archiveData3.setShowText("启动");
                                    archiveData3.setStatus(8);
                                    z4 = true;
                                }
                            }
                            if (!z4 && (value2 = ModgameCloudListFragment.this.getViewModle().getListArchive().getValue()) != null) {
                                value2.add(new CommonListMainData(3, archiveData3, null, null, 12, null));
                            }
                        } else {
                            List<CommonListMainData> value11 = ModgameCloudListFragment.this.getViewModle().getListArchive().getValue();
                            if (value11 != null) {
                                value11.add(new CommonListMainData(3, archiveData3, null, null, 12, null));
                            }
                        }
                    }
                    ModgameCloudListFragment.this.getAdapterx().notifyDataSetChanged();
                    return;
                }
                ModgameCloudListFragment.this.getDataBinding().f26242b.setNoMore();
            }
        };
        resultAllHasDownloadData.observe(viewLifecycleOwner4, new Observer() { // from class: com.join.kotlin.ui.cloudarchive.p
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ModgameCloudListFragment.initData$lambda$8(Function1.this, obj);
            }
        });
        getViewModle().getRequest().getDataChangeItem().observe(getViewLifecycleOwner(), new Observer<ArchiveData>() { // from class: com.join.kotlin.ui.cloudarchive.ModgameCloudListFragment$initData$7
            @Override // androidx.lifecycle.Observer
            public void onChanged(@Nullable ArchiveData archiveData) {
                ModGameCloudViewModle viewModle3 = ModgameCloudListFragment.this.getViewModle();
                Intrinsics.checkNotNull(archiveData);
                viewModle3.onitemChanged(archiveData, ModgameCloudListFragment.this.getAdapterx());
            }
        });
        MutableLiveData<List<ArchiveData>> localAllArchive = getViewModle().getLocalAllArchive();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        final Function1<List<ArchiveData>, Unit> function15 = new Function1<List<ArchiveData>, Unit>() { // from class: com.join.kotlin.ui.cloudarchive.ModgameCloudListFragment$initData$8
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<ArchiveData> list) {
                invoke2(list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(List<ArchiveData> list) {
                if (ModgameCloudListFragment.this.getIsfirst()) {
                    ModgameCloudListFragment.this.loadData();
                    ModgameCloudListFragment.this.setIsfirst(false);
                    return;
                }
                if (ModgameCloudListFragment.this.getType() != 1) {
                    ModgameCloudListFragment.this.loadData();
                }
                if (ModgameCloudListFragment.this.getType() == 2) {
                    ModgameCloudListFragment.this.getViewModle().getLoadBindData().setValue(new LoadBindindData(1));
                    ModgameCloudListFragment.this.updateLocaDataToShow();
                }
            }
        };
        localAllArchive.observe(viewLifecycleOwner5, new Observer() { // from class: com.join.kotlin.ui.cloudarchive.o
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ModgameCloudListFragment.initData$lambda$9(Function1.this, obj);
            }
        });
        MutableLiveData<Long> runIngArchiveId = getViewModleShareViewModle().getRunIngArchiveId();
        FragmentActivity requireActivity = requireActivity();
        final Function1<Long, Unit> function16 = new Function1<Long, Unit>() { // from class: com.join.kotlin.ui.cloudarchive.ModgameCloudListFragment$initData$9
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
                if (ModgameCloudListFragment.this.getType() == 2) {
                    List<CommonListMainData> value2 = ModgameCloudListFragment.this.getViewModle().getListArchive().getValue();
                    Intrinsics.checkNotNull(value2);
                    for (CommonListMainData commonListMainData : value2) {
                        Object any = commonListMainData.getAny();
                        Intrinsics.checkNotNull(any, "null cannot be cast to non-null type com.join.kotlin.ui.cloudarchive.data.ArchiveData");
                        Intrinsics.checkNotNull(l4);
                        ((ArchiveData) any).setRuningArchiveId(l4.longValue());
                    }
                    ModgameCloudListFragment.this.getViewModle().getListArchive().setValue(ModgameCloudListFragment.this.getViewModle().getListArchive().getValue());
                }
            }
        };
        runIngArchiveId.observe(requireActivity, new Observer() { // from class: com.join.kotlin.ui.cloudarchive.r
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ModgameCloudListFragment.initData$lambda$10(Function1.this, obj);
            }
        });
        MutableLiveData<List<ArchiveData>> localArchiveLists = getViewModleShareViewModle().getLocalArchiveLists();
        FragmentActivity requireActivity2 = requireActivity();
        final Function1<List<ArchiveData>, Unit> function17 = new Function1<List<ArchiveData>, Unit>() { // from class: com.join.kotlin.ui.cloudarchive.ModgameCloudListFragment$initData$10
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<ArchiveData> list) {
                invoke2(list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(List<ArchiveData> list) {
                if (ModgameCloudListFragment.this.getModgameBean() != null) {
                    ModGameCloudViewModle viewModle3 = ModgameCloudListFragment.this.getViewModle();
                    ModGameDetailBean modgameBean = ModgameCloudListFragment.this.getModgameBean();
                    Intrinsics.checkNotNull(modgameBean);
                    String packageName3 = modgameBean.getMod_game_info().getPackageName();
                    Intrinsics.checkNotNullExpressionValue(packageName3, "modgameBean!!.mod_game_info.packageName");
                    ModGameDetailBean modgameBean2 = ModgameCloudListFragment.this.getModgameBean();
                    ModGameArchivePathData cloud_archive_local_path3 = modgameBean2 != null ? modgameBean2.getCloud_archive_local_path() : null;
                    Intrinsics.checkNotNull(cloud_archive_local_path3);
                    Long value2 = ModgameCloudListFragment.this.getViewModleShareViewModle().getRunIngArchiveId().getValue();
                    Intrinsics.checkNotNull(value2);
                    viewModle3.loadAllArchives(packageName3, cloud_archive_local_path3, value2.longValue(), ModgameCloudListFragment.this.getViewModleShareViewModle().getLocalArchiveLists().getValue());
                }
            }
        };
        localArchiveLists.observe(requireActivity2, new Observer() { // from class: com.join.kotlin.ui.cloudarchive.s
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ModgameCloudListFragment.initData$lambda$11(Function1.this, obj);
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
        CloudArchiveCfg cloud_archive_cfg;
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
        ModGameDetailBean modGameDetailBean = this.modgameBean;
        long last_enter_main_page_time = (modGameDetailBean == null || (cloud_archive_cfg = modGameDetailBean.getCloud_archive_cfg()) == null) ? 0L : cloud_archive_cfg.getLast_enter_main_page_time();
        ModGameArchiveTagBean modGameArchiveTagBean = this.archiveTag;
        String tagId = modGameArchiveTagBean != null ? modGameArchiveTagBean.getTagId() : null;
        ModGameArchiveTagBean modGameArchiveTagBean2 = this.archiveTag;
        request2.getModeDatasAddPd(requireContext2, i5, str, last_enter_main_page_time, tagId, modGameArchiveTagBean2 != null ? Integer.valueOf(modGameArchiveTagBean2.getType()) : null);
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
                    getDelFragment().setClickDelDialogListener(new ClickDelDialogListener() { // from class: com.join.kotlin.ui.cloudarchive.ModgameCloudListFragment$onClick$1
                        @Override // com.join.kotlin.ui.cloudarchive.dialog.ClickDelDialogListener
                        public void onClickCancleButn() {
                            ModgameCloudListFragment.this.getDelFragment().dismiss();
                        }

                        @Override // com.join.kotlin.ui.cloudarchive.dialog.ClickDelDialogListener
                        public void onClickOkButn() {
                            if (Intrinsics.areEqual(ModgameCloudListFragment.this.getArchiveDataPop().getId(), String.valueOf(ModgameCloudListFragment.this.getViewModleShareViewModle().getRunIngArchiveId().getValue()))) {
                                ModgameCloudListFragment.this.getViewModleShareViewModle().getRunIngArchiveId().setValue(0L);
                            }
                            ModGameCloudViewModle viewModle = ModgameCloudListFragment.this.getViewModle();
                            FragmentActivity activity = ModgameCloudListFragment.this.getActivity();
                            Intrinsics.checkNotNull(activity);
                            viewModle.delMyDownloadArchive(activity, ModgameCloudListFragment.this.getArchiveDataPop());
                            ModgameCloudListFragment.this.getDelFragment().dismiss();
                        }
                    });
                    getDelFragment().setDatas(new DialogData("是否删除此存档", "", "删除", "取消", false, 16, null));
                }
            } else {
                getDelFragment().setClickDelDialogListener(new ClickDelDialogListener() { // from class: com.join.kotlin.ui.cloudarchive.ModgameCloudListFragment$onClick$2
                    @Override // com.join.kotlin.ui.cloudarchive.dialog.ClickDelDialogListener
                    public void onClickCancleButn() {
                        ModgameCloudListFragment.this.getDelFragment().dismiss();
                    }

                    @Override // com.join.kotlin.ui.cloudarchive.dialog.ClickDelDialogListener
                    public void onClickOkButn() {
                        ModGameCloudViewModle viewModle = ModgameCloudListFragment.this.getViewModle();
                        FragmentActivity activity = ModgameCloudListFragment.this.getActivity();
                        Intrinsics.checkNotNull(activity);
                        viewModle.delMyArchiveFromCloud(activity, ModgameCloudListFragment.this.getArchiveDataPop());
                        ModgameCloudListFragment.this.getDelFragment().dismiss();
                    }
                });
                if (Intrinsics.areEqual(getArchiveDataPop().getId(), "0")) {
                    getDelFragment().setDatas(new DialogData("删除本地默认存档", "删除后，本地默认存档进度将被清空，确定删除吗？", "删除", "取消", false, 16, null));
                } else {
                    getDelFragment().setDatas(new DialogData("删除社区内您发布的此存档", "注：只删除存档社区内的存档，不会影响本地默认存档", "删除", "取消", false, 16, null));
                }
            }
            DelArchiveDialog delFragment = getDelFragment();
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parentFragmentManager");
            delFragment.show(parentFragmentManager, "");
        } else if (valueOf != null && valueOf.intValue() == R.id.reDownload) {
            getPopWindow().dismiss();
            if (this.type == 3) {
                Intent intent = new Intent(getActivity(), ModUploadArchiveActivity.class);
                ArrayList arrayList = new ArrayList();
                arrayList.add(getArchiveDataPop());
                intent.putExtra("archives", arrayList);
                ModGameDetailBean modGameDetailBean = this.modgameBean;
                Intrinsics.checkNotNull(modGameDetailBean);
                intent.putExtra("archiveFileSuffix", modGameDetailBean.getCloud_archive_local_path().getArchiveFileSuffix());
                startActivity(intent);
                return;
            }
            getRedownFragment().setClickDelDialogListener(new ClickDelDialogListener() { // from class: com.join.kotlin.ui.cloudarchive.ModgameCloudListFragment$onClick$3
                @Override // com.join.kotlin.ui.cloudarchive.dialog.ClickDelDialogListener
                public void onClickCancleButn() {
                    ModgameCloudListFragment.this.getRedownFragment().dismiss();
                }

                @Override // com.join.kotlin.ui.cloudarchive.dialog.ClickDelDialogListener
                public void onClickOkButn() {
                    String archiveLocalZipPath = ModgameCloudListFragment.this.getArchiveDataPop().getArchiveLocalZipPath();
                    if (!(archiveLocalZipPath == null || archiveLocalZipPath.length() == 0)) {
                        UtilsMy.delete(new File(ModgameCloudListFragment.this.getArchiveDataPop().getArchiveLocalZipPath()));
                    }
                    com.join.mgps.va.overmind.f fVar = com.join.mgps.va.overmind.f.f54952a;
                    String packageName = ModgameCloudListFragment.this.getArchiveDataPop().getPackageName();
                    Intrinsics.checkNotNullExpressionValue(packageName, "archiveDataPop.packageName");
                    String x4 = com.join.mgps.va.overmind.f.x(fVar, packageName, 0, 2, null);
                    UtilsMy.delete(new File(x4, "/cloudArchives/" + ModgameCloudListFragment.this.getArchiveDataPop().getId()));
                    DownloadArchiveDialog downloadArchiveDialog = new DownloadArchiveDialog();
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("archive", ModgameCloudListFragment.this.getArchiveDataPop());
                    bundle.putBoolean("installInExtPlug", ModgameCloudListFragment.this.getViewModleShareViewModle().getInstallInExtPlug());
                    bundle.putSerializable("cloud_archive_local_path", ModgameCloudListFragment.this.getViewModle().getCloud_archive_local_path().getValue());
                    downloadArchiveDialog.setArguments(bundle);
                    if (EXTKt.dialogFragmentCanShow(downloadArchiveDialog)) {
                        downloadArchiveDialog.show(ModgameCloudListFragment.this.getChildFragmentManager(), "dialog");
                    }
                    ModgameCloudListFragment.this.getRedownFragment().dismiss();
                }
            });
            getRedownFragment().setDatas(new DialogData("重新下载", "重新下载后，云存档将会覆盖掉本地现有存档，确认重新下载吗？", "重新下载", "取消", false, 16, null));
            Bundle bundle = new Bundle();
            if (getArchiveDataPop().getArchiveLocalPath() != null) {
                ArchiveData archiveDataPop = getArchiveDataPop();
                archiveDataPop.setPlayTime(y.q(getViewModle().getRequest().getFileUpdateTimeMain(new File(getArchiveDataPop().getArchiveLocalPath()))) + "玩过");
            }
            bundle.putSerializable("archive", getArchiveDataPop());
            bundle.putSerializable("cloud_archive_local_path", getViewModle().getCloud_archive_local_path().getValue());
            getRedownFragment().setArguments(bundle);
            RedownArchiveDialog redownFragment = getRedownFragment();
            FragmentManager parentFragmentManager2 = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager2, "parentFragmentManager");
            redownFragment.show(parentFragmentManager2, "");
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
            EXTKt.checkHasLogin(context, new Function0<Unit>() { // from class: com.join.kotlin.ui.cloudarchive.ModgameCloudListFragment$onClickDislike$1
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
                    ModGameCloudViewModle viewModle = ModgameCloudListFragment.this.getViewModle();
                    FragmentActivity requireActivity = ModgameCloudListFragment.this.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                    viewModle.commentArchive(requireActivity, archive, "NEGATIVE", ModgameCloudListFragment.this.getType());
                }
            });
        }
    }

    @Override // com.join.kotlin.ui.cloudarchive.adapter.OnClickArchiveListener
    public void onClickDomain(@Nullable DomainInfoBean domainInfoBean) {
        if (domainInfoBean == null) {
            return;
        }
        UtilsMy.h4(getContext(), domainInfoBean.getInfo(), "single_game_archive");
        com.papa.sim.statistic.p.l(getContext()).O1(Event.pdSingleArchiveClick, new Ext().setGameId(this.gameId).setIsJoin(domainInfoBean.getIs_join()).setTestAbNumber(domainInfoBean.getAb_test_number()));
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

    /* JADX WARN: Type inference failed for: r1v1, types: [com.github.snowdream.android.app.downloader.DownloadTask, T] */
    @Override // com.join.kotlin.ui.cloudarchive.adapter.OnClickArchiveListener
    public void onClickRun(@NotNull final ArchiveData archive) {
        Intrinsics.checkNotNullParameter(archive, "archive");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? F = p1.f.K().F(archive.getGame_id());
        objectRef.element = F;
        if (F != 0) {
            com.join.mgps.va.overmind.d d5 = com.join.mgps.va.overmind.d.f54937g.d();
            DownloadTask downloadTask = (DownloadTask) objectRef.element;
            if (d5.N(downloadTask != null ? downloadTask.getPackageName() : null)) {
                APKUtils.Companion companion = APKUtils.f14829a;
                if (companion.e(getContext(), (DownloadTask) objectRef.element) || companion.g(getContext(), new Function0<Unit>() { // from class: com.join.kotlin.ui.cloudarchive.ModgameCloudListFragment$onClickRun$1
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
                        ModgameCloudListFragment.this.onClickRunGame(archive, objectRef.element);
                    }
                })) {
                    return;
                }
            }
        } else {
            w0.e(archive.getGame_id() + " download task is null.");
        }
        onClickRunGame(archive, (DownloadTask) objectRef.element);
    }

    public final void onClickRunGame(@NotNull final ArchiveData archive, @Nullable DownloadTask downloadTask) {
        String valueOf;
        String valueOf2;
        Intrinsics.checkNotNullParameter(archive, "archive");
        if (downloadTask == null) {
            CloudShareViewModle.CloudShareEvent cloudShareEvent = new CloudShareViewModle.CloudShareEvent();
            cloudShareEvent.setShowdownloadModDialog(1);
            LiveDataExtensionKt.setEvent(getViewModleShareViewModle().getEvent(), cloudShareEvent);
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                d.a aVar = com.join.mgps.va.overmind.d.f54937g;
                String packageName = downloadTask.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "downloadTask.getPackageName()");
                aVar.i(packageName, downloadTask.getResource_path());
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (com.join.mgps.va.overmind.d.H(com.join.mgps.va.overmind.d.f54937g.d(), getViewModle().getPackageName(), 0, 2, null) && downloadTask.getStatus() == 5) {
            int i4 = 3;
            if (archive.getStatus() == 8) {
                int i5 = this.type;
                if (i5 == 1) {
                    i4 = 1;
                } else if (i5 != 2) {
                    i4 = 4;
                } else if (Intrinsics.areEqual(archive.getId(), "0")) {
                    i4 = 2;
                }
                com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(getContext());
                Event event = Event.clickStartCloudSave;
                Ext gameId = new Ext().setFrom(String.valueOf(i4)).setGameId(archive.getGame_id());
                ModGameArchiveTagBean modGameArchiveTagBean = this.archiveTag;
                if (modGameArchiveTagBean == null) {
                    valueOf2 = null;
                } else {
                    valueOf2 = String.valueOf(modGameArchiveTagBean != null ? Integer.valueOf(modGameArchiveTagBean.getType()) : null);
                }
                Ext position = gameId.setPosition(valueOf2);
                ModGameArchiveTagBean modGameArchiveTagBean2 = this.archiveTag;
                l4.X(event, position, modGameArchiveTagBean2 != null ? modGameArchiveTagBean2.getTagId() : null);
                CloudArchiveTable p4 = b2.g.t().p(archive.getId());
                if (p4 != null && p4.getIsFirstRun() == 1) {
                    p4.setIsFirstRun(2);
                    b2.g.t().update(p4);
                    d0.a().c(new ArchiveDownEvent(10, archive));
                }
                startGame(archive);
                return;
            } else if (archive.getStatus() == 0) {
                int i6 = this.type;
                int i7 = i6 != 1 ? i6 == 2 ? 3 : 4 : 1;
                com.papa.sim.statistic.p l5 = com.papa.sim.statistic.p.l(getContext());
                Event event2 = Event.clickDownCloudSave;
                Ext gameId2 = new Ext().setFrom(String.valueOf(i7)).setGameId(archive.getGame_id());
                ModGameArchiveTagBean modGameArchiveTagBean3 = this.archiveTag;
                if (modGameArchiveTagBean3 == null) {
                    valueOf = null;
                } else {
                    valueOf = String.valueOf(modGameArchiveTagBean3 != null ? Integer.valueOf(modGameArchiveTagBean3.getType()) : null);
                }
                Ext position2 = gameId2.setPosition(valueOf);
                ModGameArchiveTagBean modGameArchiveTagBean4 = this.archiveTag;
                l5.X(event2, position2, modGameArchiveTagBean4 != null ? modGameArchiveTagBean4.getTagId() : null);
                Context context = getContext();
                if (context != null) {
                    EXTKt.checkHasNetWork(context, new Function0<Unit>() { // from class: com.join.kotlin.ui.cloudarchive.ModgameCloudListFragment$onClickRunGame$3
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
                            if (ArchiveData.this.getUid() != AccountUtil_.getInstance_(this.getContext()).getAccountData().getUid()) {
                                this.showDownloadDialog(ArchiveData.this, 0);
                                return;
                            }
                            DelArchiveDialog checkDownloadTypeDialog = this.getCheckDownloadTypeDialog();
                            final ModgameCloudListFragment modgameCloudListFragment = this;
                            final ArchiveData archiveData = ArchiveData.this;
                            checkDownloadTypeDialog.setClickDelDialogListener(new ClickDelDialogListener() { // from class: com.join.kotlin.ui.cloudarchive.ModgameCloudListFragment$onClickRunGame$3.1
                                @Override // com.join.kotlin.ui.cloudarchive.dialog.ClickDelDialogListener
                                public void onClickCancleButn() {
                                    ModgameCloudListFragment.this.showDownloadDialog(archiveData, 0);
                                    ModgameCloudListFragment.this.getCheckDownloadTypeDialog().dismiss();
                                }

                                @Override // com.join.kotlin.ui.cloudarchive.dialog.ClickDelDialogListener
                                public void onClickOkButn() {
                                    ModgameCloudListFragment.this.showDownloadDialog(archiveData, 1);
                                    ModgameCloudListFragment.this.getCheckDownloadTypeDialog().dismiss();
                                }
                            });
                            this.getCheckDownloadTypeDialog().setDatas(new DialogData("是否覆盖本地默认存档？", "覆盖本地存档后，你可再次分享存档。", "覆盖", "不覆盖", false, 16, null));
                            if (EXTKt.dialogFragmentCanShow(this.getCheckDownloadTypeDialog())) {
                                DelArchiveDialog checkDownloadTypeDialog2 = this.getCheckDownloadTypeDialog();
                                FragmentManager childFragmentManager = this.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
                                checkDownloadTypeDialog2.show(childFragmentManager, "checkDownloadTypeDialog");
                            }
                        }
                    });
                    return;
                }
                return;
            } else {
                return;
            }
        }
        getViewModleShareViewModle().getShowDownlloadDialog().setValue(1);
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
        ViewDataBinding inflate = DataBindingUtil.inflate(inflater, R.layout.recyclerview_layout_databinding, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            inf…          false\n        )");
        setDataBinding((RecyclerviewLayoutDatabindingBinding) inflate);
        initData();
        RecyclerviewLayoutDatabindingBinding dataBinding = getDataBinding();
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
            EXTKt.checkHasLogin(context, new Function0<Unit>() { // from class: com.join.kotlin.ui.cloudarchive.ModgameCloudListFragment$onPraise$1
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
                    ModGameCloudViewModle viewModle = ModgameCloudListFragment.this.getViewModle();
                    FragmentActivity requireActivity = ModgameCloudListFragment.this.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                    viewModle.commentArchive(requireActivity, archive, SimpleComparison.LIKE_OPERATION, ModgameCloudListFragment.this.getType());
                }
            });
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onRecivedDownLoadEVent(@NotNull ArchiveDownEvent archiveDownEvent) {
        Intrinsics.checkNotNullParameter(archiveDownEvent, "archiveDownEvent");
        getViewModle().onRecivedDownLoadEVent(archiveDownEvent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        DownloadTask F;
        super.onResume();
        ArchiveData lastStartArchive = getViewModleShareViewModle().getLastStartArchive();
        boolean z4 = false;
        if (lastStartArchive != null) {
            String id = lastStartArchive.getId();
            if (!(id == null || id.length() == 0)) {
                b2.g t4 = b2.g.t();
                Intrinsics.checkNotNull(lastStartArchive);
                CloudArchiveTable p4 = t4.p(lastStartArchive.getId());
                if (p4 != null && p4.getIsFirstRun() == 2) {
                    PrefDef_ prefDef_ = new PrefDef_(getContext());
                    if (!(g2.i(prefDef_.lastLaunchModGameId().d()) && (((F = p1.f.K().F(prefDef_.lastLaunchModGameId().d())) != null && APKUtils.f14829a.z(F) && (F.getGame_run_state() == 3 || F.getGame_run_state() == 0)) || (APKUtils.f14829a.v(F) && F.getGame_run_state() == 0)))) {
                        if (lastStartArchive.getIsLike() == 0 && lastStartArchive.getIsUnLike() == 0) {
                            CommentArchiveDialog commentArchiveDialog = new CommentArchiveDialog();
                            Bundle bundle = new Bundle();
                            bundle.putSerializable("archive", lastStartArchive);
                            commentArchiveDialog.setArguments(bundle);
                            String archiveDesc = lastStartArchive.getArchiveDesc();
                            Intrinsics.checkNotNullExpressionValue(archiveDesc, "lastStartArchive!!.archiveDesc");
                            commentArchiveDialog.setDatas(new DialogData(archiveDesc, "请评价一下你刚才玩的云存档吧～", null, null, false, 28, null));
                            FragmentManager parentFragmentManager = getParentFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parentFragmentManager");
                            commentArchiveDialog.show(parentFragmentManager, "");
                        }
                        getViewModleShareViewModle().setLastStartArchive(new ArchiveData());
                    }
                }
            }
        }
        this.page = 1;
        n0 accountData = AccountUtil_.getInstance_(getActivity()).getAccountData();
        Intrinsics.checkNotNullExpressionValue(accountData, "getInstance_(activity).accountData");
        if (!g2.h(accountData.getToken()) && !AccountUtil_.getInstance_(getActivity()).isTourist()) {
            z4 = true;
        }
        if (z4 != this.isLogin) {
            loadData();
            this.isLogin = z4;
        }
    }

    public final void scrollToTop() {
        if (getDataBinding() == null) {
            return;
        }
        getDataBinding().f26242b.smoothScrollToPosition(0);
    }

    public final void setArchiveDataPop(@NotNull ArchiveData archiveData) {
        Intrinsics.checkNotNullParameter(archiveData, "<set-?>");
        this.archiveDataPop = archiveData;
    }

    public final void setArchiveTag(@Nullable ModGameArchiveTagBean modGameArchiveTagBean) {
        this.archiveTag = modGameArchiveTagBean;
    }

    public final void setDataBinding(@NotNull RecyclerviewLayoutDatabindingBinding recyclerviewLayoutDatabindingBinding) {
        Intrinsics.checkNotNullParameter(recyclerviewLayoutDatabindingBinding, "<set-?>");
        this.dataBinding = recyclerviewLayoutDatabindingBinding;
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

    public final void setModgameBean(@Nullable ModGameDetailBean modGameDetailBean) {
        this.modgameBean = modGameDetailBean;
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
        Context context = getContext();
        if (context != null) {
            EXTKt.checkHasNetWork(context, new Function0<Unit>() { // from class: com.join.kotlin.ui.cloudarchive.ModgameCloudListFragment$uploadCloud$1
                /* JADX INFO: Access modifiers changed from: package-private */
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
                    GamedetialModleFourBean mod_game_info;
                    com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(ModgameCloudListFragment.this.getContext());
                    Event event = Event.clickIssueCloudSaveButton;
                    Ext ext = new Ext();
                    ModGameDetailBean modgameBean = ModgameCloudListFragment.this.getModgameBean();
                    l4.O1(event, ext.setGameId((modgameBean == null || (mod_game_info = modgameBean.getMod_game_info()) == null) ? null : mod_game_info.getGame_id()));
                    Intent intent = new Intent(ModgameCloudListFragment.this.getActivity(), ModUploadArchiveActivity.class);
                    List<ArchiveData> value = ModgameCloudListFragment.this.getViewModleShareViewModle().getLocalArchiveLists().getValue();
                    if (value != null && !value.isEmpty()) {
                        intent.putExtra("archives", (Serializable) value);
                        intent.putExtra("runIngArchiveId", ModgameCloudListFragment.this.getViewModleShareViewModle().getRunIngArchiveId().getValue());
                        ModGameDetailBean modgameBean2 = ModgameCloudListFragment.this.getModgameBean();
                        Intrinsics.checkNotNull(modgameBean2);
                        intent.putExtra("archiveFileSuffix", modgameBean2.getCloud_archive_local_path().getArchiveFileSuffix());
                        ModgameCloudListFragment.this.startActivity(intent);
                        return;
                    }
                    l2.a(ModgameCloudListFragment.this.getContext()).b("本地默认存档为空，无法分享");
                }
            });
        }
    }
}
