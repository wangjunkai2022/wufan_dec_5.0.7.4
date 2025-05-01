package kotlin.collections.builders;

import external.org.apache.commons.lang3.d;
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
/* compiled from: ListBuilder.kt */
@SourceDebugExtension({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/SerializedCollection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,429:1\n1#2:430\n*E\n"})
/* loaded from: classes6.dex */
public final class SerializedCollection implements Externalizable {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;
    public static final int tagList = 0;
    public static final int tagSet = 1;
    @NotNull
    private Collection<?> collection;
    private final int tag;

    /* compiled from: ListBuilder.kt */
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SerializedCollection(@NotNull Collection<?> collection, int i4) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        this.collection = collection;
        this.tag = i4;
    }

    private final Object readResolve() {
        return this.collection;
    }

    @Override // java.io.Externalizable
    public void readExternal(@NotNull ObjectInput input) {
        List createListBuilder;
        Collection<?> build;
        Set createSetBuilder;
        Intrinsics.checkNotNullParameter(input, "input");
        byte readByte = input.readByte();
        int i4 = readByte & 1;
        if ((readByte & (-2)) == 0) {
            int readInt = input.readInt();
            if (readInt >= 0) {
                int i5 = 0;
                if (i4 == 0) {
                    createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder(readInt);
                    while (i5 < readInt) {
                        createListBuilder.add(input.readObject());
                        i5++;
                    }
                    build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
                } else if (i4 == 1) {
                    createSetBuilder = SetsKt__SetsJVMKt.createSetBuilder(readInt);
                    while (i5 < readInt) {
                        createSetBuilder.add(input.readObject());
                        i5++;
                    }
                    build = SetsKt__SetsJVMKt.build(createSetBuilder);
                } else {
                    throw new InvalidObjectException("Unsupported collection type tag: " + i4 + d.f68897a);
                }
                this.collection = build;
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + d.f68897a);
        }
        throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte) + d.f68897a);
    }

    @Override // java.io.Externalizable
    public void writeExternal(@NotNull ObjectOutput output) {
        Intrinsics.checkNotNullParameter(output, "output");
        output.writeByte(this.tag);
        output.writeInt(this.collection.size());
        Iterator<?> it2 = this.collection.iterator();
        while (it2.hasNext()) {
            output.writeObject(it2.next());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SerializedCollection() {
        /*
            r2 = this;
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            r1 = 0
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.builders.SerializedCollection.<init>():void");
    }
}
