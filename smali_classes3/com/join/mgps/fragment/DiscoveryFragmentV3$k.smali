.class Lcom/join/mgps/fragment/DiscoveryFragmentV3$k;
.super Landroidx/viewpager2/adapter/FragmentStateAdapter;
.source "DiscoveryFragmentV3.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/fragment/DiscoveryFragmentV3;
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
            "Lcom/join/mgps/dto/EndGameNameListBean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic b:Lcom/join/mgps/fragment/DiscoveryFragmentV3;


# direct methods
.method public constructor <init>(Lcom/join/mgps/fragment/DiscoveryFragmentV3;Landroidx/fragment/app/FragmentActivity;Ljava/util/List;)V
    .locals 0
    .param p1    # Lcom/join/mgps/fragment/DiscoveryFragmentV3;
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
    iput-object p1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3$k;->b:Lcom/join/mgps/fragment/DiscoveryFragmentV3;

    .line 2
    invoke-direct {p0, p2}, Landroidx/viewpager2/adapter/FragmentStateAdapter;-><init>(Landroidx/fragment/app/FragmentActivity;)V

    .line 3
    iput-object p3, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3$k;->a:Ljava/util/List;

    return-void
.end method

.method static synthetic a(Lcom/join/mgps/fragment/DiscoveryFragmentV3$k;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/DiscoveryFragmentV3$k;->c(Ljava/util/List;)V

    return-void
.end method

.method private b(I)Lcom/join/mgps/fragment/EndGameDiscoveryFragment_;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3$k;->b:Lcom/join/mgps/fragment/DiscoveryFragmentV3;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "f"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    instance-of v0, p1, Lcom/join/mgps/fragment/EndGameDiscoveryFragment_;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Lcom/join/mgps/fragment/EndGameDiscoveryFragment_;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private c(Ljava/util/List;)V
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
    iput-object p1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3$k;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public createFragment(I)Landroidx/fragment/app/Fragment;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/fragment/EndGameDiscoveryFragment_;->e0()Lcom/join/mgps/fragment/EndGameDiscoveryFragment_$c;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3$k;->a:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/EndGameNameListBean;

    invoke-virtual {v0, v1}, Lcom/join/mgps/fragment/EndGameDiscoveryFragment_$c;->b(Lcom/join/mgps/dto/EndGameNameListBean;)Lcom/join/mgps/fragment/EndGameDiscoveryFragment_$c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/fragment/EndGameDiscoveryFragment_$c;->c(I)Lcom/join/mgps/fragment/EndGameDiscoveryFragment_$c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/fragment/EndGameDiscoveryFragment_$c;->a()Lcom/join/mgps/fragment/EndGameDiscoveryFragment;

    move-result-object p1

    return-object p1
.end method

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3$k;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
