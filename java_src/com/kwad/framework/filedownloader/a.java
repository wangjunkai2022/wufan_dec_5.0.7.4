package com.kwad.framework.filedownloader;

import com.kwad.framework.filedownloader.x;
/* loaded from: classes5.dex */
public interface a {

    /* renamed from: com.kwad.framework.filedownloader.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC0492a {
        boolean aY(int i4);

        void free();

        boolean isOver();

        a uH();

        x.a uI();

        int uJ();

        void uK();

        boolean uL();

        void uM();

        void uN();

        boolean uO();
    }

    /* loaded from: classes5.dex */
    public interface b {
        int uP();
    }

    /* loaded from: classes5.dex */
    public interface c {
        void onBegin();

        void uQ();
    }

    a a(i iVar);

    a aX(int i4);

    a ba(boolean z4);

    a bb(boolean z4);

    a bc(String str);

    a bc(boolean z4);

    a bd(String str);

    a c(String str, boolean z4);

    boolean cancel();

    a e(Object obj);

    String getFilename();

    int getId();

    String getPath();

    int getSmallFileSoFarBytes();

    int getSmallFileTotalBytes();

    int getSpeed();

    long getStatusUpdateTime();

    Object getTag();

    String getTargetFilePath();

    String getUrl();

    boolean isRunning();

    boolean pause();

    int start();

    a t(String str, String str2);

    boolean uA();

    Throwable uB();

    int uC();

    int uD();

    boolean uE();

    boolean uF();

    boolean uG();

    b uq();

    boolean ur();

    boolean us();

    int ut();

    int uu();

    boolean uv();

    i uw();

    long ux();

    long uy();

    byte uz();
}
