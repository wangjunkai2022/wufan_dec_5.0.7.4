package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.cloudarchive.DownloadArchivDialogeViewModle;
/* loaded from: classes3.dex */
public abstract class DownloadArchiveDialogBinding extends ViewDataBinding {
    @Bindable

    /* renamed from: b  reason: collision with root package name */
    protected DownloadArchivDialogeViewModle f19133b;
    @Bindable

    /* renamed from: c  reason: collision with root package name */
    protected View.OnClickListener f19134c;

    /* JADX INFO: Access modifiers changed from: protected */
    public DownloadArchiveDialogBinding(Object obj, View view, int i4) {
        super(obj, view, i4);
    }

    @Deprecated
    public static DownloadArchiveDialogBinding b(@NonNull View view, @Nullable Object obj) {
        return (DownloadArchiveDialogBinding) ViewDataBinding.bind(obj, view, R.layout.download_archive_dialog);
    }

    public static DownloadArchiveDialogBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static DownloadArchiveDialogBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (DownloadArchiveDialogBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.download_archive_dialog, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static DownloadArchiveDialogBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (DownloadArchiveDialogBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.download_archive_dialog, null, false, obj);
    }

    @NonNull
    public static DownloadArchiveDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public View.OnClickListener c() {
        return this.f19134c;
    }

    @Nullable
    public DownloadArchivDialogeViewModle d() {
        return this.f19133b;
    }

    public abstract void g(@Nullable View.OnClickListener onClickListener);

    public abstract void h(@Nullable DownloadArchivDialogeViewModle downloadArchivDialogeViewModle);

    @NonNull
    public static DownloadArchiveDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
