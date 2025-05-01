package com.join.kotlin.ui.endgame;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.kotlin.domain.common.LoadBindindData;
import com.join.kotlin.ui.endgame.adapter.EndGameSlotListAdapter;
import com.join.mgps.Util.g0;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.h0;
import com.join.mgps.Util.l1;
import com.join.mgps.dto.ArchiveListBean;
import com.join.mgps.dto.CloudListDataBean;
import com.join.mgps.dto.RomArchived;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1.f;
/* compiled from: EndGameSlotViewModel.kt */
/* loaded from: classes3.dex */
public final class EndGameSlotViewModel extends ViewModel {
    @Nullable
    private ArchiveListBean selectedData;
    @NotNull
    private String gameId = "";
    @NotNull
    private String title = "本地存档";
    @NotNull
    private MutableLiveData<String> commitText = new MutableLiveData<>("完成(0/1)");
    @NotNull
    private MutableLiveData<List<ArchiveListBean>> listArchive = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<LoadBindindData> loadBindData = new MutableLiveData<>();
    @NotNull
    private MutableLiveData<Boolean> commitEnableStatus = new MutableLiveData<>(Boolean.FALSE);

    public EndGameSlotViewModel() {
        this.listArchive.setValue(new ArrayList());
    }

    private final void warpArchiveList(List<? extends RomArchived> list) {
        if (list != null) {
            try {
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    if (!g2.h(list.get(i4).getArchivedImagePath())) {
                        ArchiveListBean archiveListBean = new ArchiveListBean();
                        archiveListBean.setAddTime(list.get(i4).getArchivedTime());
                        archiveListBean.setArchiveFilePath(list.get(i4).getArchivedPath());
                        archiveListBean.setArchiveCover("file://" + list.get(i4).getArchivedImagePath());
                        archiveListBean.setArchiveCoverFilePath(list.get(i4).getArchivedImagePath());
                        archiveListBean.setArchiveFileName(list.get(i4).getFileName());
                        String archivedPath = list.get(i4).getArchivedPath();
                        Intrinsics.checkNotNullExpressionValue(archivedPath, "recordRoms[i].archivedPath");
                        archiveListBean.setArchiveName(getRecoverName(archivedPath));
                        archiveListBean.setFileSize(list.get(i4).getSize());
                        archiveListBean.setFileMd5(list.get(i4).getMd5());
                        List<ArchiveListBean> value = this.listArchive.getValue();
                        if (value != null) {
                            value.add(archiveListBean);
                        }
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    public final void commentArchive(@NotNull Context context, @NotNull CloudListDataBean archiveData, @NotNull String type, int i4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(archiveData, "archiveData");
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @NotNull
    public final MutableLiveData<Boolean> getCommitEnableStatus() {
        return this.commitEnableStatus;
    }

    @NotNull
    public final MutableLiveData<String> getCommitText() {
        return this.commitText;
    }

    @NotNull
    public final String getGameId() {
        return this.gameId;
    }

    @NotNull
    public final MutableLiveData<List<ArchiveListBean>> getListArchive() {
        return this.listArchive;
    }

    @NotNull
    public final MutableLiveData<LoadBindindData> getLoadBindData() {
        return this.loadBindData;
    }

    @Nullable
    public final String getRecoverName(@NotNull String recoverFilename) {
        int lastIndexOf$default;
        Intrinsics.checkNotNullParameter(recoverFilename, "recoverFilename");
        lastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) recoverFilename, h0.f27805a, 0, false, 6, (Object) null);
        String substring = recoverFilename.substring(lastIndexOf$default + 1, recoverFilename.length());
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        if (Intrinsics.areEqual("0", substring)) {
            return "快速存档";
        }
        if (Intrinsics.areEqual("99", substring)) {
            return "自动保存的存档";
        }
        return "存档" + substring;
    }

    @Nullable
    public final ArchiveListBean getSelectedData() {
        return this.selectedData;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final void loadLocalArchiveData() {
        boolean contains$default;
        boolean contains$default2;
        boolean contains$default3;
        boolean contains$default4;
        boolean contains$default5;
        boolean contains$default6;
        DownloadTask F = f.K().F(this.gameId);
        if (F != null) {
            String showName = F.getShowName();
            Intrinsics.checkNotNullExpressionValue(showName, "showName");
            this.title = showName;
            List<RomArchived> m4 = g0.m(F.getPlugin_num(), F.getGameZipPath());
            if (Intrinsics.areEqual(F.getPlugin_num(), "31")) {
                boolean z4 = false;
                boolean z5 = false;
                for (RomArchived romArchived : m4) {
                    String fileName = romArchived.getFileName();
                    Intrinsics.checkNotNullExpressionValue(fileName, "romArchived.fileName");
                    contains$default6 = StringsKt__StringsKt.contains$default((CharSequence) fileName, (CharSequence) "_v2", false, 2, (Object) null);
                    if (contains$default6) {
                        z4 = true;
                    } else {
                        z5 = true;
                    }
                }
                Iterator<RomArchived> it2 = m4.iterator();
                while (it2.hasNext()) {
                    RomArchived next = it2.next();
                    if (!z5 || z4) {
                        if (z5 && z4) {
                            if (l1.a(F.getPackageName())) {
                                String fileName2 = next.getFileName();
                                Intrinsics.checkNotNullExpressionValue(fileName2, "archived.fileName");
                                contains$default4 = StringsKt__StringsKt.contains$default((CharSequence) fileName2, (CharSequence) "_v2", false, 2, (Object) null);
                                if (contains$default4) {
                                    it2.remove();
                                }
                            } else {
                                String fileName3 = next.getFileName();
                                Intrinsics.checkNotNullExpressionValue(fileName3, "archived.fileName");
                                contains$default5 = StringsKt__StringsKt.contains$default((CharSequence) fileName3, (CharSequence) "_v2", false, 2, (Object) null);
                                if (!contains$default5) {
                                    it2.remove();
                                }
                            }
                        }
                    } else if (!l1.a(F.getPackageName())) {
                        it2.remove();
                    }
                }
            }
            if (Intrinsics.areEqual(F.getPlugin_num(), "31")) {
                boolean z6 = false;
                boolean z7 = false;
                for (RomArchived romArchived2 : m4) {
                    String fileName4 = romArchived2.getFileName();
                    Intrinsics.checkNotNullExpressionValue(fileName4, "romArchived.fileName");
                    contains$default3 = StringsKt__StringsKt.contains$default((CharSequence) fileName4, (CharSequence) "_v2", false, 2, (Object) null);
                    if (contains$default3) {
                        z6 = true;
                    } else {
                        z7 = true;
                    }
                }
                Iterator<RomArchived> it3 = m4.iterator();
                while (it3.hasNext()) {
                    RomArchived next2 = it3.next();
                    if (!z7 || z6) {
                        if (z7 && z6) {
                            if (l1.a(F.getPackageName())) {
                                String fileName5 = next2.getFileName();
                                Intrinsics.checkNotNullExpressionValue(fileName5, "archived.fileName");
                                contains$default = StringsKt__StringsKt.contains$default((CharSequence) fileName5, (CharSequence) "_v2", false, 2, (Object) null);
                                if (contains$default) {
                                    it3.remove();
                                }
                            } else {
                                String fileName6 = next2.getFileName();
                                Intrinsics.checkNotNullExpressionValue(fileName6, "archived.fileName");
                                contains$default2 = StringsKt__StringsKt.contains$default((CharSequence) fileName6, (CharSequence) "_v2", false, 2, (Object) null);
                                if (!contains$default2) {
                                    it3.remove();
                                }
                            }
                        }
                    } else if (!l1.a(F.getPackageName())) {
                        it3.remove();
                    }
                }
            }
            warpArchiveList(m4);
        }
    }

    public final void onItemChanged(@NotNull ArchiveListBean archiveData, @NotNull EndGameSlotListAdapter adapter) {
        Intrinsics.checkNotNullParameter(archiveData, "archiveData");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        List<ArchiveListBean> value = this.listArchive.getValue();
        Intrinsics.checkNotNull(value);
        int size = value.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            List<ArchiveListBean> value2 = this.listArchive.getValue();
            Intrinsics.checkNotNull(value2);
            if (Intrinsics.areEqual(value2.get(size).getId(), archiveData.getId())) {
                adapter.notifyItemChanged(size, archiveData);
                return;
            }
        }
    }

    public final void setCommitEnableStatus(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.commitEnableStatus = mutableLiveData;
    }

    public final void setCommitText(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.commitText = mutableLiveData;
    }

    public final void setGameId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.gameId = str;
    }

    public final void setListArchive(@NotNull MutableLiveData<List<ArchiveListBean>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.listArchive = mutableLiveData;
    }

    public final void setLoadBindData(@NotNull MutableLiveData<LoadBindindData> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.loadBindData = mutableLiveData;
    }

    public final void setSelectedData(@Nullable ArchiveListBean archiveListBean) {
        this.selectedData = archiveListBean;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }
}
