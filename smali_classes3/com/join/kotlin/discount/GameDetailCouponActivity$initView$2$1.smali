.class public final Lcom/join/kotlin/discount/GameDetailCouponActivity$initView$2$1;
.super Lcom/join/mgps/base/decoration/UniversalItemDecoration;
.source "GameDetailCouponActivity.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/discount/GameDetailCouponActivity;->initView(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $this_apply:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;


# direct methods
.method constructor <init>(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/discount/GameDetailCouponActivity$initView$2$1;->$this_apply:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/base/decoration/UniversalItemDecoration;-><init>()V

    return-void
.end method


# virtual methods
.method public getItemOffsets(I)Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;

    invoke-direct {v0}, Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;-><init>()V

    const/4 v1, 0x0

    .line 2
    iput v1, v0, Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;->f:I

    if-nez p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/join/kotlin/discount/GameDetailCouponActivity$initView$2$1;->$this_apply:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v1, 0x7f0712d2    # 1.795435E38f

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    float-to-int p1, p1

    iput p1, v0, Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;->c:I

    goto :goto_0

    .line 4
    :cond_0
    iput v1, v0, Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;->c:I

    .line 5
    :goto_0
    iget-object p1, p0, Lcom/join/kotlin/discount/GameDetailCouponActivity$initView$2$1;->$this_apply:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v1, 0x7f071263

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    float-to-int p1, p1

    iput p1, v0, Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;->a:I

    .line 6
    iget-object p1, p0, Lcom/join/kotlin/discount/GameDetailCouponActivity$initView$2$1;->$this_apply:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    float-to-int p1, p1

    iput p1, v0, Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;->b:I

    .line 7
    iget-object p1, p0, Lcom/join/kotlin/discount/GameDetailCouponActivity$initView$2$1;->$this_apply:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    float-to-int p1, p1

    iput p1, v0, Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;->d:I

    return-object v0
.end method
