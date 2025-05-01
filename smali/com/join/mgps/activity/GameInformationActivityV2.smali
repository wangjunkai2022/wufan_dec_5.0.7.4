.class public Lcom/join/mgps/activity/GameInformationActivityV2;
.super Lcom/BaseActivity;
.source "GameInformationActivityV2.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/GameInformationActivityV2$ReplyViewHolder;,
        Lcom/join/mgps/activity/GameInformationActivityV2$CommentViewHolder;,
        Lcom/join/mgps/activity/GameInformationActivityV2$SendMessageViewHolder;,
        Lcom/join/mgps/activity/GameInformationActivityV2$WebtitleViewHolder;,
        Lcom/join/mgps/activity/GameInformationActivityV2$ViewHolder2;,
        Lcom/join/mgps/activity/GameInformationActivityV2$n;,
        Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;,
        Lcom/join/mgps/activity/GameInformationActivityV2$k;,
        Lcom/join/mgps/activity/GameInformationActivityV2$l;,
        Lcom/join/mgps/activity/GameInformationActivityV2$o;,
        Lcom/join/mgps/activity/GameInformationActivityV2$GType;,
        Lcom/join/mgps/activity/GameInformationActivityV2$m;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c02c2
.end annotation


# instance fields
.field private A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field B:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field C:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field D:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field E:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field F:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private G:Landroid/content/Context;

.field private H:Lcom/join/mgps/dto/DetailResultBean;

.field private I:J

.field private J:Landroid/os/Handler;

.field private K:I

.field private L:Lcom/wufan/user/service/protobuf/n0;

.field M:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/github/snowdream/android/app/downloader/DownloadTask;",
            ">;"
        }
    .end annotation
.end field

.field N:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/github/snowdream/android/app/downloader/DownloadTask;",
            ">;"
        }
    .end annotation
.end field

.field private O:Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;

.field private P:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/adapter/GameCommentAdapterV2$l;",
            ">;"
        }
    .end annotation
.end field

.field private Q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/InformationCommentBeanV2;",
            ">;"
        }
    .end annotation
.end field

.field R:Landroid/content/Context;

.field private S:Ljava/lang/String;

.field T:Landroid/widget/Button;

.field U:Landroid/webkit/WebView;

.field V:Lcom/join/mgps/customview/o;

.field W:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/activity/GameInformationActivityV2$m;",
            ">;"
        }
    .end annotation
.end field

.field X:Lcom/join/mgps/activity/GameInformationActivityV2$n;

.field b:Lcom/join/mgps/rpc/e;

.field c:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/res/StringRes;
        resName = "net_excption"
    .end annotation
.end field

.field d:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/res/StringRes;
        resName = "connect_server_excption"
    .end annotation
.end field

.field e:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field f:Landroid/widget/RelativeLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field g:Landroid/widget/RelativeLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field h:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field i:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field j:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field k:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field l:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field m:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field n:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field o:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field p:Landroid/widget/Button;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field q:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field r:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field s:Lcom/join/mgps/customview/CustomerDownloadView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
        value = 0x7f091484
    .end annotation
.end field

.field t:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field u:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field v:Lcom/join/mgps/dto/ExtBean;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field w:Z
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field private x:Ljava/lang/String;

.field private y:Z

.field private z:Lcom/join/mgps/dto/GameInformationBean;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/BaseActivity;-><init>()V

    const-string v0, ""

    .line 2
    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->x:Ljava/lang/String;

    .line 3
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    iput-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->J:Landroid/os/Handler;

    .line 4
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->M:Ljava/util/Map;

    .line 5
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->N:Ljava/util/Map;

    .line 6
    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->S:Ljava/lang/String;

    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->V:Lcom/join/mgps/customview/o;

    .line 8
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->W:Ljava/util/List;

    .line 9
    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->X:Lcom/join/mgps/activity/GameInformationActivityV2$n;

    return-void
.end method

