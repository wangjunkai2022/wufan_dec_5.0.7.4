package m.framework.ui.widget.slidingmenu;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes7.dex */
public abstract class MenuAdapter {
    private ArrayList<SlidingMenuGroup> menus = new ArrayList<>();

    public MenuAdapter(SlidingMenu slidingMenu) {
    }

    private SlidingMenuGroup findGroupById(int i4) {
        ArrayList<SlidingMenuGroup> arrayList = this.menus;
        if (arrayList == null) {
            return null;
        }
        Iterator<SlidingMenuGroup> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            SlidingMenuGroup next = it2.next();
            if (next != null && next.id == i4) {
                return next;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SlidingMenuGroup getGroup(int i4) {
        return this.menus.get(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getGroupCount() {
        ArrayList<SlidingMenuGroup> arrayList = this.menus;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public abstract View getGroupView(int i4, ViewGroup viewGroup);

    /* JADX INFO: Access modifiers changed from: protected */
    public SlidingMenuItem getItem(int i4, int i5) {
        return this.menus.get(i4).getItem(i5);
    }

    public abstract View getItemView(SlidingMenuItem slidingMenuItem, ViewGroup viewGroup);

    public SlidingMenuItem getMenuItem(int i4, int i5) {
        SlidingMenuGroup findGroupById = findGroupById(i4);
        if (findGroupById == null) {
            return null;
        }
        return findGroupById.findItemById(i5);
    }

    public View getMenuTitle() {
        return null;
    }

    protected String getTitle(int i4) {
        return this.menus.get(i4).text;
    }

    public void notifyDataSetChanged(SlidingMenuItem slidingMenuItem) {
    }

    public boolean onItemTrigger(SlidingMenuItem slidingMenuItem) {
        return false;
    }

    public void onMenuSwitch(boolean z4) {
    }

    public void setGroup(int i4, String str) {
        SlidingMenuGroup findGroupById = findGroupById(i4);
        if (findGroupById == null) {
            findGroupById = new SlidingMenuGroup();
            findGroupById.id = i4;
            this.menus.add(findGroupById);
        }
        findGroupById.text = str;
    }

    public void setItem(int i4, SlidingMenuItem slidingMenuItem) {
        SlidingMenuGroup findGroupById;
        if (slidingMenuItem == null || (findGroupById = findGroupById(i4)) == null) {
            return;
        }
        findGroupById.setItem(slidingMenuItem);
    }

    void setGroup(SlidingMenuGroup slidingMenuGroup) {
        if (slidingMenuGroup == null) {
            return;
        }
        SlidingMenuGroup findGroupById = findGroupById(slidingMenuGroup.id);
        if (findGroupById == null) {
            this.menus.add(slidingMenuGroup);
            return;
        }
        int indexOf = this.menus.indexOf(findGroupById);
        this.menus.remove(indexOf);
        this.menus.add(indexOf, slidingMenuGroup);
    }
}
