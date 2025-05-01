package com.join.kotlin.ui.cloudarchive.dialog;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.join.kotlin.ui.cloudarchive.data.ArchiveData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: ChoiceArchiveDialogViewModle.kt */
/* loaded from: classes3.dex */
public final class ChoiceArchiveDialogViewModle extends ViewModel {
    @NotNull
    private MutableLiveData<ArchiveData> archive = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<List<ArchiveData>> archiveList = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<DialogData> dialogData;
    public CommentDialogListener listenr;

    public ChoiceArchiveDialogViewModle() {
        MutableLiveData<DialogData> mutableLiveData = new MutableLiveData<>();
        this.dialogData = mutableLiveData;
        mutableLiveData.setValue(new DialogData("提示", "", null, null, false, 28, null));
    }

    @NotNull
    public final MutableLiveData<ArchiveData> getArchive() {
        return this.archive;
    }

    @NotNull
    public final MutableLiveData<List<ArchiveData>> getArchiveList() {
        return this.archiveList;
    }

    @NotNull
    public final MutableLiveData<DialogData> getDialogData() {
        return this.dialogData;
    }

    @NotNull
    public final CommentDialogListener getListenr() {
        CommentDialogListener commentDialogListener = this.listenr;
        if (commentDialogListener != null) {
            return commentDialogListener;
        }
        Intrinsics.throwUninitializedPropertyAccessException("listenr");
        return null;
    }

    public final void setArchive(@NotNull MutableLiveData<ArchiveData> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.archive = mutableLiveData;
    }

    public final void setArchiveList(@NotNull MutableLiveData<List<ArchiveData>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.archiveList = mutableLiveData;
    }

    public final void setClickCommentDialogListener(@NotNull CommentDialogListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        setListenr(listener);
    }

    public final void setDialogData(@NotNull MutableLiveData<DialogData> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.dialogData = mutableLiveData;
    }

    public final void setListenr(@NotNull CommentDialogListener commentDialogListener) {
        Intrinsics.checkNotNullParameter(commentDialogListener, "<set-?>");
        this.listenr = commentDialogListener;
    }

    public final void setClickCommentDialogListener(@NotNull final Function1<? super Integer, Unit> listenerx) {
        Intrinsics.checkNotNullParameter(listenerx, "listenerx");
        setListenr(new CommentDialogListener() { // from class: com.join.kotlin.ui.cloudarchive.dialog.ChoiceArchiveDialogViewModle$setClickCommentDialogListener$1
            @Override // com.join.kotlin.ui.cloudarchive.dialog.CommentDialogListener
            public void onSendMessageFinish(int i4) {
                listenerx.invoke(Integer.valueOf(i4));
            }
        });
    }
}
