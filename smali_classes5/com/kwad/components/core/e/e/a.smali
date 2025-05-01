.class public final Lcom/kwad/components/core/e/e/a;
.super Lcom/kwad/sdk/widget/KSFrameLayout;
.source "SourceFile"


# instance fields
.field private final LP:Landroid/app/DialogFragment;

.field private final LQ:Landroid/view/View;

.field private LR:Lcom/kwad/components/core/e/d/a$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/app/DialogFragment;Lcom/kwad/components/core/e/d/a$a;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/sdk/widget/KSFrameLayout;-><init>(Landroid/content/Context;)V

    .line 2
    iput-object p2, p0, Lcom/kwad/components/core/e/e/a;->LP:Landroid/app/DialogFragment;

    .line 3
    iput-object p3, p0, Lcom/kwad/components/core/e/e/a;->LR:Lcom/kwad/components/core/e/d/a$a;

    .line 4
    sget p2, Lcom/kwad/sdk/R$layout;->ksad_seconed_confirm_dialog_layout:I

    invoke-static {p1, p2, p0}, Lcom/kwad/sdk/n/l;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 5
    sget p1, Lcom/kwad/sdk/R$id;->ksad_second_confirm_root_view:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/core/e/e/a;->LQ:Landroid/view/View;

    return-void
.end method

.method private static af()Lcom/kwad/sdk/mvp/Presenter;
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/sdk/mvp/Presenter;

    invoke-direct {v0}, Lcom/kwad/sdk/mvp/Presenter;-><init>()V

    .line 2
    new-instance v1, Lcom/kwad/components/core/e/e/d;

    invoke-direct {v1}, Lcom/kwad/components/core/e/e/d;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    return-object v0
.end method

.method private oP()Lcom/kwad/components/core/e/e/c;
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/components/core/e/e/c;

    invoke-direct {v0}, Lcom/kwad/components/core/e/e/c;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/kwad/components/core/e/e/a;->LP:Landroid/app/DialogFragment;

    iput-object v1, v0, Lcom/kwad/components/core/e/e/c;->LP:Landroid/app/DialogFragment;

    .line 3
    iget-object v1, p0, Lcom/kwad/components/core/e/e/a;->LR:Lcom/kwad/components/core/e/d/a$a;

    iput-object v1, v0, Lcom/kwad/components/core/e/e/c;->LR:Lcom/kwad/components/core/e/d/a$a;

    return-object v0
.end method


# virtual methods
.method public final ac()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/widget/KSFrameLayout;->ac()V

    .line 2
    invoke-static {}, Lcom/kwad/components/core/e/e/a;->af()Lcom/kwad/sdk/mvp/Presenter;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/kwad/components/core/e/e/a;->LQ:Landroid/view/View;

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->G(Landroid/view/View;)V

    .line 4
    invoke-direct {p0}, Lcom/kwad/components/core/e/e/a;->oP()Lcom/kwad/components/core/e/e/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->k(Ljava/lang/Object;)V

    return-void
.end method
