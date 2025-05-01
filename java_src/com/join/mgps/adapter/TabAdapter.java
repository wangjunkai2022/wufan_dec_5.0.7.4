package com.join.mgps.adapter;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.MApplication;
import com.join.mgps.fragment.GameOlFirstFragment_;
import com.join.mgps.fragment.GameOlGiftPackageFragment_;
import com.join.mgps.fragment.GameOlNoOpenTestFragment_;
import com.join.mgps.fragment.GameOlOpenTestFragment_;
import com.join.mgps.fragment.GameSingleCompanyFragment_;
import com.join.mgps.fragment.PaPaBannerListFragment_;
import com.join.mgps.fragment.PaPaStandAloneOverSeaFragment_;
/* loaded from: classes4.dex */
public class TabAdapter extends androidx.fragment.app.FragmentPagerAdapter {

    /* renamed from: b  reason: collision with root package name */
    public static String[] f44146b = {"最新", "大型", "破解", "中文", "厂商"};

    /* renamed from: c  reason: collision with root package name */
    public static String[] f44147c = {"首发", "已开测", "未开测", "礼包"};

    /* renamed from: d  reason: collision with root package name */
    public static String[] f44148d = {"推荐", "中文", "破解", "美国榜", "日本榜", "韩国榜"};

    /* renamed from: a  reason: collision with root package name */
    int f44149a;

    public TabAdapter(FragmentManager fragmentManager, int i4) {
        super(fragmentManager);
        this.f44149a = i4;
        if ("2308".equals(MApplication.f1499z) || "750".equals(MApplication.f1499z) || "753".equals(MApplication.f1499z)) {
            f44146b = new String[]{"最新", "大型", "经典", "中文", "厂商"};
            f44148d = new String[]{"推荐", "中文", "经典", "美国榜", "日本榜", "韩国榜"};
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        int i4 = this.f44149a;
        if (i4 == 0) {
            return f44146b.length;
        }
        if (i4 == 1) {
            return f44147c.length;
        }
        return f44148d.length;
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int i4) {
        int i5 = this.f44149a;
        if (i5 == 0) {
            if (i4 != 0 && i4 != 1 && i4 != 2 && i4 != 3) {
                if (i4 != 4) {
                    return null;
                }
                return new GameSingleCompanyFragment_();
            }
            GameOlOpenTestFragment_ gameOlOpenTestFragment_ = new GameOlOpenTestFragment_();
            Bundle bundle = new Bundle();
            bundle.putInt("intentTo", i4);
            gameOlOpenTestFragment_.setArguments(bundle);
            return gameOlOpenTestFragment_;
        } else if (i5 == 1) {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            return null;
                        }
                        return new GameOlGiftPackageFragment_();
                    }
                    return new GameOlNoOpenTestFragment_();
                }
                GameOlOpenTestFragment_ gameOlOpenTestFragment_2 = new GameOlOpenTestFragment_();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("intentTo", -1);
                gameOlOpenTestFragment_2.setArguments(bundle2);
                return gameOlOpenTestFragment_2;
            }
            return new GameOlFirstFragment_();
        } else if (i5 == 2) {
            if (i4 != 0 && i4 != 1 && i4 != 2) {
                PaPaStandAloneOverSeaFragment_ paPaStandAloneOverSeaFragment_ = new PaPaStandAloneOverSeaFragment_();
                Bundle bundle3 = new Bundle();
                if (i4 == 3) {
                    bundle3.putInt("type", 1);
                } else if (i4 == 4) {
                    bundle3.putInt("type", 2);
                } else if (i4 == 5) {
                    bundle3.putInt("type", 3);
                }
                paPaStandAloneOverSeaFragment_.setArguments(bundle3);
                return paPaStandAloneOverSeaFragment_;
            }
            PaPaBannerListFragment_ paPaBannerListFragment_ = new PaPaBannerListFragment_();
            Bundle bundle4 = new Bundle();
            if (i4 == 0) {
                bundle4.putInt("type", 11);
            } else if (i4 == 1) {
                bundle4.putInt("type", 12);
            } else if (i4 == 2) {
                bundle4.putInt("type", 13);
            }
            paPaBannerListFragment_.setArguments(bundle4);
            return paPaBannerListFragment_;
        } else {
            return null;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i4) {
        int i5 = this.f44149a;
        if (i5 == 0) {
            return f44146b[i4];
        }
        if (i5 == 1) {
            return f44147c[i4];
        }
        return f44148d[i4];
    }
}
