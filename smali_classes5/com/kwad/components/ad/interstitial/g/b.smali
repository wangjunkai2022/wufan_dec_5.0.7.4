.class public final Lcom/kwad/components/ad/interstitial/g/b;
.super Lcom/kwad/components/core/proxy/g;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static lA:Z


# instance fields
.field private hz:Landroid/widget/TextView;

.field private jK:Lcom/kwad/components/ad/interstitial/e/c;

.field private lv:Lcom/kwad/components/core/widget/KSCornerImageView;

.field private lw:Landroid/widget/TextView;

.field private lx:Landroid/widget/TextView;

.field private ly:Landroid/widget/TextView;

.field private lz:Landroid/widget/TextView;

.field private mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/proxy/g;-><init>()V

    return-void
.end method

.method public static e(Lcom/kwad/components/ad/interstitial/e/c;)V
    .locals 4

    .line 1
    sget-boolean v0, Lcom/kwad/components/ad/interstitial/g/b;->lA:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 2
    sput-boolean v0, Lcom/kwad/components/ad/interstitial/g/b;->lA:Z

    .line 3
    new-instance v0, Lcom/kwad/components/ad/interstitial/g/b;

    invoke-direct {v0}, Lcom/kwad/components/ad/interstitial/g/b;-><init>()V

    .line 4
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 5
    iget-object v2, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {v2}, Lcom/kwad/sdk/core/response/a/a;->toJson()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "KEY_TEMPLATE"

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    invoke-virtual {v0, v1}, Landroid/app/DialogFragment;->setArguments(Landroid/os/Bundle;)V

    .line 7
    invoke-direct {v0, p0}, Lcom/kwad/components/ad/interstitial/g/b;->f(Lcom/kwad/components/ad/interstitial/e/c;)V

    .line 8
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/c;->io:Lcom/kwad/components/ad/interstitial/d;

    invoke-virtual {p0}, Landroid/app/AlertDialog;->getOwnerActivity()Landroid/app/Activity;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p0

    const-string v1, "interstitialCloseDialog"

    invoke-virtual {v0, p0, v1}, Lcom/kwad/components/core/proxy/g;->show(Landroid/app/FragmentManager;Ljava/lang/String;)V

    return-void
.end method

