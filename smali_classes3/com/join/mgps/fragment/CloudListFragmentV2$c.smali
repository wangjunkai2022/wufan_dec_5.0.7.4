.class Lcom/join/mgps/fragment/CloudListFragmentV2$c;
.super Ljava/lang/Object;
.source "CloudListFragmentV2.java"

# interfaces
.implements Lcom/join/android/app/component/xrecyclerview/XRecyclerView$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/CloudListFragmentV2;->afterView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/CloudListFragmentV2;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/CloudListFragmentV2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/CloudListFragmentV2$c;->b:Lcom/join/mgps/fragment/CloudListFragmentV2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadMore()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CloudListFragmentV2$c;->b:Lcom/join/mgps/fragment/CloudListFragmentV2;

    iget v1, v0, Lcom/join/mgps/fragment/CloudListFragmentV2;->n:I

    invoke-virtual {v0, v1}, Lcom/join/mgps/fragment/CloudListFragmentV2;->m0(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/CloudListFragmentV2$c;->b:Lcom/join/mgps/fragment/CloudListFragmentV2;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/CloudListFragmentV2;->W()V

    return-void
.end method

.method public onRefresh()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CloudListFragmentV2$c;->b:Lcom/join/mgps/fragment/CloudListFragmentV2;

    const/4 v1, 0x1

    iput v1, v0, Lcom/join/mgps/fragment/CloudListFragmentV2;->n:I

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/fragment/CloudListFragmentV2;->W()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/CloudListFragmentV2$c;->b:Lcom/join/mgps/fragment/CloudListFragmentV2;

    iget v1, v0, Lcom/join/mgps/fragment/CloudListFragmentV2;->n:I

    invoke-virtual {v0, v1}, Lcom/join/mgps/fragment/CloudListFragmentV2;->m0(I)V

    return-void
.end method
