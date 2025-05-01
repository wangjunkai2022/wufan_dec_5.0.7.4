package com.googlecode.mp4parser.authoring.tracks.h265;

import java.io.IOException;
import java.io.PrintStream;
/* compiled from: SEIMessage.java */
/* loaded from: classes3.dex */
public class e {
    public e(com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c cVar) throws IOException {
        int i4 = 0;
        while (cVar.c(8) == 255) {
            i4 += 255;
        }
        int c5 = cVar.c(8) + i4;
        do {
        } while (cVar.c(8) == 255);
        cVar.c(8);
        PrintStream printStream = System.err;
        printStream.println("payloadType " + c5);
    }
}