.method private f(Lcom/kwad/components/ad/interstitial/e/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/g/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-void
.end method

.method private i(Landroid/view/View;)V
    .locals 3

    .line 1
    sget v0, Lcom/kwad/sdk/R$id;->ksad_interstitial_intercept_app_icon:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/core/widget/KSCornerImageView;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/g/b;->lv:Lcom/kwad/components/core/widget/KSCornerImageView;

    .line 2
    sget v0, Lcom/kwad/sdk/R$id;->ksad_interstitial_intercept_app_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/g/b;->hz:Landroid/widget/TextView;

    .line 3
    sget v0, Lcom/kwad/sdk/R$id;->ksad_interstitial_intercept_dialog_desc:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/g/b;->lw:Landroid/widget/TextView;

    .line 4
    sget v0, Lcom/kwad/sdk/R$id;->ksad_interstitial_intercept_dialog_detail:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/g/b;->lx:Landroid/widget/TextView;

    .line 5
    sget v0, Lcom/kwad/sdk/R$id;->ksad_interstitial_intercept_dialog_btn_continue:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/g/b;->ly:Landroid/widget/TextView;

    .line 6
    sget v0, Lcom/kwad/sdk/R$id;->ksad_interstitial_intercept_dialog_btn_deny:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/g/b;->lz:Landroid/widget/TextView;

    const/4 v0, 0x6

    new-array v0, v0, [Landroid/view/View;

    .line 7
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/b;->lv:Lcom/kwad/components/core/widget/KSCornerImageView;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/b;->hz:Landroid/widget/TextView;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/b;->lw:Landroid/widget/TextView;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/b;->lx:Landroid/widget/TextView;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/b;->ly:Landroid/widget/TextView;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const/4 v1, 0x5

    aput-object p1, v0, v1

    invoke-static {p0, v0}, Lcom/kwad/sdk/c/a/a;->a(Landroid/view/View$OnClickListener;[Landroid/view/View;)V

    return-void
.end method

.method private initData()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/b;->lv:Lcom/kwad/components/core/widget/KSCornerImageView;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->cg(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/kwad/components/ad/interstitial/g/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/16 v4, 0xc

    invoke-static {v1, v2, v3, v4}, Lcom/kwad/sdk/core/imageloader/KSImageLoader;->loadAppIcon(Landroid/widget/ImageView;Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    .line 3
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/b;->hz:Landroid/widget/TextView;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->cd(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/b;->lw:Landroid/widget/TextView;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->at(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->cd(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 6
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/g/b;->lx:Landroid/widget/TextView;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->aD(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "KEY_TEMPLATE"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 3
    :try_start_0
    new-instance v1, Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-direct {v1}, Lcom/kwad/sdk/core/response/model/AdTemplate;-><init>()V

    iput-object v1, p0, Lcom/kwad/components/ad/interstitial/g/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 4
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/kwad/sdk/core/response/a/a;->parseJson(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 5
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    .line 6
    :goto_0
    sget v0, Lcom/kwad/sdk/R$layout;->ksad_interstitial_exit_intercept_dialog:I

    invoke-virtual {p1, v0, p2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    .line 7
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/interstitial/g/b;->i(Landroid/view/View;)V

    .line 8
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/g/b;->initData()V

    return-object p1
.end method

.method public final onActivityCreated(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroid/app/DialogFragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    const/4 v0, -0x1

    .line 4
    invoke-virtual {p1, v0, v0}, Landroid/view/Window;->setLayout(II)V

    .line 5
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p1, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 6
    invoke-virtual {p0, v1}, Landroid/app/DialogFragment;->setCancelable(Z)V

    .line 7
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    if-eqz p1, :cond_1

    .line 8
    iget-object p1, p1, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    new-instance v1, Lcom/kwad/sdk/core/adlog/c/b;

    invoke-direct {v1}, Lcom/kwad/sdk/core/adlog/c/b;-><init>()V

    const/16 v2, 0x95

    .line 9
    invoke-virtual {v1, v2}, Lcom/kwad/sdk/core/adlog/c/b;->cM(I)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v1

    const/16 v2, 0x9

    .line 10
    invoke-virtual {v1, v2}, Lcom/kwad/sdk/core/adlog/c/b;->cR(I)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v1

    .line 11
    invoke-static {p1, v0, v1}, Lcom/kwad/sdk/core/adlog/c;->d(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;Lcom/kwad/sdk/core/adlog/c/b;)V

    :cond_1
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/b;->lv:Lcom/kwad/components/core/widget/KSCornerImageView;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x2

    const/16 v3, 0x9

    if-eqz v0, :cond_0

    .line 3
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v0, p1, Lcom/kwad/components/ad/interstitial/e/c;->io:Lcom/kwad/components/ad/interstitial/d;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->getContext()Landroid/content/Context;

    move-result-object v0

    const/16 v4, 0x7f

    invoke-virtual {p1, v0, v4, v2, v3}, Lcom/kwad/components/ad/interstitial/e/c;->a(Landroid/content/Context;III)V

    goto/16 :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/b;->hz:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v0, p1, Lcom/kwad/components/ad/interstitial/e/c;->io:Lcom/kwad/components/ad/interstitial/d;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->getContext()Landroid/content/Context;

    move-result-object v0

    const/16 v4, 0x80

    invoke-virtual {p1, v0, v4, v2, v3}, Lcom/kwad/components/ad/interstitial/e/c;->a(Landroid/content/Context;III)V

    goto/16 :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/b;->lw:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 7
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v0, p1, Lcom/kwad/components/ad/interstitial/e/c;->io:Lcom/kwad/components/ad/interstitial/d;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->getContext()Landroid/content/Context;

    move-result-object v0

    const/16 v4, 0x81

    invoke-virtual {p1, v0, v4, v2, v3}, Lcom/kwad/components/ad/interstitial/e/c;->a(Landroid/content/Context;III)V

    goto :goto_0

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/b;->lx:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 9
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v0, p1, Lcom/kwad/components/ad/interstitial/e/c;->io:Lcom/kwad/components/ad/interstitial/d;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->getContext()Landroid/content/Context;

    move-result-object v0

    const/16 v4, 0x83

    invoke-virtual {p1, v0, v4, v2, v3}, Lcom/kwad/components/ad/interstitial/e/c;->a(Landroid/content/Context;III)V

    goto :goto_0

    .line 10
    :cond_3
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/b;->ly:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    .line 11
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object p1, p1, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    new-instance v0, Lcom/kwad/sdk/core/adlog/c/b;

    invoke-direct {v0}, Lcom/kwad/sdk/core/adlog/c/b;-><init>()V

    .line 12
    invoke-virtual {v0, v3}, Lcom/kwad/sdk/core/adlog/c/b;->cR(I)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v0

    .line 13
    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/core/adlog/c;->c(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;Lcom/kwad/sdk/core/adlog/c/b;)V

    goto :goto_0

    .line 14
    :cond_4
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/b;->lz:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 15
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    const/4 v0, -0x1

    iget-object v4, p1, Lcom/kwad/components/ad/interstitial/e/c;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    invoke-virtual {p1, v1, v0, v4}, Lcom/kwad/components/ad/interstitial/e/c;->a(ZILcom/kwad/sdk/core/video/videoview/a;)V

    .line 16
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object p1, p1, Lcom/kwad/components/ad/interstitial/e/c;->io:Lcom/kwad/components/ad/interstitial/d;

    invoke-virtual {p1}, Lcom/kwad/components/ad/interstitial/d;->dismiss()V

    .line 17
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object p1, p1, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    new-instance v0, Lcom/kwad/sdk/core/adlog/c/b;

    invoke-direct {v0}, Lcom/kwad/sdk/core/adlog/c/b;-><init>()V

    const/16 v4, 0x97

    .line 18
    invoke-virtual {v0, v4}, Lcom/kwad/sdk/core/adlog/c/b;->cM(I)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v0

    .line 19
    invoke-virtual {v0, v3}, Lcom/kwad/sdk/core/adlog/c/b;->cR(I)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v0

    .line 20
    invoke-static {p1, v2, v0}, Lcom/kwad/sdk/core/adlog/c;->e(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;Lcom/kwad/sdk/core/adlog/c/b;)V

    .line 21
    :cond_5
    :goto_0
    invoke-virtual {p0}, Lcom/kwad/components/core/proxy/g;->dismiss()V

    .line 22
    sput-boolean v1, Lcom/kwad/components/ad/interstitial/g/b;->lA:Z

    return-void
.end method
