.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;->a(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a$b;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a$b;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a$b;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;)Lcom/baidu/mobads/sdk/api/ExpressInterstitialAd;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a$b;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;)Lcom/baidu/mobads/sdk/api/ExpressInterstitialAd;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a$b;->b:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/baidu/mobads/sdk/api/ExpressInterstitialAd;->show(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method
