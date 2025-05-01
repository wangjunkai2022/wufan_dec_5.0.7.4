.class Lcom/kuaishou/weapon/p0/da$2$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kuaishou/weapon/p0/da$2;->onActivityPaused(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/kuaishou/weapon/p0/da$2;


# direct methods
.method constructor <init>(Lcom/kuaishou/weapon/p0/da$2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kuaishou/weapon/p0/da$2$1;->a:Lcom/kuaishou/weapon/p0/da$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kuaishou/weapon/p0/da$2$1;->a:Lcom/kuaishou/weapon/p0/da$2;

    iget-object v1, v0, Lcom/kuaishou/weapon/p0/da$2;->a:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    const/16 v3, 0x14

    if-ge v1, v3, :cond_0

    iget-object v1, v0, Lcom/kuaishou/weapon/p0/da$2;->b:[I

    aget v1, v1, v2

    if-gtz v1, :cond_0

    .line 2
    iget-object v0, v0, Lcom/kuaishou/weapon/p0/da$2;->c:Lcom/kuaishou/weapon/p0/da;

    invoke-static {v0}, Lcom/kuaishou/weapon/p0/da;->a(Lcom/kuaishou/weapon/p0/da;)Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    iget-object v1, p0, Lcom/kuaishou/weapon/p0/da$2$1;->a:Lcom/kuaishou/weapon/p0/da$2;

    iget-object v1, v1, Lcom/kuaishou/weapon/p0/da$2;->c:Lcom/kuaishou/weapon/p0/da;

    invoke-static {v1}, Lcom/kuaishou/weapon/p0/da;->d(Lcom/kuaishou/weapon/p0/da;)Landroid/app/Application$ActivityLifecycleCallbacks;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void

    .line 3
    :cond_0
    iget-object v1, v0, Lcom/kuaishou/weapon/p0/da$2;->b:[I

    aget v3, v1, v2

    add-int/lit8 v3, v3, -0x1

    aput v3, v1, v2

    .line 4
    iget-object v0, v0, Lcom/kuaishou/weapon/p0/da$2;->c:Lcom/kuaishou/weapon/p0/da;

    invoke-static {v0}, Lcom/kuaishou/weapon/p0/da;->a(Lcom/kuaishou/weapon/p0/da;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kuaishou/weapon/p0/cx;->a(Landroid/content/Context;)Lcom/kuaishou/weapon/p0/cx;

    move-result-object v0

    const/16 v1, 0x6a

    invoke-virtual {v0, v1}, Lcom/kuaishou/weapon/p0/cx;->a(I)V

    .line 5
    iget-object v0, p0, Lcom/kuaishou/weapon/p0/da$2$1;->a:Lcom/kuaishou/weapon/p0/da$2;

    iget-object v0, v0, Lcom/kuaishou/weapon/p0/da$2;->c:Lcom/kuaishou/weapon/p0/da;

    invoke-static {v0}, Lcom/kuaishou/weapon/p0/da;->a(Lcom/kuaishou/weapon/p0/da;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kuaishou/weapon/p0/dd;->a(Landroid/content/Context;)Lcom/kuaishou/weapon/p0/dd;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/kuaishou/weapon/p0/dd;->a(I)V

    .line 6
    iget-object v0, p0, Lcom/kuaishou/weapon/p0/da$2$1;->a:Lcom/kuaishou/weapon/p0/da$2;

    iget-object v0, v0, Lcom/kuaishou/weapon/p0/da$2;->c:Lcom/kuaishou/weapon/p0/da;

    invoke-static {v0}, Lcom/kuaishou/weapon/p0/da;->a(Lcom/kuaishou/weapon/p0/da;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kuaishou/weapon/p0/db;->a(Landroid/content/Context;)Lcom/kuaishou/weapon/p0/db;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Lcom/kuaishou/weapon/p0/db;->a(II)V

    .line 7
    iget-object v0, p0, Lcom/kuaishou/weapon/p0/da$2$1;->a:Lcom/kuaishou/weapon/p0/da$2;

    iget-object v0, v0, Lcom/kuaishou/weapon/p0/da$2;->c:Lcom/kuaishou/weapon/p0/da;

    invoke-static {v0}, Lcom/kuaishou/weapon/p0/da;->a(Lcom/kuaishou/weapon/p0/da;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kuaishou/weapon/p0/cy;->a(Landroid/content/Context;)Lcom/kuaishou/weapon/p0/cy;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/kuaishou/weapon/p0/cy;->a(I)V

    .line 8
    iget-object v0, p0, Lcom/kuaishou/weapon/p0/da$2$1;->a:Lcom/kuaishou/weapon/p0/da$2;

    iget-object v0, v0, Lcom/kuaishou/weapon/p0/da$2;->c:Lcom/kuaishou/weapon/p0/da;

    invoke-static {v0}, Lcom/kuaishou/weapon/p0/da;->a(Lcom/kuaishou/weapon/p0/da;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kuaishou/weapon/p0/cz;->a(Landroid/content/Context;)Lcom/kuaishou/weapon/p0/cz;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/kuaishou/weapon/p0/cz;->a(I)V

    .line 9
    iget-object v0, p0, Lcom/kuaishou/weapon/p0/da$2$1;->a:Lcom/kuaishou/weapon/p0/da$2;

    iget-object v0, v0, Lcom/kuaishou/weapon/p0/da$2;->c:Lcom/kuaishou/weapon/p0/da;

    invoke-static {v0}, Lcom/kuaishou/weapon/p0/da;->a(Lcom/kuaishou/weapon/p0/da;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kuaishou/weapon/p0/de;->a(Landroid/content/Context;)Lcom/kuaishou/weapon/p0/de;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/kuaishou/weapon/p0/de;->a(I)V

    return-void
.end method
