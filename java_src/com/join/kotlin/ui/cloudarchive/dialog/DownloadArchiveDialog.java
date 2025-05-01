package com.join.kotlin.ui.cloudarchive.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.DownloadArchiveDialogBinding;
import com.join.kotlin.ui.cloudarchive.DownloadArchivDialogeViewModle;
import com.join.kotlin.ui.cloudarchive.data.ArchiveData;
import com.join.kotlin.ui.cloudarchive.data.ArchiveDownEvent;
import com.join.kotlin.ui.cloudarchive.data.ModDataRequest;
import com.join.kotlin.ui.cloudarchive.data.ModGameArchivePathData;
import com.join.mgps.Util.d0;
import com.join.mgps.activity.mygame.dialog.PlugDownDialogAcitivity_;
import java.io.File;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: DownloadArchiveDialog.kt */
/* loaded from: classes3.dex */
public final class DownloadArchiveDialog extends DialogFragment implements View.OnClickListener {
    public DownloadArchiveDialogBinding dataBinding;
    @NotNull
    private final Lazy viewModle$delegate;

    /* compiled from: DownloadArchiveDialog.kt */
    /* loaded from: classes3.dex */
    public static final class UpdateLocalArchiveEvent {
    }

    public DownloadArchiveDialog() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new Function0<DownloadArchivDialogeViewModle>() { // from class: com.join.kotlin.ui.cloudarchive.dialog.DownloadArchiveDialog$viewModle$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DownloadArchivDialogeViewModle invoke() {
                return (DownloadArchivDialogeViewModle) new ViewModelProvider(DownloadArchiveDialog.this, new ViewModelProvider.NewInstanceFactory()).get(DownloadArchivDialogeViewModle.class);
            }
        });
        this.viewModle$delegate = lazy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$3(DownloadArchiveDialog this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModle().getProgress().setValue(num);
        StringBuilder sb = new StringBuilder();
        sb.append("observe progress=");
        sb.append(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$4(DownloadArchiveDialog this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModle().getProgressText().setValue(str);
        StringBuilder sb = new StringBuilder();
        sb.append("progressTextShow=");
        sb.append(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$5(DownloadArchiveDialog this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d0 a5 = d0.a();
        Intrinsics.checkNotNull(num);
        a5.c(new ArchiveDownEvent(num.intValue(), this$0.getViewModle().getArchive().getValue()));
        int intValue = num.intValue();
        if (intValue == 4) {
            this$0.getViewModle().getProgress().setValue(100);
        } else if (intValue == 8) {
            ModDataRequest request = this$0.getViewModle().getRequest();
            FragmentActivity activity = this$0.getActivity();
            Intrinsics.checkNotNull(activity);
            ArchiveData value = this$0.getViewModle().getArchive().getValue();
            Intrinsics.checkNotNull(value);
            request.reportDownloadArchive(activity, value);
            Integer value2 = this$0.getViewModle().getDownloadType().getValue();
            if (value2 != null && value2.intValue() == 1) {
                d0.a().c(new UpdateLocalArchiveEvent());
            }
            this$0.dismiss();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("onstatus status=");
        sb.append(num);
    }

    public final void downLoadArchive() {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity);
        File externalFilesDir = activity.getExternalFilesDir("");
        Intrinsics.checkNotNull(externalFilesDir);
        String absolutePath = externalFilesDir.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "activity!!.getExternalFilesDir(\"\")!!.absolutePath");
        String str = absolutePath + "/Download/cloudarchive/";
        if (getViewModle().getArchive().getValue() == null || getViewModle().getCloud_archive_local_path().getValue() == null) {
            return;
        }
        ModDataRequest request = getViewModle().getRequest();
        ArchiveData value = getViewModle().getArchive().getValue();
        Intrinsics.checkNotNull(value);
        ArchiveData archiveData = value;
        ModGameArchivePathData value2 = getViewModle().getCloud_archive_local_path().getValue();
        Intrinsics.checkNotNull(value2);
        ModGameArchivePathData modGameArchivePathData = value2;
        Integer value3 = getViewModle().getDownloadType().getValue();
        Intrinsics.checkNotNull(value3);
        int intValue = value3.intValue();
        Context context = getContext();
        Intrinsics.checkNotNull(context);
        request.downloadArchive(archiveData, modGameArchivePathData, str, intValue, context);
    }

    @NotNull
    public final DownloadArchiveDialogBinding getDataBinding() {
        DownloadArchiveDialogBinding downloadArchiveDialogBinding = this.dataBinding;
        if (downloadArchiveDialogBinding != null) {
            return downloadArchiveDialogBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dataBinding");
        return null;
    }

    @NotNull
    public final DownloadArchivDialogeViewModle getViewModle() {
        return (DownloadArchivDialogeViewModle) this.viewModle$delegate.getValue();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View view) {
        d0.a().c(new ArchiveDownEvent(6, getViewModle().getArchive().getValue()));
        getViewModle().getRequest().cancleDownloadTask(getViewModle().getArchive().getValue());
        dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ViewDataBinding inflate = DataBindingUtil.inflate(inflater, R.layout.download_archive_dialog, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            inf…          false\n        )");
        setDataBinding((DownloadArchiveDialogBinding) inflate);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        getDataBinding().setLifecycleOwner(this);
        getDataBinding().setVariable(34, getViewModle());
        getDataBinding().setVariable(7, this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            MutableLiveData<ArchiveData> archive = getViewModle().getArchive();
            Serializable serializable = arguments.getSerializable("archive");
            Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.join.kotlin.ui.cloudarchive.data.ArchiveData");
            archive.setValue((ArchiveData) serializable);
            getViewModle().getDownloadType().setValue(Integer.valueOf(arguments.getInt(PlugDownDialogAcitivity_.DOWNLOAD_TYPE_EXTRA)));
            MutableLiveData<ModGameArchivePathData> cloud_archive_local_path = getViewModle().getCloud_archive_local_path();
            Serializable serializable2 = arguments.getSerializable("cloud_archive_local_path");
            Intrinsics.checkNotNull(serializable2, "null cannot be cast to non-null type com.join.kotlin.ui.cloudarchive.data.ModGameArchivePathData");
            cloud_archive_local_path.setValue((ModGameArchivePathData) serializable2);
            getViewModle().getRequest().setInstallInExtPlug(arguments.getBoolean("installInExtPlug"));
        }
        if (getViewModle().getArchive().getValue() != null) {
            p1.f K = p1.f.K();
            ArchiveData value = getViewModle().getArchive().getValue();
            DownloadTask dowloadTask = K.F(value != null ? value.getGame_id() : null);
            if (dowloadTask != null) {
                Intrinsics.checkNotNullExpressionValue(dowloadTask, "dowloadTask");
                ArchiveData value2 = getViewModle().getArchive().getValue();
                if (value2 != null) {
                    value2.setPackageName(dowloadTask.getPackageName());
                }
            }
        }
        getViewModle().getRequest().getProgress().observe(this, new Observer() { // from class: com.join.kotlin.ui.cloudarchive.dialog.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                DownloadArchiveDialog.onCreateView$lambda$3(DownloadArchiveDialog.this, (Integer) obj);
            }
        });
        getViewModle().getRequest().getProgressTextShow().observe(this, new Observer() { // from class: com.join.kotlin.ui.cloudarchive.dialog.c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                DownloadArchiveDialog.onCreateView$lambda$4(DownloadArchiveDialog.this, (String) obj);
            }
        });
        getViewModle().getRequest().getStatus().observe(this, new Observer() { // from class: com.join.kotlin.ui.cloudarchive.dialog.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                DownloadArchiveDialog.onCreateView$lambda$5(DownloadArchiveDialog.this, (Integer) obj);
            }
        });
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.join.kotlin.ui.cloudarchive.dialog.DownloadArchiveDialog$onCreateView$6
                @Override // android.content.DialogInterface.OnKeyListener
                public boolean onKey(@Nullable DialogInterface dialogInterface, int i4, @Nullable KeyEvent keyEvent) {
                    return i4 == 4;
                }
            });
        }
        downLoadArchive();
        return getDataBinding().getRoot();
    }

    public final void setDataBinding(@NotNull DownloadArchiveDialogBinding downloadArchiveDialogBinding) {
        Intrinsics.checkNotNullParameter(downloadArchiveDialogBinding, "<set-?>");
        this.dataBinding = downloadArchiveDialogBinding;
    }
}
