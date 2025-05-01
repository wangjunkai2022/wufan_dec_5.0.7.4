.class Lcom/aggmoread/sdk/z/a/t/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnScrollChangedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/a/t/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/a/t/c;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/t/c;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/t/c$a;->a:Lcom/aggmoread/sdk/z/a/t/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollChanged()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/t/c$a;->a:Lcom/aggmoread/sdk/z/a/t/c;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/t/c;->a(Lcom/aggmoread/sdk/z/a/t/c;)Lcom/aggmoread/sdk/z/a/t/c$c;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/t/c$a;->a:Lcom/aggmoread/sdk/z/a/t/c;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/t/c;->a(Lcom/aggmoread/sdk/z/a/t/c;)Lcom/aggmoread/sdk/z/a/t/c$c;

    move-result-object v0

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/a/t/c$c;->onScrollChanged()V

    :cond_0
    return-void
.end method
