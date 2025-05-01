.class public Lcom/join/mgps/customview/widget/detail/GameInfoCardView;
.super Landroid/widget/LinearLayout;
.source "GameInfoCardView.java"

# interfaces
.implements Lcom/join/mgps/customview/widget/detail/b;


# instance fields
.field public b:Lcom/facebook/drawee/view/SimpleDraweeView;

.field public c:Landroid/widget/TextView;

.field public d:Landroid/widget/TextView;

.field public e:Landroid/widget/TextView;

.field public f:Landroid/widget/TextView;

.field public g:Lcom/join/mgps/customview/MStarBar;

.field public h:Landroid/widget/LinearLayout;

.field public i:Landroid/widget/LinearLayout;

.field public j:Landroid/widget/TextView;

.field public k:Landroid/widget/TextView;

.field l:Landroid/widget/RelativeLayout;

.field m:Lcom/papa91/arc/widget/htmltext/HtmlTextView;

.field private n:Lcom/join/mgps/customview/widget/detail/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->c(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->c(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 5
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->c(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic b(Lcom/join/mgps/customview/widget/detail/GameInfoCardView;)Lcom/join/mgps/customview/widget/detail/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->n:Lcom/join/mgps/customview/widget/detail/a;

    return-object p0
.end method

.method private c(Landroid/content/Context;)V
    .locals 1

    const v0, 0x7f0c07b1

    .line 1
    invoke-static {p1, v0, p0}, Landroid/widget/LinearLayout;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    const p1, 0x7f0900e0

    .line 2
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object p1, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    const p1, 0x7f0900e8

    .line 3
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->c:Landroid/widget/TextView;

    const p1, 0x7f0900dc

    .line 4
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->d:Landroid/widget/TextView;

    const p1, 0x7f0900f1

    .line 5
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->e:Landroid/widget/TextView;

    const p1, 0x7f0900df

    .line 6
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->f:Landroid/widget/TextView;

    const p1, 0x7f090353

    .line 7
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/customview/MStarBar;

    iput-object p1, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->g:Lcom/join/mgps/customview/MStarBar;

    const p1, 0x7f090379

    .line 8
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->h:Landroid/widget/LinearLayout;

    const p1, 0x7f0911f2

    .line 9
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->i:Landroid/widget/LinearLayout;

    const p1, 0x7f090356

    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->j:Landroid/widget/TextView;

    const p1, 0x7f090355

    .line 11
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->k:Landroid/widget/TextView;

    const p1, 0x7f091171

    .line 12
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->l:Landroid/widget/RelativeLayout;

    const p1, 0x7f0915f6

    .line 13
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/papa91/arc/widget/htmltext/HtmlTextView;

    iput-object p1, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->m:Lcom/papa91/arc/widget/htmltext/HtmlTextView;

    return-void
.end method

.method private d(Lcom/join/mgps/dto/GamedetialModleFourBean;)V
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_score()Lcom/join/mgps/dto/GameScore;

    move-result-object v0

    const-string v1, "1"

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getComment_score_switch()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameScore;->getScore()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "0.0"

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameScore;->getScore()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v1, "0"

    if-nez p1, :cond_1

    :try_start_1
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameScore;->getScore()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->j:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameScore;->getScore()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 5
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->k:Landroid/widget/TextView;

    const-string v2, "\u6682\u672a\u51fa\u5206"

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->j:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    :goto_1
    iget-object p1, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->g:Lcom/join/mgps/customview/MStarBar;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lcom/join/mgps/customview/MStarBar;->setIntegerMark(Z)V

    .line 8
    iget-object p1, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->g:Lcom/join/mgps/customview/MStarBar;

    invoke-virtual {p1, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 9
    iget-object p1, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->g:Lcom/join/mgps/customview/MStarBar;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameScore;->getTotal_stars()D

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Lcom/join/mgps/customview/MStarBar;->setStarMark(D)V

    .line 10
    iget-object p1, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->i:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_2

    .line 11
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->i:Landroid/widget/LinearLayout;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_2
    return-void
.end method


# virtual methods
.method public a(Lcom/join/mgps/dto/GamedetialModleFourBean;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getIco_remote()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCompany_name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getBespeak_switch()I

    move-result v0

    const-string v1, "M"

    const/4 v2, 0x0

    const/16 v3, 0x8

    const/4 v4, 0x1

    if-ne v0, v4, :cond_2

    .line 5
    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getAppSize()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getAppSize()Ljava/lang/String;

    move-result-object v0

    const-string v4, "0.00"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 6
    iget-object v0, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->e:Landroid/widget/TextView;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getAppSize()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 9
    :goto_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getBespeak_count()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 10
    iget-object v0, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->f:Landroid/widget/TextView;

    const-string v1, "\u5df2\u67090\u4eba\u9884\u7ea6"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    .line 11
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->f:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u5df2\u6709"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getBespeak_count()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\u4eba\u9884\u7ea6"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 12
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 13
    iget-object v0, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->f:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDown_count()I

    move-result v4

    invoke-static {v4}, Lcom/join/mgps/Util/g2;->c(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14
    iget-object v0, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->e:Landroid/widget/TextView;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getAppSize()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    :try_start_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDown_status()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_3

    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/TipNew;->getDown_res()Lcom/join/mgps/dto/TipBean;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 16
    iget-object v0, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->f:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/TipNew;->getDown_res()Lcom/join/mgps/dto/TipBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/TipBean;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 18
    :cond_3
    :goto_1
    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPlugin_num()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPlugin_num()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/join/mgps/enums/ConstantIntEnum;->H5:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v4}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ""

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 19
    iget-object v0, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 20
    iget-object v0, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->f:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getDown_count()I

    move-result v1

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->c(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f1000f7

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "\u5b89\u88c5"

    invoke-virtual {v1, v5, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    :cond_4
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->d(Lcom/join/mgps/dto/GamedetialModleFourBean;)V

    .line 22
    iget-object v0, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->i:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/join/mgps/customview/widget/detail/GameInfoCardView$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/customview/widget/detail/GameInfoCardView$a;-><init>(Lcom/join/mgps/customview/widget/detail/GameInfoCardView;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 23
    iget-object v0, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->h:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 24
    iget-object v0, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->d:Landroid/widget/TextView;

    new-instance v1, Lcom/join/mgps/customview/widget/detail/GameInfoCardView$b;

    invoke-direct {v1, p0, p1}, Lcom/join/mgps/customview/widget/detail/GameInfoCardView$b;-><init>(Lcom/join/mgps/customview/widget/detail/GameInfoCardView;Lcom/join/mgps/dto/GamedetialModleFourBean;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 25
    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_ranking_pos()Lcom/join/mgps/dto/GameDetailRankingTag;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 26
    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_ranking_pos()Lcom/join/mgps/dto/GameDetailRankingTag;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameDetailRankingTag;->getHot_game()Lcom/join/mgps/dto/GameDetailRankingTag$GameTagBean;

    move-result-object v0

    .line 27
    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_ranking_pos()Lcom/join/mgps/dto/GameDetailRankingTag;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameDetailRankingTag;->getTag_game()Lcom/join/mgps/dto/GameDetailRankingTag$GameTagBean;

    move-result-object v1

    .line 28
    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_ranking_pos()Lcom/join/mgps/dto/GameDetailRankingTag;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/GameDetailRankingTag;->getTag_game()Lcom/join/mgps/dto/GameDetailRankingTag$GameTagBean;

    move-result-object p1

    if-eqz v0, :cond_5

    goto :goto_2

    :cond_5
    if-eqz v1, :cond_6

    move-object v0, v1

    goto :goto_2

    :cond_6
    move-object v0, p1

    :goto_2
    if-eqz v0, :cond_7

    .line 29
    iget-object p1, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 30
    iget-object p1, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->m:Lcom/papa91/arc/widget/htmltext/HtmlTextView;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameDetailRankingTag$GameTagBean;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/papa91/arc/widget/htmltext/HtmlTextView;->setHtml(Ljava/lang/String;)V

    goto :goto_3

    .line 31
    :cond_7
    iget-object p1, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 32
    :goto_3
    iget-object p1, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->l:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/join/mgps/customview/widget/detail/GameInfoCardView$c;

    invoke-direct {v1, p0, v0}, Lcom/join/mgps/customview/widget/detail/GameInfoCardView$c;-><init>(Lcom/join/mgps/customview/widget/detail/GameInfoCardView;Lcom/join/mgps/dto/GameDetailRankingTag$GameTagBean;)V

    invoke-virtual {p1, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_4

    .line 33
    :cond_8
    iget-object p1, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    :goto_4
    return-void
.end method

.method public getContentView()Landroid/view/View;
    .locals 0

    return-object p0
.end method

.method public setGameInfoCallback(Lcom/join/mgps/customview/widget/detail/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/widget/detail/GameInfoCardView;->n:Lcom/join/mgps/customview/widget/detail/a;

    return-void
.end method
