package com.join.kotlin.ui.cloudarchive;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.BaseAppCompatActivity;
import com.google.android.material.textfield.TextInputEditText;
import com.join.android.app.component.album.MyAlbumActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ModUploadArchiveActivityBinding;
import com.join.kotlin.domain.ext.EXTKt;
import com.join.kotlin.ui.cloudarchive.data.ArchiveData;
import com.join.kotlin.ui.cloudarchive.data.ModGameArchivePathData;
import com.join.kotlin.ui.cloudarchive.dialog.ChoiceArchiveDialog;
import com.join.kotlin.ui.cloudarchive.dialog.ClickDelDialogListener;
import com.join.kotlin.ui.cloudarchive.dialog.DialogData;
import com.join.kotlin.ui.cloudarchive.dialog.NoticeWhiteDialog;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.b0;
import com.join.mgps.Util.l2;
import com.join.mgps.dialog.d1;
import com.join.mgps.dialog.e1;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.service.CommonService_;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.psk.kotlin.ext.CommonExtKt;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ModUploadArchiveActivity.kt */
@SourceDebugExtension({"SMAP\nModUploadArchiveActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModUploadArchiveActivity.kt\ncom/join/kotlin/ui/cloudarchive/ModUploadArchiveActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,393:1\n1011#2,2:394\n*S KotlinDebug\n*F\n+ 1 ModUploadArchiveActivity.kt\ncom/join/kotlin/ui/cloudarchive/ModUploadArchiveActivity\n*L\n169#1:394,2\n*E\n"})
/* loaded from: classes3.dex */
public final class ModUploadArchiveActivity extends BaseAppCompatActivity implements TextViewBindingAdapter.OnTextChanged, TextViewBindingAdapter.BeforeTextChanged, View.OnClickListener {
    @NotNull
    private final Lazy databinDing$delegate;
    @NotNull
    private final Lazy dialog$delegate;
    @NotNull
    private final Lazy dialogChoice$delegate;
    @NotNull
    private final Lazy dialogLoding$delegate;
    @NotNull
    private String imagePath;
    private boolean isFromGame;
    @NotNull
    private final Lazy noticeDialog$delegate;
    private long runIngArchiveId;
    @NotNull
    private final Lazy viewModle$delegate;
    @NotNull
    private final Lazy viewModleLoadData$delegate;

