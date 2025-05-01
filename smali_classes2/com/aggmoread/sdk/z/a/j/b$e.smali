.class Lcom/aggmoread/sdk/z/a/j/b$e;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/a/j/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "e"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Lcom/aggmoread/sdk/z/a/j/c;

.field final synthetic c:Lcom/aggmoread/sdk/z/a/j/b;


# direct methods
.method public constructor <init>(Lcom/aggmoread/sdk/z/a/j/b;Ljava/lang/String;Lcom/aggmoread/sdk/z/a/j/c;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/j/b$e;->c:Lcom/aggmoread/sdk/z/a/j/b;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/j/b$e;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/aggmoread/sdk/z/a/j/b$e;->b:Lcom/aggmoread/sdk/z/a/j/c;

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/j/b$e;)Lcom/aggmoread/sdk/z/a/j/c;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/j/b$e;->b:Lcom/aggmoread/sdk/z/a/j/c;

    return-object p0
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v0, "android.intent.action.PACKAGE_ADDED"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "android.intent.action.PACKAGE_REPLACED"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string p2, "package:"

    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "installedPackageName "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " \uff0c packageName "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/b$e;->a:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " , downloadListener = "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/j/b$e;->b:Lcom/aggmoread/sdk/z/a/j/c;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "ApiDownloadHelper"

    invoke-static {v0, p2}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/aggmoread/sdk/z/a/j/b$e;->a:Ljava/lang/String;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_2

    if-eqz p1, :cond_4

    iget-object p2, p0, Lcom/aggmoread/sdk/z/a/j/b$e;->a:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_2
    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/b$e;->b:Lcom/aggmoread/sdk/z/a/j/c;

    iget-object p2, p0, Lcom/aggmoread/sdk/z/a/j/b$e;->c:Lcom/aggmoread/sdk/z/a/j/b;

    invoke-static {p2}, Lcom/aggmoread/sdk/z/a/j/b;->b(Lcom/aggmoread/sdk/z/a/j/b;)I

    move-result p2

    int-to-long v0, p2

    invoke-virtual {p1, v0, v1}, Lcom/aggmoread/sdk/z/a/j/c;->a(J)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/b$e;->c:Lcom/aggmoread/sdk/z/a/j/b;

    iget-object p1, p1, Lcom/aggmoread/sdk/z/a/j/b;->m:Ljava/lang/Runnable;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/m/e;->a(Ljava/lang/Runnable;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/b$e;->c:Lcom/aggmoread/sdk/z/a/j/b;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/j/b;->c(Lcom/aggmoread/sdk/z/a/j/b;)Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/b$e;->c:Lcom/aggmoread/sdk/z/a/j/b;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/j/b;->d(Lcom/aggmoread/sdk/z/a/j/b;)Lcom/aggmoread/sdk/z/a/j/k;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/b$e;->c:Lcom/aggmoread/sdk/z/a/j/b;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/j/b;->d(Lcom/aggmoread/sdk/z/a/j/b;)Lcom/aggmoread/sdk/z/a/j/k;

    move-result-object p1

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/j/k;->f()V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/b$e;->c:Lcom/aggmoread/sdk/z/a/j/b;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/j/b;->e(Lcom/aggmoread/sdk/z/a/j/b;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/j/e;->a(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/b$e;->c:Lcom/aggmoread/sdk/z/a/j/b;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/j/b;->e(Lcom/aggmoread/sdk/z/a/j/b;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Lcom/aggmoread/sdk/z/a/j/b$e$a;

    invoke-direct {p2, p0}, Lcom/aggmoread/sdk/z/a/j/b$e$a;-><init>(Lcom/aggmoread/sdk/z/a/j/b$e;)V

    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/a/j/e;->a(Ljava/lang/String;Lcom/aggmoread/sdk/z/a/j/l;)V

    :cond_3
    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/b$e;->c:Lcom/aggmoread/sdk/z/a/j/b;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/j/b;->f(Lcom/aggmoread/sdk/z/a/j/b;)Lcom/aggmoread/sdk/z/a/m/h;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/b$e;->a:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/j/b$e;->c:Lcom/aggmoread/sdk/z/a/j/b;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/j/b;->f(Lcom/aggmoread/sdk/z/a/j/b;)Lcom/aggmoread/sdk/z/a/m/h;

    move-result-object p1

    iget-object p2, p0, Lcom/aggmoread/sdk/z/a/j/b$e;->a:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/aggmoread/sdk/z/a/m/h;->a(Ljava/lang/String;)Z

    :cond_4
    return-void
.end method
