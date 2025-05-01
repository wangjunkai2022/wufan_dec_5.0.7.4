package cn.sharesdk.onekeyshare.themes.classic.land;

import android.content.Context;
import cn.sharesdk.onekeyshare.themes.classic.PlatformPage;
import cn.sharesdk.onekeyshare.themes.classic.PlatformPageAdapter;
import com.mob.tools.utils.ResHelper;
import java.lang.reflect.Array;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class PlatformPageAdapterLand extends PlatformPageAdapter {
    private static final int DESIGN_CELL_WIDTH_L = 160;
    private static final int DESIGN_LOGO_HEIGHT = 76;
    private static final int DESIGN_PADDING_TOP = 20;
    private static final int DESIGN_SCREEN_WIDTH_L = 1280;
    private static final int DESIGN_SEP_LINE_WIDTH = 1;

    public PlatformPageAdapterLand(PlatformPage platformPage, ArrayList<Object> arrayList) {
        super(platformPage, arrayList);
    }

    @Override // cn.sharesdk.onekeyshare.themes.classic.PlatformPageAdapter
    protected void calculateSize(Context context, ArrayList<Object> arrayList) {
        int screenWidth = ResHelper.getScreenWidth(context);
        float f5 = screenWidth / 1280.0f;
        int i4 = screenWidth / ((int) (160.0f * f5));
        this.lineSize = i4;
        int i5 = (int) (1.0f * f5);
        this.sepLineWidth = i5;
        if (i5 < 1) {
            i5 = 1;
        }
        this.sepLineWidth = i5;
        this.logoHeight = (int) (76.0f * f5);
        this.paddingTop = (int) (20.0f * f5);
        this.bottomHeight = (int) (f5 * 52.0f);
        int i6 = (screenWidth - (i5 * 3)) / (i4 - 1);
        this.cellHeight = i6;
        this.panelHeight = i6 + i5;
    }

    @Override // cn.sharesdk.onekeyshare.themes.classic.PlatformPageAdapter
    protected void collectCells(ArrayList<Object> arrayList) {
        int size = arrayList.size();
        int i4 = this.lineSize;
        if (size < i4) {
            int i5 = size / i4;
            if (size % i4 != 0) {
                i5++;
            }
            this.cells = (Object[][]) Array.newInstance(Object.class, 1, i5 * i4);
        } else {
            int i6 = size / i4;
            if (size % i4 != 0) {
                i6++;
            }
            this.cells = (Object[][]) Array.newInstance(Object.class, i6, i4);
        }
        for (int i7 = 0; i7 < size; i7++) {
            int i8 = this.lineSize;
            int i9 = i7 / i8;
            this.cells[i9][i7 - (i8 * i9)] = arrayList.get(i7);
        }
    }
}
