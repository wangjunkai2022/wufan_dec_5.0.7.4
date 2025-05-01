package com.papa.gsyvideoplayer.cache;

import java.util.HashMap;
import java.util.Map;
/* compiled from: ProxyCacheUserAgentHeadersInjector.java */
/* loaded from: classes5.dex */
public class d implements b0.b {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f58247a = new HashMap();

    @Override // b0.b
    public Map<String, String> a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("****** proxy addHeaders ****** ");
        Map<String, String> map = f58247a;
        sb.append(map.size());
        com.papa.gsyvideoplayer.utils.c.h(sb.toString());
        return map;
    }
}
