.class public Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;
.super Landroid/app/Activity;


# instance fields
.field private i:I

.field private m:Landroid/content/Intent;

.field private o:Lorg/json/JSONObject;

.field private p:Landroid/content/Intent;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private vv:Lcom/ss/android/socialbase/appdownloader/p/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method static synthetic m(Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->i:I

    return p0
.end method

.method private m()V
    .locals 6

    .line 2
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->vv:Lcom/ss/android/socialbase/appdownloader/p/b;

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->m:Landroid/content/Intent;

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/i;->k()Lcom/ss/android/socialbase/appdownloader/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ss/android/socialbase/appdownloader/i;->vv()Lcom/ss/android/socialbase/appdownloader/p/p;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 4
    invoke-interface {v0, p0}, Lcom/ss/android/socialbase/appdownloader/p/p;->vv(Landroid/content/Context;)Lcom/ss/android/socialbase/appdownloader/p/jh;

    move-result-object v1

    :cond_1
    if-nez v1, :cond_2

    .line 5
    new-instance v1, Lcom/ss/android/socialbase/appdownloader/i/vv;

    invoke-direct {v1, p0}, Lcom/ss/android/socialbase/appdownloader/i/vv;-><init>(Landroid/content/Context;)V

    :cond_2
    const-string v0, "tt_appdownloader_tip"

    .line 6
    invoke-static {p0, v0}, Lcom/ss/android/socialbase/appdownloader/wv;->vv(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    const-string v2, "tt_appdownloader_label_ok"

    .line 7
    invoke-static {p0, v2}, Lcom/ss/android/socialbase/appdownloader/wv;->vv(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    const-string v3, "tt_appdownloader_label_cancel"

    .line 8
    invoke-static {p0, v3}, Lcom/ss/android/socialbase/appdownloader/wv;->vv(Landroid/content/Context;Ljava/lang/String;)I

    move-result v3

    .line 9
    iget-object v4, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->o:Lorg/json/JSONObject;

    const-string v5, "jump_unknown_source_tips"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 10
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_3

    const-string v4, "tt_appdownloader_jump_unknown_source_tips"

    .line 11
    invoke-static {p0, v4}, Lcom/ss/android/socialbase/appdownloader/wv;->vv(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    .line 12
    invoke-virtual {p0, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 13
    :cond_3
    invoke-interface {v1, v0}, Lcom/ss/android/socialbase/appdownloader/p/jh;->vv(I)Lcom/ss/android/socialbase/appdownloader/p/jh;

    move-result-object v0

    invoke-interface {v0, v4}, Lcom/ss/android/socialbase/appdownloader/p/jh;->vv(Ljava/lang/String;)Lcom/ss/android/socialbase/appdownloader/p/jh;

    move-result-object v0

    new-instance v4, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity$3;

    invoke-direct {v4, p0}, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity$3;-><init>(Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;)V

    .line 14
    invoke-interface {v0, v2, v4}, Lcom/ss/android/socialbase/appdownloader/p/jh;->vv(ILandroid/content/DialogInterface$OnClickListener;)Lcom/ss/android/socialbase/appdownloader/p/jh;

    move-result-object v0

    new-instance v2, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity$2;

    invoke-direct {v2, p0}, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity$2;-><init>(Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;)V

    .line 15
    invoke-interface {v0, v3, v2}, Lcom/ss/android/socialbase/appdownloader/p/jh;->m(ILandroid/content/DialogInterface$OnClickListener;)Lcom/ss/android/socialbase/appdownloader/p/jh;

    move-result-object v0

    new-instance v2, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity$1;

    invoke-direct {v2, p0}, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity$1;-><init>(Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;)V

    .line 16
    invoke-interface {v0, v2}, Lcom/ss/android/socialbase/appdownloader/p/jh;->vv(Landroid/content/DialogInterface$OnCancelListener;)Lcom/ss/android/socialbase/appdownloader/p/jh;

    move-result-object v0

    const/4 v2, 0x0

    .line 17
    invoke-interface {v0, v2}, Lcom/ss/android/socialbase/appdownloader/p/jh;->vv(Z)Lcom/ss/android/socialbase/appdownloader/p/jh;

    .line 18
    invoke-interface {v1}, Lcom/ss/android/socialbase/appdownloader/p/jh;->vv()Lcom/ss/android/socialbase/appdownloader/p/b;

    move-result-object v0

    iput-object v0, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->vv:Lcom/ss/android/socialbase/appdownloader/p/b;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_4
    :goto_0
    return-void
.end method

.method static synthetic p(Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;)Lorg/json/JSONObject;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->o:Lorg/json/JSONObject;

    return-object p0
.end method

.method static synthetic vv(Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;)Landroid/content/Intent;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->p:Landroid/content/Intent;

    return-object p0
.end method

.method private vv()V
    .locals 3

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    const/4 v2, 0x0

    .line 4
    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->alpha:F

    .line 5
    invoke-virtual {v0, v1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-direct {p0}, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->vv()V

    .line 3
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/qv;->vv()Lcom/ss/android/socialbase/appdownloader/qv;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/ss/android/socialbase/appdownloader/qv;->vv(Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;)V

    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    .line 2
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 3
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/qv;->vv()Lcom/ss/android/socialbase/appdownloader/qv;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/ss/android/socialbase/appdownloader/qv;->vv(Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;)V

    return-void
.end method

.method protected onResume()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 3
    iput-object v0, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->m:Landroid/content/Intent;

    if-eqz v0, :cond_0

    const-string v1, "intent"

    .line 4
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/content/Intent;

    iput-object v1, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->p:Landroid/content/Intent;

    const/4 v1, -0x1

    const-string v2, "id"

    .line 5
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->i:I

    .line 6
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    const-string v2, "config"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->o:Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 8
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->o:Lorg/json/JSONObject;

    if-nez v0, :cond_1

    .line 9
    invoke-static {p0}, Lcom/ss/android/socialbase/appdownloader/p;->vv(Landroid/app/Activity;)V

    return-void

    .line 10
    :cond_1
    invoke-direct {p0}, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->m()V

    .line 11
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->vv:Lcom/ss/android/socialbase/appdownloader/p/b;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lcom/ss/android/socialbase/appdownloader/p/b;->m()Z

    move-result v0

    if-nez v0, :cond_2

    .line 12
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->vv:Lcom/ss/android/socialbase/appdownloader/p/b;

    invoke-interface {v0}, Lcom/ss/android/socialbase/appdownloader/p/b;->vv()V

    return-void

    .line 13
    :cond_2
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/view/JumpUnknownSourceActivity;->vv:Lcom/ss/android/socialbase/appdownloader/p/b;

    if-nez v0, :cond_3

    .line 14
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_3
    return-void
.end method
