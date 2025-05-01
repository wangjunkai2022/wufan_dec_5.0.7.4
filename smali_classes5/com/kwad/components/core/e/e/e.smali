.class public final Lcom/kwad/components/core/e/e/e;
.super Lcom/kwad/components/core/proxy/g;
.source "SourceFile"


# instance fields
.field private LR:Lcom/kwad/components/core/e/d/a$a;

.field private mActivity:Landroid/app/Activity;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/proxy/g;-><init>()V

    return-void
.end method

.method public static a(Landroid/app/Activity;Lcom/kwad/components/core/e/d/a$a;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/core/e/e/e;

    invoke-direct {v0}, Lcom/kwad/components/core/e/e/e;-><init>()V

    .line 2
    iput-object p1, v0, Lcom/kwad/components/core/e/e/e;->LR:Lcom/kwad/components/core/e/d/a$a;

    .line 3
    iput-object p0, v0, Lcom/kwad/components/core/e/e/e;->mActivity:Landroid/app/Activity;

    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p0

    const-string p1, "second_confirm_dialog"

    invoke-virtual {v0, p0, p1}, Lcom/kwad/components/core/proxy/g;->show(Landroid/app/FragmentManager;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 5
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    new-instance p2, Landroid/graphics/drawable/ColorDrawable;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p1, p2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 6
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 7
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object p1

    new-instance p2, Lcom/kwad/components/core/e/e/e$1;

    invoke-direct {p2, p0}, Lcom/kwad/components/core/e/e/e$1;-><init>(Lcom/kwad/components/core/e/e/e;)V

    invoke-virtual {p1, p2}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 8
    new-instance p1, Lcom/kwad/components/core/e/e/a;

    iget-object p2, p0, Lcom/kwad/components/core/e/e/e;->mActivity:Landroid/app/Activity;

    iget-object v0, p0, Lcom/kwad/components/core/e/e/e;->LR:Lcom/kwad/components/core/e/d/a$a;

    invoke-direct {p1, p2, p0, v0}, Lcom/kwad/components/core/e/e/a;-><init>(Landroid/content/Context;Landroid/app/DialogFragment;Lcom/kwad/components/core/e/d/a$a;)V

    return-object p1
.end method

.method public final onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-static {}, Lcom/kwad/components/core/e/e/g;->oQ()Lcom/kwad/components/core/e/e/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/core/e/e/g;->oR()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/e/e/e;->LR:Lcom/kwad/components/core/e/d/a$a;

    invoke-virtual {v0}, Lcom/kwad/components/core/e/d/a$a;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    const/16 v1, 0xe5

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/core/adlog/c;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;ILorg/json/JSONObject;)V

    .line 3
    invoke-super {p0, p1}, Landroid/app/DialogFragment;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;

    move-result-object p1

    return-object p1
.end method

.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/DialogFragment;->onDismiss(Landroid/content/DialogInterface;)V

    .line 2
    invoke-static {}, Lcom/kwad/components/core/e/e/g;->oQ()Lcom/kwad/components/core/e/e/g;

    move-result-object p1

    invoke-virtual {p1}, Lcom/kwad/components/core/e/e/g;->oS()V

    return-void
.end method

.method public final onResume()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/app/DialogFragment;->onResume()V

    return-void
.end method

.method public final onStart()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/app/DialogFragment;->onStart()V

    return-void
.end method
