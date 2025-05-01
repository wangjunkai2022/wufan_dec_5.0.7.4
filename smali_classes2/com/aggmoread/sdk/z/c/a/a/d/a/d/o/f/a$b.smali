.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;->a(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a$b;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a$b;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a$b;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;)Lcom/aggmoread/sdk/z/a/a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a$b;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a;)Lcom/aggmoread/sdk/z/a/a;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/f/a$b;->b:Landroid/app/Activity;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/a;->a(Landroid/app/Activity;Landroid/view/ViewGroup;)Z

    :cond_0
    return-void
.end method
