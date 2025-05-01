package kotlin.collections.builders;

import external.org.apache.commons.lang3.d;
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: MapBuilder.kt */
/* loaded from: classes6.dex */
final class SerializedMap implements Externalizable {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;
    @NotNull
    private Map<?, ?> map;

    /* compiled from: MapBuilder.kt */
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SerializedMap(@NotNull Map<?, ?> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.map = map;
    }

    private final Object readResolve() {
        return this.map;
    }

    @Override // java.io.Externalizable
    public void readExternal(@NotNull ObjectInput input) {
        Map createMapBuilder;
        Map<?, ?> build;
        Intrinsics.checkNotNullParameter(input, "input");
        byte readByte = input.readByte();
        if (readByte == 0) {
            int readInt = input.readInt();
            if (readInt >= 0) {
                createMapBuilder = MapsKt__MapsJVMKt.createMapBuilder(readInt);
                for (int i4 = 0; i4 < readInt; i4++) {
                    createMapBuilder.put(input.readObject(), input.readObject());
                }
                build = MapsKt__MapsJVMKt.build(createMapBuilder);
                this.map = build;
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + d.f68897a);
        }
        throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte));
    }

    @Override // java.io.Externalizable
    public void writeExternal(@NotNull ObjectOutput output) {
        Intrinsics.checkNotNullParameter(output, "output");
        output.writeByte(0);
        output.writeInt(this.map.size());
        for (Map.Entry<?, ?> entry : this.map.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SerializedMap() {
        /*
            r1 = this;
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.builders.SerializedMap.<init>():void");
    }
}
