.class public Lcom/join/mgps/activity/AppDownFinishDialogActivity;
.super Lcom/join/mgps/base/dialog/BaseDialogActivity;
.source "AppDownFinishDialogActivity.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/AppDownFinishDialogActivity$c;,
        Lcom/join/mgps/activity/AppDownFinishDialogActivity$CardPagerAdapter;,
        Lcom/join/mgps/activity/AppDownFinishDialogActivity$b;
    }
.end annotation


# static fields
.field public static final g:Ljava/lang/String; = "_game_id"


# instance fields
.field private b:Lcom/join/mgps/activity/AppDownFinishDialogActivity$CardPagerAdapter;

.field private c:Landroidx/viewpager/widget/ViewPager;

.field private d:Lme/relex/circleindicator/CircleIndicator;

.field e:Ljava/lang/String;

.field f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/base/dialog/BaseDialogActivity;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/AppDownFinishDialogActivity;->f:Ljava/util/List;

    return-void
.end method

.method private f0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "_game_id"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/AppDownFinishDialogActivity;->e:Ljava/lang/String;

    .line 3
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/AppDownFinishDialogActivity;->f:Ljava/util/List;

    iget-object v1, p0, Lcom/join/mgps/activity/AppDownFinishDialogActivity;->e:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/AppDownFinishDialogActivity;->f:Ljava/util/List;

    iget-object v1, p0, Lcom/join/mgps/activity/AppDownFinishDialogActivity;->e:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/AppDownFinishDialogActivity;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    .line 7
    new-instance v1, Lcom/join/mgps/activity/AppDownFinishDialogActivity$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/join/mgps/activity/AppDownFinishDialogActivity$c;-><init>(Lcom/join/mgps/activity/AppDownFinishDialogActivity;Lcom/join/mgps/activity/AppDownFinishDialogActivity$a;)V

    .line 8
    iput-object v0, v1, Lcom/join/mgps/activity/AppDownFinishDialogActivity$c;->a:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/AppDownFinishDialogActivity;->b:Lcom/join/mgps/activity/AppDownFinishDialogActivity$CardPagerAdapter;

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/AppDownFinishDialogActivity$CardPagerAdapter;->b(Lcom/join/mgps/activity/AppDownFinishDialogActivity$c;)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/AppDownFinishDialogActivity;->b:Lcom/join/mgps/activity/AppDownFinishDialogActivity$CardPagerAdapter;

    invoke-virtual {v0}, Landroidx/viewpager/widget/PagerAdapter;->notifyDataSetChanged()V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/AppDownFinishDialogActivity;->d:Lme/relex/circleindicator/CircleIndicator;

    iget-object v1, p0, Lcom/join/mgps/activity/AppDownFinishDialogActivity;->c:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0, v1}, Lme/relex/circleindicator/CircleIndicator;->setViewPager(Landroidx/viewpager/widget/ViewPager;)V

    :cond_0
    return-void
.end method


# virtual methods
.method initView()V
    .locals 2

    const v0, 0x7f0917b0

    .line 1
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    iput-object v0, p0, Lcom/join/mgps/activity/AppDownFinishDialogActivity;->c:Landroidx/viewpager/widget/ViewPager;

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/AppDownFinishDialogActivity;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 3
    new-instance v0, Lcom/join/mgps/activity/AppDownFinishDialogActivity$CardPagerAdapter;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/AppDownFinishDialogActivity$CardPagerAdapter;-><init>(Lcom/join/mgps/activity/AppDownFinishDialogActivity;)V

    iput-object v0, p0, Lcom/join/mgps/activity/AppDownFinishDialogActivity;->b:Lcom/join/mgps/activity/AppDownFinishDialogActivity$CardPagerAdapter;

    const v0, 0x7f090867

    .line 4
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lme/relex/circleindicator/CircleIndicator;

    iput-object v0, p0, Lcom/join/mgps/activity/AppDownFinishDialogActivity;->d:Lme/relex/circleindicator/CircleIndicator;

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/AppDownFinishDialogActivity;->c:Landroidx/viewpager/widget/ViewPager;

    iget-object v1, p0, Lcom/join/mgps/activity/AppDownFinishDialogActivity;->b:Lcom/join/mgps/activity/AppDownFinishDialogActivity$CardPagerAdapter;

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/AppDownFinishDialogActivity;->d:Lme/relex/circleindicator/CircleIndicator;

    iget-object v1, p0, Lcom/join/mgps/activity/AppDownFinishDialogActivity;->c:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0, v1}, Lme/relex/circleindicator/CircleIndicator;->setViewPager(Landroidx/viewpager/widget/ViewPager;)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/AppDownFinishDialogActivity;->c:Landroidx/viewpager/widget/ViewPager;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    .line 8
    invoke-direct {p0}, Lcom/join/mgps/activity/AppDownFinishDialogActivity;->f0()V

    return-void
.end method

.method public onAppDownFinishEvent(Lcom/join/mgps/event/o;)V
    .locals 1
    .annotation runtime Lorg/greenrobot/eventbus/Subscribe;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/event/o;->a()Ljava/lang/Class;

    move-result-object p1

    if-ne v0, p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/base/dialog/BaseDialogActivity;->finish()V

    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/base/dialog/BaseDialogActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c00bc

    .line 2
    invoke-virtual {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(I)V

    .line 3
    invoke-static {p0}, Lcom/join/mgps/Util/c2;->s(Landroid/app/Activity;)V

    .line 4
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object p1

    invoke-virtual {p1, p0}, Lorg/greenrobot/eventbus/c;->t(Ljava/lang/Object;)V

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/activity/AppDownFinishDialogActivity;->initView()V

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onDestroy()V

    .line 2
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lorg/greenrobot/eventbus/c;->y(Ljava/lang/Object;)V

    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 2
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 3
    invoke-direct {p0}, Lcom/join/mgps/activity/AppDownFinishDialogActivity;->f0()V

    return-void
.end method
