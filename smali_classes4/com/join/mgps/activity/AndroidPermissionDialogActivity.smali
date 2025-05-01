.class public Lcom/join/mgps/activity/AndroidPermissionDialogActivity;
.super Lcom/join/mgps/base/dialog/BaseDialogActivity;
.source "AndroidPermissionDialogActivity.java"


# static fields
.field public static final i:Ljava/lang/String; = "_permission_params"


# instance fields
.field private b:Landroid/widget/LinearLayout;

.field private c:Landroid/widget/ImageView;

.field private d:Landroid/widget/TextView;

.field e:Landroid/widget/Button;

.field f:Landroid/widget/Button;

.field g:Landroid/widget/Button;

.field h:Lcom/join/mgps/dto/AndroidPermissionParams;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/base/dialog/BaseDialogActivity;-><init>()V

    return-void
.end method

.method static synthetic f0(Lcom/join/mgps/activity/AndroidPermissionDialogActivity;)Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/dialog/BaseDialogActivity;->callback:Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;

    return-object p0
.end method

.method static synthetic g0(Lcom/join/mgps/activity/AndroidPermissionDialogActivity;)Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/dialog/BaseDialogActivity;->callback:Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;

    return-object p0
.end method

.method static synthetic h0(Lcom/join/mgps/activity/AndroidPermissionDialogActivity;)Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/dialog/BaseDialogActivity;->callback:Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;

    return-object p0
.end method

.method static synthetic i0(Lcom/join/mgps/activity/AndroidPermissionDialogActivity;)Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/dialog/BaseDialogActivity;->callback:Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;

    return-object p0
.end method

.method static synthetic j0(Lcom/join/mgps/activity/AndroidPermissionDialogActivity;)Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/dialog/BaseDialogActivity;->callback:Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;

    return-object p0
.end method

.method static synthetic k0(Lcom/join/mgps/activity/AndroidPermissionDialogActivity;)Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/dialog/BaseDialogActivity;->callback:Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;

    return-object p0
.end method

.method static synthetic l0(Lcom/join/mgps/activity/AndroidPermissionDialogActivity;)Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/dialog/BaseDialogActivity;->callback:Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;

    return-object p0
.end method

.method static synthetic m0(Lcom/join/mgps/activity/AndroidPermissionDialogActivity;)Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/dialog/BaseDialogActivity;->callback:Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;

    return-object p0
.end method


# virtual methods
.method public getContentView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/AndroidPermissionDialogActivity;->b:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/base/dialog/BaseDialogActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c00b8

    .line 2
    invoke-virtual {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(I)V

    .line 3
    invoke-static {p0}, Lcom/join/mgps/Util/c2;->s(Landroid/app/Activity;)V

    const p1, 0x7f09042d

    .line 4
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/join/mgps/activity/AndroidPermissionDialogActivity;->c:Landroid/widget/ImageView;

    const p1, 0x7f090428

    .line 5
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/activity/AndroidPermissionDialogActivity;->d:Landroid/widget/TextView;

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/AndroidPermissionDialogActivity;->c:Landroid/widget/ImageView;

    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    const p1, 0x7f090423

    .line 7
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lcom/join/mgps/activity/AndroidPermissionDialogActivity;->e:Landroid/widget/Button;

    const p1, 0x7f090421

    .line 8
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lcom/join/mgps/activity/AndroidPermissionDialogActivity;->f:Landroid/widget/Button;

    const p1, 0x7f090422

    .line 9
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lcom/join/mgps/activity/AndroidPermissionDialogActivity;->g:Landroid/widget/Button;

    .line 10
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 11
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "_permission_params"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/AndroidPermissionParams;

    iput-object p1, p0, Lcom/join/mgps/activity/AndroidPermissionDialogActivity;->h:Lcom/join/mgps/dto/AndroidPermissionParams;

    .line 12
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/AndroidPermissionDialogActivity;->h:Lcom/join/mgps/dto/AndroidPermissionParams;

    if-eqz p1, :cond_5

    .line 13
    invoke-virtual {p1}, Lcom/join/mgps/dto/AndroidPermissionParams;->getContent()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 14
    iget-object p1, p0, Lcom/join/mgps/activity/AndroidPermissionDialogActivity;->d:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/join/mgps/activity/AndroidPermissionDialogActivity;->h:Lcom/join/mgps/dto/AndroidPermissionParams;

    invoke-virtual {v0}, Lcom/join/mgps/dto/AndroidPermissionParams;->getContent()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/AndroidPermissionDialogActivity;->h:Lcom/join/mgps/dto/AndroidPermissionParams;

    invoke-virtual {p1}, Lcom/join/mgps/dto/AndroidPermissionParams;->getCancelText()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 16
    iget-object p1, p0, Lcom/join/mgps/activity/AndroidPermissionDialogActivity;->e:Landroid/widget/Button;

    iget-object v0, p0, Lcom/join/mgps/activity/AndroidPermissionDialogActivity;->h:Lcom/join/mgps/dto/AndroidPermissionParams;

    invoke-virtual {v0}, Lcom/join/mgps/dto/AndroidPermissionParams;->getCancelText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    const p1, 0x7f090ca3

    .line 17
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/AndroidPermissionDialogActivity;->h:Lcom/join/mgps/dto/AndroidPermissionParams;

    invoke-virtual {v0}, Lcom/join/mgps/dto/AndroidPermissionParams;->isSingleBtn()Z

    move-result v0

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    const/16 v0, 0x8

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    const p1, 0x7f090ca4

    .line 18
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/AndroidPermissionDialogActivity;->h:Lcom/join/mgps/dto/AndroidPermissionParams;

    invoke-virtual {v0}, Lcom/join/mgps/dto/AndroidPermissionParams;->isSingleBtn()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v1, 0x0

    :cond_4
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_5
    const p1, 0x7f090335

    .line 19
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance v0, Lcom/join/mgps/activity/AndroidPermissionDialogActivity$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/AndroidPermissionDialogActivity$a;-><init>(Lcom/join/mgps/activity/AndroidPermissionDialogActivity;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    iget-object p1, p0, Lcom/join/mgps/activity/AndroidPermissionDialogActivity;->c:Landroid/widget/ImageView;

    new-instance v0, Lcom/join/mgps/activity/AndroidPermissionDialogActivity$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/AndroidPermissionDialogActivity$b;-><init>(Lcom/join/mgps/activity/AndroidPermissionDialogActivity;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    iget-object p1, p0, Lcom/join/mgps/activity/AndroidPermissionDialogActivity;->f:Landroid/widget/Button;

    new-instance v0, Lcom/join/mgps/activity/AndroidPermissionDialogActivity$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/AndroidPermissionDialogActivity$c;-><init>(Lcom/join/mgps/activity/AndroidPermissionDialogActivity;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 22
    iget-object p1, p0, Lcom/join/mgps/activity/AndroidPermissionDialogActivity;->e:Landroid/widget/Button;

    new-instance v0, Lcom/join/mgps/activity/AndroidPermissionDialogActivity$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/AndroidPermissionDialogActivity$d;-><init>(Lcom/join/mgps/activity/AndroidPermissionDialogActivity;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 23
    iget-object p1, p0, Lcom/join/mgps/activity/AndroidPermissionDialogActivity;->g:Landroid/widget/Button;

    new-instance v0, Lcom/join/mgps/activity/AndroidPermissionDialogActivity$e;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/AndroidPermissionDialogActivity$e;-><init>(Lcom/join/mgps/activity/AndroidPermissionDialogActivity;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
