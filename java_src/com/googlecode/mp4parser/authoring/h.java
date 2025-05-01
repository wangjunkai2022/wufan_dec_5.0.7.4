package com.googlecode.mp4parser.authoring;

import com.coremedia.iso.boxes.a1;
import com.coremedia.iso.boxes.i;
import com.coremedia.iso.boxes.r0;
import com.coremedia.iso.boxes.s0;
import java.io.Closeable;
import java.util.List;
import java.util.Map;
/* compiled from: Track.java */
/* loaded from: classes3.dex */
public interface h extends Closeable {
    List<c> H();

    Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.b, long[]> I();

    i M();

    long[] O();

    List<r0.a> U();

    long getDuration();

    String getHandler();

    String getName();

    List<i.a> n();

    s0 o();

    long[] q();

    a1 s();

    List<f> x();
}
