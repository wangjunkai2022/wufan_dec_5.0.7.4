package com.join.kotlin.domain.common;

import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.servcie.i;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.enums.ConstantIntEnum;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: AppListItemShowBean.kt */
/* loaded from: classes3.dex */
public final class AppListItemShowBean {
    @NotNull
    private String appSizeText;
    private boolean describeShow;
    private boolean downMessageShow;
    private int downloadProgress;
    private int downloadStatus;
    private boolean giftShow;
    @NotNull
    private String lodingInfo;
    private boolean progresShow;
    private boolean progressZipShow;
    private boolean tagshow;
    private int zipProgress;

    public AppListItemShowBean(@NotNull CollectionBeanSubBusiness data, boolean z4) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.tagshow = true;
        this.describeShow = true;
        this.appSizeText = "";
        this.lodingInfo = "";
        this.giftShow = data.getGift_package_switch() == 1;
        DownloadTask downloadTask = data.getDownloadTask();
        if (downloadTask != null) {
            this.downloadStatus = downloadTask.getStatus();
        }
        if (z4) {
            if (downloadTask == null) {
                return;
            }
            int status = downloadTask.getStatus();
            if (status == 2) {
                this.tagshow = false;
                this.describeShow = false;
                this.progresShow = true;
                this.progressZipShow = false;
                this.downMessageShow = true;
            } else if (status == 12) {
                this.tagshow = false;
                this.describeShow = false;
                this.progresShow = false;
                this.progressZipShow = true;
                this.downMessageShow = true;
            }
            updateProgress(downloadTask);
        } else if (Intrinsics.areEqual(data.getPlugin_num(), String.valueOf(ConstantIntEnum.H5.value()))) {
            this.tagshow = false;
            this.progresShow = false;
            this.progressZipShow = false;
            this.describeShow = true;
        } else if (downloadTask == null) {
            this.tagshow = true;
            this.progresShow = false;
            this.progressZipShow = false;
        } else {
            String size = data.getSize();
            Intrinsics.checkNotNullExpressionValue(size, "data.getSize()");
            double parseDouble = Double.parseDouble(size);
            double d5 = 1024;
            Double.isNaN(d5);
            Double.isNaN(d5);
            long j4 = (long) (parseDouble * d5 * d5);
            int status2 = downloadTask.getStatus();
            if (status2 != 0) {
                if (status2 != 42) {
                    if (status2 != 48) {
                        if (status2 != 2) {
                            if (status2 != 3) {
                                if (status2 != 5) {
                                    if (status2 != 6) {
                                        if (status2 != 7) {
                                            switch (status2) {
                                                case 9:
                                                case 11:
                                                    break;
                                                case 10:
                                                    this.tagshow = false;
                                                    this.describeShow = false;
                                                    this.progresShow = true;
                                                    this.progressZipShow = false;
                                                    this.downMessageShow = true;
                                                    this.appSizeText = UtilsMy.a(downloadTask.getCurrentSize()) + '/' + UtilsMy.a(j4);
                                                    this.downloadProgress = (int) downloadTask.getProgress();
                                                    this.lodingInfo = "等待中";
                                                    return;
                                                case 12:
                                                    this.tagshow = false;
                                                    this.describeShow = false;
                                                    this.progresShow = false;
                                                    this.progressZipShow = true;
                                                    this.downMessageShow = true;
                                                    this.appSizeText = UtilsMy.a(j4) + '/' + UtilsMy.a(j4);
                                                    this.zipProgress = (int) downloadTask.getProgress();
                                                    this.lodingInfo = "解压中";
                                                    return;
                                                case 13:
                                                    this.tagshow = false;
                                                    this.describeShow = false;
                                                    this.progresShow = false;
                                                    this.progressZipShow = true;
                                                    this.downMessageShow = true;
                                                    this.appSizeText = UtilsMy.a(j4) + '/' + UtilsMy.a(j4);
                                                    this.zipProgress = (int) downloadTask.getProgress();
                                                    this.lodingInfo = "点击重新解压";
                                                    return;
                                                default:
                                                    return;
                                            }
                                        }
                                    }
                                }
                            }
                            this.tagshow = false;
                            this.describeShow = false;
                            this.progresShow = true;
                            this.progressZipShow = false;
                            this.downMessageShow = true;
                            try {
                                if (downloadTask.getSize() == 0) {
                                    this.appSizeText = UtilsMy.a(downloadTask.getCurrentSize()) + '/' + UtilsMy.a(j4);
                                } else {
                                    this.appSizeText = UtilsMy.a(downloadTask.getCurrentSize()) + '/' + UtilsMy.a(j4);
                                }
                                this.downloadProgress = (int) downloadTask.getProgress();
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                            this.lodingInfo = "暂停中";
                            return;
                        }
                        this.tagshow = false;
                        this.describeShow = false;
                        this.progresShow = true;
                        this.progressZipShow = false;
                        this.downMessageShow = true;
                        this.appSizeText = UtilsMy.a(downloadTask.getCurrentSize()) + '/' + UtilsMy.a(j4);
                        this.downloadProgress = (int) downloadTask.getProgress();
                        this.lodingInfo = downloadTask.getSpeed() + "/S";
                        return;
                    }
                }
                this.tagshow = true;
                this.describeShow = true;
                this.progresShow = false;
                this.progressZipShow = false;
                this.downMessageShow = false;
                return;
            }
            this.tagshow = true;
            this.describeShow = true;
            this.progresShow = false;
            this.progressZipShow = false;
            this.downMessageShow = false;
        }
    }

