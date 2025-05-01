package o3;

import android.annotation.TargetApi;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import it.sephiroth.android.library.widget.AbsHListView;
/* compiled from: MultiChoiceModeWrapper.java */
/* loaded from: classes6.dex */
public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private a f72045a;

    /* renamed from: b  reason: collision with root package name */
    private AbsHListView f72046b;

    public b(AbsHListView absHListView) {
        this.f72046b = absHListView;
    }

    @Override // o3.a
    @TargetApi(11)
    public void a(ActionMode actionMode, int i4, long j4, boolean z4) {
        this.f72045a.a(actionMode, i4, j4, z4);
        if (this.f72046b.getCheckedItemCount() == 0) {
            actionMode.finish();
        }
    }

    public boolean b() {
        return this.f72045a != null;
    }

    public void c(a aVar) {
        this.f72045a = aVar;
    }

    @Override // android.view.ActionMode.Callback
    @TargetApi(11)
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f72045a.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    @TargetApi(11)
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        if (this.f72045a.onCreateActionMode(actionMode, menu)) {
            this.f72046b.setLongClickable(false);
            return true;
        }
        return false;
    }

    @Override // android.view.ActionMode.Callback
    @TargetApi(11)
    public void onDestroyActionMode(ActionMode actionMode) {
        this.f72045a.onDestroyActionMode(actionMode);
        AbsHListView absHListView = this.f72046b;
        absHListView.N = null;
        absHListView.Q();
        AbsHListView absHListView2 = this.f72046b;
        absHListView2.f69439n = true;
        absHListView2.r();
        this.f72046b.requestLayout();
        this.f72046b.setLongClickable(true);
    }

    @Override // android.view.ActionMode.Callback
    @TargetApi(11)
    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f72045a.onPrepareActionMode(actionMode, menu);
    }
}
