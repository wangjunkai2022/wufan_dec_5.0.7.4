package io.netty.util;
@Deprecated
/* loaded from: classes6.dex */
public final class DomainMappingBuilder<V> {
    private final DomainNameMappingBuilder<V> builder;

    public DomainMappingBuilder(V v2) {
        this.builder = new DomainNameMappingBuilder<>(v2);
    }

    public DomainMappingBuilder<V> add(String str, V v2) {
        this.builder.add(str, v2);
        return this;
    }

    public DomainNameMapping<V> build() {
        return this.builder.build();
    }

    public DomainMappingBuilder(int i4, V v2) {
        this.builder = new DomainNameMappingBuilder<>(i4, v2);
    }
}