    private final void updateProgress(DownloadTask downloadTask) {
        DownloadTask f5 = i.e().f(downloadTask.getCrc_link_type_val());
        if (f5 == null) {
            return;
        }
        String showSize = downloadTask.getShowSize();
        Intrinsics.checkNotNullExpressionValue(showSize, "downloadTask.showSize");
        double parseDouble = Double.parseDouble(showSize);
        double d5 = 1024;
        Double.isNaN(d5);
        Double.isNaN(d5);
        this.appSizeText = UtilsMy.a(f5.getCurrentSize()) + '/' + UtilsMy.a((long) (parseDouble * d5 * d5));
        if (f5.getStatus() == 12) {
            this.zipProgress = (int) f5.getProgress();
        } else {
            this.downloadProgress = (int) f5.getProgress();
        }
        if (f5.getStatus() == 2) {
            this.lodingInfo = f5.getSpeed() + "/S";
        }
    }

    @NotNull
    public final String getAppSizeText() {
        return this.appSizeText;
    }

    public final boolean getDescribeShow() {
        return this.describeShow;
    }

    public final boolean getDownMessageShow() {
        return this.downMessageShow;
    }

    public final int getDownloadProgress() {
        return this.downloadProgress;
    }

    public final int getDownloadStatus() {
        return this.downloadStatus;
    }

    public final boolean getGiftShow() {
        return this.giftShow;
    }

    @NotNull
    public final String getLodingInfo() {
        return this.lodingInfo;
    }

    public final boolean getProgresShow() {
        return this.progresShow;
    }

    public final boolean getProgressZipShow() {
        return this.progressZipShow;
    }

    public final boolean getTagshow() {
        return this.tagshow;
    }

    public final int getZipProgress() {
        return this.zipProgress;
    }

