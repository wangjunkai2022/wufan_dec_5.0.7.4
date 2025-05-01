package com.airbnb.lottie.parser;

import androidx.annotation.Nullable;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
/* compiled from: DropShadowEffectParser.java */
/* loaded from: classes2.dex */
public class k {

    /* renamed from: f  reason: collision with root package name */
    private static final JsonReader.a f4160f = JsonReader.a.a("ef");

    /* renamed from: g  reason: collision with root package name */
    private static final JsonReader.a f4161g = JsonReader.a.a("nm", "v");

    /* renamed from: a  reason: collision with root package name */
    private com.airbnb.lottie.model.animatable.a f4162a;

    /* renamed from: b  reason: collision with root package name */
    private com.airbnb.lottie.model.animatable.b f4163b;

    /* renamed from: c  reason: collision with root package name */
    private com.airbnb.lottie.model.animatable.b f4164c;

    /* renamed from: d  reason: collision with root package name */
    private com.airbnb.lottie.model.animatable.b f4165d;

    /* renamed from: e  reason: collision with root package name */
    private com.airbnb.lottie.model.animatable.b f4166e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
        if (r0.equals("Opacity") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.airbnb.lottie.parser.moshi.JsonReader r6, com.airbnb.lottie.k r7) throws java.io.IOException {
        /*
            r5 = this;
            r6.d()
            java.lang.String r0 = ""
        L5:
            boolean r1 = r6.k()
            if (r1 == 0) goto L90
            com.airbnb.lottie.parser.moshi.JsonReader$a r1 = com.airbnb.lottie.parser.k.f4161g
            int r1 = r6.A(r1)
            if (r1 == 0) goto L8a
            r2 = 1
            if (r1 == r2) goto L1d
            r6.B()
            r6.C()
            goto L5
        L1d:
            r0.hashCode()
            r1 = -1
            int r3 = r0.hashCode()
            r4 = 0
            switch(r3) {
                case 353103893: goto L55;
                case 397447147: goto L4c;
                case 1041377119: goto L41;
                case 1379387491: goto L36;
                case 1383710113: goto L2b;
                default: goto L29;
            }
        L29:
            r2 = -1
            goto L5f
        L2b:
            java.lang.String r2 = "Softness"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L34
            goto L29
        L34:
            r2 = 4
            goto L5f
        L36:
            java.lang.String r2 = "Shadow Color"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L3f
            goto L29
        L3f:
            r2 = 3
            goto L5f
        L41:
            java.lang.String r2 = "Direction"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L4a
            goto L29
        L4a:
            r2 = 2
            goto L5f
        L4c:
            java.lang.String r3 = "Opacity"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L5f
            goto L29
        L55:
            java.lang.String r2 = "Distance"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L5e
            goto L29
        L5e:
            r2 = 0
        L5f:
            switch(r2) {
                case 0: goto L82;
                case 1: goto L7b;
                case 2: goto L74;
                case 3: goto L6d;
                case 4: goto L66;
                default: goto L62;
            }
        L62:
            r6.C()
            goto L5
        L66:
            com.airbnb.lottie.model.animatable.b r1 = com.airbnb.lottie.parser.d.e(r6, r7)
            r5.f4166e = r1
            goto L5
        L6d:
            com.airbnb.lottie.model.animatable.a r1 = com.airbnb.lottie.parser.d.c(r6, r7)
            r5.f4162a = r1
            goto L5
        L74:
            com.airbnb.lottie.model.animatable.b r1 = com.airbnb.lottie.parser.d.f(r6, r7, r4)
            r5.f4164c = r1
            goto L5
        L7b:
            com.airbnb.lottie.model.animatable.b r1 = com.airbnb.lottie.parser.d.f(r6, r7, r4)
            r5.f4163b = r1
            goto L5
        L82:
            com.airbnb.lottie.model.animatable.b r1 = com.airbnb.lottie.parser.d.e(r6, r7)
            r5.f4165d = r1
            goto L5
        L8a:
            java.lang.String r0 = r6.u()
            goto L5
        L90:
            r6.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.k.a(com.airbnb.lottie.parser.moshi.JsonReader, com.airbnb.lottie.k):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public j b(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        com.airbnb.lottie.model.animatable.b bVar;
        com.airbnb.lottie.model.animatable.b bVar2;
        com.airbnb.lottie.model.animatable.b bVar3;
        com.airbnb.lottie.model.animatable.b bVar4;
        while (jsonReader.k()) {
            if (jsonReader.A(f4160f) != 0) {
                jsonReader.B();
                jsonReader.C();
            } else {
                jsonReader.b();
                while (jsonReader.k()) {
                    a(jsonReader, kVar);
                }
                jsonReader.g();
            }
        }
        com.airbnb.lottie.model.animatable.a aVar = this.f4162a;
        if (aVar == null || (bVar = this.f4163b) == null || (bVar2 = this.f4164c) == null || (bVar3 = this.f4165d) == null || (bVar4 = this.f4166e) == null) {
            return null;
        }
        return new j(aVar, bVar, bVar2, bVar3, bVar4);
    }
}
