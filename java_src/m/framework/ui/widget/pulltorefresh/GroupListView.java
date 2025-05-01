package m.framework.ui.widget.pulltorefresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
/* loaded from: classes7.dex */
public class GroupListView extends ListView {

    /* loaded from: classes7.dex */
    public static abstract class GroupListAdapter {
        private BaseAdapter adapter;

        /* JADX INFO: Access modifiers changed from: private */
        public void setInnerAdapter(BaseAdapter baseAdapter) {
            this.adapter = baseAdapter;
        }

        public abstract Object getChild(int i4, int i5);

        public abstract View getChildView(int i4, int i5, View view, ViewGroup viewGroup);

        public abstract int getChildrenCount(int i4);

        public abstract int getGroupCount();

        public abstract String getGroupTitle(int i4);

        public abstract View getGroupTitleView(int i4, View view, ViewGroup viewGroup);

        public void notifyDataSetChanged() {
            this.adapter.notifyDataSetChanged();
        }
    }

    /* loaded from: classes7.dex */
    private static class ItemHolder {
        public View child;
        public LinearLayout llItem;
        public View title;

        private ItemHolder() {
        }

        /* synthetic */ ItemHolder(ItemHolder itemHolder) {
            this();
        }
    }

    public GroupListView(Context context) {
        super(context);
    }

    public void setAdapter(final GroupListAdapter groupListAdapter) {
        BaseAdapter baseAdapter = new BaseAdapter() { // from class: m.framework.ui.widget.pulltorefresh.GroupListView.1
            private int[] getItemIndex(int i4) {
                int[] iArr = {-1, -2};
                int groupCount = groupListAdapter.getGroupCount();
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    if (i5 >= groupCount) {
                        break;
                    }
                    int childrenCount = groupListAdapter.getChildrenCount(i5) + 1 + i6;
                    if (childrenCount > i4) {
                        iArr[0] = i5;
                        iArr[1] = (i4 - i6) - 1;
                        break;
                    }
                    i5++;
                    i6 = childrenCount;
                }
                return iArr;
            }

            @Override // android.widget.Adapter
            public int getCount() {
                int groupCount = groupListAdapter.getGroupCount();
                int i4 = 0;
                for (int i5 = 0; i5 < groupCount; i5++) {
                    i4 += groupListAdapter.getChildrenCount(i5) + 1;
                }
                return i4;
            }

            @Override // android.widget.Adapter
            public Object getItem(int i4) {
                int[] itemIndex = getItemIndex(i4);
                int i5 = itemIndex[0];
                int i6 = itemIndex[1];
                if (i5 > -1) {
                    if (i6 == -1) {
                        return groupListAdapter.getGroupTitle(i6);
                    }
                    if (i6 > -1) {
                        return groupListAdapter.getChild(i5, i6);
                    }
                    return null;
                }
                return null;
            }

            @Override // android.widget.Adapter
            public long getItemId(int i4) {
                return i4;
            }

            @Override // android.widget.Adapter
            public View getView(int i4, View view, ViewGroup viewGroup) {
                int[] itemIndex = getItemIndex(i4);
                int i5 = itemIndex[0];
                int i6 = itemIndex[1];
                if (view == null) {
                    ItemHolder itemHolder = new ItemHolder(null);
                    LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
                    itemHolder.llItem = linearLayout;
                    linearLayout.setOrientation(1);
                    itemHolder.llItem.setTag(itemHolder);
                    if (i5 > -1) {
                        if (i6 == -1) {
                            View groupTitleView = groupListAdapter.getGroupTitleView(i5, itemHolder.title, itemHolder.llItem);
                            itemHolder.title = groupTitleView;
                            itemHolder.llItem.addView(groupTitleView);
                        } else if (i6 > -1) {
                            View childView = groupListAdapter.getChildView(i5, i6, itemHolder.child, itemHolder.llItem);
                            itemHolder.child = childView;
                            itemHolder.llItem.addView(childView);
                        }
                    }
                    return itemHolder.llItem;
                }
                ItemHolder itemHolder2 = (ItemHolder) view.getTag();
                if (i5 > -1) {
                    if (i6 == -1) {
                        itemHolder2.title = groupListAdapter.getGroupTitleView(i5, itemHolder2.title, itemHolder2.llItem);
                        View view2 = itemHolder2.child;
                        if (view2 != null) {
                            itemHolder2.llItem.removeView(view2);
                            return view;
                        }
                        return view;
                    } else if (i6 > -1) {
                        itemHolder2.child = groupListAdapter.getChildView(i5, i6, itemHolder2.child, itemHolder2.llItem);
                        View view3 = itemHolder2.title;
                        if (view3 != null) {
                            itemHolder2.llItem.removeView(view3);
                            return view;
                        }
                        return view;
                    } else {
                        return view;
                    }
                }
                return view;
            }
        };
        groupListAdapter.setInnerAdapter(baseAdapter);
        super.setAdapter((ListAdapter) baseAdapter);
    }

    public GroupListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GroupListView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
