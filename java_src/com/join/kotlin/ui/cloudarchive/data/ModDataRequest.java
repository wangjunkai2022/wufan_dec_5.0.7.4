package com.join.kotlin.ui.cloudarchive.data;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.lifecycle.MutableLiveData;
import b2.g;
import com.github.snowdream.android.app.downloader.b;
import com.join.android.app.common.utils.JsonMapper;
import com.join.kotlin.ui.cloudarchive.util.ArchiveZipUtil;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.d0;
import com.join.mgps.Util.v0;
import com.join.mgps.db.tables.CloudArchiveTable;
import com.join.mgps.dto.ArchiveDataAddPd;
import com.join.mgps.dto.RequestGameIdArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.rpc.impl.i;
import com.join.mgps.va.overmind.d;
import com.join.mgps.va.overmind.f;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* compiled from: ModDataRequest.kt */
@SourceDebugExtension({"SMAP\nModDataRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModDataRequest.kt\ncom/join/kotlin/ui/cloudarchive/data/ModDataRequest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,642:1\n1#2:643\n*E\n"})
/* loaded from: classes3.dex */
public final class ModDataRequest {
    private long actualSize;
    @NotNull
    private final Lazy factory$delegate;
    private boolean installInExtPlug;
    @Nullable
    private Call<ResponseModel<List<ArchiveData>>> result;
    @Nullable
    private Call<ResponseModel<ArchiveDataAddPd>> resultPd;
    private long time;
    @NotNull
    private MutableLiveData<ResponseModel<List<ArchiveData>>> resultData = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<ResponseModel<List<ArchiveData>>> resultAllHasDownloadData = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<Integer> status = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<Integer> progress = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<String> progressTextShow = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<ArchiveData> dataChangeItem = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<ResponseModel<ArchiveDataAddPd>> resultDataPd = new MutableLiveData<>();

    /* compiled from: ModDataRequest.kt */
    /* loaded from: classes3.dex */
    public static final class ArchiveDownStatus {
        @NotNull
        public static final Companion Companion = new Companion(null);
        public static final int DATAUPDATED = 10;
        public static final int DELETEDLOCAL = 9;
        public static final int ERROR = 5;
        public static final int FINISH = 4;
        public static final int NORMAL = 0;
        public static final int PROGRESS = 3;
        public static final int START = 1;
        public static final int STOP = 6;
        public static final int UNZIP = 7;
        public static final int UNZIPFINISH = 8;
        public static final int WAIT = 2;

