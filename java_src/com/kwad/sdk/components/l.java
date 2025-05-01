package com.kwad.sdk.components;

import android.content.Intent;
/* loaded from: classes5.dex */
public interface l {
    void a(o oVar);

    void callTKBridge(String str);

    void callbackDismiss();

    void callbackPageStatus(boolean z4, String str);

    String getClassName();

    Intent getIntent();

    String getTemplateString();

    String getUrl();

    String getViewKey();
}
