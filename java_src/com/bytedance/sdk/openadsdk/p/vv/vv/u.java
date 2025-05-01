package com.bytedance.sdk.openadsdk.p.vv.vv;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.FilterWord;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class u implements Bridge, FilterWord {

    /* renamed from: m  reason: collision with root package name */
    private FilterWord f8972m;
    private final Bridge vv;

    public u(FilterWord filterWord) {
        this.f8972m = filterWord;
        this.vv = a.f8191d;
    }

    @Override // com.bytedance.sdk.openadsdk.FilterWord
    public void addOption(FilterWord filterWord) {
        a c5 = a.c(1);
        c5.h(0, new u(filterWord));
        this.vv.call(241101, c5.a(), Void.class);
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        FilterWord filterWord = this.f8972m;
        if (filterWord == null) {
            return null;
        }
        switch (i4) {
            case 241101:
                this.f8972m.addOption(new u((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
            case 241102:
                this.f8972m.setIsSelected(valueSet.booleanValue(0));
                break;
            case 241103:
                return (T) filterWord.getId();
            case 241104:
                return (T) filterWord.getName();
            case 241105:
                return (T) Boolean.class.cast(Boolean.valueOf(filterWord.getIsSelected()));
            case 241106:
                return (T) Boolean.class.cast(Boolean.valueOf(filterWord.hasSecondOptions()));
            case 241107:
                return (T) Boolean.class.cast(Boolean.valueOf(filterWord.isValid()));
            case 241108:
                return (T) filterWord.getOptions();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.FilterWord
    public String getId() {
        return (String) this.vv.call(241103, a.c(0).a(), String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.FilterWord
    public boolean getIsSelected() {
        return ((Boolean) this.vv.call(241105, a.c(0).a(), Boolean.TYPE)).booleanValue();
    }

    @Override // com.bytedance.sdk.openadsdk.FilterWord
    public String getName() {
        return (String) this.vv.call(241104, a.c(0).a(), String.class);
    }

    @Override // com.bytedance.sdk.openadsdk.FilterWord
    public List<FilterWord> getOptions() {
        List<Bridge> list = (List) this.vv.call(241108, a.c(0).a(), List.class);
        if (list == null) {
            list = new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList();
        for (Bridge bridge : list) {
            arrayList.add(new u(bridge));
        }
        return arrayList;
    }

    @Override // com.bytedance.sdk.openadsdk.FilterWord
    public boolean hasSecondOptions() {
        return ((Boolean) this.vv.call(241106, a.c(0).a(), Boolean.TYPE)).booleanValue();
    }

    @Override // com.bytedance.sdk.openadsdk.FilterWord
    public boolean isValid() {
        return ((Boolean) this.vv.call(241107, a.c(0).a(), Boolean.TYPE)).booleanValue();
    }

    @Override // com.bytedance.sdk.openadsdk.FilterWord
    public void setIsSelected(boolean z4) {
        a c5 = a.c(1);
        c5.j(0, z4);
        this.vv.call(241102, c5.a(), Void.class);
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return a.f8190c;
    }

    public u(Bridge bridge) {
        this.vv = bridge == null ? a.f8191d : bridge;
    }
}
