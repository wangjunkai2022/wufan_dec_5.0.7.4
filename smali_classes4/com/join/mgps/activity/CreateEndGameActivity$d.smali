.class Lcom/join/mgps/activity/CreateEndGameActivity$d;
.super Ljava/lang/Object;
.source "CreateEndGameActivity.java"

# interfaces
.implements Lcom/join/mgps/base/BaseQuickAdapter$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/CreateEndGameActivity;->u0(Landroid/view/View;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/CreateEndGameActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/CreateEndGameActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/CreateEndGameActivity$d;->a:Lcom/join/mgps/activity/CreateEndGameActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameActivity$d;->a:Lcom/join/mgps/activity/CreateEndGameActivity;

    iget-object p1, p1, Lcom/join/mgps/activity/CreateEndGameActivity;->h:Landroid/widget/LinearLayout;

    if-eqz p1, :cond_0

    const/4 p2, 0x0

    .line 2
    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameActivity$d;->a:Lcom/join/mgps/activity/CreateEndGameActivity;

    iget-object p1, p1, Lcom/join/mgps/activity/CreateEndGameActivity;->k:Landroid/widget/TextView;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameActivity$d;->a:Lcom/join/mgps/activity/CreateEndGameActivity;

    iget-object p2, p1, Lcom/join/mgps/activity/CreateEndGameActivity;->u:Lcom/join/mgps/activity/CreateEndGameActivity$g;

    invoke-virtual {p2, p3}, Lcom/join/mgps/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/BossBean;

    iput-object p2, p1, Lcom/join/mgps/activity/CreateEndGameActivity;->E:Lcom/join/mgps/dto/BossBean;

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameActivity$d;->a:Lcom/join/mgps/activity/CreateEndGameActivity;

    iget-object p2, p1, Lcom/join/mgps/activity/CreateEndGameActivity;->E:Lcom/join/mgps/dto/BossBean;

    if-eqz p2, :cond_0

    .line 6
    iget-object p1, p1, Lcom/join/mgps/activity/CreateEndGameActivity;->i:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/join/mgps/dto/BossBean;->getBoos()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameActivity$d;->a:Lcom/join/mgps/activity/CreateEndGameActivity;

    iget-object p2, p1, Lcom/join/mgps/activity/CreateEndGameActivity;->j:Landroid/widget/TextView;

    iget-object p1, p1, Lcom/join/mgps/activity/CreateEndGameActivity;->E:Lcom/join/mgps/dto/BossBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/BossBean;->getLevel()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameActivity$d;->a:Lcom/join/mgps/activity/CreateEndGameActivity;

    iget-object p1, p1, Lcom/join/mgps/activity/CreateEndGameActivity;->i:Landroid/widget/TextView;

    const-string p2, "#6194FF"

    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p3

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 9
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameActivity$d;->a:Lcom/join/mgps/activity/CreateEndGameActivity;

    iget-object p1, p1, Lcom/join/mgps/activity/CreateEndGameActivity;->j:Landroid/widget/TextView;

    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 10
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/CreateEndGameActivity$d;->a:Lcom/join/mgps/activity/CreateEndGameActivity;

    iget-object p1, p1, Lcom/join/mgps/activity/CreateEndGameActivity;->C:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    invoke-virtual {p1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->p()V

    return-void
.end method
