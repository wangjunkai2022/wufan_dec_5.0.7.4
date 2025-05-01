.class public Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;
.super Lcom/BaseAppCompatActivity;
.source "GamedetailVideoMainActivity.java"


# annotations
.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c02ff
.end annotation


# static fields
.field private static final BUNDLE_FRAGMENTS_KEY:Ljava/lang/String; = "android:support:fragments"

.field private static final OPTION_VIEW:Ljava/lang/String; = "view"

.field public static hasInAnim:Z


# instance fields
.field autodown:Z
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field backImg:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private context:Landroid/content/Context;

.field private detailTabDarkColor:Z

.field extBean:Lcom/join/mgps/dto/ExtBean;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field fragment:Landroid/widget/FrameLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field fragmentDetial:Lcom/join/mgps/activity/gamedetail/BaseGameDetailFragment;

.field fragmentVideo:Lcom/join/mgps/activity/gamedetail/GameDetailVideoFragment;

.field private fragments:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/Fragment;",
            ">;"
        }
    .end annotation
.end field

.field from:I
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field gameId:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field isFromVideo:Z

.field isShowComment:Z
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field iv_back:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field layout_new:Landroidx/constraintlayout/widget/ConstraintLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field layout_old:Landroid/widget/RelativeLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field loding_faile:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field loding_layout:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field mainCover:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field main_content:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private modleFourBeanShow:Lcom/join/mgps/dto/GamedetialModleFourBean;

.field prefDef:Lcom/join/mgps/pref/PrefDef_;
    .annotation build Lorg/androidannotations/annotations/sharedpreferences/Pref;
    .end annotation
.end field

.field setNetwork:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field showCover:Z

.field statuHVIew:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private statubarH:I

.field private tabTitles:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field tablayout:Lcom/google/android/material/tabs/TabLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private tintManager:Lcom/join/android/app/common/manager/b;

.field viewPager:Landroidx/viewpager/widget/ViewPager;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field viewpager:Landroidx/viewpager2/widget/ViewPager2;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field xoffW:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/BaseAppCompatActivity;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->tabTitles:Ljava/util/ArrayList;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->fragments:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->detailTabDarkColor:Z

    const/4 v1, 0x0

    .line 5
    iput-object v1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->fragmentVideo:Lcom/join/mgps/activity/gamedetail/GameDetailVideoFragment;

    .line 6
    iput-object v1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->fragmentDetial:Lcom/join/mgps/activity/gamedetail/BaseGameDetailFragment;

    .line 7
    iput-boolean v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->showCover:Z

    const/16 v1, 0xc8

    .line 8
    iput v1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->xoffW:I

    .line 9
    iput-boolean v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->isFromVideo:Z

    return-void
.end method

