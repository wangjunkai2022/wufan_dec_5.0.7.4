package net.lingala.zip4j.crypto.engine;

import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import io.netty.handler.codec.http.HttpConstants;
import io.netty.handler.codec.memcache.binary.BinaryMemcacheOpcodes;
import io.netty.handler.codec.memcache.binary.DefaultBinaryMemcacheResponse;
import java.lang.reflect.Array;
import kotlin.jvm.internal.ByteCompanionObject;
import net.lingala.zip4j.exception.ZipException;
import okio.Utf8;
/* compiled from: AESEngine.java */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: g  reason: collision with root package name */
    private static final byte[] f71772g = {99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, 54, Utf8.REPLACEMENT_BYTE, -9, -52, 52, -91, -27, -15, 113, -40, 49, BinaryMemcacheOpcodes.INCREMENTQ, 4, -57, BinaryMemcacheOpcodes.GATK, -61, BinaryMemcacheOpcodes.FLUSHQ, -106, 5, -102, 7, BinaryMemcacheOpcodes.ADDQ, Byte.MIN_VALUE, -30, -21, 39, -78, 117, 9, -125, HttpConstants.COMMA, BinaryMemcacheOpcodes.PREPENDQ, 27, 110, 90, -96, 82, HttpConstants.SEMICOLON, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, ByteSourceJsonBootstrapper.UTF8_BOM_1, -86, -5, 67, 77, 51, -123, 69, -7, 2, ByteCompanionObject.MAX_VALUE, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, -68, -74, -38, BinaryMemcacheOpcodes.SASL_AUTH, 16, -1, -13, -46, -51, 12, BinaryMemcacheOpcodes.REPLACEQ, -20, 95, -105, 68, BinaryMemcacheOpcodes.QUITQ, -60, -89, 126, 61, 100, 93, BinaryMemcacheOpcodes.APPENDQ, 115, 96, DefaultBinaryMemcacheResponse.RESPONSE_MAGIC_BYTE, 79, -36, 34, 42, -112, -120, 70, -18, -72, BinaryMemcacheOpcodes.DELETEQ, -34, 94, 11, -37, -32, 50, HttpConstants.COLON, 10, 73, 6, BinaryMemcacheOpcodes.GATKQ, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, BinaryMemcacheOpcodes.TOUCH, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, BinaryMemcacheOpcodes.GAT, -98, -31, -8, -104, BinaryMemcacheOpcodes.SETQ, 105, -39, -114, -108, -101, BinaryMemcacheOpcodes.GATQ, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, ByteSourceJsonBootstrapper.UTF8_BOM_3, -26, 66, 104, 65, -103, 45, 15, -80, 84, ByteSourceJsonBootstrapper.UTF8_BOM_2, BinaryMemcacheOpcodes.DECREMENTQ};

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f71773h = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, 171, 77, 154, 47, 94, 188, 99, 198, 151, 53, 106, 212, 179, 125, 250, 239, 197, 145};

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f71774i = {-1520213050, -2072216328, -1720223762, -1921287178, 234025727, -1117033514, -1318096930, 1422247313, 1345335392, 50397442, -1452841010, 2099981142, 436141799, 1658312629, -424957107, -1703512340, 1170918031, -1652391393, 1086966153, -2021818886, 368769775, -346465870, -918075506, 200339707, -324162239, 1742001331, -39673249, -357585083, -1080255453, -140204973, -1770884380, 1539358875, -1028147339, 486407649, -1366060227, 1780885068, 1513502316, 1094664062, 49805301, 1338821763, 1546925160, -190470831, 887481809, 150073849, -1821281822, 1943591083, 1395732834, 1058346282, 201589768, 1388824469, 1696801606, 1589887901, 672667696, -1583966665, 251987210, -1248159185, 151455502, 907153956, -1686077413, 1038279391, 652995533, 1764173646, -843926913, -1619692054, 453576978, -1635548387, 1949051992, 773462580, 756751158, -1301385508, -296068428, -73359269, -162377052, 1295727478, 1641469623, -827083907, 2066295122, 1055122397, 1898917726, -1752923117, -179088474, 1758581177, 0, 753790401, 1612718144, 536673507, -927878791, -312779850, -1100322092, 1187761037, -641810841, 1262041458, -565556588, -733197160, -396863312, 1255133061, 1808847035, 720367557, -441800113, 385612781, -985447546, -682799718, 1429418854, -1803188975, -817543798, 284817897, 100794884, -2122350594, -263171936, 1144798328, -1163944155, -475486133, -212774494, -22830243, -1069531008, -1970303227, -1382903233, -1130521311, 1211644016, 83228145, -541279133, -1044990345, 1977277103, 1663115586, 806359072, 452984805, 250868733, 1842533055, 1288555905, 336333848, 890442534, 804056259, -513843266, -1567123659, -867941240, 957814574, 1472513171, -223893675, -2105639172, 1195195770, -1402706744, -413311558, 723065138, -1787595802, -1604296512, -1736343271, -783331426, 2145180835, 1713513028, 2116692564, -1416589253, -2088204277, -901364084, 703524551, -742868885, 1007948840, 2044649127, -497131844, 487262998, 1994120109, 1004593371, 1446130276, 1312438900, 503974420, -615954030, 168166924, 1814307912, -463709000, 1573044895, 1859376061, -273896381, -1503501628, -1466855111, -1533700815, 937747667, -1954973198, 854058965, 1137232011, 1496790894, -1217565222, -1936880383, 1691735473, -766620004, -525751991, -1267962664, -95005012, 133494003, 636152527, -1352309302, -1904575756, -374428089, 403179536, -709182865, -2005370640, 1864705354, 1915629148, 605822008, -240736681, -944458637, 1371981463, 602466507, 2094914977, -1670089496, 555687742, -582268010, -591544991, -2037675251, -2054518257, -1871679264, 1111375484, -994724495, -1436129588, -666351472, 84083462, 32962295, 302911004, -1553899070, 1597322602, -111716434, -793134743, -1853454825, 1489093017, 656219450, -1180787161, 954327513, 335083755, -1281845205, 856756514, -1150719534, 1893325225, -1987146233, -1483434957, -1231316179, 572399164, -1836611819, 552200649, 1238290055, -11184726, 2015897680, 2061492133, -1886614525, -123625127, -2138470135, 386731290, -624967835, 837215959, -968736124, -1201116976, -1019133566, -1332111063, 1999449434, 286199582, -877612933, -61582168, -692339859, 974525996};

    /* renamed from: a  reason: collision with root package name */
    private int f71775a;

    /* renamed from: b  reason: collision with root package name */
    private int[][] f71776b = null;

    /* renamed from: c  reason: collision with root package name */
    private int f71777c;

    /* renamed from: d  reason: collision with root package name */
    private int f71778d;

    /* renamed from: e  reason: collision with root package name */
    private int f71779e;

    /* renamed from: f  reason: collision with root package name */
    private int f71780f;

    public a(byte[] bArr) throws ZipException {
        c(bArr);
    }

    private final void a(int[][] iArr) {
        this.f71777c ^= iArr[0][0];
        this.f71778d ^= iArr[0][1];
        this.f71779e ^= iArr[0][2];
        this.f71780f ^= iArr[0][3];
        int i4 = 1;
        while (i4 < this.f71775a - 1) {
            int[] iArr2 = f71774i;
            int f5 = (((iArr2[this.f71777c & 255] ^ f(iArr2[(this.f71778d >> 8) & 255], 24)) ^ f(iArr2[(this.f71779e >> 16) & 255], 16)) ^ f(iArr2[(this.f71780f >> 24) & 255], 8)) ^ iArr[i4][0];
            int f6 = (((iArr2[this.f71778d & 255] ^ f(iArr2[(this.f71779e >> 8) & 255], 24)) ^ f(iArr2[(this.f71780f >> 16) & 255], 16)) ^ f(iArr2[(this.f71777c >> 24) & 255], 8)) ^ iArr[i4][1];
            int f7 = (((iArr2[this.f71779e & 255] ^ f(iArr2[(this.f71780f >> 8) & 255], 24)) ^ f(iArr2[(this.f71777c >> 16) & 255], 16)) ^ f(iArr2[(this.f71778d >> 24) & 255], 8)) ^ iArr[i4][2];
            int i5 = i4 + 1;
            int f8 = iArr[i4][3] ^ (((iArr2[this.f71780f & 255] ^ f(iArr2[(this.f71777c >> 8) & 255], 24)) ^ f(iArr2[(this.f71778d >> 16) & 255], 16)) ^ f(iArr2[(this.f71779e >> 24) & 255], 8));
            this.f71777c = (((iArr2[f5 & 255] ^ f(iArr2[(f6 >> 8) & 255], 24)) ^ f(iArr2[(f7 >> 16) & 255], 16)) ^ f(iArr2[(f8 >> 24) & 255], 8)) ^ iArr[i5][0];
            this.f71778d = (((iArr2[f6 & 255] ^ f(iArr2[(f7 >> 8) & 255], 24)) ^ f(iArr2[(f8 >> 16) & 255], 16)) ^ f(iArr2[(f5 >> 24) & 255], 8)) ^ iArr[i5][1];
            this.f71779e = (((iArr2[f7 & 255] ^ f(iArr2[(f8 >> 8) & 255], 24)) ^ f(iArr2[(f5 >> 16) & 255], 16)) ^ f(iArr2[(f6 >> 24) & 255], 8)) ^ iArr[i5][2];
            this.f71780f = (((iArr2[f8 & 255] ^ f(iArr2[(f5 >> 8) & 255], 24)) ^ f(iArr2[(f6 >> 16) & 255], 16)) ^ f(iArr2[(f7 >> 24) & 255], 8)) ^ iArr[i5][3];
            i4 = i5 + 1;
        }
        int[] iArr3 = f71774i;
        int f9 = (((iArr3[this.f71777c & 255] ^ f(iArr3[(this.f71778d >> 8) & 255], 24)) ^ f(iArr3[(this.f71779e >> 16) & 255], 16)) ^ f(iArr3[(this.f71780f >> 24) & 255], 8)) ^ iArr[i4][0];
        int f10 = (((iArr3[this.f71778d & 255] ^ f(iArr3[(this.f71779e >> 8) & 255], 24)) ^ f(iArr3[(this.f71780f >> 16) & 255], 16)) ^ f(iArr3[(this.f71777c >> 24) & 255], 8)) ^ iArr[i4][1];
        int f11 = (((iArr3[this.f71779e & 255] ^ f(iArr3[(this.f71780f >> 8) & 255], 24)) ^ f(iArr3[(this.f71777c >> 16) & 255], 16)) ^ f(iArr3[(this.f71778d >> 24) & 255], 8)) ^ iArr[i4][2];
        int i6 = i4 + 1;
        int f12 = iArr[i4][3] ^ (f(iArr3[(this.f71779e >> 24) & 255], 8) ^ ((iArr3[this.f71780f & 255] ^ f(iArr3[(this.f71777c >> 8) & 255], 24)) ^ f(iArr3[(this.f71778d >> 16) & 255], 16)));
        byte[] bArr = f71772g;
        this.f71777c = iArr[i6][0] ^ ((((bArr[f9 & 255] & 255) ^ ((bArr[(f10 >> 8) & 255] & 255) << 8)) ^ ((bArr[(f11 >> 16) & 255] & 255) << 16)) ^ (bArr[(f12 >> 24) & 255] << BinaryMemcacheOpcodes.FLUSHQ));
        this.f71778d = ((((bArr[f10 & 255] & 255) ^ ((bArr[(f11 >> 8) & 255] & 255) << 8)) ^ ((bArr[(f12 >> 16) & 255] & 255) << 16)) ^ (bArr[(f9 >> 24) & 255] << BinaryMemcacheOpcodes.FLUSHQ)) ^ iArr[i6][1];
        this.f71779e = ((((bArr[f11 & 255] & 255) ^ ((bArr[(f12 >> 8) & 255] & 255) << 8)) ^ ((bArr[(f9 >> 16) & 255] & 255) << 16)) ^ (bArr[(f10 >> 24) & 255] << BinaryMemcacheOpcodes.FLUSHQ)) ^ iArr[i6][2];
        this.f71780f = ((((bArr[f12 & 255] & 255) ^ ((bArr[(f9 >> 8) & 255] & 255) << 8)) ^ ((bArr[(f10 >> 16) & 255] & 255) << 16)) ^ (bArr[(f11 >> 24) & 255] << BinaryMemcacheOpcodes.FLUSHQ)) ^ iArr[i6][3];
    }

    private int[][] b(byte[] bArr) throws ZipException {
        int length = bArr.length / 4;
        if ((length == 4 || length == 6 || length == 8) && length * 4 == bArr.length) {
            int i4 = length + 6;
            this.f71775a = i4;
            int i5 = 0;
            int[][] iArr = (int[][]) Array.newInstance(int.class, i4 + 1, 4);
            int i6 = 0;
            while (i5 < bArr.length) {
                iArr[i6 >> 2][i6 & 3] = (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | (bArr[i5 + 3] << BinaryMemcacheOpcodes.FLUSHQ);
                i5 += 4;
                i6++;
            }
            int i7 = (this.f71775a + 1) << 2;
            for (int i8 = length; i8 < i7; i8++) {
                int i9 = i8 - 1;
                int i10 = iArr[i9 >> 2][i9 & 3];
                int i11 = i8 % length;
                if (i11 == 0) {
                    i10 = i(f(i10, 8)) ^ f71773h[(i8 / length) - 1];
                } else if (length > 6 && i11 == 4) {
                    i10 = i(i10);
                }
                int i12 = i8 - length;
                iArr[i8 >> 2][i8 & 3] = i10 ^ iArr[i12 >> 2][i12 & 3];
            }
            return iArr;
        }
        throw new ZipException("invalid key length (not 128/192/256)");
    }

    private int f(int i4, int i5) {
        return (i4 << (-i5)) | (i4 >>> i5);
    }

    private final void g(byte[] bArr, int i4) {
        int i5 = i4 + 1;
        int i6 = bArr[i4] & 255;
        this.f71777c = i6;
        int i7 = i5 + 1;
        int i8 = i6 | ((bArr[i5] & 255) << 8);
        this.f71777c = i8;
        int i9 = i7 + 1;
        int i10 = i8 | ((bArr[i7] & 255) << 16);
        this.f71777c = i10;
        int i11 = i9 + 1;
        this.f71777c = i10 | (bArr[i9] << BinaryMemcacheOpcodes.FLUSHQ);
        int i12 = i11 + 1;
        int i13 = bArr[i11] & 255;
        this.f71778d = i13;
        int i14 = i12 + 1;
        int i15 = ((bArr[i12] & 255) << 8) | i13;
        this.f71778d = i15;
        int i16 = i14 + 1;
        int i17 = i15 | ((bArr[i14] & 255) << 16);
        this.f71778d = i17;
        int i18 = i16 + 1;
        this.f71778d = i17 | (bArr[i16] << BinaryMemcacheOpcodes.FLUSHQ);
        int i19 = i18 + 1;
        int i20 = bArr[i18] & 255;
        this.f71779e = i20;
        int i21 = i19 + 1;
        int i22 = ((bArr[i19] & 255) << 8) | i20;
        this.f71779e = i22;
        int i23 = i21 + 1;
        int i24 = i22 | ((bArr[i21] & 255) << 16);
        this.f71779e = i24;
        int i25 = i23 + 1;
        this.f71779e = i24 | (bArr[i23] << BinaryMemcacheOpcodes.FLUSHQ);
        int i26 = i25 + 1;
        int i27 = bArr[i25] & 255;
        this.f71780f = i27;
        int i28 = i26 + 1;
        int i29 = ((bArr[i26] & 255) << 8) | i27;
        this.f71780f = i29;
        int i30 = i29 | ((bArr[i28] & 255) << 16);
        this.f71780f = i30;
        this.f71780f = (bArr[i28 + 1] << BinaryMemcacheOpcodes.FLUSHQ) | i30;
    }

    private final void h(byte[] bArr, int i4) {
        int i5 = i4 + 1;
        int i6 = this.f71777c;
        bArr[i4] = (byte) i6;
        int i7 = i5 + 1;
        bArr[i5] = (byte) (i6 >> 8);
        int i8 = i7 + 1;
        bArr[i7] = (byte) (i6 >> 16);
        int i9 = i8 + 1;
        bArr[i8] = (byte) (i6 >> 24);
        int i10 = i9 + 1;
        int i11 = this.f71778d;
        bArr[i9] = (byte) i11;
        int i12 = i10 + 1;
        bArr[i10] = (byte) (i11 >> 8);
        int i13 = i12 + 1;
        bArr[i12] = (byte) (i11 >> 16);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (i11 >> 24);
        int i15 = i14 + 1;
        int i16 = this.f71779e;
        bArr[i14] = (byte) i16;
        int i17 = i15 + 1;
        bArr[i15] = (byte) (i16 >> 8);
        int i18 = i17 + 1;
        bArr[i17] = (byte) (i16 >> 16);
        int i19 = i18 + 1;
        bArr[i18] = (byte) (i16 >> 24);
        int i20 = i19 + 1;
        int i21 = this.f71780f;
        bArr[i19] = (byte) i21;
        int i22 = i20 + 1;
        bArr[i20] = (byte) (i21 >> 8);
        bArr[i22] = (byte) (i21 >> 16);
        bArr[i22 + 1] = (byte) (i21 >> 24);
    }

    private int i(int i4) {
        byte[] bArr = f71772g;
        return (bArr[(i4 >> 24) & 255] << BinaryMemcacheOpcodes.FLUSHQ) | (bArr[i4 & 255] & 255) | ((bArr[(i4 >> 8) & 255] & 255) << 8) | ((bArr[(i4 >> 16) & 255] & 255) << 16);
    }

    public void c(byte[] bArr) throws ZipException {
        this.f71776b = b(bArr);
    }

    public int d(byte[] bArr, int i4, byte[] bArr2, int i5) throws ZipException {
        if (this.f71776b != null) {
            if (i4 + 16 <= bArr.length) {
                if (i5 + 16 <= bArr2.length) {
                    g(bArr, i4);
                    a(this.f71776b);
                    h(bArr2, i5);
                    return 16;
                }
                throw new ZipException("output buffer too short");
            }
            throw new ZipException("input buffer too short");
        }
        throw new ZipException("AES engine not initialised");
    }

    public int e(byte[] bArr, byte[] bArr2) throws ZipException {
        return d(bArr, 0, bArr2, 0);
    }
}