        /* compiled from: ModDataRequest.kt */
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    public ModDataRequest() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new Function0<com.github.snowdream.android.app.downloader.b>() { // from class: com.join.kotlin.ui.cloudarchive.data.ModDataRequest$factory$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.github.snowdream.android.app.downloader.b invoke() {
                return com.github.snowdream.android.app.downloader.b.e();
            }
        });
        this.factory$delegate = lazy;
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

    private final void getFileUpdateTime(File file) {
        int i4 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            if (file.isDirectory()) {
                File[] filess = file.listFiles();
                Intrinsics.checkNotNullExpressionValue(filess, "filess");
                int length = filess.length;
                while (i4 < length) {
                    File f5 = filess[i4];
                    Intrinsics.checkNotNullExpressionValue(f5, "f");
                    getFileUpdateTime(f5);
                    i4++;
                }
                return;
            }
            long millis = Files.readAttributes(file.toPath(), BasicFileAttributes.class, new LinkOption[0]).lastModifiedTime().toMillis();
            if (millis > this.time) {
                this.time = millis;
            }
        } else if (file.isDirectory()) {
            File[] filess2 = file.listFiles();
            Intrinsics.checkNotNullExpressionValue(filess2, "filess");
            int length2 = filess2.length;
            while (i4 < length2) {
                File f6 = filess2[i4];
                Intrinsics.checkNotNullExpressionValue(f6, "f");
                getFileUpdateTime(f6);
                i4++;
            }
        } else {
            long lastModified = file.lastModified();
            if (lastModified > this.time) {
                this.time = lastModified;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unZip(final CloudArchiveTable cloudArchiveTable, final Context context) {
        new Thread(new Runnable() { // from class: com.join.kotlin.ui.cloudarchive.data.c
            @Override // java.lang.Runnable
            public final void run() {
                ModDataRequest.unZip$lambda$1(ModDataRequest.this, cloudArchiveTable, context);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unZip$lambda$1(ModDataRequest this$0, CloudArchiveTable table, Context context) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(table, "$table");
        Intrinsics.checkNotNullParameter(context, "$context");
        String archiveFolder = table.getArchiveFolder();
        Intrinsics.checkNotNullExpressionValue(archiveFolder, "table.archiveFolder");
        this$0.unzipToPath(table, archiveFolder, context);
        String mainArchiveLocalPath2 = table.getMainArchiveLocalPath2();
        if (!(mainArchiveLocalPath2 == null || mainArchiveLocalPath2.length() == 0)) {
            String mainArchiveLocalPath22 = table.getMainArchiveLocalPath2();
            Intrinsics.checkNotNullExpressionValue(mainArchiveLocalPath22, "table.mainArchiveLocalPath2");
            this$0.unzipToPath(table, mainArchiveLocalPath22, context);
        }
        CloudArchiveTable r4 = g.t().r(table.getGameId(), table.getArchiveId());
        if (r4 == null) {
            g.t().k(table);
        } else {
            table.setId(r4.getId());
            g.t().update(table);
        }
        com.join.mgps.va.overmind.d.f54937g.d().f(table.getPackageName(), table.getUserId());
        this$0.status.postValue(8);
    }

    private final void unZipOne(CloudArchiveTable cloudArchiveTable, String str, String str2, Context context) {
        try {
            File file = new File(str, str2);
            cloudArchiveTable.setArchiveFiles(file.getAbsolutePath());
            if (this.installInExtPlug) {
                ContentResolver contentResolver = context.getContentResolver();
                StringBuilder sb = new StringBuilder();
                d.a aVar = com.join.mgps.va.overmind.d.f54937g;
                sb.append(aVar.e());
                sb.append(str);
                OutputStream openOutputStream = contentResolver.openOutputStream(Uri.parse(sb.toString()), "copyZip");
                FileInputStream fileInputStream = new FileInputStream(new File(cloudArchiveTable.getArchiveZipPath()));
                if (openOutputStream != null) {
                    copyFileSimple(fileInputStream, openOutputStream);
                    ContentResolver contentResolver2 = context.getContentResolver();
                    contentResolver2.insert(Uri.parse(aVar.e() + file.getAbsolutePath()), new ContentValues());
                    return;
                }
                return;
            }
            if (!file.exists()) {
                file.mkdirs();
            }
            ArchiveZipUtil archiveZipUtil = new ArchiveZipUtil();
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "unFolder.absolutePath");
            archiveZipUtil.unZipActiveFilesKotlin(absolutePath, new File(cloudArchiveTable.getArchiveZipPath()));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unzipToUser0(final CloudArchiveTable cloudArchiveTable, final Context context) {
        new Thread(new Runnable() { // from class: com.join.kotlin.ui.cloudarchive.data.d
            @Override // java.lang.Runnable
            public final void run() {
                ModDataRequest.unzipToUser0$lambda$0(ModDataRequest.this, cloudArchiveTable, context);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unzipToUser0$lambda$0(ModDataRequest this$0, CloudArchiveTable table, Context context) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(table, "$table");
        Intrinsics.checkNotNullParameter(context, "$context");
        String archiveFolder = table.getArchiveFolder();
        Intrinsics.checkNotNullExpressionValue(archiveFolder, "table.archiveFolder");
        this$0.unzipToPath(table, archiveFolder, context);
        String mainArchiveLocalPath2 = table.getMainArchiveLocalPath2();
        if (!(mainArchiveLocalPath2 == null || mainArchiveLocalPath2.length() == 0)) {
            String mainArchiveLocalPath22 = table.getMainArchiveLocalPath2();
            Intrinsics.checkNotNullExpressionValue(mainArchiveLocalPath22, "table.mainArchiveLocalPath2");
            this$0.unzipToPath(table, mainArchiveLocalPath22, context);
        }
        CloudArchiveTable s4 = g.t().s(table.getGameId(), table.getUserId());
        if (s4 == null) {
            g.t().k(table);
        } else {
            d0.a().c(new ArchiveDownEvent(9, (ArchiveData) JsonMapper.getInstance().fromJson(s4.getArchiveDataJson(), ArchiveData.class)));
            table.setId(s4.getId());
            g.t().update(table);
        }
        if (table.getArchiveZipPath() != null) {
            UtilsMy.delete(new File(table.getArchiveZipPath()));
        }
        com.join.mgps.va.overmind.d.f54937g.d().c0(table.getUserId());
        this$0.status.postValue(8);
    }

    public final void cancleDownloadTask(@Nullable ArchiveData archiveData) {
        if (archiveData != null) {
            getFactory().l(archiveData.getArchiveLocation());
        }
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [T, java.lang.String] */
    public final void downloadArchive(@NotNull final ArchiveData archiveData, @NotNull final ModGameArchivePathData pathData, @NotNull String filePath, final int i4, @NotNull final Context context) {
        Intrinsics.checkNotNullParameter(archiveData, "archiveData");
        Intrinsics.checkNotNullParameter(pathData, "pathData");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(context, "context");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        getFactory().m(new b.InterfaceC0290b() { // from class: com.join.kotlin.ui.cloudarchive.data.ModDataRequest$downloadArchive$1
            @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
            public void onError(@Nullable String str) {
                ModDataRequest.this.getStatus().setValue(5);
            }

            @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
            public void onFinish(@Nullable String str) {
                boolean z4;
                ModDataRequest.this.getStatus().setValue(4);
                List<CloudArchiveTable> q4 = g.t().q(archiveData.getGame_id());
                int i5 = 1;
                while (true) {
                    if (i5 >= 101) {
                        i5 = 1;
                        break;
                    }
                    if (q4 != null) {
                        for (CloudArchiveTable cloudArchiveTable : q4) {
                            if (cloudArchiveTable.getUserId() == i5) {
                                z4 = true;
                                break;
                            }
                        }
                    }
                    z4 = false;
                    if (!z4) {
                        break;
                    }
                    i5++;
                }
                v0.d("userIdNew", "" + i5);
                CloudArchiveTable cloudArchiveTable2 = new CloudArchiveTable();
                if (archiveData.getUserId() != 0) {
                    i5 = archiveData.getUserId();
                }
                int i6 = i4 != 1 ? i5 : 0;
                cloudArchiveTable2.setArchiveType("folder");
                cloudArchiveTable2.setArchiveFolder(pathData.getMainArchiveLocalPath());
                cloudArchiveTable2.setMainArchiveLocalPath2(pathData.getSubArchiveLocalPath());
                cloudArchiveTable2.setPackageName(archiveData.getPackageName());
                cloudArchiveTable2.setArchiveName(archiveData.getArchiveDesc());
                cloudArchiveTable2.setUserId(i6);
                cloudArchiveTable2.setGameId(archiveData.getGame_id());
                cloudArchiveTable2.setArchiveZipPath(objectRef.element);
                cloudArchiveTable2.setArchiveId(archiveData.getId());
                cloudArchiveTable2.setIsFirstRun(1);
                cloudArchiveTable2.setArchiveDataJson(JsonMapper.toJsonString(archiveData));
                if (i6 == 0) {
                    ModDataRequest.this.unzipToUser0(cloudArchiveTable2, context);
                    return;
                }
                com.join.mgps.va.overmind.d.f54937g.d().c0(cloudArchiveTable2.getUserId());
                ModDataRequest.this.unZip(cloudArchiveTable2, context);
            }

            @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
            public void onProgress(@Nullable String str, int i5, @Nullable String str2) {
                StringBuilder sb = new StringBuilder();
                sb.append("onProgress progress=");
                sb.append(i5);
                ModDataRequest.this.getStatus().setValue(3);
                ModDataRequest.this.getProgress().setValue(Integer.valueOf(i5));
                if (ModDataRequest.this.getActualSize() > 1048576) {
                    MutableLiveData<String> progressTextShow = ModDataRequest.this.getProgressTextShow();
                    StringBuilder sb2 = new StringBuilder();
                    long j4 = 1024;
                    sb2.append((((ModDataRequest.this.getActualSize() / 100) * i5) / j4) / j4);
                    sb2.append("M/");
                    sb2.append((ModDataRequest.this.getActualSize() / j4) / j4);
                    sb2.append('M');
                    progressTextShow.setValue(sb2.toString());
                } else if (ModDataRequest.this.getActualSize() > 0) {
                    MutableLiveData<String> progressTextShow2 = ModDataRequest.this.getProgressTextShow();
                    StringBuilder sb3 = new StringBuilder();
                    long j5 = 1024;
                    sb3.append(((ModDataRequest.this.getActualSize() / 100) * i5) / j5);
                    sb3.append("KB/");
                    sb3.append(ModDataRequest.this.getActualSize() / j5);
                    sb3.append("KB");
                    progressTextShow2.setValue(sb3.toString());
                }
            }

            @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
            public void onStart(@Nullable String str) {
                ModDataRequest.this.getStatus().setValue(1);
            }

            @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
            public void onStop(@Nullable String str) {
                ModDataRequest.this.getStatus().setValue(6);
            }

            @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
            public void onWait(@Nullable String str) {
                ModDataRequest.this.getStatus().setValue(2);
            }

            @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
            public void updateSize(@Nullable String str, long j4) {
                ModDataRequest.this.setActualSize(j4);
            }
        });
        getFactory().i();
        String valueOf = String.valueOf(archiveData.getId());
        String str = filePath + archiveData.getGame_id() + '/';
        objectRef.element = str + valueOf;
        getFactory().b(new com.github.snowdream.android.app.downloader.c(archiveData.getArchiveLocation(), valueOf, str, archiveData.getArchiveSize()));
    }

    public final long getActualSize() {
        return this.actualSize;
    }

    public final void getAllDownloedArchive(@NotNull Context context, final int i4, @NotNull String gameId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(gameId, "gameId");
        RequestModel requestModel = new RequestModel();
        requestModel.setDefault(context);
        RequestGameIdArgs requestGameIdArgs = new RequestGameIdArgs();
        requestGameIdArgs.setGameId(gameId);
        requestGameIdArgs.setPage(i4);
        requestGameIdArgs.setUid(AccountUtil_.getInstance_(context).getAccountData().getUid());
        requestModel.setArgs(requestGameIdArgs);
        Call<ResponseModel<List<ArchiveData>>> I0 = i.D0().B0().I0(requestModel.makeSign());
        this.result = I0;
        if (I0 != null) {
            I0.enqueue(new Callback<ResponseModel<List<? extends ArchiveData>>>() { // from class: com.join.kotlin.ui.cloudarchive.data.ModDataRequest$getAllDownloedArchive$1
                @Override // retrofit2.Callback
                public void onFailure(@NotNull Call<ResponseModel<List<? extends ArchiveData>>> call, @NotNull Throwable t4) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(t4, "t");
                    ResponseModel<List<ArchiveData>> responseModel = new ResponseModel<>();
                    responseModel.setCode(401);
                    this.getResultAllHasDownloadData().setValue(responseModel);
                }

                @Override // retrofit2.Callback
                public void onResponse(@NotNull Call<ResponseModel<List<? extends ArchiveData>>> call, @NotNull Response<ResponseModel<List<? extends ArchiveData>>> response) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response, "response");
                    if (response.body() != null) {
                        ResponseModel<List<? extends ArchiveData>> body = response.body();
                        if (body != null) {
                            body.setPage(i4);
                        }
                        this.getResultAllHasDownloadData().setValue(body);
                        return;
                    }
                    ResponseModel<List<ArchiveData>> responseModel = new ResponseModel<>();
                    responseModel.setCode(401);
                    this.getResultAllHasDownloadData().setValue(responseModel);
                }
            });
        }
    }

    @NotNull
    public final MutableLiveData<ArchiveData> getDataChangeItem() {
        return this.dataChangeItem;
    }

    @NotNull
    public final com.github.snowdream.android.app.downloader.b getFactory() {
        Object value = this.factory$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-factory>(...)");
        return (com.github.snowdream.android.app.downloader.b) value;
    }

    public final long getFileUpdateTimeMain(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.time = 0L;
        getFileUpdateTime(file);
        return this.time;
    }

    public final boolean getInstallInExtPlug() {
        return this.installInExtPlug;
    }

    public final void getModeDatas(@NotNull Context context, final int i4, @NotNull String gameId, long j4, @Nullable String str, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(gameId, "gameId");
        RequestModel requestModel = new RequestModel();
        requestModel.setDefault(context);
        RequestGameIdArgs requestGameIdArgs = new RequestGameIdArgs();
        requestGameIdArgs.setGameId(gameId);
        requestGameIdArgs.setPage(i4);
        requestGameIdArgs.setUid(AccountUtil_.getInstance_(context).getAccountData().getUid());
        requestGameIdArgs.setLastEnterTime(j4);
        requestGameIdArgs.setTagId(str);
        requestGameIdArgs.setType(num != null ? num.intValue() : 1);
        requestModel.setArgs(requestGameIdArgs);
        Call<ResponseModel<List<ArchiveData>>> b12 = i.D0().B0().b1(requestModel.makeSign());
        this.result = b12;
        if (b12 != null) {
            b12.enqueue(new Callback<ResponseModel<List<? extends ArchiveData>>>() { // from class: com.join.kotlin.ui.cloudarchive.data.ModDataRequest$getModeDatas$1
                @Override // retrofit2.Callback
                public void onFailure(@NotNull Call<ResponseModel<List<? extends ArchiveData>>> call, @NotNull Throwable t4) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(t4, "t");
                    ResponseModel<List<ArchiveData>> responseModel = new ResponseModel<>();
                    responseModel.setCode(401);
                    this.getResultData().setValue(responseModel);
                }

                @Override // retrofit2.Callback
                public void onResponse(@NotNull Call<ResponseModel<List<? extends ArchiveData>>> call, @NotNull Response<ResponseModel<List<? extends ArchiveData>>> response) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response, "response");
                    if (response.body() != null) {
                        ResponseModel<List<? extends ArchiveData>> body = response.body();
                        if (body != null) {
                            body.setPage(i4);
                        }
                        this.getResultData().setValue(body);
                        return;
                    }
                    ResponseModel<List<ArchiveData>> responseModel = new ResponseModel<>();
                    responseModel.setCode(401);
                    this.getResultData().setValue(responseModel);
                }
            });
        }
    }

    public final void getModeDatasAddPd(@NotNull Context context, final int i4, @NotNull String gameId, long j4, @Nullable String str, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(gameId, "gameId");
        RequestModel requestModel = new RequestModel();
        requestModel.setDefault(context);
        RequestGameIdArgs requestGameIdArgs = new RequestGameIdArgs();
        requestGameIdArgs.setGameId(gameId);
        requestGameIdArgs.setPage(i4);
        requestGameIdArgs.setUid(AccountUtil_.getInstance_(context).getAccountData().getUid());
        requestGameIdArgs.setLastEnterTime(j4);
        requestGameIdArgs.setTagId(str);
        requestGameIdArgs.setType(num != null ? num.intValue() : 1);
        requestModel.setArgs(requestGameIdArgs);
        Call<ResponseModel<ArchiveDataAddPd>> G0 = i.D0().B0().G0(requestModel.makeSign());
        this.resultPd = G0;
        if (G0 != null) {
            G0.enqueue(new Callback<ResponseModel<ArchiveDataAddPd>>() { // from class: com.join.kotlin.ui.cloudarchive.data.ModDataRequest$getModeDatasAddPd$1
                @Override // retrofit2.Callback
                public void onFailure(@NotNull Call<ResponseModel<ArchiveDataAddPd>> call, @NotNull Throwable t4) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(t4, "t");
                    ResponseModel<ArchiveDataAddPd> responseModel = new ResponseModel<>();
                    responseModel.setCode(401);
                    this.getResultDataPd().setValue(responseModel);
                }

                @Override // retrofit2.Callback
                public void onResponse(@NotNull Call<ResponseModel<ArchiveDataAddPd>> call, @NotNull Response<ResponseModel<ArchiveDataAddPd>> response) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response, "response");
                    if (response.body() != null) {
                        ResponseModel<ArchiveDataAddPd> body = response.body();
                        if (body != null) {
                            body.setPage(i4);
                        }
                        this.getResultDataPd().setValue(body);
                        return;
                    }
                    ResponseModel<ArchiveDataAddPd> responseModel = new ResponseModel<>();
                    responseModel.setCode(401);
                    this.getResultDataPd().setValue(responseModel);
                }
            });
        }
    }

    @NotNull
    public final MutableLiveData<Integer> getProgress() {
        return this.progress;
    }

    @NotNull
    public final MutableLiveData<String> getProgressTextShow() {
        return this.progressTextShow;
    }

    @Nullable
    public final Call<ResponseModel<List<ArchiveData>>> getResult() {
        return this.result;
    }

    @NotNull
    public final MutableLiveData<ResponseModel<List<ArchiveData>>> getResultAllHasDownloadData() {
        return this.resultAllHasDownloadData;
    }

    @NotNull
    public final MutableLiveData<ResponseModel<List<ArchiveData>>> getResultData() {
        return this.resultData;
    }

    @NotNull
    public final MutableLiveData<ResponseModel<ArchiveDataAddPd>> getResultDataPd() {
        return this.resultDataPd;
    }

    @Nullable
    public final Call<ResponseModel<ArchiveDataAddPd>> getResultPd() {
        return this.resultPd;
    }

    @NotNull
    public final MutableLiveData<Integer> getStatus() {
        return this.status;
    }

    public final long getTime() {
        return this.time;
    }

    public final void loadMyInShop(@NotNull Context context, final int i4, @NotNull String gameId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(gameId, "gameId");
        RequestModel requestModel = new RequestModel();
        requestModel.setDefault(context);
        RequestGameIdArgs requestGameIdArgs = new RequestGameIdArgs();
        requestGameIdArgs.setGameId(gameId);
        requestGameIdArgs.setPage(i4);
        requestGameIdArgs.setUid(AccountUtil_.getInstance_(context).getAccountData().getUid());
        requestModel.setArgs(requestGameIdArgs);
        Call<ResponseModel<List<ArchiveData>>> D0 = i.D0().B0().D0(requestModel.makeSign());
        this.result = D0;
        if (D0 != null) {
            D0.enqueue(new Callback<ResponseModel<List<? extends ArchiveData>>>() { // from class: com.join.kotlin.ui.cloudarchive.data.ModDataRequest$loadMyInShop$1
                @Override // retrofit2.Callback
                public void onFailure(@NotNull Call<ResponseModel<List<? extends ArchiveData>>> call, @NotNull Throwable t4) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(t4, "t");
                    ResponseModel<List<ArchiveData>> responseModel = new ResponseModel<>();
                    responseModel.setCode(401);
                    this.getResultData().setValue(responseModel);
                }

                @Override // retrofit2.Callback
                public void onResponse(@NotNull Call<ResponseModel<List<? extends ArchiveData>>> call, @NotNull Response<ResponseModel<List<? extends ArchiveData>>> response) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response, "response");
                    if (response.body() != null) {
                        ResponseModel<List<? extends ArchiveData>> body = response.body();
                        if (body != null) {
                            body.setPage(i4);
                        }
                        this.getResultData().setValue(body);
                        return;
                    }
                    ResponseModel<List<ArchiveData>> responseModel = new ResponseModel<>();
                    responseModel.setCode(401);
                    this.getResultData().setValue(responseModel);
                }
            });
        }
    }

    public final void reportDownloadArchive(@NotNull Context context, @NotNull ArchiveData archiveData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(archiveData, "archiveData");
        RequestModel requestModel = new RequestModel();
        requestModel.setDefault(context);
        ArchiveArgs archiveArgs = new ArchiveArgs();
        archiveArgs.archiveId = archiveData.getId();
        archiveArgs.gameId = archiveData.getGame_id();
        archiveArgs.uid = AccountUtil_.getInstance_(context).getAccountData().getUid();
        requestModel.setArgs(archiveArgs);
        i.D0().B0().Z0(requestModel.makeSign()).enqueue(new Callback<ResponseModel<?>>() { // from class: com.join.kotlin.ui.cloudarchive.data.ModDataRequest$reportDownloadArchive$1
            @Override // retrofit2.Callback
            public void onFailure(@NotNull Call<ResponseModel<?>> call, @NotNull Throwable t4) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(t4, "t");
            }

            @Override // retrofit2.Callback
            public void onResponse(@NotNull Call<ResponseModel<?>> call, @NotNull Response<ResponseModel<?>> response) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
            }
        });
    }

    public final void setActualSize(long j4) {
        this.actualSize = j4;
    }

    public final void setDataChangeItem(@NotNull MutableLiveData<ArchiveData> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.dataChangeItem = mutableLiveData;
    }

    public final void setInstallInExtPlug(boolean z4) {
        this.installInExtPlug = z4;
    }

    public final void setProgress(@NotNull MutableLiveData<Integer> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.progress = mutableLiveData;
    }

    public final void setProgressTextShow(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.progressTextShow = mutableLiveData;
    }

    public final void setResult(@Nullable Call<ResponseModel<List<ArchiveData>>> call) {
        this.result = call;
    }

    public final void setResultAllHasDownloadData(@NotNull MutableLiveData<ResponseModel<List<ArchiveData>>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.resultAllHasDownloadData = mutableLiveData;
    }

    public final void setResultData(@NotNull MutableLiveData<ResponseModel<List<ArchiveData>>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.resultData = mutableLiveData;
    }

    public final void setResultDataPd(@NotNull MutableLiveData<ResponseModel<ArchiveDataAddPd>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.resultDataPd = mutableLiveData;
    }

    public final void setResultPd(@Nullable Call<ResponseModel<ArchiveDataAddPd>> call) {
        this.resultPd = call;
    }

    public final void setStatus(@NotNull MutableLiveData<Integer> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.status = mutableLiveData;
    }

    public final void setTime(long j4) {
        this.time = j4;
    }

    public final void unzipToPath(@NotNull CloudArchiveTable table, @NotNull String archiveLocalPath, @NotNull Context context) {
        boolean startsWith$default;
        boolean startsWith$default2;
        String replace$default;
        String str;
        String replace$default2;
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(archiveLocalPath, "archiveLocalPath");
        Intrinsics.checkNotNullParameter(context, "context");
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(archiveLocalPath, "/Android/data", false, 2, null);
        if (startsWith$default) {
            f fVar = f.f54952a;
            String b02 = fVar.b0();
            if (this.installInExtPlug) {
                b02 = fVar.c0();
            }
            if (table.getUserId() == 0) {
                str = "";
            } else {
                str = "/user/" + table.getUserId();
            }
            replace$default2 = StringsKt__StringsJVMKt.replace$default(archiveLocalPath, "/Android/data/" + table.getPackageName(), "/Android/data" + str + File.separator + table.getPackageName(), false, 4, (Object) null);
            unZipOne(table, b02, replace$default2, context);
            return;
        }
        startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(archiveLocalPath, "/data/data/", false, 2, null);
        if (startsWith$default2) {
            f fVar2 = f.f54952a;
            String packageName = table.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "table.packageName");
            String w4 = fVar2.w(packageName, table.getUserId());
            if (this.installInExtPlug) {
                String packageName2 = table.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName2, "table.packageName");
                w4 = fVar2.z(packageName2, table.getUserId());
            }
            replace$default = StringsKt__StringsJVMKt.replace$default(archiveLocalPath, "/data/data/" + table.getPackageName(), "", false, 4, (Object) null);
            unZipOne(table, w4, replace$default, context);
            return;
        }
        unZipOne(table, f.f54952a.b0(), "/user/" + table.getUserId() + '/' + table.getPackageName() + '/' + archiveLocalPath, context);
    }
}
