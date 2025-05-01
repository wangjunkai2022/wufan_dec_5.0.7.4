.class Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain$d;
.super Landroidx/fragment/app/FragmentPagerAdapter;
.source "ArenaGameListFragmentMain.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;


# direct methods
.method public constructor <init>(Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;Landroidx/fragment/app/FragmentManager;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain$d;->a:Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;

    .line 2
    invoke-direct {p0, p2}, Landroidx/fragment/app/FragmentPagerAdapter;-><init>(Landroidx/fragment/app/FragmentManager;)V

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain$d;->a:Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;

    invoke-static {v0}, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;->Z(Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Landroidx/fragment/app/Fragment;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain$d;->a:Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;

    invoke-static {v0, p1}, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;->X(Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;I)Landroidx/fragment/app/Fragment;

    move-result-object p1

    return-object p1
.end method

.method public getPageTitle(I)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain$d;->a:Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;

    invoke-static {v0}, Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;->Z(Lcom/join/mgps/activity/arena/ArenaGameListFragmentMain;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/GameTypeBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GameTypeBean;->getTitle()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
