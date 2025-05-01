.class Lcom/join/mgps/activity/SearchHintActivity$g;
.super Ljava/lang/Object;
.source "SearchHintActivity.java"

# interfaces
.implements Landroid/view/View$OnKeyListener;


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
    iput-object p1, p0, Lcom/join/mgps/activity/SearchHintActivity$g;->b:Lcom/join/mgps/activity/SearchHintActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 4

    const/4 p1, 0x0

    const/16 v0, 0x42

    if-ne p2, v0, :cond_2

    .line 1
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p2

    if-nez p2, :cond_2

    .line 2
    iget-object p2, p0, Lcom/join/mgps/activity/SearchHintActivity$g;->b:Lcom/join/mgps/activity/SearchHintActivity;

    invoke-virtual {p2}, Lcom/join/mgps/activity/SearchHintActivity;->E0()V

    .line 3
    iget-object p2, p0, Lcom/join/mgps/activity/SearchHintActivity$g;->b:Lcom/join/mgps/activity/SearchHintActivity;

    iget-object p2, p2, Lcom/join/mgps/activity/SearchHintActivity;->j:Landroid/widget/EditText;

    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, " "

    const-string v0, ""

    .line 4
    invoke-virtual {p2, p3, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 5
    iget-object p3, p0, Lcom/join/mgps/activity/SearchHintActivity$g;->b:Lcom/join/mgps/activity/SearchHintActivity;

    iget-object p3, p3, Lcom/join/mgps/activity/SearchHintActivity;->j:Landroid/widget/EditText;

    invoke-virtual {p3}, Landroid/widget/EditText;->clearFocus()V

    .line 6
    iget-object p3, p0, Lcom/join/mgps/activity/SearchHintActivity$g;->b:Lcom/join/mgps/activity/SearchHintActivity;

    iget-object p3, p3, Lcom/join/mgps/activity/SearchHintActivity;->m:Landroid/widget/ImageView;

    invoke-virtual {p3}, Landroid/widget/ImageView;->clearFocus()V

    const/4 p3, 0x2

    new-array p3, p3, [Ljava/lang/String;

    const-string v1, "setOnKeyListener"

    aput-object v1, p3, p1

    const/4 v1, 0x1

    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "keyword="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, p3, v1

    invoke-static {p3}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 8
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p3

    if-lez p3, :cond_0

    .line 9
    iget-object p3, p0, Lcom/join/mgps/activity/SearchHintActivity$g;->b:Lcom/join/mgps/activity/SearchHintActivity;

    invoke-virtual {p3, p2, v0}, Lcom/join/mgps/activity/SearchHintActivity;->C0(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 10
    :cond_0
    iget-object p2, p0, Lcom/join/mgps/activity/SearchHintActivity$g;->b:Lcom/join/mgps/activity/SearchHintActivity;

    iget-object p3, p2, Lcom/join/mgps/activity/SearchHintActivity;->h:Landroidx/viewpager2/widget/ViewPager2;

    if-eqz p3, :cond_1

    iget-object p2, p2, Lcom/join/mgps/activity/SearchHintActivity;->d:Ljava/util/ArrayList;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_1

    .line 11
    iget-object p2, p0, Lcom/join/mgps/activity/SearchHintActivity$g;->b:Lcom/join/mgps/activity/SearchHintActivity;

    iget-object p2, p2, Lcom/join/mgps/activity/SearchHintActivity;->h:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p2}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    move-result p2

    .line 12
    iget-object p3, p0, Lcom/join/mgps/activity/SearchHintActivity$g;->b:Lcom/join/mgps/activity/SearchHintActivity;

    iget-object p3, p3, Lcom/join/mgps/activity/SearchHintActivity;->d:Ljava/util/ArrayList;

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v1

    rem-int/2addr p2, v1

    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/SScrollingTxtBeanV2;

    .line 13
    iget-object p3, p0, Lcom/join/mgps/activity/SearchHintActivity$g;->b:Lcom/join/mgps/activity/SearchHintActivity;

    invoke-virtual {p2}, Lcom/join/mgps/dto/SScrollingTxtBeanV2;->getWord()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2, v0}, Lcom/join/mgps/activity/SearchHintActivity;->C0(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 14
    :cond_1
    iget-object p2, p0, Lcom/join/mgps/activity/SearchHintActivity$g;->b:Lcom/join/mgps/activity/SearchHintActivity;

    iget-object p2, p2, Lcom/join/mgps/activity/SearchHintActivity;->B1:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    if-lez p2, :cond_2

    .line 15
    iget-object p2, p0, Lcom/join/mgps/activity/SearchHintActivity$g;->b:Lcom/join/mgps/activity/SearchHintActivity;

    iget-object p3, p2, Lcom/join/mgps/activity/SearchHintActivity;->B1:Ljava/lang/String;

    invoke-virtual {p2, p3, v0}, Lcom/join/mgps/activity/SearchHintActivity;->C0(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_0
    return p1
.end method
