.class Lcom/join/mgps/fragment/ChoiceFragment$b;
.super Ljava/lang/Object;
.source "ChoiceFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/ChoiceFragment;->m0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/ChoiceFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/ChoiceFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/ChoiceFragment$b;->b:Lcom/join/mgps/fragment/ChoiceFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ChoiceFragment$b;->b:Lcom/join/mgps/fragment/ChoiceFragment;

    iget-object v0, v0, Lcom/join/mgps/fragment/ChoiceFragment;->n:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->stopRefresh()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/ChoiceFragment$b;->b:Lcom/join/mgps/fragment/ChoiceFragment;

    iget-object v0, v0, Lcom/join/mgps/fragment/ChoiceFragment;->n:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->stopLoadMore()V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/ChoiceFragment$b;->b:Lcom/join/mgps/fragment/ChoiceFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/ChoiceFragment;->X(Lcom/join/mgps/fragment/ChoiceFragment;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/ChoiceFragment$b;->b:Lcom/join/mgps/fragment/ChoiceFragment;

    iget-object v0, v0, Lcom/join/mgps/fragment/ChoiceFragment;->n:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setNoMore()V

    :cond_1
    return-void
.end method
