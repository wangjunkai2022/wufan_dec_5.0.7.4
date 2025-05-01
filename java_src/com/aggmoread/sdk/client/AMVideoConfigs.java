package com.aggmoread.sdk.client;
/* loaded from: classes2.dex */
public class AMVideoConfigs {
    private boolean autoPlayMuted;
    private int autoPlayPolicy;
    private boolean detailPageMuted;
    private boolean enableDetailPage;
    private boolean enableUserControl;
    private boolean needCoverImage;
    private boolean needProgressBar;

    /* loaded from: classes2.dex */
    public interface AutoPlayPolicy {
        public static final int ALWAYS = 1;
        public static final int NEVER = 2;
        public static final int WIFI = 0;
    }

    /* loaded from: classes2.dex */
    public static final class Builder {
        private boolean autoPlayMuted;
        private int autoPlayPolicy;
        private boolean detailPageMuted;
        private boolean enableDetailPage;
        private boolean enableUserControl;
        private int maxVideoDuration;
        private int minVideoDuration;
        private boolean needCoverImage;
        private boolean needProgressBar;

        public Builder() {
            this.autoPlayPolicy = 1;
            this.autoPlayMuted = true;
            this.needProgressBar = true;
            this.needCoverImage = true;
            this.enableDetailPage = false;
            this.enableUserControl = false;
            this.detailPageMuted = false;
        }

        public Builder(AMVideoConfigs aMVideoConfigs) {
            this.autoPlayPolicy = 1;
            this.autoPlayMuted = true;
            this.needProgressBar = true;
            this.needCoverImage = true;
            this.enableDetailPage = false;
            this.enableUserControl = false;
            this.detailPageMuted = false;
            this.autoPlayPolicy = aMVideoConfigs.getAutoPlayPolicy();
            this.autoPlayMuted = aMVideoConfigs.isAutoPlayMuted();
            this.needProgressBar = aMVideoConfigs.isNeedProgressBar();
            this.needCoverImage = aMVideoConfigs.isNeedCoverImage();
            this.enableDetailPage = aMVideoConfigs.isEnableDetailPage();
            this.enableUserControl = aMVideoConfigs.isEnableUserControl();
            this.detailPageMuted = aMVideoConfigs.isDetailPageMuted();
        }

        public AMVideoConfigs build() {
            AMVideoConfigs aMVideoConfigs = new AMVideoConfigs();
            aMVideoConfigs.autoPlayPolicy = this.autoPlayPolicy;
            aMVideoConfigs.autoPlayMuted = this.autoPlayMuted;
            aMVideoConfigs.needCoverImage = this.needCoverImage;
            aMVideoConfigs.needProgressBar = this.needProgressBar;
            aMVideoConfigs.enableDetailPage = this.enableDetailPage;
            aMVideoConfigs.enableUserControl = this.enableUserControl;
            aMVideoConfigs.detailPageMuted = this.detailPageMuted;
            return aMVideoConfigs;
        }

        public Builder setAutoPlayMuted(boolean z4) {
            this.autoPlayMuted = z4;
            return this;
        }

        public Builder setAutoPlayPolicy(int i4) {
            this.autoPlayPolicy = i4;
            return this;
        }

        public Builder setDetailPageMuted(boolean z4) {
            this.detailPageMuted = z4;
            return this;
        }

        public Builder setEnableDetailPage(boolean z4) {
            this.enableDetailPage = z4;
            return this;
        }

        public Builder setEnableUserControl(boolean z4) {
            this.enableUserControl = z4;
            return this;
        }

        public Builder setNeedCoverImage(boolean z4) {
            this.needCoverImage = z4;
            return this;
        }

        public Builder setNeedProgressBar(boolean z4) {
            this.needProgressBar = z4;
            return this;
        }
    }

    private AMVideoConfigs() {
    }

    public int getAutoPlayPolicy() {
        return this.autoPlayPolicy;
    }

    public boolean isAutoPlayMuted() {
        return this.autoPlayMuted;
    }

    public boolean isDetailPageMuted() {
        return this.detailPageMuted;
    }

    public boolean isEnableDetailPage() {
        return this.enableDetailPage;
    }

    public boolean isEnableUserControl() {
        return this.enableUserControl;
    }

    public boolean isNeedCoverImage() {
        return this.needCoverImage;
    }

    public boolean isNeedProgressBar() {
        return this.needProgressBar;
    }
}
