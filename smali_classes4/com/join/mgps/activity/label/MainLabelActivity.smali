.class public Lcom/join/mgps/activity/label/MainLabelActivity;
.super Lcom/BaseAppCompatActivity;
.source "MainLabelActivity.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/label/MainLabelActivity$h;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c006a
.end annotation


# static fields
.field public static final N:I = 0x1

.field public static final O:I = 0x2


# instance fields
.field private A:Z

.field private B:Lcom/join/mgps/activity/label/MainLabelActivity$h;

.field private C:Ljava/lang/String;

.field D:I

.field private E:Lcom/join/mgps/dto/MainLabelBean;

.field F:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field G:Landroidx/fragment/app/FragmentManager;

.field H:[Lcom/join/mgps/fragment/LabelFragment_;

.field I:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/MainLabelBean$TagType;",
            ">;"
        }
    .end annotation
.end field

.field J:Lcom/join/mgps/adapter/FragmentPagerAdapter;

.field K:Lcom/join/mgps/fragment/e;

.field L:Landroid/widget/RelativeLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field M:Z

.field b:Lcom/join/mgps/rpc/i;

.field c:Lcom/join/mgps/Util/b;
    .annotation build Lorg/androidannotations/annotations/Bean;
    .end annotation
.end field

.field d:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field f:I
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field g:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field h:I
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field i:I
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field j:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field k:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field l:Landroid/widget/Button;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field m:Lcom/join/mgps/customview/SlidingTabLayout6;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field n:Lru/noties/scrollable/ScrollableLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field o:Landroidx/viewpager/widget/ViewPager;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field p:Landroid/widget/RelativeLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field q:Landroid/widget/RelativeLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field r:Landroid/widget/RelativeLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field s:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field t:Lcom/join/mgps/customview/MainLabelHeaderView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field u:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field v:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field w:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field x:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field y:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/BaseAppCompatActivity;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->A:Z

    const-string v1, "hot"

    .line 3
    iput-object v1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->C:Ljava/lang/String;

    .line 4
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->I:Ljava/util/List;

    .line 5
    iput-boolean v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->M:Z

    return-void
.end method

