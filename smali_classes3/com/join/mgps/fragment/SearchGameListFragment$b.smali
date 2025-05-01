.class Lcom/join/mgps/fragment/SearchGameListFragment$b;
.super Lcom/join/mgps/base/decoration/UniversalItemDecoration;
.source "SearchGameListFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/SearchGameListFragment;->afterViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/SearchGameListFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/SearchGameListFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment$b;->a:Lcom/join/mgps/fragment/SearchGameListFragment;

    invoke-direct {p0}, Lcom/join/mgps/base/decoration/UniversalItemDecoration;-><init>()V

    return-void
.end method


# virtual methods
.method public getItemOffsets(I)Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;
    .locals 2

    .line 1
    new-instance p1, Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;

    invoke-direct {p1}, Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p1, Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;->f:I

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment$b;->a:Lcom/join/mgps/fragment/SearchGameListFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f07106c

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, p1, Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;->a:I

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment$b;->a:Lcom/join/mgps/fragment/SearchGameListFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, p1, Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;->b:I

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment$b;->a:Lcom/join/mgps/fragment/SearchGameListFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, p1, Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;->c:I

    .line 6
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment$b;->a:Lcom/join/mgps/fragment/SearchGameListFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, p1, Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;->d:I

    return-object p1
.end method