.method private C0(ILcom/join/mgps/activity/GameInformationActivityV2$ReplyViewHolder;)V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->W:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/activity/GameInformationActivityV2$m;

    iget-object v0, v0, Lcom/join/mgps/activity/GameInformationActivityV2$m;->a:Ljava/lang/Object;

    check-cast v0, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v1, v0, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;->b:Lcom/join/mgps/dto/InformationCommentBeanV2;

    if-nez v1, :cond_1

    return-void

    .line 3
    :cond_1
    iget-boolean v1, v0, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;->d:Z

    const/4 v2, 0x0

    const/16 v3, 0x8

    if-eqz v1, :cond_2

    .line 4
    iget-object v1, p2, Lcom/join/mgps/activity/GameInformationActivityV2$ReplyViewHolder;->b:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 5
    :cond_2
    iget-object v1, p2, Lcom/join/mgps/activity/GameInformationActivityV2$ReplyViewHolder;->b:Landroid/view/View;

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 6
    :goto_0
    iget-boolean v1, v0, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;->g:Z

    if-nez v1, :cond_3

    .line 7
    iget-object v1, p2, Lcom/join/mgps/activity/GameInformationActivityV2$ReplyViewHolder;->e:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 8
    iget-object v1, p2, Lcom/join/mgps/activity/GameInformationActivityV2$ReplyViewHolder;->f:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 9
    :cond_3
    iget-object v1, p2, Lcom/join/mgps/activity/GameInformationActivityV2$ReplyViewHolder;->e:Landroid/view/View;

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 10
    iget-object v1, p2, Lcom/join/mgps/activity/GameInformationActivityV2$ReplyViewHolder;->f:Landroid/view/View;

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 11
    :goto_1
    iget-object v1, v0, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;->b:Lcom/join/mgps/dto/InformationCommentBeanV2;

    invoke-virtual {v1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getReplyList()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 12
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-eqz v1, :cond_4

    .line 13
    iget-object p2, p2, Lcom/join/mgps/activity/GameInformationActivityV2$ReplyViewHolder;->a:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-direct {p0, p2, v0, v1, p1}, Lcom/join/mgps/activity/GameInformationActivityV2;->I0(Landroid/view/View;Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;ZI)V

    goto :goto_2

    .line 14
    :cond_4
    iget-object p1, p2, Lcom/join/mgps/activity/GameInformationActivityV2$ReplyViewHolder;->a:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/widget/LinearLayout;->removeAllViews()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 15
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_2
    return-void
.end method

.method private I0(Landroid/view/View;Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;ZI)V
    .locals 18

    move-object/from16 v8, p0

    move-object/from16 v9, p2

    .line 1
    iget-object v10, v9, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;->a:Ljava/lang/String;

    .line 2
    iget v11, v9, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;->e:I

    .line 3
    iget-boolean v12, v9, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;->f:Z

    .line 4
    iget-object v13, v9, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;->b:Lcom/join/mgps/dto/InformationCommentBeanV2;

    .line 5
    invoke-virtual {v13}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getReplyList()Ljava/util/List;

    move-result-object v14

    .line 6
    move-object/from16 v15, p1

    check-cast v15, Landroid/widget/LinearLayout;

    invoke-virtual {v15}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 7
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v7

    const/4 v5, 0x0

    :goto_0
    add-int/lit8 v0, v7, 0x1

    if-ge v5, v0, :cond_7

    const/4 v0, 0x3

    if-le v5, v0, :cond_0

    if-eqz p3, :cond_0

    move/from16 v16, v11

    move/from16 v17, v12

    const/4 v4, 0x0

    move v11, v5

    move v12, v7

    goto/16 :goto_4

    .line 8
    :cond_0
    iget-object v1, v8, Lcom/join/mgps/activity/GameInformationActivityV2;->R:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c014e

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 9
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 10
    invoke-virtual {v4, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v1, 0x7f090367

    .line 11
    invoke-virtual {v4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f090369

    .line 12
    invoke-virtual {v4, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f091557

    .line 13
    invoke-virtual {v4, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const/16 v6, 0x8

    if-ne v5, v7, :cond_1

    if-gt v7, v0, :cond_2

    :cond_1
    if-lez v11, :cond_3

    if-eqz v12, :cond_3

    if-ne v5, v7, :cond_3

    .line 14
    :cond_2
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 15
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setVisibility(I)V

    const/4 v6, 0x0

    .line 16
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setVisibility(I)V

    const-string v0, "\u6536\u8d77"

    .line 17
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 18
    new-instance v0, Lcom/join/mgps/activity/GameInformationActivityV2$g;

    move-object v1, v0

    move-object/from16 v2, p0

    move v3, v11

    move-object v9, v4

    move/from16 v4, p4

    move/from16 v16, v11

    move v11, v5

    move-object v5, v10

    move/from16 v17, v12

    const/4 v12, 0x0

    move-object/from16 v6, p2

    invoke-direct/range {v1 .. v6}, Lcom/join/mgps/activity/GameInformationActivityV2$g;-><init>(Lcom/join/mgps/activity/GameInformationActivityV2;IILjava/lang/String;Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;)V

    invoke-virtual {v9, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    move v12, v7

    :goto_1
    const/4 v4, 0x0

    goto/16 :goto_2

    :cond_3
    move-object v9, v4

    move/from16 v16, v11

    move/from16 v17, v12

    const/4 v12, 0x0

    move v11, v5

    if-ne v11, v0, :cond_4

    if-eqz p3, :cond_4

    if-le v7, v0, :cond_4

    .line 19
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 20
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 21
    invoke-virtual {v2, v12}, Landroid/widget/TextView;->setVisibility(I)V

    .line 22
    invoke-virtual {v2}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f10009d

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    add-int/lit8 v4, v7, -0x3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v12

    invoke-virtual {v0, v1, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    new-instance v0, Lcom/join/mgps/activity/GameInformationActivityV2$h;

    move-object v1, v0

    move-object/from16 v2, p0

    move v3, v7

    move-object v4, v13

    move-object v5, v10

    move-object/from16 v6, p2

    move v12, v7

    move/from16 v7, p4

    invoke-direct/range {v1 .. v7}, Lcom/join/mgps/activity/GameInformationActivityV2$h;-><init>(Lcom/join/mgps/activity/GameInformationActivityV2;ILcom/join/mgps/dto/InformationCommentBeanV2;Ljava/lang/String;Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;I)V

    invoke-virtual {v9, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_4
    move v12, v7

    if-ge v11, v12, :cond_6

    if-lt v11, v0, :cond_5

    if-eqz p3, :cond_5

    goto :goto_3

    :cond_5
    const/4 v4, 0x0

    .line 24
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 25
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 26
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 27
    invoke-interface {v14, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/InformationCommentBeanV2;

    .line 28
    invoke-virtual {v0}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getMsg()Ljava/lang/String;

    move-result-object v2

    .line 29
    invoke-virtual {v0}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getCommentId()Ljava/lang/String;

    .line 30
    :try_start_0
    invoke-static {v2}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 31
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getNickname()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    invoke-direct {v8, v9, v0}, Lcom/join/mgps/activity/GameInformationActivityV2;->M0(Landroid/view/View;Lcom/join/mgps/dto/InformationCommentBeanV2;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 33
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 34
    :goto_2
    invoke-virtual {v15, v9}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto :goto_4

    :cond_6
    :goto_3
    const/4 v4, 0x0

    :goto_4
    add-int/lit8 v5, v11, 0x1

    move-object/from16 v9, p2

    move v7, v12

    move/from16 v11, v16

    move/from16 v12, v17

    goto/16 :goto_0

    :cond_7
    return-void
.end method

.method private M0(Landroid/view/View;Lcom/join/mgps/dto/InformationCommentBeanV2;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameInformationActivityV2$e;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/activity/GameInformationActivityV2$e;-><init>(Lcom/join/mgps/activity/GameInformationActivityV2;Lcom/join/mgps/dto/InformationCommentBeanV2;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private N0(Landroid/view/View;Lcom/join/mgps/dto/InformationCommentBeanV2;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameInformationActivityV2$d;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/activity/GameInformationActivityV2$d;-><init>(Lcom/join/mgps/activity/GameInformationActivityV2;Lcom/join/mgps/dto/InformationCommentBeanV2;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private O0(Landroid/view/View;Lcom/join/mgps/dto/InformationCommentBeanV2;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameInformationActivityV2$f;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/activity/GameInformationActivityV2$f;-><init>(Lcom/join/mgps/activity/GameInformationActivityV2;Lcom/join/mgps/dto/InformationCommentBeanV2;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private T0()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 3
    :goto_0
    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/16 v3, 0x2b

    const v4, 0x7f0803ff

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, Lcom/join/mgps/enums/ConstantIntEnum;->H5:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v6}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ""

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 4
    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->p:Landroid/widget/Button;

    invoke-virtual {v2, v4}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 5
    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->p:Landroid/widget/Button;

    const-string v5, "\u6253\u5f00"

    invoke-virtual {v2, v5}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 6
    :cond_2
    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/DetailResultBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v2

    iget-object v5, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/DetailResultBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v2

    if-lez v2, :cond_3

    const/16 v0, 0x2b

    :cond_3
    :goto_1
    if-eqz v0, :cond_8

    if-eq v0, v3, :cond_8

    const/16 v2, 0x30

    if-eq v0, v2, :cond_7

    const/4 v2, 0x2

    if-eq v0, v2, :cond_6

    const/4 v2, 0x3

    if-eq v0, v2, :cond_5

    const/4 v2, 0x5

    if-eq v0, v2, :cond_4

    const/4 v2, 0x6

    if-eq v0, v2, :cond_5

    const/4 v2, 0x7

    if-eq v0, v2, :cond_8

    const v1, 0x7f080405

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_3

    .line 7
    :pswitch_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->p:Landroid/widget/Button;

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->p:Landroid/widget/Button;

    const-string v1, "\u89e3\u538b"

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_3

    .line 9
    :pswitch_1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->p:Landroid/widget/Button;

    const v1, 0x7f080408

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->p:Landroid/widget/Button;

    const-string v1, "\u89e3\u538b\u4e2d"

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_3

    .line 11
    :pswitch_2
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->p:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->p:Landroid/widget/Button;

    const-string v1, "\u5b89\u88c5"

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_3

    .line 13
    :pswitch_3
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->p:Landroid/widget/Button;

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 14
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->p:Landroid/widget/Button;

    const-string v1, "\u7b49\u5f85"

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_3

    .line 15
    :pswitch_4
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->p:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 16
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->p:Landroid/widget/Button;

    const-string v1, "\u66f4\u65b0"

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_3

    .line 17
    :cond_4
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->p:Landroid/widget/Button;

    const v1, 0x7f08040a

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 18
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->p:Landroid/widget/Button;

    invoke-virtual {v0}, Landroid/widget/Button;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f1000f7

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_3

    .line 19
    :cond_5
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->p:Landroid/widget/Button;

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 20
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->p:Landroid/widget/Button;

    const-string v1, "\u7ee7\u7eed"

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_3

    .line 21
    :cond_6
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->p:Landroid/widget/Button;

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 22
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->p:Landroid/widget/Button;

    const-string v1, "\u6682\u505c"

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 23
    :cond_7
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->p:Landroid/widget/Button;

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 24
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->p:Landroid/widget/Button;

    const-string v1, "\u5b89\u88c5\u4e2d"

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 25
    :cond_8
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->p:Landroid/widget/Button;

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 26
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    if-eqz v0, :cond_a

    .line 27
    invoke-virtual {v0}, Lcom/join/mgps/dto/DetailResultBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/DetailResultBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_9

    .line 28
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->p:Landroid/widget/Button;

    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f100305

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/DetailResultBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v5

    invoke-virtual {v5}, Lcom/join/mgps/dto/PayTagInfo;->getPayGameAmount()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v1

    invoke-virtual {v2, v3, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 29
    :cond_9
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->p:Landroid/widget/Button;

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f1000f6

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 30
    :goto_2
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/DetailResultBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/DetailResultBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 31
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->p:Landroid/widget/Button;

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->t3(Landroid/widget/Button;Lcom/join/mgps/dto/DetailResultBean;)V

    :cond_a
    :goto_3
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

.method private U0()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->T:Landroid/widget/Button;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 3
    :goto_0
    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/16 v3, 0x2b

    const v4, 0x7f0803ff

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, Lcom/join/mgps/enums/ConstantIntEnum;->H5:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v6}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ""

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 4
    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->p:Landroid/widget/Button;

    invoke-virtual {v2, v4}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 5
    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->p:Landroid/widget/Button;

    const-string v5, "\u6253\u5f00"

    invoke-virtual {v2, v5}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 6
    :cond_2
    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/join/mgps/dto/DetailResultBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v2

    iget-object v5, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/DetailResultBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v2

    if-lez v2, :cond_3

    const/16 v0, 0x2b

    :cond_3
    :goto_1
    if-eqz v0, :cond_8

    if-eq v0, v3, :cond_8

    const/16 v2, 0x30

    if-eq v0, v2, :cond_7

    const/4 v2, 0x2

    if-eq v0, v2, :cond_6

    const/4 v2, 0x3

    if-eq v0, v2, :cond_5

    const/4 v2, 0x5

    if-eq v0, v2, :cond_4

    const/4 v2, 0x6

    if-eq v0, v2, :cond_5

    const/4 v2, 0x7

    if-eq v0, v2, :cond_8

    const v1, 0x7f080405

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_3

    .line 7
    :pswitch_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->T:Landroid/widget/Button;

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->T:Landroid/widget/Button;

    const-string v1, "\u89e3\u538b"

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_3

    .line 9
    :pswitch_1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->T:Landroid/widget/Button;

    const v1, 0x7f080408

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->T:Landroid/widget/Button;

    const-string v1, "\u89e3\u538b\u4e2d"

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_3

    .line 11
    :pswitch_2
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->T:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->T:Landroid/widget/Button;

    const-string v1, "\u5b89\u88c5"

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_3

    .line 13
    :pswitch_3
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->T:Landroid/widget/Button;

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 14
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->T:Landroid/widget/Button;

    const-string v1, "\u7b49\u5f85"

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_3

    .line 15
    :pswitch_4
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->T:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 16
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->T:Landroid/widget/Button;

    const-string v1, "\u66f4\u65b0"

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_3

    .line 17
    :cond_4
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->T:Landroid/widget/Button;

    const v1, 0x7f08040a

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 18
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->T:Landroid/widget/Button;

    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f1000f7

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_3

    .line 19
    :cond_5
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->T:Landroid/widget/Button;

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 20
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->T:Landroid/widget/Button;

    const-string v1, "\u7ee7\u7eed"

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_3

    .line 21
    :cond_6
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->T:Landroid/widget/Button;

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 22
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->T:Landroid/widget/Button;

    const-string v1, "\u6682\u505c"

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 23
    :cond_7
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->T:Landroid/widget/Button;

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 24
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->T:Landroid/widget/Button;

    const-string v1, "\u5b89\u88c5\u4e2d"

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 25
    :cond_8
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->T:Landroid/widget/Button;

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 26
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    if-eqz v0, :cond_a

    .line 27
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/GameInformationActivityV2;->F0(Lcom/join/mgps/dto/DetailResultBean;)Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, Lb2/e0;->o()Lb2/e0;

    move-result-object v0

    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/DetailResultBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lb2/e0;->p(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 28
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->T:Landroid/widget/Button;

    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f100305

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/DetailResultBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v5

    invoke-virtual {v5}, Lcom/join/mgps/dto/PayTagInfo;->getPayGameAmount()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v1

    invoke-virtual {v2, v3, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 29
    :cond_9
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->T:Landroid/widget/Button;

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f1000f6

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 30
    :goto_2
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->T:Landroid/widget/Button;

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->t3(Landroid/widget/Button;Lcom/join/mgps/dto/DetailResultBean;)V

    :cond_a
    :goto_3
    return-void

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private W0(Lcom/join/mgps/dto/InformationCommentBeanV2;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->z:Lcom/join/mgps/dto/GameInformationBean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameInformationBean;->getComment_switch()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->t:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/GameInformationActivityV2;->y0(Ljava/lang/String;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->Q:Ljava/util/List;

    if-eqz v0, :cond_6

    if-nez p1, :cond_1

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 4
    :goto_0
    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->Q:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_5

    .line 5
    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->Q:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/InformationCommentBeanV2;

    .line 6
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 7
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getPraise()Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getPraise()Ljava/lang/Boolean;

    move-result-object v4

    if-eq v3, v4, :cond_2

    .line 8
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getPraise()Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/InformationCommentBeanV2;->setPraise(Ljava/lang/Boolean;)V

    or-int/lit8 v1, v1, 0x1

    .line 9
    :cond_2
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getLike()I

    move-result v3

    invoke-virtual {v2}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getLike()I

    move-result v4

    if-eq v3, v4, :cond_3

    .line 10
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getLike()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/InformationCommentBeanV2;->setLike(I)V

    or-int/lit8 v1, v1, 0x1

    :cond_3
    if-eqz v1, :cond_4

    goto :goto_1

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    :goto_1
    if-eqz v1, :cond_6

    .line 11
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->Q:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 13
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/GameInformationActivityV2;->Q0(Ljava/util/List;)V

    :cond_6
    :goto_2
    return-void
.end method

.method private accountBean(Landroid/content/Context;)Lcom/wufan/user/service/protobuf/n0;
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object p1

    return-object p1
.end method

.method static synthetic g0(Lcom/join/mgps/activity/GameInformationActivityV2;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic h0(Lcom/join/mgps/activity/GameInformationActivityV2;)Lcom/join/mgps/dto/DetailResultBean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    return-object p0
.end method

.method static synthetic i0(Lcom/join/mgps/activity/GameInformationActivityV2;)Lcom/wufan/user/service/protobuf/n0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->L:Lcom/wufan/user/service/protobuf/n0;

    return-object p0
.end method

.method static synthetic j0(Lcom/join/mgps/activity/GameInformationActivityV2;)Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->O:Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;

    return-object p0
.end method

.method static synthetic k0(Lcom/join/mgps/activity/GameInformationActivityV2;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->J:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic l0(Lcom/join/mgps/activity/GameInformationActivityV2;)Lcom/join/mgps/dto/GameInformationBean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->z:Lcom/join/mgps/dto/GameInformationBean;

    return-object p0
.end method

.method static synthetic m0(Lcom/join/mgps/activity/GameInformationActivityV2;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->K:I

    return p0
.end method

.method static synthetic n0(Lcom/join/mgps/activity/GameInformationActivityV2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/GameInformationActivityV2;->U0()V

    return-void
.end method

.method static synthetic o0(Lcom/join/mgps/activity/GameInformationActivityV2;ILcom/join/mgps/activity/GameInformationActivityV2$ReplyViewHolder;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/activity/GameInformationActivityV2;->C0(ILcom/join/mgps/activity/GameInformationActivityV2$ReplyViewHolder;)V

    return-void
.end method

.method private v0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->V:Lcom/join/mgps/customview/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->V:Lcom/join/mgps/customview/o;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    return-void
.end method

.method private x0()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/IntentUtil;->getSplashActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 3
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/join/mgps/Util/IntentUtil;->setSplashActivity(Landroid/app/Activity;)V

    .line 4
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 5
    const-class v2, Lcom/join/mgps/activity/MGMainActivity_;

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    const/high16 v0, 0x4000000

    .line 6
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    const/high16 v0, 0x20000000

    .line 7
    invoke-virtual {v1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 8
    invoke-virtual {p0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method


# virtual methods
.method public A0(ILcom/join/mgps/activity/GameInformationActivityV2$CommentViewHolder;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->W:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/GameInformationActivityV2$m;

    iget-object p1, p1, Lcom/join/mgps/activity/GameInformationActivityV2$m;->a:Ljava/lang/Object;

    check-cast p1, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$a;

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object p1, p1, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$a;->a:Lcom/join/mgps/dto/InformationCommentBeanV2;

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getReplyList()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getReplyList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 4
    iget-object v0, p2, Lcom/join/mgps/activity/GameInformationActivityV2$CommentViewHolder;->i:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 5
    :cond_1
    iget-object v0, p2, Lcom/join/mgps/activity/GameInformationActivityV2$CommentViewHolder;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 6
    :goto_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getCreateTime()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    .line 7
    invoke-static {p2}, Lcom/join/mgps/activity/GameInformationActivityV2$CommentViewHolder;->a(Lcom/join/mgps/activity/GameInformationActivityV2$CommentViewHolder;)Landroid/widget/TextView;

    move-result-object v2

    invoke-static {v0, v1}, Lcom/join/android/app/common/utils/g;->a(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    invoke-static {p2}, Lcom/join/mgps/activity/GameInformationActivityV2$CommentViewHolder;->b(Lcom/join/mgps/activity/GameInformationActivityV2$CommentViewHolder;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getMsg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    invoke-static {p2}, Lcom/join/mgps/activity/GameInformationActivityV2$CommentViewHolder;->c(Lcom/join/mgps/activity/GameInformationActivityV2$CommentViewHolder;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getLike()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getPraise()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 11
    invoke-static {p2}, Lcom/join/mgps/activity/GameInformationActivityV2$CommentViewHolder;->d(Lcom/join/mgps/activity/GameInformationActivityV2$CommentViewHolder;)Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f080927

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 12
    :cond_2
    invoke-static {p2}, Lcom/join/mgps/activity/GameInformationActivityV2$CommentViewHolder;->d(Lcom/join/mgps/activity/GameInformationActivityV2$CommentViewHolder;)Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f080f30

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 13
    :goto_1
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getAvatar()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 14
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->R:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getAvatar()Ljava/lang/String;

    move-result-object v1

    invoke-static {p2}, Lcom/join/mgps/activity/GameInformationActivityV2$CommentViewHolder;->e(Lcom/join/mgps/activity/GameInformationActivityV2$CommentViewHolder;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/join/mgps/Util/UtilsMy;->s3(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/drawee/view/SimpleDraweeView;)V

    .line 15
    :cond_3
    invoke-static {p2}, Lcom/join/mgps/activity/GameInformationActivityV2$CommentViewHolder;->f(Lcom/join/mgps/activity/GameInformationActivityV2$CommentViewHolder;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getNickname()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    invoke-static {p2}, Lcom/join/mgps/activity/GameInformationActivityV2$CommentViewHolder;->d(Lcom/join/mgps/activity/GameInformationActivityV2$CommentViewHolder;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/join/mgps/activity/GameInformationActivityV2;->N0(Landroid/view/View;Lcom/join/mgps/dto/InformationCommentBeanV2;)V

    .line 17
    invoke-static {p2}, Lcom/join/mgps/activity/GameInformationActivityV2$CommentViewHolder;->g(Lcom/join/mgps/activity/GameInformationActivityV2$CommentViewHolder;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/join/mgps/activity/GameInformationActivityV2;->O0(Landroid/view/View;Lcom/join/mgps/dto/InformationCommentBeanV2;)V

    .line 18
    invoke-static {p2}, Lcom/join/mgps/activity/GameInformationActivityV2$CommentViewHolder;->e(Lcom/join/mgps/activity/GameInformationActivityV2$CommentViewHolder;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/activity/GameInformationActivityV2$i;

    invoke-direct {v1, p0, p1}, Lcom/join/mgps/activity/GameInformationActivityV2$i;-><init>(Lcom/join/mgps/activity/GameInformationActivityV2;Lcom/join/mgps/dto/InformationCommentBeanV2;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    invoke-static {p2}, Lcom/join/mgps/activity/GameInformationActivityV2$CommentViewHolder;->b(Lcom/join/mgps/activity/GameInformationActivityV2$CommentViewHolder;)Landroid/widget/TextView;

    move-result-object p1

    new-instance v0, Lcom/join/mgps/activity/GameInformationActivityV2$j;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/activity/GameInformationActivityV2$j;-><init>(Lcom/join/mgps/activity/GameInformationActivityV2;Lcom/join/mgps/activity/GameInformationActivityV2$CommentViewHolder;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->post(Ljava/lang/Runnable;)Z

    .line 20
    iget-object p1, p2, Lcom/join/mgps/activity/GameInformationActivityV2$CommentViewHolder;->j:Landroid/widget/TextView;

    new-instance v0, Lcom/join/mgps/activity/GameInformationActivityV2$a;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/activity/GameInformationActivityV2$a;-><init>(Lcom/join/mgps/activity/GameInformationActivityV2;Lcom/join/mgps/activity/GameInformationActivityV2$CommentViewHolder;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method B0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    :try_start_0
    invoke-static {p0}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->t:Ljava/lang/String;

    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->v:Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/Util/RequestBeanUtil;->getgameInformation(Ljava/lang/String;Lcom/join/mgps/dto/ExtBean;)Lcom/join/mgps/dto/CommonRequestBean;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->b:Lcom/join/mgps/rpc/e;

    invoke-interface {v1, v0}, Lcom/join/mgps/rpc/e;->O(Lcom/join/mgps/dto/CommonRequestBean;)Lcom/join/mgps/dto/ResultMainBean;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultMainBean;->getFlag()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultMainBean;->getMessages()Lcom/join/mgps/dto/ResultMessageBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultMessageBean;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 6
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v1, 0x0

    .line 7
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/GameInformationBean;

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/GameInformationActivityV2;->R0(Lcom/join/mgps/dto/GameInformationBean;)V

    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationActivityV2;->showLodingFailed()V

    goto :goto_0

    .line 9
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationActivityV2;->showLodingFailed()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 11
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationActivityV2;->showLodingFailed()V

    goto :goto_0

    .line 12
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationActivityV2;->showLodingFailed()V

    :goto_0
    return-void
.end method

.method public D0()Lcom/join/mgps/activity/GameInformationActivityV2$n;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->X:Lcom/join/mgps/activity/GameInformationActivityV2$n;

    return-object v0
.end method

.method E0()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->z:Lcom/join/mgps/dto/GameInformationBean;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->I:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x7d0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_1

    return-void

    .line 3
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->I:J

    .line 4
    new-instance v0, Lcom/join/mgps/dto/ShareBean;

    invoke-direct {v0}, Lcom/join/mgps/dto/ShareBean;-><init>()V

    .line 5
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->z:Lcom/join/mgps/dto/GameInformationBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameInformationBean;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setTitle(Ljava/lang/String;)V

    const-string v1, "\u70b9\u51fb\u67e5\u770b\u8be6\u60c5"

    .line 6
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setText(Ljava/lang/String;)V

    .line 7
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->z:Lcom/join/mgps/dto/GameInformationBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameInformationBean;->getShow_pic()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setImageUrl(Ljava/lang/String;)V

    .line 8
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->z:Lcom/join/mgps/dto/GameInformationBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameInformationBean;->getShare_url()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setQqUrl(Ljava/lang/String;)V

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->z:Lcom/join/mgps/dto/GameInformationBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameInformationBean;->getShare_url()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setqZoneShareUrl(Ljava/lang/String;)V

    .line 10
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->z:Lcom/join/mgps/dto/GameInformationBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameInformationBean;->getShare_url()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setWeiboShareUrl(Ljava/lang/String;)V

    .line 11
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->z:Lcom/join/mgps/dto/GameInformationBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameInformationBean;->getShare_url()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setWechatFriendUrl(Ljava/lang/String;)V

    .line 12
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->z:Lcom/join/mgps/dto/GameInformationBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameInformationBean;->getShare_url()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setWechatShareUrl(Ljava/lang/String;)V

    const/4 v1, 0x3

    .line 13
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setFrom(I)V

    .line 14
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->t:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setGameId(Ljava/lang/String;)V

    .line 15
    invoke-static {p0, v0}, Lcom/join/mgps/Util/s;->r(Landroid/content/Context;Lcom/join/mgps/dto/ShareBean;)V

    return-void
.end method

.method F0(Lcom/join/mgps/dto/DetailResultBean;)Z
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/PayTagInfo;->getPay_game_amount()I

    move-result p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method G0()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/UiThread;
        delay = 0x190L
    .end annotation

    return-void
.end method

.method H0(Lcom/join/mgps/dto/CollectionBeanSub;)V
    .locals 2
    .param p1    # Lcom/join/mgps/dto/CollectionBeanSub;
        .annotation build Lorg/androidannotations/annotations/Receiver$Extra;
            value = "gameData"
        .end annotation
    .end param
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.paygamefinish",
            "com.join.android.app.mgsim.wufun.broadcast.refreshMyGame"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 1
    invoke-static {}, Lb2/e0;->o()Lb2/e0;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb2/e0;->n(Ljava/lang/String;)Lcom/join/mgps/db/tables/PurchasedListTable;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/db/tables/PurchasedListTable;

    invoke-direct {v0}, Lcom/join/mgps/db/tables/PurchasedListTable;-><init>()V

    .line 3
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getGame_id()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/db/tables/PurchasedListTable;->setGame_id(Ljava/lang/String;)V

    .line 4
    invoke-static {}, Lb2/e0;->o()Lb2/e0;

    move-result-object p1

    invoke-virtual {p1, v0}, Lp1/b;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    :cond_1
    invoke-direct {p0}, Lcom/join/mgps/activity/GameInformationActivityV2;->T0()V

    .line 6
    invoke-direct {p0}, Lcom/join/mgps/activity/GameInformationActivityV2;->U0()V

    return-void
.end method

.method J0(Lcom/join/mgps/dto/InformationCommentBeanV2;Landroid/widget/ImageView;Landroid/widget/TextView;)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const-string p2, "\u70b9\u8d5e\u5931\u8d25"

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result p3

    if-eqz p3, :cond_5

    .line 2
    :try_start_0
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p3

    invoke-virtual {p3, p0}, Lcom/join/mgps/Util/IntentUtil;->goLoginInteractive(Landroid/content/Context;)Z

    move-result p3

    if-eqz p3, :cond_0

    return-void

    .line 3
    :cond_0
    new-instance p3, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {p3}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 4
    invoke-virtual {p3, p0}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 5
    new-instance v0, Lcom/join/mgps/dto/GameInformationCommentPraiseArgs;

    invoke-direct {v0}, Lcom/join/mgps/dto/GameInformationCommentPraiseArgs;-><init>()V

    .line 6
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/GameInformationCommentPraiseArgs;->setCommentId(Ljava/lang/String;)V

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->L:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/GameInformationCommentPraiseArgs;->setUid(Ljava/lang/String;)V

    .line 8
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->L:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/GameInformationCommentPraiseArgs;->setUserToken(Ljava/lang/String;)V

    .line 9
    invoke-virtual {p3, v0}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 10
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/rpc/impl/i;->B0()Le2/i;

    move-result-object v0

    invoke-virtual {p3}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object p3

    invoke-interface {v0, p3}, Le2/i;->P(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;

    move-result-object p3

    invoke-interface {p3}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    move-result-object p3

    invoke-virtual {p3}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/join/mgps/dto/ResponseModel;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v0, "\u5b8c\u5584\u8d44\u6599\u540e\u5c31\u53ef\u70b9\u8d5e\u54e6"

    const/16 v1, 0x2c2

    if-eqz p3, :cond_1

    .line 11
    :try_start_1
    invoke-virtual {p3}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v2

    if-ne v2, v1, :cond_1

    .line 12
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/GameInformationActivityV2;->showMessage(Ljava/lang/String;)V

    .line 13
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p3

    invoke-virtual {p3, p0}, Lcom/join/mgps/Util/IntentUtil;->goLoginInteractive(Landroid/content/Context;)Z

    return-void

    :cond_1
    if-eqz p3, :cond_2

    .line 14
    invoke-virtual {p3}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v2

    if-ne v2, v1, :cond_2

    .line 15
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/GameInformationActivityV2;->showMessage(Ljava/lang/String;)V

    .line 16
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p3

    invoke-virtual {p3, p0}, Lcom/join/mgps/Util/IntentUtil;->goLoginInteractive(Landroid/content/Context;)Z

    return-void

    :cond_2
    if-eqz p3, :cond_3

    .line 17
    invoke-virtual {p3}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v0

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_3

    .line 18
    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, p3}, Lcom/join/mgps/dto/InformationCommentBeanV2;->setPraise(Ljava/lang/Boolean;)V

    .line 19
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getLike()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 20
    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/InformationCommentBeanV2;->setLike(I)V

    .line 21
    invoke-virtual {p1, p3}, Lcom/join/mgps/dto/InformationCommentBeanV2;->setPraise(Ljava/lang/Boolean;)V

    .line 22
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/GameInformationActivityV2;->W0(Lcom/join/mgps/dto/InformationCommentBeanV2;)V

    goto :goto_1

    :cond_3
    if-eqz p3, :cond_4

    .line 23
    invoke-virtual {p3}, Lcom/join/mgps/dto/ResponseModel;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 24
    invoke-virtual {p3}, Lcom/join/mgps/dto/ResponseModel;->getMessage()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p3}, Lcom/join/mgps/activity/GameInformationActivityV2;->showToast(Ljava/lang/String;)V

    goto :goto_0

    .line 25
    :cond_4
    invoke-virtual {p0, p2}, Lcom/join/mgps/activity/GameInformationActivityV2;->showToast(Ljava/lang/String;)V

    .line 26
    :goto_0
    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, p3}, Lcom/join/mgps/dto/InformationCommentBeanV2;->setPraise(Ljava/lang/Boolean;)V

    .line 27
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/GameInformationActivityV2;->W0(Lcom/join/mgps/dto/InformationCommentBeanV2;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p3

    .line 28
    invoke-virtual {p3}, Ljava/lang/Exception;->printStackTrace()V

    .line 29
    invoke-virtual {p0, p2}, Lcom/join/mgps/activity/GameInformationActivityV2;->showToast(Ljava/lang/String;)V

    .line 30
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2}, Lcom/join/mgps/dto/InformationCommentBeanV2;->setPraise(Ljava/lang/Boolean;)V

    .line 31
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/GameInformationActivityV2;->W0(Lcom/join/mgps/dto/InformationCommentBeanV2;)V

    goto :goto_1

    :cond_5
    const-string p2, "\u6ca1\u6709\u7f51\u7edc"

    .line 32
    invoke-virtual {p0, p2}, Lcom/join/mgps/activity/GameInformationActivityV2;->showToast(Ljava/lang/String;)V

    .line 33
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2}, Lcom/join/mgps/dto/InformationCommentBeanV2;->setPraise(Ljava/lang/Boolean;)V

    .line 34
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/GameInformationActivityV2;->W0(Lcom/join/mgps/dto/InformationCommentBeanV2;)V

    :goto_1
    return-void
.end method

.method K0(Lcom/join/mgps/activity/GameInformationActivityV2$m;Z)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    :try_start_0
    iget-object p1, p1, Lcom/join/mgps/activity/GameInformationActivityV2$m;->a:Ljava/lang/Object;

    check-cast p1, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;

    .line 2
    iput-boolean p2, p1, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;->g:Z
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

.method public L0(Lcom/join/mgps/activity/GameInformationActivityV2$n;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->X:Lcom/join/mgps/activity/GameInformationActivityV2$n;

    return-void
.end method

.method P0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
        delay = 0x190L
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 2
    new-instance v0, Lcom/join/mgps/activity/GameInformationActivityV2$m;

    sget-object v1, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->sendcomment:Lcom/join/mgps/activity/GameInformationActivityV2$GType;

    invoke-direct {v0, p0, v1}, Lcom/join/mgps/activity/GameInformationActivityV2$m;-><init>(Lcom/join/mgps/activity/GameInformationActivityV2;Lcom/join/mgps/activity/GameInformationActivityV2$GType;)V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->W:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->O:Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method

.method Q0(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/InformationCommentBeanV2;",
            ">;)V"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/UiThread;
        delay = 0x190L
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/android/app/common/utils/JsonMapper;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->S:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 3
    :cond_0
    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->S:Ljava/lang/String;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->Q:Ljava/util/List;

    .line 5
    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 6
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/GameInformationActivityV2;->p0(Ljava/util/List;)V

    .line 7
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->O:Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 8
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationActivityV2;->V0()V

    return-void
.end method

.method R0(Lcom/join/mgps/dto/GameInformationBean;)V
    .locals 8
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->q:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/GameInformationBean;->getComment_switch()I

    move-result v0

    const/4 v2, 0x1

    const/16 v3, 0x8

    if-ne v0, v2, :cond_1

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->r:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/GameInformationBean;->getComment_count()I

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->K:I

    if-lez v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->E:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->E:Landroid/widget/TextView;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/join/mgps/dto/GameInformationBean;->getComment_count()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->r:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->E:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 9
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->D:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 10
    iput-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->z:Lcom/join/mgps/dto/GameInformationBean;

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->i:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->h:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 13
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->C:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 14
    invoke-virtual {p1}, Lcom/join/mgps/dto/GameInformationBean;->getGame_info()Ljava/util/List;

    move-result-object v0

    .line 15
    iget-object v4, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->W:Ljava/util/List;

    new-instance v5, Lcom/join/mgps/activity/GameInformationActivityV2$m;

    sget-object v6, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->webview:Lcom/join/mgps/activity/GameInformationActivityV2$GType;

    invoke-direct {v5, p0, v6}, Lcom/join/mgps/activity/GameInformationActivityV2$m;-><init>(Lcom/join/mgps/activity/GameInformationActivityV2;Lcom/join/mgps/activity/GameInformationActivityV2$GType;)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz v0, :cond_4

    .line 16
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-nez v4, :cond_2

    goto :goto_1

    .line 17
    :cond_2
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/DetailResultBean;

    iput-object v4, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    if-nez v4, :cond_3

    .line 18
    iget-object v4, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->f:Landroid/widget/RelativeLayout;

    invoke-virtual {v4, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_1

    .line 19
    :cond_3
    iget-object v4, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->f:Landroid/widget/RelativeLayout;

    invoke-virtual {v4, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 20
    iget-object v4, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->W:Ljava/util/List;

    new-instance v5, Lcom/join/mgps/activity/GameInformationActivityV2$m;

    sget-object v6, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->card:Lcom/join/mgps/activity/GameInformationActivityV2$GType;

    invoke-direct {v5, p0, v6}, Lcom/join/mgps/activity/GameInformationActivityV2$m;-><init>(Lcom/join/mgps/activity/GameInformationActivityV2;Lcom/join/mgps/activity/GameInformationActivityV2$GType;)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    iget-boolean v4, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->w:Z

    if-eqz v4, :cond_4

    .line 22
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationActivityV2;->w0()V

    .line 23
    :cond_4
    :goto_1
    invoke-virtual {p1}, Lcom/join/mgps/dto/GameInformationBean;->getComment_switch()I

    move-result p1

    if-ne p1, v2, :cond_5

    .line 24
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationActivityV2;->P0()V

    .line 25
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->W:Ljava/util/List;

    new-instance v4, Lcom/join/mgps/activity/GameInformationActivityV2$m;

    sget-object v5, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->commentTitle:Lcom/join/mgps/activity/GameInformationActivityV2$GType;

    invoke-direct {v4, p0, v5}, Lcom/join/mgps/activity/GameInformationActivityV2$m;-><init>(Lcom/join/mgps/activity/GameInformationActivityV2;Lcom/join/mgps/activity/GameInformationActivityV2$GType;)V

    invoke-interface {p1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->t:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/GameInformationActivityV2;->y0(Ljava/lang/String;)V

    :cond_5
    if-eqz v0, :cond_14

    .line 27
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    if-nez p1, :cond_6

    goto/16 :goto_6

    .line 28
    :cond_6
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/DetailResultBean;

    iput-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    const/16 v0, 0x6a

    .line 29
    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 30
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->o:Landroid/widget/TextView;

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->k3(Lcom/join/mgps/dto/TipNew;Landroid/widget/TextView;)V

    .line 31
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->x:Ljava/lang/String;

    if-nez p1, :cond_7

    return-void

    .line 32
    :cond_7
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object p1

    if-eqz p1, :cond_8

    .line 33
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p1

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/DetailResultBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/ModInfoBean;->getMain_game_id()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v1

    iget-object v4, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/DetailResultBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/ModInfoBean;->getMod_game_id()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v2

    invoke-virtual {p1, v0}, Lp1/f;->G([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_2

    .line 34
    :cond_8
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/DetailResultBean;->getPackage_name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lp1/f;->H(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    :goto_2
    if-eqz p1, :cond_11

    .line 35
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_11

    .line 36
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :cond_9
    const/4 v4, 0x0

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 37
    sget-object v6, Lcom/join/mgps/enums/Dtype;->MOD:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    const/4 v7, 0x5

    if-eqz v6, :cond_b

    .line 38
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v0

    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Lcom/join/mgps/va/overmind/d;->F(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    if-ne v0, v7, :cond_a

    const/4 v0, 0x1

    goto :goto_3

    :cond_a
    const/4 v0, 0x0

    goto :goto_3

    .line 39
    :cond_b
    invoke-static {p0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v4

    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, p0, v6}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v4

    if-ne v4, v7, :cond_9

    const/4 v4, 0x1

    goto :goto_3

    :cond_c
    if-eqz v0, :cond_d

    if-eqz v4, :cond_d

    .line 40
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->x:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    goto :goto_4

    :cond_d
    if-eqz v0, :cond_e

    .line 41
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/DetailResultBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ModInfoBean;->getMod_game_id()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    goto :goto_4

    :cond_e
    if-eqz v4, :cond_f

    .line 42
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->x:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    goto :goto_4

    .line 43
    :cond_f
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/DetailResultBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object p1

    if-eqz p1, :cond_10

    .line 44
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/DetailResultBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ModInfoBean;->getMod_game_id()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 45
    :cond_10
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-nez p1, :cond_11

    .line 46
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->x:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 47
    :cond_11
    :goto_4
    invoke-direct {p0}, Lcom/join/mgps/activity/GameInformationActivityV2;->T0()V

    .line 48
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->j:Lcom/facebook/drawee/view/SimpleDraweeView;

    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/DetailResultBean;->getIco_remote()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 49
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->l:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/DetailResultBean;->getGame_name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->m:Landroid/widget/TextView;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u5927\u5c0f\uff1a"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/DetailResultBean;->getSize()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "M"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    if-nez p1, :cond_12

    .line 52
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->f:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_5

    .line 53
    :cond_12
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->f:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 54
    iget-boolean p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->w:Z

    if-eqz p1, :cond_13

    .line 55
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationActivityV2;->w0()V

    .line 56
    :cond_13
    :goto_5
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->C:Landroid/widget/LinearLayout;

    new-instance v0, Lcom/join/mgps/activity/GameInformationActivityV2$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameInformationActivityV2$c;-><init>(Lcom/join/mgps/activity/GameInformationActivityV2;)V

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 57
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->O:Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void

    .line 58
    :cond_14
    :goto_6
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->f:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 59
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->O:Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method

.method S0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/IntentUtil;->goMyGameManagerActivity(Landroid/content/Context;)V

    return-void
.end method

.method V0()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/UiThread;
        delay = 0x1f4L
    .end annotation

    return-void
.end method

.method X0(Landroid/widget/ImageView;Landroid/widget/TextView;ZLjava/lang/String;)V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    if-eqz p3, :cond_0

    const p3, 0x7f080927

    .line 1
    invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2
    invoke-virtual {p2, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    const p2, 0x7f080f30

    .line 3
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    :goto_0
    return-void
.end method

.method afterview()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/rpc/impl/d;->P1()Lcom/join/mgps/rpc/impl/d;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->b:Lcom/join/mgps/rpc/e;

    .line 2
    new-instance v0, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;-><init>(Lcom/join/mgps/activity/GameInformationActivityV2;)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->O:Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;

    .line 3
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/d0;->d(Ljava/lang/Object;)V

    .line 4
    iput-object p0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    .line 5
    iput-object p0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->R:Landroid/content/Context;

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->e:Landroid/widget/TextView;

    const-string v1, "\u8be6\u60c5"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationActivityV2;->getDownloadTaskInfo()V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->s:Lcom/join/mgps/customview/CustomerDownloadView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 9
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationActivityV2;->showLoding()V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->F:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->F:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->O:Lcom/join/mgps/activity/GameInformationActivityV2$GameinformationAdapter;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 12
    new-instance v0, Lcom/join/mgps/activity/GameInformationActivityV2$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/GameInformationActivityV2$b;-><init>(Lcom/join/mgps/activity/GameInformationActivityV2;)V

    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->X:Lcom/join/mgps/activity/GameInformationActivityV2$n;

    .line 13
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationActivityV2;->B0()V

    return-void
.end method

.method changeDownloadTaskNumber(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-eq p2, v1, :cond_9

    const/4 v1, 0x3

    if-eq p2, v1, :cond_8

    const/4 v1, 0x5

    if-eq p2, v1, :cond_6

    const/4 v1, 0x6

    if-eq p2, v1, :cond_5

    const/4 v1, 0x7

    if-eq p2, v1, :cond_3

    const/16 v1, 0xa

    if-eq p2, v1, :cond_1

    const/16 p1, 0xb

    if-eq p2, p1, :cond_7

    goto/16 :goto_0

    .line 2
    :cond_1
    iget-object p2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->M:Ljava/util/Map;

    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    .line 3
    iget-object p2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->M:Ljava/util/Map;

    invoke-interface {p2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    :cond_2
    iget-object p2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->N:Ljava/util/Map;

    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_b

    .line 5
    iget-object p2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->N:Ljava/util/Map;

    invoke-interface {p2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 6
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->M:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 7
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->M:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    :cond_4
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->N:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    .line 9
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->N:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 10
    :cond_5
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->N:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    .line 11
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->N:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 12
    :cond_6
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->M:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 13
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->M:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    :cond_7
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->N:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    .line 15
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->N:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 16
    :cond_8
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->N:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    .line 17
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->N:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 18
    :cond_9
    iget-object p2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->M:Ljava/util/Map;

    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_a

    .line 19
    iget-object p2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->M:Ljava/util/Map;

    invoke-interface {p2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    :cond_a
    iget-object p2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->N:Ljava/util/Map;

    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_b

    .line 21
    iget-object p2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->N:Ljava/util/Map;

    invoke-interface {p2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    :cond_b
    :goto_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationActivityV2;->updateDownloadView()V

    return-void
.end method

.method getDownloadTaskInfo()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0}, Lp1/f;->r()Ljava/util/List;

    move-result-object v0

    .line 2
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v1

    invoke-virtual {v1}, Lp1/f;->q()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 3
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_0

    .line 4
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 5
    iget-object v3, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->M:Ljava/util/Map;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    .line 6
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 8
    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->N:Ljava/util/Map;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 9
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationActivityV2;->updateDownloadView()V

    return-void
.end method

.method public onBackPressed()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/GameInformationActivityV2;->x0()V

    .line 2
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/BaseActivity;->onDestroy()V

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/d0;->e(Ljava/lang/Object;)V

    return-void
.end method

.method public onEventMainThread(Lcom/join/mgps/event/n;)V
    .locals 4
    .annotation runtime Lorg/greenrobot/eventbus/Subscribe;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/event/n;->a()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p1}, Lcom/join/mgps/event/n;->c()I

    move-result v2

    invoke-virtual {p0, v1, v2}, Lcom/join/mgps/activity/GameInformationActivityV2;->changeDownloadTaskNumber(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 5
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setPath(Ljava/lang/String;)V

    .line 7
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setSize(J)V

    .line 8
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/event/n;->c()I

    move-result p1

    const/4 v1, 0x5

    if-eq p1, v1, :cond_1

    const/16 v1, 0xb

    if-eq p1, v1, :cond_1

    const/16 v1, 0x30

    if-eq p1, v1, :cond_1

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    .line 9
    iget-object p1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz p1, :cond_2

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 10
    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 11
    :cond_2
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onEventMainThread: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 12
    invoke-direct {p0}, Lcom/join/mgps/activity/GameInformationActivityV2;->T0()V

    .line 13
    invoke-direct {p0}, Lcom/join/mgps/activity/GameInformationActivityV2;->U0()V

    return-void
.end method

.method protected onPause()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->U:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "onPause"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->U:Landroid/webkit/WebView;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/NoSuchMethodException;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->printStackTrace()V

    goto :goto_0

    :catch_2
    move-exception v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    .line 6
    :cond_0
    :goto_0
    invoke-super {p0}, Lcom/BaseActivity;->onPause()V

    return-void
.end method

.method public onResume()V
    .locals 10

    .line 1
    invoke-super {p0}, Lcom/BaseActivity;->onResume()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->z:Lcom/join/mgps/dto/GameInformationBean;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameInformationBean;->getComment_switch()I

    move-result v0

    if-ne v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->t:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/GameInformationActivityV2;->y0(Ljava/lang/String;)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->U:Landroid/webkit/WebView;

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    .line 5
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v4, "onResume"

    new-array v5, v3, [Ljava/lang/Class;

    invoke-virtual {v0, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v4, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->U:Landroid/webkit/WebView;

    invoke-virtual {v0, v4, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 6
    invoke-virtual {v0}, Ljava/lang/NoSuchMethodException;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->printStackTrace()V

    goto :goto_0

    :catch_2
    move-exception v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    .line 9
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->L:Lcom/wufan/user/service/protobuf/n0;

    if-eqz v0, :cond_2

    .line 10
    iget-object v4, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->k:Lcom/facebook/drawee/view/SimpleDraweeView;

    if-eqz v4, :cond_2

    .line 11
    iget-object v4, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->d0()Ljava/lang/String;

    move-result-object v0

    iget-object v5, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->k:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v4, v0, v5}, Lcom/join/mgps/Util/UtilsMy;->s3(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/drawee/view/SimpleDraweeView;)V

    .line 12
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->x:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    return-void

    .line 13
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    const/4 v4, 0x5

    if-eqz v0, :cond_d

    .line 14
    invoke-virtual {v0}, Lcom/join/mgps/dto/DetailResultBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 15
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    iget-object v6, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v6}, Lcom/join/mgps/dto/DetailResultBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v6

    invoke-virtual {v6}, Lcom/join/mgps/dto/ModInfoBean;->getMod_game_id()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v3

    iget-object v6, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v6}, Lcom/join/mgps/dto/DetailResultBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v6

    invoke-virtual {v6}, Lcom/join/mgps/dto/ModInfoBean;->getMain_game_id()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v1

    invoke-virtual {v0, v5}, Lp1/f;->G([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    .line 16
    :cond_4
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v5, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v5}, Lcom/join/mgps/dto/DetailResultBean;->getPackage_name()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lp1/f;->H(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_d

    .line 17
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    if-lez v5, :cond_d

    .line 18
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v5, 0x0

    :cond_5
    const/4 v6, 0x0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 19
    sget-object v8, Lcom/join/mgps/enums/Dtype;->MOD:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    .line 20
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v5

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v8}, Lcom/join/mgps/va/overmind/d;->F(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v5

    if-ne v5, v4, :cond_6

    const/4 v5, 0x1

    goto :goto_2

    :cond_6
    const/4 v5, 0x0

    goto :goto_2

    .line 21
    :cond_7
    invoke-static {p0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v6

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, p0, v8}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual {v7}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v6

    if-ne v6, v4, :cond_5

    const/4 v6, 0x1

    goto :goto_2

    :cond_8
    if-eqz v5, :cond_9

    if-eqz v6, :cond_9

    .line 22
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->x:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v2

    goto :goto_3

    :cond_9
    if-eqz v5, :cond_a

    .line 23
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/DetailResultBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v0

    if-eqz v0, :cond_d

    .line 24
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/DetailResultBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/ModInfoBean;->getMod_game_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v2

    goto :goto_3

    :cond_a
    if-eqz v6, :cond_b

    .line 25
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->x:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v2

    goto :goto_3

    .line 26
    :cond_b
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/DetailResultBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v0

    if-eqz v0, :cond_c

    .line 27
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/DetailResultBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/ModInfoBean;->getMod_game_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v2

    :cond_c
    if-nez v2, :cond_d

    .line 28
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->x:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v2

    :cond_d
    :goto_3
    if-eqz v2, :cond_e

    .line 29
    iput-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    :cond_e
    const/16 v0, 0x9

    if-eqz v2, :cond_12

    .line 30
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v1, :cond_12

    .line 31
    sget-object v1, Lcom/join/mgps/enums/Dtype;->android:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v1

    if-ne v1, v4, :cond_11

    .line 32
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/DetailResultBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v1

    if-nez v1, :cond_15

    .line 33
    invoke-static {p0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p0, v2}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 34
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_10

    .line 35
    invoke-static {p0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p0, v2}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object v1

    .line 36
    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getVer()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-virtual {v1}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getVer()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    if-ge v1, v2, :cond_f

    .line 37
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1, v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    goto/16 :goto_4

    .line 38
    :cond_f
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0, v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    goto/16 :goto_4

    .line 39
    :cond_10
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    goto/16 :goto_4

    .line 40
    :cond_11
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    goto/16 :goto_4

    :cond_12
    if-nez v2, :cond_15

    .line 41
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v1, :cond_15

    .line 42
    sget-object v1, Lcom/join/mgps/enums/Dtype;->android:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_15

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v1

    if-ne v1, v4, :cond_15

    .line 43
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/DetailResultBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v1

    if-nez v1, :cond_15

    .line 44
    invoke-static {p0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p0, v2}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 45
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_14

    .line 46
    invoke-static {p0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p0, v2}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object v1

    .line 47
    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getVer()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-virtual {v1}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getVer()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    if-ge v1, v2, :cond_13

    .line 48
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v1, v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    goto :goto_4

    .line 49
    :cond_13
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0, v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    goto :goto_4

    .line 50
    :cond_14
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0, v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setStatus(I)V

    .line 51
    :cond_15
    :goto_4
    invoke-direct {p0}, Lcom/join/mgps/activity/GameInformationActivityV2;->T0()V

    .line 52
    invoke-direct {p0}, Lcom/join/mgps/activity/GameInformationActivityV2;->U0()V

    return-void
.end method

.method p0(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/InformationCommentBeanV2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->W:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 2
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 3
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/activity/GameInformationActivityV2$m;

    .line 4
    iget-object v1, v1, Lcom/join/mgps/activity/GameInformationActivityV2$m;->b:Lcom/join/mgps/activity/GameInformationActivityV2$GType;

    sget-object v2, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->COMMENT:Lcom/join/mgps/activity/GameInformationActivityV2$GType;

    if-eq v1, v2, :cond_1

    sget-object v2, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->REPLY:Lcom/join/mgps/activity/GameInformationActivityV2$GType;

    if-eq v1, v2, :cond_1

    sget-object v2, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->TITLE:Lcom/join/mgps/activity/GameInformationActivityV2$GType;

    if-ne v1, v2, :cond_0

    .line 5
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_1
    if-eqz p1, :cond_4

    .line 6
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_4

    .line 7
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/InformationCommentBeanV2;

    .line 8
    iget-object v3, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->W:Ljava/util/List;

    new-instance v4, Lcom/join/mgps/activity/GameInformationActivityV2$m;

    sget-object v5, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->COMMENT:Lcom/join/mgps/activity/GameInformationActivityV2$GType;

    new-instance v6, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$a;

    invoke-direct {v6, v2}, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$a;-><init>(Lcom/join/mgps/dto/InformationCommentBeanV2;)V

    invoke-direct {v4, p0, v5, v6}, Lcom/join/mgps/activity/GameInformationActivityV2$m;-><init>(Lcom/join/mgps/activity/GameInformationActivityV2;Lcom/join/mgps/activity/GameInformationActivityV2$GType;Ljava/lang/Object;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    invoke-virtual {v2}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getReplyList()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 10
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_3

    .line 11
    iget-object v3, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->W:Ljava/util/List;

    new-instance v4, Lcom/join/mgps/activity/GameInformationActivityV2$m;

    sget-object v5, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->REPLY:Lcom/join/mgps/activity/GameInformationActivityV2$GType;

    new-instance v6, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;

    invoke-virtual {v2}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getCommentId()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x1

    invoke-direct {v6, v7, v2, v0, v8}, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;-><init>(Ljava/lang/String;Lcom/join/mgps/dto/InformationCommentBeanV2;IZ)V

    invoke-direct {v4, p0, v5, v6}, Lcom/join/mgps/activity/GameInformationActivityV2$m;-><init>(Lcom/join/mgps/activity/GameInformationActivityV2;Lcom/join/mgps/activity/GameInformationActivityV2$GType;Ljava/lang/Object;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    return-void
.end method

.method q0()V
    .locals 7
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v1

    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/DetailResultBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/DetailResultBean;->getGame_info_tpl_type()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/DetailResultBean;->getSp_tpl_two_position()I

    move-result v5

    const/16 v6, 0x74

    move-object v2, p0

    invoke-virtual/range {v1 .. v6}, Lcom/join/mgps/Util/IntentUtil;->goGameDetialActivity(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V

    return-void
.end method

.method r0()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/GameInformationActivityV2;->x0()V

    return-void
.end method

.method relodingimag()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationActivityV2;->showLoding()V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationActivityV2;->B0()V

    return-void
.end method

.method s0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/DetailResultBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v0

    const-string v1, "_from_type"

    const-string v2, "_from"

    const-string v3, "gameDownloadDetail"

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/service/CommonService_;->S2(Landroid/content/Context;)Lcom/join/mgps/service/CommonService_$h2;

    move-result-object v0

    iget-object v4, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/DetailResultBean;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/ModInfoBean;->getMod_game_id()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Ljava/lang/String;)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/service/CommonService_$h2;

    iget-object v3, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/DownloadPointBase;->get_from()I

    move-result v3

    invoke-virtual {v0, v2, v3}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;I)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/service/CommonService_$h2;

    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/DownloadPointBase;->get_from_type()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;I)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/service/CommonService_$h2;

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/g;->a()Landroid/content/ComponentName;

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/service/CommonService_;->S2(Landroid/content/Context;)Lcom/join/mgps/service/CommonService_$h2;

    move-result-object v0

    iget-object v4, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/DetailResultBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Ljava/lang/String;)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/service/CommonService_$h2;

    iget-object v3, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/DownloadPointBase;->get_from()I

    move-result v3

    invoke-virtual {v0, v2, v3}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;I)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/service/CommonService_$h2;

    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/DownloadPointBase;->get_from_type()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;I)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/service/CommonService_$h2;

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/g;->a()Landroid/content/ComponentName;

    :goto_0
    return-void

    :cond_1
    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 5
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v1

    .line 6
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    const/16 v2, 0x2b

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/join/mgps/dto/DetailResultBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    iget-object v3, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/DetailResultBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_3

    const/16 v1, 0x2b

    :cond_3
    const/4 v0, 0x5

    if-eqz v1, :cond_d

    const/16 v3, 0xd

    if-eq v1, v3, :cond_c

    if-eq v1, v2, :cond_d

    const/4 v2, 0x2

    if-eq v1, v2, :cond_b

    const/4 v3, 0x3

    if-eq v1, v3, :cond_a

    if-eq v1, v0, :cond_9

    const/4 v3, 0x6

    if-eq v1, v3, :cond_a

    const/4 v3, 0x7

    if-eq v1, v3, :cond_d

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_3

    .line 7
    :pswitch_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->a4(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto/16 :goto_3

    .line 8
    :pswitch_1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    const-string v1, "\u65e0\u7f51\u7edc\u8fde\u63a5"

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    .line 10
    :cond_4
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getDownloadType()I

    move-result v0

    if-eqz v0, :cond_6

    const/4 v1, 0x1

    if-eq v0, v1, :cond_6

    if-eq v0, v2, :cond_5

    goto/16 :goto_3

    .line 11
    :cond_5
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->u4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_3

    .line 12
    :cond_6
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_1

    .line 13
    :cond_7
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->t:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setExt1(Ljava/lang/String;)V

    .line 14
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->I2(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_3

    :cond_8
    :goto_1
    return-void

    .line 15
    :cond_9
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->T3(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_3

    .line 16
    :cond_a
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/php25/PDownload/d;->c(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto/16 :goto_3

    .line 17
    :cond_b
    :pswitch_2
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0}, Lcom/php25/PDownload/d;->i(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_3

    .line 18
    :cond_c
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {p0, v0}, Lcom/php25/PDownload/d;->l(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_3

    .line 19
    :cond_d
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    sget-object v2, Lcom/papa/sim/statistic/Where;->article:Lcom/papa/sim/statistic/Where;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setKeyword(Ljava/lang/String;)V

    .line 20
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->t:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setExt1(Ljava/lang/String;)V

    .line 21
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    if-eqz v1, :cond_e

    invoke-virtual {v1}, Lcom/join/mgps/dto/DetailResultBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/DetailResultBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->y0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v1

    if-lez v1, :cond_e

    .line 22
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/DetailResultBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->d4(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_2

    .line 23
    :cond_e
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->z1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/DetailResultBean;)V

    .line 24
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v1, v2}, Lcom/join/mgps/Util/UtilsMy;->o1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v1

    if-eqz v1, :cond_f

    goto :goto_2

    .line 25
    :cond_f
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/DetailResultBean;->getDown_status()I

    move-result v1

    if-ne v1, v0, :cond_10

    .line 26
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 27
    :cond_10
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/DetailResultBean;->getTp_down_url()Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/DetailResultBean;->getOther_down_switch()I

    move-result v3

    iget-object v4, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/DetailResultBean;->getCdn_down_switch()I

    move-result v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/join/mgps/Util/UtilsMy;->R0(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/util/List;II)V

    .line 28
    :goto_2
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    invoke-static {v0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->t:Ljava/lang/String;

    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    invoke-static {v2}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->B(Ljava/lang/String;Ljava/lang/String;)V

    :goto_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method setNetwork()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/UtilsMy;->w3(Landroid/content/Context;)V

    return-void
.end method

.method showLoding()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->h:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->i:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->C:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method showLodingFailed()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->i:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->h:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->C:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method showMessage(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method showToast(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method t0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/activity/GameInformationCommentActivity_;->P0(Landroid/content/Context;)Lcom/join/mgps/activity/GameInformationCommentActivity_$v;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->t:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/GameInformationCommentActivity_$v;->b(Ljava/lang/String;)Lcom/join/mgps/activity/GameInformationCommentActivity_$v;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method u0(Ljava/lang/String;Lcom/join/mgps/dto/InformationCommentBeanV2;IZ)Lcom/join/mgps/activity/GameInformationActivityV2$m;
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/GameInformationActivityV2$m;

    sget-object v1, Lcom/join/mgps/activity/GameInformationActivityV2$GType;->REPLY:Lcom/join/mgps/activity/GameInformationActivityV2$GType;

    new-instance v2, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;

    invoke-direct {v2, p1, p2, p3, p4}, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;-><init>(Ljava/lang/String;Lcom/join/mgps/dto/InformationCommentBeanV2;IZ)V

    invoke-direct {v0, p0, v1, v2}, Lcom/join/mgps/activity/GameInformationActivityV2$m;-><init>(Lcom/join/mgps/activity/GameInformationActivityV2;Lcom/join/mgps/activity/GameInformationActivityV2$GType;Ljava/lang/Object;)V

    return-object v0
.end method

.method updateDownloadView()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->M:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->N:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    .line 3
    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->s:Lcom/join/mgps/customview/CustomerDownloadView;

    invoke-virtual {v2, v0}, Lcom/join/mgps/customview/CustomerDownloadView;->setDownloadGameNum(I)V

    if-lez v1, :cond_0

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->s:Lcom/join/mgps/customview/CustomerDownloadView;

    invoke-virtual {v0}, Lcom/join/mgps/customview/CustomerDownloadView;->d()V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->s:Lcom/join/mgps/customview/CustomerDownloadView;

    invoke-virtual {v0}, Lcom/join/mgps/customview/CustomerDownloadView;->g()V

    :goto_0
    return-void
.end method

.method w0()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    .line 3
    :cond_1
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    const/16 v2, 0x2b

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/join/mgps/dto/DetailResultBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v1

    iget-object v3, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/DetailResultBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v1

    if-lez v1, :cond_2

    const/16 v0, 0x2b

    :cond_2
    const/4 v1, 0x5

    if-eqz v0, :cond_c

    const/16 v3, 0xd

    if-eq v0, v3, :cond_b

    if-eq v0, v2, :cond_c

    const/4 v2, 0x2

    if-eq v0, v2, :cond_a

    const/4 v3, 0x3

    if-eq v0, v3, :cond_9

    if-eq v0, v1, :cond_8

    const/4 v3, 0x6

    if-eq v0, v3, :cond_9

    const/4 v3, 0x7

    if-eq v0, v3, :cond_c

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_2

    .line 4
    :pswitch_0
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->a4(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto/16 :goto_2

    .line 5
    :pswitch_1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    const-string v1, "\u65e0\u7f51\u7edc\u8fde\u63a5"

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    .line 7
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getDownloadType()I

    move-result v0

    if-eqz v0, :cond_5

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    if-eq v0, v2, :cond_4

    goto/16 :goto_2

    .line 8
    :cond_4
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->u4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_2

    .line 9
    :cond_5
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_0

    .line 10
    :cond_6
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->t:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setExt1(Ljava/lang/String;)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->I2(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_2

    :cond_7
    :goto_0
    return-void

    .line 12
    :cond_8
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->T3(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_2

    .line 13
    :cond_9
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/php25/PDownload/d;->c(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto/16 :goto_2

    .line 14
    :cond_a
    :pswitch_2
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0}, Lcom/php25/PDownload/d;->i(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_2

    .line 15
    :cond_b
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {p0, v0}, Lcom/php25/PDownload/d;->l(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_2

    .line 16
    :cond_c
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    sget-object v2, Lcom/papa/sim/statistic/Where;->article:Lcom/papa/sim/statistic/Where;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setKeyword(Ljava/lang/String;)V

    .line 17
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->t:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->setExt1(Ljava/lang/String;)V

    .line 18
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Lcom/join/mgps/dto/DetailResultBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/DetailResultBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/join/mgps/Util/UtilsMy;->y0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_d

    .line 19
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/DetailResultBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->d4(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_1

    .line 20
    :cond_d
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-static {v0, v2}, Lcom/join/mgps/Util/UtilsMy;->z1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/DetailResultBean;)V

    .line 21
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v2}, Lcom/join/mgps/Util/UtilsMy;->o1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v0

    if-eqz v0, :cond_e

    goto :goto_1

    .line 22
    :cond_e
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/DetailResultBean;->getDown_status()I

    move-result v0

    if-ne v0, v1, :cond_f

    .line 23
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_1

    .line 24
    :cond_f
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->A:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/DetailResultBean;->getTp_down_url()Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/DetailResultBean;->getOther_down_switch()I

    move-result v3

    iget-object v4, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/DetailResultBean;->getCdn_down_switch()I

    move-result v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/join/mgps/Util/UtilsMy;->R0(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/util/List;II)V

    .line 25
    :goto_1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    invoke-static {v0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->t:Ljava/lang/String;

    iget-object v2, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    invoke-static {v2}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->B(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    return-void

    .line 26
    :cond_10
    :goto_3
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->H:Lcom/join/mgps/dto/DetailResultBean;

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->Z0(Landroid/content/Context;Lcom/join/mgps/dto/DetailResultBean;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method y0(Ljava/lang/String;)V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 2
    :try_start_0
    new-instance p1, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {p1}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 4
    new-instance v0, Lcom/join/mgps/dto/GameInformationCommentRequestV2;

    invoke-direct {v0}, Lcom/join/mgps/dto/GameInformationCommentRequestV2;-><init>()V

    .line 5
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->t:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/GameInformationCommentRequestV2;->setInformation_id(Ljava/lang/String;)V

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/GameInformationCommentRequestV2;->setUid(Ljava/lang/String;)V

    .line 7
    iget-object v1, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->G:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/GameInformationCommentRequestV2;->setToken(Ljava/lang/String;)V

    const/4 v1, 0x1

    .line 8
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/GameInformationCommentRequestV2;->setPage(I)V

    .line 9
    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 10
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/rpc/impl/i;->B0()Le2/i;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object p1

    invoke-interface {v0, p1}, Le2/i;->h0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;

    move-result-object p1

    invoke-interface {p1}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    move-result-object p1

    invoke-virtual {p1}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/ResponseModel;

    if-eqz p1, :cond_3

    .line 11
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v0

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_3

    .line 12
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/InformationCommentBackV2;

    if-nez p1, :cond_0

    .line 13
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationActivityV2;->G0()V

    return-void

    .line 14
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBackV2;->getComments()Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_1

    .line 15
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationActivityV2;->G0()V

    return-void

    .line 16
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 17
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/GameInformationActivityV2;->Q0(Ljava/util/List;)V

    goto :goto_0

    .line 18
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationActivityV2;->G0()V

    goto :goto_0

    .line 19
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationActivityV2;->G0()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 20
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 21
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationActivityV2;->G0()V

    goto :goto_0

    .line 22
    :cond_4
    invoke-virtual {p0}, Lcom/join/mgps/activity/GameInformationActivityV2;->G0()V

    :goto_0
    return-void
.end method

.method public z0(ILcom/join/mgps/activity/GameInformationActivityV2$ViewHolder2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GameInformationActivityV2;->W:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/GameInformationActivityV2$m;

    iget-object p1, p1, Lcom/join/mgps/activity/GameInformationActivityV2$m;->a:Ljava/lang/Object;

    check-cast p1, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$a;

    .line 2
    iget-object p1, p1, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$a;->a:Lcom/join/mgps/dto/InformationCommentBeanV2;

    .line 3
    invoke-static {p2}, Lcom/join/mgps/activity/GameInformationActivityV2$ViewHolder2;->a(Lcom/join/mgps/activity/GameInformationActivityV2$ViewHolder2;)Landroid/widget/TextView;

    move-result-object p1

    const-string p2, "\u6700\u65b0\u8bc4\u8bba"

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