.method static synthetic access$000(Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->sendPoint(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$100(Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->context:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic access$200(Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->refreshTab()V

    return-void
.end method

.method static synthetic access$300(Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->fragments:Ljava/util/ArrayList;

    return-object p0
.end method

.method private backCheck()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->isFromVideo:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->fragmentDetial:Lcom/join/mgps/activity/gamedetail/BaseGameDetailFragment;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/activity/gamedetail/BaseGameDetailFragment;->backpressedTofinishActivity()V

    :cond_0
    return-void
.end method

.method private getStatusBarHeight(Landroid/content/Context;)I
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "status_bar_height"

    const-string v2, "dimen"

    const-string v3, "android"

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private refreshTab()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->tablayout:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->getSelectedTabPosition()I

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-boolean v1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->detailTabDarkColor:Z

    if-nez v1, :cond_0

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->backImg:Landroid/widget/ImageView;

    const v2, 0x7f08015e

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->backImg:Landroid/widget/ImageView;

    const v2, 0x7f08015c

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    :goto_0
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 5
    :goto_1
    iget-object v3, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->tablayout:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v3}, Lcom/google/android/material/tabs/TabLayout;->getTabCount()I

    move-result v3

    if-ge v2, v3, :cond_7

    .line 6
    iget-object v3, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->tablayout:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v3, v2}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v3

    if-eqz v3, :cond_6

    .line 7
    invoke-virtual {v3}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_6

    .line 8
    invoke-virtual {v3}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v4

    const v5, 0x7f091691

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 9
    invoke-virtual {v3}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v5

    const v6, 0x7f091645

    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 10
    invoke-virtual {v3}, Lcom/google/android/material/tabs/TabLayout$Tab;->isSelected()Z

    move-result v3

    const/4 v6, -0x1

    if-eqz v3, :cond_3

    const-string v3, "sans-serif-medium"

    .line 11
    invoke-static {v3, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v3

    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const/high16 v3, -0x1000000

    if-nez v0, :cond_1

    .line 12
    iget-boolean v7, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->detailTabDarkColor:Z

    if-nez v7, :cond_1

    const/4 v7, -0x1

    goto :goto_2

    :cond_1
    const/high16 v7, -0x1000000

    :goto_2
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setTextColor(I)V

    if-nez v0, :cond_2

    .line 13
    iget-boolean v4, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->detailTabDarkColor:Z

    if-nez v4, :cond_2

    goto :goto_3

    :cond_2
    const/high16 v6, -0x1000000

    :goto_3
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_6

    .line 14
    :cond_3
    sget-object v3, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const-string v3, "#919191"

    if-nez v0, :cond_4

    .line 15
    iget-boolean v7, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->detailTabDarkColor:Z

    if-nez v7, :cond_4

    const/4 v7, -0x1

    goto :goto_4

    :cond_4
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    :goto_4
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setTextColor(I)V

    if-nez v0, :cond_5

    .line 16
    iget-boolean v4, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->detailTabDarkColor:Z

    if-nez v4, :cond_5

    goto :goto_5

    :cond_5
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    :goto_5
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_6
    :goto_6
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_1

    :cond_7
    return-void
.end method

.method private sendPoint(Ljava/lang/String;)V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    const-string v1, ""

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/dto/ExtBean;->getFrom()Ljava/lang/String;

    move-result-object v0

    .line 3
    iget-object v2, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/ExtBean;->getLocation()Ljava/lang/String;

    move-result-object v2

    .line 4
    :try_start_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 5
    iget-object v3, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/join/mgps/dto/ExtBean;->set_from_type(I)Lcom/join/mgps/dto/ExtBean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    .line 6
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    .line 7
    :cond_0
    :goto_0
    iget-object v3, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/ExtBean;->getDataFlag()Ljava/lang/String;

    move-result-object v3

    .line 8
    iget-object v4, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/ExtBean;->getKeyword()Ljava/lang/String;

    move-result-object v4

    .line 9
    iget-object v5, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/ExtBean;->getWhere()Ljava/lang/String;

    move-result-object v5

    move-object v11, v3

    move-object v12, v4

    move-object v13, v5

    goto :goto_1

    :cond_1
    move-object v0, v1

    move-object v2, v0

    move-object v11, v2

    move-object v12, v11

    move-object v13, v12

    .line 10
    :goto_1
    iget-object v3, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lcom/join/mgps/dto/ExtBean;->get_from_type()I

    move-result v3

    if-eqz v3, :cond_2

    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/ExtBean;->get_from_type()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 12
    iget-object v2, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/ExtBean;->getRecPosition()Ljava/lang/String;

    move-result-object v2

    :cond_2
    move-object v6, v0

    move-object v8, v2

    const-string v0, "112"

    .line 13
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "147"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 14
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ExtBean;->getReMarks()Ljava/lang/String;

    move-result-object v1

    :cond_4
    move-object v10, v1

    .line 15
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v3

    iget-object v4, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->gameId:Ljava/lang/String;

    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v5

    move-object v7, p1

    move-object v9, p1

    invoke-virtual/range {v3 .. v13}, Lcom/papa/sim/statistic/p;->t2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static startTActivity(Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;ZLcom/join/mgps/dto/ExtBean;)V
    .locals 2

    .line 1
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "isFromVideo"

    const/4 v1, 0x1

    .line 2
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string v0, "gameId"

    .line 3
    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p2, "autodown"

    .line 4
    invoke-virtual {p1, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string p2, "extBean"

    .line 5
    invoke-virtual {p1, p2, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 6
    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method afterviews()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    iput-object p0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->context:Landroid/content/Context;

    .line 2
    invoke-direct {p0, p0}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->getStatusBarHeight(Landroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->statubarH:I

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->statuHVIew:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 4
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_0

    .line 5
    iget v1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->statubarH:I

    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->statuHVIew:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    .line 7
    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 8
    iget-object v1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->statuHVIew:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 9
    :goto_0
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f07122c

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->xoffW:I

    .line 10
    invoke-virtual {p0}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->getDetialData()V

    return-void
.end method

.method animFinish()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
        delay = 0x258L
    .end annotation

    const/4 v0, 0x0

    .line 1
    sput-boolean v0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->hasInAnim:Z

    return-void
.end method

.method public autoPlayVideo(Lcom/join/android/app/component/video/StandardVideoView;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->viewPager:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->viewPager:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_2

    .line 2
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_1

    return-void

    :cond_1
    if-eqz p1, :cond_2

    .line 3
    invoke-virtual {p1}, Lcom/join/android/app/component/video/StandardVideoView;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 4
    invoke-virtual {p1}, Lcom/join/android/app/component/video/StandardVideoView;->startPlayLogic()V

    :cond_2
    return-void
.end method

.method backImg()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->finish()V

    return-void
.end method

.method protected clearFragmentsTag()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public clickBack()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->backCheck()V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->finish()V

    return-void
.end method

.method public finish()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->fragmentVideo:Lcom/join/mgps/activity/gamedetail/GameDetailVideoFragment;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/activity/gamedetail/GameDetailVideoFragment;->clearVideo()V

    .line 3
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method getDetialData()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    if-nez v0, :cond_0

    .line 3
    invoke-static {}, Lcom/wufan/user/service/protobuf/n0;->b5()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    .line 4
    :cond_0
    new-instance v1, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v1}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 5
    iget-object v2, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->context:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 6
    new-instance v2, Lcom/join/kotlin/discount/model/request/GameDetailRequest;

    iget-object v3, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->gameId:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v4

    invoke-virtual {v4}, Lp1/f;->A()Ljava/util/List;

    move-result-object v4

    invoke-direct {v2, v3, v0, v4}, Lcom/join/kotlin/discount/model/request/GameDetailRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 7
    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 8
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/rpc/impl/i;->B0()Le2/i;

    move-result-object v0

    invoke-virtual {v1}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v1

    invoke-interface {v0, v1}, Le2/i;->w(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;

    move-result-object v0

    invoke-interface {v0}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    move-result-object v0

    invoke-virtual {v0}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ResponseModel;

    if-eqz v0, :cond_2

    .line 9
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_2

    .line 10
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/model/bean/GameDetailDataBean;

    .line 11
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/GameDetailDataBean;->getWf_data()Lcom/join/mgps/dto/GamedetialModleFourBean;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 12
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/GameDetailDataBean;->getWf_data()Lcom/join/mgps/dto/GamedetialModleFourBean;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->updateUi(Lcom/join/mgps/dto/GamedetialModleFourBean;)V

    return-void

    .line 13
    :cond_1
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/GameDetailDataBean;->getDiscount_data()Lcom/join/kotlin/discount/model/bean/GameDetailBean;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 14
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/GameDetailDataBean;->getDiscount_data()Lcom/join/kotlin/discount/model/bean/GameDetailBean;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->updateNewUi(Lcom/join/kotlin/discount/model/bean/GameDetailBean;)V

    return-void

    .line 15
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->showLodingFailed()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 17
    invoke-virtual {p0}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->showLodingFailed()V

    goto :goto_0

    .line 18
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->showLodingFailed()V

    :goto_0
    return-void
.end method

.method public getModleFourBeanShow()Lcom/join/mgps/dto/GamedetialModleFourBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->modleFourBeanShow:Lcom/join/mgps/dto/GamedetialModleFourBean;

    return-object v0
.end method

.method public getModleFourFragment()Lcom/join/mgps/activity/gamedetail/BaseGameDetailFragment;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->fragmentDetial:Lcom/join/mgps/activity/gamedetail/BaseGameDetailFragment;

    return-object v0
.end method

.method public getTabBottom()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->tablayout:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v0}, Landroid/widget/HorizontalScrollView;->getBottom()I

    move-result v0

    return v0
.end method

.method public getViewpagerCurrentPage()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->viewPager:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v0

    return v0
.end method

.method public gethideOrshowCover()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->showCover:Z

    return v0
.end method

.method hideLoadingDelay()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
        delay = 0xc8L
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->iv_back:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->main_content:Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->loding_layout:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->loding_faile:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->mainCover:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method iv_back()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->backCheck()V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->finish()V

    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->fragmentVideo:Lcom/join/mgps/activity/gamedetail/GameDetailVideoFragment;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/activity/gamedetail/GameDetailVideoFragment;->clearVideo()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->fragmentVideo:Lcom/join/mgps/activity/gamedetail/GameDetailVideoFragment;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/activity/gamedetail/GameDetailVideoFragment;->onDestroy()V

    .line 5
    :cond_1
    invoke-direct {p0}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->backCheck()V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->fragmentDetial:Lcom/join/mgps/activity/gamedetail/BaseGameDetailFragment;

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {v0}, Lcom/join/mgps/activity/gamedetail/BaseGameDetailFragment;->onBackPressedMy()Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    .line 8
    :cond_2
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onBackPressed()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->clearFragmentsTag()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "android:support:fragments"

    .line 2
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 3
    :cond_0
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->clearFragmentsTag()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "android:support:fragments"

    .line 3
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method relodingimag()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->showLoding()V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->getDetialData()V

    return-void
.end method

.method scroolToposition()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
        delay = 0x4e2L
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->viewPager:Landroidx/viewpager/widget/ViewPager;

    iget v1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->xoffW:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->scrollTo(II)V

    return-void
.end method

.method public selectTab(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->viewpager:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0, p1}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(I)V

    return-void
.end method

.method setNetwork()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->w3(Landroid/content/Context;)V

    return-void
.end method

.method public setTabIsDarkColor(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->detailTabDarkColor:Z

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->refreshTab()V

    return-void
.end method

.method shakeAnim()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
        delay = 0x3e8L
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 1
    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    const-wide/16 v1, 0x258

    .line 2
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 3
    new-instance v1, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity$5;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity$5;-><init>(Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 4
    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 5
    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 6
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public shakeAnimback()V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 1
    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    const-wide/16 v1, 0x258

    .line 2
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 3
    new-instance v1, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity$6;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity$6;-><init>(Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 4
    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 5
    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 6
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 7
    invoke-virtual {p0}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->animFinish()V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->prefDef:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->firstIntentgamedetialVideo()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    return-void

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method showLoding()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->loding_layout:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->loding_faile:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method showLodingFailed()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->loding_layout:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->modleFourBeanShow:Lcom/join/mgps/dto/GamedetialModleFourBean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->loding_faile:Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->setNetwork:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->setNetwork:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    :goto_0
    return-void
.end method

.method updateNewUi(Lcom/join/kotlin/discount/model/bean/GameDetailBean;)V
    .locals 7
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->layout_old:Landroid/widget/RelativeLayout;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->layout_new:Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->hideLoadingDelay()V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->tabTitles:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->tabTitles:Ljava/util/ArrayList;

    const-string v2, "\u8be6\u60c5"

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->tabTitles:Ljava/util/ArrayList;

    const-string v2, "\u8bc4\u4ef7"

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    iget-object p1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->tabTitles:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 8
    iget-object v3, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->tablayout:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v3}, Lcom/google/android/material/tabs/TabLayout;->newTab()Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v3

    const v4, 0x7f0c04e6

    invoke-virtual {v3, v4}, Lcom/google/android/material/tabs/TabLayout$Tab;->setCustomView(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v3

    .line 9
    invoke-virtual {v3}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v4

    const v5, 0x7f091691

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 10
    invoke-virtual {v3}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v5

    const v6, 0x7f091645

    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 11
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v2, -0x1

    .line 12
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 13
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 14
    iget-object v2, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->tablayout:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v2, v3}, Lcom/google/android/material/tabs/TabLayout;->addTab(Lcom/google/android/material/tabs/TabLayout$Tab;)V

    goto :goto_0

    .line 15
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->tablayout:Lcom/google/android/material/tabs/TabLayout;

    new-instance v0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity$2;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity$2;-><init>(Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;)V

    invoke-virtual {p1, v0}, Lcom/google/android/material/tabs/TabLayout;->addOnTabSelectedListener(Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;)V

    .line 16
    iget-object p1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->fragments:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    const/4 p1, 0x0

    .line 17
    :goto_1
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->tabTitles:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_3

    .line 18
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 19
    iget-object v2, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->tabTitles:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "type"

    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    iget-object v2, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->gameId:Ljava/lang/String;

    const-string v3, "gameId"

    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-nez p1, :cond_1

    .line 21
    new-instance v2, Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-direct {v2}, Lcom/join/kotlin/discount/GameDetailFragment;-><init>()V

    goto :goto_2

    :cond_1
    const/4 v2, 0x1

    if-ne p1, v2, :cond_2

    .line 22
    new-instance v2, Lcom/join/kotlin/discount/GameDetailCommentListFragment;

    invoke-direct {v2}, Lcom/join/kotlin/discount/GameDetailCommentListFragment;-><init>()V

    goto :goto_2

    .line 23
    :cond_2
    new-instance v2, Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-direct {v2}, Lcom/join/kotlin/discount/GameDetailFragment;-><init>()V

    .line 24
    :goto_2
    invoke-virtual {v2, v0}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 25
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->fragments:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    .line 26
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->viewpager:Landroidx/viewpager2/widget/ViewPager2;

    new-instance v0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity$3;

    invoke-direct {v0, p0, p0}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity$3;-><init>(Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;Landroidx/fragment/app/FragmentActivity;)V

    invoke-virtual {p1, v0}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 27
    iget-object p1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->viewpager:Landroidx/viewpager2/widget/ViewPager2;

    new-instance v0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity$4;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity$4;-><init>(Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;)V

    invoke-virtual {p1, v0}, Landroidx/viewpager2/widget/ViewPager2;->registerOnPageChangeCallback(Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;)V

    .line 28
    iget-object p1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->viewpager:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p1, v1}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(I)V

    return-void
.end method

.method updateUi(Lcom/join/mgps/dto/GamedetialModleFourBean;)V
    .locals 11
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->modleFourBeanShow:Lcom/join/mgps/dto/GamedetialModleFourBean;

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->layout_old:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->layout_new:Landroidx/constraintlayout/widget/ConstraintLayout;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getTag_info()Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/q1;->e(Ljava/util/ArrayList;)Z

    move-result v0

    .line 5
    iget-object v3, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    if-eqz v3, :cond_0

    .line 6
    iget-object v4, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->modleFourBeanShow:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/ExtBean;->get_from_type()I

    move-result v3

    invoke-virtual {v4, v3}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 7
    iget-object v3, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->modleFourBeanShow:Lcom/join/mgps/dto/GamedetialModleFourBean;

    iget-object v4, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/ExtBean;->getRecPosition()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/join/mgps/dto/DownloadPointBase;->setRecPosition(Ljava/lang/String;)V

    .line 8
    iget-object v3, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/ExtBean;->getVolcanoOther()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 9
    iget-object v3, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->modleFourBeanShow:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v4

    iget-object v5, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/ExtBean;->getVolcanoOther()Ljava/lang/String;

    move-result-object v5

    const-class v6, Lcom/psk/eventmodule/StatFactory$VolcanoOther;

    invoke-virtual {v4, v5, v6}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/psk/eventmodule/StatFactory$VolcanoOther;

    invoke-virtual {v3, v4}, Lcom/join/mgps/dto/DownloadPointBase;->setPosition_path(Lcom/psk/eventmodule/StatFactory$VolcanoOther;)V

    .line 10
    :cond_0
    iget-object v3, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->modleFourBeanShow:Lcom/join/mgps/dto/GamedetialModleFourBean;

    const/16 v4, 0x65

    invoke-virtual {v3, v4}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 11
    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getVideo_and_cover()Lcom/join/mgps/activity/gamedetail/GamedetailViewbean;

    move-result-object v3

    const-string v4, "autodown"

    const-string v5, "isFromVideo"

    const-string v6, "extBean"

    const-string v7, "gameId"

    const/4 v8, 0x1

    if-eqz v3, :cond_5

    .line 12
    invoke-virtual {v3}, Lcom/join/mgps/activity/gamedetail/GamedetailViewbean;->getVideo_url()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_5

    iget v9, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->from:I

    const/4 v10, 0x2

    if-ne v9, v10, :cond_5

    .line 13
    iget-object v9, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->iv_back:Landroid/view/View;

    invoke-virtual {v9, v2}, Landroid/view/View;->setVisibility(I)V

    .line 14
    iget-object v9, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->main_content:Landroid/view/View;

    invoke-virtual {v9, v1}, Landroid/view/View;->setVisibility(I)V

    .line 15
    iget-object v9, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->loding_layout:Landroid/view/View;

    invoke-virtual {v9, v2}, Landroid/view/View;->setVisibility(I)V

    .line 16
    iget-object v9, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->loding_faile:Landroid/view/View;

    invoke-virtual {v9, v2}, Landroid/view/View;->setVisibility(I)V

    .line 17
    iget-object v2, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->viewPager:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 18
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 19
    iget-object v9, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->prefDef:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v9}, Lcom/join/mgps/pref/PrefDef_;->firstIntentgamedetialVideo()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v9

    invoke-virtual {v9}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-eqz v9, :cond_1

    .line 20
    iput-boolean v8, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->showCover:Z

    .line 21
    sput-boolean v8, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->hasInAnim:Z

    .line 22
    :cond_1
    new-instance v10, Lcom/join/mgps/activity/gamedetail/GameDetailVideoFragment_;

    invoke-direct {v10}, Lcom/join/mgps/activity/gamedetail/GameDetailVideoFragment_;-><init>()V

    iput-object v10, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->fragmentVideo:Lcom/join/mgps/activity/gamedetail/GameDetailVideoFragment;

    .line 23
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v10

    invoke-virtual {v10, v5, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 24
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v10

    invoke-virtual {v10, v7}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    iput-object v10, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->gameId:Ljava/lang/String;

    .line 25
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v10

    invoke-virtual {v10, v4, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->autodown:Z

    .line 26
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1, v6}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/ExtBean;

    iput-object v1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    .line 27
    :cond_2
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v4, "videoDatas"

    .line 28
    invoke-virtual {v1, v4, v3}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 29
    iget-object v3, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v1, v6, v3}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 30
    iget-object v3, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->gameId:Ljava/lang/String;

    invoke-virtual {v1, v7, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    iget-object v3, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->fragmentVideo:Lcom/join/mgps/activity/gamedetail/GameDetailVideoFragment;

    invoke-virtual {v3, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 32
    new-instance v1, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;

    iget-object v3, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->fragmentVideo:Lcom/join/mgps/activity/gamedetail/GameDetailVideoFragment;

    const-string v4, "\u89c6\u9891"

    invoke-direct {v1, v4, v3}, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;-><init>(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 33
    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getBt_game_switch()I

    move-result p1

    const-string v1, "\u8be6\u60c5"

    if-ne p1, v8, :cond_3

    .line 34
    iget-object p1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->gameId:Ljava/lang/String;

    iget-object v3, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    iget-boolean v4, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->autodown:Z

    iget-boolean v6, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->isShowComment:Z

    invoke-static {p1, v3, v4, v5, v6}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->w0(Ljava/lang/String;Lcom/join/mgps/dto/ExtBean;ZZZ)Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->fragmentDetial:Lcom/join/mgps/activity/gamedetail/BaseGameDetailFragment;

    .line 35
    new-instance v3, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;

    invoke-direct {v3, v1, p1}, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;-><init>(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 36
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->gameId:Ljava/lang/String;

    iget-object v3, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    iget-boolean v4, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->autodown:Z

    iget-boolean v6, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->isShowComment:Z

    invoke-static {p1, v3, v4, v5, v6}, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;->A0(Ljava/lang/String;Lcom/join/mgps/dto/ExtBean;ZZZ)Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->fragmentDetial:Lcom/join/mgps/activity/gamedetail/BaseGameDetailFragment;

    .line 37
    new-instance v3, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;

    invoke-direct {v3, v1, p1}, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;-><init>(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    :goto_0
    new-instance p1, Lcom/join/mgps/adapter/FragmentPagerAdapter;

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    invoke-direct {p1, v1, v2}, Lcom/join/mgps/adapter/FragmentPagerAdapter;-><init>(Landroidx/fragment/app/FragmentManager;Ljava/util/List;)V

    .line 39
    iget-object v1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->viewPager:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v1, p1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 40
    iget-object p1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->viewPager:Landroidx/viewpager/widget/ViewPager;

    new-instance v1, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity$1;

    invoke-direct {v1, p0, v0}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity$1;-><init>(Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;Z)V

    invoke-virtual {p1, v1}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    if-eqz v9, :cond_4

    .line 41
    iput-boolean v8, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->showCover:Z

    .line 42
    sput-boolean v8, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->hasInAnim:Z

    .line 43
    invoke-virtual {p0}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->shakeAnim()V

    :cond_4
    const-string p1, "1"

    .line 44
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->sendPoint(Ljava/lang/String;)V

    goto/16 :goto_3

    .line 45
    :cond_5
    iget-object v2, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->main_content:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 46
    iget-object v2, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->mainCover:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 47
    iget-object v2, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->iv_back:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 48
    invoke-virtual {p0}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->hideLoadingDelay()V

    .line 49
    iget-object v2, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->fragment:Landroid/widget/FrameLayout;

    invoke-virtual {v2, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 50
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v2

    .line 51
    invoke-virtual {v2}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object v2

    .line 52
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    invoke-virtual {v3, v5, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->isFromVideo:Z

    if-eqz v3, :cond_6

    .line 53
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    invoke-virtual {v3, v7}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->gameId:Ljava/lang/String;

    .line 54
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    invoke-virtual {v3, v4, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->autodown:Z

    .line 55
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1, v6}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/ExtBean;

    iput-object v1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    .line 56
    :cond_6
    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getBt_game_switch()I

    move-result p1

    const v1, 0x7f090614

    if-ne p1, v8, :cond_7

    .line 57
    iget-object p1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->gameId:Ljava/lang/String;

    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    iget-boolean v3, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->autodown:Z

    iget-boolean v4, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->isFromVideo:Z

    iget-boolean v5, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->isShowComment:Z

    invoke-static {p1, v0, v3, v4, v5}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->w0(Ljava/lang/String;Lcom/join/mgps/dto/ExtBean;ZZZ)Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->fragmentDetial:Lcom/join/mgps/activity/gamedetail/BaseGameDetailFragment;

    .line 58
    invoke-virtual {v2, v1, p1}, Landroidx/fragment/app/FragmentTransaction;->add(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    const-string p1, "2"

    .line 59
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->sendPoint(Ljava/lang/String;)V

    goto :goto_2

    .line 60
    :cond_7
    iget-object p1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->gameId:Ljava/lang/String;

    iget-object v3, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    iget-boolean v4, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->autodown:Z

    iget-boolean v5, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->isFromVideo:Z

    iget-boolean v6, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->isShowComment:Z

    invoke-static {p1, v3, v4, v5, v6}, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;->A0(Ljava/lang/String;Lcom/join/mgps/dto/ExtBean;ZZZ)Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->fragmentDetial:Lcom/join/mgps/activity/gamedetail/BaseGameDetailFragment;

    .line 61
    invoke-virtual {v2, v1, p1}, Landroidx/fragment/app/FragmentTransaction;->add(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    if-eqz v0, :cond_8

    const-string p1, "3"

    goto :goto_1

    :cond_8
    const-string p1, "0"

    .line 62
    :goto_1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->sendPoint(Ljava/lang/String;)V

    .line 63
    :goto_2
    invoke-virtual {v2}, Landroidx/fragment/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 64
    :goto_3
    iget-object p1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->modleFourBeanShow:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getTag_info()Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_a

    .line 65
    iget-object p1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->modleFourBeanShow:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getTag_info()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/TipBean;

    .line 66
    invoke-virtual {v0}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "242"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 67
    :try_start_0
    new-instance p1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string v0, "discount_game"

    .line 68
    invoke-virtual {p1, v0}, Lcom/papa/sim/statistic/Ext;->setResultCode(Ljava/lang/String;)V

    .line 69
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/papa/sim/statistic/Ext;->setScenesCode(Ljava/lang/String;)V

    .line 70
    new-instance v0, Lcom/papa/sim/statistic/Data;

    invoke-direct {v0}, Lcom/papa/sim/statistic/Data;-><init>()V

    .line 71
    iget-object v1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->modleFourBeanShow:Lcom/join/mgps/dto/GamedetialModleFourBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_id()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/Data;->setGameId(J)Lcom/papa/sim/statistic/Data;

    .line 72
    iget-object v1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->context:Landroid/content/Context;

    invoke-static {v1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v1

    sget-object v2, Lcom/papa/sim/statistic/Event;->expGameAdPage:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v1, v2, p1, v0}, Lcom/papa/sim/statistic/p;->Y(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;Lcom/papa/sim/statistic/Data;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception p1

    .line 73
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_a
    :goto_4
    return-void
.end method
