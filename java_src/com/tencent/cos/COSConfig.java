package com.tencent.cos;

import com.tencent.cos.common.COSEndPoint;
/* loaded from: classes5.dex */
public class COSConfig {
    private static final String DEFAULT_COS_DOMAIN = "gz.file.myqcloud.com";
    private static final String DEFAULT_HTTP_PROTOCOL = "http://";
    private static final String DEFAULT_SERVER_FLAG = "/files/v2";
    private String httpProtocol = DEFAULT_HTTP_PROTOCOL;
    private String cosDomain = DEFAULT_COS_DOMAIN;
    private String serverFlag = DEFAULT_SERVER_FLAG;
    private int connectionTimeout = 30000;
    private int socketTimeout = 30000;
    private int maxConnectionsCount = 2;
    private int maxRetryCount = 3;
    private int threadPoolSize = 3;
    private COSEndPoint endPoint = COSEndPoint.COS_GZ;

    /* renamed from: com.tencent.cos.COSConfig$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$cos$common$COSEndPoint;

        static {
            int[] iArr = new int[COSEndPoint.values().length];
            $SwitchMap$com$tencent$cos$common$COSEndPoint = iArr;
            try {
                iArr[COSEndPoint.COS_GZ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$cos$common$COSEndPoint[COSEndPoint.COS_SH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$cos$common$COSEndPoint[COSEndPoint.COS_TJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public int getConnectionTimeout() {
        return this.connectionTimeout;
    }

    public String getCosDomain() {
        int i4 = AnonymousClass1.$SwitchMap$com$tencent$cos$common$COSEndPoint[this.endPoint.ordinal()];
        if (i4 == 1) {
            this.cosDomain = DEFAULT_COS_DOMAIN;
        } else if (i4 == 2) {
            this.cosDomain = "sh.file.myqcloud.com";
        } else if (i4 == 3) {
            this.cosDomain = "tj.file.myqcloud.com";
        }
        return this.cosDomain;
    }

    public COSEndPoint getEndPoint() {
        return this.endPoint;
    }

    public String getHttpProtocol() {
        return this.httpProtocol;
    }

    public int getMaxConnectionsCount() {
        return this.maxConnectionsCount;
    }

    public int getMaxRetryCount() {
        return this.maxRetryCount;
    }

    public String getServerFlag() {
        return this.serverFlag;
    }

    public int getSocketTimeout() {
        return this.socketTimeout;
    }

    public int getThreadPoolSize() {
        return this.threadPoolSize;
    }

    public void setConnectionTimeout(int i4) {
        this.connectionTimeout = i4;
    }

    public void setCosDomain(String str) {
        this.cosDomain = str;
    }

    public void setEndPoint(COSEndPoint cOSEndPoint) {
        this.endPoint = cOSEndPoint;
    }

    public void setHttpProtocol(String str) {
        this.httpProtocol = str;
    }

    public void setMaxConnectionsCount(int i4) {
        this.maxConnectionsCount = i4;
    }

    public void setMaxRetryCount(int i4) {
        this.maxRetryCount = i4;
    }

    public void setServerFlag(String str) {
        this.serverFlag = str;
    }

    public void setSocketTimeout(int i4) {
        this.socketTimeout = i4;
    }

    public void setThreadPoolSize(int i4) {
        this.threadPoolSize = i4;
    }
}
