.class public Lcom/join/mgps/customview/v;
.super Lcom/join/mgps/customview/p;
.source "MyGameGameOperatePopupWindow.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/customview/v$a;
    }
.end annotation


# instance fields
.field b:Landroid/view/View;

.field c:Landroid/view/View;

.field d:Landroid/view/View;

.field e:Landroid/view/View;

.field f:Landroid/view/View;

.field g:Landroid/view/View;

.field h:Landroid/view/View;

.field i:Landroid/view/View;

.field j:Landroid/view/View;

.field k:Landroid/view/View;

.field l:Landroid/view/View;

.field private m:Ljava/lang/String;

.field n:Lcom/join/mgps/customview/v$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/p;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/customview/v;->init()V

    return-void
.end method


# virtual methods
.method public a()Lcom/join/mgps/customview/v$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/v;->n:Lcom/join/mgps/customview/v$a;

    return-object v0
.end method

.method public b(Lcom/join/mgps/customview/v$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/v;->n:Lcom/join/mgps/customview/v$a;

    return-void
.end method

.method public c(Landroid/view/View;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0, v0}, Lcom/join/mgps/customview/v;->d(Landroid/view/View;Ljava/lang/String;ZZ)V

    return-void
.end method

.method public d(Landroid/view/View;Ljava/lang/String;ZZ)V
    .locals 5

    const/16 v0, 0x50

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p0, p1, v0, v1, v1}, Lcom/join/mgps/customview/p;->showAtLocation(Landroid/view/View;III)V

    .line 2
    iput-object p2, p0, Lcom/join/mgps/customview/v;->m:Ljava/lang/String;

    const/16 p1, 0x8

    if-eqz p3, :cond_0

    .line 3
    iget-object p3, p0, Lcom/join/mgps/customview/v;->d:Landroid/view/View;

    invoke-virtual {p3, v1}, Landroid/view/View;->setVisibility(I)V

    .line 4
    iget-object p3, p0, Lcom/join/mgps/customview/v;->l:Landroid/view/View;

    invoke-virtual {p3, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p3, p0, Lcom/join/mgps/customview/v;->d:Landroid/view/View;

    invoke-virtual {p3, p1}, Landroid/view/View;->setVisibility(I)V

    .line 6
    iget-object p3, p0, Lcom/join/mgps/customview/v;->l:Landroid/view/View;

    invoke-virtual {p3, p1}, Landroid/view/View;->setVisibility(I)V

    .line 7
    :goto_0
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p3

    invoke-virtual {p3, p2}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p2

    if-nez p2, :cond_1

    .line 8
    iget-object p2, p0, Lcom/join/mgps/customview/v;->c:Landroid/view/View;

    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    .line 9
    iget-object p2, p0, Lcom/join/mgps/customview/v;->k:Landroid/view/View;

    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 10
    :cond_1
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result p3

    const/4 v0, 0x5

    if-eq p3, v0, :cond_3

    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result p3

    const/16 v0, 0x9

    if-ne p3, v0, :cond_2

    goto :goto_1

    :cond_2
    return-void

    .line 11
    :cond_3
    :goto_1
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lcom/join/mgps/Util/q1;->f(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_4

    .line 12
    iget-object p3, p0, Lcom/join/mgps/customview/v;->b:Landroid/view/View;

    invoke-virtual {p3, p1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    .line 13
    :cond_4
    iget-object p3, p0, Lcom/join/mgps/customview/v;->b:Landroid/view/View;

    invoke-virtual {p3, v1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    :goto_2
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p3

    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p3

    const-string v0, ".apk"

    const/4 v2, 0x1

    if-eqz p3, :cond_5

    .line 15
    invoke-virtual {p3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_7

    :cond_5
    invoke-virtual {p3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getRomType()Ljava/lang/String;

    move-result-object v3

    const-string v4, "androidobb"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    invoke-virtual {p3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getRomType()Ljava/lang/String;

    move-result-object v3

    const-string v4, "46"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_3

    .line 16
    :cond_6
    iget-object p3, p0, Lcom/join/mgps/customview/v;->g:Landroid/view/View;

    invoke-virtual {p3, v1}, Landroid/view/View;->setVisibility(I)V

    .line 17
    iget-object p3, p0, Lcom/join/mgps/customview/v;->f:Landroid/view/View;

    invoke-virtual {p3, v1}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_4

    .line 18
    :cond_7
    :goto_3
    invoke-virtual {p3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getUrl()Ljava/lang/String;

    move-result-object v3

    const-string v4, "/"

    .line 19
    invoke-virtual {v3, v4}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v4

    add-int/2addr v4, v2

    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, ""

    invoke-virtual {v3, v0, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    .line 21
    invoke-virtual {p3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object p3

    .line 22
    invoke-static {p3}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/join/mgps/customview/p;->mContext:Landroid/content/Context;

    invoke-static {v0, p3}, Lcom/join/mgps/Util/g;->e(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_8

    .line 23
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTips()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_8

    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTips()Ljava/lang/String;

    move-result-object p3

    const-string v0, "\u7f51\u6e38"

    invoke-virtual {p3, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_8

    .line 24
    iget-object p3, p0, Lcom/join/mgps/customview/v;->g:Landroid/view/View;

    invoke-virtual {p3, v1}, Landroid/view/View;->setVisibility(I)V

    .line 25
    iget-object p3, p0, Lcom/join/mgps/customview/v;->f:Landroid/view/View;

    invoke-virtual {p3, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_4

    .line 26
    :cond_8
    invoke-static {p2}, Lcom/join/android/app/common/utils/APKUtils;->G(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result p3

    if-eqz p3, :cond_9

    iget-object p3, p0, Lcom/join/mgps/customview/p;->mContext:Landroid/content/Context;

    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getRef_crc_sign_id()Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/join/mgps/Util/w1;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_a

    .line 27
    :cond_9
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->isMiniGame()Z

    move-result p3

    if-eqz p3, :cond_b

    .line 28
    :cond_a
    iget-object p3, p0, Lcom/join/mgps/customview/v;->g:Landroid/view/View;

    invoke-virtual {p3, v1}, Landroid/view/View;->setVisibility(I)V

    .line 29
    iget-object p3, p0, Lcom/join/mgps/customview/v;->f:Landroid/view/View;

    invoke-virtual {p3, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_4

    .line 30
    :cond_b
    iget-object p3, p0, Lcom/join/mgps/customview/v;->g:Landroid/view/View;

    invoke-virtual {p3, p1}, Landroid/view/View;->setVisibility(I)V

    .line 31
    iget-object p3, p0, Lcom/join/mgps/customview/v;->f:Landroid/view/View;

    invoke-virtual {p3, p1}, Landroid/view/View;->setVisibility(I)V

    :goto_4
    if-eqz p4, :cond_c

    .line 32
    iget-object p3, p0, Lcom/join/mgps/customview/v;->g:Landroid/view/View;

    invoke-virtual {p3}, Landroid/view/View;->getVisibility()I

    move-result p3

    if-nez p3, :cond_c

    .line 33
    iget-object p3, p0, Lcom/join/mgps/customview/v;->g:Landroid/view/View;

    invoke-virtual {p3, p1}, Landroid/view/View;->setVisibility(I)V

    .line 34
    iget-object p3, p0, Lcom/join/mgps/customview/v;->f:Landroid/view/View;

    invoke-virtual {p3, p1}, Landroid/view/View;->setVisibility(I)V

    .line 35
    :cond_c
    invoke-static {p2}, Lcom/join/android/app/common/utils/APKUtils;->L(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result p3

    if-eqz p3, :cond_13

    .line 36
    iget-object p3, p0, Lcom/join/mgps/customview/p;->mContext:Landroid/content/Context;

    invoke-static {p3}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object p3

    iget-object p4, p0, Lcom/join/mgps/customview/p;->mContext:Landroid/content/Context;

    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v0

    sget-object v3, Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;->REAL:Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;

    invoke-virtual {p3, p4, v0, v3}, Lcom/join/android/app/common/utils/APKUtils;->e(Landroid/content/Context;Ljava/lang/String;Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;)Z

    move-result p3

    if-nez p3, :cond_12

    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCost_type()I

    move-result p3

    if-ne p3, v2, :cond_d

    goto :goto_7

    .line 37
    :cond_d
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getRomType()Ljava/lang/String;

    move-result-object p3

    sget-object p4, Lcom/join/mgps/enums/Dtype;->androidobb:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {p4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_f

    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getRomType()Ljava/lang/String;

    move-result-object p3

    sget-object p4, Lcom/join/mgps/enums/Dtype;->androiddata:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {p4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_f

    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getRomType()Ljava/lang/String;

    move-result-object p2

    sget-object p3, Lcom/join/mgps/enums/Dtype;->androidobbdata:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {p3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_e

    goto :goto_5

    :cond_e
    const/4 v2, 0x0

    .line 38
    :cond_f
    :goto_5
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x1e

    if-lt p2, p3, :cond_11

    if-nez v2, :cond_10

    goto :goto_6

    .line 39
    :cond_10
    iget-object p2, p0, Lcom/join/mgps/customview/v;->i:Landroid/view/View;

    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    .line 40
    iget-object p2, p0, Lcom/join/mgps/customview/v;->h:Landroid/view/View;

    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_8

    .line 41
    :cond_11
    :goto_6
    iget-object p1, p0, Lcom/join/mgps/customview/v;->i:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 42
    iget-object p1, p0, Lcom/join/mgps/customview/v;->h:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_8

    .line 43
    :cond_12
    :goto_7
    iget-object p2, p0, Lcom/join/mgps/customview/v;->i:Landroid/view/View;

    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    .line 44
    iget-object p2, p0, Lcom/join/mgps/customview/v;->h:Landroid/view/View;

    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    .line 45
    :goto_8
    iget-object p1, p0, Lcom/join/mgps/customview/v;->h:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_13
    return-void
.end method

.method init()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/p;->mContext:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c06ff

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/customview/p;->parentView:Landroid/view/View;

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    const/4 v0, -0x1

    .line 3
    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setWidth(I)V

    const/4 v0, -0x2

    .line 4
    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/customview/p;->parentView:Landroid/view/View;

    const v1, 0x7f090403

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/customview/v;->b:Landroid/view/View;

    .line 6
    iget-object v0, p0, Lcom/join/mgps/customview/p;->parentView:Landroid/view/View;

    const v1, 0x7f0903ee

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/customview/v;->c:Landroid/view/View;

    .line 7
    iget-object v0, p0, Lcom/join/mgps/customview/p;->parentView:Landroid/view/View;

    const v1, 0x7f0903f0

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/customview/v;->d:Landroid/view/View;

    .line 8
    iget-object v0, p0, Lcom/join/mgps/customview/p;->parentView:Landroid/view/View;

    const v1, 0x7f090290

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/customview/v;->e:Landroid/view/View;

    .line 9
    iget-object v0, p0, Lcom/join/mgps/customview/p;->parentView:Landroid/view/View;

    const v1, 0x7f0900a7

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/customview/v;->g:Landroid/view/View;

    .line 10
    iget-object v0, p0, Lcom/join/mgps/customview/p;->parentView:Landroid/view/View;

    const v1, 0x7f090c6b

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/customview/v;->f:Landroid/view/View;

    .line 11
    iget-object v0, p0, Lcom/join/mgps/customview/p;->parentView:Landroid/view/View;

    const v1, 0x7f091684

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/customview/v;->h:Landroid/view/View;

    .line 12
    iget-object v0, p0, Lcom/join/mgps/customview/p;->parentView:Landroid/view/View;

    const v1, 0x7f091776

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/customview/v;->i:Landroid/view/View;

    .line 13
    iget-object v0, p0, Lcom/join/mgps/customview/p;->parentView:Landroid/view/View;

    const v1, 0x7f090c72

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/customview/v;->j:Landroid/view/View;

    .line 14
    iget-object v0, p0, Lcom/join/mgps/customview/p;->parentView:Landroid/view/View;

    const v1, 0x7f090c71

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/customview/v;->k:Landroid/view/View;

    .line 15
    iget-object v0, p0, Lcom/join/mgps/customview/p;->parentView:Landroid/view/View;

    const v1, 0x7f090c70

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/customview/v;->l:Landroid/view/View;

    .line 16
    iget-object v0, p0, Lcom/join/mgps/customview/v;->b:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    iget-object v0, p0, Lcom/join/mgps/customview/v;->c:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 18
    iget-object v0, p0, Lcom/join/mgps/customview/v;->d:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    iget-object v0, p0, Lcom/join/mgps/customview/v;->e:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    iget-object v0, p0, Lcom/join/mgps/customview/v;->g:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f090403

    if-ne p1, v0, :cond_1

    .line 2
    iget-object p1, p0, Lcom/join/mgps/customview/v;->n:Lcom/join/mgps/customview/v$a;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/join/mgps/customview/v;->m:Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/join/mgps/customview/v$a;->a(Ljava/lang/String;)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/customview/p;->dismiss()V

    goto :goto_0

    :cond_1
    const v0, 0x7f0903ee

    if-ne p1, v0, :cond_3

    .line 4
    iget-object p1, p0, Lcom/join/mgps/customview/v;->n:Lcom/join/mgps/customview/v$a;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/join/mgps/customview/v;->m:Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/join/mgps/customview/v$a;->c(Ljava/lang/String;)V

    .line 5
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/customview/p;->dismiss()V

    goto :goto_0

    :cond_3
    const v0, 0x7f0903f0

    if-ne p1, v0, :cond_5

    .line 6
    iget-object p1, p0, Lcom/join/mgps/customview/v;->n:Lcom/join/mgps/customview/v$a;

    if-eqz p1, :cond_4

    iget-object v0, p0, Lcom/join/mgps/customview/v;->m:Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/join/mgps/customview/v$a;->e(Ljava/lang/String;)V

    .line 7
    :cond_4
    invoke-virtual {p0}, Lcom/join/mgps/customview/p;->dismiss()V

    goto :goto_0

    :cond_5
    const v0, 0x7f090290

    if-ne p1, v0, :cond_6

    .line 8
    invoke-virtual {p0}, Lcom/join/mgps/customview/p;->dismiss()V

    goto :goto_0

    :cond_6
    const v0, 0x7f0900a7

    if-ne p1, v0, :cond_8

    .line 9
    iget-object p1, p0, Lcom/join/mgps/customview/v;->n:Lcom/join/mgps/customview/v$a;

    if-eqz p1, :cond_7

    iget-object v0, p0, Lcom/join/mgps/customview/v;->m:Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/join/mgps/customview/v$a;->b(Ljava/lang/String;)V

    .line 10
    :cond_7
    invoke-virtual {p0}, Lcom/join/mgps/customview/p;->dismiss()V

    goto :goto_0

    :cond_8
    const v0, 0x7f091684

    if-ne p1, v0, :cond_9

    .line 11
    invoke-virtual {p0}, Lcom/join/mgps/customview/p;->dismiss()V

    .line 12
    iget-object p1, p0, Lcom/join/mgps/customview/v;->n:Lcom/join/mgps/customview/v$a;

    if-eqz p1, :cond_9

    iget-object v0, p0, Lcom/join/mgps/customview/v;->m:Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/join/mgps/customview/v$a;->d(Ljava/lang/String;)V

    :cond_9
    :goto_0
    return-void
.end method
