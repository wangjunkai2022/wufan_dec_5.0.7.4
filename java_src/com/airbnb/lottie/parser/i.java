package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.umeng.analytics.pro.bm;
import java.io.IOException;
/* compiled from: DocumentDataParser.java */
/* loaded from: classes2.dex */
public class i implements n0<DocumentData> {

    /* renamed from: a  reason: collision with root package name */
    public static final i f4151a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static final JsonReader.a f4152b = JsonReader.a.a(bm.aM, com.xinzhu.overmind.utils.helpers.f.f68332a, "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private i() {
    }

    @Override // com.airbnb.lottie.parser.n0
    /* renamed from: b */
    public DocumentData a(JsonReader jsonReader, float f5) throws IOException {
        DocumentData.Justification justification = DocumentData.Justification.CENTER;
        jsonReader.d();
        DocumentData.Justification justification2 = justification;
        String str = null;
        String str2 = null;
        float f6 = 0.0f;
        int i4 = 0;
        float f7 = 0.0f;
        float f8 = 0.0f;
        int i5 = 0;
        int i6 = 0;
        float f9 = 0.0f;
        boolean z4 = true;
        while (jsonReader.k()) {
            switch (jsonReader.A(f4152b)) {
                case 0:
                    str = jsonReader.u();
                    break;
                case 1:
                    str2 = jsonReader.u();
                    break;
                case 2:
                    f6 = (float) jsonReader.p();
                    break;
                case 3:
                    int r4 = jsonReader.r();
                    justification2 = DocumentData.Justification.CENTER;
                    if (r4 <= justification2.ordinal() && r4 >= 0) {
                        justification2 = DocumentData.Justification.values()[r4];
                        break;
                    }
                    break;
                case 4:
                    i4 = jsonReader.r();
                    break;
                case 5:
                    f7 = (float) jsonReader.p();
                    break;
                case 6:
                    f8 = (float) jsonReader.p();
                    break;
                case 7:
                    i5 = s.d(jsonReader);
                    break;
                case 8:
                    i6 = s.d(jsonReader);
                    break;
                case 9:
                    f9 = (float) jsonReader.p();
                    break;
                case 10:
                    z4 = jsonReader.l();
                    break;
                default:
                    jsonReader.B();
                    jsonReader.C();
                    break;
            }
        }
        jsonReader.h();
        return new DocumentData(str, str2, f6, justification2, i4, f7, f8, i5, i6, f9, z4);
    }
}
