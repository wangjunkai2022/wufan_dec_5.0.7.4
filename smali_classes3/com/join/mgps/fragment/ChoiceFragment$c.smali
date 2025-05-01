.class Lcom/join/mgps/fragment/ChoiceFragment$c;
.super Ljava/lang/Object;
.source "ChoiceFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/ChoiceFragment;->l0()V
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
    iput-object p1, p0, Lcom/join/mgps/fragment/ChoiceFragment$c;->b:Lcom/join/mgps/fragment/ChoiceFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ChoiceFragment$c;->b:Lcom/join/mgps/fragment/ChoiceFragment;

    iget-object v0, v0, Lcom/join/mgps/fragment/ChoiceFragment;->n:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->stopRefresh()V

    return-void
.end method
