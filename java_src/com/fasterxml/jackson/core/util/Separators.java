package com.fasterxml.jackson.core.util;

import io.netty.util.internal.StringUtil;
import java.io.Serializable;
/* loaded from: classes3.dex */
public class Separators implements Serializable {
    private static final long serialVersionUID = 1;
    private final char arrayValueSeparator;
    private final char objectEntrySeparator;
    private final char objectFieldValueSeparator;

    public Separators() {
        this(':', StringUtil.COMMA, StringUtil.COMMA);
    }

    public static Separators createDefaultInstance() {
        return new Separators();
    }

    public char getArrayValueSeparator() {
        return this.arrayValueSeparator;
    }

    public char getObjectEntrySeparator() {
        return this.objectEntrySeparator;
    }

    public char getObjectFieldValueSeparator() {
        return this.objectFieldValueSeparator;
    }

    public Separators withArrayValueSeparator(char c5) {
        return this.arrayValueSeparator == c5 ? this : new Separators(this.objectFieldValueSeparator, this.objectEntrySeparator, c5);
    }

    public Separators withObjectEntrySeparator(char c5) {
        return this.objectEntrySeparator == c5 ? this : new Separators(this.objectFieldValueSeparator, c5, this.arrayValueSeparator);
    }

    public Separators withObjectFieldValueSeparator(char c5) {
        return this.objectFieldValueSeparator == c5 ? this : new Separators(c5, this.objectEntrySeparator, this.arrayValueSeparator);
    }

    public Separators(char c5, char c6, char c7) {
        this.objectFieldValueSeparator = c5;
        this.objectEntrySeparator = c6;
        this.arrayValueSeparator = c7;
    }
}
