package com.mob.tools.utils;

import android.os.Parcelable;
import com.mob.MobSDK;
import com.mob.commons.m;
import com.mob.tools.utils.MobPersistence;
import java.util.List;
import java.util.Map;
/* loaded from: classes5.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private static final String f57077a = m.a("006[bdbiddbfba4f");

    /* renamed from: b  reason: collision with root package name */
    private static volatile h f57078b;

    /* renamed from: c  reason: collision with root package name */
    private SharePrefrenceHelper f57079c;

    private h() {
        if (this.f57079c == null) {
            SharePrefrenceHelper sharePrefrenceHelper = new SharePrefrenceHelper(MobSDK.getContext());
            this.f57079c = sharePrefrenceHelper;
            sharePrefrenceHelper.open(f57077a, 1, m.a("016b*dd^aFbacdKd3dffhfbgifffdfchdfjfg"));
        }
    }

    public static h a() {
        if (f57078b == null) {
            synchronized (h.class) {
                if (f57078b == null) {
                    f57078b = new h();
                }
            }
        }
        return f57078b;
    }

    public String b(String str, String str2) throws MobPersistence.NoValidDataException {
        return this.f57079c.getStringThrowable(str, str2);
    }

    public long c(String str) {
        return this.f57079c.getLong(str);
    }

    public long d(String str) throws MobPersistence.NoValidDataException {
        return this.f57079c.getLongThrowable(str);
    }

    public int e(String str) {
        return this.f57079c.getInt(str);
    }

    public double f(String str) throws MobPersistence.NoValidDataException {
        return this.f57079c.getDoubleThrowable(str);
    }

    public Object g(String str) throws MobPersistence.NoValidDataException {
        return this.f57079c.getThrowable(str);
    }

    public void h(String str) {
        this.f57079c.remove(str);
    }

    public boolean b(String str) throws MobPersistence.NoValidDataException {
        return this.f57079c.getBooleanThrowable(str);
    }

    public <T extends Parcelable> List<T> c(String str, Class<T> cls) throws MobPersistence.NoValidDataException {
        return this.f57079c.getParcelListThrowable(str, cls);
    }

    public <T extends Parcelable> T[] d(String str, Class<T> cls) throws MobPersistence.NoValidDataException {
        return (T[]) this.f57079c.getParcelArrayThrowable(str, cls);
    }

    public int b(String str, int i4) throws MobPersistence.NoValidDataException {
        return this.f57079c.getIntThrowable(str, i4);
    }

    public <T extends Parcelable> Map<String, T> b(String str, Class<T> cls) throws MobPersistence.NoValidDataException {
        return this.f57079c.getParcelMapThrowable(str, cls);
    }

    public Object b(String str, Object obj) throws MobPersistence.NoValidDataException {
        return this.f57079c.getThrowable(str, obj);
    }

    public void a(String str, String str2) {
        this.f57079c.putString(str, str2);
    }

    public void a(String str, String str2, long j4) {
        this.f57079c.putString(str, str2, j4);
    }

    public String a(String str) throws MobPersistence.NoValidDataException {
        return this.f57079c.getStringThrowable(str);
    }

    public void a(String str, Boolean bool) {
        this.f57079c.putBoolean(str, bool);
    }

    public void a(String str, Boolean bool, long j4) {
        this.f57079c.putBoolean(str, bool, j4);
    }

    public boolean a(String str, boolean z4) throws MobPersistence.NoValidDataException {
        return this.f57079c.getBooleanThrowable(str, z4);
    }

    public void a(String str, Long l4) {
        this.f57079c.putLong(str, l4);
    }

    public void a(String str, Long l4, long j4) {
        this.f57079c.putLong(str, l4, j4);
    }

    public long a(String str, long j4) throws MobPersistence.NoValidDataException {
        return this.f57079c.getLongThrowable(str, j4);
    }

    public void a(String str, Integer num) {
        this.f57079c.putInt(str, num);
    }

    public void a(String str, Integer num, long j4) {
        this.f57079c.putInt(str, num, j4);
    }

    public int a(String str, int i4) {
        return this.f57079c.getInt(str, i4);
    }

    public void a(String str, Double d5) {
        this.f57079c.putDouble(str, d5);
    }

    public void a(String str, Double d5, long j4) {
        this.f57079c.putDouble(str, d5, j4);
    }

    public double a(String str, double d5) throws MobPersistence.NoValidDataException {
        return this.f57079c.getDoubleThrowable(str, d5);
    }

    public void a(String str, Parcelable parcelable) {
        this.f57079c.putParcel(str, parcelable);
    }

    public void a(String str, Parcelable parcelable, long j4) {
        this.f57079c.putParcel(str, parcelable, j4);
    }

    public <T extends Parcelable> T a(String str, Class<T> cls) throws MobPersistence.NoValidDataException {
        return (T) this.f57079c.getParcelThrowable(str, cls);
    }

    public <T> T a(String str, Class<T> cls, T t4) throws MobPersistence.NoValidDataException {
        return (T) this.f57079c.getParcelThrowable(str, cls, t4);
    }

    public <T extends Parcelable> void a(String str, Map<String, T> map) {
        this.f57079c.putParcelMap(str, map);
    }

    public <T extends Parcelable> void a(String str, Map<String, T> map, long j4) {
        this.f57079c.putParcelMap(str, map, j4);
    }

    public <T extends Parcelable> Map<String, T> a(String str, Class<T> cls, Map<String, T> map) throws MobPersistence.NoValidDataException {
        return this.f57079c.getParcelMapThrowable(str, cls, map);
    }

    public <T extends Parcelable> void a(String str, List<T> list) {
        this.f57079c.putParcelList(str, list);
    }

    public <T extends Parcelable> void a(String str, List<T> list, long j4) {
        this.f57079c.putParcelList(str, list, j4);
    }

    public <T extends Parcelable> List<T> a(String str, Class<T> cls, List<T> list) throws MobPersistence.NoValidDataException {
        return this.f57079c.getParcelListThrowable(str, cls, list);
    }

    public <T extends Parcelable> void a(String str, T[] tArr) {
        this.f57079c.putParcelArray(str, tArr);
    }

    public <T extends Parcelable> void a(String str, T[] tArr, long j4) {
        this.f57079c.putParcelArray(str, tArr, j4);
    }

    public <T extends Parcelable> T[] a(String str, Class<T> cls, T[] tArr) throws MobPersistence.NoValidDataException {
        return (T[]) this.f57079c.getParcelArrayThrowable(str, cls, tArr);
    }

    public void a(String str, Object obj) {
        this.f57079c.put(str, obj);
    }

    public void a(String str, Object obj, long j4) {
        this.f57079c.put(str, obj, j4);
    }
}
