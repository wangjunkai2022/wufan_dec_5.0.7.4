.class Lcom/join/mgps/fragment/CollectionModuleTwoFragment$b;
.super Ljava/lang/Object;
.source "CollectionModuleTwoFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/CollectionModuleTwoFragment;->afterViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/CollectionModuleTwoFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/CollectionModuleTwoFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/CollectionModuleTwoFragment$b;->b:Lcom/join/mgps/fragment/CollectionModuleTwoFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRefresh()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CollectionModuleTwoFragment$b;->b:Lcom/join/mgps/fragment/CollectionModuleTwoFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/CollectionModuleTwoFragment;->V(Lcom/join/mgps/fragment/CollectionModuleTwoFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/CollectionModuleTwoFragment$b;->b:Lcom/join/mgps/fragment/CollectionModuleTwoFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/CollectionModuleTwoFragment;->W(Lcom/join/mgps/fragment/CollectionModuleTwoFragment;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/CollectionModuleTwoFragment$b;->b:Lcom/join/mgps/fragment/CollectionModuleTwoFragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/CollectionModuleTwoFragment;->a0()V

    return-void
.end method
