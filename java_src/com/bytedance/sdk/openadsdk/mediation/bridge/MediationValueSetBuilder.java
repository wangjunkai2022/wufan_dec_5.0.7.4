package com.bytedance.sdk.openadsdk.mediation.bridge;

import android.util.SparseArray;
import com.bykv.vk.openvk.api.proto.ValueSet;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes2.dex */
public class MediationValueSetBuilder {
    private final SparseArray<Object> vv;

    /* loaded from: classes2.dex */
    public interface BooleanGetter extends ValueSet.ValueGetter<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface DoubleGetter extends ValueSet.ValueGetter<Double> {
    }

    /* loaded from: classes2.dex */
    public interface FloatGetter extends ValueSet.ValueGetter<Float> {
    }

    /* loaded from: classes2.dex */
    public interface IntGetter extends ValueSet.ValueGetter<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface LongGetter extends ValueSet.ValueGetter<Long> {
    }

    /* loaded from: classes2.dex */
    public interface ObjectGetter extends ValueSet.ValueGetter<Object> {
    }

    /* loaded from: classes2.dex */
    public interface StringGetter extends ValueSet.ValueGetter<String> {
    }

    /* loaded from: classes2.dex */
    private static final class ValueSetImpl implements ValueSet {
        private final SparseArray<Object> vv;

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public <T> T[] arrayValue(int i4, Class<T> cls) {
            Object obj = this.vv.get(i4);
            if (obj == null) {
                return null;
            }
            Class<?> cls2 = obj.getClass();
            if (cls2.isArray() && cls.isAssignableFrom(cls2.getComponentType())) {
                return (T[]) ((Object[]) obj);
            }
            return null;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public boolean booleanValue(int i4) {
            return booleanValue(i4, false);
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public boolean containsKey(int i4) {
            return this.vv.indexOfKey(i4) >= 0;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public double doubleValue(int i4) {
            Object obj = this.vv.get(i4);
            if (obj instanceof ValueSet.ValueGetter) {
                obj = ((ValueSet.ValueGetter) obj).get();
            }
            if (obj instanceof Double) {
                return ((Double) obj).doubleValue();
            }
            return 0.0d;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public float floatValue(int i4) {
            return floatValue(i4, 0.0f);
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public int intValue(int i4) {
            return intValue(i4, 0);
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public boolean isEmpty() {
            return size() <= 0;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public Set<Integer> keys() {
            int size = this.vv.size();
            HashSet hashSet = new HashSet();
            for (int i4 = 0; i4 < size; i4++) {
                hashSet.add(Integer.valueOf(i4));
            }
            return hashSet;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public long longValue(int i4) {
            return longValue(i4, 0L);
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public <T> T objectValue(int i4, Class<T> cls) {
            Object obj = this.vv.get(i4);
            if (obj instanceof ValueSet.ValueGetter) {
                obj = ((ValueSet.ValueGetter) obj).get();
            }
            if (cls.isInstance(obj)) {
                return (T) this.vv.get(i4);
            }
            return null;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public int size() {
            SparseArray<Object> sparseArray = this.vv;
            if (sparseArray == null) {
                return 0;
            }
            return sparseArray.size();
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public String stringValue(int i4) {
            return stringValue(i4, null);
        }

        private ValueSetImpl(SparseArray<Object> sparseArray) {
            this.vv = sparseArray;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public boolean booleanValue(int i4, boolean z4) {
            Object obj = this.vv.get(i4);
            if (obj instanceof ValueSet.ValueGetter) {
                obj = ((ValueSet.ValueGetter) obj).get();
            }
            return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z4;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public float floatValue(int i4, float f5) {
            Object obj = this.vv.get(i4);
            if (obj instanceof ValueSet.ValueGetter) {
                obj = ((ValueSet.ValueGetter) obj).get();
            }
            return obj instanceof Float ? ((Float) obj).floatValue() : f5;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public int intValue(int i4, int i5) {
            Object obj = this.vv.get(i4);
            if (obj instanceof ValueSet.ValueGetter) {
                obj = ((ValueSet.ValueGetter) obj).get();
            }
            return obj instanceof Integer ? ((Integer) obj).intValue() : i5;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public long longValue(int i4, long j4) {
            Object obj = this.vv.get(i4);
            if (obj instanceof ValueSet.ValueGetter) {
                obj = ((ValueSet.ValueGetter) obj).get();
            }
            return obj instanceof Long ? ((Long) obj).longValue() : j4;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public String stringValue(int i4, String str) {
            Object obj = this.vv.get(i4);
            return (obj instanceof ValueSet.ValueGetter ? ((ValueSet.ValueGetter) obj).get() : obj) instanceof String ? obj.toString() : str;
        }
    }

    private MediationValueSetBuilder(SparseArray<Object> sparseArray) {
        this.vv = sparseArray;
    }

    public static final MediationValueSetBuilder create() {
        return new MediationValueSetBuilder(new SparseArray());
    }

    public MediationValueSetBuilder add(int i4, Object obj) {
        this.vv.put(i4, obj);
        return this;
    }

    public <T> MediationValueSetBuilder addArray(int i4, T[] tArr) {
        this.vv.put(i4, tArr);
        return this;
    }

    public ValueSet build() {
        return new ValueSetImpl(this.vv);
    }

    public static final MediationValueSetBuilder create(ValueSet valueSet) {
        if (valueSet != null && !valueSet.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            for (Integer num : valueSet.keys()) {
                sparseArray.put(num.intValue(), valueSet.objectValue(num.intValue(), Object.class));
            }
            return new MediationValueSetBuilder(sparseArray);
        }
        return new MediationValueSetBuilder(new SparseArray());
    }

    public MediationValueSetBuilder add(int i4, String str) {
        this.vv.put(i4, str);
        return this;
    }

    public MediationValueSetBuilder add(int i4, int i5) {
        this.vv.put(i4, Integer.valueOf(i5));
        return this;
    }

    public MediationValueSetBuilder add(int i4, double d5) {
        this.vv.put(i4, Double.valueOf(d5));
        return this;
    }

    public MediationValueSetBuilder add(int i4, boolean z4) {
        this.vv.put(i4, Boolean.valueOf(z4));
        return this;
    }

    public MediationValueSetBuilder add(int i4, long j4) {
        this.vv.put(i4, Long.valueOf(j4));
        return this;
    }

    public MediationValueSetBuilder add(int i4, float f5) {
        this.vv.put(i4, Float.valueOf(f5));
        return this;
    }

    public MediationValueSetBuilder add(int i4, ObjectGetter objectGetter) {
        this.vv.put(i4, objectGetter);
        return this;
    }

    public MediationValueSetBuilder add(int i4, StringGetter stringGetter) {
        this.vv.put(i4, stringGetter);
        return this;
    }

    public MediationValueSetBuilder add(int i4, DoubleGetter doubleGetter) {
        this.vv.put(i4, doubleGetter);
        return this;
    }

    public MediationValueSetBuilder add(int i4, IntGetter intGetter) {
        this.vv.put(i4, intGetter);
        return this;
    }

    public MediationValueSetBuilder add(int i4, BooleanGetter booleanGetter) {
        this.vv.put(i4, booleanGetter);
        return this;
    }

    public MediationValueSetBuilder add(int i4, LongGetter longGetter) {
        this.vv.put(i4, longGetter);
        return this;
    }

    public MediationValueSetBuilder add(int i4, FloatGetter floatGetter) {
        this.vv.put(i4, floatGetter);
        return this;
    }
}
