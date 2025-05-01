package com.join.mgps.customview.wheel.picker.util;

import androidx.annotation.NonNull;
import com.facebook.common.statfs.StatFsHelper;
import com.join.mgps.Util.v;
import com.kuaishou.weapon.p0.bi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
/* loaded from: classes4.dex */
public class DateUtils extends android.text.format.DateUtils {

    /* renamed from: a  reason: collision with root package name */
    public static final int f48911a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f48912b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f48913c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final int f48914d = 3;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface DifferenceMode {
    }

    public static int a(int i4) {
        return b(0, i4);
    }

    public static int b(int i4, int i5) {
        List asList = Arrays.asList("1", "3", "5", "7", "8", v.f28122v, "12");
        List asList2 = Arrays.asList("4", "6", "9", "11");
        if (asList.contains(String.valueOf(i5))) {
            return 31;
        }
        if (asList2.contains(String.valueOf(i5))) {
            return 30;
        }
        if (i4 <= 0) {
            return 29;
        }
        return ((i4 % 4 != 0 || i4 % 100 == 0) && i4 % StatFsHelper.f10899h != 0) ? 28 : 29;
    }

    public static long c(long j4, long j5, int i4) {
        return d(new Date(j4), new Date(j5), i4);
    }

    public static long d(Date date, Date date2, int i4) {
        long[] f5 = f(date, date2);
        if (i4 == 1) {
            return f5[2];
        }
        if (i4 == 2) {
            return f5[1];
        }
        if (i4 == 3) {
            return f5[0];
        }
        return f5[3];
    }

    private static long[] e(long j4) {
        long j5 = j4 / 86400000;
        long j6 = j4 % 86400000;
        long j7 = j6 / bi.f55326s;
        long j8 = j6 % bi.f55326s;
        return new long[]{j5, j7, j8 / 60000, (j8 % 60000) / 1000};
    }

    private static long[] f(Date date, Date date2) {
        return e(date2.getTime() - date.getTime());
    }

    public static long g(long j4, long j5) {
        return c(j4, j5, 3);
    }

    public static long h(Date date, Date date2) {
        return d(date, date2, 3);
    }

    public static long i(long j4, long j5) {
        return c(j4, j5, 2);
    }

    public static long j(Date date, Date date2) {
        return d(date, date2, 2);
    }

    public static long k(long j4, long j5) {
        return c(j4, j5, 1);
    }

    public static long l(Date date, Date date2) {
        return d(date, date2, 1);
    }

    public static long m(long j4, long j5) {
        return c(j4, j5, 0);
    }

    public static long n(Date date, Date date2) {
        return d(date, date2, 0);
    }

    @NonNull
    public static String o(int i4) {
        StringBuilder sb;
        String str;
        if (i4 < 10) {
            sb = new StringBuilder();
            str = "0";
        } else {
            sb = new StringBuilder();
            str = "";
        }
        sb.append(str);
        sb.append(i4);
        return sb.toString();
    }

    public static String p(String str) {
        return q(Calendar.getInstance(Locale.CHINA).getTime(), str);
    }

    public static String q(Date date, String str) {
        return new SimpleDateFormat(str, Locale.PRC).format(date);
    }

    public static boolean r(Date date) {
        if (date != null) {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(date);
            return calendar.get(0) == calendar2.get(0) && calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
        }
        throw new IllegalArgumentException("date is null");
    }

    public static Date s(String str) {
        return t(str, "yyyy-MM-dd HH:mm:ss");
    }

    public static Date t(String str, String str2) {
        try {
            return new Date(new SimpleDateFormat(str2, Locale.PRC).parse(str).getTime());
        } catch (ParseException unused) {
            return null;
        }
    }

    public static int u(@NonNull String str) {
        try {
            if (str.startsWith("0")) {
                str = str.substring(1);
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }
}
