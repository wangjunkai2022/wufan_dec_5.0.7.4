package com.join.kotlin.ui.cloudarchive.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ModChoiceArchiveDialogBinding;
import com.join.kotlin.ui.cloudarchive.adapter.ModChoiceArchiveAdapter;
import com.join.kotlin.ui.cloudarchive.data.ArchiveData;
import java.io.Serializable;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ChoiceArchiveDialog.kt */
@SourceDebugExtension({"SMAP\nChoiceArchiveDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChoiceArchiveDialog.kt\ncom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,110:1\n1855#2,2:111\n*S KotlinDebug\n*F\n+ 1 ChoiceArchiveDialog.kt\ncom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog\n*L\n46#1:111,2\n*E\n"})
/* loaded from: classes3.dex */
public final class ChoiceArchiveDialog extends DialogFragment implements View.OnClickListener {
    @NotNull
    private final Lazy adapter$delegate;
    private Function1<? super ArchiveData, Unit> choicedFun;
    public ModChoiceArchiveDialogBinding dataBinding;
    @NotNull
    private final Lazy viewModle$delegate;

    public ChoiceArchiveDialog() {
        Lazy lazy;
        Lazy lazy2;
        lazy = LazyKt__LazyJVMKt.lazy(new Function0<ChoiceArchiveDialogViewModle>() { // from class: com.join.kotlin.ui.cloudarchive.dialog.ChoiceArchiveDialog$viewModle$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ChoiceArchiveDialogViewModle invoke() {
                return (ChoiceArchiveDialogViewModle) new ViewModelProvider(ChoiceArchiveDialog.this, new ViewModelProvider.NewInstanceFactory()).get(ChoiceArchiveDialogViewModle.class);
            }
        });
        this.viewModle$delegate = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new Function0<ModChoiceArchiveAdapter>() { // from class: com.join.kotlin.ui.cloudarchive.dialog.ChoiceArchiveDialog$adapter$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ModChoiceArchiveAdapter invoke() {
                Context context = ChoiceArchiveDialog.this.getContext();
                Intrinsics.checkNotNull(context);
                return new ModChoiceArchiveAdapter(context);
            }
        });
        this.adapter$delegate = lazy2;
    }

    @NotNull
    public final ModChoiceArchiveAdapter getAdapter() {
        return (ModChoiceArchiveAdapter) this.adapter$delegate.getValue();
    }

    @NotNull
    public final ModChoiceArchiveDialogBinding getDataBinding() {
        ModChoiceArchiveDialogBinding modChoiceArchiveDialogBinding = this.dataBinding;
        if (modChoiceArchiveDialogBinding != null) {
            return modChoiceArchiveDialogBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dataBinding");
        return null;
    }

    @NotNull
    public final ChoiceArchiveDialogViewModle getViewModle() {
        return (ChoiceArchiveDialogViewModle) this.viewModle$delegate.getValue();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View view) {
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == R.id.closed) {
            dismiss();
        }
        dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ViewDataBinding inflate = DataBindingUtil.inflate(inflater, R.layout.mod_choice_archive_dialog, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            inf…          false\n        )");
        setDataBinding((ModChoiceArchiveDialogBinding) inflate);
        Bundle arguments = getArguments();
        if (arguments != null) {
            MutableLiveData<ArchiveData> archive = getViewModle().getArchive();
            Serializable serializable = arguments.getSerializable("archive");
            Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.join.kotlin.ui.cloudarchive.data.ArchiveData");
            archive.setValue((ArchiveData) serializable);
            MutableLiveData<List<ArchiveData>> archiveList = getViewModle().getArchiveList();
            Serializable serializable2 = arguments.getSerializable("archiveList");
            Intrinsics.checkNotNull(serializable2, "null cannot be cast to non-null type kotlin.collections.MutableList<com.join.kotlin.ui.cloudarchive.data.ArchiveData>");
            archiveList.setValue(TypeIntrinsics.asMutableList(serializable2));
            List<ArchiveData> value = getViewModle().getArchiveList().getValue();
            if (value != null) {
                Intrinsics.checkNotNullExpressionValue(value, "value");
                for (ArchiveData archiveData : value) {
                    String archiveDesc = archiveData.getArchiveDesc();
                    ArchiveData value2 = getViewModle().getArchive().getValue();
                    Intrinsics.checkNotNull(value2);
                    if (Intrinsics.areEqual(archiveDesc, value2.getArchiveDesc())) {
                        archiveData.setCheckStatus(1);
                    } else {
                        archiveData.setCheckStatus(0);
                    }
                }
            }
        }
        getDataBinding().setLifecycleOwner(this);
        getDataBinding().setVariable(34, getViewModle());
        getDataBinding().setVariable(7, this);
        getDataBinding().setVariable(1, getAdapter());
        getAdapter().setOnItemClickListener(new Function3<Integer, ArchiveData, Integer, Unit>() { // from class: com.join.kotlin.ui.cloudarchive.dialog.ChoiceArchiveDialog$onCreateView$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, ArchiveData archiveData2, Integer num2) {
                invoke(num.intValue(), archiveData2, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i4, @NotNull ArchiveData item, int i5) {
                Function1 function1;
                Intrinsics.checkNotNullParameter(item, "item");
                ChoiceArchiveDialog.this.getViewModle().getArchive().setValue(item);
                List<ArchiveData> value3 = ChoiceArchiveDialog.this.getViewModle().getArchiveList().getValue();
                if (value3 != null) {
                    ChoiceArchiveDialog choiceArchiveDialog = ChoiceArchiveDialog.this;
                    for (ArchiveData archiveData2 : value3) {
                        String archiveDesc2 = archiveData2.getArchiveDesc();
                        ArchiveData value4 = choiceArchiveDialog.getViewModle().getArchive().getValue();
                        Intrinsics.checkNotNull(value4);
                        if (Intrinsics.areEqual(archiveDesc2, value4.getArchiveDesc())) {
                            archiveData2.setCheckStatus(1);
                        } else {
                            archiveData2.setCheckStatus(0);
                        }
                    }
                }
                function1 = ChoiceArchiveDialog.this.choicedFun;
                if (function1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("choicedFun");
                    function1 = null;
                }
                ArchiveData value5 = ChoiceArchiveDialog.this.getViewModle().getArchive().getValue();
                Intrinsics.checkNotNull(value5);
                function1.invoke(value5);
                ChoiceArchiveDialog.this.dismiss();
            }
        });
        getViewModle().getDialogData().setValue(new DialogData("请选择存档", "", null, null, false, 28, null));
        return getDataBinding().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
    }

    public final void setDataBinding(@NotNull ModChoiceArchiveDialogBinding modChoiceArchiveDialogBinding) {
        Intrinsics.checkNotNullParameter(modChoiceArchiveDialogBinding, "<set-?>");
        this.dataBinding = modChoiceArchiveDialogBinding;
    }

    public final void setItemChoiced(@NotNull Function1<? super ArchiveData, Unit> func) {
        Intrinsics.checkNotNullParameter(func, "func");
        this.choicedFun = func;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(@NotNull FragmentManager manager, @Nullable String str) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        super.show(manager, str);
    }
}
