package com.join.kotlin.ui.cloudarchive.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ModCommentlArchiveDialogBinding;
import com.join.kotlin.domain.ext.EXTKt;
import com.join.kotlin.ui.cloudarchive.DelArchiveDialogViewModle;
import com.join.kotlin.ui.cloudarchive.data.ArchiveData;
import com.join.mgps.Util.l2;
import com.join.mgps.db.tables.CloudArchiveTable;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa.sim.statistic.p;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CommentArchiveDialog.kt */
/* loaded from: classes3.dex */
public final class CommentArchiveDialog extends DialogFragment implements View.OnClickListener {
    public ModCommentlArchiveDialogBinding dataBinding;
    @Nullable
    private DialogData dialogData;
    @NotNull
    private final Lazy viewModle$delegate;

    public CommentArchiveDialog() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new Function0<DelArchiveDialogViewModle>() { // from class: com.join.kotlin.ui.cloudarchive.dialog.CommentArchiveDialog$viewModle$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DelArchiveDialogViewModle invoke() {
                return (DelArchiveDialogViewModle) new ViewModelProvider(CommentArchiveDialog.this, new ViewModelProvider.NewInstanceFactory()).get(DelArchiveDialogViewModle.class);
            }
        });
        this.viewModle$delegate = lazy;
        this.dialogData = new DialogData("提示", "请评价一下你刚才玩的云存档吧～", null, null, false, 28, null);
    }

    @NotNull
    public final ModCommentlArchiveDialogBinding getDataBinding() {
        ModCommentlArchiveDialogBinding modCommentlArchiveDialogBinding = this.dataBinding;
        if (modCommentlArchiveDialogBinding != null) {
            return modCommentlArchiveDialogBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dataBinding");
        return null;
    }

    @Nullable
    public final DialogData getDialogData() {
        return this.dialogData;
    }

    @NotNull
    public final DelArchiveDialogViewModle getViewModle() {
        return (DelArchiveDialogViewModle) this.viewModle$delegate.getValue();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View view) {
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == R.id.praise) {
            Context context = getContext();
            if (context != null) {
                EXTKt.checkHasLogin(context, new Function0<Unit>() { // from class: com.join.kotlin.ui.cloudarchive.dialog.CommentArchiveDialog$onClick$1
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
                        ArchiveData value;
                        DelArchiveDialogViewModle viewModle = CommentArchiveDialog.this.getViewModle();
                        FragmentActivity requireActivity = CommentArchiveDialog.this.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                        viewModle.commentArchive(requireActivity, SimpleComparison.LIKE_OPERATION);
                        p l4 = p.l(CommentArchiveDialog.this.getContext());
                        Event event = Event.clickEvalCloudButton;
                        Ext from = new Ext().setFrom("1");
                        MutableLiveData<ArchiveData> archive = CommentArchiveDialog.this.getViewModle().getArchive();
                        l4.O1(event, from.setGameId((archive == null || (value = archive.getValue()) == null) ? null : value.getGame_id()));
                    }
                });
            }
        } else if (valueOf != null && valueOf.intValue() == R.id.unCommend) {
            Context context2 = getContext();
            if (context2 != null) {
                EXTKt.checkHasLogin(context2, new Function0<Unit>() { // from class: com.join.kotlin.ui.cloudarchive.dialog.CommentArchiveDialog$onClick$2
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
                        ArchiveData value;
                        DelArchiveDialogViewModle viewModle = CommentArchiveDialog.this.getViewModle();
                        FragmentActivity requireActivity = CommentArchiveDialog.this.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                        viewModle.commentArchive(requireActivity, "NEGATIVE");
                        p l4 = p.l(CommentArchiveDialog.this.getContext());
                        Event event = Event.clickEvalCloudButton;
                        Ext from = new Ext().setFrom("4");
                        MutableLiveData<ArchiveData> archive = CommentArchiveDialog.this.getViewModle().getArchive();
                        l4.O1(event, from.setGameId((archive == null || (value = archive.getValue()) == null) ? null : value.getGame_id()));
                    }
                });
            }
        } else if (valueOf != null && valueOf.intValue() == R.id.otherUsers) {
            Context context3 = getContext();
            if (context3 != null) {
                EXTKt.checkHasLogin(context3, new Function0<Unit>() { // from class: com.join.kotlin.ui.cloudarchive.dialog.CommentArchiveDialog$onClick$3
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
                        ArchiveData value;
                        DelArchiveDialogViewModle viewModle = CommentArchiveDialog.this.getViewModle();
                        FragmentActivity requireActivity = CommentArchiveDialog.this.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                        viewModle.commentArchive(requireActivity, "PLAGIARIZE");
                        p l4 = p.l(CommentArchiveDialog.this.getContext());
                        Event event = Event.clickEvalCloudButton;
                        Ext from = new Ext().setFrom("3");
                        MutableLiveData<ArchiveData> archive = CommentArchiveDialog.this.getViewModle().getArchive();
                        l4.O1(event, from.setGameId((archive == null || (value = archive.getValue()) == null) ? null : value.getGame_id()));
                    }
                });
            }
        } else if (valueOf != null && valueOf.intValue() == R.id.closed) {
            dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ViewDataBinding inflate = DataBindingUtil.inflate(inflater, R.layout.mod_commentl_archive_dialog, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            inf…          false\n        )");
        setDataBinding((ModCommentlArchiveDialogBinding) inflate);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        getDataBinding().setLifecycleOwner(this);
        getDataBinding().setVariable(34, getViewModle());
        getDataBinding().setVariable(7, this);
        getViewModle().setClickCommentDialogListener(new Function1<Integer, Unit>() { // from class: com.join.kotlin.ui.cloudarchive.dialog.CommentArchiveDialog$onCreateView$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i4) {
                if (i4 == 1) {
                    l2.a(CommentArchiveDialog.this.getContext()).b("评价成功");
                    CommentArchiveDialog.this.dismiss();
                    return;
                }
                CommentArchiveDialog.this.dismiss();
            }
        });
        getViewModle().getDialogData().setValue(this.dialogData);
        Bundle arguments = getArguments();
        if (arguments != null) {
            MutableLiveData<ArchiveData> archive = getViewModle().getArchive();
            Serializable serializable = arguments.getSerializable("archive");
            Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.join.kotlin.ui.cloudarchive.data.ArchiveData");
            archive.setValue((ArchiveData) serializable);
        }
        b2.g t4 = b2.g.t();
        ArchiveData value = getViewModle().getArchive().getValue();
        CloudArchiveTable p4 = t4.p(value != null ? value.getId() : null);
        if (p4 != null) {
            p4.setIsFirstRun(3);
            b2.g.t().update(p4);
        }
        p.l(getContext()).O1(Event.exitGamePopupWin, new Ext().setGameId(p4 != null ? p4.getGameId() : null));
        return getDataBinding().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
    }

    public final void setDataBinding(@NotNull ModCommentlArchiveDialogBinding modCommentlArchiveDialogBinding) {
        Intrinsics.checkNotNullParameter(modCommentlArchiveDialogBinding, "<set-?>");
        this.dataBinding = modCommentlArchiveDialogBinding;
    }

    public final void setDatas(@NotNull DialogData dialogData) {
        Intrinsics.checkNotNullParameter(dialogData, "dialogData");
        this.dialogData = dialogData;
    }

    public final void setDialogData(@Nullable DialogData dialogData) {
        this.dialogData = dialogData;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(@NotNull FragmentManager manager, @Nullable String str) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        super.show(manager, str);
    }
}
