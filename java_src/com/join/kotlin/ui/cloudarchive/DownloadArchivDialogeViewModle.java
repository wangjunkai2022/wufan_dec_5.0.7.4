package com.join.kotlin.ui.cloudarchive;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.join.kotlin.ui.cloudarchive.data.ArchiveData;
import com.join.kotlin.ui.cloudarchive.data.ModDataRequest;
import com.join.kotlin.ui.cloudarchive.data.ModGameArchivePathData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: DownloadArchivDialogeViewModle.kt */
/* loaded from: classes3.dex */
public final class DownloadArchivDialogeViewModle extends ViewModel {
    @NotNull
    private MutableLiveData<Integer> progress = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<Integer> downloadType = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<String> progressText = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<String> dialogTitle = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<ArchiveData> archive = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<ModGameArchivePathData> cloud_archive_local_path = new MutableLiveData<>();
    @NotNull
    private ModDataRequest request = new ModDataRequest();

    public DownloadArchivDialogeViewModle() {
        this.progress.setValue(0);
        this.downloadType.setValue(0);
        this.progressText.setValue("0/0");
        this.dialogTitle.setValue("存档下载中");
    }

    @NotNull
    public final MutableLiveData<ArchiveData> getArchive() {
        return this.archive;
    }

    @NotNull
    public final MutableLiveData<ModGameArchivePathData> getCloud_archive_local_path() {
        return this.cloud_archive_local_path;
    }

    @NotNull
    public final MutableLiveData<String> getDialogTitle() {
        return this.dialogTitle;
    }

    @NotNull
    public final MutableLiveData<Integer> getDownloadType() {
        return this.downloadType;
    }

    @NotNull
    public final MutableLiveData<Integer> getProgress() {
        return this.progress;
    }

    @NotNull
    public final MutableLiveData<String> getProgressText() {
        return this.progressText;
    }

    @NotNull
    public final ModDataRequest getRequest() {
        return this.request;
    }

    public final void setArchive(@NotNull MutableLiveData<ArchiveData> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.archive = mutableLiveData;
    }

    public final void setCloud_archive_local_path(@NotNull MutableLiveData<ModGameArchivePathData> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.cloud_archive_local_path = mutableLiveData;
    }

    public final void setDialogTitle(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.dialogTitle = mutableLiveData;
    }

    public final void setDownloadType(@NotNull MutableLiveData<Integer> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.downloadType = mutableLiveData;
    }

    public final void setProgress(@NotNull MutableLiveData<Integer> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.progress = mutableLiveData;
    }

    public final void setProgressText(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.progressText = mutableLiveData;
    }

    public final void setRequest(@NotNull ModDataRequest modDataRequest) {
        Intrinsics.checkNotNullParameter(modDataRequest, "<set-?>");
        this.request = modDataRequest;
    }
}
