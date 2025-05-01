.class Lcom/join/mgps/activity/EndGameActivity$k;
.super Landroidx/viewpager2/adapter/FragmentStateAdapter;
.source "EndGameActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/EndGameActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "k"
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/EndGameTypeBean;",
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
            "Lcom/join/mgps/dto/EndGameTypeBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/EndGameActivity$k;->b:Lcom/join/mgps/activity/EndGameActivity;

    .line 2
    invoke-direct {p0, p2}, Landroidx/viewpager2/adapter/FragmentStateAdapter;-><init>(Landroidx/fragment/app/FragmentActivity;)V

    .line 3
    iput-object p3, p0, Lcom/join/mgps/activity/EndGameActivity$k;->a:Ljava/util/List;

    return-void
.end method

.method static synthetic a(Lcom/join/mgps/activity/EndGameActivity$k;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/EndGameActivity$k;->d(Ljava/util/List;)V

    return-void
.end method

.method static synthetic b(Lcom/join/mgps/activity/EndGameActivity$k;I)Lcom/join/mgps/fragment/EndGameSelectFragment_;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/EndGameActivity$k;->c(I)Lcom/join/mgps/fragment/EndGameSelectFragment_;

    move-result-object p0

    return-object p0
.end method

.method private c(I)Lcom/join/mgps/fragment/EndGameSelectFragment_;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity$k;->b:Lcom/join/mgps/activity/EndGameActivity;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "f"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/EndGameActivity$k;->getItemId(I)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    instance-of v0, p1, Lcom/join/mgps/fragment/EndGameSelectFragment_;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Lcom/join/mgps/fragment/EndGameSelectFragment_;

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
            "Lcom/join/mgps/dto/EndGameTypeBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/EndGameActivity$k;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public createFragment(I)Landroidx/fragment/app/Fragment;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity$k;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/EndGameTypeBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/EndGameTypeBean;->getModelType()I

    move-result p1

    .line 2
    invoke-static {}, Lcom/join/mgps/fragment/EndGameSelectFragment_;->m0()Lcom/join/mgps/fragment/EndGameSelectFragment_$h;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/fragment/EndGameSelectFragment_$h;->b(I)Lcom/join/mgps/fragment/EndGameSelectFragment_$h;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/fragment/EndGameSelectFragment_$h;->a()Lcom/join/mgps/fragment/EndGameSelectFragment;

    move-result-object p1

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity$k;->b:Lcom/join/mgps/activity/EndGameActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameActivity;->l0(Lcom/join/mgps/activity/EndGameActivity;)Lcom/join/mgps/dto/EndGameNameListBean;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity$k;->b:Lcom/join/mgps/activity/EndGameActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameActivity;->l0(Lcom/join/mgps/activity/EndGameActivity;)Lcom/join/mgps/dto/EndGameNameListBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameNameListBean;->getGameId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/fragment/EndGameSelectFragment;->d0(Ljava/lang/String;)V

    :cond_0
    return-object p1
.end method

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity$k;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemId(I)J
    .locals 2

    add-int/lit8 p1, p1, 0x64

    int-to-long v0, p1

    return-wide v0
.end method
