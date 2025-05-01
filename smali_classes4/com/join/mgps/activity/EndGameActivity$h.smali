.class Lcom/join/mgps/activity/EndGameActivity$h;
.super Landroidx/viewpager2/adapter/FragmentStateAdapter;
.source "EndGameActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/EndGameActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "h"
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/EndGameNameListBean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic b:Lcom/join/mgps/activity/EndGameActivity;


# direct methods
.method public constructor <init>(Lcom/join/mgps/activity/EndGameActivity;Landroidx/fragment/app/FragmentActivity;Ljava/util/List;)V
    .locals 0
    .param p1    # Lcom/join/mgps/activity/EndGameActivity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/FragmentActivity;",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/EndGameNameListBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/EndGameActivity$h;->b:Lcom/join/mgps/activity/EndGameActivity;

    .line 2
    invoke-direct {p0, p2}, Landroidx/viewpager2/adapter/FragmentStateAdapter;-><init>(Landroidx/fragment/app/FragmentActivity;)V

    .line 3
    iput-object p3, p0, Lcom/join/mgps/activity/EndGameActivity$h;->a:Ljava/util/List;

    return-void
.end method

.method static synthetic a(Lcom/join/mgps/activity/EndGameActivity$h;I)Lcom/join/mgps/fragment/EndGameViewpagerListFragment_;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/EndGameActivity$h;->c(I)Lcom/join/mgps/fragment/EndGameViewpagerListFragment_;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(Lcom/join/mgps/activity/EndGameActivity$h;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/EndGameActivity$h;->d(Ljava/util/List;)V

    return-void
.end method

.method private c(I)Lcom/join/mgps/fragment/EndGameViewpagerListFragment_;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity$h;->b:Lcom/join/mgps/activity/EndGameActivity;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "f"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/EndGameActivity$h;->getItemId(I)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    instance-of v0, p1, Lcom/join/mgps/fragment/EndGameViewpagerListFragment_;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Lcom/join/mgps/fragment/EndGameViewpagerListFragment_;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private d(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/EndGameNameListBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/EndGameActivity$h;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public createFragment(I)Landroidx/fragment/app/Fragment;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/fragment/EndGameViewpagerListFragment_;->c0()Lcom/join/mgps/fragment/EndGameViewpagerListFragment_$a;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/EndGameActivity$h;->a:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/EndGameNameListBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/EndGameNameListBean;->getGameId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/fragment/EndGameViewpagerListFragment_$a;->c(Ljava/lang/String;)Lcom/join/mgps/fragment/EndGameViewpagerListFragment_$a;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity$h;->b:Lcom/join/mgps/activity/EndGameActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/EndGameActivity;->n:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/join/mgps/fragment/EndGameViewpagerListFragment_$a;->b(Ljava/lang/String;)Lcom/join/mgps/fragment/EndGameViewpagerListFragment_$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/fragment/EndGameViewpagerListFragment_$a;->a()Lcom/join/mgps/fragment/EndGameViewpagerListFragment;

    move-result-object p1

    return-object p1
.end method

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity$h;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemId(I)J
    .locals 2

    add-int/lit16 p1, p1, 0x3e8

    int-to-long v0, p1

    return-wide v0
.end method
