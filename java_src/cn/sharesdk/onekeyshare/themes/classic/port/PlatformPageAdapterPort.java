package cn.sharesdk.onekeyshare.themes.classic.port;

import android.content.Context;
import cn.sharesdk.onekeyshare.themes.classic.PlatformPage;
import cn.sharesdk.onekeyshare.themes.classic.PlatformPageAdapter;
import com.mob.tools.utils.ResHelper;
import java.lang.reflect.Array;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class PlatformPageAdapterPort extends PlatformPageAdapter {
    private static final int DESIGN_LOGO_HEIGHT = 76;
    private static final int DESIGN_PADDING_TOP = 20;
    private static final int DESIGN_SCREEN_WIDTH_P = 720;
    private static final int DESIGN_SEP_LINE_WIDTH = 1;
    private static final int LINE_SIZE_P = 4;
    private static final int PAGE_SIZE_P = 12;

    public PlatformPageAdapterPort(PlatformPage platformPage, ArrayList<Object> arrayList) {
        super(platformPage, arrayList);
    }

    @Override // cn.sharesdk.onekeyshare.themes.classic.PlatformPageAdapter
    protected void calculateSize(Context context, ArrayList<Object> arrayList) {
        int screenWidth = ResHelper.getScreenWidth(context);
        this.lineSize = 4;
        float f5 = screenWidth / 720.0f;
        int i4 = (int) (1.0f * f5);
        this.sepLineWidth = i4;
        if (i4 < 1) {
            i4 = 1;
        }
        this.sepLineWidth = i4;
        this.logoHeight = (int) (76.0f * f5);
        this.paddingTop = (int) (20.0f * f5);
        this.bottomHeight = (int) (f5 * 52.0f);
        this.cellHeight = (screenWidth - (i4 * 3)) / 4;
        if (arrayList.size() <= this.lineSize) {
            this.panelHeight = this.cellHeight + this.sepLineWidth;
        } else if (arrayList.size() <= 12 - this.lineSize) {
            this.panelHeight = (this.cellHeight + this.sepLineWidth) * 2;
        } else {
            this.panelHeight = (this.cellHeight + this.sepLineWidth) * 3;
        }
    }

    @Override // cn.sharesdk.onekeyshare.themes.classic.PlatformPageAdapter
    protected void collectCells(ArrayList<Object> arrayList) {
        int size = arrayList.size();
        if (size < 12) {
            int i4 = this.lineSize;
            int i5 = size / i4;
            if (size % i4 != 0) {
                i5++;
            }
            this.cells = (Object[][]) Array.newInstance(Object.class, 1, i5 * i4);
        } else {
            int i6 = size / 12;
            if (size % 12 != 0) {
                i6++;
            }
            this.cells = (Object[][]) Array.newInstance(Object.class, i6, 12);
        }
        for (int i7 = 0; i7 < size; i7++) {
            int i8 = i7 / 12;
            this.cells[i8][i7 - (i8 * 12)] = arrayList.get(i7);
        }
    }
}
