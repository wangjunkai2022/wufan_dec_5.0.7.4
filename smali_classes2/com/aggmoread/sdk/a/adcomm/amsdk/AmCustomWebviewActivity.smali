.class public Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# static fields
.field private static webViewStateListener:Lcom/aggmoread/sdk/z/a/t/b$a;


# instance fields
.field private DOWNLOAD_REQUEST_PERMISSION_CODE:I

.field private canSkip:Z

.field private webImpl:Lcom/aggmoread/sdk/z/a/t/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/aggmoread/sdk/z/a/t/b$a;->a:Lcom/aggmoread/sdk/z/a/t/b$a;

    sput-object v0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity;->webViewStateListener:Lcom/aggmoread/sdk/z/a/t/b$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    const v0, 0xf4696

    iput v0, p0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity;->DOWNLOAD_REQUEST_PERMISSION_CODE:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity;->canSkip:Z

    return-void
.end method

.method static synthetic access$000()Lcom/aggmoread/sdk/z/a/t/b$a;
    .locals 1

    sget-object v0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity;->webViewStateListener:Lcom/aggmoread/sdk/z/a/t/b$a;

    return-object v0
.end method

.method static synthetic access$102(Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity;->canSkip:Z

    return p1
.end method

.method private initView()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity;->webImpl:Lcom/aggmoread/sdk/z/a/t/j;

    invoke-virtual {v0, p0}, Lcom/aggmoread/sdk/z/a/t/j;->a(Landroid/content/Context;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    return-void
.end method

.method private loadUrl()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity;->webImpl:Lcom/aggmoread/sdk/z/a/t/j;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/t/j;->e()V

    :cond_0
    return-void
.end method

.method public static setWebViewStateListener(Lcom/aggmoread/sdk/z/a/t/b$a;)V
    .locals 0

    if-nez p0, :cond_0

    sget-object p0, Lcom/aggmoread/sdk/z/a/t/b$a;->a:Lcom/aggmoread/sdk/z/a/t/b$a;

    :cond_0
    sput-object p0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity;->webViewStateListener:Lcom/aggmoread/sdk/z/a/t/b$a;

    return-void
.end method


# virtual methods
.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity;->canSkip:Z

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "mClickUrl"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "title"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/aggmoread/sdk/z/a/t/j;

    new-instance v2, Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity$1;

    invoke-direct {v2, p0}, Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity$1;-><init>(Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity;)V

    invoke-direct {v1, p0, v0, p1, v2}, Lcom/aggmoread/sdk/z/a/t/j;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/aggmoread/sdk/z/a/t/j$f;)V

    iput-object v1, p0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity;->webImpl:Lcom/aggmoread/sdk/z/a/t/j;

    invoke-direct {p0}, Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity;->initView()V

    const-string p1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {p0, p1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    iget v0, p0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity;->DOWNLOAD_REQUEST_PERMISSION_CODE:I

    invoke-static {p0, p1, v0}, Landroidx/core/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity;->loadUrl()V

    :goto_0
    return-void
.end method

.method protected onDestroy()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity;->webImpl:Lcom/aggmoread/sdk/z/a/t/j;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/t/j;->b()V

    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    iget-object v0, p0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity;->webImpl:Lcom/aggmoread/sdk/z/a/t/j;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/t/j;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-eq v0, v1, :cond_0

    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_0
    iget-object p1, p0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity;->webImpl:Lcom/aggmoread/sdk/z/a/t/j;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/t/j;->c()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    array-length v0, p3

    if-lez v0, :cond_1

    iget v0, p0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity;->DOWNLOAD_REQUEST_PERMISSION_CODE:I

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    aget p1, p3, p1

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity;->loadUrl()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    sget-object p1, Lcom/aggmoread/sdk/a/adcomm/amsdk/AmCustomWebviewActivity;->webViewStateListener:Lcom/aggmoread/sdk/z/a/t/b$a;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/a/t/b$a;->onShow()V

    :goto_0
    return-void

    :cond_1
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    return-void
.end method
