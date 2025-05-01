.class public Lcom/join/mgps/activity/message/CommunityFragment;
.super Landroidx/fragment/app/Fragment;
.source "CommunityFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/message/CommunityFragment$h;,
        Lcom/join/mgps/activity/message/CommunityFragment$g;,
        Lcom/join/mgps/activity/message/CommunityFragment$i;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EFragment;
    value = 0x7f0c025c
.end annotation


# instance fields
.field A:Landroid/widget/EditText;

.field B:Z

.field b:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Lcom/join/mgps/ptr/PtrClassicFrameLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Lcom/join/mgps/customview/XListView2;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:Lcom/join/mgps/activity/message/CommunityFragment$g;

.field f:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field g:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field h:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field i:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field j:Lcom/join/mgps/rpc/i;

.field k:Landroid/content/Context;

.field l:I

.field m:Landroid/widget/Button;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private n:Lcom/wufan/user/service/protobuf/n0;

.field o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/activity/message/CommunityFragment$i;",
            ">;"
        }
    .end annotation
.end field

.field p:F

.field q:F

.field r:F

.field private s:Landroid/animation/ObjectAnimator;

.field private t:Landroid/animation/ObjectAnimator;

.field u:Z

.field v:Landroid/widget/PopupWindow;

.field w:[Landroid/text/InputFilter;

.field x:Z

.field y:Landroid/view/View;

.field z:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/join/mgps/activity/message/CommunityFragment;->l:I

    const/4 v1, 0x0

    .line 3
    iput-boolean v1, p0, Lcom/join/mgps/activity/message/CommunityFragment;->u:Z

    .line 4
    iput-boolean v1, p0, Lcom/join/mgps/activity/message/CommunityFragment;->x:Z

    .line 5
    iput-boolean v0, p0, Lcom/join/mgps/activity/message/CommunityFragment;->B:Z

    return-void
.end method

.method static synthetic W(Lcom/join/mgps/activity/message/CommunityFragment;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/message/CommunityFragment;->c0(Landroid/widget/TextView;)V

    return-void
.end method

.method private c0(Landroid/widget/TextView;)V
    .locals 9

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/x;->a()Lcom/join/mgps/Util/x;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 2
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    .line 3
    instance-of v1, v0, Landroid/text/Spannable;

    if-eqz v1, :cond_4

    .line 4
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    .line 5
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    check-cast v2, Landroid/text/Spannable;

    .line 6
    const-class v3, Landroid/text/style/URLSpan;

    const/4 v4, 0x0

    invoke-interface {v2, v4, v1, v3}, Landroid/text/Spannable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/text/style/URLSpan;

    .line 7
    array-length v3, v1

    if-nez v3, :cond_0

    return-void

    .line 8
    :cond_0
    new-instance v3, Landroid/text/SpannableStringBuilder;

    invoke-direct {v3, v0}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 9
    array-length v0, v1

    :goto_0
    if-ge v4, v0, :cond_3

    aget-object v5, v1, v4

    .line 10
    invoke-virtual {v5}, Landroid/text/style/URLSpan;->getURL()Ljava/lang/String;

    move-result-object v6

    const-string v7, "http://"

    .line 11
    invoke-virtual {v6, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v7

    if-eqz v7, :cond_1

    const-string v7, "https://"

    invoke-virtual {v6, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v7

    if-nez v7, :cond_2

    .line 12
    :cond_1
    new-instance v7, Lcom/join/mgps/activity/message/CommunityFragment$h;

    invoke-virtual {p1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-direct {v7, p0, v8, v6}, Lcom/join/mgps/activity/message/CommunityFragment$h;-><init>(Lcom/join/mgps/activity/message/CommunityFragment;Landroid/content/Context;Ljava/lang/String;)V

    .line 13
    invoke-interface {v2, v5}, Landroid/text/Spannable;->getSpanStart(Ljava/lang/Object;)I

    move-result v6

    invoke-interface {v2, v5}, Landroid/text/Spannable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v5

    const/16 v8, 0x11

    invoke-virtual {v3, v7, v6, v5, v8}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 14
    :cond_3
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    return-void
.end method

.method private h0(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/message/CommunityFragment;->v:Landroid/widget/PopupWindow;

    const/16 v1, 0x51

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    return-void
.end method


# virtual methods
.method V()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/message/CommunityFragment;->d:Lcom/join/mgps/customview/XListView2;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView2;->l()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method X(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/activity/message/CommunityFragment$i;",
            ">;)V"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/message/CommunityFragment;->e:Lcom/join/mgps/activity/message/CommunityFragment$g;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method Z()V
    .locals 9
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/message/CommunityFragment;->k:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_7

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3
    iget-object v2, p0, Lcom/join/mgps/activity/message/CommunityFragment;->j:Lcom/join/mgps/rpc/i;

    iget-object v3, p0, Lcom/join/mgps/activity/message/CommunityFragment;->n:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v3}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v3

    iget-object v4, p0, Lcom/join/mgps/activity/message/CommunityFragment;->n:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v4}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v4

    iget v5, p0, Lcom/join/mgps/activity/message/CommunityFragment;->l:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lcom/join/mgps/activity/message/CommunityFragment;->l:I

    const/16 v6, 0xa

    invoke-interface {v2, v3, v4, v5, v6}, Lcom/join/mgps/rpc/i;->F(ILjava/lang/String;II)Lcom/join/mgps/dto/ForumResponse;

    move-result-object v2

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/CommunityFragment;->m0()V

    if-eqz v2, :cond_8

    .line 5
    invoke-virtual {v2}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_8

    .line 6
    invoke-virtual {v2}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/ForumProfileMessageData;

    invoke-virtual {v3}, Lcom/join/mgps/dto/ForumProfileMessageData;->getUn_read_praise_count()I

    .line 7
    invoke-virtual {v2}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/ForumProfileMessageData;

    invoke-virtual {v3}, Lcom/join/mgps/dto/ForumProfileMessageData;->getMessage_list()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x1

    if-eqz v3, :cond_5

    invoke-virtual {v2}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/ForumProfileMessageData;

    invoke-virtual {v3}, Lcom/join/mgps/dto/ForumProfileMessageData;->getMessage_list()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_5

    .line 8
    invoke-virtual {v2}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/ForumProfileMessageData;

    invoke-virtual {v2}, Lcom/join/mgps/dto/ForumProfileMessageData;->getMessage_list()Ljava/util/List;

    move-result-object v2

    .line 9
    iget v3, p0, Lcom/join/mgps/activity/message/CommunityFragment;->l:I

    if-ne v3, v1, :cond_0

    .line 10
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 11
    iget-object v3, p0, Lcom/join/mgps/activity/message/CommunityFragment;->o:Ljava/util/List;

    invoke-virtual {p0, v3}, Lcom/join/mgps/activity/message/CommunityFragment;->X(Ljava/util/List;)V

    :cond_0
    const/4 v3, 0x0

    .line 12
    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    if-ge v3, v5, :cond_4

    .line 13
    new-instance v5, Lcom/join/mgps/activity/message/CommunityFragment$i;

    const-string v7, ""

    invoke-direct {v5, p0, v7, v4}, Lcom/join/mgps/activity/message/CommunityFragment$i;-><init>(Lcom/join/mgps/activity/message/CommunityFragment;Ljava/lang/Object;I)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14
    new-instance v5, Lcom/join/mgps/activity/message/CommunityFragment$i;

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    invoke-direct {v5, p0, v7, v1}, Lcom/join/mgps/activity/message/CommunityFragment$i;-><init>(Lcom/join/mgps/activity/message/CommunityFragment;Ljava/lang/Object;I)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/dto/ForumProfileMessageBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/ForumProfileMessageBean;->getReply()Lcom/join/mgps/dto/ForumBean$ForumCommentReplyBean;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 16
    new-instance v5, Lcom/join/mgps/activity/message/CommunityFragment$i;

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    const/4 v8, 0x3

    invoke-direct {v5, p0, v7, v8}, Lcom/join/mgps/activity/message/CommunityFragment$i;-><init>(Lcom/join/mgps/activity/message/CommunityFragment;Ljava/lang/Object;I)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    :cond_1
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/dto/ForumProfileMessageBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/ForumProfileMessageBean;->getMessage()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 18
    new-instance v5, Lcom/join/mgps/activity/message/CommunityFragment$i;

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    const/4 v8, 0x4

    invoke-direct {v5, p0, v7, v8}, Lcom/join/mgps/activity/message/CommunityFragment$i;-><init>(Lcom/join/mgps/activity/message/CommunityFragment;Ljava/lang/Object;I)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 19
    :cond_2
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/dto/ForumProfileMessageBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/ForumProfileMessageBean;->getPosts()Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    move-result-object v5

    if-eqz v5, :cond_3

    .line 20
    new-instance v5, Lcom/join/mgps/activity/message/CommunityFragment$i;

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/join/mgps/dto/ForumProfileMessageBean;

    invoke-virtual {v7}, Lcom/join/mgps/dto/ForumProfileMessageBean;->getPosts()Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    move-result-object v7

    const/4 v8, 0x5

    invoke-direct {v5, p0, v7, v8}, Lcom/join/mgps/activity/message/CommunityFragment$i;-><init>(Lcom/join/mgps/activity/message/CommunityFragment;Ljava/lang/Object;I)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 21
    :cond_4
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/message/CommunityFragment;->d0(Ljava/util/List;)V

    .line 22
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/CommunityFragment;->a0()V

    .line 23
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v0, v6, :cond_8

    .line 24
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/CommunityFragment;->f0()V

    goto :goto_1

    .line 25
    :cond_5
    iget v0, p0, Lcom/join/mgps/activity/message/CommunityFragment;->l:I

    if-ne v0, v1, :cond_6

    .line 26
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/CommunityFragment;->a0()V

    .line 27
    invoke-virtual {p0, v4}, Lcom/join/mgps/activity/message/CommunityFragment;->g0(I)V

    .line 28
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/CommunityFragment;->f0()V

    goto :goto_1

    .line 29
    :cond_6
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/CommunityFragment;->f0()V

    goto :goto_1

    .line 30
    :cond_7
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/message/CommunityFragment;->g0(I)V

    .line 31
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/CommunityFragment;->a0()V

    .line 32
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/CommunityFragment;->showLodingFailed()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 33
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 34
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/CommunityFragment;->a0()V

    .line 35
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/CommunityFragment;->showLodingFailed()V

    :cond_8
    :goto_1
    return-void
.end method

.method a0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/message/CommunityFragment;->f:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/join/mgps/activity/message/CommunityFragment;->g:Landroid/widget/LinearLayout;

    if-eqz v1, :cond_0

    const/16 v1, 0x8

    .line 2
    :try_start_0
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/message/CommunityFragment;->g:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method afterViews()V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/message/CommunityFragment;->k:Landroid/content/Context;

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/message/CommunityFragment;->o:Ljava/util/List;

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 4
    new-instance v0, Lcom/join/mgps/activity/message/CommunityFragment$g;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/join/mgps/activity/message/CommunityFragment$g;-><init>(Lcom/join/mgps/activity/message/CommunityFragment;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/activity/message/CommunityFragment;->e:Lcom/join/mgps/activity/message/CommunityFragment$g;

    .line 5
    iget-object v1, p0, Lcom/join/mgps/activity/message/CommunityFragment;->d:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v1, v0}, Lcom/join/mgps/customview/XListView2;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 6
    invoke-static {}, Lcom/join/mgps/rpc/impl/g;->A0()Lcom/join/mgps/rpc/impl/g;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/message/CommunityFragment;->j:Lcom/join/mgps/rpc/i;

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/message/CommunityFragment;->n:Lcom/wufan/user/service/protobuf/n0;

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/message/CommunityFragment;->d:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView2;->l()V

    .line 9
    sget-object v0, Lcom/MApplication;->M:Lcom/join/mgps/dto/MessageRedPointBean$MessagesBean$DataBean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/MessageRedPointBean$MessagesBean$DataBean;->getCommunity_praise_surplus_number()I

    move-result v0

    if-lez v0, :cond_0

    .line 10
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/CommunityFragment;->k0()V

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/message/CommunityFragment;->d:Lcom/join/mgps/customview/XListView2;

    new-instance v1, Lcom/join/mgps/activity/message/CommunityFragment$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/message/CommunityFragment$a;-><init>(Lcom/join/mgps/activity/message/CommunityFragment;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/XListView2;->setPullLoadEnable(Lcom/join/mgps/customview/f;)V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/message/CommunityFragment;->d:Lcom/join/mgps/customview/XListView2;

    new-instance v1, Lcom/join/mgps/activity/message/CommunityFragment$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/message/CommunityFragment$b;-><init>(Lcom/join/mgps/activity/message/CommunityFragment;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/XListView2;->setPullRefreshEnable(Lcom/join/mgps/customview/g;)V

    .line 13
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/CommunityFragment;->showLoding()V

    .line 14
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/CommunityFragment;->Z()V

    return-void
.end method

.method b0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/message/CommunityFragment;->i:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method d0(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/activity/message/CommunityFragment$i;",
            ">;)V"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/message/CommunityFragment;->o:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/message/CommunityFragment;->e:Lcom/join/mgps/activity/message/CommunityFragment$g;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method e0(Ljava/lang/String;II)V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const-string v0, ""

    .line 1
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p1, "\u4e0d\u80fd\u56de\u590d\u7a7a\u5b57\u7b26\u4e32"

    .line 2
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/message/CommunityFragment;->showToast(Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/join/mgps/rpc/h;->k:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/group/comment/reply"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 4
    iget-object v2, p0, Lcom/join/mgps/activity/message/CommunityFragment;->k:Landroid/content/Context;

    invoke-static {v2}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 5
    :try_start_0
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string v3, "uid"

    .line 6
    iget-object v4, p0, Lcom/join/mgps/activity/message/CommunityFragment;->n:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v4}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "token"

    .line 7
    iget-object v4, p0, Lcom/join/mgps/activity/message/CommunityFragment;->n:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v4}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "pid"

    .line 8
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v2, v3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "message"

    .line 9
    invoke-interface {v2, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "device_id"

    .line 10
    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "rid"

    .line 11
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v2, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    iget-object p1, p0, Lcom/join/mgps/activity/message/CommunityFragment;->j:Lcom/join/mgps/rpc/i;

    invoke-interface {p1, v1, v2}, Lcom/join/mgps/rpc/i;->b0(Ljava/lang/String;Ljava/util/Map;)Lcom/join/mgps/dto/ForumResponse;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string p2, "\u8bc4\u8bba\u5931\u8d25"

    if-eqz p1, :cond_3

    .line 13
    :try_start_1
    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object p3

    if-eqz p3, :cond_2

    .line 14
    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/MessageCommentReplyResponse;

    invoke-virtual {p1}, Lcom/join/mgps/dto/MessageCommentReplyResponse;->isResult()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "\u8bc4\u8bba\u6210\u529f\uff0c\u5185\u5bb9\u5c06\u5728\u5ba1\u6838\u540e\u663e\u793a"

    .line 15
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/message/CommunityFragment;->showToast(Ljava/lang/String;)V

    goto :goto_0

    .line 16
    :cond_1
    invoke-virtual {p0, p2}, Lcom/join/mgps/activity/message/CommunityFragment;->showToast(Ljava/lang/String;)V

    goto :goto_0

    .line 17
    :cond_2
    invoke-virtual {p0, p2}, Lcom/join/mgps/activity/message/CommunityFragment;->showToast(Ljava/lang/String;)V

    goto :goto_0

    .line 18
    :cond_3
    invoke-virtual {p0, p2}, Lcom/join/mgps/activity/message/CommunityFragment;->showToast(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 19
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    :cond_4
    const-string p1, "\u6682\u65e0\u7f51\u7edc"

    .line 20
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/message/CommunityFragment;->showToast(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method f0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/message/CommunityFragment;->d:Lcom/join/mgps/customview/XListView2;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView2;->setNoMore()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/message/CommunityFragment;->d:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView2;->u()V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/message/CommunityFragment;->d:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView2;->v()V

    :cond_0
    return-void
.end method

.method g0(I)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/message/CommunityFragment;->c:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/join/mgps/activity/message/CommunityFragment;->d:Lcom/join/mgps/customview/XListView2;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/join/mgps/activity/message/CommunityFragment;->h:Landroid/widget/LinearLayout;

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    const/16 v2, 0x8

    if-ne p1, v1, :cond_0

    .line 2
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/message/CommunityFragment;->d:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {p1, v2}, Landroid/widget/ListView;->setVisibility(I)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/message/CommunityFragment;->h:Landroid/widget/LinearLayout;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/message/CommunityFragment;->d:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {p1, v2}, Landroid/widget/ListView;->setVisibility(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method i0(IILjava/lang/String;)V
    .locals 12
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/join/mgps/activity/message/CommunityFragment;->B:Z

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/message/CommunityFragment;->y:Landroid/view/View;

    const/16 v2, 0x21

    const/16 v3, 0xf

    const-string v4, ":"

    const-string v5, "@ "

    const/4 v6, 0x2

    const-string v7, "input_method"

    const/4 v8, 0x1

    if-nez v1, :cond_0

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/message/CommunityFragment;->k:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v9, 0x7f0c00c1

    const/4 v10, 0x0

    invoke-virtual {v1, v9, v10}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/message/CommunityFragment;->y:Landroid/view/View;

    .line 4
    new-instance v1, Landroid/widget/PopupWindow;

    iget-object v9, p0, Lcom/join/mgps/activity/message/CommunityFragment;->y:Landroid/view/View;

    const/4 v11, -0x1

    invoke-direct {v1, v9, v11, v11, v8}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    iput-object v1, p0, Lcom/join/mgps/activity/message/CommunityFragment;->v:Landroid/widget/PopupWindow;

    .line 5
    iget-object v1, p0, Lcom/join/mgps/activity/message/CommunityFragment;->y:Landroid/view/View;

    const v9, 0x7f0904bc

    invoke-virtual {v1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    iput-object v1, p0, Lcom/join/mgps/activity/message/CommunityFragment;->A:Landroid/widget/EditText;

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/message/CommunityFragment;->y:Landroid/view/View;

    const v9, 0x7f090ce7

    invoke-virtual {v1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    .line 7
    new-instance v9, Lcom/join/mgps/activity/message/CommunityFragment$c;

    invoke-direct {v9, p0}, Lcom/join/mgps/activity/message/CommunityFragment$c;-><init>(Lcom/join/mgps/activity/message/CommunityFragment;)V

    invoke-virtual {v1, v9}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    new-instance v1, Landroid/text/SpannableString;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {v1, p3}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 9
    new-instance p3, Landroid/text/style/AbsoluteSizeSpan;

    invoke-direct {p3, v3, v8}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    .line 10
    invoke-virtual {v1}, Landroid/text/SpannableString;->length()I

    move-result v3

    invoke-virtual {v1, p3, v0, v3, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 11
    iget-object p3, p0, Lcom/join/mgps/activity/message/CommunityFragment;->A:Landroid/widget/EditText;

    new-instance v2, Landroid/text/SpannedString;

    invoke-direct {v2, v1}, Landroid/text/SpannedString;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {p3, v2}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    .line 12
    iget-object p3, p0, Lcom/join/mgps/activity/message/CommunityFragment;->y:Landroid/view/View;

    const v1, 0x7f09023f

    invoke-virtual {p3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/Button;

    .line 13
    iget-object v1, p0, Lcom/join/mgps/activity/message/CommunityFragment;->A:Landroid/widget/EditText;

    new-instance v2, Lcom/join/mgps/activity/message/CommunityFragment$d;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/message/CommunityFragment$d;-><init>(Lcom/join/mgps/activity/message/CommunityFragment;)V

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 14
    new-instance v1, Lcom/join/mgps/activity/message/CommunityFragment$e;

    invoke-direct {v1, p0, p1, p2}, Lcom/join/mgps/activity/message/CommunityFragment$e;-><init>(Lcom/join/mgps/activity/message/CommunityFragment;II)V

    invoke-virtual {p3, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    iget-object p1, p0, Lcom/join/mgps/activity/message/CommunityFragment;->A:Landroid/widget/EditText;

    invoke-virtual {p1, v8}, Landroid/widget/EditText;->setFocusable(Z)V

    .line 16
    iget-object p1, p0, Lcom/join/mgps/activity/message/CommunityFragment;->v:Landroid/widget/PopupWindow;

    invoke-virtual {p1, v8}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 17
    iget-object p1, p0, Lcom/join/mgps/activity/message/CommunityFragment;->A:Landroid/widget/EditText;

    invoke-virtual {p1, v8}, Landroid/widget/EditText;->setFocusableInTouchMode(Z)V

    .line 18
    iget-object p1, p0, Lcom/join/mgps/activity/message/CommunityFragment;->A:Landroid/widget/EditText;

    invoke-virtual {p1, v8}, Landroid/widget/EditText;->setFocusable(Z)V

    .line 19
    iget-object p1, p0, Lcom/join/mgps/activity/message/CommunityFragment;->A:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->requestFocus()Z

    .line 20
    iget-object p1, p0, Lcom/join/mgps/activity/message/CommunityFragment;->k:Landroid/content/Context;

    invoke-virtual {p1, v7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    .line 21
    invoke-virtual {p1, v0, v6}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V

    .line 22
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    .line 23
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p2

    new-instance p3, Lcom/join/mgps/activity/message/CommunityFragment$f;

    invoke-direct {p3, p0, p1}, Lcom/join/mgps/activity/message/CommunityFragment$f;-><init>(Lcom/join/mgps/activity/message/CommunityFragment;Landroid/view/View;)V

    invoke-virtual {p2, p3}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 24
    iget-object p1, p0, Lcom/join/mgps/activity/message/CommunityFragment;->k:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const p2, 0x7f0c025c

    invoke-virtual {p1, p2, v10}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/message/CommunityFragment;->z:Landroid/view/View;

    .line 25
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/message/CommunityFragment;->h0(Landroid/view/View;)V

    goto :goto_0

    .line 26
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/message/CommunityFragment;->k:Landroid/content/Context;

    invoke-virtual {p1, v7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    .line 27
    invoke-virtual {p1, v0, v6}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V

    .line 28
    new-instance p1, Landroid/text/SpannableString;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 29
    new-instance p2, Landroid/text/style/AbsoluteSizeSpan;

    invoke-direct {p2, v3, v8}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    .line 30
    invoke-virtual {p1}, Landroid/text/SpannableString;->length()I

    move-result p3

    invoke-virtual {p1, p2, v0, p3, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 31
    iget-object p2, p0, Lcom/join/mgps/activity/message/CommunityFragment;->A:Landroid/widget/EditText;

    new-instance p3, Landroid/text/SpannedString;

    invoke-direct {p3, p1}, Landroid/text/SpannedString;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {p2, p3}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    .line 32
    iget-object p1, p0, Lcom/join/mgps/activity/message/CommunityFragment;->v:Landroid/widget/PopupWindow;

    if-eqz p1, :cond_1

    .line 33
    iget-object p2, p0, Lcom/join/mgps/activity/message/CommunityFragment;->z:Landroid/view/View;

    const/16 p3, 0x51

    invoke-virtual {p1, p2, p3, v0, v0}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    :cond_1
    :goto_0
    return-void
.end method

.method j0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/message/CommunityFragment;->b:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method k0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/message/CommunityFragment;->i:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method l0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/CommunityFragment;->b0()V

    .line 2
    sget-object v0, Lcom/MApplication;->M:Lcom/join/mgps/dto/MessageRedPointBean$MessagesBean$DataBean;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/MessageRedPointBean$MessagesBean$DataBean;->setCommunity_praise_surplus_number(I)V

    .line 4
    :cond_0
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    const-class v2, Lcom/join/mgps/activity/GivePraiceActivity_;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v1, 0x1

    const-string v2, "praice"

    .line 5
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 6
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method m0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/message/CommunityFragment;->d:Lcom/join/mgps/customview/XListView2;

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView2;->u()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/message/CommunityFragment;->d:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView2;->v()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method setNetwork()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/message/CommunityFragment;->k:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->w3(Landroid/content/Context;)V

    return-void
.end method

.method public setUserVisibleHint(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->setUserVisibleHint(Z)V

    if-eqz p1, :cond_0

    .line 2
    iget-boolean p1, p0, Lcom/join/mgps/activity/message/CommunityFragment;->u:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lcom/join/mgps/activity/message/CommunityFragment;->u:Z

    const/4 p1, 0x1

    .line 4
    iput p1, p0, Lcom/join/mgps/activity/message/CommunityFragment;->l:I

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/CommunityFragment;->Z()V

    :cond_0
    return-void
.end method

.method showLoding()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/message/CommunityFragment;->f:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/message/CommunityFragment;->g:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    const/16 v1, 0x8

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    return-void
.end method

.method showLodingFailed()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/message/CommunityFragment;->g:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/message/CommunityFragment;->f:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    const/16 v1, 0x8

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method showToast(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/message/CommunityFragment;->k:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method
