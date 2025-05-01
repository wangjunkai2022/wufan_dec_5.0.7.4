.class Lcom/join/mgps/activity/GameMainActivity4$d;
.super Ljava/lang/Object;
.source "GameMainActivity4.java"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GameMainActivity4;->s2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/GameMainActivity4;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GameMainActivity4;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GameMainActivity4$d;->b:Lcom/join/mgps/activity/GameMainActivity4;

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
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4$d;->b:Lcom/join/mgps/activity/GameMainActivity4;

    iget-object v0, v0, Lcom/join/mgps/activity/GameMainActivity4;->B1:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4$d;->b:Lcom/join/mgps/activity/GameMainActivity4;

    iget-object v0, v0, Lcom/join/mgps/activity/GameMainActivity4;->A1:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4$d;->b:Lcom/join/mgps/activity/GameMainActivity4;

    invoke-static {v0}, Lcom/join/mgps/activity/GameMainActivity4;->Z0(Lcom/join/mgps/activity/GameMainActivity4;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "\u52a8\u6001"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainActivity4$d;->b:Lcom/join/mgps/activity/GameMainActivity4;

    iget-object p1, p1, Lcom/join/mgps/activity/GameMainActivity4;->B1:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameMainActivity4$d;->b:Lcom/join/mgps/activity/GameMainActivity4;

    invoke-static {v0}, Lcom/join/mgps/activity/GameMainActivity4;->Z0(Lcom/join/mgps/activity/GameMainActivity4;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u6210\u5c31"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/GameMainActivity4$d;->b:Lcom/join/mgps/activity/GameMainActivity4;

    iget-object p1, p1, Lcom/join/mgps/activity/GameMainActivity4;->A1:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_1
    :goto_0
    return-void
.end method
