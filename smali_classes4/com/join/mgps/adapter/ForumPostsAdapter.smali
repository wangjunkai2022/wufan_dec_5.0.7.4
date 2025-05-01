.class public Lcom/join/mgps/adapter/ForumPostsAdapter;
.super Lcom/join/mgps/base/BaseMultiItemQuickAdapter;
.source "ForumPostsAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/adapter/ForumPostsAdapter$y;,
        Lcom/join/mgps/adapter/ForumPostsAdapter$c0;,
        Lcom/join/mgps/adapter/ForumPostsAdapter$z;,
        Lcom/join/mgps/adapter/ForumPostsAdapter$b0;,
        Lcom/join/mgps/adapter/ForumPostsAdapter$a0;,
        Lcom/join/mgps/adapter/ForumPostsAdapter$x;,
        Lcom/join/mgps/adapter/ForumPostsAdapter$d0;,
        Lcom/join/mgps/adapter/ForumPostsAdapter$e0;,
        Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/mgps/base/BaseMultiItemQuickAdapter<",
        "Lcom/join/mgps/adapter/ForumPostsAdapter$e0;",
        "Lcom/join/mgps/base/BaseViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private final d:Ljava/lang/String;

.field e:Lcom/danikula/videocache/i;

.field private f:Ljava/lang/String;

.field private g:Landroid/content/Context;

.field h:Lcom/join/android/app/component/video/c;

.field i:Lcom/join/mgps/adapter/ForumPostsAdapter$c0;

.field j:Landroid/widget/LinearLayout$LayoutParams;

.field k:I

.field l:I

.field m:Landroid/widget/LinearLayout$LayoutParams;

.field n:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable<",
            "Ljava/lang/String;",
            "Lcom/join/mgps/adapter/ForumPostsAdapter$d0;",
            ">;"
        }
    .end annotation
.end field

.field o:Lcom/join/mgps/adapter/ForumPostsAdapter$x;

.field p:Z

.field q:Lcom/join/mgps/adapter/ForumPostsAdapter$a0;

