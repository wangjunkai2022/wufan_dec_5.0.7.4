package com.join.kotlin.ui.cloudarchive;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.join.kotlin.domain.common.SingleLiveEvent;
import com.join.kotlin.ui.cloudarchive.data.ArchiveData;
import com.join.kotlin.ui.cloudarchive.data.ModGameArchivePathData;
import com.join.mgps.dto.GoldFingerBean;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.s1;
import org.jetbrains.annotations.NotNull;
/* compiled from: CloudShareViewModle.kt */
/* loaded from: classes3.dex */
public final class CloudShareViewModle extends ViewModel {
    @NotNull
    private final SingleLiveEvent<CloudShareEvent> _event;
    @NotNull
    private SingleLiveEvent<CloudShareEvent> event;
    private boolean initFinish;
    private boolean installInExtPlug;
    private long time;
    @NotNull
    private MutableLiveData<Long> runIngArchiveId = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<Integer> showDownlloadDialog = new MutableLiveData<>();
    @NotNull
    private ModGameArchivePathData modGameArchivePathData = new ModGameArchivePathData();
    @NotNull
    private ArchiveData archiveData = new ArchiveData();
    @NotNull
    private List<GoldFingerBean> goldFingerBean = new ArrayList();
    @NotNull
    private ArchiveData lastStartArchive = new ArchiveData();
    @NotNull
    private MutableLiveData<List<ArchiveData>> localArchiveLists = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<Boolean> showDialog = new MutableLiveData<>();

    /* compiled from: CloudShareViewModle.kt */
    /* loaded from: classes3.dex */
    public static final class CloudShareEvent {
        private int showdownloadModDialog;

        public final int getShowdownloadModDialog() {
            return this.showdownloadModDialog;
        }

        public final void setShowdownloadModDialog(int i4) {
            this.showdownloadModDialog = i4;
        }
    }

    public CloudShareViewModle() {
        SingleLiveEvent<CloudShareEvent> singleLiveEvent = new SingleLiveEvent<>();
        this._event = singleLiveEvent;
        this.event = singleLiveEvent;
        this.runIngArchiveId.setValue(0L);
        this.localArchiveLists.setValue(new ArrayList());
        this.showDialog.setValue(Boolean.FALSE);
    }

