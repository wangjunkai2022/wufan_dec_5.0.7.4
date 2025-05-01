package com.join.kotlin.ui.cloudarchive;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.join.android.app.common.utils.JsonMapper;
import com.join.kotlin.ui.cloudarchive.data.ArchiveArgs;
import com.join.kotlin.ui.cloudarchive.data.ArchiveData;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.h0;
import com.join.mgps.activity.screenshot.ImageFactory;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.wufan.user.service.protobuf.n0;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.s1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ModUploadArchiveViewModle.kt */
@SourceDebugExtension({"SMAP\nModUploadArchiveViewModle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModUploadArchiveViewModle.kt\ncom/join/kotlin/ui/cloudarchive/ModUploadArchiveViewModle\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,452:1\n1#2:453\n*E\n"})
/* loaded from: classes3.dex */
public final class ModUploadArchiveViewModle extends ViewModel {
    @NotNull
    private MutableLiveData<ArchiveData> archive = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<List<ArchiveData>> archiveDatas = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<String> message = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<String> archiveFileSuffix = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<String> title = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<String> noticeWarnings = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<Integer> uploadStatus = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<Integer> uploadProgress = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<ResponseModel<?>> responseReult = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<String> imagepath = new MutableLiveData<>();

    public ModUploadArchiveViewModle() {
        this.title.setValue("发布存档");
        this.noticeWarnings.setValue("");
        this.uploadStatus.setValue(0);
        this.uploadProgress.setValue(0);
        this.imagepath.setValue(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String compressImage(Context context) {
        int lastIndexOf$default;
        String value = this.imagepath.getValue();
        String replace$default = value != null ? StringsKt__StringsJVMKt.replace$default(value, "file://", "", false, 4, (Object) null) : null;
        StringBuilder sb = new StringBuilder();
        sb.append(com.join.mgps.Util.v.f28111k);
        sb.append("uploadCoverFile");
        Intrinsics.checkNotNull(replace$default);
        lastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) replace$default, h0.f27805a, 0, false, 6, (Object) null);
        String substring = replace$default.substring(lastIndexOf$default, replace$default.length());
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(substring);
        String sb2 = sb.toString();
        File file = new File(sb2);
        try {
            if (!file.exists()) {
                file.getParentFile().mkdirs();
            }
            new ImageFactory().compressAndGenImage(replace$default, sb2, 500, false, context);
        } catch (IOException e5) {
            e5.printStackTrace();
        }
        return sb2;
    }

