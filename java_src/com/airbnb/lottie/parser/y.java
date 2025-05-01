package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
/* compiled from: MergePathsParser.java */
/* loaded from: classes2.dex */
class y {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f4265a = JsonReader.a.a("nm", "mm", "hd");

    private y() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MergePaths a(JsonReader jsonReader) throws IOException {
        String str = null;
        MergePaths.MergePathsMode mergePathsMode = null;
        boolean z4 = false;
        while (jsonReader.k()) {
            int A = jsonReader.A(f4265a);
            if (A == 0) {
                str = jsonReader.u();
            } else if (A == 1) {
                mergePathsMode = MergePaths.MergePathsMode.forId(jsonReader.r());
            } else if (A != 2) {
                jsonReader.B();
                jsonReader.C();
            } else {
                z4 = jsonReader.l();
            }
        }
        return new MergePaths(str, mergePathsMode, z4);
    }
}
