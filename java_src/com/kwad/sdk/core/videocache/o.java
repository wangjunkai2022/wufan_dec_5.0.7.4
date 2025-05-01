package com.kwad.sdk.core.videocache;

import android.content.Context;
import com.kwad.sdk.utils.ax;
import java.io.File;
/* loaded from: classes5.dex */
public final class o {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static File bx(Context context) {
        return new File(ax.cY(context), "video-cache");
    }
}
