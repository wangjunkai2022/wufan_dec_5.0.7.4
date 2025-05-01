.class Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain$a;
.super Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;
.source "ArenaGameListFragmentMain.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;->afterViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/recyclerview/widget/GridLayoutManager;

.field final synthetic b:Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;Landroidx/recyclerview/widget/GridLayoutManager;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain$a;->b:Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;

    iput-object p2, p0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain$a;->a:Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-direct {p0}, Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;-><init>()V

    return-void
.end method


# virtual methods
.method public getSpanSize(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain$a;->b:Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;

    invoke-static {v0}, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;->V(Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, p1, :cond_0

    iget-object p1, p0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain$a;->a:Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager;->getSpanCount()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    return p1
.end method
