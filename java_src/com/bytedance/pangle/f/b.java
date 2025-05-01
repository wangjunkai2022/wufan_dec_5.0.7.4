package com.bytedance.pangle.f;

import com.bytedance.pangle.ZeusPluginInstallListener;
import com.bytedance.pangle.d;
/* loaded from: classes2.dex */
public final class b extends d.a {

    /* renamed from: a  reason: collision with root package name */
    private final ZeusPluginInstallListener f8386a;

    public b(ZeusPluginInstallListener zeusPluginInstallListener) {
        this.f8386a = zeusPluginInstallListener;
    }

    @Override // com.bytedance.pangle.d
    public final void a(String str, int i4, String str2) {
        ZeusPluginInstallListener zeusPluginInstallListener = this.f8386a;
        if (zeusPluginInstallListener != null) {
            zeusPluginInstallListener.onPluginInstall(str, i4, str2);
        }
    }
}
