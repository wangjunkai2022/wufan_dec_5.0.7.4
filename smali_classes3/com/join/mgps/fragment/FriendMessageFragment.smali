.class public Lcom/join/mgps/fragment/FriendMessageFragment;
.super Lcom/join/mgps/fragment/BaseFragment;
.source "FriendMessageFragment.java"


# annotations
.annotation build Lorg/androidannotations/annotations/EFragment;
    value = 0x7f0c026b
.end annotation


# instance fields
.field b:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:Landroidx/viewpager/widget/ViewPager;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/fragment/app/Fragment;",
            ">;"
        }
    .end annotation
.end field

.field g:Landroidx/viewpager/widget/PagerAdapter;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/BaseFragment;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/FriendMessageFragment;->f:Ljava/util/List;

    return-void
.end method

.method public static synthetic V(Lcom/join/mgps/fragment/FriendMessageFragment;)V
    .locals 0

    invoke-direct {p0}, Lcom/join/mgps/fragment/FriendMessageFragment;->c0()V

    return-void
.end method

.method public static synthetic W(Lcom/join/mgps/fragment/FriendMessageFragment;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/FriendMessageFragment;->a0(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic X(Lcom/join/mgps/fragment/FriendMessageFragment;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/FriendMessageFragment;->b0(Landroid/view/View;)V

    return-void
.end method

.method private synthetic a0(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/fragment/FriendMessageFragment;->e:Landroidx/viewpager/widget/ViewPager;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    return-void
.end method

.method private synthetic b0(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/fragment/FriendMessageFragment;->e:Landroidx/viewpager/widget/ViewPager;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    return-void
.end method

.method private synthetic c0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendMessageFragment;->f:Ljava/util/List;

    if-eqz v0, :cond_3

    const/4 v1, 0x0

    .line 2
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->e0()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendMessageFragment;->f:Ljava/util/List;

    const/4 v2, 0x1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/fragment/FriendMsgLikeFragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/FriendMsgLikeFragment;->f0()V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendMessageFragment;->e:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v0

    const/16 v3, 0x8

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lcom/join/mgps/fragment/FriendMessageFragment;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v2, :cond_1

    iget-object v0, p0, Lcom/join/mgps/fragment/FriendMessageFragment;->f:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/join/mgps/fragment/FriendMsgLikeFragment;

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendMessageFragment;->f:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/fragment/FriendMsgLikeFragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/FriendMsgLikeFragment;->c0()V

    .line 6
    invoke-static {}, Lcom/wufan/friend/chat/c;->u()Lcom/wufan/friend/chat/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/wufan/friend/chat/c;->r()Lcom/join/mgps/dto/FriendAccountInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 7
    invoke-static {}, Lcom/wufan/friend/chat/c;->u()Lcom/wufan/friend/chat/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/wufan/friend/chat/c;->r()Lcom/join/mgps/dto/FriendAccountInfo;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/FriendAccountInfo;->setLikedCount(I)V

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendMessageFragment;->d:Landroid/view/View;

    if-eqz v0, :cond_1

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 9
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendMessageFragment;->d:Landroid/view/View;

    if-eqz v0, :cond_3

    .line 10
    invoke-static {}, Lcom/wufan/friend/chat/c;->u()Lcom/wufan/friend/chat/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/wufan/friend/chat/c;->r()Lcom/join/mgps/dto/FriendAccountInfo;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/wufan/friend/chat/c;->u()Lcom/wufan/friend/chat/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/wufan/friend/chat/c;->r()Lcom/join/mgps/dto/FriendAccountInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/FriendAccountInfo;->getLikedCount()I

    move-result v0

    if-lez v0, :cond_2

    .line 11
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendMessageFragment;->d:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 12
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendMessageFragment;->d:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_3
    :goto_0
    return-void
.end method


# virtual methods
.method Z()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Lcom/join/mgps/activity/FriendActivity;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/activity/FriendActivity;

    invoke-virtual {v0}, Lcom/join/mgps/activity/FriendActivity;->T0()V

    :cond_0
    return-void
.end method

.method afterViews()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendMessageFragment;->b:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSelected(Z)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendMessageFragment;->f:Ljava/util/List;

    new-instance v2, Lcom/join/mgps/fragment/FriendMsgRequestFragment_;

    invoke-direct {v2}, Lcom/join/mgps/fragment/FriendMsgRequestFragment_;-><init>()V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendMessageFragment;->f:Ljava/util/List;

    new-instance v2, Lcom/join/mgps/fragment/FriendMsgLikeFragment_;

    invoke-direct {v2}, Lcom/join/mgps/fragment/FriendMsgLikeFragment_;-><init>()V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    new-instance v0, Lcom/join/mgps/fragment/FriendMessageFragment$a;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v2

    invoke-direct {v0, p0, v2}, Lcom/join/mgps/fragment/FriendMessageFragment$a;-><init>(Lcom/join/mgps/fragment/FriendMessageFragment;Landroidx/fragment/app/FragmentManager;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/FriendMessageFragment;->g:Landroidx/viewpager/widget/PagerAdapter;

    .line 5
    iget-object v2, p0, Lcom/join/mgps/fragment/FriendMessageFragment;->e:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v2, v0}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendMessageFragment;->e:Landroidx/viewpager/widget/ViewPager;

    new-instance v2, Lcom/join/mgps/fragment/FriendMessageFragment$b;

    invoke-direct {v2, p0}, Lcom/join/mgps/fragment/FriendMessageFragment$b;-><init>(Lcom/join/mgps/fragment/FriendMessageFragment;)V

    invoke-virtual {v0, v2}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendMessageFragment;->e:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendMessageFragment;->e:Landroidx/viewpager/widget/ViewPager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendMessageFragment;->b:Landroid/widget/TextView;

    new-instance v2, Lcom/join/mgps/fragment/r0;

    invoke-direct {v2, p0}, Lcom/join/mgps/fragment/r0;-><init>(Lcom/join/mgps/fragment/FriendMessageFragment;)V

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendMessageFragment;->c:Landroid/widget/TextView;

    new-instance v2, Lcom/join/mgps/fragment/s0;

    invoke-direct {v2, p0}, Lcom/join/mgps/fragment/s0;-><init>(Lcom/join/mgps/fragment/FriendMessageFragment;)V

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11
    invoke-static {}, Lcom/wufan/friend/chat/c;->u()Lcom/wufan/friend/chat/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/wufan/friend/chat/c;->r()Lcom/join/mgps/dto/FriendAccountInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/wufan/friend/chat/c;->u()Lcom/wufan/friend/chat/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/wufan/friend/chat/c;->r()Lcom/join/mgps/dto/FriendAccountInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/FriendAccountInfo;->getLikedCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 12
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendMessageFragment;->d:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendMessageFragment;->d:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method protected lazyLoad()V
    .locals 0

    return-void
.end method

.method public onHiddenChanged(Z)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onHiddenChanged(Z)V

    if-nez p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/BaseFragment;->mHandler:Landroid/os/Handler;

    new-instance v0, Lcom/join/mgps/fragment/t0;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/t0;-><init>(Lcom/join/mgps/fragment/FriendMessageFragment;)V

    const-wide/16 v1, 0x1f4

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method
