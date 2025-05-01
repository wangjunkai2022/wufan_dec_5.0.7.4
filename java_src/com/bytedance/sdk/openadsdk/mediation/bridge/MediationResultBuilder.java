package com.bytedance.sdk.openadsdk.mediation.bridge;

import com.bykv.vk.openvk.api.proto.Result;
import com.bykv.vk.openvk.api.proto.ValueSet;
/* loaded from: classes2.dex */
public class MediationResultBuilder {
    private boolean vv = false;

    /* renamed from: m  reason: collision with root package name */
    private int f8866m = -1;

    /* renamed from: p  reason: collision with root package name */
    private String f8867p = null;

    /* renamed from: i  reason: collision with root package name */
    private ValueSet f8865i = null;

    /* loaded from: classes2.dex */
    private static final class ResultImpl implements Result {

        /* renamed from: i  reason: collision with root package name */
        private final ValueSet f8868i;

        /* renamed from: m  reason: collision with root package name */
        private final int f8869m;

        /* renamed from: p  reason: collision with root package name */
        private final String f8870p;
        private final boolean vv;

        @Override // com.bykv.vk.openvk.api.proto.Result
        public int code() {
            return this.f8869m;
        }

        @Override // com.bykv.vk.openvk.api.proto.Result
        public boolean isSuccess() {
            return this.vv;
        }

        @Override // com.bykv.vk.openvk.api.proto.Result
        public String message() {
            return this.f8870p;
        }

        @Override // com.bykv.vk.openvk.api.proto.Result
        public ValueSet values() {
            return this.f8868i;
        }

        private ResultImpl(boolean z4, int i4, String str, ValueSet valueSet) {
            this.vv = z4;
            this.f8869m = i4;
            this.f8870p = str;
            this.f8868i = valueSet;
        }
    }

    private MediationResultBuilder() {
    }

    public static final MediationResultBuilder create() {
        return new MediationResultBuilder();
    }

    public Result build() {
        boolean z4 = this.vv;
        int i4 = this.f8866m;
        String str = this.f8867p;
        ValueSet valueSet = this.f8865i;
        if (valueSet == null) {
            valueSet = MediationValueSetBuilder.create().build();
        }
        return new ResultImpl(z4, i4, str, valueSet);
    }

    public MediationResultBuilder setCode(int i4) {
        this.f8866m = i4;
        return this;
    }

    public MediationResultBuilder setMessage(String str) {
        this.f8867p = str;
        return this;
    }

    public MediationResultBuilder setSuccess(boolean z4) {
        this.vv = z4;
        return this;
    }

    public MediationResultBuilder setValues(ValueSet valueSet) {
        this.f8865i = valueSet;
        return this;
    }
}
