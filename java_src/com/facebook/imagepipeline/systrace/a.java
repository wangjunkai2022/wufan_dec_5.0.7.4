package com.facebook.imagepipeline.systrace;

import android.os.Build;
import android.os.Trace;
import com.facebook.imagepipeline.systrace.b;
/* compiled from: DefaultFrescoSystrace.java */
/* loaded from: classes2.dex */
public class a implements b.d {

    /* compiled from: DefaultFrescoSystrace.java */
    /* renamed from: com.facebook.imagepipeline.systrace.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static final class C0278a implements b.InterfaceC0279b {

        /* renamed from: a  reason: collision with root package name */
        private final StringBuilder f12494a;

        public C0278a(String str) {
            this.f12494a = new StringBuilder(str);
        }

        @Override // com.facebook.imagepipeline.systrace.b.InterfaceC0279b
        public b.InterfaceC0279b a(String str, Object obj) {
            StringBuilder sb = this.f12494a;
            sb.append(';');
            sb.append(str);
            sb.append('=');
            sb.append(obj == null ? "null" : obj.toString());
            return this;
        }

        @Override // com.facebook.imagepipeline.systrace.b.InterfaceC0279b
        public b.InterfaceC0279b b(String str, long j4) {
            StringBuilder sb = this.f12494a;
            sb.append(';');
            sb.append(str);
            sb.append('=');
            sb.append(Long.toString(j4));
            return this;
        }

        @Override // com.facebook.imagepipeline.systrace.b.InterfaceC0279b
        public b.InterfaceC0279b c(String str, int i4) {
            StringBuilder sb = this.f12494a;
            sb.append(';');
            sb.append(str);
            sb.append('=');
            sb.append(Integer.toString(i4));
            return this;
        }

        @Override // com.facebook.imagepipeline.systrace.b.InterfaceC0279b
        public b.InterfaceC0279b d(String str, double d5) {
            StringBuilder sb = this.f12494a;
            sb.append(';');
            sb.append(str);
            sb.append('=');
            sb.append(Double.toString(d5));
            return this;
        }

        @Override // com.facebook.imagepipeline.systrace.b.InterfaceC0279b
        public void flush() {
            if (this.f12494a.length() > 127) {
                this.f12494a.setLength(127);
            }
            if (Build.VERSION.SDK_INT >= 18) {
                Trace.beginSection(this.f12494a.toString());
            }
        }
    }

    @Override // com.facebook.imagepipeline.systrace.b.d
    public void a(String str) {
    }

    @Override // com.facebook.imagepipeline.systrace.b.d
    public b.InterfaceC0279b b(String str) {
        return b.f12495a;
    }

    @Override // com.facebook.imagepipeline.systrace.b.d
    public void c() {
    }

    @Override // com.facebook.imagepipeline.systrace.b.d
    public boolean d() {
        return false;
    }
}
