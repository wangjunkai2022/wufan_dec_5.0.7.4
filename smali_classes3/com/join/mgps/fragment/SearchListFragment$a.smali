.class Lcom/join/mgps/fragment/SearchListFragment$a;
.super Ljava/lang/Object;
.source "SearchListFragment.java"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/SearchListFragment;->afterViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/SearchListFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/SearchListFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/SearchListFragment$a;->b:Lcom/join/mgps/fragment/SearchListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchListFragment$a;->b:Lcom/join/mgps/fragment/SearchListFragment;

    add-int/2addr p3, p2

    add-int/lit8 p3, p3, -0x1

    invoke-static {p1, p3}, Lcom/join/mgps/fragment/SearchListFragment;->W(Lcom/join/mgps/fragment/SearchListFragment;I)I

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/SearchListFragment$a;->b:Lcom/join/mgps/fragment/SearchListFragment;

    invoke-static {p1, p2}, Lcom/join/mgps/fragment/SearchListFragment;->X(Lcom/join/mgps/fragment/SearchListFragment;I)I

    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 0

    return-void
.end method
