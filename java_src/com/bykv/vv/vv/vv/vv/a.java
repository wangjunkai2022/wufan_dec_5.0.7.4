package com.bykv.vv.vv.vv.vv;

import android.util.SparseArray;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes2.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    public static final ValueSet f8190c = c(0).a();

    /* renamed from: d  reason: collision with root package name */
    public static final Bridge f8191d = new c();

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<Object> f8192a;

    /* renamed from: b  reason: collision with root package name */
    private ValueSet f8193b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class b implements ValueSet {

        /* renamed from: a  reason: collision with root package name */
        private final SparseArray<Object> f8194a;

        /* renamed from: b  reason: collision with root package name */
        private ValueSet f8195b;

        /* renamed from: c  reason: collision with root package name */
        private int f8196c;

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public <T> T[] arrayValue(int i4, Class<T> cls) {
            Object obj = this.f8194a.get(i4);
            if (obj == null) {
                ValueSet valueSet = this.f8195b;
                if (valueSet != null) {
                    return (T[]) valueSet.arrayValue(i4, cls);
                }
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
            ValueSet valueSet;
            int indexOfKey = this.f8194a.indexOfKey(i4);
            if (indexOfKey >= 0 || (valueSet = this.f8195b) == null) {
                return indexOfKey >= 0;
            }
            return valueSet.containsKey(i4);
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public double doubleValue(int i4) {
            ValueSet valueSet;
            Object obj = this.f8194a.get(i4);
            if (obj == null && (valueSet = this.f8195b) != null) {
                return valueSet.doubleValue(i4);
            }
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
            int size = this.f8194a.size();
            HashSet hashSet = new HashSet();
            for (int i4 = 0; i4 < size; i4++) {
                hashSet.add(Integer.valueOf(this.f8194a.keyAt(i4)));
            }
            ValueSet valueSet = this.f8195b;
            if (valueSet != null) {
                hashSet.addAll(valueSet.keys());
            }
            this.f8196c = hashSet.size();
            return hashSet;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public long longValue(int i4) {
            return longValue(i4, 0L);
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public <T> T objectValue(int i4, Class<T> cls) {
            T t4 = (T) this.f8194a.get(i4);
            if (t4 == null) {
                ValueSet valueSet = this.f8195b;
                if (valueSet != null) {
                    return (T) valueSet.objectValue(i4, cls);
                }
                return null;
            }
            if (t4 instanceof ValueSet.ValueGetter) {
                t4 = (T) ((ValueSet.ValueGetter) t4).get();
            }
            if (cls.isInstance(t4)) {
                return t4;
            }
            return null;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public int size() {
            if (this.f8196c < 0) {
                keys();
            }
            return this.f8196c;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public String stringValue(int i4) {
            return stringValue(i4, null);
        }

        private b(SparseArray<Object> sparseArray, ValueSet valueSet) {
            this.f8196c = -1;
            this.f8194a = sparseArray;
            this.f8195b = valueSet;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public boolean booleanValue(int i4, boolean z4) {
            ValueSet valueSet;
            Object obj = this.f8194a.get(i4);
            if (obj == null && (valueSet = this.f8195b) != null) {
                return valueSet.booleanValue(i4, z4);
            }
            if (obj instanceof ValueSet.ValueGetter) {
                obj = ((ValueSet.ValueGetter) obj).get();
            }
            return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z4;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public float floatValue(int i4, float f5) {
            ValueSet valueSet;
            Object obj = this.f8194a.get(i4);
            if (obj == null && (valueSet = this.f8195b) != null) {
                return valueSet.floatValue(i4, f5);
            }
            if (obj instanceof ValueSet.ValueGetter) {
                obj = ((ValueSet.ValueGetter) obj).get();
            }
            return obj instanceof Float ? ((Float) obj).floatValue() : f5;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public int intValue(int i4, int i5) {
            ValueSet valueSet;
            Object obj = this.f8194a.get(i4);
            if (obj == null && (valueSet = this.f8195b) != null) {
                return valueSet.intValue(i4, i5);
            }
            if (obj instanceof ValueSet.ValueGetter) {
                obj = ((ValueSet.ValueGetter) obj).get();
            }
            return obj instanceof Integer ? ((Integer) obj).intValue() : i5;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public long longValue(int i4, long j4) {
            ValueSet valueSet;
            Object obj = this.f8194a.get(i4);
            if (obj == null && (valueSet = this.f8195b) != null) {
                return valueSet.longValue(i4, j4);
            }
            if (obj instanceof ValueSet.ValueGetter) {
                obj = ((ValueSet.ValueGetter) obj).get();
            }
            return obj instanceof Long ? ((Long) obj).longValue() : j4;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public String stringValue(int i4, String str) {
            ValueSet valueSet;
            Object obj = this.f8194a.get(i4);
            if (obj != null || (valueSet = this.f8195b) == null) {
                return (obj instanceof ValueSet.ValueGetter ? ((ValueSet.ValueGetter) obj).get() : obj) instanceof String ? obj.toString() : str;
            }
            return valueSet.stringValue(i4, str);
        }
    }

    /* loaded from: classes2.dex */
    private static final class c implements Bridge {
        private c() {
        }

        @Override // com.bykv.vk.openvk.api.proto.Caller
        public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
            if (cls == Boolean.class) {
                return (T) Boolean.FALSE;
            }
            if (cls != Integer.TYPE && cls != Integer.class) {
                if (cls != Long.TYPE && cls != Long.class) {
                    if (cls != Double.TYPE && cls != Double.class) {
                        if (cls == Float.TYPE || cls == Float.class) {
                            return (T) Float.valueOf(0.0f);
                        }
                        return null;
                    }
                    return (T) Double.valueOf(0.0d);
                }
                return (T) 0L;
            }
            return (T) 0;
        }

        @Override // com.bykv.vk.openvk.api.proto.Bridge
        public ValueSet values() {
            return a.f8190c;
        }
    }

    private a(SparseArray<Object> sparseArray, ValueSet valueSet) {
        this.f8192a = sparseArray;
        this.f8193b = valueSet;
    }

    public static final a b() {
        return new a(new SparseArray());
    }

    public static final a c(int i4) {
        return new a(new SparseArray(i4));
    }

    public static final a k(ValueSet valueSet) {
        return new a(new SparseArray(), valueSet);
    }

    public ValueSet a() {
        return new b(this.f8192a, this.f8193b);
    }

    public a d(int i4, double d5) {
        this.f8192a.put(i4, Double.valueOf(d5));
        return this;
    }

    public a e(int i4, float f5) {
        this.f8192a.put(i4, Float.valueOf(f5));
        return this;
    }

    public a f(int i4, int i5) {
        this.f8192a.put(i4, Integer.valueOf(i5));
        return this;
    }

    public a g(int i4, long j4) {
        this.f8192a.put(i4, Long.valueOf(j4));
        return this;
    }

    public a h(int i4, Object obj) {
        this.f8192a.put(i4, obj);
        return this;
    }

    public a i(int i4, String str) {
        this.f8192a.put(i4, str);
        return this;
    }

    public a j(int i4, boolean z4) {
        this.f8192a.put(i4, Boolean.valueOf(z4));
        return this;
    }

    private a(SparseArray<Object> sparseArray) {
        this.f8192a = sparseArray;
    }
}
