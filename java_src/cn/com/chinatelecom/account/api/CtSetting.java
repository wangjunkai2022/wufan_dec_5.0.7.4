package cn.com.chinatelecom.account.api;
/* loaded from: classes2.dex */
public class CtSetting {
    private static final int DEFAULT_CONN_TIMEOUT = 5000;
    private static final int DEFAULT_READ_TIMEOUT = 5000;
    private static final int DEFAULT_TOTAL_TIMEOUT = 10000;
    private int connTimeout;
    private int readTimeout;
    private int totalTimeout;

    public CtSetting() {
        this.totalTimeout = 0;
        this.connTimeout = 0;
        this.readTimeout = 0;
    }

    public CtSetting(int i4, int i5, int i6) {
        this.totalTimeout = 0;
        this.connTimeout = 0;
        this.readTimeout = 0;
        this.connTimeout = i4;
        this.readTimeout = i5;
        this.totalTimeout = i6;
    }

    public static int getConnTimeout(CtSetting ctSetting) {
        int i4;
        if (ctSetting == null || (i4 = ctSetting.connTimeout) <= 0) {
            return 5000;
        }
        return i4;
    }

    public static int getReadTimeout(CtSetting ctSetting) {
        int i4;
        if (ctSetting == null || (i4 = ctSetting.readTimeout) <= 0) {
            return 5000;
        }
        return i4;
    }

    public static int getTotalTimeout(CtSetting ctSetting) {
        int i4;
        if (ctSetting == null || (i4 = ctSetting.totalTimeout) <= 0) {
            return 10000;
        }
        return i4;
    }

    public void setConnTimeout(int i4) {
        this.connTimeout = i4;
    }

    public void setReadTimeout(int i4) {
        this.readTimeout = i4;
    }

    public void setTotalTimeout(int i4) {
        this.totalTimeout = i4;
    }
}