    public final void setAppSizeText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appSizeText = str;
    }

    public final void setDescribeShow(boolean z4) {
        this.describeShow = z4;
    }

    public final void setDownMessageShow(boolean z4) {
        this.downMessageShow = z4;
    }

    public final void setDownloadProgress(int i4) {
        this.downloadProgress = i4;
    }

    public final void setDownloadStatus(int i4) {
        this.downloadStatus = i4;
    }

    public final void setGiftShow(boolean z4) {
        this.giftShow = z4;
    }

    public final void setLodingInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lodingInfo = str;
    }

    public final void setProgresShow(boolean z4) {
        this.progresShow = z4;
    }

    public final void setProgressZipShow(boolean z4) {
        this.progressZipShow = z4;
    }

    public final void setTagshow(boolean z4) {
        this.tagshow = z4;
    }

    public final void setZipProgress(int i4) {
        this.zipProgress = i4;
    }

    public final void updateItemNormal(@NotNull CollectionBeanSubBusiness data) {
        Intrinsics.checkNotNullParameter(data, "data");
        DownloadTask downloadTask = data.getDownloadTask();
        if (downloadTask != null) {
            this.downloadStatus = downloadTask.getStatus();
        }
        if (Intrinsics.areEqual(data.getPlugin_num(), String.valueOf(ConstantIntEnum.H5.value()))) {
            this.tagshow = false;
            this.progresShow = false;
            this.progressZipShow = false;
            this.describeShow = true;
        } else if (downloadTask == null) {
            this.tagshow = true;
            this.progresShow = false;
            this.progressZipShow = false;
        } else {
            String size = data.getSize();
            Intrinsics.checkNotNullExpressionValue(size, "data.getSize()");
            double parseDouble = Double.parseDouble(size);
            double d5 = 1024;
            Double.isNaN(d5);
            Double.isNaN(d5);
            long j4 = (long) (parseDouble * d5 * d5);
            int status = downloadTask.getStatus();
            if (status != 0) {
                if (status != 42) {
                    if (status != 48) {
                        if (status != 2) {
                            if (status != 3) {
                                if (status != 5) {
                                    if (status != 6) {
                                        if (status != 7) {
                                            switch (status) {
                                                case 9:
                                                case 11:
                                                    break;
                                                case 10:
                                                    this.tagshow = false;
                                                    this.describeShow = false;
                                                    this.progresShow = true;
                                                    this.progressZipShow = false;
                                                    this.downMessageShow = true;
                                                    this.appSizeText = UtilsMy.a(downloadTask.getCurrentSize()) + '/' + UtilsMy.a(j4);
                                                    this.downloadProgress = (int) downloadTask.getProgress();
                                                    this.lodingInfo = "等待中";
                                                    return;
                                                case 12:
                                                    this.tagshow = false;
                                                    this.describeShow = false;
                                                    this.progresShow = false;
                                                    this.progressZipShow = true;
                                                    this.downMessageShow = true;
                                                    this.appSizeText = UtilsMy.a(j4) + '/' + UtilsMy.a(j4);
                                                    this.zipProgress = (int) downloadTask.getProgress();
                                                    this.lodingInfo = "解压中";
                                                    return;
                                                case 13:
                                                    this.tagshow = false;
                                                    this.describeShow = false;
                                                    this.progresShow = false;
                                                    this.progressZipShow = true;
                                                    this.downMessageShow = true;
                                                    this.appSizeText = UtilsMy.a(j4) + '/' + UtilsMy.a(j4);
                                                    this.zipProgress = (int) downloadTask.getProgress();
                                                    this.lodingInfo = "点击重新解压";
                                                    return;
                                                default:
                                                    return;
                                            }
                                        }
                                    }
                                }
                            }
                            this.tagshow = false;
                            this.describeShow = false;
                            this.progresShow = true;
                            this.progressZipShow = false;
                            this.downMessageShow = true;
                            try {
                                if (downloadTask.getSize() == 0) {
                                    this.appSizeText = UtilsMy.a(downloadTask.getCurrentSize()) + '/' + UtilsMy.a(j4);
                                } else {
                                    this.appSizeText = UtilsMy.a(downloadTask.getCurrentSize()) + '/' + UtilsMy.a(j4);
                                }
                                this.downloadProgress = (int) downloadTask.getProgress();
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                            this.lodingInfo = "暂停中";
                            return;
                        }
                        this.tagshow = false;
                        this.describeShow = false;
                        this.progresShow = true;
                        this.progressZipShow = false;
                        this.downMessageShow = true;
                        this.appSizeText = UtilsMy.a(downloadTask.getCurrentSize()) + '/' + UtilsMy.a(j4);
                        this.downloadProgress = (int) downloadTask.getProgress();
                        this.lodingInfo = downloadTask.getSpeed() + "/S";
                        return;
                    }
                }
                this.tagshow = true;
                this.describeShow = true;
                this.progresShow = false;
                this.progressZipShow = false;
                this.downMessageShow = false;
                return;
            }
            this.tagshow = true;
            this.describeShow = true;
            this.progresShow = false;
            this.progressZipShow = false;
            this.downMessageShow = false;
        }
    }

    public final void updateItemProgress(@NotNull DownloadTask downloadTask) {
        Intrinsics.checkNotNullParameter(downloadTask, "downloadTask");
        int status = downloadTask.getStatus();
        if (status == 2) {
            this.tagshow = false;
            this.describeShow = false;
            this.progresShow = true;
            this.progressZipShow = false;
            this.downMessageShow = true;
        } else if (status == 12) {
            this.tagshow = false;
            this.describeShow = false;
            this.progresShow = false;
            this.progressZipShow = true;
            this.downMessageShow = true;
        }
        updateProgress(downloadTask);
    }
}
