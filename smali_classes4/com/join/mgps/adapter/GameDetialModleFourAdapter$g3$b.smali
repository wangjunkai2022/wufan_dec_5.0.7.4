.class Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3$b;
.super Lcom/join/mgps/base/decoration/UniversalItemDecoration;
.source "GameDetialModleFourAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

.field final synthetic b:Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3;Lcom/join/mgps/adapter/GameDetialModleFourAdapter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3$b;->b:Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3;

    iput-object p2, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3$b;->a:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-direct {p0}, Lcom/join/mgps/base/decoration/UniversalItemDecoration;-><init>()V

    return-void
.end method


# virtual methods
.method public getItemOffsets(I)Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;

    invoke-direct {v0}, Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;-><init>()V

    const/4 v1, 0x0

    .line 2
    iput v1, v0, Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;->f:I

    const v1, 0x7f0714fc

    const v2, 0x7f07122b

    if-eqz p1, :cond_1

    .line 3
    rem-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3$b;->b:Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3;

    iget-object p1, p1, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3;->c:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {p1}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter;->g(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;)Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    float-to-int p1, p1

    iput p1, v0, Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;->a:I

    .line 5
    iget-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3$b;->b:Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3;

    iget-object p1, p1, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3;->c:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {p1}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter;->g(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;)Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    float-to-int p1, p1

    iput p1, v0, Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;->b:I

    goto :goto_1

    .line 6
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3$b;->b:Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3;

    iget-object p1, p1, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3;->c:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {p1}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter;->g(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;)Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    float-to-int p1, p1

    iput p1, v0, Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;->a:I

    .line 7
    iget-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3$b;->b:Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3;

    iget-object p1, p1, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3;->c:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {p1}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter;->g(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;)Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    float-to-int p1, p1

    iput p1, v0, Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;->b:I

    .line 8
    :goto_1
    iget-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3$b;->b:Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3;

    iget-object p1, p1, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3;->c:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {p1}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter;->g(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;)Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    float-to-int p1, p1

    iput p1, v0, Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;->d:I

    return-object v0
.end method
