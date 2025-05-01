package com.kunminx.architecture.ui.callback;
/* loaded from: classes5.dex */
public class UnPeekLiveData<T> extends ProtectedUnPeekLiveData<T> {

    /* loaded from: classes5.dex */
    public static class a<T> {

        /* renamed from: a  reason: collision with root package name */
        private boolean f55884a;

        public UnPeekLiveData<T> a() {
            UnPeekLiveData<T> unPeekLiveData = new UnPeekLiveData<>();
            unPeekLiveData.f55880b = this.f55884a;
            return unPeekLiveData;
        }

        public a<T> b(boolean z4) {
            this.f55884a = z4;
            return this;
        }
    }

    public UnPeekLiveData(T t4) {
        super(t4);
    }

    @Override // androidx.lifecycle.LiveData
    public void postValue(T t4) {
        super.postValue(t4);
    }

    @Override // com.kunminx.architecture.ui.callback.ProtectedUnPeekLiveData, androidx.lifecycle.LiveData
    public void setValue(T t4) {
        super.setValue(t4);
    }

    public UnPeekLiveData() {
    }
}
