.class Lcom/join/mgps/activity/SearchHintActivity$l;
.super Ljava/lang/Object;
.source "SearchHintActivity.java"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/SearchHintActivity;->H0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/SearchHintActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/SearchHintActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$l;->b:Lcom/join/mgps/activity/SearchHintActivity;

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
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$l;->b:Lcom/join/mgps/activity/SearchHintActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/SearchHintActivity;->h:Landroidx/viewpager2/widget/ViewPager2;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$l;->b:Lcom/join/mgps/activity/SearchHintActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/SearchHintActivity;->h:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$l;->b:Lcom/join/mgps/activity/SearchHintActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/SearchHintActivity;->d:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$l;->b:Lcom/join/mgps/activity/SearchHintActivity;

    iget-object v1, v0, Lcom/join/mgps/activity/SearchHintActivity;->j:Landroid/widget/EditText;

    iget-object v0, v0, Lcom/join/mgps/activity/SearchHintActivity;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/SScrollingTxtBeanV2;

    invoke-virtual {v0}, Lcom/join/mgps/dto/SScrollingTxtBeanV2;->getWord()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/SearchHintActivity$l;->b:Lcom/join/mgps/activity/SearchHintActivity;

    sget-object v1, Lcom/papa/sim/statistic/Event;->searchReturnExpGamePic:Lcom/papa/sim/statistic/Event;

    invoke-static {v0, v1, p1}, Lcom/join/mgps/activity/SearchHintActivity;->l0(Lcom/join/mgps/activity/SearchHintActivity;Lcom/papa/sim/statistic/Event;I)V

    return-void
.end method
