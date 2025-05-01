package com.tencent.cos.network;

import java.net.SocketTimeoutException;
/* loaded from: classes6.dex */
public class COSRetryHandler {
    public static synchronized boolean retryRequest(int i4, int i5, Exception exc) {
        synchronized (COSRetryHandler.class) {
            if (i4 >= i5) {
                return false;
            }
            if (exc instanceof SocketTimeoutException) {
                return true;
            }
            return exc instanceof InterruptedException;
        }
    }
}
