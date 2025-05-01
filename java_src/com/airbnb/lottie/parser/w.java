package com.airbnb.lottie.parser;

import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.umeng.analytics.pro.bm;
import io.netty.handler.codec.rtsp.RtspHeaders;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: LottieCompositionMoshiParser.java */
/* loaded from: classes2.dex */
public class w {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f4261a = JsonReader.a.a("w", bm.aK, IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, "op", "fr", "v", RtspHeaders.Values.LAYERS, "assets", "fonts", "chars", "markers");

    /* renamed from: b  reason: collision with root package name */
    static JsonReader.a f4262b = JsonReader.a.a("id", RtspHeaders.Values.LAYERS, "w", bm.aK, "p", "u");

    /* renamed from: c  reason: collision with root package name */
    private static final JsonReader.a f4263c = JsonReader.a.a("list");

    /* renamed from: d  reason: collision with root package name */
    private static final JsonReader.a f4264d = JsonReader.a.a("cm", "tm", "dr");

    public static com.airbnb.lottie.k a(JsonReader jsonReader) throws IOException {
        HashMap hashMap;
        ArrayList arrayList;
        JsonReader jsonReader2 = jsonReader;
        float e5 = com.airbnb.lottie.utils.h.e();
        LongSparseArray<Layer> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        SparseArrayCompat<com.airbnb.lottie.model.c> sparseArrayCompat = new SparseArrayCompat<>();
        com.airbnb.lottie.k kVar = new com.airbnb.lottie.k();
        jsonReader.d();
        int i4 = 0;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        int i5 = 0;
        while (jsonReader.k()) {
            switch (jsonReader2.A(f4261a)) {
                case 0:
                    i4 = jsonReader.r();
                    continue;
                    jsonReader2 = jsonReader;
                case 1:
                    i5 = jsonReader.r();
                    continue;
                    jsonReader2 = jsonReader;
                case 2:
                    f5 = (float) jsonReader.p();
                    continue;
                    jsonReader2 = jsonReader;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f6 = ((float) jsonReader.p()) - 0.01f;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f7 = (float) jsonReader.p();
                    break;
                case 5:
                    String[] split = jsonReader.u().split("\\.");
                    if (!com.airbnb.lottie.utils.h.j(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        kVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 6:
                    e(jsonReader2, kVar, arrayList2, longSparseArray);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 7:
                    b(jsonReader2, kVar, hashMap2, hashMap3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 8:
                    d(jsonReader2, hashMap4);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 9:
                    c(jsonReader2, kVar, sparseArrayCompat);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 10:
                    f(jsonReader2, arrayList3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                default:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    jsonReader.B();
                    jsonReader.C();
                    break;
            }
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            jsonReader2 = jsonReader;
        }
        kVar.w(new Rect(0, 0, (int) (i4 * e5), (int) (i5 * e5)), f5, f6, f7, arrayList2, longSparseArray, hashMap2, hashMap3, sparseArrayCompat, hashMap4, arrayList3);
        return kVar;
    }

    private static void b(JsonReader jsonReader, com.airbnb.lottie.k kVar, Map<String, List<Layer>> map, Map<String, com.airbnb.lottie.o0> map2) throws IOException {
        jsonReader.b();
        while (jsonReader.k()) {
            ArrayList arrayList = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray();
            jsonReader.d();
            String str = null;
            String str2 = null;
            String str3 = null;
            int i4 = 0;
            int i5 = 0;
            while (jsonReader.k()) {
                int A = jsonReader.A(f4262b);
                if (A == 0) {
                    str = jsonReader.u();
                } else if (A == 1) {
                    jsonReader.b();
                    while (jsonReader.k()) {
                        Layer b5 = v.b(jsonReader, kVar);
                        longSparseArray.put(b5.d(), b5);
                        arrayList.add(b5);
                    }
                    jsonReader.g();
                } else if (A == 2) {
                    i4 = jsonReader.r();
                } else if (A == 3) {
                    i5 = jsonReader.r();
                } else if (A == 4) {
                    str2 = jsonReader.u();
                } else if (A != 5) {
                    jsonReader.B();
                    jsonReader.C();
                } else {
                    str3 = jsonReader.u();
                }
            }
            jsonReader.h();
            if (str2 != null) {
                com.airbnb.lottie.o0 o0Var = new com.airbnb.lottie.o0(i4, i5, str, str2, str3);
                map2.put(o0Var.e(), o0Var);
            } else {
                map.put(str, arrayList);
            }
        }
        jsonReader.g();
    }

    private static void c(JsonReader jsonReader, com.airbnb.lottie.k kVar, SparseArrayCompat<com.airbnb.lottie.model.c> sparseArrayCompat) throws IOException {
        jsonReader.b();
        while (jsonReader.k()) {
            com.airbnb.lottie.model.c a5 = m.a(jsonReader, kVar);
            sparseArrayCompat.put(a5.hashCode(), a5);
        }
        jsonReader.g();
    }

    private static void d(JsonReader jsonReader, Map<String, com.airbnb.lottie.model.b> map) throws IOException {
        jsonReader.d();
        while (jsonReader.k()) {
            if (jsonReader.A(f4263c) != 0) {
                jsonReader.B();
                jsonReader.C();
            } else {
                jsonReader.b();
                while (jsonReader.k()) {
                    com.airbnb.lottie.model.b a5 = n.a(jsonReader);
                    map.put(a5.c(), a5);
                }
                jsonReader.g();
            }
        }
        jsonReader.h();
    }

    private static void e(JsonReader jsonReader, com.airbnb.lottie.k kVar, List<Layer> list, LongSparseArray<Layer> longSparseArray) throws IOException {
        jsonReader.b();
        int i4 = 0;
        while (jsonReader.k()) {
            Layer b5 = v.b(jsonReader, kVar);
            if (b5.f() == Layer.LayerType.IMAGE) {
                i4++;
            }
            list.add(b5);
            longSparseArray.put(b5.d(), b5);
            if (i4 > 4) {
                com.airbnb.lottie.utils.d.e("You have " + i4 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        jsonReader.g();
    }

    private static void f(JsonReader jsonReader, List<com.airbnb.lottie.model.g> list) throws IOException {
        jsonReader.b();
        while (jsonReader.k()) {
            String str = null;
            jsonReader.d();
            float f5 = 0.0f;
            float f6 = 0.0f;
            while (jsonReader.k()) {
                int A = jsonReader.A(f4264d);
                if (A == 0) {
                    str = jsonReader.u();
                } else if (A == 1) {
                    f5 = (float) jsonReader.p();
                } else if (A != 2) {
                    jsonReader.B();
                    jsonReader.C();
                } else {
                    f6 = (float) jsonReader.p();
                }
            }
            jsonReader.h();
            list.add(new com.airbnb.lottie.model.g(str, f5, f6));
        }
        jsonReader.g();
    }
}