    private final void getFileUpdateTime(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        int i4 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    int length = listFiles.length;
                    while (i4 < length) {
                        File f5 = listFiles[i4];
                        Intrinsics.checkNotNullExpressionValue(f5, "f");
                        getFileUpdateTime(f5);
                        i4++;
                    }
                    return;
                }
                return;
            }
            long millis = Files.readAttributes(file.toPath(), BasicFileAttributes.class, new LinkOption[0]).lastModifiedTime().toMillis();
            if (millis > this.time) {
                this.time = millis;
            }
        } else if (file.isDirectory()) {
            File[] listFiles2 = file.listFiles();
            if (listFiles2 != null) {
                int length2 = listFiles2.length;
                while (i4 < length2) {
                    File f6 = listFiles2[i4];
                    Intrinsics.checkNotNullExpressionValue(f6, "f");
                    getFileUpdateTime(f6);
                    i4++;
                }
            }
        } else {
            long lastModified = file.lastModified();
            if (lastModified > this.time) {
                this.time = lastModified;
            }
        }
    }

    private final List<ArchiveData> loadLocalArchiveexcues(String str, ModGameArchivePathData modGameArchivePathData, String str2, List<ArchiveData> list) {
        boolean startsWith$default;
        boolean startsWith$default2;
        int i4;
        boolean startsWith$default3;
        boolean startsWith$default4;
        int i5;
        File[] fileArr;
        String replace$default;
        int i6;
        File[] fileArr2;
        ModGameArchivePathData modGameArchivePathData2 = modGameArchivePathData;
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str2, "/Android/data", false, 2, null);
        if (!startsWith$default) {
            startsWith$default3 = StringsKt__StringsJVMKt.startsWith$default(str2, "Android/data", false, 2, null);
            if (!startsWith$default3) {
                startsWith$default4 = StringsKt__StringsJVMKt.startsWith$default(str2, "/data/data", false, 2, null);
                if (startsWith$default4) {
                    String x4 = com.join.mgps.va.overmind.f.x(com.join.mgps.va.overmind.f.f54952a, str, 0, 2, null);
                    StringBuilder sb = new StringBuilder();
                    sb.append(x4);
                    replace$default = StringsKt__StringsJVMKt.replace$default(str2, "/data/data/" + str, "", false, 4, (Object) null);
                    sb.append(replace$default);
                    String sb2 = sb.toString();
                    File[] listFiles = new File(sb2).listFiles();
                    if (listFiles != null) {
                        if (!(listFiles.length == 0)) {
                            if (modGameArchivePathData.getArchiveType() == 0) {
                                ArchiveData archiveData = new ArchiveData();
                                boolean z4 = false;
                                for (File file : listFiles) {
                                    Intrinsics.checkNotNullExpressionValue(file, "file");
                                    z4 = checkArchiveHas(modGameArchivePathData2, file);
                                    if (z4) {
                                        z4 = true;
                                    }
                                    if (z4) {
                                        break;
                                    }
                                }
                                if (z4) {
                                    archiveData.setArchiveLocalPath(sb2);
                                    archiveData.setArchiveDesc("我的默认存档");
                                    archiveData.setAddTime(getFileUpdateTimeMain(new File(sb2)) / 1000);
                                    archiveData.setArchiveLocation(str2);
                                    archiveData.setPackageName(str);
                                    archiveData.setGame_id(modGameArchivePathData.getGameId());
                                    archiveData.setShowText("启动");
                                    archiveData.setStatus(8);
                                    archiveData.setId("0");
                                    archiveData.setUserId(0);
                                    list.add(archiveData);
                                }
                            } else {
                                int length = listFiles.length;
                                int i7 = 0;
                                int i8 = 0;
                                while (i7 < length) {
                                    File file2 = listFiles[i7];
                                    Intrinsics.checkNotNullExpressionValue(file2, "file");
                                    if (checkArchiveHas(modGameArchivePathData2, file2)) {
                                        i8++;
                                        ArchiveData archiveData2 = new ArchiveData();
                                        archiveData2.setArchiveLocalPath(file2.getAbsolutePath());
                                        archiveData2.setArchiveDesc("我的默认存档" + i8);
                                        i6 = length;
                                        fileArr2 = listFiles;
                                        archiveData2.setAddTime(getFileUpdateTimeMain(file2) / ((long) 1000));
                                        archiveData2.setArchiveLocation(str2);
                                        archiveData2.setPackageName(str);
                                        archiveData2.setGame_id(modGameArchivePathData.getGameId());
                                        archiveData2.setShowText("启动");
                                        archiveData2.setStatus(8);
                                        archiveData2.setId("0");
                                        archiveData2.setUserId(0);
                                        list.add(archiveData2);
                                    } else {
                                        i6 = length;
                                        fileArr2 = listFiles;
                                    }
                                    i7++;
                                    listFiles = fileArr2;
                                    length = i6;
                                }
                            }
                        }
                    }
                    return list;
                }
                String str3 = Environment.getExternalStorageDirectory().getAbsolutePath() + str2;
                File[] listFiles2 = new File(str3).listFiles();
                if (listFiles2 != null) {
                    if (!(listFiles2.length == 0)) {
                        if (modGameArchivePathData.getArchiveType() == 0) {
                            ArchiveData archiveData3 = new ArchiveData();
                            boolean z5 = false;
                            for (File file3 : listFiles2) {
                                Intrinsics.checkNotNullExpressionValue(file3, "file");
                                boolean checkArchiveHas = checkArchiveHas(modGameArchivePathData2, file3);
                                z5 = checkArchiveHas ? true : checkArchiveHas;
                                if (z5) {
                                    break;
                                }
                            }
                            if (z5) {
                                archiveData3.setArchiveLocalPath(str3);
                                archiveData3.setArchiveDesc("我的默认存档");
                                archiveData3.setAddTime(getFileUpdateTimeMain(new File(str3)) / 1000);
                                archiveData3.setArchiveLocation(str2);
                                archiveData3.setPackageName(str);
                                archiveData3.setGame_id(modGameArchivePathData.getGameId());
                                archiveData3.setShowText("启动");
                                archiveData3.setStatus(8);
                                archiveData3.setId("0");
                                list.add(archiveData3);
                            }
                        } else {
                            int length2 = listFiles2.length;
                            int i9 = 0;
                            int i10 = 0;
                            while (i9 < length2) {
                                File file4 = listFiles2[i9];
                                Intrinsics.checkNotNullExpressionValue(file4, "file");
                                if (checkArchiveHas(modGameArchivePathData2, file4)) {
                                    i10++;
                                    ArchiveData archiveData4 = new ArchiveData();
                                    archiveData4.setArchiveLocalPath(file4.getAbsolutePath());
                                    archiveData4.setArchiveDesc("我的默认存档" + i10);
                                    i5 = length2;
                                    fileArr = listFiles2;
                                    archiveData4.setAddTime(getFileUpdateTimeMain(file4) / ((long) 1000));
                                    archiveData4.setArchiveLocation(str2);
                                    archiveData4.setPackageName(str);
                                    archiveData4.setGame_id(modGameArchivePathData.getGameId());
                                    archiveData4.setShowText("启动");
                                    archiveData4.setStatus(8);
                                    archiveData4.setId("0");
                                    archiveData4.setUserId(0);
                                    list.add(archiveData4);
                                } else {
                                    i5 = length2;
                                    fileArr = listFiles2;
                                }
                                i9++;
                                listFiles2 = fileArr;
                                length2 = i5;
                            }
                        }
                    }
                }
                return list;
                return list;
            }
        }
        startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(str2, "Android/data", false, 2, null);
        String str4 = startsWith$default2 ? '/' + str2 : str2;
        String b02 = com.join.mgps.va.overmind.f.f54952a.b0();
        File[] listFiles3 = new File(b02 + str4).listFiles();
        if (listFiles3 != null) {
            if (!(listFiles3.length == 0)) {
                if (modGameArchivePathData.getArchiveType() == 0) {
                    ArchiveData archiveData5 = new ArchiveData();
                    archiveData5.setArchiveLocalPath(b02 + str4);
                    boolean z6 = false;
                    for (File file5 : listFiles3) {
                        Intrinsics.checkNotNullExpressionValue(file5, "file");
                        z6 = checkArchiveHas(modGameArchivePathData2, file5);
                        if (z6) {
                            z6 = true;
                        }
                        if (z6) {
                            break;
                        }
                    }
                    if (z6) {
                        archiveData5.setArchiveDesc("我的默认存档");
                        archiveData5.setAddTime(getFileUpdateTimeMain(new File(archiveData5.getArchiveLocalPath())) / 1000);
                        archiveData5.setArchiveLocation(str2);
                        archiveData5.setPackageName(str);
                        archiveData5.setGame_id(modGameArchivePathData.getGameId());
                        archiveData5.setShowText("启动");
                        archiveData5.setStatus(8);
                        archiveData5.setId("0");
                        archiveData5.setUserId(0);
                        list.add(archiveData5);
                    }
                } else {
                    int length3 = listFiles3.length;
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < length3) {
                        File file6 = listFiles3[i11];
                        Intrinsics.checkNotNullExpressionValue(file6, "file");
                        if (checkArchiveHas(modGameArchivePathData2, file6)) {
                            i12++;
                            ArchiveData archiveData6 = new ArchiveData();
                            archiveData6.setArchiveLocalPath(file6.getAbsolutePath());
                            archiveData6.setArchiveDesc("我的默认存档" + i12);
                            i4 = length3;
                            archiveData6.setAddTime(getFileUpdateTimeMain(file6) / ((long) 1000));
                            archiveData6.setArchiveLocation(str2);
                            archiveData6.setPackageName(str);
                            archiveData6.setGame_id(modGameArchivePathData.getGameId());
                            archiveData6.setShowText("启动");
                            archiveData6.setStatus(8);
                            archiveData6.setId("0");
                            archiveData6.setUserId(0);
                            list.add(archiveData6);
                        } else {
                            i4 = length3;
                        }
                        i11++;
                        modGameArchivePathData2 = modGameArchivePathData;
                        length3 = i4;
                    }
                }
            }
        }
        return list;
    }

    public final boolean checkArchiveHas(@NotNull ModGameArchivePathData modGameArchivePathData, @NotNull File file) {
        List<String> split$default;
        boolean startsWith$default;
        boolean endsWith$default;
        Intrinsics.checkNotNullParameter(modGameArchivePathData, "modGameArchivePathData");
        Intrinsics.checkNotNullParameter(file, "file");
        String archiveFileSuffix = modGameArchivePathData.getArchiveFileSuffix();
        Intrinsics.checkNotNullExpressionValue(archiveFileSuffix, "modGameArchivePathData.archiveFileSuffix");
        if (archiveFileSuffix.length() > 0) {
            String archiveFileSuffix2 = modGameArchivePathData.getArchiveFileSuffix();
            Intrinsics.checkNotNullExpressionValue(archiveFileSuffix2, "modGameArchivePathData.archiveFileSuffix");
            split$default = StringsKt__StringsKt.split$default((CharSequence) archiveFileSuffix2, new String[]{","}, false, 0, 6, (Object) null);
            if (!split$default.isEmpty()) {
                for (String str : split$default) {
                    if (Intrinsics.areEqual(str, file.getName())) {
                        return true;
                    }
                    String name = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "file.name");
                    startsWith$default = StringsKt__StringsJVMKt.startsWith$default(name, str, false, 2, null);
                    if (startsWith$default) {
                        return true;
                    }
                    String name2 = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name2, "file.name");
                    endsWith$default = StringsKt__StringsJVMKt.endsWith$default(name2, str, false, 2, null);
                    if (endsWith$default) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        return true;
    }

    @NotNull
    public final ArchiveData getArchiveData() {
        return this.archiveData;
    }

    public final void getDetialData(@NotNull String gameId, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(gameId, "gameId");
        Intrinsics.checkNotNullParameter(context, "context");
        this.showDialog.setValue(Boolean.TRUE);
        kotlinx.coroutines.k.f(s1.f71252b, d1.c(), null, new CloudShareViewModle$getDetialData$1(context, gameId, this, null), 2, null);
    }

    @NotNull
    public final SingleLiveEvent<CloudShareEvent> getEvent() {
        return this.event;
    }

    public final long getFileUpdateTimeMain(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.time = 0L;
        getFileUpdateTime(file);
        return this.time;
    }

    @NotNull
    public final List<GoldFingerBean> getGoldFingerBean() {
        return this.goldFingerBean;
    }

    public final boolean getInitFinish() {
        return this.initFinish;
    }

    public final boolean getInstallInExtPlug() {
        return this.installInExtPlug;
    }

    @NotNull
    public final ArchiveData getLastStartArchive() {
        return this.lastStartArchive;
    }

    @NotNull
    public final MutableLiveData<List<ArchiveData>> getLocalArchiveLists() {
        return this.localArchiveLists;
    }

    @NotNull
    public final ModGameArchivePathData getModGameArchivePathData() {
        return this.modGameArchivePathData;
    }

    @NotNull
    public final MutableLiveData<Long> getRunIngArchiveId() {
        return this.runIngArchiveId;
    }

    @NotNull
    public final MutableLiveData<Boolean> getShowDialog() {
        return this.showDialog;
    }

    @NotNull
    public final MutableLiveData<Integer> getShowDownlloadDialog() {
        return this.showDownlloadDialog;
    }

    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final List<ArchiveData> loadLocalArchive(@NotNull ModGameArchivePathData modGameArchivePathData) {
        Intrinsics.checkNotNullParameter(modGameArchivePathData, "modGameArchivePathData");
        ArrayList arrayList = new ArrayList();
        String folder = modGameArchivePathData.getMainArchiveLocalPath();
        String modPackageName = modGameArchivePathData.getModPackageName();
        Intrinsics.checkNotNullExpressionValue(modPackageName, "modGameArchivePathData.modPackageName");
        Intrinsics.checkNotNullExpressionValue(folder, "folder");
        loadLocalArchiveexcues(modPackageName, modGameArchivePathData, folder, arrayList);
        String folder2 = modGameArchivePathData.getSubArchiveLocalPath();
        if (!(folder2 == null || folder2.length() == 0)) {
            String modPackageName2 = modGameArchivePathData.getModPackageName();
            Intrinsics.checkNotNullExpressionValue(modPackageName2, "modGameArchivePathData.modPackageName");
            Intrinsics.checkNotNullExpressionValue(folder2, "folder2");
            loadLocalArchiveexcues(modPackageName2, modGameArchivePathData, folder2, arrayList);
        }
        return arrayList;
    }

    public final void loadLocalArchiveDatas(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.showDialog.setValue(Boolean.TRUE);
        kotlinx.coroutines.k.f(s1.f71252b, d1.c(), null, new CloudShareViewModle$loadLocalArchiveDatas$1(this, context, null), 2, null);
    }

    public final void loadLocalExArchive(@NotNull ModGameArchivePathData modGameArchivePathData, @NotNull String archiveLocation, @NotNull Context context, @NotNull List<ArchiveData> archiveList) {
        Intrinsics.checkNotNullParameter(modGameArchivePathData, "modGameArchivePathData");
        Intrinsics.checkNotNullParameter(archiveLocation, "archiveLocation");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(archiveList, "archiveList");
        Uri parse = Uri.parse(com.join.mgps.va.overmind.d.f54937g.e());
        String modPackageName = modGameArchivePathData.getModPackageName();
        Intrinsics.checkNotNullExpressionValue(modPackageName, "modGameArchivePathData.modPackageName");
        String archiveFileSuffix = modGameArchivePathData.getArchiveFileSuffix();
        Intrinsics.checkNotNullExpressionValue(archiveFileSuffix, "modGameArchivePathData.archiveFileSuffix");
        try {
            Cursor query = context.getContentResolver().query(parse, new String[]{modPackageName, archiveLocation, archiveFileSuffix, String.valueOf(modGameArchivePathData.getArchiveType())}, null, null, null);
            if (query != null && query.getCount() > 0) {
                while (query.moveToNext()) {
                    try {
                        String string = query.getString(query.getColumnIndexOrThrow("pathUrL"));
                        String time = query.getString(query.getColumnIndexOrThrow("time"));
                        ArchiveData archiveData = new ArchiveData();
                        archiveData.setArchiveLocalPath(string);
                        archiveData.setArchiveDesc("我的默认存档");
                        Intrinsics.checkNotNullExpressionValue(time, "time");
                        archiveData.setAddTime(Long.parseLong(time) / 1000);
                        archiveData.setArchiveLocation(archiveLocation);
                        archiveData.setPackageName(modGameArchivePathData.getModPackageName());
                        archiveData.setGame_id(modGameArchivePathData.getGameId());
                        archiveData.setShowText("启动");
                        archiveData.setStatus(8);
                        archiveData.setId("0");
                        archiveData.setUserId(0);
                        archiveList.add(archiveData);
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
        if (r0 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void loadLocalExtArchiveMain(@org.jetbrains.annotations.NotNull com.join.kotlin.ui.cloudarchive.data.ModGameArchivePathData r5, @org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull android.content.Context r7, @org.jetbrains.annotations.NotNull java.util.List<com.join.kotlin.ui.cloudarchive.data.ArchiveData> r8) {
        /*
            r4 = this;
            java.lang.String r0 = "modGameArchivePathData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "mainArchiveLocalPath"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "archiveList"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "/data/data"
            r1 = 0
            r2 = 2
            r3 = 0
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r6, r0, r1, r2, r3)
            if (r0 != 0) goto L27
            java.lang.String r0 = "/Android/data"
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r6, r0, r1, r2, r3)
            if (r0 == 0) goto L28
        L27:
            r1 = 1
        L28:
            if (r1 == 0) goto L2e
            r4.loadLocalExArchive(r5, r6, r7, r8)
            goto L3a
        L2e:
            java.lang.String r7 = r5.getModPackageName()
            java.lang.String r0 = "modGameArchivePathData.modPackageName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            r4.loadLocalArchiveexcues(r7, r5, r6, r8)
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.kotlin.ui.cloudarchive.CloudShareViewModle.loadLocalExtArchiveMain(com.join.kotlin.ui.cloudarchive.data.ModGameArchivePathData, java.lang.String, android.content.Context, java.util.List):void");
    }

    public final void setArchiveData(@NotNull ArchiveData archiveData) {
        Intrinsics.checkNotNullParameter(archiveData, "<set-?>");
        this.archiveData = archiveData;
    }

    public final void setEvent(@NotNull SingleLiveEvent<CloudShareEvent> singleLiveEvent) {
        Intrinsics.checkNotNullParameter(singleLiveEvent, "<set-?>");
        this.event = singleLiveEvent;
    }

    public final void setGoldFingerBean(@NotNull List<GoldFingerBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.goldFingerBean = list;
    }

    public final void setInitFinish(boolean z4) {
        this.initFinish = z4;
    }

    public final void setInstallInExtPlug(boolean z4) {
        this.installInExtPlug = z4;
    }

    public final void setLastStartArchive(@NotNull ArchiveData archiveData) {
        Intrinsics.checkNotNullParameter(archiveData, "<set-?>");
        this.lastStartArchive = archiveData;
    }

    public final void setLocalArchiveLists(@NotNull MutableLiveData<List<ArchiveData>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.localArchiveLists = mutableLiveData;
    }

    public final void setModGameArchivePathData(@NotNull ModGameArchivePathData modGameArchivePathData) {
        Intrinsics.checkNotNullParameter(modGameArchivePathData, "<set-?>");
        this.modGameArchivePathData = modGameArchivePathData;
    }

    public final void setRunIngArchiveId(@NotNull MutableLiveData<Long> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.runIngArchiveId = mutableLiveData;
    }

    public final void setShowDialog(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.showDialog = mutableLiveData;
    }

    public final void setShowDownlloadDialog(@NotNull MutableLiveData<Integer> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.showDownlloadDialog = mutableLiveData;
    }

    public final void setTime(long j4) {
        this.time = j4;
    }
}
