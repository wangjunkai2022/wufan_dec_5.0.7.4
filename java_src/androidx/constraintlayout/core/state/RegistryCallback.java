package androidx.constraintlayout.core.state;
/* loaded from: classes.dex */
public interface RegistryCallback {
    String currentLayoutInformation();

    String currentMotionScene();

    long getLastModified();

    void onDimensions(int i4, int i5);

    void onNewMotionScene(String str);

    void onProgress(float f5);

    void setDrawDebug(int i4);

    void setLayoutInformationMode(int i4);
}
