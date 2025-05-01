package com.papa91.arc.http.http;

import com.papa91.arc.http.rpc.RpcConstant;
import com.papa91.arc.util.StringUtils;
/* loaded from: classes5.dex */
public class DNSDataResult {
    public static String gameUrl = "http://anctapi.wufan88.com";

    public String getGameUrl() {
        return gameUrl;
    }

    public void setGameUrl(String str) {
        gameUrl = str;
    }

    public void updateRpcConstant() {
        if (StringUtils.isNotEmpty(gameUrl)) {
            RpcConstant.gameUrl = gameUrl;
        }
    }
}
