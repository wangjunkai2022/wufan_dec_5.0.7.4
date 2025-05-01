.class Lcom/join/mgps/fragment/ArenaGameListFragment_$b;
.super Ljava/lang/Object;
.source "ArenaGameListFragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/ArenaGameListFragment_;->showLodingFailed()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/ArenaGameListFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/ArenaGameListFragment_;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/ArenaGameListFragment_$b;->b:Lcom/join/mgps/fragment/ArenaGameListFragment_;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment_$b;->b:Lcom/join/mgps/fragment/ArenaGameListFragment_;

    invoke-static {v0}, Lcom/join/mgps/fragment/ArenaGameListFragment_;->n0(Lcom/join/mgps/fragment/ArenaGameListFragment_;)V

    return-void
.end method