    public ModUploadArchiveActivity() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Lazy lazy5;
        Lazy lazy6;
        Lazy lazy7;
        lazy = LazyKt__LazyJVMKt.lazy(new Function0<ModUploadArchiveViewModle>() { // from class: com.join.kotlin.ui.cloudarchive.ModUploadArchiveActivity$viewModle$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ModUploadArchiveViewModle invoke() {
                return (ModUploadArchiveViewModle) new ViewModelProvider(ModUploadArchiveActivity.this, new ViewModelProvider.NewInstanceFactory()).get(ModUploadArchiveViewModle.class);
            }
        });
        this.viewModle$delegate = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new Function0<ModUploadArchiveActivityBinding>() { // from class: com.join.kotlin.ui.cloudarchive.ModUploadArchiveActivity$databinDing$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ModUploadArchiveActivityBinding invoke() {
                return (ModUploadArchiveActivityBinding) DataBindingUtil.setContentView(ModUploadArchiveActivity.this, R.layout.mod_upload_archive_activity);
            }
        });
        this.databinDing$delegate = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new Function0<e1>() { // from class: com.join.kotlin.ui.cloudarchive.ModUploadArchiveActivity$dialog$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final e1 invoke() {
                return b0.f0(ModUploadArchiveActivity.this).F(ModUploadArchiveActivity.this);
            }
        });
        this.dialog$delegate = lazy3;
        lazy4 = LazyKt__LazyJVMKt.lazy(new Function0<CloudShareViewModle>() { // from class: com.join.kotlin.ui.cloudarchive.ModUploadArchiveActivity$viewModleLoadData$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CloudShareViewModle invoke() {
                return (CloudShareViewModle) new ViewModelProvider(ModUploadArchiveActivity.this, new ViewModelProvider.NewInstanceFactory()).get(CloudShareViewModle.class);
            }
        });
        this.viewModleLoadData$delegate = lazy4;
        lazy5 = LazyKt__LazyJVMKt.lazy(new Function0<d1>() { // from class: com.join.kotlin.ui.cloudarchive.ModUploadArchiveActivity$dialogLoding$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final d1 invoke() {
                return b0.f0(ModUploadArchiveActivity.this).x(ModUploadArchiveActivity.this);
            }
        });
        this.dialogLoding$delegate = lazy5;
        this.imagePath = "";
        lazy6 = LazyKt__LazyJVMKt.lazy(new Function0<ChoiceArchiveDialog>() { // from class: com.join.kotlin.ui.cloudarchive.ModUploadArchiveActivity$dialogChoice$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ChoiceArchiveDialog invoke() {
                return new ChoiceArchiveDialog();
            }
        });
        this.dialogChoice$delegate = lazy6;
        lazy7 = LazyKt__LazyJVMKt.lazy(new Function0<NoticeWhiteDialog>() { // from class: com.join.kotlin.ui.cloudarchive.ModUploadArchiveActivity$noticeDialog$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final NoticeWhiteDialog invoke() {
                return new NoticeWhiteDialog();
            }
        });
        this.noticeDialog$delegate = lazy7;
    }

    private final ChoiceArchiveDialog getDialogChoice() {
        return (ChoiceArchiveDialog) this.dialogChoice$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0119 A[LOOP:0: B:40:0x0113->B:42:0x0119, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void initData(java.util.List<com.join.kotlin.ui.cloudarchive.data.ArchiveData> r7, java.lang.String r8, long r9) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.kotlin.ui.cloudarchive.ModUploadArchiveActivity.initData(java.util.List, java.lang.String, long):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public final void backModGame() {
        ModGameArchivePathData modGameArchivePathData;
        CloudShareViewModle viewModleLoadData = getViewModleLoadData();
        String modPackageName = (viewModleLoadData == null || (modGameArchivePathData = viewModleLoadData.getModGameArchivePathData()) == null) ? null : modGameArchivePathData.getModPackageName();
        if (modPackageName == null) {
            modPackageName = "";
        }
        ArchiveData value = getViewModle().getArchive().getValue();
        com.join.mgps.va.overmind.d.f54937g.d().U(this, value != null ? value.getUserId() : 0, modPackageName);
    }

    @Override // androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged
    public void beforeTextChanged(@Nullable CharSequence charSequence, int i4, int i5, int i6) {
    }

    @Override // android.app.Activity
    public void finish() {
        if (this.isFromGame) {
            backModGame();
        }
        super.finish();
    }

    @NotNull
    public final ModUploadArchiveActivityBinding getDatabinDing() {
        Object value = this.databinDing$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-databinDing>(...)");
        return (ModUploadArchiveActivityBinding) value;
    }

    @NotNull
    public final e1 getDialog() {
        Object value = this.dialog$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-dialog>(...)");
        return (e1) value;
    }

    @NotNull
    public final d1 getDialogLoding() {
        Object value = this.dialogLoding$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-dialogLoding>(...)");
        return (d1) value;
    }

    @NotNull
    public final String getImagePath() {
        return this.imagePath;
    }

    @NotNull
    public final NoticeWhiteDialog getNoticeDialog() {
        return (NoticeWhiteDialog) this.noticeDialog$delegate.getValue();
    }

    public final long getRunIngArchiveId() {
        return this.runIngArchiveId;
    }

    @NotNull
    public final ModUploadArchiveViewModle getViewModle() {
        return (ModUploadArchiveViewModle) this.viewModle$delegate.getValue();
    }

    @NotNull
    public final CloudShareViewModle getViewModleLoadData() {
        return (CloudShareViewModle) this.viewModleLoadData$delegate.getValue();
    }

    public final void goMyAlbumActivity4PickPic() {
        boolean z4 = false;
        if (ContextCompat.checkSelfPermission(this, com.kuaishou.weapon.p0.g.f55590j) != 0) {
            UtilsMy.O2(this, com.kuaishou.weapon.p0.g.f55590j);
        } else if (ContextCompat.checkSelfPermission(this, com.kuaishou.weapon.p0.g.f55589i) != 0) {
            UtilsMy.O2(this, com.kuaishou.weapon.p0.g.f55589i);
        } else {
            z4 = true;
        }
        if (z4) {
            Intent intent = new Intent(this, MyAlbumActivity.class);
            intent.putExtra("MAX_PICK_SIZE", 1);
            startActivityForResult(intent, 256);
        }
    }

    public final boolean isFromGame() {
        return this.isFromGame;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i4, int i5, @Nullable Intent intent) {
        Object obj;
        boolean startsWith$default;
        super.onActivityResult(i4, i5, intent);
        if (i4 == 256) {
            Bundle extras = intent != null ? intent.getExtras() : null;
            if (extras == null || (obj = extras.get(MyAlbumActivity.f14984x)) == null) {
                return;
            }
            List list = (List) obj;
            if (!((Collection) obj).isEmpty()) {
                String str = (String) list.get(0);
                startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, "content://", false, 2, null);
                if (startsWith$default) {
                    getViewModle().getImagepath().setValue(str);
                    return;
                }
                MutableLiveData<String> imagepath = getViewModle().getImagepath();
                imagepath.setValue("file://" + str);
            }
        }
    }

    @Override // com.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        o2.a.b(getDatabinDing().f24976f);
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View view) {
        CharSequence trim;
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        boolean z4 = true;
        if (valueOf != null && valueOf.intValue() == R.id.archiveLayout) {
            List<ArchiveData> value = getViewModle().getArchiveDatas().getValue();
            Intrinsics.checkNotNull(value);
            if (value.size() > 1) {
                o2.a.b(getDatabinDing().f24976f);
                Bundle bundle = new Bundle();
                bundle.putSerializable("archive", getViewModle().getArchive().getValue());
                List<ArchiveData> value2 = getViewModle().getArchiveDatas().getValue();
                Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("archiveList", (Serializable) value2);
                getDialogChoice().setArguments(bundle);
                getDialogChoice().setItemChoiced(new Function1<ArchiveData, Unit>() { // from class: com.join.kotlin.ui.cloudarchive.ModUploadArchiveActivity$onClick$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ArchiveData archiveData) {
                        invoke2(archiveData);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull ArchiveData it2) {
                        Intrinsics.checkNotNullParameter(it2, "it");
                        ModUploadArchiveActivity.this.getViewModle().getArchive().setValue(it2);
                    }
                });
                if (EXTKt.dialogFragmentCanShow(getDialogChoice())) {
                    ChoiceArchiveDialog dialogChoice = getDialogChoice();
                    FragmentManager supportFragmentManager = getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
                    dialogChoice.show(supportFragmentManager, "dialogChoice");
                }
            }
        } else if (valueOf != null && valueOf.intValue() == R.id.back) {
            o2.a.b(getDatabinDing().f24976f);
            finish();
        } else if (valueOf != null && valueOf.intValue() == R.id.choiceIcon) {
            o2.a.b(getDatabinDing().f24976f);
            goMyAlbumActivity4PickPic();
        } else if (valueOf != null && valueOf.intValue() == R.id.clearImage) {
            getViewModle().getImagepath().setValue(null);
        } else if (valueOf != null && valueOf.intValue() == R.id.save) {
            String str = this.isFromGame ? "2" : "1";
            com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(this);
            Event event = Event.clickUpCloudButton;
            Ext ext = new Ext();
            ArchiveData value3 = getViewModle().getArchive().getValue();
            l4.O1(event, ext.setGameId(value3 != null ? value3.getGame_id() : null).setFrom(str));
            MutableLiveData<String> message = getViewModle().getMessage();
            if (message.getValue() != null) {
                String value4 = message.getValue();
                Intrinsics.checkNotNull(value4);
                if (!(value4.length() == 0)) {
                    String value5 = message.getValue();
                    Intrinsics.checkNotNull(value5);
                    trim = StringsKt__StringsKt.trim((CharSequence) value5);
                    if (!(trim.toString().length() == 0)) {
                        String value6 = message.getValue();
                        Intrinsics.checkNotNull(value6);
                        if (value6.length() < 5) {
                            l2.a(this).b("存档描述不能少于5个字");
                            return;
                        } else if (com.join.mgps.Util.o.f(message.getValue())) {
                            l2.a(this).b("暂不支持输入表情！请去掉表情字符！");
                            return;
                        } else if (IntentUtil.getInstance().goLogin(this)) {
                            CommonExtKt.toast(this, "您还未登录请先登录帐号！");
                            return;
                        } else if (getViewModle().getImagepath().getValue() == null) {
                            getNoticeDialog().setDatas(new DialogData("提示", "您还未添加存档封面", "去相册选择图片", null, true, 8, null));
                            getNoticeDialog().setClickDelDialogListener(new ClickDelDialogListener() { // from class: com.join.kotlin.ui.cloudarchive.ModUploadArchiveActivity$onClick$2
                                @Override // com.join.kotlin.ui.cloudarchive.dialog.ClickDelDialogListener
                                public void onClickCancleButn() {
                                }

                                @Override // com.join.kotlin.ui.cloudarchive.dialog.ClickDelDialogListener
                                public void onClickOkButn() {
                                    ModUploadArchiveActivity.this.getNoticeDialog().dismiss();
                                    ModUploadArchiveActivity modUploadArchiveActivity = ModUploadArchiveActivity.this;
                                    modUploadArchiveActivity.onClick(modUploadArchiveActivity.getDatabinDing().f24974d);
                                }
                            });
                            if (EXTKt.dialogFragmentCanShow(getNoticeDialog())) {
                                NoticeWhiteDialog noticeDialog = getNoticeDialog();
                                FragmentManager supportFragmentManager2 = getSupportFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "supportFragmentManager");
                                noticeDialog.show(supportFragmentManager2, "noticeDialog");
                            }
                            o2.a.b(getDatabinDing().f24976f);
                            return;
                        } else {
                            getDialog().c();
                            getDialog().b("打包存档中请稍候");
                            o2.a.b(getDatabinDing().f24976f);
                            ArchiveData value7 = getViewModle().getArchive().getValue();
                            String id = value7 != null ? value7.getId() : null;
                            if (id != null && id.length() != 0) {
                                z4 = false;
                            }
                            if (!z4 && !Intrinsics.areEqual(id, "0")) {
                                getViewModle().updateArchiveMessage(this);
                                return;
                            } else {
                                getViewModle().uploadArchive(this);
                                return;
                            }
                        }
                    }
                }
            }
            l2.a(this).b("请输入存档描述");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        String str;
        super.onCreate(bundle);
        boolean z4 = false;
        this.canShowFeedBack = false;
        getDatabinDing().l(getViewModle());
        getDatabinDing().i(this);
        getDatabinDing().k(this);
        getDatabinDing().setLifecycleOwner(this);
        getDatabinDing().j(this);
        str = "";
        if (getIntent().getSerializableExtra("archives") != null) {
            Intent intent = getIntent();
            getViewModle().getArchiveFileSuffix().setValue(intent.getStringExtra("archiveFileSuffix"));
            Serializable serializableExtra = intent.getSerializableExtra("archives");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type kotlin.collections.MutableList<com.join.kotlin.ui.cloudarchive.data.ArchiveData>");
            List<ArchiveData> asMutableList = TypeIntrinsics.asMutableList(serializableExtra);
            long longExtra = intent.getLongExtra("runIngArchiveId", 0L);
            String stringExtra = intent.getStringExtra(CommonService_.c0.f54306b);
            initData(asMutableList, stringExtra != null ? stringExtra : "", longExtra);
        } else {
            this.isFromGame = true;
            getDialogLoding().b();
            Intent intent2 = getIntent();
            String stringExtra2 = intent2.getStringExtra("uploadGameId");
            String stringExtra3 = intent2.getStringExtra(CommonService_.c0.f54306b);
            if (stringExtra3 != null) {
                Intrinsics.checkNotNullExpressionValue(stringExtra3, "getStringExtra(\"imagePath\") ?: \"\"");
                str = stringExtra3;
            }
            this.imagePath = str;
            this.runIngArchiveId = intent2.getLongExtra("runIngArchiveId", 0L);
            if ((stringExtra2 == null || stringExtra2.length() == 0) ? true : true) {
                finish();
            }
            CloudShareViewModle viewModleLoadData = getViewModleLoadData();
            Intrinsics.checkNotNull(stringExtra2);
            viewModleLoadData.getDetialData(stringExtra2, this);
        }
        MutableLiveData<ResponseModel<?>> responseReult = getViewModle().getResponseReult();
        final Function1<ResponseModel<?>, Unit> function1 = new Function1<ResponseModel<?>, Unit>() { // from class: com.join.kotlin.ui.cloudarchive.ModUploadArchiveActivity$onCreate$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ResponseModel<?> responseModel) {
                invoke2(responseModel);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ResponseModel<?> responseModel) {
                ModUploadArchiveActivity.this.getDialog().dismiss();
                Integer valueOf = responseModel != null ? Integer.valueOf(responseModel.getCode()) : null;
                if (valueOf != null && valueOf.intValue() == 200) {
                    String str2 = ModUploadArchiveActivity.this.isFromGame() ? "2" : "1";
                    com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(ModUploadArchiveActivity.this);
                    Event event = Event.postArchiveSuccess;
                    Ext ext = new Ext();
                    ArchiveData value = ModUploadArchiveActivity.this.getViewModle().getArchive().getValue();
                    l4.O1(event, ext.setGameId(value != null ? value.getGame_id() : null).setFrom(str2));
                    l2.a(ModUploadArchiveActivity.this).b("发布成功！系统自动审核中");
                    ModUploadArchiveActivity.this.finish();
                    return;
                }
                l2.a(ModUploadArchiveActivity.this).b(responseModel != null ? responseModel.getMessage() : null);
            }
        };
        responseReult.observe(this, new Observer() { // from class: com.join.kotlin.ui.cloudarchive.l
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ModUploadArchiveActivity.onCreate$lambda$2(Function1.this, obj);
            }
        });
        new Timer().schedule(new TimerTask() { // from class: com.join.kotlin.ui.cloudarchive.ModUploadArchiveActivity$onCreate$$inlined$schedule$1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                final ModUploadArchiveActivity modUploadArchiveActivity = ModUploadArchiveActivity.this;
                modUploadArchiveActivity.runOnUiThread(new Runnable() { // from class: com.join.kotlin.ui.cloudarchive.ModUploadArchiveActivity$onCreate$4$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        o2.a.c(ModUploadArchiveActivity.this.getDatabinDing().f24976f);
                    }
                });
            }
        }, 500L);
        MutableLiveData<Integer> uploadProgress = getViewModle().getUploadProgress();
        final Function1<Integer, Unit> function12 = new Function1<Integer, Unit>() { // from class: com.join.kotlin.ui.cloudarchive.ModUploadArchiveActivity$onCreate$5
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke2(num);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Integer num) {
                ModUploadArchiveActivity.this.getDialog().b("上传中请稍候");
                ModUploadArchiveActivity.this.getDialog().a(num == null ? 0 : num.intValue());
                if (num != null && num.intValue() == 100) {
                    ModUploadArchiveActivity.this.getDialog().b("正在发布请稍候");
                }
            }
        };
        uploadProgress.observe(this, new Observer() { // from class: com.join.kotlin.ui.cloudarchive.m
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ModUploadArchiveActivity.onCreate$lambda$4(Function1.this, obj);
            }
        });
        MutableLiveData<List<ArchiveData>> localArchiveLists = getViewModleLoadData().getLocalArchiveLists();
        final Function1<List<ArchiveData>, Unit> function13 = new Function1<List<ArchiveData>, Unit>() { // from class: com.join.kotlin.ui.cloudarchive.ModUploadArchiveActivity$onCreate$6
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
            public final void invoke2(List<ArchiveData> it2) {
                if (!(it2 == null || it2.isEmpty())) {
                    ModUploadArchiveActivity modUploadArchiveActivity = ModUploadArchiveActivity.this;
                    Intrinsics.checkNotNullExpressionValue(it2, "it");
                    String imagePath = ModUploadArchiveActivity.this.getImagePath();
                    if (imagePath == null) {
                        imagePath = "";
                    }
                    modUploadArchiveActivity.initData(it2, imagePath, ModUploadArchiveActivity.this.getRunIngArchiveId());
                } else if (ModUploadArchiveActivity.this.getViewModleLoadData().getInitFinish()) {
                    CommonExtKt.toast(ModUploadArchiveActivity.this, "本地默认存档为空，无法分享");
                    ModUploadArchiveActivity.this.finish();
                }
            }
        };
        localArchiveLists.observe(this, new Observer() { // from class: com.join.kotlin.ui.cloudarchive.k
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ModUploadArchiveActivity.onCreate$lambda$5(Function1.this, obj);
            }
        });
        MutableLiveData<Boolean> showDialog = getViewModleLoadData().getShowDialog();
        final Function1<Boolean, Unit> function14 = new Function1<Boolean, Unit>() { // from class: com.join.kotlin.ui.cloudarchive.ModUploadArchiveActivity$onCreate$7
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke2(bool);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean bool) {
                if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                    ModUploadArchiveActivity.this.getDialogLoding().b();
                } else {
                    ModUploadArchiveActivity.this.getDialogLoding().dismiss();
                }
            }
        };
        showDialog.observe(this, new Observer() { // from class: com.join.kotlin.ui.cloudarchive.j
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ModUploadArchiveActivity.onCreate$lambda$6(Function1.this, obj);
            }
        });
    }

    @Override // androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged
    public void onTextChanged(@Nullable CharSequence charSequence, int i4, int i5, int i6) {
        getViewModle().getMessage().setValue(String.valueOf(charSequence));
        if (charSequence == null || charSequence.length() <= 60) {
            if (charSequence != null) {
                charSequence.length();
                return;
            }
            return;
        }
        getDatabinDing().f24976f.setError("达到限制字数，无法继续输入");
        getDatabinDing().f24976f.setText(charSequence.toString().subSequence(0, 60));
        TextInputEditText textInputEditText = getDatabinDing().f24976f;
        Editable text = getDatabinDing().f24976f.getText();
        Intrinsics.checkNotNull(text);
        textInputEditText.setSelection(text.length());
    }

    public final void setFromGame(boolean z4) {
        this.isFromGame = z4;
    }

    public final void setImagePath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imagePath = str;
    }

    public final void setRunIngArchiveId(long j4) {
        this.runIngArchiveId = j4;
    }
}
