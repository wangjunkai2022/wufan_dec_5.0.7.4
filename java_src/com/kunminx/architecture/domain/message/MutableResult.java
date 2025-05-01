package com.kunminx.architecture.domain.message;

import com.kunminx.architecture.ui.callback.ProtectedUnPeekLiveData;
/* loaded from: classes5.dex */
public class MutableResult<T> extends Result<T> {

    /* loaded from: classes5.dex */
    public static class a<T> {

        /* renamed from: a  reason: collision with root package name */
        private boolean f55877a;

        public MutableResult<T> a() {
            MutableResult<T> mutableResult = new MutableResult<>();
            ((ProtectedUnPeekLiveData) mutableResult).f55880b = this.f55877a;
            return mutableResult;
        }

        public a<T> b(boolean z4) {
            this.f55877a = z4;
            return this;
        }
    }

    public MutableResult(T t4) {
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

    public MutableResult() {
    }
}
