package kotlin.ranges;
/* loaded from: classes6.dex */
public final /* synthetic */ class a {
    public static /* synthetic */ int a(double d5) {
        long doubleToLongBits = Double.doubleToLongBits(d5);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }
}
