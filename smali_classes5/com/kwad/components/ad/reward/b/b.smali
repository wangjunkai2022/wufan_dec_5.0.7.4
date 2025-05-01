.class public final Lcom/kwad/components/ad/reward/b/b;
.super Lcom/kwad/components/core/proxy/g;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/ad/reward/b/a$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/ad/reward/b/b$a;
    }
.end annotation


# instance fields
.field private mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

.field private qM:[I

.field private rc:Lcom/kwad/components/ad/reward/b/a;

.field private rd:Lcom/kwad/components/ad/reward/b/b$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/proxy/g;-><init>()V

    return-void
.end method

.method public static a(Landroid/app/Activity;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/ad/reward/b/b$a;[I)V
    .locals 2

    if-eqz p1, :cond_1

    if-nez p0, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    invoke-virtual {p1}, Lcom/kwad/sdk/core/response/a/a;->toJson()Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    .line 2
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "key_template_json"

    .line 3
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "key_end_location"

    .line 4
    invoke-virtual {v0, p1, p3}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V

    .line 5
    new-instance p1, Lcom/kwad/components/ad/reward/b/b;

    invoke-direct {p1}, Lcom/kwad/components/ad/reward/b/b;-><init>()V

    .line 6
    invoke-direct {p1, p2}, Lcom/kwad/components/ad/reward/b/b;->a(Lcom/kwad/components/ad/reward/b/b$a;)V

    .line 7
    invoke-virtual {p1, v0}, Landroid/app/DialogFragment;->setArguments(Landroid/os/Bundle;)V

    .line 8
    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p0

    const-string p2, "rewardCoupon"

    invoke-virtual {p1, p0, p2}, Lcom/kwad/components/core/proxy/g;->show(Landroid/app/FragmentManager;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private a(Lcom/kwad/components/ad/reward/b/b$a;)V
    .locals 0

    .line 9
    iput-object p1, p0, Lcom/kwad/components/ad/reward/b/b;->rd:Lcom/kwad/components/ad/reward/b/b$a;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 10
    new-instance v0, Lcom/kwad/components/ad/reward/b/a;

    invoke-virtual {p1}, Landroid/view/LayoutInflater;->getContext()Landroid/content/Context;

    move-result-object p1

    iget-object v1, p0, Lcom/kwad/components/ad/reward/b/b;->qM:[I

    invoke-direct {v0, p1, p2, v1}, Lcom/kwad/components/ad/reward/b/a;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;[I)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/b/b;->rc:Lcom/kwad/components/ad/reward/b/a;

    .line 11
    invoke-virtual {v0, p0}, Lcom/kwad/components/ad/reward/b/a;->a(Lcom/kwad/components/ad/reward/b/a$b;)V

    .line 12
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 13
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, v0, v0, v0, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 14
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object p2

    invoke-virtual {p2, v0}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    const/4 p2, -0x1

    .line 15
    invoke-virtual {p1, p2, p2}, Landroid/view/Window;->setLayout(II)V

    const/4 p2, 0x0

    .line 16
    invoke-virtual {p1, p2}, Landroid/view/Window;->setDimAmount(F)V

    .line 17
    new-instance p2, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {p2, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p1, p2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 18
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/ad/reward/b/b;->rc:Lcom/kwad/components/ad/reward/b/a;

    iget-object p2, p0, Lcom/kwad/components/ad/reward/b/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p2}, Lcom/kwad/components/ad/reward/n/r;->R(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/ad/reward/n/r;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/kwad/components/ad/reward/n/d;->b(Lcom/kwad/components/ad/reward/n/r;)V

    .line 19
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object p1

    new-instance p2, Lcom/kwad/components/ad/reward/b/b$1;

    invoke-direct {p2, p0}, Lcom/kwad/components/ad/reward/b/b$1;-><init>(Lcom/kwad/components/ad/reward/b/b;)V

    invoke-virtual {p1, p2}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 20
    iget-object p1, p0, Lcom/kwad/components/ad/reward/b/b;->rc:Lcom/kwad/components/ad/reward/b/a;

    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/b/a;->gG()Landroid/view/ViewGroup;

    move-result-object p1

    return-object p1
.end method

.method public final gK()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/core/proxy/g;->dismiss()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/b/b;->rd:Lcom/kwad/components/ad/reward/b/b$a;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Lcom/kwad/components/ad/reward/b/b$a;->gK()V

    :cond_0
    return-void
.end method

.method public final gL()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/core/proxy/g;->dismiss()V

    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroid/app/DialogFragment;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v0, "key_template_json"

    .line 3
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    :try_start_0
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 5
    new-instance v1, Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-direct {v1}, Lcom/kwad/sdk/core/response/model/AdTemplate;-><init>()V

    iput-object v1, p0, Lcom/kwad/components/ad/reward/b/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 6
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/kwad/sdk/core/response/a/a;->parseJson(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 7
    invoke-static {v0}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    const-string v0, "key_end_location"

    .line 8
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 9
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/ad/reward/b/b;->qM:[I

    :cond_1
    return-void
.end method
