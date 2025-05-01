package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.List;
/* compiled from: AnimatableValueParser.java */
/* loaded from: classes2.dex */
public class d {
    private d() {
    }

    private static <T> List<com.airbnb.lottie.value.a<T>> a(JsonReader jsonReader, float f5, com.airbnb.lottie.k kVar, n0<T> n0Var) throws IOException {
        return u.a(jsonReader, kVar, f5, n0Var, false);
    }

    private static <T> List<com.airbnb.lottie.value.a<T>> b(JsonReader jsonReader, com.airbnb.lottie.k kVar, n0<T> n0Var) throws IOException {
        return u.a(jsonReader, kVar, 1.0f, n0Var, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.animatable.a c(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.a(b(jsonReader, kVar, g.f4146a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.animatable.j d(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.j(b(jsonReader, kVar, i.f4151a));
    }

    public static com.airbnb.lottie.model.animatable.b e(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        return f(jsonReader, kVar, true);
    }

    public static com.airbnb.lottie.model.animatable.b f(JsonReader jsonReader, com.airbnb.lottie.k kVar, boolean z4) throws IOException {
        return new com.airbnb.lottie.model.animatable.b(a(jsonReader, z4 ? com.airbnb.lottie.utils.h.e() : 1.0f, kVar, l.f4168a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.animatable.c g(JsonReader jsonReader, com.airbnb.lottie.k kVar, int i4) throws IOException {
        return new com.airbnb.lottie.model.animatable.c(b(jsonReader, kVar, new o(i4)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.animatable.d h(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.d(b(jsonReader, kVar, r.f4248a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.animatable.f i(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.f(u.a(jsonReader, kVar, com.airbnb.lottie.utils.h.e(), b0.f4136a, true));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.animatable.g j(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.g(b(jsonReader, kVar, g0.f4147a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.animatable.h k(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.h(a(jsonReader, com.airbnb.lottie.utils.h.e(), kVar, h0.f4149a));
    }
}