    private final void copyFileSimple(InputStream inputStream, OutputStream outputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        byte[] bArr = new byte[5120];
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read != -1) {
                bufferedOutputStream.write(bArr, 0, read);
            } else {
                bufferedOutputStream.flush();
                bufferedInputStream.close();
                bufferedOutputStream.close();
                outputStream.close();
                inputStream.close();
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.io.File startZipFile(android.content.Context r23, java.lang.String r24, com.join.kotlin.ui.cloudarchive.data.ArchiveData r25) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.kotlin.ui.cloudarchive.ModUploadArchiveViewModle.startZipFile(android.content.Context, java.lang.String, com.join.kotlin.ui.cloudarchive.data.ArchiveData):java.io.File");
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x029d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0297  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.io.File startZipFile2(android.content.Context r27, java.lang.String r28, com.join.kotlin.ui.cloudarchive.data.ArchiveData r29) {
        /*
            Method dump skipped, instructions count: 1003
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.kotlin.ui.cloudarchive.ModUploadArchiveViewModle.startZipFile2(android.content.Context, java.lang.String, com.join.kotlin.ui.cloudarchive.data.ArchiveData):java.io.File");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uploadArchive$lambda$3$lambda$2(final ModUploadArchiveViewModle this$0, Context context, Ref.ObjectRef archive) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(archive, "$archive");
        String archiveLocation = ((ArchiveData) archive.element).getArchiveLocation();
        Intrinsics.checkNotNullExpressionValue(archiveLocation, "archive.archiveLocation");
        File startZipFile = this$0.startZipFile(context, archiveLocation, (ArchiveData) archive.element);
        String value = this$0.imagepath.getValue();
        if (value != null) {
            StringsKt__StringsJVMKt.replace$default(value, "file://", "", false, 4, (Object) null);
        }
        String compressImage = this$0.compressImage(context);
        String absolutePath = startZipFile != null ? startZipFile.getAbsolutePath() : null;
        n0 accountData = AccountUtil_.getInstance_(context).getAccountData();
        String i4 = com.join.android.app.common.http.h.b().i(absolutePath, String.valueOf(accountData.getUid()), accountData.getToken(), ((ArchiveData) archive.element).getGame_id(), this$0.message.getValue(), "417", new File(((ArchiveData) archive.element).getArchiveLocalPath()).getName(), compressImage, new com.join.android.app.common.http.g() { // from class: com.join.kotlin.ui.cloudarchive.ModUploadArchiveViewModle$uploadArchive$1$1$json$1
            @Override // com.join.android.app.common.http.g
            public void onRequestProgress(long j4, long j5, boolean z4, @Nullable String str) {
                ModUploadArchiveViewModle.this.getUploadProgress().postValue(Integer.valueOf((int) ((j4 * 100) / j5)));
            }

            @Override // com.join.android.app.common.http.g
            public void onUploadFailed(@Nullable String str) {
            }
        });
        File file = new File(compressImage);
        if (file.exists()) {
            UtilsMy.delete(file);
        }
        if (!(i4 == null || i4.length() == 0)) {
            ResponseModel<?> responseModel = (ResponseModel) JsonMapper.getInstance().fromJson(i4, ResponseModel.class);
            if (responseModel != null) {
                this$0.responseReult.postValue(responseModel);
                return;
            }
            ResponseModel<?> responseModel2 = new ResponseModel<>();
            responseModel2.setCode(500);
            responseModel2.setMessage("异常");
            this$0.responseReult.postValue(responseModel2);
            return;
        }
        ResponseModel<?> responseModel3 = new ResponseModel<>();
        responseModel3.setCode(500);
        responseModel3.setMessage("异常");
        this$0.responseReult.postValue(responseModel3);
    }

    @NotNull
    public final MutableLiveData<ArchiveData> getArchive() {
        return this.archive;
    }

    @NotNull
    public final MutableLiveData<List<ArchiveData>> getArchiveDatas() {
        return this.archiveDatas;
    }

    @NotNull
    public final MutableLiveData<String> getArchiveFileSuffix() {
        return this.archiveFileSuffix;
    }

    @NotNull
    public final MutableLiveData<String> getImagepath() {
        return this.imagepath;
    }

    @NotNull
    public final MutableLiveData<String> getMessage() {
        return this.message;
    }

    @NotNull
    public final MutableLiveData<String> getNoticeWarnings() {
        return this.noticeWarnings;
    }

    @NotNull
    public final MutableLiveData<ResponseModel<?>> getResponseReult() {
        return this.responseReult;
    }

    @NotNull
    public final MutableLiveData<String> getTitle() {
        return this.title;
    }

    @NotNull
    public final MutableLiveData<Integer> getUploadProgress() {
        return this.uploadProgress;
    }

    @NotNull
    public final MutableLiveData<Integer> getUploadStatus() {
        return this.uploadStatus;
    }

    public final void onclickChoiceIcon(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setArchive(@NotNull MutableLiveData<ArchiveData> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.archive = mutableLiveData;
    }

    public final void setArchiveDatas(@NotNull MutableLiveData<List<ArchiveData>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.archiveDatas = mutableLiveData;
    }

    public final void setArchiveFileSuffix(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.archiveFileSuffix = mutableLiveData;
    }

    public final void setImagepath(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.imagepath = mutableLiveData;
    }

    public final void setMessage(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.message = mutableLiveData;
    }

    public final void setNoticeWarnings(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.noticeWarnings = mutableLiveData;
    }

    public final void setResponseReult(@NotNull MutableLiveData<ResponseModel<?>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.responseReult = mutableLiveData;
    }

    public final void setTitle(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.title = mutableLiveData;
    }

    public final void setUploadProgress(@NotNull MutableLiveData<Integer> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.uploadProgress = mutableLiveData;
    }

    public final void setUploadStatus(@NotNull MutableLiveData<Integer> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.uploadStatus = mutableLiveData;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, com.join.kotlin.ui.cloudarchive.data.ArchiveArgs] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.wufan.user.service.protobuf.n0, T] */
    public final void updateArchiveMessage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? value = this.archive.getValue();
        Intrinsics.checkNotNull(value);
        objectRef.element = value;
        RequestModel requestModel = new RequestModel();
        requestModel.setDefault(context);
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = new ArchiveArgs();
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        objectRef3.element = AccountUtil_.getInstance_(context).getAccountData();
        ((ArchiveArgs) objectRef2.element).setArchiveId(((ArchiveData) objectRef.element).getId());
        ((ArchiveArgs) objectRef2.element).setGameId(((ArchiveData) objectRef.element).getGame_id());
        ((ArchiveArgs) objectRef2.element).setArchiveDesc(this.message.getValue());
        ((ArchiveArgs) objectRef2.element).setCoverLocation(((ArchiveData) objectRef.element).getCoverLocation());
        ((ArchiveArgs) objectRef2.element).setUid(((n0) objectRef3.element).getUid());
        requestModel.setArgs(objectRef2.element);
        Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
        objectRef4.element = com.papa.sim.statistic.k.a(context);
        kotlinx.coroutines.k.f(s1.f71252b, d1.c(), null, new ModUploadArchiveViewModle$updateArchiveMessage$1(this, context, objectRef3, requestModel, objectRef4, objectRef2, objectRef, null), 2, null);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public final void uploadArchive(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? value = this.archive.getValue();
        objectRef.element = value;
        if (((ArchiveData) value) != null) {
            new Thread(new Runnable() { // from class: com.join.kotlin.ui.cloudarchive.n
                @Override // java.lang.Runnable
                public final void run() {
                    ModUploadArchiveViewModle.uploadArchive$lambda$3$lambda$2(ModUploadArchiveViewModle.this, context, objectRef);
                }
            }).start();
        }
    }
}
