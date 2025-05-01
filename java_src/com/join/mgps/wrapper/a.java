package com.join.mgps.wrapper;

import android.annotation.TargetApi;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.hardware.usb.UsbDevice;
import android.os.Build;
import android.os.Environment;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.join.mgps.Util.h0;
import java.io.File;
/* compiled from: Wrapper.java */
/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static int f55009a = Build.VERSION.SDK_INT;

    /* renamed from: b  reason: collision with root package name */
    public static final int f55010b = Integer.parseInt(Build.VERSION.SDK);

    /* compiled from: Wrapper.java */
    /* renamed from: com.join.mgps.wrapper.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0392a {
        public static boolean a() {
            return a.f55009a >= 11 && b();
        }

        public static boolean b() {
            return BluetoothAdapter.getDefaultAdapter() != null;
        }
    }

    /* compiled from: Wrapper.java */
    /* loaded from: classes5.dex */
    public static class b {
        public static String a(UsbDevice usbDevice) {
            return d(usbDevice) + c(usbDevice);
        }

        public static String b(UsbDevice usbDevice) {
            return "OTG手柄";
        }

        @TargetApi(12)
        public static String c(UsbDevice usbDevice) {
            if (a.f55009a >= 12) {
                return "0x" + Integer.toHexString(c.a(usbDevice));
            }
            return "0x0000";
        }

        @TargetApi(12)
        public static String d(UsbDevice usbDevice) {
            if (a.f55009a >= 12) {
                return "0x" + Integer.toHexString(c.b(usbDevice));
            }
            return "0x0000";
        }

        public static boolean e() {
            return a.f55009a >= 12;
        }
    }

    public static final void a(Activity activity) {
        if (f55010b >= 11) {
            com.join.mgps.wrapper.b.a(activity);
        }
    }

    public static final void b(Activity activity) {
        e.a(activity);
    }

    public static final boolean c(KeyEvent keyEvent) {
        if (f55010b >= 5) {
            return e.b(keyEvent);
        }
        return false;
    }

    public static final void d(MenuItem menuItem, boolean z4) {
        if (f55010b >= 11) {
            com.join.mgps.wrapper.b.b(menuItem, z4);
        }
    }

    public static final int e(MotionEvent motionEvent, int i4) {
        return f55010b >= 5 ? e.c(motionEvent, i4) : i4 == 0 ? 0 : -1;
    }

    public static final int f(MotionEvent motionEvent) {
        if (f55010b >= 5) {
            return e.d(motionEvent);
        }
        return 1;
    }

    public static final int g(MotionEvent motionEvent, int i4) {
        if (f55010b >= 5) {
            return e.e(motionEvent, i4);
        }
        return 0;
    }

    public static final float h(MotionEvent motionEvent, int i4) {
        return f55010b >= 5 ? e.f(motionEvent, i4) : motionEvent.getSize();
    }

    public static final float i(MotionEvent motionEvent, int i4) {
        return f55010b >= 5 ? e.g(motionEvent, i4) : motionEvent.getX();
    }

    public static final float j(MotionEvent motionEvent, int i4) {
        return f55010b >= 5 ? e.h(motionEvent, i4) : motionEvent.getY();
    }

    public static void k(Activity activity) {
        if (f55010b >= 14) {
            d.b(activity);
        }
    }

    public static void l(Activity activity) {
        if (f55010b >= 11) {
            com.join.mgps.wrapper.b.d(activity);
        }
    }

    public static void m(Activity activity) {
        if (f55010b >= 11) {
            com.join.mgps.wrapper.b.e(activity);
        }
    }

    public static final File n() {
        File file;
        if (f55010b >= 8) {
            file = f.a();
        } else {
            file = new File(Environment.getExternalStorageDirectory(), "pictures");
        }
        return new File(file, "screenshots");
    }

    public static boolean o() {
        if (f55010b >= 5) {
            return e.i();
        }
        return false;
    }

    public static boolean p() {
        if (f55010b >= 5) {
            return e.j();
        }
        return false;
    }

    public static boolean q() {
        if (f55010b >= 5) {
            return e.k();
        }
        return false;
    }

    public static final boolean r(Context context) {
        int i4 = f55010b;
        if (i4 < 5 || (i4 >= 11 && i4 <= 13)) {
            return false;
        }
        if (i4 >= 14) {
            return d.a(ViewConfiguration.get(context));
        }
        return true;
    }

    public static final String s(Context context, int i4) {
        if (i4 != 0) {
            if (i4 != 27) {
                if (i4 != 62) {
                    if (i4 != 77) {
                        if (i4 != 80) {
                            if (i4 != 82) {
                                if (i4 != 84) {
                                    if (i4 != 102) {
                                        if (i4 != 104) {
                                            if (i4 != 3) {
                                                if (i4 != 4) {
                                                    if (i4 != 5) {
                                                        if (i4 != 66) {
                                                            if (i4 != 67) {
                                                                if (i4 != 108) {
                                                                    if (i4 != 109) {
                                                                        switch (i4) {
                                                                            case 7:
                                                                                return "0";
                                                                            case 8:
                                                                                return "1";
                                                                            case 9:
                                                                                return "2";
                                                                            case 10:
                                                                                return "3";
                                                                            case 11:
                                                                                return "4";
                                                                            case 12:
                                                                                return "5";
                                                                            case 13:
                                                                                return "6";
                                                                            case 14:
                                                                                return "7";
                                                                            case 15:
                                                                                return "8";
                                                                            case 16:
                                                                                return "9";
                                                                            default:
                                                                                switch (i4) {
                                                                                    case 19:
                                                                                        return "DPAD Up";
                                                                                    case 20:
                                                                                        return "DPAD Down";
                                                                                    case 21:
                                                                                        return "DPAD Left";
                                                                                    case 22:
                                                                                        return "DPAD Right";
                                                                                    case 23:
                                                                                        return "DPAD Center";
                                                                                    case 24:
                                                                                        return "Volume UP";
                                                                                    case 25:
                                                                                        return "Volume DOWN";
                                                                                    default:
                                                                                        switch (i4) {
                                                                                            case 29:
                                                                                                return "A";
                                                                                            case 30:
                                                                                                return "B";
                                                                                            case 31:
                                                                                                return "C";
                                                                                            case 32:
                                                                                                return "D";
                                                                                            case 33:
                                                                                                return "E";
                                                                                            case 34:
                                                                                                return "F";
                                                                                            case 35:
                                                                                                return "G";
                                                                                            case 36:
                                                                                                return "H";
                                                                                            case 37:
                                                                                                return "I";
                                                                                            case 38:
                                                                                                return "J";
                                                                                            case 39:
                                                                                                return "K";
                                                                                            case 40:
                                                                                                return "L";
                                                                                            case 41:
                                                                                                return "M";
                                                                                            case 42:
                                                                                                return "N";
                                                                                            case 43:
                                                                                                return "O";
                                                                                            case 44:
                                                                                                return "P";
                                                                                            case 45:
                                                                                                return "Q";
                                                                                            case 46:
                                                                                                return "R";
                                                                                            case 47:
                                                                                                return "S";
                                                                                            case 48:
                                                                                                return "T";
                                                                                            case 49:
                                                                                                return "U";
                                                                                            case 50:
                                                                                                return "V";
                                                                                            case 51:
                                                                                                return "W";
                                                                                            case 52:
                                                                                                return "X";
                                                                                            case 53:
                                                                                                return "Y";
                                                                                            case 54:
                                                                                                return "Z";
                                                                                            case 55:
                                                                                                return ",";
                                                                                            case 56:
                                                                                                return h0.f27805a;
                                                                                            case 57:
                                                                                                return "ALT (left)";
                                                                                            case 58:
                                                                                                return "ALT (right)";
                                                                                            case 59:
                                                                                                return "SHIFT (left)";
                                                                                            case 60:
                                                                                                return "SHIFT (right)";
                                                                                            default:
                                                                                                if (f55010b >= 12) {
                                                                                                    return c.c(i4).replaceFirst("KEYCODE_", "").replace('_', ' ');
                                                                                                }
                                                                                                return "??? (№" + String.valueOf(i4) + ')';
                                                                                        }
                                                                                }
                                                                        }
                                                                    }
                                                                    return "Select";
                                                                }
                                                                return "Start";
                                                            }
                                                            return "DEL";
                                                        }
                                                        return "ENTER";
                                                    }
                                                    return "CALL";
                                                }
                                                return "BACK";
                                            }
                                            return "HOME";
                                        }
                                        return "Right trigger";
                                    }
                                    return "Left trigger";
                                }
                                return "SEARCH";
                            }
                            return "MENU";
                        }
                        return "FOCUS";
                    }
                    return "@";
                }
                return "SPACE";
            }
            return "CAMERA";
        }
        return "-";
    }

    public static boolean t(Context context) {
        if (f55010b >= 5) {
            return e.l(context);
        }
        return false;
    }
}
