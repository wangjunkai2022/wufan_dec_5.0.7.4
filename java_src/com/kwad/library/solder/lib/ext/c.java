package com.kwad.library.solder.lib.ext;

import android.os.Build;
import androidx.annotation.NonNull;
import java.util.concurrent.ExecutorService;
/* loaded from: classes5.dex */
public final class c {
    private final String akE;
    private final String akF;
    private final String akG;
    private final String akH;
    private final String akI;
    private final String akJ;
    private final String akK;
    private final boolean akL;
    private final boolean akM;
    private final boolean akN;
    private ExecutorService akO;
    private String akP;
    private byte[] akQ;
    private boolean akR;
    private int akS;
    private final int akq;

    /* loaded from: classes5.dex */
    public static class a {
        private static final String akT;
        private String akK;
        private boolean akN;
        private ExecutorService akO;
        private String akP;
        private byte[] akQ;
        private boolean akR;
        private int akU;
        private int akq = 3;
        private String akE = "sodler";
        private String akF = "code-cache";
        private String akG = "lib";
        private String akH = "temp";
        private String akJ = akT;
        private String akI = ".tmp";
        private boolean akM = false;
        private boolean akL = false;

        static {
            akT = yn() ? "base-1_apk" : "base-1.apk";
        }

        private static boolean yn() {
            int i4 = Build.VERSION.SDK_INT;
            return i4 == 30 || i4 == 31 || i4 == 32;
        }

        public final a a(ExecutorService executorService) {
            this.akO = executorService;
            return this;
        }

        public final a bQ(int i4) {
            if (i4 > 0) {
                this.akq = i4;
            }
            return this;
        }

        public final a bR(int i4) {
            this.akU = i4;
            return this;
        }

        public final a bT(@NonNull String str) {
            this.akE = str;
            return this;
        }

        public final a bh(boolean z4) {
            this.akR = false;
            return this;
        }

        public final a bi(boolean z4) {
            this.akN = z4;
            return this;
        }

        public final c yo() {
            return new c(this.akL, this.akM, this.akK, this.akE, this.akF, this.akG, this.akH, this.akI, this.akJ, this.akq, this.akP, this.akQ, this.akR, this.akN, this.akO, this.akU, (byte) 0);
        }
    }

    /* synthetic */ c(boolean z4, boolean z5, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i4, String str8, byte[] bArr, boolean z6, boolean z7, ExecutorService executorService, int i5, byte b5) {
        this(z4, z5, str, str2, str3, str4, str5, str6, str7, i4, str8, bArr, z6, z7, executorService, i5);
    }

    public final int getRetryCount() {
        return this.akq;
    }

    public final int yd() {
        return this.akS;
    }

    public final String ye() {
        return this.akE;
    }

    public final String yf() {
        return this.akF;
    }

    public final String yg() {
        return this.akG;
    }

    public final String yh() {
        return this.akH;
    }

    public final String yi() {
        return this.akI;
    }

    public final String yj() {
        return this.akJ;
    }

    public final boolean yk() {
        return this.akM;
    }

    public final boolean yl() {
        return this.akN;
    }

    public final ExecutorService ym() {
        return this.akO;
    }

    private c(boolean z4, boolean z5, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i4, String str8, byte[] bArr, boolean z6, boolean z7, ExecutorService executorService, int i5) {
        this.akq = i4;
        this.akE = str2;
        this.akF = str3;
        this.akG = str4;
        this.akH = str5;
        this.akI = str6;
        this.akJ = str7;
        this.akK = str;
        this.akL = z4;
        this.akM = z5;
        this.akP = str8;
        this.akQ = bArr;
        this.akR = z6;
        this.akN = z7;
        this.akO = executorService;
        this.akS = i5;
    }
}
