package io.netty.util.internal;
/* loaded from: classes6.dex */
final class NativeLibraryUtil {
    private NativeLibraryUtil() {
    }

    public static void loadLibrary(String str, boolean z4) {
        if (z4) {
            System.load(str);
        } else {
            System.loadLibrary(str);
        }
    }
}
