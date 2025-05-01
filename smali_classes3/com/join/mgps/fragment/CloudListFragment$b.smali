.class Lcom/join/mgps/fragment/CloudListFragment$b;
.super Ljava/lang/Object;
.source "CloudListFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/f;


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
    iput-object p1, p0, Lcom/join/mgps/fragment/CloudListFragment$b;->b:Lcom/join/mgps/fragment/CloudListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadMore()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CloudListFragment$b;->b:Lcom/join/mgps/fragment/CloudListFragment;

    iget v1, v0, Lcom/join/mgps/fragment/CloudListFragment;->r:I

    invoke-virtual {v0, v1}, Lcom/join/mgps/fragment/CloudListFragment;->m0(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/CloudListFragment$b;->b:Lcom/join/mgps/fragment/CloudListFragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/CloudListFragment;->W()V

    return-void
.end method
