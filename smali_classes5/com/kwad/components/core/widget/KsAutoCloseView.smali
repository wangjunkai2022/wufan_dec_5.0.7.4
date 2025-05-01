.class public Lcom/kwad/components/core/widget/KsAutoCloseView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/widget/KsAutoCloseView$a;
    }
.end annotation


# static fields
.field private static Bf:Ljava/lang/String; = "%s\u79d2\u540e\u81ea\u52a8\u5173\u95ed"


# instance fields
.field private acR:Landroid/widget/TextView;

.field private acS:Landroid/widget/ImageView;

.field private acT:Lcom/kwad/components/core/widget/KsAutoCloseView$a;

.field private acU:Z

.field private acV:Z

.field private countDown:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/16 v0, 0xa

    .line 2
    iput v0, p0, Lcom/kwad/components/core/widget/KsAutoCloseView;->countDown:I

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/kwad/components/core/widget/KsAutoCloseView;->acU:Z

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/kwad/components/core/widget/KsAutoCloseView;->acV:Z

    .line 5
    invoke-direct {p0, p1}, Lcom/kwad/components/core/widget/KsAutoCloseView;->P(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 6
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 p2, 0xa

    .line 7
    iput p2, p0, Lcom/kwad/components/core/widget/KsAutoCloseView;->countDown:I

    const/4 p2, 0x1

    .line 8
    iput-boolean p2, p0, Lcom/kwad/components/core/widget/KsAutoCloseView;->acU:Z

    const/4 p2, 0x0

    .line 9
    iput-boolean p2, p0, Lcom/kwad/components/core/widget/KsAutoCloseView;->acV:Z

    .line 10
    invoke-direct {p0, p1}, Lcom/kwad/components/core/widget/KsAutoCloseView;->P(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 11
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 p2, 0xa

    .line 12
    iput p2, p0, Lcom/kwad/components/core/widget/KsAutoCloseView;->countDown:I

    const/4 p2, 0x1

    .line 13
    iput-boolean p2, p0, Lcom/kwad/components/core/widget/KsAutoCloseView;->acU:Z

    const/4 p2, 0x0

    .line 14
    iput-boolean p2, p0, Lcom/kwad/components/core/widget/KsAutoCloseView;->acV:Z

    .line 15
    invoke-direct {p0, p1}, Lcom/kwad/components/core/widget/KsAutoCloseView;->P(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 16
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const/16 p2, 0xa

    .line 17
    iput p2, p0, Lcom/kwad/components/core/widget/KsAutoCloseView;->countDown:I

    const/4 p2, 0x1

    .line 18
    iput-boolean p2, p0, Lcom/kwad/components/core/widget/KsAutoCloseView;->acU:Z

    const/4 p2, 0x0

    .line 19
    iput-boolean p2, p0, Lcom/kwad/components/core/widget/KsAutoCloseView;->acV:Z

    .line 20
    invoke-direct {p0, p1}, Lcom/kwad/components/core/widget/KsAutoCloseView;->P(Landroid/content/Context;)V

    return-void
.end method

.method private P(Landroid/content/Context;)V
    .locals 1

    .line 1
    sget v0, Lcom/kwad/sdk/R$layout;->ksad_auto_close:I

    invoke-static {p1, v0, p0}, Lcom/kwad/sdk/n/l;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 2
    sget p1, Lcom/kwad/sdk/R$id;->ksad_auto_close_text:I

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/kwad/components/core/widget/KsAutoCloseView;->acR:Landroid/widget/TextView;

    .line 3
    sget p1, Lcom/kwad/sdk/R$id;->ksad_auto_close_btn:I

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/kwad/components/core/widget/KsAutoCloseView;->acS:Landroid/widget/ImageView;

    .line 4
    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/widget/KsAutoCloseView;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/components/core/widget/KsAutoCloseView;->x(I)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/widget/KsAutoCloseView;)Z
    .locals 0

    .line 2
    iget-boolean p0, p0, Lcom/kwad/components/core/widget/KsAutoCloseView;->acU:Z

    return p0
.end method

.method static synthetic b(Lcom/kwad/components/core/widget/KsAutoCloseView;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/core/widget/KsAutoCloseView;->acV:Z

    return p0
.end method

.method static synthetic c(Lcom/kwad/components/core/widget/KsAutoCloseView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/components/core/widget/KsAutoCloseView;->countDown:I

    return p0
.end method

.method static synthetic d(Lcom/kwad/components/core/widget/KsAutoCloseView;)Lcom/kwad/components/core/widget/KsAutoCloseView$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/KsAutoCloseView;->acT:Lcom/kwad/components/core/widget/KsAutoCloseView$a;

    return-object p0
.end method

.method static synthetic e(Lcom/kwad/components/core/widget/KsAutoCloseView;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/kwad/components/core/widget/KsAutoCloseView;->countDown:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lcom/kwad/components/core/widget/KsAutoCloseView;->countDown:I

    return v0
.end method

.method private x(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/widget/KsAutoCloseView;->acR:Landroid/widget/TextView;

    sget-object v1, Lcom/kwad/components/core/widget/KsAutoCloseView;->Bf:Ljava/lang/String;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public final U(I)V
    .locals 0

    if-gtz p1, :cond_0

    return-void

    .line 1
    :cond_0
    iput p1, p0, Lcom/kwad/components/core/widget/KsAutoCloseView;->countDown:I

    .line 2
    new-instance p1, Lcom/kwad/components/core/widget/KsAutoCloseView$1;

    invoke-direct {p1, p0}, Lcom/kwad/components/core/widget/KsAutoCloseView$1;-><init>(Lcom/kwad/components/core/widget/KsAutoCloseView;)V

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final aY(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/widget/KsAutoCloseView;->acU:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    .line 2
    :goto_0
    iget-object v0, p0, Lcom/kwad/components/core/widget/KsAutoCloseView;->acR:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/widget/KsAutoCloseView;->acT:Lcom/kwad/components/core/widget/KsAutoCloseView$a;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/widget/KsAutoCloseView;->acS:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 3
    iget-object p1, p0, Lcom/kwad/components/core/widget/KsAutoCloseView;->acT:Lcom/kwad/components/core/widget/KsAutoCloseView$a;

    invoke-interface {p1}, Lcom/kwad/components/core/widget/KsAutoCloseView$a;->dg()V

    :cond_1
    return-void
.end method

.method public setCountDownPaused(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/widget/KsAutoCloseView;->acV:Z

    return-void
.end method

.method public setViewListener(Lcom/kwad/components/core/widget/KsAutoCloseView$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/widget/KsAutoCloseView;->acT:Lcom/kwad/components/core/widget/KsAutoCloseView$a;

    return-void
.end method
