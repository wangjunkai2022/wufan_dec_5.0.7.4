.class Lcom/join/mgps/activity/SearchHintActivity$f;
.super Ljava/lang/Object;
.source "SearchHintActivity.java"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/SearchHintActivity;->afterViews()V
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
    iput-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$f;->b:Lcom/join/mgps/activity/SearchHintActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 3

    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/String;

    const-string v0, "onFocusChange"

    const/4 v1, 0x0

    aput-object v0, p1, v1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "hasFocus="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    aput-object v0, p1, v2

    invoke-static {p1}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$f;->b:Lcom/join/mgps/activity/SearchHintActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/SearchHintActivity;->l1()V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$f;->b:Lcom/join/mgps/activity/SearchHintActivity;

    iget-object v0, p1, Lcom/join/mgps/activity/SearchHintActivity;->h:Landroidx/viewpager2/widget/ViewPager2;

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    .line 4
    iget-object p1, p1, Lcom/join/mgps/activity/SearchHintActivity;->x:Lcom/youth/banner/Banner;

    invoke-virtual {p1, v1}, Lcom/youth/banner/Banner;->q(Z)Lcom/youth/banner/Banner;

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$f;->b:Lcom/join/mgps/activity/SearchHintActivity;

    iget-object p1, p1, Lcom/join/mgps/activity/SearchHintActivity;->h:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    move-result p1

    .line 6
    iget-object p2, p0, Lcom/join/mgps/activity/SearchHintActivity$f;->b:Lcom/join/mgps/activity/SearchHintActivity;

    iget-object p2, p2, Lcom/join/mgps/activity/SearchHintActivity;->d:Ljava/util/ArrayList;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_1

    .line 7
    iget-object p2, p0, Lcom/join/mgps/activity/SearchHintActivity$f;->b:Lcom/join/mgps/activity/SearchHintActivity;

    iget-object p2, p2, Lcom/join/mgps/activity/SearchHintActivity;->d:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    rem-int/2addr p1, v0

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/SScrollingTxtBeanV2;

    .line 8
    iget-object p2, p0, Lcom/join/mgps/activity/SearchHintActivity$f;->b:Lcom/join/mgps/activity/SearchHintActivity;

    iget-object p2, p2, Lcom/join/mgps/activity/SearchHintActivity;->h:Landroidx/viewpager2/widget/ViewPager2;

    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    if-eqz p1, :cond_1

    .line 9
    iget-object p2, p0, Lcom/join/mgps/activity/SearchHintActivity$f;->b:Lcom/join/mgps/activity/SearchHintActivity;

    iget-object p2, p2, Lcom/join/mgps/activity/SearchHintActivity;->j:Landroid/widget/EditText;

    invoke-virtual {p1}, Lcom/join/mgps/dto/SScrollingTxtBeanV2;->getWord()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    .line 10
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$f;->b:Lcom/join/mgps/activity/SearchHintActivity;

    iget-object p1, p1, Lcom/join/mgps/activity/SearchHintActivity;->j:Landroid/widget/EditText;

    invoke-static {p1}, Lo2/a;->c(Landroid/view/View;)V

    goto :goto_0

    .line 11
    :cond_0
    iget-object p1, p1, Lcom/join/mgps/activity/SearchHintActivity;->x:Lcom/youth/banner/Banner;

    invoke-virtual {p1, v2}, Lcom/youth/banner/Banner;->q(Z)Lcom/youth/banner/Banner;

    .line 12
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$f;->b:Lcom/join/mgps/activity/SearchHintActivity;

    iget-object p1, p1, Lcom/join/mgps/activity/SearchHintActivity;->h:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 13
    iget-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$f;->b:Lcom/join/mgps/activity/SearchHintActivity;

    iget-object p1, p1, Lcom/join/mgps/activity/SearchHintActivity;->j:Landroid/widget/EditText;

    const-string p2, ""

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    :cond_1
    :goto_0
    return-void
.end method
