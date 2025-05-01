.class Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment$c;
.super Ljava/lang/Object;
.source "PaPaStandAloneOverSeaFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/InterceptEventViewPager$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;->afterViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment$c;->a:Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    return-void
.end method

.method public onPageSelected(I)V
    .locals 3

    const-string v0, "#4A4A4A"

    const-string v1, "#F47500"

    if-eqz p1, :cond_1

    const/4 v2, 0x1

    if-eq p1, v2, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment$c;->a:Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;

    iget-object p1, p1, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;->d:Landroid/widget/TextView;

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment$c;->a:Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;

    iget-object p1, p1, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;->c:Landroid/widget/TextView;

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 3
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment$c;->a:Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;

    iget-object p1, p1, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;->c:Landroid/widget/TextView;

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment$c;->a:Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;

    iget-object p1, p1, Lcom/join/mgps/fragment/PaPaStandAloneOverSeaFragment;->d:Landroid/widget/TextView;

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :goto_0
    return-void
.end method
