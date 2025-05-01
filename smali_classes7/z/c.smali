.class public final synthetic Lz/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

.field public final synthetic c:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;

.field public final synthetic d:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public synthetic constructor <init>(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/c;->b:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    iput-object p2, p0, Lz/c;->c:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;

    iput-object p3, p0, Lz/c;->d:Landroidx/recyclerview/widget/RecyclerView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lz/c;->b:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    iget-object v1, p0, Lz/c;->c:Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;

    iget-object v2, p0, Lz/c;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0, v1, v2}, Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;->h(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Lcom/chad/library/adapter/base/loadState/trailing/TrailingLoadStateAdapter;Landroidx/recyclerview/widget/RecyclerView;)V

    return-void
.end method
