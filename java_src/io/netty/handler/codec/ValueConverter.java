package io.netty.handler.codec;
/* loaded from: classes6.dex */
public interface ValueConverter<T> {
    T convertBoolean(boolean z4);

    T convertByte(byte b5);

    T convertChar(char c5);

    T convertDouble(double d5);

    T convertFloat(float f5);

    T convertInt(int i4);

    T convertLong(long j4);

    T convertObject(Object obj);

    T convertShort(short s4);

    T convertTimeMillis(long j4);

    boolean convertToBoolean(T t4);

    byte convertToByte(T t4);

    char convertToChar(T t4);

    double convertToDouble(T t4);

    float convertToFloat(T t4);

    int convertToInt(T t4);

    long convertToLong(T t4);

    short convertToShort(T t4);

    long convertToTimeMillis(T t4);
}