.field private r:Lcom/join/mgps/adapter/ForumPostsAdapter$b0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/join/android/app/component/video/c;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, v0}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;-><init>(Ljava/util/List;)V

    .line 2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->d:Ljava/lang/String;

    const-string v0, ""

    .line 3
    iput-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->f:Ljava/lang/String;

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->k:I

    .line 5
    iput v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->l:I

    .line 6
    iput-boolean v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->p:Z

    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->r:Lcom/join/mgps/adapter/ForumPostsAdapter$b0;

    .line 8
    iput-object p1, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->g:Landroid/content/Context;

    .line 9
    iput-object p2, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->h:Lcom/join/android/app/component/video/c;

    .line 10
    invoke-virtual {p0, p1}, Lcom/join/mgps/adapter/ForumPostsAdapter;->S(Landroid/content/Context;)Lcom/danikula/videocache/i;

    move-result-object p2

    iput-object p2, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->e:Lcom/danikula/videocache/i;

    .line 11
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/ForumPostsAdapter;->R(Landroid/content/Context;)I

    move-result p2

    iput p2, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->k:I

    .line 12
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/ForumPostsAdapter;->Q(Landroid/content/Context;)I

    move-result p1

    iput p1, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->l:I

    .line 13
    sget-object p1, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->POST_HEADER:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const p2, 0x7f0c05c8

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    .line 14
    sget-object p1, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->POST_HEADER1:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const p2, 0x7f0c05c9

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    .line 15
    sget-object p1, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->POST_FOOTER:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const p2, 0x7f0c05c4

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    .line 16
    sget-object p1, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->POST_FOOTER1:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const p2, 0x7f0c05c5

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    .line 17
    sget-object p1, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->POST_GAME_RES_LINK:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const p2, 0x7f0c05c7

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    .line 18
    sget-object p1, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->POST_GAME:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const p2, 0x7f0c05c6

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    .line 19
    sget-object p1, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->POST_IMAGE:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const p2, 0x7f0c05ca

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    .line 20
    sget-object p1, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->POST_VIDEO:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const p2, 0x7f0c05d3

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    .line 21
    sget-object p1, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->POST_IMAGE_THUMBNAIL:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const p2, 0x7f0c05cb

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    .line 22
    sget-object p1, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->POST_MESSAGE:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const p2, 0x7f0c05cc

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    .line 23
    sget-object p1, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->POST_RICH_MESSAGE:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const p2, 0x7f0c05cf

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    .line 24
    sget-object p1, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->POST_SUBJECT:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const p2, 0x7f0c05d0

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    .line 25
    sget-object p1, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->EMPLOYEE_TAGS:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const p2, 0x7f0c05c3

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    .line 26
    sget-object p1, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->DIVIDER:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const p2, 0x7f0c05c1

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    .line 27
    invoke-direct {p0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->U()V

    return-void
.end method

.method private A(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V
    .locals 8

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$i;

    if-nez p2, :cond_0

    return-void

    .line 2
    :cond_0
    iget v0, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$i;->j:I

    const v1, 0x7f0905bb

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v3, :cond_1

    .line 3
    invoke-virtual {p1, v1, v2}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_0

    .line 4
    :cond_1
    invoke-virtual {p1, v1, v3}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 5
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u53d1\u5e03\u4e8e "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v4, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$i;->e:J

    const-wide/16 v6, 0x3e8

    mul-long v4, v4, v6

    invoke-static {v4, v5}, Lcom/join/android/app/common/utils/g;->a(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f0905ef

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const v0, 0x7f090719

    .line 6
    iget-object v4, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$i;->q:Ljava/lang/String;

    invoke-virtual {p1, v0, v4}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const v0, 0x7f09071a

    .line 7
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    iget v4, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$i;->r:I

    invoke-direct {p0, v0, v4}, Lcom/join/mgps/adapter/ForumPostsAdapter;->u0(Landroid/view/View;I)V

    .line 8
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->p0(Landroid/view/View;)V

    const v0, 0x7f0905d5

    .line 9
    invoke-virtual {p1, v0, v2}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 10
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    iget v4, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$i;->g:I

    invoke-virtual {p0, v0, v4}, Lcom/join/mgps/adapter/ForumPostsAdapter;->s0(Landroid/view/View;I)V

    new-array v0, v3, [Landroid/view/View;

    .line 11
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    aput-object v1, v0, v2

    invoke-static {v0}, Lcom/join/mgps/Util/j0;->S0([Landroid/view/View;)V

    .line 12
    iget-boolean v0, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$i;->s:Z

    const v1, 0x7f0914b1

    if-eqz v0, :cond_2

    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u8d4f"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$i;->t:Ljava/lang/String;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\u94dc\u677f"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v1, p2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 14
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    const/16 v0, 0x11

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 15
    invoke-virtual {p1, v1, v3}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_1

    .line 16
    :cond_2
    invoke-virtual {p1, v1, v2}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method

.method private A0(Landroid/view/View;I)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    instance-of v0, p1, Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 2
    check-cast p1, Landroid/widget/TextView;

    .line 3
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 4
    :cond_1
    instance-of v0, p1, Landroid/widget/Button;

    if-eqz v0, :cond_2

    .line 5
    check-cast p1, Landroid/widget/Button;

    .line 6
    invoke-virtual {p1, p2}, Landroid/widget/Button;->setTextColor(I)V

    :cond_2
    :goto_0
    return-void
.end method

.method private B(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V
    .locals 12

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$j;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-nez p2, :cond_0

    return-void

    :cond_0
    const v0, 0x7f0917cf

    .line 2
    :try_start_1
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/customview/VipView;

    iget v2, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$j;->j:I

    iget v3, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$j;->k:I

    invoke-virtual {v1, v2, v3}, Lcom/join/mgps/customview/VipView;->setVipData(II)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 3
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 4
    :goto_0
    iget v1, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$j;->i:I

    const v2, 0x7f0905bb

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v1, v4, :cond_1

    .line 5
    invoke-virtual {p1, v2, v3}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_1

    .line 6
    :cond_1
    invoke-virtual {p1, v2, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    :goto_1
    const v1, 0x7f0905d5

    .line 7
    invoke-virtual {p1, v1, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    const v2, 0x7f0905f3

    .line 8
    iget-boolean v5, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$j;->a:Z

    if-nez v5, :cond_2

    const/4 v5, 0x1

    goto :goto_2

    :cond_2
    const/4 v5, 0x0

    :goto_2
    invoke-virtual {p1, v2, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    const v2, 0x7f0905f5

    .line 9
    invoke-virtual {p1, v2, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 10
    iget-object v2, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$j;->c:Ljava/lang/String;

    const v5, 0x7f0905fa

    invoke-virtual {p1, v5, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 11
    iget-wide v6, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$j;->d:J

    const-wide/16 v8, 0x3e8

    mul-long v6, v6, v8

    invoke-static {v6, v7}, Lcom/join/android/app/common/utils/g;->a(J)Ljava/lang/String;

    move-result-object v2

    const v6, 0x7f0905ef

    invoke-virtual {p1, v6, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const v2, 0x7f090600

    .line 12
    iget-boolean v7, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$j;->e:Z

    invoke-virtual {p1, v2, v7}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    const v2, 0x7f090f4a

    .line 13
    iget-boolean v7, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$j;->h:Z

    invoke-virtual {p1, v2, v7}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 14
    iget-boolean v2, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$j;->g:Z

    const v7, 0x7f0905f9

    if-eqz v2, :cond_3

    .line 15
    iget-object v2, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->g:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v8, 0x7f06002b

    invoke-virtual {v2, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {p1, v5, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 16
    invoke-virtual {p1, v7, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_3

    .line 17
    :cond_3
    iget-object v2, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->g:Landroid/content/Context;

    invoke-virtual {p1, v5}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    iget v9, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$j;->j:I

    iget v10, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$j;->k:I

    const v11, 0x7f060127

    invoke-static {v2, v8, v9, v10, v11}, Lcom/join/mgps/Util/UtilsMy;->A3(Landroid/content/Context;Landroid/widget/TextView;III)Z

    .line 18
    invoke-virtual {p1, v7, v3}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    :goto_3
    const v2, 0x7f0905f0

    .line 19
    invoke-virtual {p1, v2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/facebook/drawee/view/SimpleDraweeView;

    iget-object v8, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$j;->b:Ljava/lang/String;

    invoke-static {v7, v8}, Lcom/join/android/app/common/utils/MyImageLoader;->x(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 20
    invoke-virtual {p1, v2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v7

    new-instance v8, Lcom/join/mgps/adapter/ForumPostsAdapter$q;

    invoke-direct {v8, p0, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter$q;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter;Lcom/join/mgps/adapter/ForumPostsAdapter$e0$j;)V

    invoke-virtual {v7, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    iget-object v7, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p0, v7}, Lcom/join/mgps/adapter/ForumPostsAdapter;->p0(Landroid/view/View;)V

    .line 22
    invoke-virtual {p1, v1, v3}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 23
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    iget v7, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$j;->f:I

    invoke-virtual {p0, v1, v7}, Lcom/join/mgps/adapter/ForumPostsAdapter;->s0(Landroid/view/View;I)V

    const/4 v1, 0x3

    new-array v1, v1, [Landroid/view/View;

    .line 24
    invoke-virtual {p1, v2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    aput-object v2, v1, v3

    invoke-virtual {p1, v5}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    aput-object v2, v1, v4

    const/4 v2, 0x2

    invoke-virtual {p1, v6}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v5

    aput-object v5, v1, v2

    invoke-static {v1}, Lcom/join/mgps/Util/j0;->S0([Landroid/view/View;)V

    new-array v1, v4, [Landroid/view/View;

    .line 25
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    aput-object v0, v1, v3

    invoke-static {v1}, Lcom/join/mgps/Util/j0;->U0([Landroid/view/View;)V

    .line 26
    iget-object v0, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$j;->m:Ljava/lang/String;

    .line 27
    iget-object p2, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$j;->n:Ljava/lang/String;

    const v1, 0x7f0903b1

    .line 28
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_6

    .line 29
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_5

    .line 30
    invoke-virtual {p1, v1, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 31
    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 32
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0804ac

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 33
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 34
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x7

    if-ne v2, v3, :cond_4

    const-string v2, "#"

    .line 35
    invoke-virtual {p2, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_4

    :cond_4
    const-string p2, "#2fccdf"

    .line 36
    :goto_4
    new-instance v2, Landroid/graphics/LightingColorFilter;

    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p2

    invoke-direct {v2, v3, p2}, Landroid/graphics/LightingColorFilter;-><init>(II)V

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 37
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_5

    .line 38
    :cond_5
    invoke-virtual {p1, v1, v3}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_5

    :catch_1
    move-exception p1

    .line 39
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_6
    :goto_5
    return-void
.end method

.method private C(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$l;

    if-nez p2, :cond_0

    return-void

    :cond_0
    const v0, 0x7f0905f6

    .line 2
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iget-object v0, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$l;->a:Ljava/util/List;

    iget-object p2, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$l;->b:Ljava/util/List;

    invoke-direct {p0, p1, v0, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter;->d0(Landroid/widget/RelativeLayout;Ljava/util/List;Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private C0(Landroid/view/View;Lcom/join/mgps/adapter/ForumPostsAdapter$e0$a;)V
    .locals 8

    if-nez p2, :cond_0

    return-void

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->o:Lcom/join/mgps/adapter/ForumPostsAdapter$x;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->o:Lcom/join/mgps/adapter/ForumPostsAdapter$x;

    invoke-virtual {v0}, Lcom/join/mgps/adapter/ForumPostsAdapter$x;->dismiss()V

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->o:Lcom/join/mgps/adapter/ForumPostsAdapter$x;

    if-nez v0, :cond_2

    .line 4
    new-instance v0, Lcom/join/mgps/adapter/ForumPostsAdapter$x;

    iget-object v1, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->g:Landroid/content/Context;

    invoke-direct {v0, p0, v1}, Lcom/join/mgps/adapter/ForumPostsAdapter$x;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->o:Lcom/join/mgps/adapter/ForumPostsAdapter$x;

    .line 5
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->o:Lcom/join/mgps/adapter/ForumPostsAdapter$x;

    iget v1, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$a;->c:I

    invoke-virtual {v0, v1}, Lcom/join/mgps/adapter/ForumPostsAdapter$x;->f(I)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->o:Lcom/join/mgps/adapter/ForumPostsAdapter$x;

    iget-object v1, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$a;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/adapter/ForumPostsAdapter$x;->h(Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0712b9

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    .line 8
    iget-object v1, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0714f1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    .line 9
    iget-object v2, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->g:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f071435

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    .line 10
    iget-boolean v3, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$a;->l:Z

    const v4, 0x7f09177f

    const v5, 0x7f09111e

    const/4 v6, 0x0

    const/16 v7, 0x8

    if-eqz v3, :cond_3

    .line 11
    iget-object v3, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->o:Lcom/join/mgps/adapter/ForumPostsAdapter$x;

    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    .line 12
    iget-object v3, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->o:Lcom/join/mgps/adapter/ForumPostsAdapter$x;

    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 13
    :cond_3
    iget-object v3, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->o:Lcom/join/mgps/adapter/ForumPostsAdapter$x;

    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v7}, Landroid/view/View;->setVisibility(I)V

    .line 14
    iget-object v3, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->o:Lcom/join/mgps/adapter/ForumPostsAdapter$x;

    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v7}, Landroid/view/View;->setVisibility(I)V

    sub-int/2addr v0, v2

    .line 15
    :goto_0
    iget-boolean v3, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$a;->m:Z

    const v4, 0x7f09177e

    const v5, 0x7f091116

    if-eqz v3, :cond_4

    .line 16
    iget-object v3, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->o:Lcom/join/mgps/adapter/ForumPostsAdapter$x;

    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    .line 17
    iget-object v3, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->o:Lcom/join/mgps/adapter/ForumPostsAdapter$x;

    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 18
    :cond_4
    iget-object v3, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->o:Lcom/join/mgps/adapter/ForumPostsAdapter$x;

    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v7}, Landroid/view/View;->setVisibility(I)V

    .line 19
    iget-object v3, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->o:Lcom/join/mgps/adapter/ForumPostsAdapter$x;

    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v7}, Landroid/view/View;->setVisibility(I)V

    sub-int/2addr v0, v2

    .line 20
    :goto_1
    iget-boolean p2, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$a;->n:Z

    const v3, 0x7f09176e

    const v4, 0x7f0903ee

    if-eqz p2, :cond_5

    .line 21
    iget-object p2, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->o:Lcom/join/mgps/adapter/ForumPostsAdapter$x;

    invoke-virtual {p2}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 22
    iget-object p2, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->o:Lcom/join/mgps/adapter/ForumPostsAdapter$x;

    invoke-virtual {p2}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v6}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    .line 23
    :cond_5
    iget-object p2, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->o:Lcom/join/mgps/adapter/ForumPostsAdapter$x;

    invoke-virtual {p2}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 24
    iget-object p2, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->o:Lcom/join/mgps/adapter/ForumPostsAdapter$x;

    invoke-virtual {p2}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v7}, Landroid/view/View;->setVisibility(I)V

    sub-int/2addr v0, v2

    .line 25
    :goto_2
    iget-object p2, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->o:Lcom/join/mgps/adapter/ForumPostsAdapter$x;

    invoke-virtual {p2, v0}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 26
    iget-object p2, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->o:Lcom/join/mgps/adapter/ForumPostsAdapter$x;

    invoke-virtual {p2}, Landroid/widget/PopupWindow;->getWidth()I

    move-result p2

    .line 27
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->o:Lcom/join/mgps/adapter/ForumPostsAdapter$x;

    invoke-virtual {v0}, Lcom/join/mgps/customview/e;->getHeight()I

    move-result v0

    neg-int p2, p2

    if-nez v0, :cond_6

    goto :goto_3

    :cond_6
    move v1, v0

    .line 28
    :goto_3
    div-int/lit8 v1, v1, 0x2

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    add-int/2addr v1, v0

    neg-int v0, v1

    .line 29
    iget-object v1, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->o:Lcom/join/mgps/adapter/ForumPostsAdapter$x;

    invoke-virtual {v1, p1, p2, v0}, Lcom/join/mgps/adapter/ForumPostsAdapter$x;->showAsDropDown(Landroid/view/View;II)V

    .line 30
    iget-object p2, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->o:Lcom/join/mgps/adapter/ForumPostsAdapter$x;

    new-instance v0, Lcom/join/mgps/adapter/ForumPostsAdapter$c;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/adapter/ForumPostsAdapter$c;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter;Landroid/view/View;)V

    invoke-virtual {p2, v0}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method private D(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$k;

    if-nez p2, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->g:Landroid/content/Context;

    iget-object v1, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$k;->c:Ljava/util/List;

    iget v2, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$k;->b:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/adapter/ForumPostsAdapter;->b0(Landroid/content/Context;Ljava/lang/String;)V

    .line 3
    iget-object v0, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$k;->a:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->P(Ljava/lang/String;)Lcom/join/mgps/adapter/ForumPostsAdapter$d0;

    move-result-object v0

    const v1, 0x7f090810

    if-eqz v0, :cond_1

    .line 4
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    iget v3, v0, Lcom/join/mgps/adapter/ForumPostsAdapter$d0;->a:I

    iget v0, v0, Lcom/join/mgps/adapter/ForumPostsAdapter$d0;->b:I

    invoke-direct {v2, v3, v0}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 5
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 6
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iget-object v2, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$k;->a:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    goto :goto_0

    .line 7
    :cond_1
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iget-object v2, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$k;->a:Ljava/lang/String;

    invoke-virtual {p0, v0, v2}, Lcom/join/mgps/adapter/ForumPostsAdapter;->Y(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 8
    :goto_0
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iget v0, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$k;->b:I

    iget-object p2, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$k;->c:Ljava/util/List;

    invoke-static {p1, v0, p2}, Lcom/join/mgps/Util/j0;->C1(Landroid/widget/ImageView;ILjava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method

.method private D0(Lcom/join/mgps/base/BaseViewHolder;I)V
    .locals 7

    const v0, 0x7f090e0b

    const v1, 0x7f09145e

    const v2, 0x7f090c7d

    const v3, 0x7f091051

    const v4, 0x7f09104a

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-nez p2, :cond_0

    .line 1
    invoke-virtual {p1, v2, v6}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 2
    invoke-virtual {p1, v4, v6}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 3
    invoke-virtual {p1, v3, v6}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 4
    invoke-virtual {p1, v1, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 5
    invoke-virtual {p1, v0, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_1

    .line 6
    :cond_0
    invoke-virtual {p1, v2, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    const/16 v2, 0x11

    if-ne p2, v2, :cond_1

    .line 7
    invoke-virtual {p1, v4, v6}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 8
    invoke-virtual {p1, v3, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_0

    .line 9
    :cond_1
    invoke-virtual {p1, v4, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 10
    invoke-virtual {p1, v3, v6}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 11
    :goto_0
    invoke-virtual {p1, v1, v6}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 12
    invoke-virtual {p1, v0, v6}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    :goto_1
    return-void
.end method

.method private E(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V
    .locals 9

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$m;

    if-nez p2, :cond_0

    return-void

    :cond_0
    const v0, 0x7f0905f8

    .line 2
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Landroid/widget/TextView;

    .line 3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_1

    .line 4
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x3ca3d70a    # 0.02f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setLetterSpacing(F)V

    .line 5
    :cond_1
    invoke-direct {p0, v3}, Lcom/join/mgps/adapter/ForumPostsAdapter;->V(Landroid/widget/TextView;)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f060129

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 7
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    const v0, 0x7fffffff

    .line 8
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 9
    new-instance v0, Lcom/join/mgps/adapter/ForumPostsAdapter$t;

    invoke-direct {v0, p0}, Lcom/join/mgps/adapter/ForumPostsAdapter$t;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter;)V

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    iget-object v4, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$m;->b:Landroid/text/SpannableStringBuilder;

    iget-boolean v5, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$m;->a:Z

    iget-boolean v6, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$m;->c:Z

    iget-object v7, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$m;->d:Ljava/lang/String;

    iget-object v8, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$m;->e:Ljava/util/List;

    move-object v2, p0

    invoke-direct/range {v2 .. v8}, Lcom/join/mgps/adapter/ForumPostsAdapter;->i0(Landroid/widget/TextView;Landroid/text/SpannableStringBuilder;ZZLjava/lang/String;Ljava/util/List;)V

    .line 11
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p0, p1}, Lcom/join/mgps/adapter/ForumPostsAdapter;->p0(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private F(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$n;

    if-nez p2, :cond_0

    return-void

    :cond_0
    const v0, 0x7f0905f8

    .line 2
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 3
    invoke-direct {p0, v0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->V(Landroid/widget/TextView;)V

    .line 4
    new-instance v1, Lcom/join/mgps/adapter/ForumPostsAdapter$u;

    invoke-direct {v1, p0}, Lcom/join/mgps/adapter/ForumPostsAdapter$u;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 5
    iget-object p2, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$n;->b:Landroid/text/Spanned;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p0, p1}, Lcom/join/mgps/adapter/ForumPostsAdapter;->p0(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private G(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V
    .locals 11

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$o;

    if-nez p2, :cond_0

    return-void

    :cond_0
    const v0, 0x7f090601

    .line 2
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/TextView;

    const/4 v0, 0x0

    .line 3
    iget-object v1, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f070b2c

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v2, v0, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 4
    sget-object v0, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 5
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 6
    iget-object v3, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$o;->b:Ljava/lang/String;

    iget-boolean v4, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$o;->a:Z

    iget-boolean v5, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$o;->c:Z

    iget-object v6, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$o;->d:Ljava/lang/String;

    iget-object v7, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$o;->e:Ljava/util/List;

    iget-object v8, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$o;->f:Ljava/util/List;

    iget v9, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$o;->g:I

    iget-object v10, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$o;->h:Ljava/lang/String;

    move-object v1, p0

    invoke-direct/range {v1 .. v10}, Lcom/join/mgps/adapter/ForumPostsAdapter;->h0(Landroid/widget/TextView;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/List;Ljava/util/List;ILjava/lang/String;)V

    .line 7
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p0, p1}, Lcom/join/mgps/adapter/ForumPostsAdapter;->p0(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private H(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V
    .locals 6

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$p;

    if-nez p2, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$p;->b:Ljava/lang/String;

    .line 3
    iget-object p2, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$p;->a:Ljava/lang/String;

    const v1, 0x7f090154

    .line 4
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 5
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result v2

    const/4 v3, -0x1

    if-eqz v1, :cond_1

    .line 6
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 7
    new-instance v4, Landroid/widget/RelativeLayout$LayoutParams;

    iget v5, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->k:I

    invoke-direct {v4, v3, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 8
    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 9
    sget-object v4, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    const v4, 0x7f080f5d

    .line 10
    invoke-static {v1, v4, p2}, Lcom/join/android/app/common/utils/MyImageLoader;->d(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;)V

    .line 11
    new-instance v4, Lcom/join/mgps/adapter/ForumPostsAdapter$s;

    invoke-direct {v4, p0, v2}, Lcom/join/mgps/adapter/ForumPostsAdapter$s;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter;I)V

    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    const v1, 0x7f091792

    .line 12
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    if-eqz p1, :cond_3

    .line 13
    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    iget v4, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->k:I

    invoke-direct {v1, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 14
    invoke-virtual {p1, v1}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 15
    iget-object p1, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->e:Lcom/danikula/videocache/i;

    if-eqz p1, :cond_2

    .line 16
    invoke-virtual {p1, v0}, Lcom/danikula/videocache/i;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 17
    :cond_2
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 18
    new-instance p1, Lcom/join/android/app/component/video/c$l;

    invoke-direct {p1, v2, v0, p2}, Lcom/join/android/app/component/video/c$l;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 19
    iget-object p2, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->h:Lcom/join/android/app/component/video/c;

    const/4 v0, 0x0

    new-array v0, v0, [Z

    invoke-virtual {p2, v2, p1, v0}, Lcom/join/android/app/component/video/c;->e(ILcom/join/android/app/component/video/c$l;[Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 20
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_3
    :goto_0
    return-void
.end method

.method private I(Landroid/widget/PopupWindow;Landroid/view/MotionEvent;)Z
    .locals 1

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    if-nez p2, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_1

    return v0

    .line 2
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter;->J(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1

    :cond_2
    :goto_0
    return v0
.end method

.method private J(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 6

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x2

    new-array v1, v1, [I

    .line 1
    invoke-virtual {p1, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v2

    float-to-int v2, v2

    .line 3
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result p2

    float-to-int p2, p2

    .line 4
    aget v3, v1, v0

    const/4 v4, 0x1

    if-ge v3, v2, :cond_1

    aget v3, v1, v4

    if-ge v3, p2, :cond_1

    aget v3, v1, v0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v5

    add-int/2addr v3, v5

    if-ge v2, v3, :cond_1

    aget v1, v1, v4

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    add-int/2addr v1, p1

    if-ge p2, v1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method private N(Landroid/content/Context;)Landroid/widget/LinearLayout$LayoutParams;
    .locals 6

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->m:Landroid/widget/LinearLayout$LayoutParams;

    if-nez v0, :cond_1

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v2, 0x3fc00000    # 1.5f

    const/16 v3, 0x1e

    const/4 v4, 0x4

    const v5, 0x7f070d86

    .line 5
    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    sub-int/2addr v1, v0

    int-to-float v0, v1

    int-to-float v1, v3

    mul-float v1, v1, p1

    sub-float/2addr v0, v1

    float-to-int v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    int-to-float v3, v0

    mul-float v3, v3, v1

    div-float/2addr v3, v2

    float-to-int v1, v3

    int-to-float v2, v4

    mul-float v2, v2, p1

    float-to-int p1, v2

    .line 6
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v2, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v0, 0x0

    .line 7
    invoke-virtual {v2, v0, p1, v0, p1}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 8
    iput-object v2, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->m:Landroid/widget/LinearLayout$LayoutParams;

    .line 9
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->m:Landroid/widget/LinearLayout$LayoutParams;

    return-object p1
.end method

.method private Q(Landroid/content/Context;)I
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1
    :cond_0
    iget v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->l:I

    if-nez v0, :cond_1

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    const/high16 v1, 0x3fc00000    # 1.5f

    const v2, 0x7f070d86

    .line 4
    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    sub-int/2addr v0, p1

    const/high16 p1, 0x3f800000    # 1.0f

    int-to-float v0, v0

    mul-float v0, v0, p1

    div-float/2addr v0, v1

    float-to-int p1, v0

    .line 5
    iput p1, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->l:I

    .line 6
    :cond_1
    iget p1, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->l:I

    return p1
.end method

.method private R(Landroid/content/Context;)I
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1
    :cond_0
    iget v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->k:I

    if-nez v0, :cond_1

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    const v1, 0x3fe66666    # 1.8f

    const v2, 0x7f070d86

    .line 4
    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    sub-int/2addr v0, p1

    const/high16 p1, 0x3f800000    # 1.0f

    int-to-float v0, v0

    mul-float v0, v0, p1

    div-float/2addr v0, v1

    float-to-int p1, v0

    .line 5
    iput p1, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->k:I

    .line 6
    :cond_1
    iget p1, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->k:I

    return p1
.end method

.method private U()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->j:Landroid/widget/LinearLayout$LayoutParams;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->T()Landroid/widget/LinearLayout$LayoutParams;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->j:Landroid/widget/LinearLayout$LayoutParams;

    :cond_0
    return-void
.end method

.method private V(Landroid/widget/TextView;)V
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
    new-instance v7, Lcom/join/mgps/adapter/ForumPostsAdapter$y;

    invoke-virtual {p1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-direct {v7, p0, v8, v6}, Lcom/join/mgps/adapter/ForumPostsAdapter$y;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter;Landroid/content/Context;Ljava/lang/String;)V

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

.method private synthetic W(Lcom/join/mgps/adapter/ForumPostsAdapter$e0$h;Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p2, p1, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$h;->c:Ljava/lang/String;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 2
    new-instance p2, Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {p2}, Lcom/join/mgps/Util/IntentDateBean;-><init>()V

    const/4 v0, 0x4

    .line 3
    invoke-virtual {p2, v0}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    .line 4
    iget-object p1, p1, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$h;->c:Ljava/lang/String;

    invoke-virtual {p2, p1}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type_val(Ljava/lang/String;)V

    .line 5
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->g:Landroid/content/Context;

    invoke-virtual {p1, v0, p2}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    :cond_0
    return-void
.end method

.method private Z(Landroid/view/View;ZI)V
    .locals 2

    const v0, 0x7f0905fc

    .line 1
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f0905fd

    .line 2
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    const-string v1, ""

    if-eqz p2, :cond_0

    const p2, 0x7f080927

    .line 3
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    const p2, 0x7f080f30

    .line 5
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method private c0(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-static {p2}, Lcom/join/mgps/Util/j0;->i0(Ljava/lang/String;)[Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lcom/join/mgps/adapter/ForumPostsAdapter$d0;

    invoke-direct {v1, p0}, Lcom/join/mgps/adapter/ForumPostsAdapter$d0;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter;)V

    const/4 v2, 0x0

    .line 3
    aget-object v2, v0, v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x1

    .line 4
    aget-object v0, v0, v3

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    const v4, 0x7f070d86

    .line 7
    invoke-virtual {p1, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    mul-int/lit8 v4, v4, 0x2

    sub-int/2addr v3, v4

    int-to-float v3, v3

    const/high16 v4, 0x42200000    # 40.0f

    .line 8
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    mul-float p1, p1, v4

    sub-float/2addr v3, p1

    float-to-int p1, v3

    int-to-float v3, p1

    const/high16 v4, 0x3f800000    # 1.0f

    mul-float v3, v3, v4

    int-to-float v0, v0

    mul-float v0, v0, v4

    int-to-float v2, v2

    div-float/2addr v0, v2

    mul-float v3, v3, v0

    float-to-int v0, v3

    .line 9
    iput p1, v1, Lcom/join/mgps/adapter/ForumPostsAdapter$d0;->a:I

    .line 10
    iput v0, v1, Lcom/join/mgps/adapter/ForumPostsAdapter$d0;->b:I

    .line 11
    invoke-virtual {p0, p2, v1}, Lcom/join/mgps/adapter/ForumPostsAdapter;->q(Ljava/lang/String;Lcom/join/mgps/adapter/ForumPostsAdapter$d0;)V

    :cond_0
    return-void
.end method

.method private d0(Landroid/widget/RelativeLayout;Ljava/util/List;Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/RelativeLayout;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/16 v0, 0x8

    if-eqz p2, :cond_6

    .line 1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_4

    .line 2
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->j:Landroid/widget/LinearLayout$LayoutParams;

    if-nez v1, :cond_1

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->T()Landroid/widget/LinearLayout$LayoutParams;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->j:Landroid/widget/LinearLayout$LayoutParams;

    :cond_1
    const v1, 0x7f09080f

    .line 4
    invoke-virtual {p1, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x3

    const/4 v4, 0x0

    if-le v2, v3, :cond_2

    .line 6
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u5171"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, "\u5f20"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 8
    :cond_2
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 9
    :goto_0
    iget-object v1, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 10
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v2, 0x40c00000    # 6.0f

    mul-float v1, v1, v2

    float-to-int v1, v1

    new-array v2, v3, [I

    .line 11
    fill-array-data v2, :array_0

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v3, :cond_5

    .line 12
    aget v6, v2, v5

    invoke-virtual {p1, v6}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 13
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    iget-object v8, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->j:Landroid/widget/LinearLayout$LayoutParams;

    iget v9, v8, Landroid/widget/LinearLayout$LayoutParams;->width:I

    iget v8, v8, Landroid/widget/LinearLayout$LayoutParams;->height:I

    invoke-direct {v7, v9, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 14
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v8

    if-ge v5, v8, :cond_4

    .line 15
    invoke-interface {p2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .line 16
    invoke-virtual {v6, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    if-lez v5, :cond_3

    .line 17
    invoke-virtual {v7, v1, v4, v4, v4}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    goto :goto_2

    .line 18
    :cond_3
    invoke-virtual {v7, v4, v4, v4, v4}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 19
    :goto_2
    invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 20
    sget-object v7, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 21
    sget-object v7, Lcom/facebook/drawee/drawable/r$c;->g:Lcom/facebook/drawee/drawable/r$c;

    invoke-static {v6, v8, v7}, Lcom/join/android/app/common/utils/MyImageLoader;->i(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;Lcom/facebook/drawee/drawable/r$c;)V

    .line 22
    new-instance v7, Lcom/join/mgps/adapter/ForumPostsAdapter$w;

    invoke-direct {v7, p0, p3, v5}, Lcom/join/mgps/adapter/ForumPostsAdapter$w;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter;Ljava/util/List;I)V

    invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_3

    .line 23
    :cond_4
    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_5
    return-void

    .line 24
    :cond_6
    :goto_4
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    return-void

    :array_0
    .array-data 4
        0x7f090850
        0x7f090851
        0x7f090852
    .end array-data
.end method

.method public static synthetic h(Lcom/join/mgps/adapter/ForumPostsAdapter;Lcom/join/mgps/adapter/ForumPostsAdapter$e0$h;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter;->W(Lcom/join/mgps/adapter/ForumPostsAdapter$e0$h;Landroid/view/View;)V

    return-void
.end method

.method private h0(Landroid/widget/TextView;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/List;Ljava/util/List;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/TextView;",
            "Ljava/lang/String;",
            "ZZ",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/ForumBean$ForumPostsBean$TagInfo;",
            ">;",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/RecommendLabelTag;",
            ">;I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    new-instance p3, Landroid/text/SpannableStringBuilder;

    invoke-direct {p3}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 2
    invoke-virtual {p1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object p4

    invoke-static {p4, p3, p6}, Lcom/join/mgps/Util/j0;->h(Landroid/content/Context;Landroid/text/SpannableStringBuilder;Ljava/util/List;)V

    .line 3
    invoke-virtual {p1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object p4

    invoke-static {p4, p3, p7, p8, p9}, Lcom/join/mgps/Util/j0;->i(Landroid/content/Context;Landroid/text/SpannableStringBuilder;Ljava/util/List;ILjava/lang/String;)V

    .line 4
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p4

    if-eqz p4, :cond_0

    const-string p2, ""

    :cond_0
    invoke-virtual {p3, p2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 5
    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method static synthetic i(Lcom/join/mgps/adapter/ForumPostsAdapter;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->g:Landroid/content/Context;

    return-object p0
.end method

.method private i0(Landroid/widget/TextView;Landroid/text/SpannableStringBuilder;ZZLjava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/TextView;",
            "Landroid/text/SpannableStringBuilder;",
            "ZZ",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/ForumBean$ForumPostsBean$TagInfo;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance p3, Landroid/text/SpannableStringBuilder;

    invoke-direct {p3}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 2
    invoke-virtual {p1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object p4

    invoke-static {p4, p3, p6}, Lcom/join/mgps/Util/j0;->h(Landroid/content/Context;Landroid/text/SpannableStringBuilder;Ljava/util/List;)V

    .line 3
    invoke-virtual {p3, p2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 4
    invoke-virtual {p3}, Landroid/text/SpannableStringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "<br/>"

    const-string p4, ""

    invoke-virtual {p2, p3, p4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method static synthetic j(Lcom/join/mgps/adapter/ForumPostsAdapter;)Lcom/join/mgps/adapter/ForumPostsAdapter$b0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->r:Lcom/join/mgps/adapter/ForumPostsAdapter$b0;

    return-object p0
.end method

.method static synthetic k(Lcom/join/mgps/adapter/ForumPostsAdapter;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->f:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic l(Lcom/join/mgps/adapter/ForumPostsAdapter;Ljava/lang/String;Landroid/view/View;Lcom/facebook/imagepipeline/image/f;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/join/mgps/adapter/ForumPostsAdapter;->y0(Ljava/lang/String;Landroid/view/View;Lcom/facebook/imagepipeline/image/f;)Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    return-object p0
.end method

.method static synthetic m(Lcom/join/mgps/adapter/ForumPostsAdapter;Landroid/content/Context;)Landroid/widget/LinearLayout$LayoutParams;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/ForumPostsAdapter;->N(Landroid/content/Context;)Landroid/widget/LinearLayout$LayoutParams;

    move-result-object p0

    return-object p0
.end method

.method static synthetic n(Lcom/join/mgps/adapter/ForumPostsAdapter;Landroid/widget/PopupWindow;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter;->I(Landroid/widget/PopupWindow;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method static synthetic o(Lcom/join/mgps/adapter/ForumPostsAdapter;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter;->J(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method static synthetic p(Lcom/join/mgps/adapter/ForumPostsAdapter;Landroid/view/View;Lcom/join/mgps/adapter/ForumPostsAdapter$e0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter;->C0(Landroid/view/View;Lcom/join/mgps/adapter/ForumPostsAdapter$e0$a;)V

    return-void
.end method

.method private r(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V
    .locals 12

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$a;

    if-nez p2, :cond_0

    return-void

    :cond_0
    const v0, 0x7f09044b

    .line 2
    iget-boolean v1, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$a;->a:Z

    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    const v0, 0x7f0917cf

    .line 3
    :try_start_1
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/customview/VipView;

    iget v2, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$a;->o:I

    iget v3, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$a;->p:I

    invoke-virtual {v1, v2, v3}, Lcom/join/mgps/customview/VipView;->setVipData(II)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 4
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    const v1, 0x7f0905bb

    .line 5
    iget v2, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$a;->k:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v2, v4, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {p1, v1, v2}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 6
    iget-object v1, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$a;->e:Ljava/lang/String;

    const v2, 0x7f090363

    invoke-virtual {p1, v2, v1}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 7
    iget-wide v5, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$a;->f:J

    const-wide/16 v7, 0x3e8

    mul-long v5, v5, v7

    invoke-static {v5, v6}, Lcom/join/android/app/common/utils/g;->a(J)Ljava/lang/String;

    move-result-object v1

    const v5, 0x7f09034e

    invoke-virtual {p1, v5, v1}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const v1, 0x7f090350

    .line 8
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Lcom/facebook/drawee/view/SimpleDraweeView;

    iget-object v7, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$a;->d:Ljava/lang/String;

    invoke-static {v6, v7}, Lcom/join/android/app/common/utils/MyImageLoader;->x(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 9
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v6

    new-instance v7, Lcom/join/mgps/adapter/ForumPostsAdapter$v;

    invoke-direct {v7, p0, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter$v;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter;Lcom/join/mgps/adapter/ForumPostsAdapter$e0$a;)V

    invoke-virtual {v6, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v6, 0x7f0905f5

    .line 10
    iget-boolean v7, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$a;->g:Z

    invoke-virtual {p1, v6, v7}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    const v6, 0x7f090896

    .line 11
    iget-boolean v7, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$a;->j:Z

    invoke-virtual {p1, v6, v7}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 12
    iget-boolean v6, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$a;->i:Z

    const v7, 0x7f0905f9

    if-eqz v6, :cond_2

    .line 13
    iget-object v6, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->g:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v8, 0x7f06002b

    invoke-virtual {v6, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v6

    invoke-virtual {p1, v2, v6}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 14
    invoke-virtual {p1, v7, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_2

    .line 15
    :cond_2
    iget-object v6, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->g:Landroid/content/Context;

    invoke-virtual {p1, v2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    iget v9, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$a;->o:I

    iget v10, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$a;->p:I

    const v11, 0x7f060127

    invoke-static {v6, v8, v9, v10, v11}, Lcom/join/mgps/Util/UtilsMy;->A3(Landroid/content/Context;Landroid/widget/TextView;III)Z

    .line 16
    invoke-virtual {p1, v7, v3}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    :goto_2
    const v6, 0x7f090e39

    .line 17
    iget-boolean v7, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$a;->q:Z

    invoke-virtual {p1, v6, v7}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 18
    iget-object v6, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$a;->r:Ljava/lang/String;

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    const v7, 0x7f090df5

    if-nez v6, :cond_3

    .line 19
    invoke-virtual {p1, v7, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 20
    iget-object v6, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$a;->r:Ljava/lang/String;

    invoke-virtual {p1, v7, v6}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_3

    .line 21
    :cond_3
    invoke-virtual {p1, v7, v3}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 22
    :goto_3
    iget v6, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$a;->h:I

    const/4 v7, 0x2

    if-ne v6, v4, :cond_4

    .line 23
    iget-object v6, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->g:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v8, 0x7f10009f

    invoke-virtual {v6, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_4

    :cond_4
    if-ne v6, v7, :cond_5

    .line 24
    iget-object v6, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->g:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v8, 0x7f1000a0

    invoke-virtual {v6, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_4

    .line 25
    :cond_5
    iget-object v6, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->g:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v8, 0x7f10009e

    new-array v9, v4, [Ljava/lang/Object;

    iget v10, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$a;->h:I

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v9, v3

    invoke-virtual {v6, v8, v9}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    :goto_4
    const v8, 0x7f090352

    .line 26
    invoke-virtual {p1, v8, v6}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 27
    iget-object v6, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p0, v6}, Lcom/join/mgps/adapter/ForumPostsAdapter;->p0(Landroid/view/View;)V

    const v6, 0x7f090365

    .line 28
    invoke-virtual {p1, v6}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {p0, v6, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter;->o0(Landroid/view/View;Lcom/join/mgps/adapter/ForumPostsAdapter$e0$a;)V

    const/4 v6, 0x3

    new-array v6, v6, [Landroid/view/View;

    .line 29
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v8

    aput-object v8, v6, v3

    invoke-virtual {p1, v2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    aput-object v2, v6, v4

    invoke-virtual {p1, v5}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    aput-object v2, v6, v7

    invoke-static {v6}, Lcom/join/mgps/Util/j0;->S0([Landroid/view/View;)V

    new-array v2, v4, [Landroid/view/View;

    .line 30
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    aput-object v0, v2, v3

    invoke-static {v2}, Lcom/join/mgps/Util/j0;->U0([Landroid/view/View;)V

    .line 31
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    iget p2, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$a;->b:I

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter;->x0(Landroid/view/View;I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_5

    :catch_1
    move-exception p1

    .line 32
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_5
    return-void
.end method

.method private s(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$b;

    if-nez p2, :cond_0

    return-void

    :cond_0
    const v0, 0x7f090358

    .line 2
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 3
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 4
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->g:Landroid/content/Context;

    iget-object v1, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$b;->c:Ljava/util/List;

    iget v2, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$b;->b:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/join/mgps/adapter/ForumPostsAdapter;->c0(Landroid/content/Context;Ljava/lang/String;)V

    .line 5
    iget-object v0, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$b;->a:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->P(Ljava/lang/String;)Lcom/join/mgps/adapter/ForumPostsAdapter$d0;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 6
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    iget v2, v0, Lcom/join/mgps/adapter/ForumPostsAdapter$d0;->a:I

    iget v0, v0, Lcom/join/mgps/adapter/ForumPostsAdapter$d0;->b:I

    invoke-direct {v1, v2, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v0, 0x4

    int-to-float v0, v0

    .line 7
    iget-object v2, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->g:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    mul-float v0, v0, v2

    float-to-int v0, v0

    const/4 v2, 0x0

    .line 8
    invoke-virtual {v1, v2, v0, v2, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 9
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 10
    iget-object v0, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$b;->a:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    goto :goto_0

    .line 11
    :cond_1
    iget-object v0, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$b;->a:Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->X(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 12
    :goto_0
    iget v0, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$b;->b:I

    iget-object p2, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$b;->c:Ljava/util/List;

    invoke-static {p1, v0, p2}, Lcom/join/mgps/Util/j0;->C1(Landroid/widget/ImageView;ILjava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    :goto_1
    return-void
.end method

.method private t(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$c;

    if-nez p2, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$c;->b:Ljava/lang/String;

    const v1, 0x7f090362

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 3
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-direct {p0, v0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->V(Landroid/widget/TextView;)V

    .line 4
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->p0(Landroid/view/View;)V

    .line 5
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter;->n0(Landroid/view/View;Lcom/join/mgps/adapter/ForumPostsAdapter$e0$c;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 6
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private t0(Landroid/view/View;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/adapter/ForumPostsAdapter$l;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter$l;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private u(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V
    .locals 2

    if-nez p2, :cond_0

    return-void

    .line 1
    :cond_0
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$e;

    .line 2
    iget v0, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$e;->b:I

    const v1, 0x7f091784

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 3
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    .line 4
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    iget p2, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$e;->a:I

    invoke-direct {v0, v1, p2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private u0(Landroid/view/View;I)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    new-instance v0, Lcom/join/mgps/adapter/ForumPostsAdapter$n;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter$n;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private v(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$f;

    if-nez p2, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->i:Lcom/join/mgps/adapter/ForumPostsAdapter$c0;

    if-nez v0, :cond_1

    .line 3
    new-instance v0, Lcom/join/mgps/adapter/ForumPostsAdapter$c0;

    iget-object v1, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->g:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/join/mgps/adapter/ForumPostsAdapter$c0;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->i:Lcom/join/mgps/adapter/ForumPostsAdapter$c0;

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->i:Lcom/join/mgps/adapter/ForumPostsAdapter$c0;

    iget v1, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$f;->b:I

    invoke-virtual {v0, v1}, Lcom/join/mgps/adapter/ForumPostsAdapter$c0;->d(I)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->i:Lcom/join/mgps/adapter/ForumPostsAdapter$c0;

    iget-object v1, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$f;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/adapter/ForumPostsAdapter$c0;->e(Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->i:Lcom/join/mgps/adapter/ForumPostsAdapter$c0;

    invoke-virtual {v0}, Lcom/join/mgps/adapter/ForumPostsAdapter$c0;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->i:Lcom/join/mgps/adapter/ForumPostsAdapter$c0;

    invoke-virtual {v0}, Lcom/join/mgps/adapter/ForumPostsAdapter$c0;->c()Ljava/util/List;

    move-result-object v0

    iget-object p2, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$f;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    const p2, 0x7f090c8e

    .line 8
    invoke-virtual {p1, p2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lit/sephiroth/android/library/widget/HListView;

    iget-object p2, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->i:Lcom/join/mgps/adapter/ForumPostsAdapter$c0;

    invoke-virtual {p1, p2}, Lit/sephiroth/android/library/widget/HListView;->setAdapter(Landroid/widget/ListAdapter;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private v0(Landroid/view/View;Lcom/join/mgps/dto/ForumBean$GameInfo;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/adapter/ForumPostsAdapter$j;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter$j;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter;Lcom/join/mgps/dto/ForumBean$GameInfo;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private w(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V
    .locals 0

    return-void
.end method

.method private x(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V
    .locals 5

    const-string v0, "0"

    const-string v1, ""

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$g;

    if-nez p2, :cond_0

    return-void

    :cond_0
    const v2, 0x7f09102a

    .line 2
    iget-boolean v3, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$g;->h:Z

    invoke-virtual {p1, v2, v3}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 3
    iget-object v2, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$g;->b:Ljava/lang/String;

    const v3, 0x7f0905ec

    invoke-virtual {p1, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 4
    iget-object v2, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$g;->b:Ljava/lang/String;

    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    invoke-virtual {p1, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    const v2, 0x7f090603

    .line 5
    invoke-virtual {p1, v2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget v4, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$g;->c:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v0}, Lcom/join/mgps/Util/j0;->D1(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V

    const v2, 0x7f0905f2

    .line 6
    invoke-virtual {p1, v2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget v4, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$g;->d:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1, v0}, Lcom/join/mgps/Util/j0;->D1(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    iget-boolean v1, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$g;->g:Z

    iget v2, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$g;->e:I

    invoke-direct {p0, v0, v1, v2}, Lcom/join/mgps/adapter/ForumPostsAdapter;->Z(Landroid/view/View;ZI)V

    .line 8
    iget p2, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$g;->a:I

    const v0, 0x7f0905fc

    .line 9
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    new-instance v0, Lcom/join/mgps/adapter/ForumPostsAdapter$r;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter$r;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private x0(Landroid/view/View;I)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    new-instance v0, Lcom/join/mgps/adapter/ForumPostsAdapter$o;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter$o;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private y(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$h;

    if-nez p2, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$h;->b:Lcom/join/mgps/dto/ForumBean$GameInfo;

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumBean$GameInfo;->getGame_id()Ljava/lang/String;

    const v1, 0x7f080394

    const v2, 0x7f090e0d

    .line 4
    invoke-virtual {p1, v2, v1}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 5
    iget-object v1, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f070b2a

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 6
    invoke-virtual {p1, v2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroid/widget/RelativeLayout$LayoutParams;

    .line 7
    iput v1, v3, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 8
    invoke-virtual {p1, v2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const-string v1, "\u6253\u5f00"

    .line 9
    invoke-virtual {p1, v2, v1}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const v1, 0x7f090e0a

    .line 10
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumBean$GameInfo;->getGame_name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v1, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const v1, 0x7f090e0c

    .line 11
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumBean$GameInfo;->getGame_ico_remote()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->g:Landroid/content/Context;

    invoke-static {v3}, Lcom/join/android/app/common/utils/MyImageLoader;->A(Landroid/content/Context;)Lcom/facebook/drawee/generic/RoundingParams;

    move-result-object v3

    invoke-static {v1, v0, v3}, Lcom/join/android/app/common/utils/MyImageLoader;->j(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;Lcom/facebook/drawee/generic/RoundingParams;)V

    .line 12
    new-instance v0, Lcom/join/mgps/adapter/s;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/adapter/s;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter;Lcom/join/mgps/adapter/ForumPostsAdapter$e0$h;)V

    .line 13
    invoke-virtual {p1, v2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f091101

    .line 14
    invoke-virtual {p1, p2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 15
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private y0(Ljava/lang/String;Landroid/view/View;Lcom/facebook/imagepipeline/image/f;)Landroid/view/ViewGroup$LayoutParams;
    .locals 8

    if-eqz p3, :cond_0

    .line 1
    invoke-interface {p3}, Lcom/facebook/imagepipeline/image/f;->getWidth()I

    move-result v0

    .line 2
    invoke-interface {p3}, Lcom/facebook/imagepipeline/image/f;->getHeight()I

    move-result p3

    .line 3
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 4
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 5
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    const v3, 0x7f070d86

    .line 6
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    sub-int/2addr v2, v1

    int-to-float v1, v2

    const/high16 v3, 0x3f800000    # 1.0f

    mul-float v1, v1, v3

    int-to-float v4, p3

    mul-float v4, v4, v3

    int-to-float v3, v0

    div-float/2addr v4, v3

    mul-float v1, v1, v4

    float-to-int v1, v1

    .line 7
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    .line 8
    iput v2, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 9
    iput v1, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/String;

    .line 10
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->d:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "setPostImageParam-->rawHeight="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " rawWidth="

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " ratio="

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p3, " itemHeight="

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " itemWidth="

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, "\n"

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p3, 0x0

    aput-object p1, v5, p3

    invoke-static {v5}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 11
    invoke-virtual {p2, p3}, Landroid/view/View;->setMinimumHeight(I)V

    .line 12
    invoke-virtual {p2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v3

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private z(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V
    .locals 19

    move-object/from16 v7, p0

    move-object/from16 v0, p1

    .line 1
    :try_start_0
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$h;

    if-nez v1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v8, v1, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$h;->b:Lcom/join/mgps/dto/ForumBean$GameInfo;

    .line 3
    iget-object v9, v1, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$h;->a:Ljava/lang/String;

    .line 4
    invoke-virtual {v8}, Lcom/join/mgps/dto/ForumBean$GameInfo;->getGame_id()Ljava/lang/String;

    move-result-object v10

    const v1, 0x7f080394

    const v11, 0x7f090e0d

    .line 5
    invoke-virtual {v0, v11, v1}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 6
    iget-object v1, v7, Lcom/join/mgps/adapter/ForumPostsAdapter;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070b2a

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 7
    invoke-virtual {v0, v11}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 8
    iput v1, v2, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 9
    invoke-virtual {v0, v11}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v1, 0x7f090e0a

    .line 10
    invoke-virtual {v8}, Lcom/join/mgps/dto/ForumBean$GameInfo;->getGame_name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const v1, 0x7f090e0b

    .line 11
    invoke-virtual {v8}, Lcom/join/mgps/dto/ForumBean$GameInfo;->getGame_desc()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 12
    invoke-virtual {v8}, Lcom/join/mgps/dto/ForumBean$GameInfo;->getGame_size()Ljava/lang/String;

    move-result-object v14

    const v1, 0x7f090e0c

    .line 13
    invoke-virtual {v0, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v8}, Lcom/join/mgps/dto/ForumBean$GameInfo;->getGame_ico_remote()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v7, Lcom/join/mgps/adapter/ForumPostsAdapter;->g:Landroid/content/Context;

    invoke-static {v3}, Lcom/join/android/app/common/utils/MyImageLoader;->A(Landroid/content/Context;)Lcom/facebook/drawee/generic/RoundingParams;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/join/android/app/common/utils/MyImageLoader;->j(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;Lcom/facebook/drawee/generic/RoundingParams;)V

    .line 14
    invoke-virtual {v8}, Lcom/join/mgps/dto/ForumBean$GameInfo;->getGame_tag_info()Ljava/util/List;

    move-result-object v12

    const/4 v13, 0x0

    .line 15
    invoke-direct {v7, v0, v13}, Lcom/join/mgps/adapter/ForumPostsAdapter;->D0(Lcom/join/mgps/base/BaseViewHolder;I)V

    .line 16
    invoke-virtual {v8}, Lcom/join/mgps/dto/ForumBean$GameInfo;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 17
    invoke-virtual {v7, v0, v4}, Lcom/join/mgps/adapter/ForumPostsAdapter;->l0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Object;)V

    goto :goto_1

    .line 18
    :cond_1
    invoke-virtual {v8}, Lcom/join/mgps/dto/ForumBean$GameInfo;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v8}, Lcom/join/mgps/dto/ForumBean$GameInfo;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/PayTagInfo;->getPay_game_amount()I

    move-result v1

    if-lez v1, :cond_2

    .line 19
    invoke-static {}, Lb2/e0;->o()Lb2/e0;

    move-result-object v1

    invoke-virtual {v8}, Lcom/join/mgps/dto/ForumBean$GameInfo;->getGame_id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lb2/e0;->p(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 20
    invoke-virtual {v0, v11}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-virtual {v8}, Lcom/join/mgps/dto/ForumBean$GameInfo;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/PayTagInfo;->getPay_game_amount()I

    move-result v2

    invoke-virtual {v7, v1, v2}, Lcom/join/mgps/adapter/ForumPostsAdapter;->k0(Landroid/widget/TextView;I)V

    goto :goto_0

    .line 21
    :cond_2
    invoke-virtual {v0, v11}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v8}, Lcom/join/mgps/dto/ForumBean$GameInfo;->getDown_status()I

    move-result v2

    invoke-virtual {v7, v1, v2}, Lcom/join/mgps/adapter/ForumPostsAdapter;->j0(Landroid/view/View;I)V

    .line 22
    :goto_0
    invoke-virtual {v0, v11}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v15

    new-instance v6, Lcom/join/mgps/adapter/ForumPostsAdapter$k;

    move-object v1, v6

    move-object/from16 v2, p0

    move-object v3, v8

    move-object v5, v9

    move-object v11, v6

    move-object v6, v10

    invoke-direct/range {v1 .. v6}, Lcom/join/mgps/adapter/ForumPostsAdapter$k;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter;Lcom/join/mgps/dto/ForumBean$GameInfo;Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v15, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 23
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/join/mgps/enums/ConstantIntEnum;->H5:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v2}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8}, Lcom/join/mgps/dto/ForumBean$GameInfo;->getPlugin_num()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const v2, 0x7f09145e

    if-eqz v1, :cond_3

    .line 24
    invoke-virtual {v0, v2, v13}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    const v1, 0x7f080c43

    const v2, 0x7f090e0d

    .line 25
    invoke-virtual {v0, v2, v1}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v1, "\u5f00\u59cb"

    .line 26
    invoke-virtual {v0, v2, v1}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 27
    iget-object v1, v7, Lcom/join/mgps/adapter/ForumPostsAdapter;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f06002b

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v2, v1}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_2

    :cond_3
    const/4 v1, 0x1

    .line 28
    invoke-virtual {v0, v2, v1}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 29
    invoke-virtual {v0, v2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    iget-object v3, v7, Lcom/join/mgps/adapter/ForumPostsAdapter;->g:Landroid/content/Context;

    invoke-static {v12, v1, v3}, Lcom/join/mgps/Util/j0;->c(Ljava/util/List;Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 30
    invoke-virtual {v8}, Lcom/join/mgps/dto/ForumBean$GameInfo;->getScore()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8}, Lcom/join/mgps/dto/ForumBean$GameInfo;->getDown_count()I

    move-result v13

    invoke-virtual {v8}, Lcom/join/mgps/dto/ForumBean$GameInfo;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v15

    const/16 v16, 0x0

    invoke-virtual {v0, v2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    move-object/from16 v17, v1

    check-cast v17, Landroid/widget/LinearLayout;

    iget-object v1, v7, Lcom/join/mgps/adapter/ForumPostsAdapter;->g:Landroid/content/Context;

    move-object/from16 v18, v1

    invoke-static/range {v12 .. v18}, Lcom/join/mgps/Util/UtilsMy;->I(Ljava/lang/String;ILjava/lang/String;Lcom/join/mgps/dto/TipNew;Ljava/util/List;Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 31
    invoke-virtual {v8}, Lcom/join/mgps/dto/ForumBean$GameInfo;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v1

    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v8}, Lcom/join/mgps/dto/ForumBean$GameInfo;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/join/mgps/Util/UtilsMy;->j3(Lcom/join/mgps/dto/TipNew;Landroid/view/View;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    :goto_2
    const v1, 0x7f091101

    .line 32
    invoke-virtual {v0, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/adapter/ForumPostsAdapter$p;

    invoke-direct {v1, v7, v9, v10, v8}, Lcom/join/mgps/adapter/ForumPostsAdapter$p;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter;Ljava/lang/String;Ljava/lang/String;Lcom/join/mgps/dto/ForumBean$GameInfo;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    .line 33
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_3
    return-void
.end method

.method private z0(Landroid/view/View;Ljava/lang/CharSequence;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    instance-of v0, p1, Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 2
    check-cast p1, Landroid/widget/TextView;

    .line 3
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 4
    :cond_1
    instance-of v0, p1, Landroid/widget/Button;

    if-eqz v0, :cond_2

    .line 5
    check-cast p1, Landroid/widget/Button;

    .line 6
    invoke-virtual {p1, p2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method B0(Landroid/view/View;IZZIILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->q:Lcom/join/mgps/adapter/ForumPostsAdapter$a0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/join/mgps/adapter/ForumPostsAdapter$a0;

    iget-object v1, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->g:Landroid/content/Context;

    invoke-direct {v0, p0, v1}, Lcom/join/mgps/adapter/ForumPostsAdapter$a0;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->q:Lcom/join/mgps/adapter/ForumPostsAdapter$a0;

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->q:Lcom/join/mgps/adapter/ForumPostsAdapter$a0;

    invoke-virtual {v0, p5}, Lcom/join/mgps/adapter/ForumPostsAdapter$a0;->q(I)V

    .line 3
    iget-object p5, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->q:Lcom/join/mgps/adapter/ForumPostsAdapter$a0;

    invoke-virtual {p5, p6}, Lcom/join/mgps/adapter/ForumPostsAdapter$a0;->A(I)V

    .line 4
    iget-object p5, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->q:Lcom/join/mgps/adapter/ForumPostsAdapter$a0;

    invoke-virtual {p5, p8}, Lcom/join/mgps/adapter/ForumPostsAdapter$a0;->x(Ljava/lang/String;)V

    .line 5
    iget-object p5, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->q:Lcom/join/mgps/adapter/ForumPostsAdapter$a0;

    invoke-virtual {p5, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter$a0;->w(I)V

    .line 6
    iget-object p2, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->q:Lcom/join/mgps/adapter/ForumPostsAdapter$a0;

    const/4 p5, 0x0

    invoke-virtual {p2, p5}, Lcom/join/mgps/adapter/ForumPostsAdapter$a0;->t(I)V

    const/16 p2, 0x8

    if-eqz p3, :cond_1

    .line 7
    iget-object p3, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->q:Lcom/join/mgps/adapter/ForumPostsAdapter$a0;

    invoke-virtual {p3, p5}, Lcom/join/mgps/adapter/ForumPostsAdapter$a0;->v(I)V

    goto :goto_0

    .line 8
    :cond_1
    iget-object p3, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->q:Lcom/join/mgps/adapter/ForumPostsAdapter$a0;

    invoke-virtual {p3, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter$a0;->v(I)V

    :goto_0
    if-eqz p4, :cond_2

    .line 9
    iget-object p2, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->q:Lcom/join/mgps/adapter/ForumPostsAdapter$a0;

    invoke-virtual {p2, p5}, Lcom/join/mgps/adapter/ForumPostsAdapter$a0;->z(I)V

    goto :goto_1

    .line 10
    :cond_2
    iget-object p3, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->q:Lcom/join/mgps/adapter/ForumPostsAdapter$a0;

    invoke-virtual {p3, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter$a0;->z(I)V

    .line 11
    :goto_1
    invoke-static {p7}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_3

    const-string p7, ""

    .line 12
    :cond_3
    iget-object p2, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->q:Lcom/join/mgps/adapter/ForumPostsAdapter$a0;

    invoke-virtual {p2, p7}, Lcom/join/mgps/adapter/ForumPostsAdapter$a0;->y(Ljava/lang/String;)V

    .line 13
    iget-object p2, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->q:Lcom/join/mgps/adapter/ForumPostsAdapter$a0;

    invoke-virtual {p2, p1}, Lcom/join/mgps/adapter/ForumPostsAdapter$a0;->showAsDropDown(Landroid/view/View;)V

    return-void
.end method

.method public K()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->n:Ljava/util/Hashtable;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    .line 3
    invoke-static {}, Ljava/lang/System;->gc()V

    :cond_0
    return-void
.end method

.method protected L(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V
    .locals 2
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;->getItemType()I

    move-result v0

    .line 2
    sget-object v1, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->POST_HEADER:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter;->B(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V

    goto/16 :goto_0

    .line 4
    :cond_0
    sget-object v1, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->POST_HEADER1:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 5
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter;->A(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V

    goto/16 :goto_0

    .line 6
    :cond_1
    sget-object v1, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->POST_FOOTER:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 7
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter;->x(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V

    goto/16 :goto_0

    .line 8
    :cond_2
    sget-object v1, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->POST_FOOTER1:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_3

    .line 9
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter;->w(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V

    goto/16 :goto_0

    .line 10
    :cond_3
    sget-object v1, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->POST_GAME_RES_LINK:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_4

    .line 11
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter;->y(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V

    goto/16 :goto_0

    .line 12
    :cond_4
    sget-object v1, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->POST_GAME:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_5

    .line 13
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter;->z(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V

    goto :goto_0

    .line 14
    :cond_5
    sget-object v1, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->POST_IMAGE:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_6

    .line 15
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter;->D(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V

    goto :goto_0

    .line 16
    :cond_6
    sget-object v1, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->POST_VIDEO:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_7

    .line 17
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter;->H(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V

    goto :goto_0

    .line 18
    :cond_7
    sget-object v1, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->POST_IMAGE_THUMBNAIL:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_8

    .line 19
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter;->C(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V

    goto :goto_0

    .line 20
    :cond_8
    sget-object v1, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->POST_MESSAGE:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_9

    .line 21
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter;->E(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V

    goto :goto_0

    .line 22
    :cond_9
    sget-object v1, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->POST_RICH_MESSAGE:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_a

    .line 23
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter;->F(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V

    goto :goto_0

    .line 24
    :cond_a
    sget-object v1, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->POST_SUBJECT:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_b

    .line 25
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter;->G(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V

    goto :goto_0

    .line 26
    :cond_b
    sget-object v1, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->EMPLOYEE_TAGS:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_c

    .line 27
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter;->v(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V

    goto :goto_0

    .line 28
    :cond_c
    sget-object v1, Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;->DIVIDER:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_d

    .line 29
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter;->u(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V

    :cond_d
    :goto_0
    return-void
.end method

.method public M()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->f:Ljava/lang/String;

    return-object v0
.end method

.method O(Ljava/lang/String;)Landroid/graphics/BitmapFactory$Options;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method P(Ljava/lang/String;)Lcom/join/mgps/adapter/ForumPostsAdapter$d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->n:Ljava/util/Hashtable;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 2
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/adapter/ForumPostsAdapter$d0;

    return-object p1
.end method

.method public S(Landroid/content/Context;)Lcom/danikula/videocache/i;
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/MApplication;->m(Landroid/content/Context;)Lcom/danikula/videocache/i;

    move-result-object p1

    return-object p1
.end method

.method T()Landroid/widget/LinearLayout$LayoutParams;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 2
    iget v1, v0, Landroid/util/DisplayMetrics;->density:F

    .line 3
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    const/high16 v2, 0x43520000    # 210.0f

    mul-float v2, v2, v1

    float-to-int v2, v2

    const/high16 v3, 0x43200000    # 160.0f

    mul-float v3, v3, v1

    float-to-int v3, v3

    const/high16 v4, 0x40c00000    # 6.0f

    mul-float v4, v4, v1

    float-to-int v4, v4

    .line 4
    iget-object v5, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->g:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f070d74

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v5

    mul-int/lit8 v5, v5, 0x2

    sub-int/2addr v0, v5

    int-to-float v0, v0

    int-to-float v4, v4

    mul-float v4, v4, v1

    const/high16 v1, 0x40000000    # 2.0f

    mul-float v4, v4, v1

    sub-float/2addr v0, v4

    float-to-int v0, v0

    .line 5
    div-int/lit8 v0, v0, 0x3

    if-le v0, v2, :cond_0

    goto :goto_0

    :cond_0
    if-le v0, v3, :cond_1

    move v2, v3

    goto :goto_0

    :cond_1
    move v2, v0

    .line 6
    :goto_0
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v0, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    return-object v0
.end method

.method public X(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/facebook/drawee/view/DraweeView;->getHierarchy()Lo0/b;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/generic/a;

    const v1, 0x7f080983

    invoke-virtual {v0, v1}, Lcom/facebook/drawee/generic/a;->H(I)V

    .line 2
    new-instance v0, Lcom/join/mgps/adapter/ForumPostsAdapter$b;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/adapter/ForumPostsAdapter$b;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter;Lcom/facebook/drawee/view/SimpleDraweeView;)V

    .line 3
    invoke-static {}, Lcom/facebook/drawee/backends/pipeline/Fresco;->newDraweeControllerBuilder()Lcom/facebook/drawee/backends/pipeline/e;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->H(Lcom/facebook/drawee/controller/c;)Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/backends/pipeline/e;

    .line 4
    invoke-static {p2}, Lcom/join/android/app/common/utils/MyImageLoader;->H(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/facebook/drawee/backends/pipeline/e;->c0(Landroid/net/Uri;)Lcom/facebook/drawee/backends/pipeline/e;

    move-result-object p2

    .line 5
    invoke-virtual {p2}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->d()Lcom/facebook/drawee/controller/a;

    move-result-object p2

    .line 6
    invoke-virtual {p1, p2}, Lcom/facebook/drawee/view/DraweeView;->setController(Lo0/a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public Y(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/facebook/drawee/view/DraweeView;->getHierarchy()Lo0/b;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/generic/a;

    const v1, 0x7f080983

    invoke-virtual {v0, v1}, Lcom/facebook/drawee/generic/a;->H(I)V

    .line 2
    new-instance v0, Lcom/join/mgps/adapter/ForumPostsAdapter$a;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/adapter/ForumPostsAdapter$a;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter;Lcom/facebook/drawee/view/SimpleDraweeView;)V

    .line 3
    invoke-static {}, Lcom/facebook/drawee/backends/pipeline/Fresco;->newDraweeControllerBuilder()Lcom/facebook/drawee/backends/pipeline/e;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->H(Lcom/facebook/drawee/controller/c;)Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/backends/pipeline/e;

    .line 4
    invoke-static {p2}, Lcom/join/android/app/common/utils/MyImageLoader;->H(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/facebook/drawee/backends/pipeline/e;->c0(Landroid/net/Uri;)Lcom/facebook/drawee/backends/pipeline/e;

    move-result-object p2

    .line 5
    invoke-virtual {p2}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->d()Lcom/facebook/drawee/controller/a;

    move-result-object p2

    .line 6
    invoke-virtual {p1, p2}, Lcom/facebook/drawee/view/DraweeView;->setController(Lo0/a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public a0(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V
    .locals 0

    return-void
.end method

.method b0(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-static {p2}, Lcom/join/mgps/Util/j0;->i0(Ljava/lang/String;)[Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lcom/join/mgps/adapter/ForumPostsAdapter$d0;

    invoke-direct {v1, p0}, Lcom/join/mgps/adapter/ForumPostsAdapter$d0;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter;)V

    const/4 v2, 0x0

    .line 3
    aget-object v2, v0, v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x1

    .line 4
    aget-object v0, v0, v3

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    const v4, 0x7f070d86

    .line 7
    invoke-virtual {p1, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    sub-int/2addr v3, p1

    int-to-float p1, v3

    const/high16 v4, 0x3f800000    # 1.0f

    mul-float p1, p1, v4

    int-to-float v0, v0

    mul-float v0, v0, v4

    int-to-float v2, v2

    div-float/2addr v0, v2

    mul-float p1, p1, v0

    float-to-int p1, p1

    .line 8
    iput v3, v1, Lcom/join/mgps/adapter/ForumPostsAdapter$d0;->a:I

    .line 9
    iput p1, v1, Lcom/join/mgps/adapter/ForumPostsAdapter$d0;->b:I

    .line 10
    invoke-virtual {p0, p2, v1}, Lcom/join/mgps/adapter/ForumPostsAdapter;->q(Ljava/lang/String;Lcom/join/mgps/adapter/ForumPostsAdapter$d0;)V

    :cond_0
    return-void
.end method

.method protected bridge synthetic convert(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    check-cast p2, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter;->L(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/ForumPostsAdapter$e0;)V

    return-void
.end method

.method public e0(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->f:Ljava/lang/String;

    return-void
.end method

.method f0(Ljava/lang/String;Landroid/view/View;Lcom/facebook/imagepipeline/image/f;)Landroid/widget/LinearLayout$LayoutParams;
    .locals 8

    if-eqz p3, :cond_0

    .line 1
    invoke-interface {p3}, Lcom/facebook/imagepipeline/image/f;->getWidth()I

    move-result v0

    .line 2
    invoke-interface {p3}, Lcom/facebook/imagepipeline/image/f;->getHeight()I

    move-result p3

    .line 3
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 4
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 5
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 6
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    const/16 v4, 0x28

    const/4 v5, 0x4

    const v6, 0x7f070d86

    .line 7
    invoke-virtual {v2, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    mul-int/lit8 v2, v2, 0x2

    sub-int/2addr v3, v2

    int-to-float v2, v3

    int-to-float v3, v4

    mul-float v3, v3, v1

    sub-float/2addr v2, v3

    float-to-int v2, v2

    int-to-float v3, v2

    const/high16 v4, 0x3f800000    # 1.0f

    mul-float v3, v3, v4

    int-to-float v5, v5

    mul-float v5, v5, v1

    float-to-int v1, v5

    int-to-float v5, p3

    mul-float v5, v5, v4

    int-to-float v4, v0

    div-float/2addr v5, v4

    mul-float v3, v3, v5

    float-to-int v3, v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    .line 8
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->d:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "setCommentImageItemParams-->rawHeight="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " rawWidth="

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " ratio="

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p3, " itemHeight="

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " itemWidth="

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, "\n"

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p3, 0x0

    aput-object p1, v4, p3

    invoke-static {v4}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 9
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {p1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 10
    invoke-virtual {p1, p3, v1, p3, v1}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 11
    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method g0(Lcom/join/mgps/adapter/ForumPostsAdapter$e0;Z)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$d;

    .line 2
    iput-boolean p2, p1, Lcom/join/mgps/adapter/ForumPostsAdapter$e0$d;->h:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method j0(Landroid/view/View;I)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    const/4 v3, 0x1

    .line 1
    invoke-virtual {v1, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 2
    instance-of v3, v1, Landroid/widget/TextView;

    const v4, 0x7f080c4b

    const/4 v5, 0x0

    const v6, -0x767677

    const/high16 v7, 0x41300000    # 11.0f

    const-string v8, "\u5373\u5c06\u5f00\u653e"

    const v10, 0x7f1000f6

    const/high16 v11, 0x41400000    # 12.0f

    const v12, 0x7f1000fa

    const/4 v13, 0x3

    const v14, 0x7f080c43

    const v15, -0xc35b03

    const/4 v9, 0x2

    if-eqz v3, :cond_2

    .line 3
    check-cast v1, Landroid/widget/TextView;

    .line 4
    invoke-virtual {v1, v15}, Landroid/widget/TextView;->setTextColor(I)V

    if-ne v2, v13, :cond_0

    .line 5
    invoke-virtual {v1}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v12}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    invoke-virtual {v1, v9, v11}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 7
    invoke-virtual {v1, v15}, Landroid/widget/TextView;->setTextColor(I)V

    .line 8
    invoke-virtual {v1, v14}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto/16 :goto_0

    :cond_0
    if-ne v2, v9, :cond_1

    .line 9
    invoke-virtual {v1, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    invoke-virtual {v1, v9, v7}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 11
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 12
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 13
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto :goto_0

    .line 14
    :cond_1
    iget-object v2, v0, Lcom/join/mgps/adapter/ForumPostsAdapter;->g:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v10}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v2, 0x41500000    # 13.0f

    .line 15
    invoke-virtual {v1, v9, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 16
    invoke-virtual {v1, v15}, Landroid/widget/TextView;->setTextColor(I)V

    .line 17
    invoke-virtual {v1, v14}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto :goto_0

    .line 18
    :cond_2
    instance-of v3, v1, Landroid/widget/Button;

    if-eqz v3, :cond_5

    .line 19
    check-cast v1, Landroid/widget/Button;

    .line 20
    invoke-virtual {v1, v15}, Landroid/widget/Button;->setTextColor(I)V

    if-ne v2, v13, :cond_3

    .line 21
    invoke-virtual {v1}, Landroid/widget/Button;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v12}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 22
    invoke-virtual {v1, v9, v11}, Landroid/widget/Button;->setTextSize(IF)V

    .line 23
    invoke-virtual {v1, v15}, Landroid/widget/Button;->setTextColor(I)V

    .line 24
    invoke-virtual {v1, v14}, Landroid/widget/Button;->setBackgroundResource(I)V

    goto :goto_0

    :cond_3
    if-ne v2, v9, :cond_4

    .line 25
    invoke-virtual {v1, v8}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 26
    invoke-virtual {v1, v9, v7}, Landroid/widget/Button;->setTextSize(IF)V

    .line 27
    invoke-virtual {v1, v6}, Landroid/widget/Button;->setTextColor(I)V

    .line 28
    invoke-virtual {v1, v5}, Landroid/widget/Button;->setEnabled(Z)V

    .line 29
    invoke-virtual {v1, v4}, Landroid/widget/Button;->setBackgroundResource(I)V

    goto :goto_0

    .line 30
    :cond_4
    iget-object v2, v0, Lcom/join/mgps/adapter/ForumPostsAdapter;->g:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v10}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    const/high16 v2, 0x41500000    # 13.0f

    .line 31
    invoke-virtual {v1, v9, v2}, Landroid/widget/Button;->setTextSize(IF)V

    .line 32
    invoke-virtual {v1, v15}, Landroid/widget/Button;->setTextColor(I)V

    .line 33
    invoke-virtual {v1, v14}, Landroid/widget/Button;->setBackgroundResource(I)V

    :cond_5
    :goto_0
    return-void
.end method

.method k0(Landroid/widget/TextView;I)V
    .locals 7

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setEnabled(Z)V

    const v1, -0xc35b03

    .line 2
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 3
    invoke-virtual {p1}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f100305

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v4, 0x0

    int-to-double v5, p2

    invoke-static {v5, v6}, Lcom/join/mgps/Util/g2;->m(D)Ljava/lang/String;

    move-result-object p2

    aput-object p2, v0, v4

    invoke-virtual {v2, v3, v0}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 p2, 0x2

    const/high16 v0, 0x41500000    # 13.0f

    .line 4
    invoke-virtual {p1, p2, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 5
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextColor(I)V

    const p2, 0x7f080c43

    .line 6
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    return-void
.end method

.method l0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    const v0, 0x7f090e0d

    .line 1
    invoke-virtual {v2, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/Button;

    if-eqz v4, :cond_19

    if-nez v3, :cond_0

    goto/16 :goto_c

    .line 2
    :cond_0
    invoke-virtual {v4}, Landroid/widget/Button;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    .line 4
    move-object v6, v3

    check-cast v6, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 5
    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v7

    .line 6
    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getVer()Ljava/lang/String;

    move-result-object v8

    .line 7
    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v9

    .line 8
    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTipBeans()Ljava/util/ArrayList;

    move-result-object v10

    .line 9
    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v11

    .line 10
    instance-of v13, v3, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    if-eqz v13, :cond_3

    .line 11
    move-object v6, v3

    check-cast v6, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    .line 12
    invoke-virtual {v6}, Lcom/join/mgps/business/CollectionBeanSubBusiness;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v8

    .line 13
    invoke-virtual {v6}, Lcom/join/mgps/dto/CollectionBeanSub;->getVer()Ljava/lang/String;

    move-result-object v13

    .line 14
    invoke-virtual {v6}, Lcom/join/mgps/dto/CollectionBeanSub;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v15

    if-eqz v15, :cond_1

    .line 15
    invoke-virtual {v6}, Lcom/join/mgps/dto/CollectionBeanSub;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v15

    invoke-virtual {v15}, Lcom/join/mgps/dto/PayTagInfo;->getPay_game_amount()I

    move-result v15

    goto :goto_0

    :cond_1
    const/4 v15, 0x0

    :goto_0
    if-lez v15, :cond_2

    .line 16
    invoke-static {}, Lb2/e0;->o()Lb2/e0;

    move-result-object v14

    invoke-virtual {v6}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v14, v6}, Lb2/e0;->p(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/4 v15, 0x0

    :cond_2
    move-object v6, v8

    move-object v8, v13

    goto :goto_3

    .line 17
    :cond_3
    instance-of v13, v3, Lcom/join/mgps/business/RecomDatabeanBusiness;

    if-eqz v13, :cond_6

    .line 18
    move-object v13, v3

    check-cast v13, Lcom/join/mgps/business/RecomDatabeanBusiness;

    .line 19
    invoke-virtual {v13}, Lcom/join/mgps/dto/RecomDatabean;->getSub()Ljava/util/List;

    move-result-object v13

    const/4 v14, 0x0

    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/join/mgps/dto/AppBeanMain;

    invoke-virtual {v13}, Lcom/join/mgps/dto/AppBeanMain;->getGame_info()Lcom/join/mgps/dto/AppBean;

    move-result-object v13

    .line 20
    invoke-virtual {v13}, Lcom/join/mgps/dto/AppBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v14

    if-eqz v14, :cond_4

    .line 21
    invoke-virtual {v13}, Lcom/join/mgps/dto/AppBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v14

    invoke-virtual {v14}, Lcom/join/mgps/dto/PayTagInfo;->getPay_game_amount()I

    move-result v14

    goto :goto_1

    :cond_4
    const/4 v14, 0x0

    :goto_1
    if-lez v14, :cond_5

    .line 22
    invoke-static {}, Lb2/e0;->o()Lb2/e0;

    move-result-object v15

    invoke-virtual {v13}, Lcom/join/mgps/dto/AppBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v15, v13}, Lb2/e0;->p(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_5

    goto :goto_2

    :cond_5
    move v15, v14

    goto :goto_3

    :cond_6
    :goto_2
    const/4 v15, 0x0

    :goto_3
    const-string v13, "\u66f4\u65b0"

    const v14, 0x7f080c48

    if-nez v6, :cond_d

    .line 23
    invoke-static {v10}, Lcom/join/mgps/Util/UtilsMy;->o0(Ljava/util/List;)Z

    move-result v2

    if-eqz v2, :cond_b

    .line 24
    invoke-static {v0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v2

    invoke-virtual {v2, v0, v9}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-lez v15, :cond_7

    const/16 v16, 0x0

    goto :goto_4

    :cond_7
    move/from16 v16, v2

    :goto_4
    if-eqz v16, :cond_9

    .line 25
    invoke-static {v0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v2

    invoke-virtual {v2, v0, v9}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object v2

    .line 26
    invoke-static {v8}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-virtual {v2}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result v2

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    if-ge v2, v6, :cond_8

    .line 27
    invoke-virtual {v4, v14}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 28
    invoke-direct {v1, v4, v13}, Lcom/join/mgps/adapter/ForumPostsAdapter;->z0(Landroid/view/View;Ljava/lang/CharSequence;)V

    const v0, 0x7f060031

    .line 29
    invoke-virtual {v5, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-direct {v1, v4, v0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->A0(Landroid/view/View;I)V

    goto/16 :goto_b

    :cond_8
    const v2, 0x7f080c4f

    .line 30
    invoke-virtual {v4, v2}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 31
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f1000f7

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v4, v0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->z0(Landroid/view/View;Ljava/lang/CharSequence;)V

    const v0, 0x7f060034

    .line 32
    invoke-virtual {v5, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-direct {v1, v4, v0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->A0(Landroid/view/View;I)V

    goto/16 :goto_b

    .line 33
    :cond_9
    invoke-virtual {v4, v14}, Landroid/widget/Button;->setBackgroundResource(I)V

    if-lez v15, :cond_a

    .line 34
    invoke-virtual {v1, v4, v15}, Lcom/join/mgps/adapter/ForumPostsAdapter;->k0(Landroid/widget/TextView;I)V

    goto/16 :goto_b

    .line 35
    :cond_a
    invoke-virtual {v1, v4, v7}, Lcom/join/mgps/adapter/ForumPostsAdapter;->j0(Landroid/view/View;I)V

    goto/16 :goto_b

    .line 36
    :cond_b
    invoke-virtual {v4, v14}, Landroid/widget/Button;->setBackgroundResource(I)V

    if-lez v15, :cond_c

    .line 37
    invoke-virtual {v1, v4, v15}, Lcom/join/mgps/adapter/ForumPostsAdapter;->k0(Landroid/widget/TextView;I)V

    goto/16 :goto_b

    .line 38
    :cond_c
    invoke-virtual {v1, v4, v7}, Lcom/join/mgps/adapter/ForumPostsAdapter;->j0(Landroid/view/View;I)V

    goto/16 :goto_b

    .line 39
    :cond_d
    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v8

    if-lez v15, :cond_e

    const/16 v8, 0x2b

    :cond_e
    if-eqz v8, :cond_11

    const/16 v10, 0x1b

    const-string v14, "\u6682\u505c\u4e2d"

    if-eq v8, v10, :cond_16

    const/4 v10, 0x2

    const-wide/16 v17, 0x0

    const-string v9, "/"

    const v3, 0x7f0900f1

    if-eq v8, v10, :cond_14

    const/4 v10, 0x3

    if-eq v8, v10, :cond_12

    const/4 v10, 0x5

    if-eq v8, v10, :cond_10

    const/4 v10, 0x6

    if-eq v8, v10, :cond_12

    const/4 v10, 0x7

    if-eq v8, v10, :cond_11

    const/16 v7, 0x2a

    if-eq v8, v7, :cond_10

    const/16 v7, 0x2b

    if-eq v8, v7, :cond_f

    const v0, 0x7f091051

    const/16 v7, 0x11

    packed-switch v8, :pswitch_data_0

    goto/16 :goto_b

    .line 40
    :pswitch_0
    invoke-direct {v1, v2, v7}, Lcom/join/mgps/adapter/ForumPostsAdapter;->D0(Lcom/join/mgps/base/BaseViewHolder;I)V

    .line 41
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v11, v12}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v11, v12}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v3, v7}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const-string v3, "\u70b9\u51fb\u91cd\u65b0\u89e3\u538b"

    const v7, 0x7f090d81

    .line 42
    invoke-virtual {v2, v7, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 43
    invoke-virtual {v2, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v2

    long-to-int v3, v2

    invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setProgress(I)V

    const v0, 0x7f080c5c

    .line 44
    invoke-virtual {v4, v0}, Landroid/widget/Button;->setBackgroundResource(I)V

    const-string v0, "\u89e3\u538b"

    .line 45
    invoke-direct {v1, v4, v0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->z0(Landroid/view/View;Ljava/lang/CharSequence;)V

    const v0, 0x7f06002b

    .line 46
    invoke-virtual {v5, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-direct {v1, v4, v0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->A0(Landroid/view/View;I)V

    goto/16 :goto_b

    .line 47
    :pswitch_1
    invoke-direct {v1, v2, v7}, Lcom/join/mgps/adapter/ForumPostsAdapter;->D0(Lcom/join/mgps/base/BaseViewHolder;I)V

    .line 48
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v11, v12}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v11, v12}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v3, v7}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const-string v3, "\u89e3\u538b\u4e2d.."

    const v7, 0x7f090d81

    .line 49
    invoke-virtual {v2, v7, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 50
    invoke-virtual {v2, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v2

    long-to-int v3, v2

    invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setProgress(I)V

    const v0, 0x7f08043a

    .line 51
    invoke-virtual {v4, v0}, Landroid/widget/Button;->setBackgroundResource(I)V

    const-string v0, "\u89e3\u538b\u4e2d"

    .line 52
    invoke-direct {v1, v4, v0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->z0(Landroid/view/View;Ljava/lang/CharSequence;)V

    const v0, 0x7f060032

    .line 53
    invoke-virtual {v5, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-direct {v1, v4, v0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->A0(Landroid/view/View;I)V

    goto/16 :goto_b

    :pswitch_2
    const/4 v0, 0x0

    .line 54
    invoke-direct {v1, v2, v0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->D0(Lcom/join/mgps/base/BaseViewHolder;I)V

    const v0, 0x7f080c48

    .line 55
    invoke-virtual {v4, v0}, Landroid/widget/Button;->setBackgroundResource(I)V

    const-string v0, "\u5b89\u88c5"

    .line 56
    invoke-direct {v1, v4, v0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->z0(Landroid/view/View;Ljava/lang/CharSequence;)V

    const v0, 0x7f060031

    .line 57
    invoke-virtual {v5, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-direct {v1, v4, v0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->A0(Landroid/view/View;I)V

    goto/16 :goto_b

    :pswitch_3
    const/16 v0, 0x10

    .line 58
    invoke-direct {v1, v2, v0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->D0(Lcom/join/mgps/base/BaseViewHolder;I)V

    const v0, 0x7f080c43

    .line 59
    invoke-virtual {v4, v0}, Landroid/widget/Button;->setBackgroundResource(I)V

    const-string v0, "\u7b49\u5f85"

    .line 60
    invoke-direct {v1, v4, v0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->z0(Landroid/view/View;Ljava/lang/CharSequence;)V

    const v0, 0x7f06002b

    .line 61
    invoke-virtual {v5, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-direct {v1, v4, v0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->A0(Landroid/view/View;I)V

    goto/16 :goto_b

    :pswitch_4
    const/4 v8, 0x0

    .line 62
    invoke-direct {v1, v2, v8}, Lcom/join/mgps/adapter/ForumPostsAdapter;->D0(Lcom/join/mgps/base/BaseViewHolder;I)V

    const v0, 0x7f080c48

    .line 63
    invoke-virtual {v4, v0}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 64
    invoke-direct {v1, v4, v13}, Lcom/join/mgps/adapter/ForumPostsAdapter;->z0(Landroid/view/View;Ljava/lang/CharSequence;)V

    const v0, 0x7f060031

    .line 65
    invoke-virtual {v5, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-direct {v1, v4, v0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->A0(Landroid/view/View;I)V

    goto/16 :goto_b

    :cond_f
    const v0, 0x7f080c48

    const/4 v8, 0x0

    .line 66
    invoke-direct {v1, v2, v8}, Lcom/join/mgps/adapter/ForumPostsAdapter;->D0(Lcom/join/mgps/base/BaseViewHolder;I)V

    .line 67
    invoke-virtual {v4, v0}, Landroid/widget/Button;->setBackgroundResource(I)V

    if-lez v15, :cond_18

    .line 68
    invoke-virtual {v1, v4, v15}, Lcom/join/mgps/adapter/ForumPostsAdapter;->k0(Landroid/widget/TextView;I)V

    goto/16 :goto_b

    :cond_10
    const/4 v8, 0x0

    goto :goto_5

    :cond_11
    const/4 v0, 0x0

    goto/16 :goto_a

    :cond_12
    const v0, 0x7f080c43

    goto :goto_6

    .line 69
    :goto_5
    invoke-direct {v1, v2, v8}, Lcom/join/mgps/adapter/ForumPostsAdapter;->D0(Lcom/join/mgps/base/BaseViewHolder;I)V

    const v2, 0x7f080c4f

    .line 70
    invoke-virtual {v4, v2}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 71
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f1000f7

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v4, v0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->z0(Landroid/view/View;Ljava/lang/CharSequence;)V

    const v0, 0x7f060034

    .line 72
    invoke-virtual {v5, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-direct {v1, v4, v0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->A0(Landroid/view/View;I)V

    goto/16 :goto_b

    .line 73
    :goto_6
    invoke-virtual {v4, v0}, Landroid/widget/Button;->setBackgroundResource(I)V

    const-string v0, "\u7ee7\u7eed"

    .line 74
    invoke-direct {v1, v4, v0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->z0(Landroid/view/View;Ljava/lang/CharSequence;)V

    const v0, 0x7f06002b

    .line 75
    invoke-virtual {v5, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-direct {v1, v4, v0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->A0(Landroid/view/View;I)V

    const/16 v0, 0x10

    .line 76
    invoke-direct {v1, v2, v0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->D0(Lcom/join/mgps/base/BaseViewHolder;I)V

    .line 77
    :try_start_0
    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v7

    cmp-long v0, v7, v17

    if-nez v0, :cond_13

    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v11, v12}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_7

    .line 79
    :cond_13
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v11, v12}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    :goto_7
    const v0, 0x7f09104a

    .line 80
    invoke-virtual {v2, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v5

    long-to-int v3, v5

    invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setProgress(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_8

    :catch_0
    move-exception v0

    .line 81
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_8
    const v3, 0x7f090d81

    .line 82
    invoke-virtual {v2, v3, v14}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_b

    .line 83
    :cond_14
    invoke-static {v6}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    const v0, 0x7f080c43

    .line 84
    invoke-virtual {v4, v0}, Landroid/widget/Button;->setBackgroundResource(I)V

    const-string v0, "\u6682\u505c"

    .line 85
    invoke-direct {v1, v4, v0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->z0(Landroid/view/View;Ljava/lang/CharSequence;)V

    const v0, 0x7f06002b

    .line 86
    invoke-virtual {v5, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-direct {v1, v4, v0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->A0(Landroid/view/View;I)V

    const/16 v0, 0x10

    .line 87
    invoke-direct {v1, v2, v0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->D0(Lcom/join/mgps/base/BaseViewHolder;I)V

    .line 88
    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v7

    cmp-long v0, v7, v17

    if-nez v0, :cond_15

    .line 89
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v11, v12}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_9

    .line 90
    :cond_15
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v11, v12}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    :goto_9
    const v0, 0x7f09104a

    .line 91
    invoke-virtual {v2, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v7

    long-to-int v3, v7

    invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 92
    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSpeed()Ljava/lang/String;

    move-result-object v0

    .line 93
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/S"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const v3, 0x7f090d81

    invoke-virtual {v2, v3, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_b

    .line 94
    :cond_16
    invoke-direct {v1, v4, v14}, Lcom/join/mgps/adapter/ForumPostsAdapter;->z0(Landroid/view/View;Ljava/lang/CharSequence;)V

    goto :goto_b

    .line 95
    :goto_a
    invoke-direct {v1, v2, v0}, Lcom/join/mgps/adapter/ForumPostsAdapter;->D0(Lcom/join/mgps/base/BaseViewHolder;I)V

    const v0, 0x7f080c48

    .line 96
    invoke-virtual {v4, v0}, Landroid/widget/Button;->setBackgroundResource(I)V

    if-lez v15, :cond_17

    .line 97
    invoke-virtual {v1, v4, v15}, Lcom/join/mgps/adapter/ForumPostsAdapter;->k0(Landroid/widget/TextView;I)V

    goto :goto_b

    .line 98
    :cond_17
    invoke-virtual {v1, v4, v7}, Lcom/join/mgps/adapter/ForumPostsAdapter;->j0(Landroid/view/View;I)V

    .line 99
    :cond_18
    :goto_b
    new-instance v0, Lcom/join/mgps/adapter/ForumPostsAdapter$z;

    move-object/from16 v2, p2

    invoke-direct {v0, v1, v2}, Lcom/join/mgps/adapter/ForumPostsAdapter$z;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter;Ljava/lang/Object;)V

    invoke-virtual {v4, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_19
    :goto_c
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public m0(Lcom/join/mgps/adapter/ForumPostsAdapter$b0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->r:Lcom/join/mgps/adapter/ForumPostsAdapter$b0;

    return-void
.end method

.method public n0(Landroid/view/View;Lcom/join/mgps/adapter/ForumPostsAdapter$e0$c;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/adapter/ForumPostsAdapter$g;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter$g;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter;Lcom/join/mgps/adapter/ForumPostsAdapter$e0$c;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public o0(Landroid/view/View;Lcom/join/mgps/adapter/ForumPostsAdapter$e0$a;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/adapter/ForumPostsAdapter$f;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter$f;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter;Lcom/join/mgps/adapter/ForumPostsAdapter$e0$a;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public p0(Landroid/view/View;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/adapter/ForumPostsAdapter$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/adapter/ForumPostsAdapter$e;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method q(Ljava/lang/String;Lcom/join/mgps/adapter/ForumPostsAdapter$d0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->n:Ljava/util/Hashtable;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->n:Ljava/util/Hashtable;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter;->n:Ljava/util/Hashtable;

    invoke-virtual {v0, p1, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public q0(Landroid/view/View;ZZIILjava/lang/String;Ljava/lang/String;)V
    .locals 9

    .line 1
    new-instance v8, Lcom/join/mgps/adapter/ForumPostsAdapter$i;

    move-object v0, v8

    move-object v1, p0

    move v2, p4

    move v3, p2

    move v4, p3

    move v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/join/mgps/adapter/ForumPostsAdapter$i;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter;IZZILjava/lang/String;Ljava/lang/String;)V

    move-object v0, p1

    invoke-virtual {p1, v8}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public r0(Landroid/view/View;IILjava/lang/String;)V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "setOnCommentReplyReply"

    aput-object v2, v0, v1

    .line 1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "cid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " rid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " rNickname="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/join/mgps/adapter/ForumPostsAdapter$h;

    invoke-direct {v0, p0, p2, p3, p4}, Lcom/join/mgps/adapter/ForumPostsAdapter$h;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter;IILjava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public s0(Landroid/view/View;I)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/adapter/ForumPostsAdapter$d;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/adapter/ForumPostsAdapter$d;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public w0(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    new-instance p2, Lcom/join/mgps/adapter/ForumPostsAdapter$m;

    invoke-direct {p2, p0, p3}, Lcom/join/mgps/adapter/ForumPostsAdapter$m;-><init>(Lcom/join/mgps/adapter/ForumPostsAdapter;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
