package com.facebook.imagepipeline.nativecode;

import java.lang.reflect.InvocationTargetException;
/* compiled from: NativeImageTranscoderFactory.java */
/* loaded from: classes2.dex */
public final class c {
    private c() {
    }

    public static com.facebook.imagepipeline.transcoder.d a(int i4, boolean z4) {
        try {
            return (com.facebook.imagepipeline.transcoder.d) NativeJpegTranscoderFactory.class.getConstructor(Integer.TYPE, Boolean.TYPE).newInstance(Integer.valueOf(i4), Boolean.valueOf(z4));
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e5) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e5);
        }
    }
}
