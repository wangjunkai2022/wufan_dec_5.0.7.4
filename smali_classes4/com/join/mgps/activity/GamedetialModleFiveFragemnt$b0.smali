.class Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$b0;
.super Landroid/widget/BaseAdapter;
.source "GamedetialModleFiveFragemnt.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b0"
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$b0;->b:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$b0;->b:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;

    iget-object v0, v0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;->d2:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$b0;->b:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;

    iget-object v0, v0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;->d2:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$b0;->b:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;

    iget-object v0, v0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;->d2:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    if-nez p2, :cond_0

    .line 1
    iget-object p2, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$b0;->b:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;

    iget-object p2, p2, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;->p1:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const p3, 0x7f0c0548

    const/4 v0, 0x0

    invoke-virtual {p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 2
    new-instance p3, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$c0;

    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$b0;->b:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;

    invoke-direct {p3, v0}, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$c0;-><init>(Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;)V

    const v0, 0x7f09093c

    .line 3
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p3, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$c0;->a:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v0, 0x7f09091f

    .line 4
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p3, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$c0;->b:Landroid/widget/ImageView;

    const v0, 0x7f09169b

    .line 5
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p3, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$c0;->c:Landroid/widget/TextView;

    const v0, 0x7f091680

    .line 6
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p3, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$c0;->d:Landroid/widget/TextView;

    const v0, 0x7f090cf3

    .line 7
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p3, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$c0;->f:Landroid/widget/RelativeLayout;

    const v0, 0x7f09116a

    .line 8
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p3, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$c0;->g:Landroid/widget/RelativeLayout;

    .line 9
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$c0;

    .line 11
    :goto_0
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$b0;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    return-object p2

    .line 12
    :cond_1
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$b0;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;

    .line 13
    invoke-virtual {p1}, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;->getGame_list()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean$GameListBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean$GameListBean;->getGame_ico()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;->getGame_list()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean$GameListBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean$GameListBean;->getGame_ico()Ljava/lang/String;

    move-result-object v0

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 14
    iget-object v0, p3, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$c0;->a:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;->getGame_list()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean$GameListBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean$GameListBean;->getGame_ico()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/drawee/view/SimpleDraweeView;->setImageURI(Ljava/lang/String;)V

    goto :goto_1

    .line 15
    :cond_2
    iget-object v0, p3, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$c0;->a:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v1, 0x7f080983

    invoke-virtual {v0, v1}, Lcom/facebook/drawee/view/SimpleDraweeView;->setImageResource(I)V

    .line 16
    :goto_1
    iget-object v0, p3, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$c0;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    iget-object v0, p3, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$c0;->d:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;->getGame_count()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\u6b3e"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 18
    invoke-virtual {p1}, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;->getCurrent_game_state()Ljava/lang/String;

    move-result-object v0

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 19
    iget-object v0, p3, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$c0;->b:Landroid/widget/ImageView;

    const v1, 0x7f08049d

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_2

    .line 20
    :cond_3
    iget-object v0, p3, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$c0;->b:Landroid/widget/ImageView;

    const v1, 0x7f08049e

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 21
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$b0;->b:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;

    iget v1, v0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;->C1:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;->C1:I

    .line 22
    :goto_2
    iget-object v0, p3, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$c0;->g:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$b0$a;

    invoke-direct {v1, p0, p1, p3}, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$b0$a;-><init>(Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$b0;Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$c0;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p2
.end method
