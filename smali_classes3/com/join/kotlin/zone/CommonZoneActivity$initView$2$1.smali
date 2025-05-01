.class public final Lcom/join/kotlin/zone/CommonZoneActivity$initView$2$1;
.super Lcom/join/mgps/base/decoration/GridDecoration;
.source "CommonZoneActivity.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/zone/CommonZoneActivity;->initView(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $this_apply:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

.field final synthetic this$0:Lcom/join/kotlin/zone/CommonZoneActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/zone/CommonZoneActivity;Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/zone/CommonZoneActivity$initView$2$1;->this$0:Lcom/join/kotlin/zone/CommonZoneActivity;

    iput-object p2, p0, Lcom/join/kotlin/zone/CommonZoneActivity$initView$2$1;->$this_apply:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/base/decoration/GridDecoration;-><init>()V

    return-void
.end method


# virtual methods
.method public getItemOffsets(I)Lcom/join/mgps/base/decoration/GridDecoration$b;
    .locals 6
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/zone/CommonZoneActivity$initView$2$1;->this$0:Lcom/join/kotlin/zone/CommonZoneActivity;

    invoke-virtual {v0}, Lcom/join/kotlin/zone/CommonZoneActivity;->getCommonZoneAdapter()Lcom/join/kotlin/zone/adapter/CommonZoneAdapter;

    move-result-object v0

    iget-object v1, p0, Lcom/join/kotlin/zone/CommonZoneActivity$initView$2$1;->$this_apply:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    .line 2
    invoke-virtual {v0, p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItemViewType(I)I

    move-result v0

    const/4 v2, 0x2

    const/4 v3, 0x1

    const v4, 0x7f0711f4

    if-eq v0, v3, :cond_2

    if-eq v0, v2, :cond_2

    const/4 v5, 0x3

    if-eq v0, v5, :cond_2

    const/4 v5, 0x4

    if-eq v0, v5, :cond_2

    const/4 v5, 0x6

    if-eq v0, v5, :cond_2

    .line 3
    new-instance v0, Lcom/join/mgps/base/decoration/GridDecoration$a;

    invoke-direct {v0, v3}, Lcom/join/mgps/base/decoration/GridDecoration$a;-><init>(I)V

    .line 4
    invoke-virtual {p0, p1}, Lcom/join/mgps/base/decoration/GridDecoration;->isLeft(I)Z

    move-result v2

    const v5, 0x7f07106c

    if-eqz v2, :cond_0

    .line 5
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    .line 6
    iput v2, v0, Lcom/join/mgps/base/decoration/GridDecoration$b;->c:I

    .line 7
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    .line 8
    iput v1, v0, Lcom/join/mgps/base/decoration/GridDecoration$b;->d:I

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0, p1, v3}, Lcom/join/mgps/base/decoration/GridDecoration;->isRight(II)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 10
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    .line 11
    iput v2, v0, Lcom/join/mgps/base/decoration/GridDecoration$b;->c:I

    .line 12
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    .line 13
    iput v1, v0, Lcom/join/mgps/base/decoration/GridDecoration$b;->d:I

    goto :goto_0

    .line 14
    :cond_1
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    .line 15
    iput v2, v0, Lcom/join/mgps/base/decoration/GridDecoration$b;->c:I

    .line 16
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    .line 17
    iput v1, v0, Lcom/join/mgps/base/decoration/GridDecoration$b;->d:I

    goto :goto_0

    .line 18
    :cond_2
    new-instance v0, Lcom/join/mgps/base/decoration/GridDecoration$a;

    invoke-direct {v0, v2}, Lcom/join/mgps/base/decoration/GridDecoration$a;-><init>(I)V

    .line 19
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    iput v2, v0, Lcom/join/mgps/base/decoration/GridDecoration$b;->c:I

    .line 20
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    .line 21
    iput v1, v0, Lcom/join/mgps/base/decoration/GridDecoration$b;->d:I

    :goto_0
    const/4 v1, 0x0

    .line 22
    iput v1, v0, Lcom/join/mgps/base/decoration/GridDecoration$a;->h:I

    const v1, 0x7f07114a

    if-nez p1, :cond_3

    .line 23
    iget-object p1, p0, Lcom/join/kotlin/zone/CommonZoneActivity$initView$2$1;->$this_apply:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    float-to-int p1, p1

    iput p1, v0, Lcom/join/mgps/base/decoration/GridDecoration$b;->e:I

    goto :goto_1

    .line 24
    :cond_3
    iget-object p1, p0, Lcom/join/kotlin/zone/CommonZoneActivity$initView$2$1;->$this_apply:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    float-to-int p1, p1

    iput p1, v0, Lcom/join/mgps/base/decoration/GridDecoration$b;->e:I

    .line 25
    :goto_1
    iget-object p1, p0, Lcom/join/kotlin/zone/CommonZoneActivity$initView$2$1;->$this_apply:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    float-to-int p1, p1

    iput p1, v0, Lcom/join/mgps/base/decoration/GridDecoration$b;->f:I

    return-object v0
.end method
