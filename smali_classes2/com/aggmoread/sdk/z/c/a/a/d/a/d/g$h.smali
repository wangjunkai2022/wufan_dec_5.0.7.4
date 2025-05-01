.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->r()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g$h;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g$h;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;)Lcom/aggmoread/sdk/z/c/a/a/c/q/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/e;->onAdClicked()V

    return-void
.end method
