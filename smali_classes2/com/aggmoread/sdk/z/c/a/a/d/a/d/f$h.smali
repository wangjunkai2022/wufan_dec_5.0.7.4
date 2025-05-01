.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/f$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/f;->r()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/f;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/f;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/f$h;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/f$h;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/f;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/f;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/f;)Lcom/aggmoread/sdk/z/c/a/a/c/p/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/e;->onAdClicked()V

    return-void
.end method
