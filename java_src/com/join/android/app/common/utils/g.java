package com.join.android.app.common.utils;

import com.kuaishou.weapon.p0.bi;
import com.kwad.sdk.core.response.model.SdkConfigData;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/* compiled from: DateUtils.java */
/* loaded from: classes3.dex */
public class g {
    public static String a(long j4) {
        long currentTimeMillis = System.currentTimeMillis() - j4;
        if (currentTimeMillis < 60000) {
            return "刚刚";
        }
        if (currentTimeMillis < bi.f55326s) {
            return (currentTimeMillis / 60000) + "分钟前";
        } else if (currentTimeMillis < 86400000) {
            return (currentTimeMillis / bi.f55326s) + "小时前";
        } else if (currentTimeMillis < 2592000000L) {
            return (currentTimeMillis / 86400000) + "天前";
        } else if (currentTimeMillis < 31104000000L) {
            return (currentTimeMillis / 2592000000L) + "月前";
        } else {
            return (currentTimeMillis / 31104000000L) + "年前";
        }
    }

    public static String b(long j4) {
        long currentTimeMillis = System.currentTimeMillis() - j4;
        if (currentTimeMillis < 60000) {
            return "刚刚";
        }
        if (currentTimeMillis < bi.f55326s) {
            return (currentTimeMillis / 60000) + "分钟前";
        } else if (currentTimeMillis < 86400000) {
            return (currentTimeMillis / bi.f55326s) + "小时前";
        } else if (currentTimeMillis < 2592000000L) {
            return (currentTimeMillis / 86400000) + "天前";
        } else if (currentTimeMillis < 31104000000L) {
            return (currentTimeMillis / 2592000000L) + "月前";
        } else {
            return (currentTimeMillis / 31104000000L) + "年前";
        }
    }

    public static String c(long j4) {
        long currentTimeMillis = System.currentTimeMillis();
        long j5 = j4 - currentTimeMillis;
        if (g(j4)) {
            return "今天";
        }
        if (j5 >= 0) {
            if (j5 < bi.f55326s) {
                return "今天";
            }
            if (j5 < 86400000) {
                return "明天";
            }
            if (j5 < 2592000000L) {
                return (j5 / 86400000) + "天后";
            } else if (j5 < 31104000000L) {
                return (j5 / 2592000000L) + "月后";
            } else {
                return (j5 / 31104000000L) + "年后";
            }
        }
        long j6 = currentTimeMillis - j4;
        if (j6 >= 60000 && j6 >= bi.f55326s) {
            if (j6 < 86400000) {
                return "昨天";
            }
            if (j6 < 2592000000L) {
                return (j6 / 86400000) + "天前";
            } else if (j6 < 31104000000L) {
                return (j6 / 2592000000L) + "月前";
            } else {
                return (j6 / 31104000000L) + "年前";
            }
        }
        return "今天";
    }

    public static String d(long j4) {
        long currentTimeMillis = j4 - System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            return "已开服";
        }
        if (currentTimeMillis < bi.f55326s) {
            return (currentTimeMillis / 60000) + "天";
        } else if (currentTimeMillis < 86400000) {
            return (currentTimeMillis / bi.f55326s) + "天";
        } else if (currentTimeMillis < 2592000000L) {
            return (currentTimeMillis / 86400000) + "天";
        } else if (currentTimeMillis < 31104000000L) {
            return (currentTimeMillis / 2592000000L) + "月";
        } else {
            return (currentTimeMillis / 31104000000L) + "年";
        }
    }

    public static String e(long j4) {
        int i4 = (int) (j4 / 1000);
        int i5 = i4 % 60;
        int i6 = (i4 / 60) % 60;
        int i7 = i4 / SdkConfigData.DEFAULT_REQUEST_INTERVAL;
        return i7 > 0 ? String.format("%02d:%02d:%02d", Integer.valueOf(i7), Integer.valueOf(i6), Integer.valueOf(i5)) : String.format("%02d:%02d", Integer.valueOf(i6), Integer.valueOf(i5));
    }

    public static String f(long j4) {
        Date date = new Date(j4);
        String[] strArr = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i4 = calendar.get(7) - 1;
        if (i4 < 0) {
            i4 = 0;
        }
        return strArr[i4];
    }

    public static boolean g(long j4) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j4);
        int i4 = calendar.get(1);
        int i5 = calendar.get(2);
        int i6 = calendar.get(5);
        calendar.setTimeInMillis(System.currentTimeMillis());
        return i4 == calendar.get(1) && i5 == calendar.get(2) && i6 == calendar.get(5);
    }

    public static String h(String str, Long l4) {
        return new SimpleDateFormat(str).format(new Date(l4.longValue()));
    }
}
