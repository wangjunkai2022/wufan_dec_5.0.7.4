package com.mob.tools.utils;

import android.content.Context;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import com.mob.commons.C0811r;
import com.mob.commons.v;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import com.mob.tools.proguard.PublicMemberKeeper;
import com.mob.tools.utils.MobPersistence;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
/* loaded from: classes5.dex */
public class SharePrefrenceHelper implements PublicMemberKeeper {
    public static final String SP_CACHE_FOLDER = C0811r.b("003[gbcjee");

    /* renamed from: a  reason: collision with root package name */
    private Context f57010a;

    /* renamed from: b  reason: collision with root package name */
    private volatile MobPersistence f57011b;

    public SharePrefrenceHelper(Context context) {
        if (context != null) {
            this.f57010a = context.getApplicationContext();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        try {
            return Pattern.matches("^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)$", str);
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
            return false;
        }
    }

    public static boolean isMobSpFileExist(Context context, String str, int i4) {
        return a.a(context, str + "_" + i4);
    }

    public static boolean isMpfFileExist(Context context, String str, int i4) {
        return MobPersistence.a(context, str + "_" + i4);
    }

    public void clear() {
        if (this.f57011b != null) {
            try {
                this.f57011b.a();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }
    }

    public Object get(String str) {
        return get(str, null);
    }

    @Deprecated
    public HashMap<String, Object> getAll() {
        if (this.f57011b != null) {
            try {
                return this.f57011b.b();
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }
        return new HashMap<>();
    }

    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    public boolean getBooleanThrowable(String str) throws MobPersistence.NoValidDataException {
        return getBooleanThrowable(str, false);
    }

    public double getDouble(String str) {
        return getDouble(str, 0.0d);
    }

    public double getDoubleThrowable(String str) throws MobPersistence.NoValidDataException {
        return getDoubleThrowable(str, 0.0d);
    }

    public int getInt(String str) {
        return getInt(str, 0);
    }

    public int getIntThrowable(String str) throws MobPersistence.NoValidDataException {
        return getIntThrowable(str, 0);
    }

    public long getLong(String str) {
        return getLong(str, 0L);
    }

    public long getLongThrowable(String str) throws MobPersistence.NoValidDataException {
        return getLongThrowable(str, 0L);
    }

    @Deprecated
    public Object getObj(String str, Object obj) {
        return get(str, obj);
    }

    public <T extends Parcelable> T getParcel(String str, Class<T> cls) {
        return (T) getParcel(str, cls, null);
    }

    public <T extends Parcelable> T[] getParcelArray(String str, Class<T> cls) {
        return (T[]) getParcelArray(str, cls, null);
    }

    public <T extends Parcelable> T[] getParcelArrayThrowable(String str, Class<T> cls) throws MobPersistence.NoValidDataException {
        return (T[]) getParcelArrayThrowable(str, cls, null);
    }

    public <T extends Parcelable> List<T> getParcelList(String str, Class<T> cls) {
        return getParcelList(str, cls, null);
    }

    public <T extends Parcelable> List<T> getParcelListThrowable(String str, Class<T> cls) throws MobPersistence.NoValidDataException {
        return getParcelListThrowable(str, cls, null);
    }

    public <T extends Parcelable> Map<String, T> getParcelMap(String str, Class<T> cls) {
        return getParcelMap(str, cls, null);
    }

    public <T extends Parcelable> Map<String, T> getParcelMapThrowable(String str, Class<T> cls) throws MobPersistence.NoValidDataException {
        return getParcelMapThrowable(str, cls, null);
    }

    public <T extends Parcelable> T getParcelThrowable(String str, Class<T> cls) throws MobPersistence.NoValidDataException {
        return (T) getParcelThrowable(str, cls, null);
    }

    public String getString(String str) {
        return getString(str, "");
    }

    public String getStringThrowable(String str) throws MobPersistence.NoValidDataException {
        return getStringThrowable(str, "");
    }

    public Object getThrowable(String str) throws MobPersistence.NoValidDataException {
        return getThrowable(str, null);
    }

    public void open(String str) {
        open(str, 0);
    }

    public void put(String str, Object obj) {
        put(str, obj, 0L);
    }

    @Deprecated
    public void putAll(HashMap<String, Object> hashMap) {
        if (hashMap == null || hashMap.isEmpty()) {
            return;
        }
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public void putBoolean(String str, Boolean bool) {
        putBoolean(str, bool, 0L);
    }

    public void putDouble(String str, Double d5) {
        putDouble(str, d5, 0L);
    }

    public void putInt(String str, Integer num) {
        putInt(str, num, 0L);
    }

    public void putLong(String str, Long l4) {
        putLong(str, l4, 0L);
    }

    @Deprecated
    public void putObj(String str, Object obj) {
        if (obj == null && this.f57011b != null) {
            remove(str);
        } else if (this.f57011b != null) {
            put(str, obj);
        }
    }

    public void putParcel(String str, Parcelable parcelable) {
        putParcel(str, parcelable, 0L);
    }

    public <T extends Parcelable> void putParcelArray(String str, T[] tArr) {
        putParcelArray(str, tArr, 0L);
    }

    public <T extends Parcelable> void putParcelList(String str, List<T> list) {
        putParcelList(str, list, 0L);
    }

    public <T extends Parcelable> void putParcelMap(String str, Map<String, T> map) {
        putParcelMap(str, map, 0L);
    }

    public void putString(String str, String str2) {
        putString(str, str2, 0L);
    }

    public void remove(String str) {
        if (this.f57011b != null) {
            try {
                this.f57011b.a(str);
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }
    }

    public Object get(String str, Object obj) {
        try {
            return getThrowable(str, obj);
        } catch (MobPersistence.NoValidDataException unused) {
            return obj;
        }
    }

    public boolean getBoolean(String str, boolean z4) {
        try {
            return getBooleanThrowable(str, z4);
        } catch (MobPersistence.NoValidDataException unused) {
            return z4;
        }
    }

    public boolean getBooleanThrowable(String str, boolean z4) throws MobPersistence.NoValidDataException {
        if (this.f57011b != null) {
            try {
                Object a5 = this.f57011b.a(new MobPersistence.e(str));
                if (a5 != null) {
                    if (a5 instanceof Boolean) {
                        return ((Boolean) a5).booleanValue();
                    }
                    return ((Number) a5).byteValue() == 1;
                }
                return z4;
            } catch (MobPersistence.NoValidDataException e5) {
                throw e5;
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }
        return z4;
    }

    public double getDouble(String str, double d5) {
        try {
            return getDoubleThrowable(str, d5);
        } catch (MobPersistence.NoValidDataException unused) {
            return d5;
        }
    }

    public double getDoubleThrowable(String str, double d5) throws MobPersistence.NoValidDataException {
        if (this.f57011b != null) {
            try {
                Double d6 = (Double) this.f57011b.a(new MobPersistence.e(str));
                return d6 == null ? d5 : d6.doubleValue();
            } catch (MobPersistence.NoValidDataException e5) {
                throw e5;
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }
        return d5;
    }

    public int getInt(String str, int i4) {
        try {
            return getIntThrowable(str, i4);
        } catch (MobPersistence.NoValidDataException unused) {
            return i4;
        }
    }

    public int getIntThrowable(String str, int i4) throws MobPersistence.NoValidDataException {
        if (this.f57011b != null) {
            try {
                Integer num = (Integer) this.f57011b.a(new MobPersistence.e(str));
                return num == null ? i4 : num.intValue();
            } catch (MobPersistence.NoValidDataException e5) {
                throw e5;
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }
        return i4;
    }

    public long getLong(String str, long j4) {
        try {
            return getLongThrowable(str, j4);
        } catch (MobPersistence.NoValidDataException unused) {
            return j4;
        }
    }

    public long getLongThrowable(String str, long j4) throws MobPersistence.NoValidDataException {
        if (this.f57011b != null) {
            try {
                Long l4 = (Long) this.f57011b.a(new MobPersistence.e(str));
                return l4 == null ? j4 : l4.longValue();
            } catch (MobPersistence.NoValidDataException e5) {
                throw e5;
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }
        return j4;
    }

    public <T extends Parcelable> T getParcel(String str, Class<T> cls, T t4) {
        try {
            return (T) getParcelThrowable(str, cls, t4);
        } catch (MobPersistence.NoValidDataException unused) {
            return t4;
        }
    }

    public <T extends Parcelable> T[] getParcelArray(String str, Class<T> cls, T[] tArr) {
        try {
            return (T[]) getParcelArrayThrowable(str, cls, tArr);
        } catch (MobPersistence.NoValidDataException unused) {
            return tArr;
        }
    }

    public <T extends Parcelable> T[] getParcelArrayThrowable(String str, final Class<T> cls, final T[] tArr) throws MobPersistence.NoValidDataException {
        if (this.f57011b != null) {
            try {
                T[] tArr2 = (T[]) ((Parcelable[]) this.f57011b.a((MobPersistence.e<Object>) new MobPersistence.e<T[]>(str) { // from class: com.mob.tools.utils.SharePrefrenceHelper.8
                    /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Object;)[TT; */
                    @Override // com.mob.tools.utils.MobPersistence.e
                    /* renamed from: b */
                    public Parcelable[] a(Object obj) {
                        if (obj != null) {
                            HashMap[] hashMapArr = (HashMap[]) obj;
                            Parcelable[] parcelableArr = (Parcelable[]) Array.newInstance(cls, hashMapArr.length);
                            for (int i4 = 0; i4 < parcelableArr.length; i4++) {
                                parcelableArr[i4] = MobPersistence.b.a(hashMapArr[i4]).a((MobPersistence.b) null);
                            }
                            return parcelableArr;
                        }
                        return tArr;
                    }
                }));
                return tArr2 != null ? tArr2 : tArr;
            } catch (MobPersistence.NoValidDataException e5) {
                throw e5;
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }
        return tArr;
    }

    public <T extends Parcelable> List<T> getParcelList(String str, Class<T> cls, List<T> list) {
        try {
            return getParcelListThrowable(str, cls, list);
        } catch (MobPersistence.NoValidDataException unused) {
            return list;
        }
    }

    public <T extends Parcelable> List<T> getParcelListThrowable(String str, Class<T> cls, final List<T> list) throws MobPersistence.NoValidDataException {
        if (this.f57011b != null) {
            try {
                List<T> list2 = (List) this.f57011b.a((MobPersistence.e<Object>) new MobPersistence.e<List<T>>(str) { // from class: com.mob.tools.utils.SharePrefrenceHelper.6
                    @Override // com.mob.tools.utils.MobPersistence.e
                    /* renamed from: b */
                    public List<T> a(Object obj) {
                        ArrayList arrayList;
                        if (obj != null) {
                            List<HashMap> list3 = (List) obj;
                            if (list3 instanceof ArrayList) {
                                arrayList = new ArrayList();
                            } else if (list3 instanceof LinkedList) {
                                arrayList = new LinkedList();
                            } else {
                                arrayList = new ArrayList();
                            }
                            for (HashMap hashMap : list3) {
                                arrayList.add(MobPersistence.b.a(hashMap).a((MobPersistence.b) null));
                            }
                            return arrayList;
                        }
                        return list;
                    }
                });
                return list2 != null ? list2 : list;
            } catch (MobPersistence.NoValidDataException e5) {
                throw e5;
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }
        return list;
    }

    public <T extends Parcelable> Map<String, T> getParcelMap(String str, Class<T> cls, Map<String, T> map) {
        try {
            return getParcelMapThrowable(str, cls, map);
        } catch (MobPersistence.NoValidDataException unused) {
            return map;
        }
    }

    public <T extends Parcelable> Map<String, T> getParcelMapThrowable(String str, Class<T> cls, final Map<String, T> map) throws MobPersistence.NoValidDataException {
        if (this.f57011b != null) {
            try {
                Map<String, T> map2 = (Map) this.f57011b.a((MobPersistence.e<Object>) new MobPersistence.e<Map<String, T>>(str) { // from class: com.mob.tools.utils.SharePrefrenceHelper.4
                    @Override // com.mob.tools.utils.MobPersistence.e
                    /* renamed from: b */
                    public Map<String, T> a(Object obj) {
                        Map map3;
                        if (obj != null) {
                            Map map4 = (Map) obj;
                            if (map4 instanceof HashMap) {
                                map3 = (Map<String, T>) new HashMap();
                            } else if (map4 instanceof Hashtable) {
                                map3 = (Map<String, T>) new Hashtable();
                            } else if (map4 instanceof TreeMap) {
                                map3 = (Map<String, T>) new TreeMap();
                            } else {
                                map3 = (Map<String, T>) new HashMap();
                            }
                            for (Map.Entry entry : map4.entrySet()) {
                                map3.put(entry.getKey(), MobPersistence.b.a((HashMap) entry.getValue()).a((MobPersistence.b) null));
                            }
                            return (Map<String, T>) map3;
                        }
                        return map;
                    }
                });
                return map2 != null ? map2 : map;
            } catch (MobPersistence.NoValidDataException e5) {
                throw e5;
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }
        return map;
    }

    public <T> T getParcelThrowable(String str, Class<T> cls, final T t4) throws MobPersistence.NoValidDataException {
        if (this.f57011b != null) {
            try {
                T t5 = (T) this.f57011b.a(new MobPersistence.e<T>(str) { // from class: com.mob.tools.utils.SharePrefrenceHelper.2
                    @Override // com.mob.tools.utils.MobPersistence.e
                    public T a(Object obj) {
                        if (obj != null) {
                            return (T) MobPersistence.b.a((HashMap) obj).a((MobPersistence.b) ((Parcelable) t4));
                        }
                        return (T) t4;
                    }
                });
                return t5 != null ? t5 : t4;
            } catch (MobPersistence.NoValidDataException e5) {
                throw e5;
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }
        return t4;
    }

    public String getString(String str, String str2) {
        try {
            return getStringThrowable(str, str2);
        } catch (MobPersistence.NoValidDataException unused) {
            return str2;
        }
    }

    public String getStringThrowable(String str, String str2) throws MobPersistence.NoValidDataException {
        if (this.f57011b != null) {
            try {
                String str3 = (String) this.f57011b.a(new MobPersistence.e(str));
                return TextUtils.isEmpty(str3) ? str2 : str3;
            } catch (MobPersistence.NoValidDataException e5) {
                throw e5;
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }
        return str2;
    }

    public Object getThrowable(String str, final Object obj) throws MobPersistence.NoValidDataException {
        if (this.f57011b != null) {
            try {
                Object a5 = this.f57011b.a(new MobPersistence.e<Object>(str) { // from class: com.mob.tools.utils.SharePrefrenceHelper.9
                    @Override // com.mob.tools.utils.MobPersistence.e
                    public Object a(Object obj2) {
                        if (obj2 != null) {
                            if ((obj2 instanceof String) && SharePrefrenceHelper.this.b((String) obj2)) {
                                try {
                                    return SharePrefrenceHelper.this.a(Base64.decode((String) obj2, 2));
                                } catch (Throwable th) {
                                    NLog mobLog = MobLog.getInstance();
                                    mobLog.d("Expected exc: " + th.getMessage(), new Object[0]);
                                    return obj2;
                                }
                            }
                            return obj2;
                        }
                        return obj;
                    }
                });
                if (a5 != null) {
                    if ((a5 instanceof String) && b((String) a5)) {
                        try {
                            return a(Base64.decode((String) a5, 2));
                        } catch (Throwable th) {
                            NLog mobLog = MobLog.getInstance();
                            mobLog.d("Expected exc: " + th.getMessage(), new Object[0]);
                            return a5;
                        }
                    }
                    return a5;
                }
                return obj;
            } catch (MobPersistence.NoValidDataException e5) {
                throw e5;
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
            }
        }
        return obj;
    }

    public void open(String str, int i4) {
        open(str, i4, null);
    }

    public void put(String str, Object obj, long j4) {
        if (this.f57011b != null) {
            try {
                this.f57011b.a(new MobPersistence.j(str, obj, j4));
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }
    }

    public void putBoolean(String str, Boolean bool, long j4) {
        if (this.f57011b == null || bool == null) {
            return;
        }
        try {
            this.f57011b.a(new MobPersistence.j(str, Byte.valueOf((byte) (bool.booleanValue() ? 1 : 0)), j4));
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
    }

    public void putDouble(String str, Double d5, long j4) {
        if (this.f57011b == null || d5 == null) {
            return;
        }
        try {
            this.f57011b.a(new MobPersistence.j(str, d5, j4));
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
    }

    public void putInt(String str, Integer num, long j4) {
        if (this.f57011b == null || num == null) {
            return;
        }
        try {
            this.f57011b.a(new MobPersistence.j(str, num, j4));
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
    }

    public void putLong(String str, Long l4, long j4) {
        if (this.f57011b == null || l4 == null) {
            return;
        }
        try {
            this.f57011b.a(new MobPersistence.j(str, l4, j4));
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
    }

    public void putParcel(String str, Parcelable parcelable, long j4) {
        if (this.f57011b != null) {
            try {
                this.f57011b.a(new MobPersistence.j(str, parcelable, j4) { // from class: com.mob.tools.utils.SharePrefrenceHelper.1
                    @Override // com.mob.tools.utils.MobPersistence.j
                    public Object c() {
                        Object b5 = b();
                        if (b5 != null) {
                            return new MobPersistence.b((Parcelable) b5).b();
                        }
                        return null;
                    }
                });
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }
    }

    public <T extends Parcelable> void putParcelArray(String str, T[] tArr, long j4) {
        if (this.f57011b == null || tArr == null || tArr.length <= 0) {
            return;
        }
        try {
            this.f57011b.a(new MobPersistence.j(str, tArr, j4) { // from class: com.mob.tools.utils.SharePrefrenceHelper.7
                @Override // com.mob.tools.utils.MobPersistence.j
                public Object c() {
                    Object b5 = b();
                    if (b5 != null) {
                        Parcelable[] parcelableArr = (Parcelable[]) b5;
                        int length = parcelableArr.length;
                        HashMap[] hashMapArr = new HashMap[length];
                        for (int i4 = 0; i4 < length; i4++) {
                            hashMapArr[i4] = new MobPersistence.b(parcelableArr[i4]).b();
                        }
                        return hashMapArr;
                    }
                    return null;
                }
            });
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
    }

    public <T extends Parcelable> void putParcelList(String str, List<T> list, long j4) {
        if (this.f57011b == null || list == null || list.isEmpty()) {
            return;
        }
        this.f57011b.a(new MobPersistence.j(str, list, j4) { // from class: com.mob.tools.utils.SharePrefrenceHelper.5
            @Override // com.mob.tools.utils.MobPersistence.j
            public Object c() {
                List arrayList;
                Object b5 = b();
                if (b5 != null) {
                    if (b5 instanceof ArrayList) {
                        arrayList = new ArrayList();
                    } else if (b5 instanceof LinkedList) {
                        arrayList = new LinkedList();
                    } else {
                        arrayList = new ArrayList();
                    }
                    for (Parcelable parcelable : (List) b5) {
                        arrayList.add(new MobPersistence.b(parcelable).b());
                    }
                    return arrayList;
                }
                return null;
            }
        });
    }

    public <T extends Parcelable> void putParcelMap(String str, Map<String, T> map, long j4) {
        if (this.f57011b == null || map == null || map.isEmpty()) {
            return;
        }
        try {
            this.f57011b.a(new MobPersistence.j(str, map, j4) { // from class: com.mob.tools.utils.SharePrefrenceHelper.3
                @Override // com.mob.tools.utils.MobPersistence.j
                public Object c() {
                    Map hashMap;
                    Object b5 = b();
                    if (b5 != null) {
                        if (b5 instanceof HashMap) {
                            hashMap = new HashMap();
                        } else if (b5 instanceof Hashtable) {
                            hashMap = new Hashtable();
                        } else if (b5 instanceof TreeMap) {
                            hashMap = new TreeMap();
                        } else {
                            hashMap = new HashMap();
                        }
                        for (Map.Entry entry : ((Map) b5).entrySet()) {
                            hashMap.put(entry.getKey(), new MobPersistence.b((Parcelable) entry.getValue()).b());
                        }
                        return hashMap;
                    }
                    return null;
                }
            });
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
    }

    public void putString(String str, String str2, long j4) {
        if (this.f57011b != null) {
            try {
                this.f57011b.a(new MobPersistence.j(str, str2, j4));
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: c  reason: collision with root package name */
        private static File f57027c;

        /* renamed from: a  reason: collision with root package name */
        private File f57028a;

        /* renamed from: b  reason: collision with root package name */
        private HashMap<String, Object> f57029b = new HashMap<>();

        public a(Context context, String str) {
            if (context != null) {
                try {
                    File file = new File(a(context), str);
                    this.f57028a = file;
                    if (!file.getParentFile().exists()) {
                        this.f57028a.getParentFile().mkdirs();
                    }
                    if (!this.f57028a.exists()) {
                        this.f57028a.createNewFile();
                    }
                } catch (Throwable th) {
                    MobLog.getInstance().d(th);
                    return;
                }
            }
            b();
        }

        private static synchronized File a(Context context) {
            File file;
            synchronized (a.class) {
                if (f57027c == null) {
                    f57027c = new File(context.getFilesDir(), SharePrefrenceHelper.SP_CACHE_FOLDER);
                }
                file = f57027c;
            }
            return file;
        }

        private void b() {
            InputStreamReader inputStreamReader;
            BufferedReader bufferedReader;
            Throwable th;
            FileInputStream fileInputStream;
            synchronized (this.f57029b) {
                File file = this.f57028a;
                if (file != null && file.exists()) {
                    try {
                        fileInputStream = new FileInputStream(this.f57028a);
                        try {
                            inputStreamReader = new InputStreamReader(fileInputStream, "utf-8");
                            try {
                                bufferedReader = new BufferedReader(inputStreamReader);
                                try {
                                    StringBuilder sb = new StringBuilder();
                                    for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                                        if (sb.length() > 0) {
                                            sb.append("\n");
                                        }
                                        sb.append(readLine);
                                    }
                                    this.f57029b = HashonHelper.fromJson(sb.toString());
                                    v.a(bufferedReader, inputStreamReader, fileInputStream);
                                } catch (Throwable th2) {
                                    th = th2;
                                    MobLog.getInstance().w(th);
                                    v.a(bufferedReader, inputStreamReader, fileInputStream);
                                }
                            } catch (Throwable th3) {
                                bufferedReader = null;
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            bufferedReader = null;
                            th = th4;
                            inputStreamReader = null;
                        }
                    } catch (Throwable th5) {
                        inputStreamReader = null;
                        bufferedReader = null;
                        th = th5;
                        fileInputStream = null;
                    }
                }
            }
        }

        public static synchronized boolean a(Context context, String str) {
            synchronized (a.class) {
                return new File(a(context), str).exists();
            }
        }

        public HashMap<String, Object> a() {
            HashMap<String, Object> hashMap;
            synchronized (this.f57029b) {
                hashMap = new HashMap<>();
                hashMap.putAll(this.f57029b);
            }
            return hashMap;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object a(byte[] bArr) throws Throwable {
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        ObjectInputStream objectInputStream;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    Object readObject = objectInputStream.readObject();
                    v.a(objectInputStream, byteArrayInputStream);
                    return readObject;
                } catch (Throwable th2) {
                    th = th2;
                    v.a(objectInputStream, byteArrayInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                objectInputStream = null;
            }
        } catch (Throwable th4) {
            byteArrayInputStream = null;
            th = th4;
            objectInputStream = null;
        }
    }

    public void open(String str, int i4, String str2) {
        String str3 = str + "_" + i4;
        this.f57011b = new MobPersistence(this.f57010a, str3, str2);
        a(str3);
    }

    private void a(String str) {
        HashMap<String, Object> hashMap;
        if (getBoolean("k_m_sp_cpt_dn") || !a.a(this.f57010a, str)) {
            return;
        }
        MobLog.getInstance().d("[MPF][" + str + "]Compat acquire", new Object[0]);
        a aVar = new a(this.f57010a, str);
        if (this.f57011b != null) {
            hashMap = aVar.a();
            if (hashMap != null && !hashMap.isEmpty()) {
                putAll(hashMap);
            }
            putBoolean("k_m_sp_cpt_dn", Boolean.TRUE);
        } else {
            hashMap = null;
        }
        NLog mobLog = MobLog.getInstance();
        StringBuilder sb = new StringBuilder();
        sb.append("[MPF][");
        sb.append(str);
        sb.append("]Compat done, mv: ");
        sb.append(hashMap != null ? Integer.valueOf(hashMap.size()) : null);
        mobLog.d(sb.toString(), new Object[0]);
    }
}
