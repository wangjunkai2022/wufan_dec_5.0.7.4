.class Lcom/join/mgps/fragment/CloudListFragment$c;
.super Ljava/lang/Object;
.source "CloudListFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/CloudListFragment;->afterView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/CloudListFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/CloudListFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/CloudListFragment$c;->b:Lcom/join/mgps/fragment/CloudListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRefresh()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CloudListFragment$c;->b:Lcom/join/mgps/fragment/CloudListFragment;

    const/4 v1, 0x1

    iput v1, v0, Lcom/join/mgps/fragment/CloudListFragment;->r:I

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/fragment/CloudListFragment;->W()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/CloudListFragment$c;->b:Lcom/join/mgps/fragment/CloudListFragment;

    iget v1, v0, Lcom/join/mgps/fragment/CloudListFragment;->r:I

    invoke-virtual {v0, v1}, Lcom/join/mgps/fragment/CloudListFragment;->m0(I)V

    return-void
.end method
