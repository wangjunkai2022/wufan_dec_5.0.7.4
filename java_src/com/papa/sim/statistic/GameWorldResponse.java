package com.papa.sim.statistic;
/* loaded from: classes5.dex */
public class GameWorldResponse<E> {
    private E data;
    private int error;

    public GameWorldResponse() {
    }

    public E getData() {
        return this.data;
    }

    public int getError() {
        return this.error;
    }

    public void setData(E e5) {
        this.data = e5;
    }

    public void setError(int i4) {
        this.error = i4;
    }

    public GameWorldResponse(int i4, E e5) {
        this.error = i4;
        this.data = e5;
    }
}
