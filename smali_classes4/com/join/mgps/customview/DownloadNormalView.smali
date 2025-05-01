.class public Lcom/join/mgps/customview/DownloadNormalView;
.super Landroid/widget/FrameLayout;
.source "DownloadNormalView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private A:Ljava/lang/String;

.field private B:Ljava/lang/String;

.field private C:Ljava/lang/String;

.field private D:Lw1/e;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:I

.field private l:I

.field private m:I

.field private n:I

.field private o:I

.field private p:I

.field private q:F

.field private r:F

.field private s:Ljava/lang/String;

.field private t:Ljava/lang/String;

.field private u:Ljava/lang/String;

.field private v:Ljava/lang/String;

.field private w:Ljava/lang/String;

.field private x:Ljava/lang/String;

.field private y:Ljava/lang/String;

.field private z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/join/mgps/customview/DownloadNormalView;->f(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/customview/DownloadNormalView;->f(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 5
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/customview/DownloadNormalView;->f(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private d(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    if-eqz p2, :cond_0

    .line 1
    sget-object v0, Lcom/join/android/app/mgsim/wufun/R$styleable;->DownloadNormalView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x3

    const v0, 0x7f080cf0

    .line 2
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->d:I

    const/4 p2, 0x1

    const v1, 0x7f080ce3

    .line 3
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->e:I

    const/4 p2, 0x2

    .line 4
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->f:I

    const/4 p2, 0x0

    .line 5
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->g:I

    const/4 p2, 0x4

    const v2, 0x7f080d7a

    .line 6
    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->h:I

    const/4 p2, 0x5

    .line 7
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->i:I

    const/4 p2, 0x6

    .line 8
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->j:I

    const/16 p2, 0xa

    .line 9
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->k:I

    const/4 p2, 0x7

    .line 10
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->l:I

    const/16 p2, 0x8

    .line 11
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->m:I

    const/16 p2, 0x9

    .line 12
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->n:I

    .line 13
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const/16 v0, 0xd

    const v1, 0x7f060412

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p2

    iput p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->o:I

    .line 14
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const/16 v0, 0xb

    const v1, 0x7f060349

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p2

    iput p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->p:I

    .line 15
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const/16 v0, 0x13

    const v1, 0x7f0711dd

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p2

    iput p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->q:F

    .line 16
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const/16 v0, 0xc

    const v1, 0x7f07114a

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    int-to-float p2, p2

    iput p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->r:F

    .line 17
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const/16 v0, 0x11

    const v1, 0x7f1000e2

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->s:Ljava/lang/String;

    .line 18
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const/16 v0, 0xf

    const v1, 0x7f1000e0

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->t:Ljava/lang/String;

    .line 19
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const/16 v0, 0x10

    const v1, 0x7f1000e1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->u:Ljava/lang/String;

    .line 20
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const/16 v0, 0xe

    const v1, 0x7f1000df

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->v:Ljava/lang/String;

    .line 21
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const/16 v0, 0x12

    const v1, 0x7f1000e3

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->w:Ljava/lang/String;

    .line 22
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const/16 v0, 0x14

    const v1, 0x7f1000e6

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->x:Ljava/lang/String;

    .line 23
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const/16 v0, 0x15

    const v1, 0x7f1000e7

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->y:Ljava/lang/String;

    .line 24
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const/16 v0, 0x19

    const v1, 0x7f1000ec

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->z:Ljava/lang/String;

    .line 25
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const/16 v0, 0x16

    const v1, 0x7f1000e8

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->A:Ljava/lang/String;

    .line 26
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const/16 v0, 0x17

    const v1, 0x7f1000e9

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->B:Ljava/lang/String;

    .line 27
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const/16 v0, 0x18

    const v1, 0x7f1000ea

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->C:Ljava/lang/String;

    .line 28
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_0

    .line 29
    :cond_0
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/DownloadNormalView;->e(Landroid/content/Context;)V

    :goto_0
    return-void
.end method

.method private e(Landroid/content/Context;)V
    .locals 2

    const v0, 0x7f080cf0

    .line 1
    iput v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->d:I

    const v1, 0x7f080ce3

    .line 2
    iput v1, p0, Lcom/join/mgps/customview/DownloadNormalView;->e:I

    .line 3
    iput v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->f:I

    .line 4
    iput v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->g:I

    .line 5
    iput v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->h:I

    .line 6
    iput v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->i:I

    .line 7
    iput v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->j:I

    .line 8
    iput v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->k:I

    .line 9
    iput v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->l:I

    .line 10
    iput v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->m:I

    .line 11
    iput v1, p0, Lcom/join/mgps/customview/DownloadNormalView;->n:I

    .line 12
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f060412

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->o:I

    .line 13
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f060349

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->p:I

    .line 14
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0711dd

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    int-to-float v0, v0

    iput v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->q:F

    .line 15
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    int-to-float v0, v0

    iput v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->r:F

    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f1000e2

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->s:Ljava/lang/String;

    .line 17
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f1000e0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->t:Ljava/lang/String;

    .line 18
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f1000e1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->u:Ljava/lang/String;

    .line 19
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f1000df

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->v:Ljava/lang/String;

    .line 20
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f1000e3

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->w:Ljava/lang/String;

    .line 21
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f1000e6

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->x:Ljava/lang/String;

    .line 22
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f1000e7

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->y:Ljava/lang/String;

    .line 23
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f1000ec

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->z:Ljava/lang/String;

    .line 24
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f1000e8

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->A:Ljava/lang/String;

    .line 25
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f1000e9

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->B:Ljava/lang/String;

    .line 26
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f1000ea

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->C:Ljava/lang/String;

    return-void
.end method

.method private f(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/customview/DownloadNormalView;->d(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const p2, 0x7f0c07ac

    invoke-virtual {p1, p2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    const p1, 0x7f091696

    .line 3
    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->b:Landroid/widget/TextView;

    const p1, 0x7f09168e

    .line 4
    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->c:Landroid/widget/TextView;

    .line 5
    invoke-virtual {p0, p0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->b:Landroid/widget/TextView;

    iget p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->o:I

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 7
    iget-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->b:Landroid/widget/TextView;

    iget p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->q:F

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    return-void
.end method

.method private g(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz p2, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->c:Landroid/widget/TextView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->c:Landroid/widget/TextView;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public b(I)V
    .locals 1

    const-string v0, ""

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/customview/DownloadNormalView;->c(ILjava/lang/String;)V

    return-void
.end method

.method public c(ILjava/lang/String;)V
    .locals 1

    const/16 v0, 0x9

    if-ne p1, v0, :cond_0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->b:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->C:Ljava/lang/String;

    invoke-direct {p0, p1, p2, v0}, Lcom/join/mgps/customview/DownloadNormalView;->g(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->b:Landroid/widget/TextView;

    iget p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->n:I

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto/16 :goto_2

    :cond_0
    const/16 v0, 0xc

    if-ne p1, v0, :cond_1

    .line 3
    iget-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->b:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->B:Ljava/lang/String;

    invoke-direct {p0, p1, p2, v0}, Lcom/join/mgps/customview/DownloadNormalView;->g(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->b:Landroid/widget/TextView;

    iget p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->m:I

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto/16 :goto_2

    :cond_1
    const/16 v0, 0xd

    if-ne p1, v0, :cond_2

    .line 5
    iget-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->b:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->A:Ljava/lang/String;

    invoke-direct {p0, p1, p2, v0}, Lcom/join/mgps/customview/DownloadNormalView;->g(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->b:Landroid/widget/TextView;

    iget p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->l:I

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto/16 :goto_2

    :cond_2
    const/16 v0, 0xb

    if-ne p1, v0, :cond_3

    .line 7
    iget-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->b:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->t:Ljava/lang/String;

    invoke-direct {p0, p1, p2, v0}, Lcom/join/mgps/customview/DownloadNormalView;->g(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    iget-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->b:Landroid/widget/TextView;

    iget p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->e:I

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto/16 :goto_2

    :cond_3
    const/16 v0, 0x30

    if-ne p1, v0, :cond_4

    .line 9
    iget-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->b:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->u:Ljava/lang/String;

    invoke-direct {p0, p1, p2, v0}, Lcom/join/mgps/customview/DownloadNormalView;->g(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    iget-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->b:Landroid/widget/TextView;

    iget p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->f:I

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto/16 :goto_2

    :cond_4
    const/4 v0, 0x5

    if-eq p1, v0, :cond_f

    const/16 v0, 0x2a

    if-ne p1, v0, :cond_5

    goto/16 :goto_1

    :cond_5
    const/4 v0, 0x2

    if-ne p1, v0, :cond_6

    .line 11
    iget-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->b:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->y:Ljava/lang/String;

    invoke-direct {p0, p1, p2, v0}, Lcom/join/mgps/customview/DownloadNormalView;->g(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    iget-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->b:Landroid/widget/TextView;

    iget p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->d:I

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto/16 :goto_2

    :cond_6
    const/4 v0, 0x3

    if-eq p1, v0, :cond_e

    const/4 v0, 0x6

    if-eq p1, v0, :cond_e

    const/16 v0, 0x1b

    if-ne p1, v0, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v0, 0xa

    if-ne p1, v0, :cond_8

    .line 13
    iget-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->b:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->z:Ljava/lang/String;

    invoke-direct {p0, p1, p2, v0}, Lcom/join/mgps/customview/DownloadNormalView;->g(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    iget-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->b:Landroid/widget/TextView;

    iget p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->k:I

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto/16 :goto_2

    :cond_8
    const/4 v0, 0x1

    if-ne p1, v0, :cond_9

    goto/16 :goto_2

    :cond_9
    const/16 v0, 0x2b

    if-ne p1, v0, :cond_a

    .line 15
    iget-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->b:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->v:Ljava/lang/String;

    invoke-direct {p0, p1, p2, v0}, Lcom/join/mgps/customview/DownloadNormalView;->g(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    iget-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->b:Landroid/widget/TextView;

    iget p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->d:I

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto :goto_2

    :cond_a
    const/16 v0, 0x27

    if-ne p1, v0, :cond_b

    .line 17
    iget-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->b:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->v:Ljava/lang/String;

    invoke-direct {p0, p1, p2, v0}, Lcom/join/mgps/customview/DownloadNormalView;->g(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    iget-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->b:Landroid/widget/TextView;

    iget p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->d:I

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto :goto_2

    :cond_b
    const/16 v0, 0x28

    if-ne p1, v0, :cond_c

    .line 19
    iget-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->b:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->v:Ljava/lang/String;

    invoke-direct {p0, p1, p2, v0}, Lcom/join/mgps/customview/DownloadNormalView;->g(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    iget-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->b:Landroid/widget/TextView;

    iget p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->d:I

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto :goto_2

    :cond_c
    const/16 v0, 0x29

    if-ne p1, v0, :cond_d

    .line 21
    iget-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->b:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->v:Ljava/lang/String;

    invoke-direct {p0, p1, p2, v0}, Lcom/join/mgps/customview/DownloadNormalView;->g(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    iget-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->b:Landroid/widget/TextView;

    iget p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->d:I

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    const/4 p1, 0x0

    .line 23
    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setEnabled(Z)V

    goto :goto_2

    .line 24
    :cond_d
    iget-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->b:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->v:Ljava/lang/String;

    invoke-direct {p0, p1, p2, v0}, Lcom/join/mgps/customview/DownloadNormalView;->g(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    iget-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->b:Landroid/widget/TextView;

    iget p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->d:I

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto :goto_2

    .line 26
    :cond_e
    :goto_0
    iget-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->b:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->x:Ljava/lang/String;

    invoke-direct {p0, p1, p2, v0}, Lcom/join/mgps/customview/DownloadNormalView;->g(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    iget-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->b:Landroid/widget/TextView;

    iget p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->j:I

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto :goto_2

    .line 28
    :cond_f
    :goto_1
    iget-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->b:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->w:Ljava/lang/String;

    invoke-direct {p0, p1, p2, v0}, Lcom/join/mgps/customview/DownloadNormalView;->g(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    iget-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->b:Landroid/widget/TextView;

    iget p2, p0, Lcom/join/mgps/customview/DownloadNormalView;->h:I

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    :goto_2
    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->D:Lw1/e;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0, p0}, Lw1/e;->c(Lcom/join/mgps/customview/DownloadNormalView;)V

    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    if-ne p1, p0, :cond_0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->D:Lw1/e;

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1, p0}, Lw1/e;->a(Lcom/join/mgps/customview/DownloadNormalView;)V

    :cond_0
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->D:Lw1/e;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Lw1/e;->b()V

    :cond_0
    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/join/mgps/customview/DownloadNormalView;->D:Lw1/e;

    return-void
.end method

.method public setBackgroundGet(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->g:I

    return-void
.end method

.method public setBackgroundInstall(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->e:I

    return-void
.end method

.method public setBackgroundInstalling(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->f:I

    return-void
.end method

.method public setBackgroundNormal(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->d:I

    return-void
.end method

.method public setBackgroundOpen(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->h:I

    return-void
.end method

.method public setBackgroundStart(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->i:I

    return-void
.end method

.method public setBackgroundStop(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->j:I

    return-void
.end method

.method public setBackgroundUnzip(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->l:I

    return-void
.end method

.method public setBackgroundUnzipping(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->m:I

    return-void
.end method

.method public setBackgroundUpdate(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->n:I

    return-void
.end method

.method public setBackgroundWait(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->k:I

    return-void
.end method

.method public setDownloadNormalCallback(Lw1/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->D:Lw1/e;

    return-void
.end method

.method public setSubTextColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->p:I

    return-void
.end method

.method public setSubTextSize(I)V
    .locals 0

    int-to-float p1, p1

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->r:F

    return-void
.end method

.method public setTextColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->o:I

    return-void
.end method

.method public setTextGet(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->v:Ljava/lang/String;

    return-void
.end method

.method public setTextInstall(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->t:Ljava/lang/String;

    return-void
.end method

.method public setTextInstalling(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->u:Ljava/lang/String;

    return-void
.end method

.method public setTextNormal(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->s:Ljava/lang/String;

    return-void
.end method

.method public setTextOpen(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->w:Ljava/lang/String;

    return-void
.end method

.method public setTextSize(I)V
    .locals 0

    int-to-float p1, p1

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->q:F

    return-void
.end method

.method public setTextStart(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->x:Ljava/lang/String;

    return-void
.end method

.method public setTextStop(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->y:Ljava/lang/String;

    return-void
.end method

.method public setTextUnzip(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->A:Ljava/lang/String;

    return-void
.end method

.method public setTextUnzipping(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->B:Ljava/lang/String;

    return-void
.end method

.method public setTextUpdate(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->C:Ljava/lang/String;

    return-void
.end method

.method public setTextWait(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/DownloadNormalView;->z:Ljava/lang/String;

    return-void
.end method
