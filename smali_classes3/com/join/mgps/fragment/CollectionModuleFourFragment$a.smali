.class Lcom/join/mgps/fragment/CollectionModuleFourFragment$a;
.super Ljava/lang/Object;
.source "CollectionModuleFourFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/CollectionModuleFourFragment;->afterViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/CollectionModuleFourFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/CollectionModuleFourFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/CollectionModuleFourFragment$a;->b:Lcom/join/mgps/fragment/CollectionModuleFourFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRefresh()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CollectionModuleFourFragment$a;->b:Lcom/join/mgps/fragment/CollectionModuleFourFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/CollectionModuleFourFragment;->V(Lcom/join/mgps/fragment/CollectionModuleFourFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/CollectionModuleFourFragment$a;->b:Lcom/join/mgps/fragment/CollectionModuleFourFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/join/mgps/fragment/CollectionModuleFourFragment;->W(Lcom/join/mgps/fragment/CollectionModuleFourFragment;I)I

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/CollectionModuleFourFragment$a;->b:Lcom/join/mgps/fragment/CollectionModuleFourFragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/CollectionModuleFourFragment;->b0()V

    return-void
.end method
