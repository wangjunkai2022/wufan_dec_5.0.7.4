.class Lcom/join/mgps/activity/PapaMainFragment$a;
.super Ljava/lang/Object;
.source "PapaMainFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/PapaMainFragment;->t1(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lcom/join/mgps/activity/PapaMainFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/PapaMainFragment;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/PapaMainFragment$a;->c:Lcom/join/mgps/activity/PapaMainFragment;

    iput-object p2, p0, Lcom/join/mgps/activity/PapaMainFragment$a;->b:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainFragment$a;->c:Lcom/join/mgps/activity/PapaMainFragment;

    invoke-static {p1}, Lcom/join/mgps/activity/PapaMainFragment;->c0(Lcom/join/mgps/activity/PapaMainFragment;)Lcom/join/mgps/customview/LoopViewPager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/customview/LoopViewPager;->getCurrentItem()I

    move-result p1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment$a;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    rem-int/2addr p1, v0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment$a;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v0, p1, :cond_0

    const/16 p1, 0x6e

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment$a;->c:Lcom/join/mgps/activity/PapaMainFragment;

    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainFragment$a;->b:Ljava/util/List;

    invoke-static {v0, v1, p1}, Lcom/join/mgps/activity/PapaMainFragment;->d0(Lcom/join/mgps/activity/PapaMainFragment;Ljava/util/List;I)V

    return-void
.end method
