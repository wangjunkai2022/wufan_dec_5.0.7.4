package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.Rect;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.umeng.analytics.pro.bm;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: LayerParser.java */
/* loaded from: classes2.dex */
public class v {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f4257a = JsonReader.a.a("nm", "ind", "refId", m.a.f71495i, "parent", "sw", com.xinzhu.overmind.utils.u.f68414b, "sc", MediationConstant.ADN_KS, "tt", "masksProperties", "shapes", bm.aM, "ef", "sr", "st", "w", bm.aK, IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, "op", "tm", "cl", "hd");

    /* renamed from: b  reason: collision with root package name */
    private static final JsonReader.a f4258b = JsonReader.a.a(com.kuaishou.weapon.p0.t.f55701t, "a");

    /* renamed from: c  reason: collision with root package name */
    private static final JsonReader.a f4259c = JsonReader.a.a(m.a.f71495i, "nm");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LayerParser.java */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f4260a;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            f4260a = iArr;
            try {
                iArr[Layer.MatteType.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4260a[Layer.MatteType.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private v() {
    }

    public static Layer a(com.airbnb.lottie.k kVar) {
        Rect b5 = kVar.b();
        return new Layer(Collections.emptyList(), kVar, "__container", -1L, Layer.LayerType.PRE_COMP, -1L, null, Collections.emptyList(), new com.airbnb.lottie.model.animatable.l(), 0, 0, 0, 0.0f, 0.0f, b5.width(), b5.height(), null, null, Collections.emptyList(), Layer.MatteType.NONE, null, false, null, null);
    }

    public static Layer b(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        Layer.MatteType matteType = Layer.MatteType.NONE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        jsonReader.d();
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        Layer.MatteType matteType2 = matteType;
        Layer.LayerType layerType = null;
        String str = null;
        com.airbnb.lottie.model.animatable.l lVar = null;
        com.airbnb.lottie.model.animatable.j jVar = null;
        com.airbnb.lottie.model.animatable.k kVar2 = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.content.a aVar = null;
        j jVar2 = null;
        long j4 = -1;
        float f5 = 0.0f;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        float f6 = 1.0f;
        float f7 = 0.0f;
        int i7 = 0;
        int i8 = 0;
        boolean z4 = false;
        float f8 = 0.0f;
        long j5 = 0;
        String str2 = null;
        String str3 = "UNSET";
        while (jsonReader.k()) {
            switch (jsonReader.A(f4257a)) {
                case 0:
                    str3 = jsonReader.u();
                    break;
                case 1:
                    j5 = jsonReader.r();
                    break;
                case 2:
                    str = jsonReader.u();
                    break;
                case 3:
                    int r4 = jsonReader.r();
                    layerType = Layer.LayerType.UNKNOWN;
                    if (r4 >= layerType.ordinal()) {
                        break;
                    } else {
                        layerType = Layer.LayerType.values()[r4];
                        break;
                    }
                case 4:
                    j4 = jsonReader.r();
                    break;
                case 5:
                    i4 = (int) (jsonReader.r() * com.airbnb.lottie.utils.h.e());
                    break;
                case 6:
                    i5 = (int) (jsonReader.r() * com.airbnb.lottie.utils.h.e());
                    break;
                case 7:
                    i6 = Color.parseColor(jsonReader.u());
                    break;
                case 8:
                    lVar = c.g(jsonReader, kVar);
                    break;
                case 9:
                    int r5 = jsonReader.r();
                    if (r5 >= Layer.MatteType.values().length) {
                        kVar.a("Unsupported matte type: " + r5);
                        break;
                    } else {
                        matteType2 = Layer.MatteType.values()[r5];
                        int i9 = a.f4260a[matteType2.ordinal()];
                        if (i9 == 1) {
                            kVar.a("Unsupported matte type: Luma");
                        } else if (i9 == 2) {
                            kVar.a("Unsupported matte type: Luma Inverted");
                        }
                        kVar.v(1);
                        break;
                    }
                case 10:
                    jsonReader.b();
                    while (jsonReader.k()) {
                        arrayList3.add(x.a(jsonReader, kVar));
                    }
                    kVar.v(arrayList3.size());
                    jsonReader.g();
                    break;
                case 11:
                    jsonReader.b();
                    while (jsonReader.k()) {
                        com.airbnb.lottie.model.content.c a5 = h.a(jsonReader, kVar);
                        if (a5 != null) {
                            arrayList4.add(a5);
                        }
                    }
                    jsonReader.g();
                    break;
                case 12:
                    jsonReader.d();
                    while (jsonReader.k()) {
                        int A = jsonReader.A(f4258b);
                        if (A == 0) {
                            jVar = d.d(jsonReader, kVar);
                        } else if (A != 1) {
                            jsonReader.B();
                            jsonReader.C();
                        } else {
                            jsonReader.b();
                            if (jsonReader.k()) {
                                kVar2 = b.a(jsonReader, kVar);
                            }
                            while (jsonReader.k()) {
                                jsonReader.C();
                            }
                            jsonReader.g();
                        }
                    }
                    jsonReader.h();
                    break;
                case 13:
                    jsonReader.b();
                    ArrayList arrayList5 = new ArrayList();
                    while (jsonReader.k()) {
                        jsonReader.d();
                        while (jsonReader.k()) {
                            int A2 = jsonReader.A(f4259c);
                            if (A2 == 0) {
                                int r6 = jsonReader.r();
                                if (r6 == 29) {
                                    aVar = e.b(jsonReader, kVar);
                                } else if (r6 == 25) {
                                    jVar2 = new k().b(jsonReader, kVar);
                                }
                            } else if (A2 != 1) {
                                jsonReader.B();
                                jsonReader.C();
                            } else {
                                arrayList5.add(jsonReader.u());
                            }
                        }
                        jsonReader.h();
                    }
                    jsonReader.g();
                    kVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList5);
                    break;
                case 14:
                    f6 = (float) jsonReader.p();
                    break;
                case 15:
                    f7 = (float) jsonReader.p();
                    break;
                case 16:
                    i7 = (int) (jsonReader.r() * com.airbnb.lottie.utils.h.e());
                    break;
                case 17:
                    i8 = (int) (jsonReader.r() * com.airbnb.lottie.utils.h.e());
                    break;
                case 18:
                    f5 = (float) jsonReader.p();
                    break;
                case 19:
                    f8 = (float) jsonReader.p();
                    break;
                case 20:
                    bVar = d.f(jsonReader, kVar, false);
                    break;
                case 21:
                    str2 = jsonReader.u();
                    break;
                case 22:
                    z4 = jsonReader.l();
                    break;
                default:
                    jsonReader.B();
                    jsonReader.C();
                    break;
            }
        }
        jsonReader.h();
        ArrayList arrayList6 = new ArrayList();
        if (f5 > 0.0f) {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            arrayList2.add(new com.airbnb.lottie.value.a(kVar, valueOf2, valueOf2, null, 0.0f, Float.valueOf(f5)));
        } else {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
        }
        if (f8 <= 0.0f) {
            f8 = kVar.f();
        }
        arrayList2.add(new com.airbnb.lottie.value.a(kVar, valueOf, valueOf, null, f5, Float.valueOf(f8)));
        arrayList2.add(new com.airbnb.lottie.value.a(kVar, valueOf2, valueOf2, null, f8, Float.valueOf(Float.MAX_VALUE)));
        if (str3.endsWith(".ai") || "ai".equals(str2)) {
            kVar.a("Convert your Illustrator layers to shape layers.");
        }
        return new Layer(arrayList4, kVar, str3, j5, layerType, j4, str, arrayList, lVar, i4, i5, i6, f6, f7, i7, i8, jVar, kVar2, arrayList2, matteType2, bVar, z4, aVar, jVar2);
    }
}
