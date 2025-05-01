package org.ppsspp.ppsspp;

import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
/* compiled from: NativeEGLConfigChooser.java */
/* loaded from: classes7.dex */
public class g implements GLSurfaceView.EGLConfigChooser {

    /* renamed from: a  reason: collision with root package name */
    private static final String f72947a = "NativeEGLConfigChooser";

    /* renamed from: b  reason: collision with root package name */
    private static final int f72948b = 4;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NativeEGLConfigChooser.java */
    /* loaded from: classes7.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        EGLConfig f72949a;

        /* renamed from: b  reason: collision with root package name */
        public int f72950b;

        /* renamed from: c  reason: collision with root package name */
        public int f72951c;

        /* renamed from: d  reason: collision with root package name */
        public int f72952d;

        /* renamed from: e  reason: collision with root package name */
        public int f72953e;

        /* renamed from: f  reason: collision with root package name */
        public int f72954f;

        /* renamed from: g  reason: collision with root package name */
        public int f72955g;

        /* renamed from: h  reason: collision with root package name */
        public int f72956h;

        private b() {
        }

        public void a() {
            StringBuilder sb = new StringBuilder();
            sb.append("EGLConfig: red=");
            sb.append(this.f72950b);
            sb.append(" green=");
            sb.append(this.f72951c);
            sb.append(" blue=");
            sb.append(this.f72952d);
            sb.append(" alpha=");
            sb.append(this.f72953e);
            sb.append(" depth=");
            sb.append(this.f72955g);
            sb.append(" stencil=");
            sb.append(this.f72954f);
            sb.append(" samples=");
            sb.append(this.f72956h);
        }
    }

    b[] a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
        b[] bVarArr = new b[eGLConfigArr.length];
        for (int i4 = 0; i4 < eGLConfigArr.length; i4++) {
            b bVar = new b();
            bVar.f72949a = eGLConfigArr[i4];
            bVar.f72950b = b(egl10, eGLDisplay, eGLConfigArr[i4], 12324);
            bVar.f72951c = b(egl10, eGLDisplay, eGLConfigArr[i4], 12323);
            bVar.f72952d = b(egl10, eGLDisplay, eGLConfigArr[i4], 12322);
            bVar.f72953e = b(egl10, eGLDisplay, eGLConfigArr[i4], 12321);
            bVar.f72955g = b(egl10, eGLDisplay, eGLConfigArr[i4], 12325);
            bVar.f72954f = b(egl10, eGLDisplay, eGLConfigArr[i4], 12326);
            bVar.f72956h = b(egl10, eGLDisplay, eGLConfigArr[i4], 12337);
            bVarArr[i4] = bVar;
        }
        return bVarArr;
    }

    int b(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i4) {
        int[] iArr = new int[1];
        try {
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i4, iArr)) {
                return iArr[0];
            }
            return -1;
        } catch (IllegalArgumentException unused) {
            if (eGLConfig != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Illegal argument to getEglConfigAttrib: attr=");
                sb.append(i4);
            }
            return -1;
        }
    }

    @Override // android.opengl.GLSurfaceView.EGLConfigChooser
    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        int[] iArr = {12324, 5, 12323, 6, 12322, 5, 12325, 16, 12326, 0, 12339, 4, 12352, 4, 12344};
        int[] iArr2 = new int[1];
        if (egl10.eglChooseConfig(eGLDisplay, iArr, null, 0, iArr2)) {
            int i4 = iArr2[0];
            StringBuilder sb = new StringBuilder();
            sb.append("There are ");
            sb.append(i4);
            sb.append(" egl configs");
            if (i4 > 0) {
                EGLConfig[] eGLConfigArr = new EGLConfig[i4];
                if (egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, i4, iArr2)) {
                    b[] a5 = a(egl10, eGLDisplay, eGLConfigArr);
                    b bVar = null;
                    for (b bVar2 : a5) {
                        bVar2.a();
                    }
                    int i5 = 0;
                    while (true) {
                        if (i5 >= a5.length) {
                            break;
                        }
                        b bVar3 = a5[i5];
                        if (bVar3.f72950b == 8 && bVar3.f72951c == 8 && bVar3.f72952d == 8 && bVar3.f72953e == 0 && bVar3.f72954f >= 8 && bVar3.f72955g >= 24) {
                            bVar = bVar3;
                            break;
                        }
                        i5++;
                    }
                    if (bVar == null) {
                        int i6 = 0;
                        while (true) {
                            if (i6 >= a5.length) {
                                break;
                            }
                            b bVar4 = a5[i6];
                            if (bVar4.f72950b == 8 && bVar4.f72951c == 8 && bVar4.f72952d == 8 && bVar4.f72953e == 0 && bVar4.f72954f >= 8 && bVar4.f72955g >= 20) {
                                bVar = bVar4;
                                break;
                            }
                            i6++;
                        }
                    }
                    if (bVar == null) {
                        int i7 = 0;
                        while (true) {
                            if (i7 >= a5.length) {
                                break;
                            }
                            b bVar5 = a5[i7];
                            if (bVar5.f72950b == 8 && bVar5.f72951c == 8 && bVar5.f72952d == 8 && bVar5.f72953e == 0 && bVar5.f72954f >= 8 && bVar5.f72955g >= 16) {
                                bVar = bVar5;
                                break;
                            }
                            i7++;
                        }
                    }
                    if (bVar == null) {
                        int i8 = 0;
                        while (true) {
                            if (i8 >= a5.length) {
                                break;
                            }
                            b bVar6 = a5[i8];
                            if (bVar6.f72950b == 8 && bVar6.f72951c == 8 && bVar6.f72952d == 8 && bVar6.f72953e == 0 && bVar6.f72955g >= 16) {
                                bVar = bVar6;
                                break;
                            }
                            i8++;
                        }
                    }
                    if (bVar == null) {
                        int i9 = 0;
                        while (true) {
                            if (i9 >= a5.length) {
                                break;
                            }
                            b bVar7 = a5[i9];
                            if (bVar7.f72950b == 8 && bVar7.f72951c == 8 && bVar7.f72952d == 8 && bVar7.f72953e == 8 && bVar7.f72954f >= 8 && bVar7.f72955g >= 24) {
                                bVar = bVar7;
                                break;
                            }
                            i9++;
                        }
                    }
                    if (bVar == null) {
                        int i10 = 0;
                        while (true) {
                            if (i10 >= a5.length) {
                                break;
                            }
                            b bVar8 = a5[i10];
                            if (bVar8.f72950b == 8 && bVar8.f72951c == 8 && bVar8.f72952d == 8 && bVar8.f72953e == 8 && bVar8.f72954f >= 8 && bVar8.f72955g >= 16) {
                                bVar = bVar8;
                                break;
                            }
                            i10++;
                        }
                    }
                    if (bVar == null) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= a5.length) {
                                break;
                            }
                            b bVar9 = a5[i11];
                            if (bVar9.f72950b >= 5 && bVar9.f72951c >= 6 && bVar9.f72952d >= 5 && bVar9.f72955g >= 16 && bVar9.f72954f >= 8) {
                                bVar = bVar9;
                                break;
                            }
                            i11++;
                        }
                    }
                    if (bVar == null) {
                        int i12 = 0;
                        while (true) {
                            if (i12 >= a5.length) {
                                break;
                            }
                            b bVar10 = a5[i12];
                            if (bVar10.f72950b >= 5 && bVar10.f72951c >= 6 && bVar10.f72952d >= 5 && bVar10.f72955g >= 16) {
                                bVar = bVar10;
                                break;
                            }
                            i12++;
                        }
                    }
                    if (bVar == null && a5.length > 0) {
                        bVar = a5[0];
                    }
                    if (bVar != null) {
                        bVar.a();
                        return bVar.f72949a;
                    }
                    throw new IllegalArgumentException("Failed to find a valid EGL config");
                }
                throw new IllegalArgumentException("eglChooseConfig failed when retrieving");
            }
            throw new IllegalArgumentException("No configs match configSpec");
        }
        throw new IllegalArgumentException("eglChooseConfig failed when counting");
    }
}
