package sun.misc;

import java.lang.reflect.Field;
/* loaded from: classes.dex */
public class Unsafe {
    public native int addressSize();

    public int arrayBaseOffset(Class cls) {
        throw new RuntimeException("Stub!");
    }

    public native byte getByte(long j4);

    public native int getInt(long j4);

    public native int getInt(Object obj, long j4);

    public native long getLong(long j4);

    public native long getLong(Object obj, long j4);

    public native Object getObject(Object obj, long j4);

    public native short getShort(Object obj, long j4);

    public long objectFieldOffset(Field field) {
        throw new RuntimeException("Stub!");
    }

    public native void putByte(long j4, byte b5);

    public native void putInt(Object obj, long j4, int i4);

    public native void putLong(Object obj, long j4, long j5);

    public native void putObject(Object obj, long j4, Object obj2);
}
