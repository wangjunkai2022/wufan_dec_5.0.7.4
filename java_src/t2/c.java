package t2;

import android.view.Surface;
/* compiled from: IGSYSurfaceListener.java */
/* loaded from: classes5.dex */
public interface c {
    void onSurfaceAvailable(Surface surface);

    boolean onSurfaceDestroyed(Surface surface);

    void onSurfaceSizeChanged(Surface surface, int i4, int i5);

    void onSurfaceUpdated(Surface surface);
}
