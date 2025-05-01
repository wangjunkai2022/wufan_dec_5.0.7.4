package com.join.kotlin.ui.cloudarchive;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.join.kotlin.ui.cloudarchive.data.ArchiveArgs;
import com.join.kotlin.ui.cloudarchive.data.ArchiveData;
import com.join.kotlin.ui.cloudarchive.data.ArchiveDownEvent;
import com.join.kotlin.ui.cloudarchive.dialog.CommentDialogListener;
import com.join.kotlin.ui.cloudarchive.dialog.DialogData;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.d0;
import com.join.mgps.Util.l2;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* compiled from: DelArchiveDialogViewModle.kt */
/* loaded from: classes3.dex */
public final class DelArchiveDialogViewModle extends ViewModel {
    @NotNull
    private MutableLiveData<ArchiveData> archive = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<DialogData> dialogData = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<Boolean> isCommitLoding = new MutableLiveData<>();
    public CommentDialogListener listenr;

    public DelArchiveDialogViewModle() {
        this.dialogData.setValue(new DialogData("提示", "", null, null, false, 28, null));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
    public final void commentArchive(@NotNull final Context context, @NotNull final String type) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(type, "type");
        Boolean value = this.isCommitLoding.getValue();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(value, bool)) {
            return;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? value2 = this.archive.getValue();
        Intrinsics.checkNotNull(value2);
        objectRef.element = value2;
        RequestModel requestModel = new RequestModel();
        requestModel.setDefault(context);
        ArchiveArgs archiveArgs = new ArchiveArgs();
        archiveArgs.setArchiveId(((ArchiveData) objectRef.element).getId());
        archiveArgs.setGameId(((ArchiveData) objectRef.element).getGame_id());
        this.isCommitLoding.setValue(bool);
        archiveArgs.setCommentType(type);
        archiveArgs.setUid(AccountUtil_.getInstance_(context).getAccountData().getUid());
        requestModel.setArgs(archiveArgs);
        com.join.mgps.rpc.impl.i.D0().B0().B0(requestModel.makeSign()).enqueue(new Callback<ResponseModel<?>>() { // from class: com.join.kotlin.ui.cloudarchive.DelArchiveDialogViewModle$commentArchive$1
            @Override // retrofit2.Callback
            public void onFailure(@NotNull Call<ResponseModel<?>> call, @NotNull Throwable t4) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(t4, "t");
                DelArchiveDialogViewModle.this.isCommitLoding().setValue(Boolean.FALSE);
                l2.a(context).b("评价异常！");
            }

            @Override // retrofit2.Callback
            public void onResponse(@NotNull Call<ResponseModel<?>> call, @NotNull Response<ResponseModel<?>> response) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                DelArchiveDialogViewModle.this.isCommitLoding().setValue(Boolean.FALSE);
                ResponseModel<?> body = response.body();
                if (body != null && body.getCode() == 200) {
                    DelArchiveDialogViewModle.this.getListenr().onSendMessageFinish(1);
                    if (Intrinsics.areEqual(SimpleComparison.LIKE_OPERATION, type)) {
                        objectRef.element.setIsLike(1);
                        ArchiveData archiveData = objectRef.element;
                        ArchiveData archiveData2 = archiveData;
                        ArchiveData archiveData3 = archiveData;
                        archiveData3.setLikeCount(archiveData3.getLikeCount() + 1);
                        archiveData2.setLikeCount(archiveData3.getLikeCount());
                        d0.a().c(new ArchiveDownEvent(10, objectRef.element));
                        return;
                    } else if (Intrinsics.areEqual("NEGATIVE", type)) {
                        objectRef.element.setIsUnLike(1);
                        ArchiveData archiveData4 = objectRef.element;
                        ArchiveData archiveData5 = archiveData4;
                        ArchiveData archiveData6 = archiveData4;
                        archiveData6.setNegativeCount(archiveData6.getNegativeCount() + 1);
                        archiveData5.setNegativeCount(archiveData6.getNegativeCount());
                        d0.a().c(new ArchiveDownEvent(10, objectRef.element));
                        return;
                    } else {
                        return;
                    }
                }
                DelArchiveDialogViewModle.this.getListenr().onSendMessageFinish(0);
                l2 a5 = l2.a(context);
                ResponseModel<?> body2 = response.body();
                a5.b(body2 != null ? body2.getMessage() : null);
            }
        });
    }

    @NotNull
    public final MutableLiveData<ArchiveData> getArchive() {
        return this.archive;
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

    @NotNull
    public final MutableLiveData<Boolean> isCommitLoding() {
        return this.isCommitLoding;
    }

    public final void setArchive(@NotNull MutableLiveData<ArchiveData> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.archive = mutableLiveData;
    }

    public final void setClickCommentDialogListener(@NotNull CommentDialogListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        setListenr(listener);
    }

    public final void setCommitLoding(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.isCommitLoding = mutableLiveData;
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
        setListenr(new CommentDialogListener() { // from class: com.join.kotlin.ui.cloudarchive.DelArchiveDialogViewModle$setClickCommentDialogListener$1
            @Override // com.join.kotlin.ui.cloudarchive.dialog.CommentDialogListener
            public void onSendMessageFinish(int i4) {
                listenerx.invoke(Integer.valueOf(i4));
            }
        });
    }
}