.method public static synthetic f0(Lcom/join/mgps/dto/MainLabelBean;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/mgps/activity/label/MainLabelActivity;->t0(Lcom/join/mgps/dto/MainLabelBean;Landroid/view/View;)V

    return-void
.end method

.method static synthetic g0(Lcom/join/mgps/activity/label/MainLabelActivity;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->z:I

    return p0
.end method

.method private getData()V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/label/MainLabelActivity;->A0()V

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/activity/label/MainLabelActivity;->o0()V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/label/MainLabelActivity;->z0()V

    :goto_0
    return-void
.end method

.method static synthetic h0(Lcom/join/mgps/activity/label/MainLabelActivity;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->z:I

    return p1
.end method

.method private s0(Ljava/util/List;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/MainLabelBean$TagType;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/join/mgps/adapter/FragmentPagerAdapter$a;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    .line 2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 3
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/MainLabelBean$TagType;

    invoke-virtual {v3}, Lcom/join/mgps/dto/MainLabelBean$TagType;->getType_name()Ljava/lang/String;

    move-result-object v3

    .line 4
    new-instance v4, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;

    invoke-direct {p0, v2}, Lcom/join/mgps/activity/label/MainLabelActivity;->u0(I)Landroidx/fragment/app/Fragment;

    move-result-object v5

    invoke-direct {v4, v3, v5}, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;-><init>(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    .line 5
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method private static synthetic t0(Lcom/join/mgps/dto/MainLabelBean;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/activity/CommentSelfListActivity_;->P0(Landroid/content/Context;)Lcom/join/mgps/activity/CommentSelfListActivity_$r;

    move-result-object p1

    invoke-virtual {p0}, Lcom/join/mgps/dto/MainLabelBean;->getManager_info()Lcom/join/mgps/dto/MainLabelBean$ManagerInfo;

    move-result-object p0

    invoke-virtual {p0}, Lcom/join/mgps/dto/MainLabelBean$ManagerInfo;->getUid()I

    move-result p0

    invoke-virtual {p1, p0}, Lcom/join/mgps/activity/CommentSelfListActivity_$r;->a(I)Lcom/join/mgps/activity/CommentSelfListActivity_$r;

    move-result-object p0

    invoke-virtual {p0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method private u0(I)Landroidx/fragment/app/Fragment;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->H:[Lcom/join/mgps/fragment/LabelFragment_;

    aget-object v0, v0, p1

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 3
    iget v1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->f:I

    const-string v2, "tag_id"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->g:Ljava/lang/String;

    const-string v2, "tag_name"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "position"

    .line 5
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->i:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "fid"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    iget-object v1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->I:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/MainLabelBean$TagType;

    invoke-virtual {v1}, Lcom/join/mgps/dto/MainLabelBean$TagType;->getType_id()I

    move-result v1

    const-string v2, "type"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 8
    new-instance v1, Lcom/join/mgps/fragment/LabelFragment_;

    invoke-direct {v1}, Lcom/join/mgps/fragment/LabelFragment_;-><init>()V

    .line 9
    invoke-virtual {v1, v0}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->H:[Lcom/join/mgps/fragment/LabelFragment_;

    aput-object v1, v0, p1

    return-object v1
.end method


# virtual methods
.method A0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->p:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->e:Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method B0(Ljava/lang/String;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->C:Ljava/lang/String;

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->H:[Lcom/join/mgps/fragment/LabelFragment_;

    iget-object v1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->o:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v1

    aget-object v0, v0, v1

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/join/mgps/fragment/LabelFragment;->s0(Ljava/lang/String;Z)V

    return-void
.end method

.method C0(Z)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->k:Landroid/widget/TextView;

    const-string v1, "\u5df2\u5173\u6ce8"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->t:Lcom/join/mgps/customview/MainLabelHeaderView;

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/MainLabelHeaderView;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->k:Landroid/widget/TextView;

    const-string v1, "\u5173\u6ce8"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->t:Lcom/join/mgps/customview/MainLabelHeaderView;

    if-eqz v0, :cond_1

    .line 6
    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/MainLabelHeaderView;->d(Ljava/lang/String;)V

    .line 7
    :cond_1
    :goto_0
    iput-boolean p1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->A:Z

    .line 8
    iget v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->D:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-eq v0, p1, :cond_3

    .line 9
    invoke-static {p0}, Lcom/join/mgps/pref/h;->n(Landroid/content/Context;)Lcom/join/mgps/pref/h;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/join/mgps/pref/h;->o0(Z)V

    goto :goto_2

    .line 10
    :cond_3
    invoke-static {p0}, Lcom/join/mgps/pref/h;->n(Landroid/content/Context;)Lcom/join/mgps/pref/h;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/join/mgps/pref/h;->o0(Z)V

    :goto_2
    return-void
.end method

.method D0(Lcom/join/mgps/dto/MainLabelBean;)V
    .locals 6
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/pref/h;->n(Landroid/content/Context;)Lcom/join/mgps/pref/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/pref/h;->A()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->E:Lcom/join/mgps/dto/MainLabelBean;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/MainLabelBean;->getIs_follow()I

    move-result v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/MainLabelBean;->getIs_follow()I

    move-result v2

    if-eq v0, v2, :cond_0

    .line 3
    invoke-static {p0}, Lcom/join/mgps/pref/h;->n(Landroid/content/Context;)Lcom/join/mgps/pref/h;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/join/mgps/pref/h;->o0(Z)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/MainLabelBean;->getIs_follow()I

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->D:I

    .line 5
    :goto_0
    iput-object p1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->E:Lcom/join/mgps/dto/MainLabelBean;

    .line 6
    iget v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->f:I

    if-nez v0, :cond_1

    .line 7
    invoke-virtual {p1}, Lcom/join/mgps/dto/MainLabelBean;->getTag_id()I

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->f:I

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->w:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/join/mgps/dto/MainLabelBean;->getPosts()I

    move-result v3

    invoke-static {v3}, Lcom/join/mgps/Util/j0;->R(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\u5e16\u5b50"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->u:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p1}, Lcom/join/mgps/dto/MainLabelBean;->getManager_info()Lcom/join/mgps/dto/MainLabelBean$ManagerInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/MainLabelBean$ManagerInfo;->getAvatar_src()Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f060412

    const v4, 0x7f070c7a

    const v5, 0x7f070c78

    invoke-static {p0, v3, v4, v5}, Lcom/join/android/app/common/utils/MyImageLoader;->C(Landroid/content/Context;III)Lcom/facebook/drawee/generic/RoundingParams;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lcom/join/android/app/common/utils/MyImageLoader;->j(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;Lcom/facebook/drawee/generic/RoundingParams;)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->v:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/join/mgps/dto/MainLabelBean;->getManager_info()Lcom/join/mgps/dto/MainLabelBean$ManagerInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/MainLabelBean$ManagerInfo;->getNickname()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    new-instance v0, Lcom/join/mgps/activity/label/a;

    invoke-direct {v0, p1}, Lcom/join/mgps/activity/label/a;-><init>(Lcom/join/mgps/dto/MainLabelBean;)V

    .line 12
    iget-object v2, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->u:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 13
    iget-object v2, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->v:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->t:Lcom/join/mgps/customview/MainLabelHeaderView;

    invoke-virtual {v0, p1}, Lcom/join/mgps/customview/MainLabelHeaderView;->setViewData(Lcom/join/mgps/dto/MainLabelBean;)V

    .line 15
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->x:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "#"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/join/mgps/dto/MainLabelBean;->getTag_name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    invoke-virtual {p1}, Lcom/join/mgps/dto/MainLabelBean;->is_allow()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    .line 17
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->l:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V

    goto :goto_1

    .line 18
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->l:Landroid/widget/Button;

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setVisibility(I)V

    .line 19
    :goto_1
    invoke-virtual {p1}, Lcom/join/mgps/dto/MainLabelBean;->getIs_follow()I

    move-result v0

    if-ne v0, v1, :cond_3

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    :goto_2
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/label/MainLabelActivity;->C0(Z)V

    .line 20
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/label/MainLabelActivity;->q0(Lcom/join/mgps/dto/MainLabelBean;)V

    return-void
.end method

.method afterViews()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/rpc/impl/g;->A0()Lcom/join/mgps/rpc/impl/g;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->b:Lcom/join/mgps/rpc/i;

    .line 2
    iget v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->i:I

    const/4 v1, 0x1

    if-gtz v0, :cond_0

    .line 3
    iput v1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->h:I

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->G:Landroidx/fragment/app/FragmentManager;

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->t:Lcom/join/mgps/customview/MainLabelHeaderView;

    new-instance v2, Lcom/join/mgps/activity/label/MainLabelActivity$a;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/label/MainLabelActivity$a;-><init>(Lcom/join/mgps/activity/label/MainLabelActivity;)V

    invoke-virtual {v0, v2}, Lcom/join/mgps/customview/MainLabelHeaderView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->t:Lcom/join/mgps/customview/MainLabelHeaderView;

    iget v2, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->h:I

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-ne v2, v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->j:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/customview/MainLabelHeaderView;->setFilterVisibility(ZLjava/lang/String;)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->n:Lru/noties/scrollable/ScrollableLayout;

    const v1, 0x3db851ec    # 0.09f

    invoke-virtual {v0, v1}, Lru/noties/scrollable/ScrollableLayout;->setFriction(F)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->n:Lru/noties/scrollable/ScrollableLayout;

    invoke-virtual {v0, v4}, Lru/noties/scrollable/ScrollableLayout;->setAutoMaxScroll(Z)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->t:Lcom/join/mgps/customview/MainLabelHeaderView;

    new-instance v1, Lcom/join/mgps/activity/label/MainLabelActivity$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/label/MainLabelActivity$b;-><init>(Lcom/join/mgps/activity/label/MainLabelActivity;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/ForumBaseHeaderView;->setmOnMeasureHeight(Lcom/join/mgps/customview/ForumBaseHeaderView$a;)V

    .line 10
    invoke-direct {p0}, Lcom/join/mgps/activity/label/MainLabelActivity;->getData()V

    return-void
.end method

.method back_image()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method getType()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->I:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->I:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/MainLabelBean$TagType;

    invoke-virtual {v0}, Lcom/join/mgps/dto/MainLabelBean$TagType;->getType_id()I

    move-result v0

    return v0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->I:Ljava/util/List;

    iget-object v1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->o:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/MainLabelBean$TagType;

    invoke-virtual {v0}, Lcom/join/mgps/dto/MainLabelBean$TagType;->getType_id()I

    move-result v0

    return v0
.end method

.method i0(I)V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->b:Lcom/join/mgps/rpc/i;

    iget-object v1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->c:Lcom/join/mgps/Util/b;

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->f:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->g:Ljava/lang/String;

    invoke-interface {v0, v1, v2, p1, v3}, Lcom/join/mgps/rpc/i;->n0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lcom/join/mgps/dto/ResultResMainBean;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultResMainBean;->getError()I

    move-result v1

    if-nez v1, :cond_2

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const-string v1, "\u5173\u6ce8\u6210\u529f!"

    goto :goto_0

    :cond_0
    const-string v1, "\u53d6\u6d88\u5173\u6ce8\u6210\u529f!"

    .line 4
    :goto_0
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/label/MainLabelActivity;->showToast(Ljava/lang/String;)V

    if-ne p1, v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    .line 5
    :goto_1
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/label/MainLabelActivity;->C0(Z)V

    goto :goto_2

    .line 6
    :cond_2
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultResMainBean;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/EmptyMessage;

    invoke-virtual {p1}, Lcom/join/mgps/dto/EmptyMessage;->getMsg()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/label/MainLabelActivity;->showToast(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    const-string p1, "\u7f51\u7edc\u5f02\u5e38\uff01"

    .line 7
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/label/MainLabelActivity;->showToast(Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    const-string p1, "\u5f53\u524d\u7f51\u7edc\u4e0d\u53ef\u7528\uff01"

    .line 8
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/label/MainLabelActivity;->showToast(Ljava/lang/String;)V

    :goto_2
    return-void
.end method

.method j0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->isTourist()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/label/MainLabelActivity;->y0()V

    return-void

    .line 3
    :cond_0
    iget-boolean v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->A:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/label/MainLabelActivity;->i0(I)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    .line 5
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/label/MainLabelActivity;->i0(I)V

    :goto_0
    return-void
.end method

.method k0()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/IntentUtil;->goLogin(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f10013d

    .line 2
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/label/MainLabelActivity;->showToast(Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->E:Lcom/join/mgps/dto/MainLabelBean;

    if-nez v0, :cond_1

    return-void

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->I:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_2

    return-void

    .line 5
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->E:Lcom/join/mgps/dto/MainLabelBean;

    const-string v1, ""

    if-eqz v0, :cond_3

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/MainLabelBean;->getForum_name()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    move-object v0, v1

    .line 7
    :goto_0
    iget-object v2, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->j:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->j:Ljava/lang/String;

    .line 9
    :cond_4
    invoke-static {p0}, Lcom/join/mgps/activity/posting/PostingActivity_;->w1(Landroid/content/Context;)Lcom/join/mgps/activity/posting/PostingActivity_$v;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->E:Lcom/join/mgps/dto/MainLabelBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/MainLabelBean;->getTag_name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/mgps/activity/posting/PostingActivity_$v;->e(Ljava/lang/String;)Lcom/join/mgps/activity/posting/PostingActivity_$v;

    move-result-object v2

    const/16 v3, 0x64

    invoke-virtual {v2, v3}, Lcom/join/mgps/activity/posting/PostingActivity_$v;->b(I)Lcom/join/mgps/activity/posting/PostingActivity_$v;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget v4, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->f:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/mgps/activity/posting/PostingActivity_$v;->h(Ljava/lang/String;)Lcom/join/mgps/activity/posting/PostingActivity_$v;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->g:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/join/mgps/activity/posting/PostingActivity_$v;->i(Ljava/lang/String;)Lcom/join/mgps/activity/posting/PostingActivity_$v;

    move-result-object v1

    invoke-virtual {p0}, Lcom/join/mgps/activity/label/MainLabelActivity;->getType()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/posting/PostingActivity_$v;->g(I)Lcom/join/mgps/activity/posting/PostingActivity_$v;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/join/mgps/activity/posting/PostingActivity_$v;->f(Ljava/lang/String;)Lcom/join/mgps/activity/posting/PostingActivity_$v;

    move-result-object v0

    iget v1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->i:I

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/posting/PostingActivity_$v;->a(I)Lcom/join/mgps/activity/posting/PostingActivity_$v;

    move-result-object v0

    const/16 v1, 0x4444

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/posting/PostingActivity_$v;->startForResult(I)Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method l0(Z)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->M:Z

    if-eq v0, p1, :cond_3

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->x:Landroid/widget/TextView;

    const/4 v1, 0x0

    const/16 v2, 0x8

    if-eqz p1, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    const/16 v3, 0x8

    :goto_0
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->k:Landroid/widget/TextView;

    if-eqz p1, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    const/16 v3, 0x8

    :goto_1
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->y:Landroid/widget/LinearLayout;

    if-eqz p1, :cond_2

    const/16 v1, 0x8

    :cond_2
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 5
    iput-boolean p1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->M:Z

    :cond_3
    return-void
.end method

.method m0()Lcom/join/mgps/fragment/FragmentPagerFragment;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->K:Lcom/join/mgps/fragment/e;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/join/mgps/fragment/e;->a()Lcom/join/mgps/fragment/FragmentPagerFragment;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public n0()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->o:Landroidx/viewpager/widget/ViewPager;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method o0()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->b:Lcom/join/mgps/rpc/i;

    iget-object v1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->c:Lcom/join/mgps/Util/b;

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->f:I

    iget v3, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->i:I

    iget-object v4, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->g:Ljava/lang/String;

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/join/mgps/rpc/i;->p(Ljava/lang/String;IILjava/lang/String;)Lcom/join/mgps/dto/ResultResMainBean;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultResMainBean;->getError()I

    move-result v1

    if-nez v1, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultResMainBean;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/MainLabelBean;

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/label/MainLabelActivity;->D0(Lcom/join/mgps/dto/MainLabelBean;)V

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/activity/label/MainLabelActivity;->p0()V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/label/MainLabelActivity;->z0()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getMainLabelInfo Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MainLabel"

    invoke-static {v1, v0}, Lcom/join/mgps/Util/v0;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    invoke-virtual {p0}, Lcom/join/mgps/activity/label/MainLabelActivity;->z0()V

    :goto_0
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/BaseAppCompatActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/16 p3, 0x4444

    if-ne p1, p3, :cond_1

    const/4 p1, -0x1

    if-ne p2, p1, :cond_1

    .line 2
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->H:[Lcom/join/mgps/fragment/LabelFragment_;

    if-eqz p1, :cond_0

    array-length p2, p1

    if-lez p2, :cond_0

    const-string p2, "new"

    .line 4
    iput-object p2, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->C:Ljava/lang/String;

    .line 5
    iget-object p2, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->o:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p2}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result p2

    aget-object p1, p1, p2

    iget-object p2, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->C:Ljava/lang/String;

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p3}, Lcom/join/mgps/fragment/LabelFragment;->s0(Ljava/lang/String;Z)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-direct {p0}, Lcom/join/mgps/activity/label/MainLabelActivity;->getData()V

    :cond_1
    :goto_0
    return-void
.end method

.method public onBackPressed()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->J:Lcom/join/mgps/adapter/FragmentPagerAdapter;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/adapter/FragmentPagerAdapter;->getCount()I

    move-result v0

    iget v1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->z:I

    if-lt v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->J:Lcom/join/mgps/adapter/FragmentPagerAdapter;

    invoke-virtual {v0, v1}, Lcom/join/mgps/adapter/FragmentPagerAdapter;->getItem(I)Landroidx/fragment/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/fragment/LabelFragment;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/fragment/LabelFragment;->onBackPressedMy()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_0

    return-void

    :catch_0
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 5
    :cond_0
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onBackPressed()V

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onDestroy()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->B:Lcom/join/mgps/activity/label/MainLabelActivity$h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method

.method p0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->p:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->e:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method q0(Lcom/join/mgps/dto/MainLabelBean;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/MainLabelBean;->getTag_type()Ljava/util/List;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->I:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->I:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->I:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 5
    new-array v1, v0, [Lcom/join/mgps/fragment/LabelFragment_;

    iput-object v1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->H:[Lcom/join/mgps/fragment/LabelFragment_;

    .line 6
    new-instance v1, Lcom/join/mgps/adapter/FragmentPagerAdapter;

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/join/mgps/adapter/FragmentPagerAdapter;-><init>(Landroidx/fragment/app/FragmentManager;)V

    iput-object v1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->J:Lcom/join/mgps/adapter/FragmentPagerAdapter;

    .line 7
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/label/MainLabelActivity;->s0(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/join/mgps/adapter/FragmentPagerAdapter;->e(Ljava/util/List;)V

    .line 8
    iget-object p1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->o:Landroidx/viewpager/widget/ViewPager;

    iget-object v1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->J:Lcom/join/mgps/adapter/FragmentPagerAdapter;

    invoke-virtual {p1, v1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 9
    iget-object p1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->o:Landroidx/viewpager/widget/ViewPager;

    iget-object v1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->J:Lcom/join/mgps/adapter/FragmentPagerAdapter;

    invoke-virtual {v1}, Lcom/join/mgps/adapter/FragmentPagerAdapter;->getCount()I

    move-result v1

    invoke-virtual {p1, v1}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    .line 10
    iget-object p1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->o:Landroidx/viewpager/widget/ViewPager;

    new-instance v1, Lcom/join/mgps/activity/label/MainLabelActivity$c;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/label/MainLabelActivity$c;-><init>(Lcom/join/mgps/activity/label/MainLabelActivity;)V

    invoke-virtual {p1, v1}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 11
    iget-object p1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->m:Lcom/join/mgps/customview/SlidingTabLayout6;

    iget-object v1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->o:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1, v1}, Lcom/join/mgps/customview/SlidingTabLayout1;->setViewPager(Landroidx/viewpager/widget/ViewPager;)V

    .line 12
    iget-object p1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->m:Lcom/join/mgps/customview/SlidingTabLayout6;

    new-instance v1, Lcom/join/mgps/activity/label/MainLabelActivity$d;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/label/MainLabelActivity$d;-><init>(Lcom/join/mgps/activity/label/MainLabelActivity;)V

    invoke-virtual {p1, v1}, Lcom/join/mgps/customview/SlidingTabLayout1;->setOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 13
    iget-object p1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->m:Lcom/join/mgps/customview/SlidingTabLayout6;

    invoke-virtual {p1}, Lcom/join/mgps/customview/SlidingTabLayout1;->g()V

    .line 14
    iget-object p1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->J:Lcom/join/mgps/adapter/FragmentPagerAdapter;

    invoke-virtual {p1}, Landroidx/viewpager/widget/PagerAdapter;->notifyDataSetChanged()V

    .line 15
    iget-object p1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->n:Lru/noties/scrollable/ScrollableLayout;

    iget-object v1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->t:Lcom/join/mgps/customview/MainLabelHeaderView;

    invoke-virtual {p1, v1}, Lru/noties/scrollable/ScrollableLayout;->setDraggableView(Landroid/view/View;)V

    const/4 p1, 0x1

    if-gt v0, p1, :cond_0

    .line 16
    iget-object p1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->L:Landroid/widget/RelativeLayout;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 17
    iget-object p1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->n:Lru/noties/scrollable/ScrollableLayout;

    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->L:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->L:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 19
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->J:Lcom/join/mgps/adapter/FragmentPagerAdapter;

    invoke-virtual {v0}, Lcom/join/mgps/adapter/FragmentPagerAdapter;->getCount()I

    move-result v0

    const/4 v2, 0x4

    if-gt v0, v2, :cond_1

    .line 20
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->m:Lcom/join/mgps/customview/SlidingTabLayout6;

    invoke-virtual {v0, p1}, Lcom/join/mgps/customview/SlidingTabLayout1;->setShouldExpand(Z)V

    goto :goto_0

    .line 21
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->m:Lcom/join/mgps/customview/SlidingTabLayout6;

    invoke-virtual {p1, v1}, Lcom/join/mgps/customview/SlidingTabLayout1;->setShouldExpand(Z)V

    .line 22
    :goto_0
    new-instance p1, Lcom/join/mgps/fragment/f;

    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->o:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/join/mgps/fragment/f;-><init>(Landroidx/viewpager/widget/ViewPager;Landroidx/fragment/app/FragmentManager;)V

    iput-object p1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->K:Lcom/join/mgps/fragment/e;

    .line 23
    iget-object p1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->n:Lru/noties/scrollable/ScrollableLayout;

    new-instance v0, Lcom/join/mgps/activity/label/MainLabelActivity$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/label/MainLabelActivity$e;-><init>(Lcom/join/mgps/activity/label/MainLabelActivity;)V

    invoke-virtual {p1, v0}, Lru/noties/scrollable/ScrollableLayout;->setCanScrollVerticallyDelegate(Lru/noties/scrollable/b;)V

    .line 24
    iget-object p1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->n:Lru/noties/scrollable/ScrollableLayout;

    new-instance v0, Lcom/join/mgps/activity/label/MainLabelActivity$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/label/MainLabelActivity$f;-><init>(Lcom/join/mgps/activity/label/MainLabelActivity;)V

    invoke-virtual {p1, v0}, Lru/noties/scrollable/ScrollableLayout;->setOnFlingOverListener(Lru/noties/scrollable/j;)V

    .line 25
    iget-object p1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->n:Lru/noties/scrollable/ScrollableLayout;

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->invalidate()V

    .line 26
    iget-object p1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->n:Lru/noties/scrollable/ScrollableLayout;

    new-instance v0, Lcom/join/mgps/activity/label/MainLabelActivity$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/label/MainLabelActivity$g;-><init>(Lcom/join/mgps/activity/label/MainLabelActivity;)V

    invoke-virtual {p1, v0}, Lru/noties/scrollable/ScrollableLayout;->w(Lru/noties/scrollable/k;)V

    return-void
.end method

.method r0()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method relodingimag()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/label/MainLabelActivity;->getData()V

    return-void
.end method

.method setNetwork()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/UtilsMy;->w3(Landroid/content/Context;)V

    return-void
.end method

.method public showSort(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->B:Lcom/join/mgps/activity/label/MainLabelActivity$h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->B:Lcom/join/mgps/activity/label/MainLabelActivity$h;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->B:Lcom/join/mgps/activity/label/MainLabelActivity$h;

    if-nez v0, :cond_1

    .line 3
    new-instance v0, Lcom/join/mgps/activity/label/MainLabelActivity$h;

    const/4 v1, -0x2

    invoke-direct {v0, p0, p0, v1, v1}, Lcom/join/mgps/activity/label/MainLabelActivity$h;-><init>(Lcom/join/mgps/activity/label/MainLabelActivity;Landroid/content/Context;II)V

    iput-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->B:Lcom/join/mgps/activity/label/MainLabelActivity$h;

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->B:Lcom/join/mgps/activity/label/MainLabelActivity$h;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->B:Lcom/join/mgps/activity/label/MainLabelActivity$h;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1, v1}, Landroid/view/View;->measure(II)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->B:Lcom/join/mgps/activity/label/MainLabelActivity$h;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    .line 7
    iget-object v2, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->B:Lcom/join/mgps/activity/label/MainLabelActivity$h;

    invoke-virtual {v2, v0}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 8
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f070391

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v2

    sub-int/2addr v0, v2

    .line 9
    iget-object v2, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->B:Lcom/join/mgps/activity/label/MainLabelActivity$h;

    invoke-virtual {v2, p1, v0, v1}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    .line 10
    iget-object p1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->B:Lcom/join/mgps/activity/label/MainLabelActivity$h;

    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->C:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/join/mgps/activity/label/MainLabelActivity$h;->b(Lcom/join/mgps/activity/label/MainLabelActivity$h;Ljava/lang/String;)V

    .line 11
    iget-object p1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->B:Lcom/join/mgps/activity/label/MainLabelActivity$h;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method showToast(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/label/MainLabelActivity;->r0()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public v0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/label/MainLabelActivity;->j0()V

    return-void
.end method

.method w0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
        delay = 0x190L
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->J:Lcom/join/mgps/adapter/FragmentPagerAdapter;

    iget v1, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->z:I

    invoke-virtual {v0, v1}, Lcom/join/mgps/adapter/FragmentPagerAdapter;->getItem(I)Landroidx/fragment/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/fragment/LabelFragment;

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/fragment/LabelFragment;->X()V

    return-void
.end method

.method x0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->s:Landroid/widget/ImageView;

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/label/MainLabelActivity;->showSort(Landroid/view/View;)V

    return-void
.end method

.method y0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/a0;->m(Landroid/content/Context;)V

    return-void
.end method

.method z0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->p:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/label/MainLabelActivity;->d:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method
