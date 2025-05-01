.class Lcom/join/mgps/fragment/SearchGameListFragment_$m;
.super Ljava/lang/Object;
.source "SearchGameListFragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/SearchGameListFragment_;->t0(Ljava/util/List;ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/util/List;

.field final synthetic c:Z

.field final synthetic d:Z

.field final synthetic e:Lcom/join/mgps/fragment/SearchGameListFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/SearchGameListFragment_;Ljava/util/List;ZZ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment_$m;->e:Lcom/join/mgps/fragment/SearchGameListFragment_;

    iput-object p2, p0, Lcom/join/mgps/fragment/SearchGameListFragment_$m;->b:Ljava/util/List;

    iput-boolean p3, p0, Lcom/join/mgps/fragment/SearchGameListFragment_$m;->c:Z

    iput-boolean p4, p0, Lcom/join/mgps/fragment/SearchGameListFragment_$m;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment_$m;->e:Lcom/join/mgps/fragment/SearchGameListFragment_;

    iget-object v1, p0, Lcom/join/mgps/fragment/SearchGameListFragment_$m;->b:Ljava/util/List;

    iget-boolean v2, p0, Lcom/join/mgps/fragment/SearchGameListFragment_$m;->c:Z

    iget-boolean v3, p0, Lcom/join/mgps/fragment/SearchGameListFragment_$m;->d:Z

    invoke-static {v0, v1, v2, v3}, Lcom/join/mgps/fragment/SearchGameListFragment_;->H0(Lcom/join/mgps/fragment/SearchGameListFragment_;Ljava/util/List;ZZ)V

    return-void
.end method
