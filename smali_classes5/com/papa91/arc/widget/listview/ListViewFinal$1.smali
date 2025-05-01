.class Lcom/papa91/arc/widget/listview/ListViewFinal$1;
.super Landroid/database/DataSetObserver;
.source "ListViewFinal.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/papa91/arc/widget/listview/ListViewFinal;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/papa91/arc/widget/listview/ListViewFinal;


# direct methods
.method constructor <init>(Lcom/papa91/arc/widget/listview/ListViewFinal;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/arc/widget/listview/ListViewFinal$1;->this$0:Lcom/papa91/arc/widget/listview/ListViewFinal;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/widget/listview/ListViewFinal$1;->this$0:Lcom/papa91/arc/widget/listview/ListViewFinal;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    return-void
.end method

.method public onInvalidated()V
    .locals 0

    return-void
.end method
