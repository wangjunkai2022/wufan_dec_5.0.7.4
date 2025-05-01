package com.join.kotlin.ui.cloudarchive;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.SlidingTabLayout;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ModgameCloudArchiveFragmentBinding;
import com.join.kotlin.domain.ext.EXTKt;
import com.join.kotlin.ui.cloudarchive.ModGameCloudArchiveFragment;
import com.join.kotlin.ui.cloudarchive.data.ArchiveData;
import com.join.kotlin.ui.cloudarchive.dialog.ClickDelDialogListener;
import com.join.kotlin.ui.cloudarchive.dialog.DialogData;
import com.join.kotlin.ui.cloudarchive.dialog.NoticeArchiveDialog;
import com.join.mgps.Util.l2;
import com.join.mgps.adapter.FragmentPagerAdapter;
import com.join.mgps.db.tables.CloudArchiveTable;
import com.join.mgps.dto.GamedetialModleFourBean;
import com.join.mgps.dto.ModGameDetailBean;
import com.join.mgps.service.CommonService_;
import com.join.mgps.va.service.MessengerService;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ModGameCloudArchiveFragment.kt */
/* loaded from: classes3.dex */
public final class ModGameCloudArchiveFragment extends Fragment implements View.OnClickListener {
    @Nullable
    private ModgameCloudArchiveFragmentBinding dataBinding;
    @NotNull
    private String gameId;
    @Nullable
    private String imagePath;
    @Nullable
    private ModGameDetailBean modgameBean;
    @NotNull
    private final Lazy noticeDialog$delegate;
    @NotNull
    private final Lazy receiver$delegate;
    @NotNull
    private String runingArchiveId;
    @NotNull
    private final Lazy viewModle$delegate;
    @NotNull
    private final Lazy viewModleShareViewModle$delegate;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ModGameCloudArchiveFragment.kt */
    /* loaded from: classes3.dex */
    public final class MyReceiver extends BroadcastReceiver {
        public MyReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context context, @Nullable Intent intent) {
            if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, MessengerService.E)) {
                ModGameCloudArchiveFragment.this.setImagePath(intent.getStringExtra(CommonService_.c0.f54306b));
                ModGameCloudArchiveFragment.this.startupload();
            }
        }
    }

    public ModGameCloudArchiveFragment() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        lazy = LazyKt__LazyJVMKt.lazy(new Function0<ModGameCloudViewModle>() { // from class: com.join.kotlin.ui.cloudarchive.ModGameCloudArchiveFragment$viewModle$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ModGameCloudViewModle invoke() {
                return (ModGameCloudViewModle) new ViewModelProvider(ModGameCloudArchiveFragment.this, new ViewModelProvider.NewInstanceFactory()).get(ModGameCloudViewModle.class);
            }
        });
        this.viewModle$delegate = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new Function0<CloudShareViewModle>() { // from class: com.join.kotlin.ui.cloudarchive.ModGameCloudArchiveFragment$viewModleShareViewModle$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CloudShareViewModle invoke() {
                FragmentActivity requireActivity = ModGameCloudArchiveFragment.this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                return (CloudShareViewModle) new ViewModelProvider(requireActivity, new ViewModelProvider.NewInstanceFactory()).get(CloudShareViewModle.class);
            }
        });
        this.viewModleShareViewModle$delegate = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new Function0<MyReceiver>() { // from class: com.join.kotlin.ui.cloudarchive.ModGameCloudArchiveFragment$receiver$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ModGameCloudArchiveFragment.MyReceiver invoke() {
                return new ModGameCloudArchiveFragment.MyReceiver();
            }
        });
        this.receiver$delegate = lazy3;
        this.gameId = "1";
        this.runingArchiveId = "0";
        lazy4 = LazyKt__LazyJVMKt.lazy(new Function0<NoticeArchiveDialog>() { // from class: com.join.kotlin.ui.cloudarchive.ModGameCloudArchiveFragment$noticeDialog$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final NoticeArchiveDialog invoke() {
                return new NoticeArchiveDialog();
            }
        });
        this.noticeDialog$delegate = lazy4;
    }

    private final MyReceiver getReceiver() {
        return (MyReceiver) this.receiver$delegate.getValue();
    }

    private final void showTabUi() {
        final ArrayList arrayList = new ArrayList();
        Bundle bundle = new Bundle();
        bundle.putString("gameId", this.gameId);
        bundle.putInt("type", 2);
        bundle.putSerializable("datas", this.modgameBean);
        arrayList.add(new FragmentPagerAdapter.a("本地", Fragment.instantiate(requireActivity(), ModgameCloudListFragment.class.getName(), bundle)));
        ModgameCloudListFragment modgameCloudListFragment = new ModgameCloudListFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString("gameId", this.gameId);
        bundle2.putInt("type", 3);
        bundle2.putSerializable("datas", this.modgameBean);
        ModGameCloudViewModle viewModle = getViewModle();
        ModGameDetailBean modGameDetailBean = this.modgameBean;
        Intrinsics.checkNotNull(modGameDetailBean);
        String packageName = modGameDetailBean.getMod_game_info().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "modgameBean!!.mod_game_info.packageName");
        viewModle.setPackageName(packageName);
        modgameCloudListFragment.setArguments(bundle2);
        arrayList.add(new FragmentPagerAdapter.a("已发布", modgameCloudListFragment));
        FragmentPagerAdapter fragmentPagerAdapter = new FragmentPagerAdapter(getChildFragmentManager(), arrayList);
        ModgameCloudArchiveFragmentBinding modgameCloudArchiveFragmentBinding = this.dataBinding;
        Intrinsics.checkNotNull(modgameCloudArchiveFragmentBinding);
        modgameCloudArchiveFragmentBinding.f25144d.setAdapter(fragmentPagerAdapter);
        ModgameCloudArchiveFragmentBinding modgameCloudArchiveFragmentBinding2 = this.dataBinding;
        Intrinsics.checkNotNull(modgameCloudArchiveFragmentBinding2);
        SlidingTabLayout slidingTabLayout = modgameCloudArchiveFragmentBinding2.f25142b;
        ModgameCloudArchiveFragmentBinding modgameCloudArchiveFragmentBinding3 = this.dataBinding;
        Intrinsics.checkNotNull(modgameCloudArchiveFragmentBinding3);
        slidingTabLayout.setViewPager(modgameCloudArchiveFragmentBinding3.f25144d);
        ModgameCloudArchiveFragmentBinding modgameCloudArchiveFragmentBinding4 = this.dataBinding;
        Intrinsics.checkNotNull(modgameCloudArchiveFragmentBinding4);
        modgameCloudArchiveFragmentBinding4.f25144d.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.join.kotlin.ui.cloudarchive.ModGameCloudArchiveFragment$showTabUi$1
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i4) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i4, float f5, int i5) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i4) {
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ModgameCloudArchiveFragmentBinding dataBinding = this.getDataBinding();
                    Intrinsics.checkNotNull(dataBinding);
                    TextView j4 = dataBinding.f25142b.j(i5);
                    if (i5 == i4) {
                        j4.setTypeface(Typeface.defaultFromStyle(1));
                    } else {
                        j4.setTypeface(Typeface.defaultFromStyle(0));
                    }
                }
                if (i4 == 0) {
                    this.getViewModle().getShowPosition().setValue(1);
                } else if (i4 == 1) {
                    this.getViewModle().getShowPosition().setValue(2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startupload() {
        Context context = getContext();
        if (context != null) {
            EXTKt.checkHasNetWork(context, new Function0<Unit>() { // from class: com.join.kotlin.ui.cloudarchive.ModGameCloudArchiveFragment$startupload$1
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
                    Context context2 = ModGameCloudArchiveFragment.this.getContext();
                    if (context2 != null) {
                        final ModGameCloudArchiveFragment modGameCloudArchiveFragment = ModGameCloudArchiveFragment.this;
                        EXTKt.checkHasLogin(context2, new Function0<Unit>() { // from class: com.join.kotlin.ui.cloudarchive.ModGameCloudArchiveFragment$startupload$1.1
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
                                Intent intent = new Intent(ModGameCloudArchiveFragment.this.getActivity(), ModUploadArchiveActivity.class);
                                List<ArchiveData> value = ModGameCloudArchiveFragment.this.getViewModleShareViewModle().getLocalArchiveLists().getValue();
                                if (value != null && !value.isEmpty()) {
                                    intent.putExtra("archives", (Serializable) value);
                                    intent.putExtra("runIngArchiveId", ModGameCloudArchiveFragment.this.getViewModleShareViewModle().getRunIngArchiveId().getValue());
                                    ModGameDetailBean modgameBean = ModGameCloudArchiveFragment.this.getModgameBean();
                                    Intrinsics.checkNotNull(modgameBean);
                                    intent.putExtra("archiveFileSuffix", modgameBean.getCloud_archive_local_path().getArchiveFileSuffix());
                                    intent.putExtra(CommonService_.c0.f54306b, ModGameCloudArchiveFragment.this.getImagePath());
                                    ModGameCloudArchiveFragment.this.startActivity(intent);
                                    return;
                                }
                                l2.a(ModGameCloudArchiveFragment.this.getContext()).b("本地默认存档为空，无法分享");
                            }
                        });
                    }
                }
            });
        }
    }

    @Nullable
    public final ModgameCloudArchiveFragmentBinding getDataBinding() {
        return this.dataBinding;
    }

    @NotNull
    public final String getGameId() {
        return this.gameId;
    }

    @Nullable
    public final String getImagePath() {
        return this.imagePath;
    }

    @Nullable
    public final ModGameDetailBean getModgameBean() {
        return this.modgameBean;
    }

    @NotNull
    public final NoticeArchiveDialog getNoticeDialog() {
        return (NoticeArchiveDialog) this.noticeDialog$delegate.getValue();
    }

    @NotNull
    public final String getRuningArchiveId() {
        return this.runingArchiveId;
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
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("gameId", "");
            Intrinsics.checkNotNullExpressionValue(string, "getString(\"gameId\", \"\")");
            this.gameId = string;
            Serializable serializable = arguments.getSerializable("datas");
            Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.join.mgps.dto.ModGameDetailBean");
            this.modgameBean = (ModGameDetailBean) serializable;
        }
        ModgameCloudArchiveFragmentBinding modgameCloudArchiveFragmentBinding = this.dataBinding;
        if (modgameCloudArchiveFragmentBinding != null) {
            modgameCloudArchiveFragmentBinding.h(getViewModle());
        }
        showTabUi();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View view) {
        Long value;
        GamedetialModleFourBean mod_game_info;
        com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(getContext());
        Event event = Event.clickIssueCloudSaveButton;
        Ext ext = new Ext();
        ModGameDetailBean modGameDetailBean = this.modgameBean;
        l4.O1(event, ext.setGameId((modGameDetailBean == null || (mod_game_info = modGameDetailBean.getMod_game_info()) == null) ? null : mod_game_info.getGame_id()));
        if (getViewModleShareViewModle().getRunIngArchiveId().getValue() != null && ((value = getViewModleShareViewModle().getRunIngArchiveId().getValue()) == null || value.longValue() != 0)) {
            b2.g t4 = b2.g.t();
            Long value2 = getViewModleShareViewModle().getRunIngArchiveId().getValue();
            Intrinsics.checkNotNull(value2);
            CloudArchiveTable p4 = t4.p(String.valueOf(value2.longValue()));
            if (p4 != null) {
                ArchiveData archiveData = (ArchiveData) JsonMapper.getInstance().fromJson(p4.getArchiveDataJson(), ArchiveData.class);
                if (archiveData != null) {
                    NoticeArchiveDialog noticeDialog = getNoticeDialog();
                    noticeDialog.setDatas(new DialogData("提示", "当前本地是  " + archiveData.getNickname() + "  的存档，请切换回默认存档后再发布", "切换存档", null, true, 8, null));
                    getNoticeDialog().setClickDelDialogListener(new ClickDelDialogListener() { // from class: com.join.kotlin.ui.cloudarchive.ModGameCloudArchiveFragment$onClick$1
                        @Override // com.join.kotlin.ui.cloudarchive.dialog.ClickDelDialogListener
                        public void onClickCancleButn() {
                        }

                        @Override // com.join.kotlin.ui.cloudarchive.dialog.ClickDelDialogListener
                        public void onClickOkButn() {
                            ModGameCloudArchiveFragment.this.getNoticeDialog().dismiss();
                        }
                    });
                    NoticeArchiveDialog noticeDialog2 = getNoticeDialog();
                    FragmentManager parentFragmentManager = getParentFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parentFragmentManager");
                    noticeDialog2.show(parentFragmentManager, "");
                    return;
                }
            }
            startupload();
        } else if (!com.join.mgps.va.overmind.d.H(com.join.mgps.va.overmind.d.f54937g.d(), getViewModle().getPackageName(), 0, 2, null)) {
            getViewModleShareViewModle().getShowDownlloadDialog().setValue(1);
        } else {
            startupload();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View root;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ModgameCloudArchiveFragmentBinding modgameCloudArchiveFragmentBinding = (ModgameCloudArchiveFragmentBinding) DataBindingUtil.inflate(inflater, R.layout.modgame_cloud_archive_fragment, viewGroup, false);
        this.dataBinding = modgameCloudArchiveFragmentBinding;
        Intrinsics.checkNotNull(modgameCloudArchiveFragmentBinding);
        modgameCloudArchiveFragmentBinding.setLifecycleOwner(this);
        ModgameCloudArchiveFragmentBinding modgameCloudArchiveFragmentBinding2 = this.dataBinding;
        if (modgameCloudArchiveFragmentBinding2 != null && (root = modgameCloudArchiveFragmentBinding2.getRoot()) != null) {
            root.setBackgroundResource(R.drawable.alph);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(MessengerService.E);
        Context context = getContext();
        if (context != null) {
            context.registerReceiver(getReceiver(), intentFilter);
        }
        ModgameCloudArchiveFragmentBinding modgameCloudArchiveFragmentBinding3 = this.dataBinding;
        if (modgameCloudArchiveFragmentBinding3 != null) {
            return modgameCloudArchiveFragmentBinding3.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Context context = getContext();
        if (context != null) {
            context.unregisterReceiver(getReceiver());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        initData();
    }

    public final void setDataBinding(@Nullable ModgameCloudArchiveFragmentBinding modgameCloudArchiveFragmentBinding) {
        this.dataBinding = modgameCloudArchiveFragmentBinding;
    }

    public final void setGameId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.gameId = str;
    }

    public final void setImagePath(@Nullable String str) {
        this.imagePath = str;
    }

    public final void setModgameBean(@Nullable ModGameDetailBean modGameDetailBean) {
        this.modgameBean = modGameDetailBean;
    }

    public final void setRuningArchiveId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.runingArchiveId = str;
    }
}
