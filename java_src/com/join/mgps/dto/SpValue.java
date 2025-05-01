package com.join.mgps.dto;

import java.io.Serializable;
/* loaded from: classes4.dex */
public class SpValue<T extends Serializable> implements Serializable {
    T value;

    public SpValue(T t4) {
        this.value = t4;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T t4) {
        this.value = t4;
    }
}
