.class Lcom/join/mgps/fragment/GameFormFragment$a;
.super Ljava/lang/Object;
.source "GameFormFragment.java"

# interfaces
.implements Lcom/join/android/app/component/xrecyclerview/XRecyclerView$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/GameFormFragment;->V()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/GameFormFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/GameFormFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/GameFormFragment$a;->b:Lcom/join/mgps/fragment/GameFormFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadMore()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/GameFormFragment$a;->b:Lcom/join/mgps/fragment/GameFormFragment;

    iget-boolean v1, v0, Lcom/join/mgps/fragment/GameFormFragment;->q:Z

    if-eqz v1, :cond_0

    .line 2
    iget v1, v0, Lcom/join/mgps/fragment/GameFormFragment;->p:I

    iget v2, v0, Lcom/join/mgps/fragment/GameFormFragment;->j:I

    invoke-static {v0, v1, v2}, Lcom/join/mgps/fragment/GameFormFragment;->Z(Lcom/join/mgps/fragment/GameFormFragment;II)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/fragment/GameFormFragment;->d0()V

    :goto_0
    return-void
.end method

.method public onRefresh()V
    .locals 0

    return-void
.end method
